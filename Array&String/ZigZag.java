public class ZigZag {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows || numRows == 0)
            return s;
        StringBuilder[] row = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            row[i] = new StringBuilder(); // create objet each index

        int currRow = 0;
        boolean goingdown = false; // true mean go down false mean go up

        for (char c : s.toCharArray()) {
            row[currRow].append(c);
            if (currRow == 0 || currRow == numRows - 1)
                goingdown = !goingdown;
            currRow += goingdown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : row)
            result.append(sb);
        return result.toString();
    }
}
