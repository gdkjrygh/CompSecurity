// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class CardBrand extends Enum
{

    private static final CardBrand $VALUES[];
    public static final CardBrand VISA;
    public static int b041204120412041204120412 = 2;
    public static int b044904490449044904490449 = 0;
    public static int b044904490449044904490449 = 1;
    public static int b044904490449044904490449 = 98;

    private CardBrand(String s, int i)
    {
label0:
        do
        {
            switch (1)
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        int j = b044904490449044904490449;
        int k = b044904490449044904490449;
        Object obj = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\000\u03B0\uFFCE\uFFD2\uFFCF\uFFD0\u03B0\u03B0\u03B0\u03B0", '\b', 'j', '\002'), new Class[0]);
        int l;
        int i1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        l = ((Integer)obj).intValue();
        i1 = b044904490449044904490449;
        obj = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\uFED0\u0280\uFE9E\uFEA2\uFE9F\uFEA0\u0280\u0280\u0280\u0280", '\206', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((((Integer)obj).intValue() * (i1 + l)) % b041204120412041204120412 != b044904490449044904490449)
        {
            b044904490449044904490449 = 51;
            Object obj1 = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\uFDDD\u018D\uFDAB\uFDAF\uFDAC\uFDAD\u018D\u018D\u018D\u018D", '\327', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044904490449044904490449 = ((Integer)obj1).intValue();
        }
        if (((j + k) * b044904490449044904490449) % b041204120412041204120412 != b044904490449044904490449)
        {
            b044904490449044904490449 = 96;
            b044904490449044904490449 = 64;
        }
        super(s, i);
    }

    public static int b041204120412041204120412()
    {
        return 2;
    }

    public static CardBrand valueOf(String s)
    {
        Method method = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\256\231\244\255\235\207\236", '\034', '\001'), new Class[] {
            java/lang/Class, java/lang/String
        });
        s = ((String) (method.invoke(null, new Object[] {
            com/visa/cbp/sdk/facade/data/CardBrand, s
        })));
        s = (Enum)s;
        int i;
        try
        {
            s = (CardBrand)s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = b044904490449044904490449;
        switch ((i * (b044904490449044904490449 + i)) % b041204120412041204120412)
        {
        default:
            b044904490449044904490449 = 63;
            b044904490449044904490449 = 86;
label0:
            do
            {
                switch (1)
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
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b041204120412041204120412 != b044904490449044904490449)
            {
                Object obj = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\222\u0442`dab\u0442\u0442\u0442\u0442", '0', '\005'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b044904490449044904490449 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4E\u02FE\uFF1C\uFF20\uFF1D\uFF1E\u02FE\u02FE\u02FE\u02FE", '\\', '\004'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b044904490449044904490449 = ((Integer)obj).intValue();
            }
            // fall through

        case 0: // '\0'
            return s;
        }
        s;
        throw s.getCause();
    }

    public static CardBrand[] values()
    {
        Object obj;
        try
        {
            obj = $VALUES.clone();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b041204120412041204120412 != b044904490449044904490449)
        {
            b044904490449044904490449 = 10;
            Object obj2 = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0E\u02BE\uFEDC\uFEE0\uFEDD\uFEDE\u02BE\u02BE\u02BE\u02BE", '\252', '\003'), new Class[0]);
            CardBrand acardbrand[];
            Object obj1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044904490449044904490449 = ((Integer)obj2).intValue();
        }
        try
        {
            acardbrand = (CardBrand[])obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b041204120412041204120412 != b044904490449044904490449)
        {
            b044904490449044904490449 = 96;
            obj2 = com/visa/cbp/sdk/facade/data/CardBrand.getMethod(nuuuuu.b0417041704170417041704170417("\362\u04A2\300\304\301\302\u04A2\u04A2\u04A2\u04A2", '0', '\006'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b044904490449044904490449 = ((Integer)obj2).intValue();
        }
        return acardbrand;
    }

    static 
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFC\uFFF5\uFFFE\uFFF7\004\uFFF8", 'p', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
_L4:
        try
        {
            $VALUES = (new CardBrand[] {
                VISA
            });
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                b044904490449044904490449 = 62;
                VISA = new CardBrand("VISA", 0);
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b041204120412041204120412 != b044904490449044904490449)
            {
                b044904490449044904490449 = 18;
                b044904490449044904490449 = 40;
            }
        }
_L5:
        0;
        JVM INSTR tableswitch 0 1: default 140
    //                   0 92
    //                   1 118;
           goto _L3 _L4 _L5
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 164
    //                   0 92
    //                   1 118;
           goto _L3 _L4 _L5
    }
}
