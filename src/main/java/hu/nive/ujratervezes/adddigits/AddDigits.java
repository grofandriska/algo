package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                String tmp = input.substring(i, i + 1);
                result += Integer.parseInt(tmp);
            }
        }
        return result;
    }
}
