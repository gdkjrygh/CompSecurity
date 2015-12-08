// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.youtube;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.ytremote.fork.youtube:
//            a

public class L
{

    static final boolean a;
    private static final String b;
    private static final int c;
    private static final String d = com/google/android/apps/ytremote/fork/youtube/L.getName();
    private static Pattern e = Pattern.compile("");

    private L()
    {
    }

    public static void a(String s)
    {
        StackTraceElement astacktraceelement[];
        Type type;
        int i;
        int j;
        type = Type.ERROR;
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
        if (s2.equals(d) || !s2.startsWith(b)) goto _L4; else goto _L3
_L3:
        String s1 = (new StringBuilder()).append(s2.substring(c)).append(".").append(stacktraceelement.getMethodName()).append(":").append(stacktraceelement.getLineNumber()).toString();
_L12:
        s = (new StringBuilder()).append(s1).append(" ").append(s).toString();
        a.a[type.ordinal()];
        JVM INSTR tableswitch 1 5: default 172
    //                   1 203
    //                   2 212
    //                   3 221
    //                   4 230
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
        Log.e("YouTube", s, null);
_L11:
        return;
_L7:
        Log.w("YouTube", s, null);
        return;
_L8:
        Log.i("YouTube", s, null);
        return;
_L9:
        Log.d("YouTube", s, null);
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
        Log.v("YouTube", s, null);
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    static 
    {
        String s;
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/youtube/L.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        s = (new StringBuilder()).append(com/google/android/apps/ytremote/fork/youtube/L.getPackage().getName()).append(".").toString();
        b = s;
        c = s.length();
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
            return (Type)Enum.valueOf(com/google/android/apps/ytremote/fork/youtube/L$Type, s);
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
