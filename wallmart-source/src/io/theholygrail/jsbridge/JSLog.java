// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.jsbridge;


public abstract class JSLog
{
    public static interface LogInterface
    {

        public abstract void debug(String s, String s1, Throwable throwable);

        public abstract void error(String s, String s1, Throwable throwable);

        public abstract void failure(String s, String s1, Throwable throwable);

        public abstract void info(String s, String s1, Throwable throwable);

        public abstract void verbose(String s, String s1, Throwable throwable);

        public abstract void warn(String s, String s1, Throwable throwable);
    }


    private static final String DEFAULT_TAG = "jsbridge";
    private static volatile LogInterface sInstance = new DefaultLog();

    public JSLog()
    {
    }

    public static void d(String s)
    {
        sInstance.debug("jsbridge", s, null);
    }

    public static void d(String s, String s1)
    {
        sInstance.debug(s, s1, null);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        sInstance.debug(s, s1, throwable);
    }

    public static void e(String s)
    {
        sInstance.warn("jsbridge", s, null);
    }

    public static void e(String s, String s1)
    {
        sInstance.warn(s, s1, null);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        sInstance.warn(s, s1, throwable);
    }

    public static void i(String s)
    {
        sInstance.info("jsbridge", s, null);
    }

    public static void i(String s, String s1)
    {
        sInstance.info(s, s1, null);
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        sInstance.info(s, s1, throwable);
    }

    public static void setInstance(LogInterface loginterface)
    {
        sInstance = loginterface;
    }

    public static void v(String s)
    {
        sInstance.verbose("jsbridge", s, null);
    }

    public static void v(String s, String s1)
    {
        sInstance.verbose(s, s1, null);
    }

    public static void v(String s, String s1, Throwable throwable)
    {
        sInstance.verbose(s, s1, throwable);
    }

    public static void w(String s)
    {
        sInstance.warn("jsbridge", s, null);
    }

    public static void w(String s, String s1)
    {
        sInstance.warn(s, s1, null);
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        sInstance.warn(s, s1, throwable);
    }

    public static void wtf(String s)
    {
        sInstance.failure("jsbridge", s, null);
    }

    public static void wtf(String s, String s1)
    {
        sInstance.failure(s, s1, null);
    }

    public static void wtf(String s, String s1, Throwable throwable)
    {
        sInstance.failure(s, s1, throwable);
    }


    // Unreferenced inner class io/theholygrail/jsbridge/JSLog$DefaultLog
    /* block-local class not found */
    class DefaultLog {}

}
