package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    final static String LOWER_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    final static String UPPER_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        //Initial values
        String mode = "enc";
        String message = "";
        int key = 0;
        int sizeInputArray;
        String algorithmType = "shift";
        String inputPath = "";
        String outputPath = "";
        boolean writeFile = false;
        boolean readFile = false;
        File inputFile;
        File outputFile;
        String[] messages;
        String[] processedMessages = new String[0];
        ProcessSender processSender = new ProcessSender();

        //Get mode, message and key
        for (int i = 0; i < args.length - 1; i += 2) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            } else if ("-key".equals(args[i])) {
                int newKey = Integer.parseInt(args[i + 1]);
                if (newKey >= 0) {
                    key = newKey % 26;
                } else {
                    key = newKey % -26;
                }
            } else if ("-data".equals(args[i])) {
                message = args[i + 1];
            } else if ("-in".equals(args[i])) {
                inputPath = args[i + 1];
                readFile = true;
            } else if ("-out".equals(args[i])) {
                outputPath = args[i + 1];
                writeFile = true;
            } else if ("-alg".equals(args[i])) {
                algorithmType = args[i + 1];
            }
        }

        //Encrypt and decrypt depending if there is a file
        if ("enc".equals(mode) && !message.isEmpty()) {
            //Encrypt depending on algorithmType
            if ("unicode".equals(algorithmType)) {
                processSender = new ProcessSender(new encryptUnicode());
                message = processSender.process(message, key);
            } else if ("shift".equals(algorithmType)) {
                processSender = new ProcessSender(new encryptAlphabet());
                message = processSender.process(message, key);
            }
        } else if ("dec".equals(mode) && !message.isEmpty()) {
            //Decrypt depending on algorithmType
            if ("unicode".equals(algorithmType)) {
                processSender = new ProcessSender(new decryptUnicode());
                message = processSender.process(message, key);
            } else if ("shift".equals(algorithmType)) {
                processSender = new ProcessSender(new decryptAlphabet());
                message = processSender.process(message, key);
            }
        } else if (readFile) {
            inputFile = new File(inputPath);
            sizeInputArray = utilities.countLines(inputFile);
            messages = (utilities.readLines(inputFile, sizeInputArray));
            if ("enc".equals(mode)) {
                //Encrypt depending on algorithmType
                if ("unicode".equals(algorithmType)) {
                    processSender = new ProcessSender(new encryptUnicode());
                    processedMessages = processSender.process(messages, key);
                } else if ("shift".equals(algorithmType)) {
                    processSender = new ProcessSender(new encryptAlphabet());
                    processedMessages = processSender.process(messages, key);
                }
            } else if ("dec".equals(mode)) {
                //Decrypt depending on algorithmType
                if ("unicode".equals(algorithmType)) {
                    processSender = new ProcessSender(new decryptUnicode());
                    processedMessages = processSender.process(messages, key);
                } else if ("shift".equals(algorithmType)) {
                    processSender = new ProcessSender(new decryptAlphabet());
                    processedMessages = processSender.process(messages, key);
                }
            }
        }

        //Output depending on -out
        if (writeFile) {
            outputFile = new File(outputPath);
            if (!message.isEmpty()) {
                processSender.output(outputFile, message);
            } else if (readFile) {
                processSender.output(outputFile, processedMessages);
            }
        } else {
            if (!message.isEmpty()) {
                processSender.output(message);
            } else if (readFile) {
                processSender.output(processedMessages);
            }
        }

    }
}


class ProcessSender {
    private ProcessStrategy method;

    public ProcessSender() {

    }

    public ProcessSender(ProcessStrategy method) {
        this.method = method;
    }

    public String process(String message, int key) {
        return method.getMessage(message, key);
    }

    public String[] process(String[] message, int key) {
        return method.getMessage(message, key);
    }

    public void output(File outputFile, String message) {
        method.writeFile(outputFile, message);
    }

    public void output(File outputFile, String[] messages) {
        method.writeFile(outputFile, messages);
    }

    public void output(String message) {
        System.out.println(message);
    }

    public void output(String[] messages) {
        utilities.printStringArray(messages);
    }
}

interface ProcessStrategy {
    String getMessage(String message, int key);

    String[] getMessage(String[] messages, int key);

    default void writeFile(File outputFile, String message) {
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(message);
        } catch (Exception e) {
            System.out.println("Error at writing single message: " + e.getMessage());
        }
    }

    default void writeFile(File outputFile, String[] messages) {
        try (FileWriter writer = new FileWriter(outputFile)) {
            for (String s : messages) {
                writer.write(s + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error at writing multiple messages: " + e.getMessage());
        }
    }
}

class encryptUnicode implements ProcessStrategy {
    @Override
    public String getMessage(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            encryptedMessage.append((char) (c + key));
        }
        return encryptedMessage.toString();
    }

    @Override
    public String[] getMessage(String[] messages, int key) {
        messages = messages.clone();

        for (int i = 0; i < messages.length; i++) {
            messages[i] = getMessage(messages[i], key);
        }

        return messages;
    }
}

class decryptUnicode implements ProcessStrategy {
    @Override
    public String getMessage(String message, int key) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            decryptedMessage.append((char) (c - key));
        }
        return decryptedMessage.toString();
    }

    @Override
    public String[] getMessage(String[] messages, int key) {
        messages = messages.clone();

        for (int i = 0; i < messages.length; i++) {
            messages[i] = getMessage(messages[i], key);
        }

        return messages;
    }
}

class encryptAlphabet implements ProcessStrategy {

    @Override
    public String getMessage(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            boolean lower = Main.LOWER_ALPHABET.indexOf(c) != -1;
            boolean upper = Main.UPPER_ALPHABET.indexOf(c) != -1;
            if (lower) {
                char newChar = Main.LOWER_ALPHABET.toCharArray()[(Main.LOWER_ALPHABET.indexOf(c) + key + 26) % 26];
                encryptedMessage.append(newChar);
            } else if (upper) {
                char newChar = Main.UPPER_ALPHABET.toCharArray()[(Main.UPPER_ALPHABET.indexOf(c) + key + 26) % 26];
                encryptedMessage.append(newChar);
            } else {
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }

    @Override
    public String[] getMessage(String[] messages, int key) {
        messages = messages.clone();

        for (int i = 0; i < messages.length; i++) {
            messages[i] = getMessage(messages[i], key);
        }

        return messages;
    }
}

class decryptAlphabet implements ProcessStrategy {

    @Override
    public String getMessage(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            boolean lower = Main.LOWER_ALPHABET.indexOf(c) != -1;
            boolean upper = Main.UPPER_ALPHABET.indexOf(c) != -1;
            if (lower) {
                char newChar = Main.LOWER_ALPHABET.toCharArray()[(Main.LOWER_ALPHABET.indexOf(c) - key + 26) % 26];
                encryptedMessage.append(newChar);
            } else if (upper) {
                char newChar = Main.UPPER_ALPHABET.toCharArray()[(Main.UPPER_ALPHABET.indexOf(c) - key + 26) % 26];
                encryptedMessage.append(newChar);
            } else {
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }

    @Override
    public String[] getMessage(String[] messages, int key) {
        messages = messages.clone();

        for (int i = 0; i < messages.length; i++) {
            messages[i] = getMessage(messages[i], key);
        }

        return messages;
    }
}

class utilities {
    public static String[] readLines(File inputFile, int size) {
        String[] messages = new String[size];

        try (Scanner scanner = new Scanner(inputFile)) {
            for (int i = 0; i < size; i++) {
                messages[i] = scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error at reading file in readFile: " + e.getMessage());
        }

        return messages;
    }

    public static int countLines(File file) {
        int counter = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                counter++;
                scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error at reading file in countLines: " + e.getMessage());
        }

        return counter;
    }

    public static void printStringArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}