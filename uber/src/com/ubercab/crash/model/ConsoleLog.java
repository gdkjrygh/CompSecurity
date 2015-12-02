// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_ConsoleLog

public abstract class ConsoleLog
{

    public ConsoleLog()
    {
    }

    public static ConsoleLog create(long l, String s, String s1)
    {
        return (new Shape_ConsoleLog()).setTime(l).setLevel(s).setMessage(s1);
    }

    public abstract String getLevel();

    public abstract String getMessage();

    public abstract long getTime();

    abstract ConsoleLog setLevel(String s);

    abstract ConsoleLog setMessage(String s);

    abstract ConsoleLog setTime(long l);
}
