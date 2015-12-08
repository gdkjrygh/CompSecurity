// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.lcm;

import com.visa.cbp.external.common.Response;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class LcmTokenResponse extends Response
{

    public static int b041804180418041804180418 = 2;
    public static int b041804180418041804180418 = 64;
    public static int b041804180418041804180418 = 1;

    public LcmTokenResponse()
    {
label0:
        do
        {
            switch (1)
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        int i = b041804180418041804180418;
        int k = b041804180418041804180418;
        Object obj = com/visa/cbp/external/lcm/LcmTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0148\u0116\u011A\u0117\u011E\u04FE\u04FE\u0116\u011A\u0117\u011E\u04FE\u04FE", '\346', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        switch (((k + i) * i) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/external/lcm/LcmTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("q?C@G?C@G?C@G\u0427\u0427\u0427", 'T', 'E', '\002'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041804180418041804180418 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/lcm/LcmTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\243quryquryqury\u0459\u0459\u0459", 'k', '*', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b041804180418041804180418 = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            super();
            j = b041804180418041804180418;
            obj1 = com/visa/cbp/external/lcm/LcmTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFF55\uFF23\uFF27\uFF24\uFF2B\u030B\uFF23\uFF27\uFF24\uFF2B\u030B\u030B\u030B", '\235', 'p', '\0'), new Class[0]);
            break;
        }
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        switch (((((Integer)obj1).intValue() + j) * j) % b041804180418041804180418)
        {
        default:
            b041804180418041804180418 = 90;
            obj1 = com/visa/cbp/external/lcm/LcmTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0218\u01E6\u01EA\u01E7\u01EE\u01E6\u01EA\u01E7\u01EE\u01E6\u01EA\u01E7\u01EE\u05CE\u05CE\u05CE", '\222', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041804180418041804180418 = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b041804180418041804180418()
    {
        return 93;
    }

    public static int b041804180418041804180418()
    {
        return 1;
    }

    public static int b041804180418041804180418()
    {
        return 2;
    }
}
