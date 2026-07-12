package squeakyclean;

class SqueakyClean {
    static String clean(String identifier) {
        char[] asArray = identifier.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < asArray.length; i++) {
            char ch = asArray[i];
            if (Character.isWhitespace(ch)) {
                result.append('_');
            } else if (ch == '-') {
                i++;
                char next = asArray[i];
                result.append(Character.toUpperCase(next));
            } else if (Character.isDigit(ch)) {
                switch (ch) {
                    case '4':
                        result.append('a');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    case '1':
                        result.append('l');
                        break;
                    case '7':
                        result.append('t');
                        break;
                }
            } else if (Character.isLetter(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
