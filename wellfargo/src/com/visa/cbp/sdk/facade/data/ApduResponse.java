// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import com.visa.cbp.sdk.facade.error.CbpError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class ApduResponse
{

    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A = 0;
    public static int b043A043A043A043A043A043A = 1;
    public static int b043A043A043A043A043A043A = 92;
    byte apduData[];
    CbpError cbpError;

    public ApduResponse(byte abyte0[], CbpError cbperror)
    {
        Object obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\360\276\302\301\317\u04C8\u04C8\u04C8\276\302\301\317\u04C8", ' ', 'n', '\003'), new Class[0]);
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        i = ((Integer)obj).intValue();
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u01BD\u018B\u018F\u018E\u019C\u0595\u0595\u0595\u018B\u018F\u018E\u019C\u0595", '\346', 'u', '\003'), new Class[0]);
            int j;
            int k;
            int l;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        obj1 = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0182\u0150\u0154\u0153\u0161\u055A\u055A\u055A\u0150\u0154\u0153\u0161\u055A", 'E', '\333', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        k = b043A043A043A043A043A043A;
        l = b043A043A043A043A043A043A;
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 196
    //                   0 201;
           goto _L1 _L2
_L1:
        b043A043A043A043A043A043A = 94;
_L2:
        apduData = abyte0;
        cbpError = cbperror;
        return;
        abyte0;
        throw abyte0.getCause();
        abyte0;
        throw abyte0;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 2;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 10;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 1;
    }

    public byte[] getApduData()
    {
        Object obj;
        byte abyte0[];
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b043A043A043A043A043A043A;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        try
        {
            j = b043A043A043A043A043A043A;
            k = b043A043A043A043A043A043A;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        l = b043A043A043A043A043A043A;
        i1 = b043A043A043A043A043A043A;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        i = b043A043A043A043A043A043A;
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
            b043A043A043A043A043A043A = 37;
            obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0236\u0204\u0208\u0207\u0215\u060E\u060E\u060E\u0204\u0208\u0207\u0215\u060E", '\352', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("d265C\u043C\u043C\u043C265C\u043C", 'L', 'N', '\001'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043A043A043A043A043A043A = i;
        obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("/\uFFFD\001\000\016\u0407\u0407\u0407\uFFFD\001\000\016\u0407", '\230', '\313', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043A043A043A043A043A043A = i;
        abyte0 = apduData;
        return abyte0;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public CbpError getCbpError()
    {
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            Object obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\210VZYg\u0460\u0460\u0460VZYg\u0460", 'l', '\222', '\001'), new Class[0]);
            Object obj1;
            Object obj2;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\224bfes\u046C\u046C\u046Cbfes\u046C", '2', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj).intValue();
        }
        try
        {
            obj = cbpError;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        i = b043A043A043A043A043A043A;
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
            obj2 = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("q?CBP\u0449\u0449\u0449?CBP\u0449", '\\', 'k', '\001'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj2).intValue();
            b043A043A043A043A043A043A = 85;
            // fall through

        case 0: // '\0'
            return ((CbpError) (obj));
        }
    }

    public void setApduData(byte abyte0[])
    {
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
        Object obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0E\uFEDC\uFEE0\uFEDF\uFEED\u02E6\u02E6\u02E6\uFEDC\uFEE0\uFEDF\uFEED\u02E6", '\322', '\202', '\0'), new Class[0]);
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b043A043A043A043A043A043A;
        obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("J\030\034\033)\u0422\u0422\u0422\030\034\033)\u0422", '\f', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        k = ((Integer)obj).intValue();
        l = b043A043A043A043A043A043A;
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0256\u0224\u0228\u0227\u0235\u062E\u062E\u062E\u0224\u0228\u0227\u0235\u062E", '\372', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0146\u0114\u0118\u0117\u0125\u051E\u051E\u051E\u0114\u0118\u0117\u0125\u051E", 'q', 's', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
        }
        if ((k * (j + i)) % l != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = 61;
            obj1 = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\uFFC1\uFFC5\uFFC4\uFFD2\u03CB\u03CB\u03CB\uFFC1\uFFC5\uFFC4\uFFD2\u03CB", 'o', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
        }
        apduData = abyte0;
    }

    public void setCbpError(CbpError cbperror)
    {
        int i = b043A043A043A043A043A043A;
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
            b043A043A043A043A043A043A = 7;
            Object obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD2\uFFA0\uFFA4\uFFA3\uFFB1\u03AA\u03AA\u03AA\uFFA0\uFFA4\uFFA3\uFFB1\u03AA", '0', '\004'), new Class[0]);
            int j;
            int k;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            j = b043A043A043A043A043A043A;
            obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\315\u0495\237\233\234\356\237\233\234\356\u0495\237\233\234\356\u0495", '\257', '\002'), new Class[0]);
            break;
        }
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        k = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\330\212\216\211\373\212\216\211\373\212\216\211\373\u0480\212\216\211\373\u0480", '\272', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        switch ((j * (k + j)) % ((Integer)obj).intValue())
        {
        default:
            b043A043A043A043A043A043A = 91;
            obj = com/visa/cbp/sdk/facade/data/ApduResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0107\325\331\330\346\u04DF\u04DF\u04DF\325\331\330\346\u04DF", '8', 'm', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj).intValue();
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
            // fall through

        case 0: // '\0'
            cbpError = cbperror;
            return;
        }
    }
}
