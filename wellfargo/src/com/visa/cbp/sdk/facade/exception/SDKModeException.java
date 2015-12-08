// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class SDKModeException extends RuntimeException
{

    public static int b042F042F042F042F042F042F = 2;
    public static int b042F042F042F042F042F042F = 0;
    public static int b042F042F042F042F042F042F = 1;
    public static int b042F042F042F042F042F042F = 52;

    public SDKModeException(String s)
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b042F042F042F042F042F042F;
            j = b042F042F042F042F042F042F;
            k = b042F042F042F042F042F042F;
            l = b042F042F042F042F042F042F;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i1 = b042F042F042F042F042F042F;
        switch ((i1 * (b042F042F042F042F042F042F + i1)) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 90;
            Object obj = com/visa/cbp/sdk/facade/exception/SDKModeException.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7A\u0247\u0247\u0247\uFE48\uFE4C\uFE4A\uFE5E\uFE48\uFE4C\uFE4A\uFE5E\uFE48\uFE4C\uFE4A\uFE5E", '\364', '\003'), new Class[0]);
            int j1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        j1 = b042F042F042F042F042F042F;
        if ((k * (i + j)) % l == j1)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        try
        {
            b042F042F042F042F042F042F = 30;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/exception/SDKModeException.getMethod(nuuuuu.b0417041704170417041704170417("\211\u04C4\u04C4\u04C4\333\337\331\255\333\337\331\255\333\337\331\255", '\353', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042F042F042F042F042F042F = i;
        super(s);
        return;
        s;
        throw s.getCause();
    }

    public static int b042F042F042F042F042F042F()
    {
        return 99;
    }
}
