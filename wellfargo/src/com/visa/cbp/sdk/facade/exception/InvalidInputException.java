// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class InvalidInputException extends RuntimeException
{

    public static int b041404140414041404140414 = 13;
    public static int b041404140414041404140414 = 1;
    public static int b041404140414041404140414 = 2;
    public static int b041404140414041404140414;

    public InvalidInputException(String s)
    {
        int i = b041404140414041404140414;
        int j = b041404140414041404140414;
        int k = b041404140414041404140414;
        int l = b041404140414041404140414;
        int i1 = b041404140414041404140414;
        switch ((i1 * (b041404140414041404140414 + i1)) % b041404140414041404140414)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/exception/InvalidInputException.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD0\uFF9E\uFFA2\uFF9F\uFFA2\uFF9E\uFFA2\uFF9F\uFFA2\uFF9E\uFFA2\uFF9F\uFFA2\uFF9E\uFFA2\uFF9F\uFFA2\uFF9E\uFFA2\uFF9F\uFFA2\u0382", 'T', '\346', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/exception/InvalidInputException.getMethod(nuuuuu.b0417041704170417041704170417(">\f\020\r\020\f\020\r\020\f\020\r\020\f\020\r\020\f\020\r\020\u03F0", '$', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if ((k * (i + j)) % l != b041404140414041404140414)
        {
            b041404140414041404140414 = 90;
label0:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break;
                }
            } while (true);
            obj = com/visa/cbp/sdk/facade/exception/InvalidInputException.getMethod(nuuuuu.b0417041704170417041704170417("\u02CF\u029D\u02A1\u029E\u02A1\u029D\u02A1\u029E\u02A1\u029D\u02A1\u029E\u02A1\u029D\u02A1\u029E\u02A1\u029D\u02A1\u029E\u02A1\u0681", '\317', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
        }
        try
        {
            super(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static int b041404140414041404140414()
    {
        return 85;
    }
}
