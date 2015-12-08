// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class PaywaveException extends Exception
{

    public static int b042404240424042404240424 = 2;
    public static int b042404240424042404240424 = 0;
    public static int b042404240424042404240424 = 1;
    public static int b042404240424042404240424 = 86;

    public PaywaveException(String s, Throwable throwable)
    {
        int i = 3;
        do
        {
            do
            {
                i /= 0;
            } while (((b042404240424042404240424 + b042404240424042404240424) * b042404240424042404240424) % b042404240424042404240424 == b042404240424042404240424);
            Object obj = com/visa/cbp/sdk/facade/exception/PaywaveException.getMethod(nuuuuu.b0417041704170417041704170417("$\u0462\u0462\u0462\u0462\u0462vrtr", 'F', '\002'), new Class[0]);
            Exception exception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042404240424042404240424 = ((Integer)obj).intValue();
            b042404240424042404240424 = 2;
        } while (true);
        exception;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
label1:
                    switch (0)
                    {
                    case 1: // '\001'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label2;

                            case 1: // '\001'
                                break label1;
                            }
                        }
                        // fall through

                    case 0: // '\0'
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        super(s, throwable);
        return;
    }

    public static int b042404240424042404240424()
    {
        return 14;
    }
}
