// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.b;

import android.util.Log;

// Referenced classes of package com.gtp.a.a.b:
//            b

public final class c
{

    private static b a = new b();

    private static final String a(String s, Object obj)
    {
        Object obj1 = "com.jb@";
        Object obj2 = obj1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        try
        {
            obj = (new StringBuilder()).append("com.jb@").append(obj.getClass().getName()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((String) (obj1));
        }
        obj1 = obj;
        obj = (new StringBuilder()).append(((String) (obj))).append("::").toString();
        obj1 = obj;
        obj = (new StringBuilder()).append(((String) (obj))).append((new Exception()).getStackTrace()[2].getMethodName()).toString();
        obj1 = obj;
        obj2 = (new StringBuilder()).append(((String) (obj))).append("@").toString();
        obj1 = obj2;
        s = (new StringBuilder()).append(((String) (obj2))).append(s).toString();
        return s;
    }

    public static final String a(Throwable throwable)
    {
        return Log.getStackTraceString(throwable);
    }

    public static final void a(String s, String s1)
    {
        if (a.a(3))
        {
            Log.d(a(s, null), s1);
        }
    }

    public static final void a(String s, String s1, Object obj)
    {
        if (a.a(4))
        {
            Log.i(a(s, obj), s1);
        }
    }

    public static final void a(String s, String s1, Throwable throwable)
    {
        if (a.a(5))
        {
            Log.w(a(s, null), s1, throwable);
        }
    }

    public static final boolean a()
    {
        return a.a();
    }

    public static final void b(String s, String s1)
    {
        if (a.a(4))
        {
            Log.i(a(s, null), s1);
        }
    }

    public static final void b(String s, String s1, Object obj)
    {
        if (a.a(6))
        {
            Log.e(a(s, obj), s1);
        }
    }

    public static final void b(String s, String s1, Throwable throwable)
    {
        if (a.a(6))
        {
            Log.e(a(s, null), s1, throwable);
        }
    }

}
