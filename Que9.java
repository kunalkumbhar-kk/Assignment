//if String1="Hello World" String2="java",check using String methods, if 'w' is present in first string. if present, replace word beginning with W with string2.Output should be "Hello Java".
public class Que9 {
    public static void main(String[] args) {
        String string1 = "Hello world"; // Note the lowercase 'w'
        String string2 = "java";

        // Check if 'w' is present in string1
        if (string1.contains("w")) {
            // Replace the word beginning with 'w' with string2 (note the lowercase 'j')
            string1 = string1.replaceFirst("\\bw\\w*", string2);
        }

        System.out.println("Output: " + string1);
    }
}


//Output : Hello java