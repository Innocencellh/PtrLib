package in.srain.cube.views.ptr.util;

import android.util.Log;

/**
 * An encapsulation of {@link Log}, enable log level and print log with parameters.
 *
 * @author http://www.liaohuqiu.net/
 */
public class PtrCLog {

    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_WARNING = 3;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;

    private static int sLevel = LEVEL_VERBOSE;

    /**
     * set log level, the level lower than this level will not be logged
     *
     * @param level int
     */
    public static void setLogLevel(int level) {
        sLevel = level;
    }

    /**
     * Send a VERBOSE log message.
     *
     * @param tag String
     * @param msg msg
     */
    public static void v(String tag, String msg) {
        if (sLevel > LEVEL_VERBOSE) {
            return;
        }
        Log.v(tag, msg);
    }

    /**
     * Send a VERBOSE log message.
     *
     * @param tag       String
     * @param msg       String
     * @param throwable Throwable
     */
    public static void v(String tag, String msg, Throwable throwable) {
        if (sLevel > LEVEL_VERBOSE) {
            return;
        }
        Log.v(tag, msg, throwable);
    }

    /**
     * Send a VERBOSE log message.
     *
     * @param tag  String
     * @param msg  String
     * @param args Object...
     */
    public static void v(String tag, String msg, Object... args) {
        if (sLevel > LEVEL_VERBOSE) {
            return;
        }
        if (args.length > 0) {
            msg = String.format(msg, args);
        }
        Log.v(tag, msg);
    }

    /**
     * Send a DEBUG log message
     *
     * @param tag String
     * @param msg String
     */
    public static void d(String tag, String msg) {
        if (sLevel > LEVEL_DEBUG) {
            return;
        }
        Log.d(tag, msg);
    }

    /**
     * Send a DEBUG log message
     *
     * @param tag  String
     * @param msg  String
     * @param args Object...
     */
    public static void d(String tag, String msg, Object... args) {
        if (sLevel > LEVEL_DEBUG) {
            return;
        }
        if (args.length > 0) {
            msg = String.format(msg, args);
        }
        Log.d(tag, msg);
    }

    /**
     * Send a DEBUG log message
     *
     * @param tag       String
     * @param msg       String
     * @param throwable Throwable
     */
    public static void d(String tag, String msg, Throwable throwable) {
        if (sLevel > LEVEL_DEBUG) {
            return;
        }
        Log.d(tag, msg, throwable);
    }

    /**
     * Send an INFO log message
     *
     * @param tag String
     * @param msg String
     */
    public static void i(String tag, String msg) {
        if (sLevel > LEVEL_INFO) {
            return;
        }
        Log.i(tag, msg);
    }

    /**
     * Send an INFO log message
     *
     * @param tag  String
     * @param msg  String
     * @param args Object...
     */
    public static void i(String tag, String msg, Object... args) {
        if (sLevel > LEVEL_INFO) {
            return;
        }
        if (args.length > 0) {
            msg = String.format(msg, args);
        }
        Log.i(tag, msg);
    }

    /**
     * Send an INFO log message
     *
     * @param tag String
     * @param msg String
     */
    public static void i(String tag, String msg, Throwable throwable) {
        if (sLevel > LEVEL_INFO) {
            return;
        }
        Log.i(tag, msg, throwable);
    }

    /**
     * Send a WARNING log message
     *
     * @param tag String
     * @param msg String
     */
    public static void w(String tag, String msg) {
        if (sLevel > LEVEL_WARNING) {
            return;
        }
        Log.w(tag, msg);
    }

    /**
     * Send a WARNING log message
     *
     * @param tag  String
     * @param msg  String
     * @param args Object...
     */
    public static void w(String tag, String msg, Object... args) {
        if (sLevel > LEVEL_WARNING) {
            return;
        }
        if (args.length > 0) {
            msg = String.format(msg, args);
        }
        Log.w(tag, msg);
    }

    /**
     * Send a WARNING log message
     *
     * @param tag       String
     * @param msg       String
     * @param throwable Throwable
     */
    public static void w(String tag, String msg, Throwable throwable) {
        if (sLevel > LEVEL_WARNING) {
            return;
        }
        Log.w(tag, msg, throwable);
    }

    /**
     * Send an ERROR log message
     *
     * @param tag String
     * @param msg String
     */
    public static void e(String tag, String msg) {
        if (sLevel > LEVEL_ERROR) {
            return;
        }
        Log.e(tag, msg);
    }

    /**
     * Send an ERROR log message
     *
     * @param tag  String
     * @param msg  String
     * @param args Object..
     */
    public static void e(String tag, String msg, Object... args) {
        if (sLevel > LEVEL_ERROR) {
            return;
        }
        if (args.length > 0) {
            msg = String.format(msg, args);
        }
        Log.e(tag, msg);
    }

    /**
     * Send an ERROR log message
     *
     * @param tag       String
     * @param msg       String
     * @param throwable Throwable
     */
    public static void e(String tag, String msg, Throwable throwable) {
        if (sLevel > LEVEL_ERROR) {
            return;
        }
        Log.e(tag, msg, throwable);
    }

    /**
     * Send a FATAL ERROR log message
     *
     * @param tag String
     * @param msg String
     */
    public static void f(String tag, String msg) {
        if (sLevel > LEVEL_FATAL) {
            return;
        }
        Log.wtf(tag, msg);
    }

    /**
     * Send a FATAL ERROR log message
     *
     * @param tag  String
     * @param msg  String
     * @param args Object...
     */
    public static void f(String tag, String msg, Object... args) {
        if (sLevel > LEVEL_FATAL) {
            return;
        }
        if (args.length > 0) {
            msg = String.format(msg, args);
        }
        Log.wtf(tag, msg);
    }

    /**
     * Send a FATAL ERROR log message
     *
     * @param tag       String
     * @param msg       String
     * @param throwable Throwable
     */
    public static void f(String tag, String msg, Throwable throwable) {
        if (sLevel > LEVEL_FATAL) {
            return;
        }
        Log.wtf(tag, msg, throwable);
    }
}
