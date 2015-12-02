// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;


// Referenced classes of package com.googlecode.mp4parser.util:
//            AndroidLogger, JuliLogger

public abstract class Logger
{

    public Logger()
    {
    }

    public static Logger getLogger(Class class1)
    {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik"))
        {
            return new AndroidLogger(class1.getSimpleName());
        } else
        {
            return new JuliLogger(class1.getSimpleName());
        }
    }

    public abstract void logDebug(String s);

    public abstract void logError(String s);

    public abstract void logWarn(String s);
}
