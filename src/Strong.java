public class Strong extends Processor {

    String transformInputLine(String line, String replace){
        String replaceBy = replace.substring(2, replace.length() - 2);
        return line.replace(replace, "<strong>" + replaceBy + "</strong>");
    }
}
