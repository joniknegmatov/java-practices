package jonibek.io.design_patterns.behavioral.chain;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }


    @Override
    public void logMessage(int level, String message) {
        if(level == AbstractLogger.DEBUG){
            write(message);
        }else {
            super.logMessage(level, message);
        }
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
