// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class Signature
{

    public static int b044204420442044204420442 = 0;
    public static int b044204420442044204420442 = 2;
    public static int b044204420442044204420442 = 47;
    public static int b044204420442044204420442 = 1;
    private String mac;

    public Signature()
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            super();
            i = b044204420442044204420442;
            j = b044204420442044204420442;
            k = b044204420442044204420442;
            l = b044204420442044204420442;
            i1 = b044204420442044204420442;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = com/visa/cbp/external/aam/Signature.getMethod(nuuuuu.b0417041704170417041704170417("2\u0412\000\004\004\002\u0412\000\004\004\002\000\004\004\002\000\004\004\002", '\030', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b044204420442044204420442 = i;
            b044204420442044204420442 = 28;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public static int b044204420442044204420442()
    {
        return 2;
    }

    public static int b044204420442044204420442()
    {
        return 34;
    }

    public String getMac()
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
        String s;
        InvocationTargetException invocationtargetexception;
        Object obj;
        int i;
        int j;
        int k;
        try
        {
            s = mac;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            i = b044204420442044204420442;
            j = b044204420442044204420442;
            k = b044204420442044204420442;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 96
    //                   0 252;
           goto _L1 _L2
_L1:
        i = b044204420442044204420442;
        j = b044204420442044204420442;
        k = b044204420442044204420442;
        obj = com/visa/cbp/external/aam/Signature.getMethod(nuuuuu.b0417041704170417041704170417("\uFEFE\uFECC\uFED0\uFED0\uFECE\uFECC\uFED0\uFED0\uFECE\u02DE\uFECC\uFED0\uFED0\uFECE\uFECC\uFED0\uFED0\uFECE\uFECC\uFED0\uFED0\uFECE", '\234', '\310', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((k * (i + j)) % ((Integer)obj).intValue() != b044204420442044204420442)
        {
            obj = com/visa/cbp/external/aam/Signature.getMethod(nuuuuu.b0417041704170417041704170417("\uFE66\u0246\uFE34\uFE38\uFE38\uFE36\u0246\uFE34\uFE38\uFE38\uFE36\uFE34\uFE38\uFE38\uFE36\uFE34\uFE38\uFE38\uFE36", '\376', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b044204420442044204420442 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/aam/Signature.getMethod(nuuuuu.b0417041704170417041704170417("\u02F9\u06D9\u02C7\u02CB\u02CB\u02C9\u06D9\u02C7\u02CB\u02CB\u02C9\u02C7\u02CB\u02CB\u02C9\u02C7\u02CB\u02CB\u02C9", '\335', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b044204420442044204420442 = ((Integer)obj).intValue();
        }
        b044204420442044204420442 = 77;
        b044204420442044204420442 = 69;
_L2:
        return s;
    }

    public void setMac(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
