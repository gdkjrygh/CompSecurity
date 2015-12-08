// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public interface Logger
{
    public static class LogLevel
    {

        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public LogLevel()
        {
        }
    }


    public abstract void error(Exception exception);

    public abstract void error(String s);

    public abstract int getLogLevel();

    public abstract void info(String s);

    public abstract void setLogLevel(int i);

    public abstract void verbose(String s);

    public abstract void warn(String s);
}
