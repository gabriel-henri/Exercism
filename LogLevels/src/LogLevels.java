public class LogLevels {

    public static String message(String logLine) {
        logLine = logLine.trim();
        String[] message = new String[2];
        message = logLine.split(" ", 2);

        return message[1].trim();
    }

    public static String logLevel(String logLine) {
        logLine = logLine.trim();
        String[] message = new String[2];
        message = logLine.split(" ", 2);
        String log = "";
        String mess = message[0];
        for(int i = 0; i < mess.length(); i++){
            char s = mess.charAt(i);
            if(s != '[' && s != ']' && s != ':' && s != ' '){
                log += s;
            }
        }
        log = log.toLowerCase();
        return log;
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String log = "(" + logLevel(logLine) + ")";
        return message+" "+log;
    }
}
