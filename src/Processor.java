import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processor {
    private static final Pattern HEADER = Pattern.compile("##.*");
    private static final Pattern STRONG = Pattern.compile("\\*\\*[\\w]*\\*\\*");
    private static final Pattern EM = Pattern.compile("\\*[\\w]+\\*[^\\*]");
    private static final Pattern LINK = Pattern.compile("\\[.*\\)");

    Processor getProcess;
    static Pattern[] patterns;

    Processor() {
        patterns = new Pattern[]{HEADER, EM, STRONG, LINK};
    }


    String process(String line) {
        Matcher matcher;
        for (int i = 0; i < patterns.length; i++) {
            matcher = patterns[i].matcher(line);
            getProcess = detectRole(i);

            while (matcher.find()) {
                System.out.println(matcher.group());
                line = getProcess.transformInputLine(line, matcher.group());
            }
        }
        if (!line.contains("<h2>")) {
            line = "    <p>" + line + "</p>";
        }
        return line;
    }

    String transformInputLine(String line, String replace) {
        return null;
    }

    private Processor detectRole(int i) {
        Processor p;
        switch (i) {
            case 0: {
                p = new Header();
                break;
            }
            case 1: {
                p = new Emphase();
                break;
            }
            case 2: {
                p = new Strong();
                break;
            }
            case 3: {
                p = new Link();
                break;
            }
            default: {
                p = new Processor();
            }
        }
        return p;
    }

}
