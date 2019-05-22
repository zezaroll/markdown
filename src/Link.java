public class Link extends Processor {

    String transformInputLine(String line, String replace) {
        String linkTo = replace.substring(1, replace.indexOf(']'));
        String link = replace.substring(replace.indexOf('(')+1, replace.indexOf(')'));
        return line.replace(replace, "<a href=\"" + link + "\">" + linkTo + "</a>");
    }
}
