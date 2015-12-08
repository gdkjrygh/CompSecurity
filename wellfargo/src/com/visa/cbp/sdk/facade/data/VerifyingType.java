// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class VerifyingType extends Enum
{

    private static final VerifyingType $VALUES[];
    public static final VerifyingType MOBILE_DEVICE;
    public static final VerifyingType NO_CD_CVM;
    public static final VerifyingType ONLINE_PIN;
    public static final VerifyingType OTHER_CD_CVM;
    public static final VerifyingType PASSCODE;
    public static final VerifyingType SIGNATURE;
    public static int b042104210421042104210421 = 2;
    public static int b042104210421042104210421 = 0;
    public static int b042104210421042104210421 = 1;
    public static int b042104210421042104210421 = 28;
    private final byte value;

    private VerifyingType(String s, int i, byte byte0)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b042104210421042104210421()
    {
        return 0;
    }

    public static int b042104210421042104210421()
    {
        return 4;
    }

    public static int b042104210421042104210421()
    {
        return 2;
    }

    public static VerifyingType valueOf(String s)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        try
        {
            i = b042104210421042104210421;
            j = b042104210421042104210421;
            k = b042104210421042104210421;
            l = b042104210421042104210421;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\uFEE2\uFEB0\uFEB4\uFEB2\uFEB1\u02A1\uFEB0\uFEB4\uFEB2\uFEB1\uFEB0\uFEB4\uFEB2\uFEB1\u02A1\uFEB0\uFEB4\uFEB2\uFEB1", '\300', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        if (((i + j) * k) % l == ((Integer)obj).intValue())
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            obj = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\302\u0481\u0481\u0481\220\224\222\221\u0481\220\224\222\221", '0', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042104210421042104210421 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5C\u031B\u031B\u031B\uFF2A\uFF2E\uFF2C\uFF2B\u031B\uFF2A\uFF2E\uFF2C\uFF2B", 'l', '\232', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042104210421042104210421 = ((Integer)obj).intValue();
        }
        obj = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\uFE46\u0205\u0205\u0205\uFE14\uFE18\uFE16\uFE15\u0205\uFE14\uFE18\uFE16\uFE15", '\264', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042104210421042104210421 = i;
            b042104210421042104210421 = 69;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD8\uFFC3\uFFCE\uFFD7\uFFC7\uFFB1\uFFC8", 'O', '\003'), new Class[] {
            java/lang/Class, java/lang/String
        });
        s = ((String) (((Method) (obj)).invoke(null, new Object[] {
            com/visa/cbp/sdk/facade/data/VerifyingType, s
        })));
        s = (Enum)s;
        s = (VerifyingType)s;
        return s;
_L2:
        throw s;
        s;
        throw s;
        s;
        throw s.getCause();
        s;
        try
        {
            throw s.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s.getCause();
    }

    public static VerifyingType[] values()
    {
        Object obj;
        VerifyingType averifyingtype[];
        Object obj1;
        int i;
        int k;
        try
        {
            obj = $VALUES.clone();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            averifyingtype = (VerifyingType[])obj;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj1 = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\uFEC2\u0281\u0281\u0281\uFE90\uFE94\uFE92\uFE91\u0281\uFE90\uFE94\uFE92\uFE91", '\354', '\264', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj1).intValue();
        k = b042104210421042104210421;
        obj1 = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("3\u03F2\u03F2\u03F2\001\005\003\002\u03F2\001\005\003\002", 'O', ' ', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((((Integer)obj1).intValue() * (k + i)) % b042104210421042104210421 != b042104210421042104210421)
        {
            Object obj2 = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\211\u0448\u0448\u0448W[YX\u0448W[YX", '\343', '\274', '\002'), new Class[0]);
            int j;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            j = ((Integer)obj2).intValue();
            switch ((j * (b042104210421042104210421 + j)) % b042104210421042104210421)
            {
            default:
                b042104210421042104210421 = 12;
                // fall through

            case 0: // '\0'
                obj2 = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\031\u03D8\u03D8\u03D8\uFFE7\uFFEB\uFFE9\uFFE8\u03D8\uFFE7\uFFEB\uFFE9\uFFE8", '\205', '<', '\001'), new Class[0]);
                break;
            }
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042104210421042104210421 = ((Integer)obj2).intValue();
        }
        return averifyingtype;
    }

    static 
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        Object obj1;
        VerifyingType verifyingtype;
        int i;
        int j;
        try
        {
            i = b042104210421042104210421;
            j = b042104210421042104210421;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\240\u045F\u045F\u045F\u045Fnrponrpo", '\037', ']', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((j + i) * i) % ((Integer)obj).intValue();
        JVM INSTR tableswitch 0 0: default 72
    //                   0 82;
           goto _L1 _L2
_L1:
        b042104210421042104210421 = 32;
        b042104210421042104210421 = 47;
_L2:
        try
        {
            NO_CD_CVM = new VerifyingType("NO_CD_CVM", 0, (byte)0);
            PASSCODE = new VerifyingType("PASSCODE", 1, (byte)1);
            OTHER_CD_CVM = new VerifyingType("OTHER_CD_CVM", 2, (byte)2);
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        MOBILE_DEVICE = new VerifyingType("MOBILE_DEVICE", 3, (byte)3);
        obj = new VerifyingType("SIGNATURE", 4, (byte)13);
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            obj1 = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\350\u04A7\u04A7\u04A7\266\272\270\267\u04A7\266\272\270\267", '\206', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042104210421042104210421 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/VerifyingType.getMethod(nuuuuu.b0417041704170417041704170417("\273\u047A\u047A\u047A\211\215\213\212\u047A\211\215\213\212", 'Y', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042104210421042104210421 = ((Integer)obj1).intValue();
        }
        SIGNATURE = ((VerifyingType) (obj));
          goto _L3
_L8:
        ONLINE_PIN = new VerifyingType("ONLINE_PIN", 5, (byte)14);
        obj = NO_CD_CVM;
        obj1 = PASSCODE;
        verifyingtype = OTHER_CD_CVM;
        $VALUES = (new VerifyingType[] {
            obj, obj1, verifyingtype, MOBILE_DEVICE, SIGNATURE, ONLINE_PIN
        });
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 368
    //                   0 256
    //                   1 346;
           goto _L4 _L5 _L3
_L5:
        continue; /* Loop/switch isn't completed */
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 392
    //                   0 346
    //                   1 256;
           goto _L4 _L3 _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
    }
}
