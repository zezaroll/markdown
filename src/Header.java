public class Header extends Processor {


    public String transformInputLine(String line, String replace){
        return "<h2>" + line.substring(2)+ "</h2>";
    }
}
