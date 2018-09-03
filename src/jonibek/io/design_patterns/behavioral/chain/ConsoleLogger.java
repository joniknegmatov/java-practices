package jonibek.io.design_patterns.behavioral.chain;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

    @Override
    public void logMessage(int level, String message) {
        if(level == AbstractLogger.INFO){
            write(message);
        }else {
            super.logMessage(level, message);
        }
    }
}
