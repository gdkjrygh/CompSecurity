// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.security.SecureRandom;
import java.util.Map;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal:
//            il, im, in, io, 
//            ip, iq, gi

public final class ik
{

    public static final Map a = new jb._cls1();
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final String c[] = new String[0];
    public static final Pattern d = Pattern.compile("\\,");
    public static final Pattern e = Pattern.compile("[\u2028\u2029 \240\u1680\u180E\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\t\013\f\034\035\036\037\n\r]+");
    public static final SecureRandom f = new SecureRandom();
    private static final ThreadLocal g = new il();
    private static final ThreadLocal h = new im();
    private static final ThreadLocal i = new in();
    private static final ThreadLocal j = new io();
    private static final ThreadLocal k = new ip();
    private static final ThreadLocal l = new iq();

    public static String a(String s)
    {
        gi.a(s);
        return (new StringBuilder("g:")).append(s).toString();
    }

    public static String b(String s)
    {
        gi.a(s);
        return (new StringBuilder("e:")).append(s).toString();
    }

}
