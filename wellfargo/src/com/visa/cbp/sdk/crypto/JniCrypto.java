// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.crypto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import rrrrrr.grgggr;
import uuuuuu.nuuuuu;

public class JniCrypto
    implements grgggr
{

    public static int b044B044B044B044B044B044B = 46;
    public static int b044B044B044B044B044B044B = 0;
    public static int b044B044B044B044B044B044B = 2;
    public static int b044B044B044B044B044B044B = 1;

    public JniCrypto()
    {
        Object obj;
        int i;
        int k;
        int i1;
        int k1;
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b044B044B044B044B044B044B;
        k = b044B044B044B044B044B044B;
        i1 = b044B044B044B044B044B044B;
        obj = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\u0162\u0130\u0134\u0133\u0131\u0130\u0134\u0133\u0131\u0130\u0134\u0133\u0131\u0130\u0134\u0133\u0131\u0531\u0130\u0134\u0133\u0131", '7', '\311', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        k1 = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\u0299\u0668\u0267\u026B\u026A\u0268\u0267\u026B\u026A\u0268\u0267\u026B\u026A\u0268\u0668\u0267\u026B\u026A\u0268", '\275', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((i1 * (i + k)) % k1 != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\217\u045E\u045E\u045E\u045E]a`^]a`^", '-', '\005'), new Class[0]);
            int j;
            int l;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            j = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7B\u034A\u034A\u034A\u034A\uFF49\uFF4D\uFF4C\uFF4A\uFF49\uFF4D\uFF4C\uFF4A", '\347', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            l = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\245\367\363\364\366\u04F6\u04F6\u04F6\367\363\364\366\367\363\364\366", '\307', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            j1 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\217\u045E\u045E\u045E\u045E]a`^]a`^", '-', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception5)
            {
                throw invocationtargetexception5.getCause();
            }
            if ((((Integer)obj1).intValue() * (l + j1)) % b044B044B044B044B044B044B != b044B044B044B044B044B044B)
            {
                b044B044B044B044B044B044B = 99;
                Object obj2 = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("K\u041A\u041A\u041A\u041A\031\035\034\032\031\035\034\032", '\027', '\0'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception6)
                {
                    throw invocationtargetexception6.getCause();
                }
                b044B044B044B044B044B044B = ((Integer)obj2).intValue();
            }
            b044B044B044B044B044B044B = j;
            b044B044B044B044B044B044B = 77;
        }
    }

    public static int b043104310431043104310431()
    {
        return 2;
    }

    public static int b043104310431043104310431()
    {
        return 1;
    }

    public static int b043104310431043104310431()
    {
        return 0;
    }

    public static int b043104310431043104310431()
    {
        return 53;
    }

    public native byte[] ISO9797MAC(byte abyte0[], byte abyte1[], byte abyte2[]);

    public void b044004400440044004400440()
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    int i = b044B044B044B044B044B044B;
                    Object obj = com/visa/cbp/sdk/crypto/JniCrypto.getMethod(nuuuuu.b0417041704170417041704170417("\uFF32\uFF00\uFF04\uFF03\uFF01\u0301\u0301\u0301\uFF00\uFF04\uFF03\uFF01\uFF00\uFF04\uFF03\uFF01", '\364', '<', '\0'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        throw invocationtargetexception.getCause();
                    }
                    switch (((((Integer)obj).intValue() + i) * i) % b044B044B044B044B044B044B)
                    {
                    default:
                        b044B044B044B044B044B044B = 78;
                        b044B044B044B044B044B044B = 76;
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
    }

    public native byte[] decryptData(byte abyte0[], byte abyte1[]);

    public native byte[] encryptData(byte abyte0[], byte abyte1[]);

    public native byte[] generateDek();

    public native Object[] onboardLuk(byte abyte0[]);

    public native byte[] tripleDES(byte abyte0[], byte abyte1[], byte abyte2[]);

    static 
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
