// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.esotericsoftware.minlog;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class firstLogTime
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
    //                   1 282
    //                   2 271
    //                   3 260
    //                   4 249
    //                   5 238;
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

    public ()
    {
        firstLogTime = (new Date()).getTime();
    }
}
