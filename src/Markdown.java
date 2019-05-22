

public class Markdown {
    static String input;
    static StringBuilder outPut = new StringBuilder("<html>\r\n<body>\r\n");

    static Processor processor = new Processor();


    public static void main(String[] args) {
        input = "##HeaderLine\r\n" +
                "Simple Line *with* em\r\n" +
                "Simple **Line** with strong\r\n" +
                "Line with link [Link to google](https://www.google.com) in center\r\n" +
                "Line **with** *many* **elements** and link [Link to FB](https://www.facebook.com)";

        readStr(input);
    }

    public static void readStr(String str) {
        String[] lines = input.split("\r\n");
        for (String line : lines) {
            outPut.append(processor.process(line) + "\r\n");
        }
        outPut.append("</html>\r\n</body>\r\n");
        System.out.println(outPut);
    }
}
