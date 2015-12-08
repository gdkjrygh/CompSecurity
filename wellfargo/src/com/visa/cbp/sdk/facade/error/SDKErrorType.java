// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.error;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class SDKErrorType extends Enum
{

    private static final SDKErrorType $VALUES[];
    public static final SDKErrorType ACCESS_WIFI_STATE;
    public static final SDKErrorType BLUETOOTH;
    public static final SDKErrorType CANNOT_STORE_DEVICE_ID;
    public static final SDKErrorType CVM_VERIFICATION_REQUIRED;
    public static final SDKErrorType DEVICE_REGISTRATION_EXPIRED;
    public static final SDKErrorType ENCRYPTED_PAYMENT_INSTRUMENT_OR_PAN_REF_ID_IS_MISSING;
    public static final SDKErrorType ERROR_ON_PERSISTENCE;
    public static final SDKErrorType EXPIRED_SERVICE;
    public static final SDKErrorType INTERNET_PERMISSION;
    public static final SDKErrorType INVALID_INPUT_FIELDS;
    public static final SDKErrorType INVALID_INPUT_FOR_LCM_FORMAT_REFERENCEID;
    public static final SDKErrorType INVALID_INPUT_FOR_LCM_FORMAT_REQUEST;
    public static final SDKErrorType INVALID_INPUT_FOR_LCM_FORMAT_REQUESTORID;
    public static final SDKErrorType INVALID_INPUT_FOR_SPECIFIC_FIELD;
    public static final SDKErrorType NETWORK_NOT_AVAILABLE;
    public static final SDKErrorType NFC_NOT_SUPPORTED;
    public static final SDKErrorType READ_PHONE_STATE;
    public static final SDKErrorType RECEIVE_BOOT_COMPLETED;
    public static final SDKErrorType SQL_CONSTRAINT_EXCEPTION;
    public static final SDKErrorType TOKEN_KEY_INVALID;
    public static final SDKErrorType UNKNOWN_ERROR;
    public static int b042004200420042004200420 = 0;
    public static int b042004200420042004200420 = 2;
    public static int b042004200420042004200420 = 1;
    public static int b042004200420042004200420 = 85;
    private final int code;
    private final String message;

    private SDKErrorType(String s, int i, String s1, int j)
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\024\r\026\017\034\020", ',', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        InvocationTargetException invocationtargetexception;
        invocationtargetexception;
        try
        {
            throw invocationtargetexception.getCause();
        }
        catch (Exception exception)
        {
            b042004200420042004200420 = 90;
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
        i = 2;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b042004200420042004200420 = 83;
        }
        try
        {
            message = s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        code = j;
        return;
    }

    public static int b042004200420042004200420()
    {
        return 2;
    }

    public static int b042004200420042004200420()
    {
        return 1;
    }

    public static int b042004200420042004200420()
    {
        return 21;
    }

    public static int b042004200420042004200420()
    {
        return 0;
    }

    public static SDKErrorType valueOf(String s)
    {
        Method method = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\uFE81\uFE6C\uFE77\uFE80\uFE70\uFE5A\uFE71", '\247', '\004'), new Class[] {
            java/lang/Class, java/lang/String
        });
        s = ((String) (method.invoke(null, new Object[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, s
        })));
        s = (Enum)s;
        int i = b042004200420042004200420;
        int k = b042004200420042004200420;
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
        switch ((i * (k + i)) % b042004200420042004200420)
        {
        default:
            b042004200420042004200420 = 73;
            int j = b042004200420042004200420;
            switch ((j * (b042004200420042004200420 + j)) % b042004200420042004200420)
            {
            default:
                Object obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE1\uFFAF\uFFB3\uFFB1\uFFAF\u039F\u039F\u039F\uFFAF\uFFB3\uFFB1\uFFAF\u039F", '&', '[', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042004200420042004200420 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\u022E\u01FC\u0200\u01FE\u01FC\u05EC\u05EC\u05EC\u01FC\u0200\u01FE\u01FC\u05EC", '\366', '\326', '\003'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042004200420042004200420 = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
                obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFD\uFFCB\uFFCF\uFFCD\uFFCB\u03BB\u03BB\u03BB\uFFCB\uFFCF\uFFCD\uFFCB\u03BB", 'e', '\0'), new Class[0]);
                break;
            }
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042004200420042004200420 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            s = (SDKErrorType)s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
        s;
        try
        {
            throw s.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static SDKErrorType[] values()
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
        Object obj = $VALUES.clone();
        Object obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\373\311\315\313\311\u04B9\u04B9\u04B9\311\315\313\311\u04B9", '\231', '\005'), new Class[0]);
        SDKErrorType asdkerrortype[];
        int i;
        int j;
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        i = ((Integer)obj1).intValue();
        j = b042004200420042004200420;
        obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE4\uFFB2\uFFB6\uFFB4\uFFB2\uFFB2\uFFB6\uFFB4\uFFB2\u03A2\u03A2\uFFB2\uFFB6\uFFB4\uFFB2\u03A2", '?', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        switch (((j + i) * i) % ((Integer)obj1).intValue())
        {
        default:
            b042004200420042004200420 = 96;
            // fall through

        case 0: // '\0'
            asdkerrortype = (SDKErrorType[])obj;
            break;
        }
        i = b042004200420042004200420;
        obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\u0148\u0116\u011A\u0118\u0116\u0506\u0116\u011A\u0118\u0116\u0506\u0116\u011A\u0118\u0116\u0506", '\013', '\361', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        switch (((((Integer)obj1).intValue() + i) * i) % b042004200420042004200420)
        {
        default:
            b042004200420042004200420 = 27;
            Object obj2 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417(")\uFFF7\uFFFB\uFFF9\uFFF7\u03E7\u03E7\u03E7\uFFF7\uFFFB\uFFF9\uFFF7\u03E7", '\023', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042004200420042004200420 = ((Integer)obj2).intValue();
            break;

        case 0: // '\0'
            break;
        }
label1:
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
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        return asdkerrortype;
    }

    public int getCode()
    {
        int i;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            i = b042004200420042004200420;
            k = b042004200420042004200420;
            l = b042004200420042004200420;
            i1 = b042004200420042004200420;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        try
        {
            j1 = b042004200420042004200420;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        i = b042004200420042004200420;
        switch ((i * (b042004200420042004200420 + i)) % b042004200420042004200420)
        {
        default:
            b042004200420042004200420 = 43;
            Object obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\u0186\u0154\u0158\u0156\u0154\u0544\u0544\u0544\u0154\u0158\u0156\u0154\u0544", '\222', '\001'), new Class[0]);
            Object obj1;
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042004200420042004200420 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\u0124\362\366\364\362\u04E2\u04E2\u04E2\362\366\364\362\u04E2", 'O', 's', '\003'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b042004200420042004200420 = j;
        obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\311\227\233\231\227\u0487\u0487\u0487\227\233\231\227\u0487", '{', '\342', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b042004200420042004200420 = j;
        j = code;
        return j;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
    }

    public String getMessage()
    {
        Object obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\263\261\300\231\261\277\277\255\263\261", ']', '\251', '\001'), new Class[] {
            java/lang/String
        });
        obj = ((Method) (obj)).invoke(this, new Object[] {
            ""
        });
        obj = (String)obj;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            i = b042004200420042004200420;
            j = b042004200420042004200420;
            k = b042004200420042004200420;
            l = b042004200420042004200420;
            i1 = b042004200420042004200420;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj2 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\000\uFFCE\uFFD2\uFFD0\uFFCE\u03BE\u03BE\u03BE\uFFCE\uFFD2\uFFD0\uFFCE\u03BE", '1', '\003'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j1 = ((Integer)obj2).intValue();
        obj2 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("vDHFD\u0434DHFD\u0434DHFD\u0434", '\024', '\005'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        k1 = ((Integer)obj2).intValue();
        obj2 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\036\uFFEC\uFFF0\uFFEE\uFFEC\u03DC\u03DC\u03DC\uFFEC\uFFF0\uFFEE\uFFEC\u03DC", 'D', '\0'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        if ((((Integer)obj2).intValue() * (j1 + k1)) % b042004200420042004200420 != b042004200420042004200420)
        {
            b042004200420042004200420 = 46;
            Object obj3 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\u0193\u0161\u0165\u0163\u0161\u0551\u0551\u0551\u0161\u0165\u0163\u0161\u0551", '2', '\377', '\003'), new Class[0]);
            Object obj1;
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042004200420042004200420 = ((Integer)obj3).intValue();
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        obj3 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4C\uFF1A\uFF1E\uFF1C\uFF1A\u030A\u030A\u030A\uFF1A\uFF1E\uFF1C\uFF1A\u030A", '\213', '\003'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        i = ((Integer)obj3).intValue();
        b042004200420042004200420 = i;
        try
        {
            b042004200420042004200420 = 24;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        return ((String) (obj));
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
    }

    public String getMessage(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
