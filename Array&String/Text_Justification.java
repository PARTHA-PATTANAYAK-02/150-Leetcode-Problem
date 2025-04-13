import java.util.ArrayList;
import java.util.List;

public class Text_Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int count = words[index].length(); // Start with the length of the first word
            int last = index + 1; // Last word in the current line

            // Determine how many words can fit in the current line
            while (last < words.length) {
                if (count + words[last].length() + 1 > maxWidth)
                    break;
                count += words[last].length() + 1;
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int numberOfWords = last - index;
            int spaces = maxWidth - count;

            // If it's the last line or only one word fits in the line
            if (last == words.length || numberOfWords == 1) {
                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1)
                        builder.append(" ");
                }
                // Fill the remaining spaces
                while (builder.length() < maxWidth) {
                    builder.append(" ");
                }
            } else {
                // Distribute spaces evenly
                int spaceBetweenWords = spaces / (numberOfWords - 1);
                int extraSpaces = spaces % (numberOfWords - 1);

                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= spaceBetweenWords + (i - index < extraSpaces ? 1 : 0); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }

            result.add(builder.toString());
            index = last;
        }

        return result;
    }
}