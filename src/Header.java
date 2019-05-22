public class Header extends Processor {

    static StringBuilder getHeaderLine(StringBuilder stringBuilder) {
        return stringBuilder;
    }

    String transformInputLine(String line, String replace){
        return "<h2>" + line.substring(2)+ "</h2>";
    }
}
