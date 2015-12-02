// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class jx
{

    public static int a;

    public static void K(boolean flag)
    {
        if (!flag)
        {
            try
            {
                throw new IllegalStateException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return;
        }
    }

    public static void L(boolean flag)
    {
        if (!flag)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            try
            {
                throw new IllegalStateException(String.valueOf(obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            try
            {
                throw new IllegalStateException(String.format(s, aobj));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            return;
        }
    }

    public static void aU(String s)
    {
        try
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalStateException(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static Object b(Object obj, Object obj1)
    {
        if (obj == null)
        {
            try
            {
                throw new NullPointerException(String.valueOf(obj1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            return obj;
        }
    }

    public static String b(String s, Object obj)
    {
        try
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException(String.valueOf(obj));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
    }

    public static void b(boolean flag, Object obj)
    {
        if (!flag)
        {
            try
            {
                throw new IllegalArgumentException(String.valueOf(obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            return;
        }
    }

    public static void b(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            try
            {
                throw new IllegalArgumentException(String.format(s, aobj));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            return;
        }
    }

    public static Object i(Object obj)
    {
        if (obj == null)
        {
            try
            {
                throw new NullPointerException("null reference");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            return obj;
        }
    }
}
