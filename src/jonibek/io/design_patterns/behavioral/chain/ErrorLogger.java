package jonibek.io.design_patterns.behavioral.chain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }


    @Override
    public void logMessage(int level, String message) {
        if(level == AbstractLogger.ERROR){
            write(message);
        }else {
            super.logMessage(level, message);
        }
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
