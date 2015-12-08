// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class TokenInvalidException extends Exception
{

    public static int b043A043A043A043A043A043A = 0;
    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A = 90;
    public static int b043A043A043A043A043A043A = 1;

    public TokenInvalidException(String s)
    {
        Object obj = com/visa/cbp/sdk/facade/exception/TokenInvalidException.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA2\u037A\uFF70\uFF74\uFF73\uFF81\u037A\uFF70\uFF74\uFF73\uFF81\u037A\uFF70\uFF74\uFF73\uFF81", '`', '\003'), new Class[0]);
        int i;
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b043A043A043A043A043A043A;
        switch ((j * (b043A043A043A043A043A043A + j)) % b043A043A043A043A043A043A)
        {
        default:
            b043A043A043A043A043A043A = 63;
            Object obj1 = com/visa/cbp/sdk/facade/exception/TokenInvalidException.getMethod(nuuuuu.b0417041704170417041704170417("\uFF3B\u0313\uFF09\uFF0D\uFF0C\uFF1A\u0313\uFF09\uFF0D\uFF0C\uFF1A\u0313\uFF09\uFF0D\uFF0C\uFF1A", '=', '\352', '\0'), new Class[0]);
            int k;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            k = b043A043A043A043A043A043A;
            obj1 = com/visa/cbp/sdk/facade/exception/TokenInvalidException.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9E\u0376\uFF6C\uFF70\uFF6F\uFF7D\u0376\uFF6C\uFF70\uFF6F\uFF7D\u0376\uFF6C\uFF70\uFF6F\uFF7D", '3', '\367', '\002'), new Class[0]);
            break;
        }
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((((Integer)obj1).intValue() * (i + k)) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = 40;
        }
        super(s);
    }

    public static int b043A043A043A043A043A043A()
    {
        return 2;
    }
}
