// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.common:
//            b

public class L
{

    static final boolean a;
    private static String b = "L";
    private static final int c = 19;
    private static final String d = com/google/android/apps/youtube/common/L.getName();
    private static Pattern e = Pattern.compile("");

    private L()
    {
    }

    public static void a()
    {
        a(Type.VERBOSE, "", null);
    }

    private static void a(Type type, String s, Throwable throwable)
    {
        StackTraceElement astacktraceelement[];
        int i;
        int j;
        astacktraceelement = Thread.currentThread().getStackTrace();
        j = astacktraceelement.length;
        i = 0;
_L15:
        if (i >= j) goto _L2; else goto _L1
_L1:
        StackTraceElement stacktraceelement;
        String s2;
        stacktraceelement = astacktraceelement[i];
        s2 = stacktraceelement.getClassName();
        if (s2.equals(d) || !s2.startsWith("com.google.android.")) goto _L4; else goto _L3
_L3:
        String s1 = (new StringBuilder()).append(s2.substring(c)).append(".").append(stacktraceelement.getMethodName()).append(":").append(stacktraceelement.getLineNumber()).toString();
_L12:
        s = (new StringBuilder()).append(s1).append(" ").append(s).toString();
        b.a[type.ordinal()];
        JVM INSTR tableswitch 1 5: default 168
    //                   1 199
    //                   2 209
    //                   3 219
    //                   4 229
    //                   5 239;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (!a)
        {
            throw new AssertionError("Unknown type.");
        }
          goto _L11
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = "(unknown)";
          goto _L12
_L6:
        Log.e(b, s, throwable);
_L11:
        return;
_L7:
        Log.w(b, s, throwable);
        return;
_L8:
        Log.i(b, s, throwable);
        return;
_L9:
        Log.d(b, s, throwable);
        return;
_L10:
        if (s1 != null && e.matcher(s1).matches())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i) goto _L11; else goto _L13
_L13:
        Log.v(b, s, throwable);
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static void a(String s)
    {
        b = s;
    }

    public static void a(String s, Throwable throwable)
    {
        a(Type.ERROR, s, throwable);
    }

    public static void b(String s)
    {
        a(Type.ERROR, s, null);
    }

    public static void b(String s, Throwable throwable)
    {
        a(Type.WARNING, s, throwable);
    }

    public static void c(String s)
    {
        a(Type.WARNING, s, null);
    }

    public static void c(String s, Throwable throwable)
    {
        a(Type.INFO, s, throwable);
    }

    public static void d(String s)
    {
        a(Type.INFO, s, null);
    }

    public static void d(String s, Throwable throwable)
    {
        a(Type.DEBUG, s, throwable);
    }

    public static void e(String s)
    {
        a(Type.DEBUG, s, null);
    }

    public static void f(String s)
    {
        a(Type.VERBOSE, s, null);
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/youtube/common/L.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DEBUG;
        public static final Type ERROR;
        public static final Type INFO;
        public static final Type VERBOSE;
        public static final Type WARNING;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/google/android/apps/youtube/common/L$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            ERROR = new Type("ERROR", 0);
            WARNING = new Type("WARNING", 1);
            INFO = new Type("INFO", 2);
            DEBUG = new Type("DEBUG", 3);
            VERBOSE = new Type("VERBOSE", 4);
            $VALUES = (new Type[] {
                ERROR, WARNING, INFO, DEBUG, VERBOSE
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
