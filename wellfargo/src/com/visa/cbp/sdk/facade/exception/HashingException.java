// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class HashingException extends RuntimeException
{

    public static int b042E042E042E042E042E042E = 1;
    public static int b043F043F043F043F043F043F = 99;
    public static int b042E042E042E042E042E042E = 2;
    public static int b043F043F043F043F043F043F;

    public HashingException(String s)
    {
        int i = b043F043F043F043F043F043F;
        int j = b042E042E042E042E042E042E;
        int k = b043F043F043F043F043F043F;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        int l = b043F043F043F043F043F043F;
        int i1 = b042E042E042E042E042E042E;
        int j1 = b043F043F043F043F043F043F;
        Object obj = com/visa/cbp/sdk/facade/exception/HashingException.getMethod(nuuuuu.b0417041704170417041704170417("\u0242\u060E\u060E\u0210\u0214\u0212\u0225\u060E\u060E\u060E", '\240', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((j1 * (l + i1)) % ((Integer)obj).intValue() != b043F043F043F043F043F043F)
        {
            Object obj1 = com/visa/cbp/sdk/facade/exception/HashingException.getMethod(nuuuuu.b0417041704170417041704170417("\u0118\346\352\350\373\346\352\350\373\u04E4\u04E4\u04E4\u04E4", '*', '\214', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/exception/HashingException.getMethod(nuuuuu.b0417041704170417041704170417("\223aecvaecv\u045F\u045F\u045F\u045F", '1', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
        }
        if ((k * (i + j)) % b042E042E042E042E042E042E != b043F043F043F043F043F043F)
        {
            obj1 = com/visa/cbp/sdk/facade/exception/HashingException.getMethod(nuuuuu.b0417041704170417041704170417("\u032F\u02FD\u0301\u02FF\u0312\u02FD\u0301\u02FF\u0312\u06FB\u06FB\u06FB\u06FB", '\357', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
            b043F043F043F043F043F043F = 44;
        }
        super(s);
    }

    public static int b042E042E042E042E042E042E()
    {
        return 69;
    }

    public static int b042E042E042E042E042E042E()
    {
        return 2;
    }
}
