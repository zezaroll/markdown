public class Emphase extends Processor {

    public String transformInputLine(String line, String replace) {
        String replaceBy = replace.substring(1, replace.length() - 2);
        return line.replace(replace, "<em>" + replaceBy + "</em> ");
    }
}
