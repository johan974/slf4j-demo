import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4J_Demo {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4J_Demo.class);
        logger.trace("Hello World");
        logger.debug("Hello World");
        logger.info("Hello World");
        logger.warn("Hello World");
        logger.error("Hello World");
    }
    // Lessons:
    // 1 - you need a log4j.properties file otherwise you get this error:
    //        log4j:WARN No appenders could be found for logger (Slf4J_Demo). Etc.
    // 2 - you specified only the api, you get:
    //        SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    //        SLF4J: Defaulting to no-operation (NOP) logger implementation
    // 3 - you provide more than 1 binding JAR to your project config, then you'll get the following error message:
    //        SLF4J: Class path contains multiple SLF4J bindings.
    //        SLF4J: Found binding in [jar:file:/Users/Roger/.m2/repository/org/slf4j/slf4j-nop/1.6.1/slf4j-nop-1.6.1.jar
    //        SLF4J: Found binding in [jar:file:/Users/Roger/.m2/repository/org/slf4j/slf4j-log4j12/
    // 4 - api + jcl-over-slf4j zonder binding ... geeft de foutmelding van 2, n.l. geen binding
    // 5 - api + log4j zonder binding ... idem.
    //
}
