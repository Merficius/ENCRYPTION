class AsciiCharSequence implements CharSequence {
    byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray.clone();
    }

    @Override
    public int length() {
        int counter = 0;

        for (byte b : byteArray) {
            counter++;
        }

        return counter;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] newByteArray = new byte[end - start];
        AsciiCharSequence newAsciiCharSequence;

        if (end - start >= 0) System.arraycopy(byteArray, start, newByteArray, start - start, end - start);

        newAsciiCharSequence = new AsciiCharSequence(newByteArray);

        return newAsciiCharSequence;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (byte b : byteArray) {
            result.append((char) b);
        }

        return result.toString();
    }
}
