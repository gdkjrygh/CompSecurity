// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class DeviceIDValidationException extends Exception
{

    public static int b043204320432043204320432 = 2;
    public static int b043204320432043204320432 = 0;
    public static int b043204320432043204320432 = 1;
    public static int b043204320432043204320432 = 70;

    public DeviceIDValidationException(String s)
    {
label0:
        do
        {
            if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
            {
                b043204320432043204320432 = 76;
                b043204320432043204320432 = 34;
            }
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
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
        {
            Object obj = com/visa/cbp/sdk/facade/exception/DeviceIDValidationException.getMethod(nuuuuu.b0417041704170417041704170417("\u01E4\u05B4\u05B4\u01B2\u01B6\u01B5\u01B4\u05B4\u01B2\u01B6\u01B5\u01B4\u01B2\u01B6\u01B5\u01B4", '\301', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/exception/DeviceIDValidationException.getMethod(nuuuuu.b0417041704170417041704170417("\001\u03D1\u03D1\uFFCF\uFFD3\uFFD2\uFFD1\u03D1\uFFCF\uFFD3\uFFD2\uFFD1\uFFCF\uFFD3\uFFD2\uFFD1", '\213', '\354', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
        }
        super(s);
    }

    public static int b043204320432043204320432()
    {
        return 53;
    }
}
