// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.esotericsoftware.minlog;


public class Log
{

    public static boolean DEBUG = false;
    public static boolean ERROR = false;
    public static boolean INFO = false;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_TRACE = 1;
    public static final int LEVEL_WARN = 4;
    public static boolean TRACE;
    public static boolean WARN;
    private static int level;
    private static Logger logger = new Logger();

    private Log()
    {
    }

    public static void DEBUG()
    {
        set(2);
    }

    public static void ERROR()
    {
        set(5);
    }

    public static void INFO()
    {
        set(3);
    }

    public static void NONE()
    {
        set(6);
    }

    public static void TRACE()
    {
        set(1);
    }

    public static void WARN()
    {
        set(4);
    }

    public static void debug(String s)
    {
        if (DEBUG)
        {
            logger.log(2, null, s, null);
        }
    }

    public static void debug(String s, String s1)
    {
        if (DEBUG)
        {
            logger.log(2, s, s1, null);
        }
    }

    public static void debug(String s, String s1, Throwable throwable)
    {
        if (DEBUG)
        {
            logger.log(2, s, s1, throwable);
        }
    }

    public static void debug(String s, Throwable throwable)
    {
        if (DEBUG)
        {
            logger.log(2, null, s, throwable);
        }
    }

    public static void error(String s)
    {
        if (ERROR)
        {
            logger.log(5, null, s, null);
        }
    }

    public static void error(String s, String s1)
    {
        if (ERROR)
        {
            logger.log(5, s, s1, null);
        }
    }

    public static void error(String s, String s1, Throwable throwable)
    {
        if (ERROR)
        {
            logger.log(5, s, s1, throwable);
        }
    }

    public static void error(String s, Throwable throwable)
    {
        if (ERROR)
        {
            logger.log(5, null, s, throwable);
        }
    }

    public static void info(String s)
    {
        if (INFO)
        {
            logger.log(3, null, s, null);
        }
    }

    public static void info(String s, String s1)
    {
        if (INFO)
        {
            logger.log(3, s, s1, null);
        }
    }

    public static void info(String s, String s1, Throwable throwable)
    {
        if (INFO)
        {
            logger.log(3, s, s1, throwable);
        }
    }

    public static void info(String s, Throwable throwable)
    {
        if (INFO)
        {
            logger.log(3, null, s, throwable);
        }
    }

    public static void set(int i)
    {
        boolean flag1 = true;
        level = i;
        boolean flag;
        if (i <= 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ERROR = flag;
        if (i <= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WARN = flag;
        if (i <= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        INFO = flag;
        if (i <= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DEBUG = flag;
        if (i <= 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        TRACE = flag;
    }

    public static void setLogger(Logger logger1)
    {
        logger = logger1;
    }

    public static void trace(String s)
    {
        if (TRACE)
        {
            logger.log(1, null, s, null);
        }
    }

    public static void trace(String s, String s1)
    {
        if (TRACE)
        {
            logger.log(1, s, s1, null);
        }
    }

    public static void trace(String s, String s1, Throwable throwable)
    {
        if (TRACE)
        {
            logger.log(1, s, s1, throwable);
        }
    }

    public static void trace(String s, Throwable throwable)
    {
        if (TRACE)
        {
            logger.log(1, null, s, throwable);
        }
    }

    public static void warn(String s)
    {
        if (WARN)
        {
            logger.log(4, null, s, null);
        }
    }

    public static void warn(String s, String s1)
    {
        if (WARN)
        {
            logger.log(4, s, s1, null);
        }
    }

    public static void warn(String s, String s1, Throwable throwable)
    {
        if (WARN)
        {
            logger.log(4, s, s1, throwable);
        }
    }

    public static void warn(String s, Throwable throwable)
    {
        if (WARN)
        {
            logger.log(4, null, s, throwable);
        }
    }

    static 
    {
        boolean flag1 = true;
        level = 3;
        ERROR = true;
        boolean flag;
        if (level <= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WARN = flag;
        if (level <= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        INFO = flag;
        if (level <= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DEBUG = flag;
        if (level <= 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        TRACE = flag;
    }

    private class Logger
    {

        private long firstLogTime;

        public void log(int i, String s, String s1, Throwable throwable)
        {
            StringBuilder stringbuilder;
            stringbuilder = new StringBuilder(256);
            long l1 = (new Date()).getTime() - firstLogTime;
            long l = l1 / 60000L;
            l1 = (l1 / 1000L) % 60L;
            if (l <= 9L)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(l);
            stringbuilder.append(':');
            if (l1 <= 9L)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(l1);
            i;
            JVM INSTR tableswitch 1 5: default 144
        //                       1 282
        //                       2 271
        //                       3 260
        //                       4 249
        //                       5 238;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (s != null)
            {
                stringbuilder.append('[');
                stringbuilder.append(s);
                stringbuilder.append("] ");
            }
            stringbuilder.append(s1);
            if (throwable != null)
            {
                s = new StringWriter(256);
                throwable.printStackTrace(new PrintWriter(s));
                stringbuilder.append('\n');
                stringbuilder.append(s.toString().trim());
            }
            print(stringbuilder.toString());
            return;
_L6:
            stringbuilder.append(" ERROR: ");
            continue; /* Loop/switch isn't completed */
_L5:
            stringbuilder.append("  WARN: ");
            continue; /* Loop/switch isn't completed */
_L4:
            stringbuilder.append("  INFO: ");
            continue; /* Loop/switch isn't completed */
_L3:
            stringbuilder.append(" DEBUG: ");
            continue; /* Loop/switch isn't completed */
_L2:
            stringbuilder.append(" TRACE: ");
            if (true) goto _L1; else goto _L7
_L7:
        }

        protected void print(String s)
        {
            System.out.println(s);
        }

        public Logger()
        {
            firstLogTime = (new Date()).getTime();
        }
    }

}
