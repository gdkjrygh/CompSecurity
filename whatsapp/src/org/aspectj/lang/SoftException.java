// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SoftException extends RuntimeException
{

    private static final boolean HAVE_JAVA_14;
    Throwable inner;

    public SoftException(Throwable throwable)
    {
        inner = throwable;
    }

    public Throwable getCause()
    {
        return inner;
    }

    public Throwable getWrappedThrowable()
    {
        return inner;
    }

    public void printStackTrace()
    {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printstream)
    {
        super.printStackTrace(printstream);
        Throwable throwable = inner;
        if (!HAVE_JAVA_14 && throwable != null)
        {
            printstream.print("Caused by: ");
            throwable.printStackTrace(printstream);
        }
    }

    public void printStackTrace(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
        Throwable throwable = inner;
        if (!HAVE_JAVA_14 && throwable != null)
        {
            printwriter.print("Caused by: ");
            throwable.printStackTrace(printwriter);
        }
    }

    static 
    {
        boolean flag = false;
        Class.forName("java.nio.Buffer");
        flag = true;
_L2:
        HAVE_JAVA_14 = flag;
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
