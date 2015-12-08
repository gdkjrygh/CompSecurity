// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            VerifyException, Preconditions

public final class Verify
{

    private Verify()
    {
    }

    public static void verify(boolean flag)
    {
        if (!flag)
        {
            throw new VerifyException();
        } else
        {
            return;
        }
    }

    public static transient void verify(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new VerifyException(Preconditions.format(s, aobj));
        } else
        {
            return;
        }
    }

    public static Object verifyNotNull(Object obj)
    {
        return verifyNotNull(obj, "expected a non-null reference", new Object[0]);
    }

    public static transient Object verifyNotNull(Object obj, String s, Object aobj[])
    {
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        verify(flag, s, aobj);
        return obj;
    }
}
