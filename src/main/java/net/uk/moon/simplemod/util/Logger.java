package net.uk.moon.simplemod.util;


import cpw.mods.fml.common.FMLLog;
import net.uk.moon.simplemod.SimpleMod;
import org.apache.logging.log4j.Level;

/**
 * Logging utility class
 */
public class Logger {
    /**
     * Creates a log entry with a given level and value.
     * @param level Logging level to use
     * @param object Value to log
     */
    public static void log(Level level, Object object) {
        FMLLog.log(SimpleMod.MOD_ID, level, String.valueOf(object));
    }

    /**
     * Creates a log entry with log level ALL.
     * @param object Value to log.
     */
    public static void all(Object object) {
        log(Level.ALL, object);
    }

    /**
     * Creates a log entry with log level DEBUG.
     * @param object Value to log.
     */
    public static void debug(Object object) {
        log(Level.DEBUG, object);
    }

    /**
     * Creates a log entry with log level ERROR.
     * @param object Value to log.
     */
    public static void error(Object object) {
        log(Level.ERROR, object);
    }

    /**
     * Creates a log entry with log level FATAL.
     * @param object Value to log.
     */
    public static void fatal(Object object) {
        log(Level.FATAL, object);
    }

    /**
     * Creates a log entry with log level INFO.
     * @param object Value to log.
     */
    public static void info(Object object) {
        log(Level.INFO, object);
    }

    /**
     * Creates a log entry with log level OFF.
     * @param object Value to log.
     */
    public static void off(Object object) {
        log(Level.OFF, object);
    }

    /**
     * Creates a log entry with log level TRACE.
     * @param object Value to log.
     */
    public static void trace(Object object) {
        log(Level.TRACE, object);
    }

    /**
     * Creates a log entry with log level WARN.
     * @param object Value to log.
     */
    public static void warn(Object object) {
        log(Level.WARN, object);
    }
}
