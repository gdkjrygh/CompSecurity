// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.exception;


public abstract class Exceptions
{

    private Exceptions()
    {
    }

    public static boolean unexpectedFailure(Throwable throwable, Class aclass[])
    {
        int i;
        if (throwable == null)
        {
            return false;
        }
        if (aclass == null)
        {
            return true;
        }
        throwable = throwable.getClass();
        i = 0;
_L3:
        if (i >= aclass.length)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (aclass[i] == null || !aclass[i].isAssignableFrom(throwable)) goto _L5; else goto _L4
_L4:
        return false;
_L2:
        return true;
    }
}
