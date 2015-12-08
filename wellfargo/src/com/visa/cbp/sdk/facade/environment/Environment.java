// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.environment;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class Environment extends Enum
{

    private static final Environment $VALUES[];
    public static final Environment PROD;
    public static final Environment SANDBOX;
    public static int b044804480448044804480448 = 0;
    public static int b044804480448044804480448 = 2;
    public static int b044804480448044804480448 = 1;
    public static int b044804480448044804480448 = 3;

    private Environment(String s, int i)
    {
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
        int j = b044804480448044804480448;
        Object obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\u0347\u0315\u0319\u0319\u031D\u072D\u072D\u072D\u0315\u0319\u0319\u031D\u0315\u0319\u0319\u031D", '\367', '\006'), new Class[0]);
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((((Integer)obj).intValue() + j) * j) % b044804480448044804480448)
        {
        default:
            b044804480448044804480448 = 32;
            b044804480448044804480448 = 88;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            i = b044804480448044804480448;
            j = b044804480448044804480448;
            k = b044804480448044804480448;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 176
    //                   0 221;
           goto _L1 _L2
_L1:
        b044804480448044804480448 = 62;
        s = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\016\uFFDC\uFFE0\uFFE0\uFFE4\uFFDC\uFFE0\uFFE0\uFFE4\u03F4\u03F4\uFFDC\uFFE0\uFFE0\uFFE4\uFFDC\uFFE0\uFFE0\uFFE4", 'T', '\0'), new Class[0]);
        s = ((String) (s.invoke(null, new Object[0])));
        i = ((Integer)s).intValue();
        b044804480448044804480448 = i;
_L2:
        return;
        s;
        throw s.getCause();
    }

    public static int b044804480448044804480448()
    {
        return 79;
    }

    public static int b044804480448044804480448()
    {
        return 1;
    }

    public static int b044804480448044804480448()
    {
        return 0;
    }

    public static Environment valueOf(String s)
    {
        if (((b044804480448044804480448 + b044804480448044804480448) * b044804480448044804480448) % b044804480448044804480448 != b044804480448044804480448)
        {
            Object obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE7\uFFB5\uFFB9\uFFB9\uFFBD\uFFB5\uFFB9\uFFB9\uFFBD\u03CD\u03CD\uFFB5\uFFB9\uFFB9\uFFBD\uFFB5\uFFB9\uFFB9\uFFBD", ')', '\004'), new Class[0]);
            int i;
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044804480448044804480448 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\021CGGKCGGK\u043B\u043BCGGKCGGK", 's', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044804480448044804480448 = ((Integer)obj).intValue();
        }
        i = b044804480448044804480448;
        j = b044804480448044804480448;
        k = b044804480448044804480448;
        l = b044804480448044804480448;
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
        if (((i + j) * k) % l != b044804480448044804480448)
        {
            b044804480448044804480448 = 79;
            obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\u034A\u0318\u031C\u031C\u0320\u0318\u031C\u031C\u0320\u0730\u0730\u0318\u031C\u031C\u0320\u0318\u031C\u031C\u0320", '\370', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044804480448044804480448 = ((Integer)obj).intValue();
        }
        obj = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\u0155\u0140\u014B\u0154\u0144\u012E\u0145", '\032', '\371', '\001'), new Class[] {
            java/lang/Class, java/lang/String
        });
        s = ((String) (((Method) (obj)).invoke(null, new Object[] {
            com/visa/cbp/sdk/facade/environment/Environment, s
        })));
        s = (Enum)s;
        try
        {
            s = (Environment)s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
        s;
        throw s.getCause();
    }

    public static Environment[] values()
    {
        Environment aenvironment[];
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            aenvironment = $VALUES;
        }
        catch (Exception exception)
        {
            throw exception;
        }
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
        try
        {
            i = b044804480448044804480448;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\221_ccg\u0477\u0477\u0477_ccg_ccg", '\231', 'j', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        k = b044804480448044804480448;
        l = b044804480448044804480448;
        (l * (b044804480448044804480448 + l)) % b044804480448044804480448;
        JVM INSTR tableswitch 0 0: default 140
    //                   0 150;
           goto _L1 _L2
_L1:
        b044804480448044804480448 = 75;
        b044804480448044804480448 = 85;
_L2:
        ((j + i) * i) % k;
        JVM INSTR tableswitch 0 0: default 176
    //                   0 222;
           goto _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_222;
_L3:
        b044804480448044804480448 = 78;
        obj1 = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\uFD8F\uFD5D\uFD61\uFD61\uFD65\uFD5D\uFD61\uFD61\uFD65\u0175\u0175\uFD5D\uFD61\uFD61\uFD65\uFD5D\uFD61\uFD61\uFD65", '\361', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b044804480448044804480448 = i;
        aenvironment = (Environment[])aenvironment.clone();
        return aenvironment;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }

    static 
    {
        Object obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\uFF27\uFEF5\uFEF9\uFEF9\uFEFD\uFEF5\uFEF9\uFEF9\uFEFD\u030D\u030D\uFEF5\uFEF9\uFEF9\uFEFD\uFEF5\uFEF9\uFEF9\uFEFD", 'i', '\004'), new Class[0]);
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b044804480448044804480448;
        obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAE\uFF7C\uFF80\uFF80\uFF84\uFF7C\uFF80\uFF80\uFF84\u0394\u0394\uFF7C\uFF80\uFF80\uFF84\uFF7C\uFF80\uFF80\uFF84", 'Z', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        k = ((Integer)obj).intValue();
        l = b044804480448044804480448;
        obj = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\u0178\u055E\u0146\u014A\u014A\u014E\u0146\u014A\u014A\u014E\u055E\u0146\u014A\u014A\u014E\u0146\u014A\u014A\u014E", '\213', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        if ((k * (j + i)) % l != ((Integer)obj).intValue())
        {
            if (((b044804480448044804480448 + b044804480448044804480448) * b044804480448044804480448) % b044804480448044804480448 != b044804480448044804480448)
            {
                b044804480448044804480448 = 68;
                Object obj1 = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\024\uFFE2\uFFE6\uFFE6\uFFEA\uFFE2\uFFE6\uFFE6\uFFEA\u03FA\u03FA\uFFE2\uFFE6\uFFE6\uFFEA\uFFE2\uFFE6\uFFE6\uFFEA", 'N', '\0'), new Class[0]);
                InvocationTargetException invocationtargetexception3;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception4)
                {
                    throw invocationtargetexception4.getCause();
                }
                b044804480448044804480448 = ((Integer)obj1).intValue();
            }
            b044804480448044804480448 = 27;
            obj1 = com/visa/cbp/sdk/facade/environment/Environment.getMethod(nuuuuu.b0417041704170417041704170417("\uFEEE\uFEBC\uFEC0\uFEC0\uFEC4\uFEBC\uFEC0\uFEC0\uFEC4\u02D4\u02D4\uFEBC\uFEC0\uFEC0\uFEC4\uFEBC\uFEC0\uFEC0\uFEC4", '\211', '\353', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b044804480448044804480448 = ((Integer)obj1).intValue();
        }
        SANDBOX = new Environment("SANDBOX", 0);
        PROD = new Environment("PROD", 1);
        $VALUES = (new Environment[] {
            SANDBOX, PROD
        });
    }
}
