package launcher;

import org.apache.commons.lang3.StringUtils;

public class Launcher {
    public static void main(String[] args) {
        int bits = 18;
        double nbChars = bits + Math.pow(2, bits) - 1;
        System.out.println(bruijnSequence(nbChars, bits));
    }

    private static String bruijnSequence(double nbChars, int bits) {
        StringBuilder result = new StringBuilder(StringUtils.repeat('0', bits));
        while (result.length() != nbChars) {
            String lastBits = result.substring(result.length() - (bits - 1)) + "1";
            if (!result.toString().contains(lastBits)) {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }
}
