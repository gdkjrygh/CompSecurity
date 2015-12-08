// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.error;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.error:
//            ReasonCode

public class CbpError
{

    public static int b042204220422042204220422 = 2;
    public static int b042204220422042204220422 = 0;
    public static int b042204220422042204220422 = 1;
    public static int b042204220422042204220422 = 39;
    String correlationId;
    int errorCode;
    String errorMessage;
    ReasonCode reasonCode;

    public CbpError(int i, String s, ReasonCode reasoncode, String s1)
    {
        errorCode = 0;
        errorMessage = "";
        correlationId = "";
        reasonCode = ReasonCode.UNKNOWN_ERROR;
        errorCode = i;
        errorMessage = s;
        i = b042204220422042204220422;
        switch ((i * (b042204220422042204220422 + i)) % b042204220422042204220422)
        {
        default:
            s = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDE\u039E\u039E\u039E\uFFAC\uFFB0\uFFAE\uFFAE\uFFAC\uFFB0\uFFAE\uFFAE\u039E", 'B', '\003'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042204220422042204220422 = ((Integer)s).intValue();
            s = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7C\u023C\u023C\u023C\uFE4A\uFE4E\uFE4C\uFE4C\uFE4A\uFE4E\uFE4C\uFE4C\u023C", '\363', '\003'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042204220422042204220422 = ((Integer)s).intValue();
            break;

        case 0: // '\0'
            break;
        }
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
        reasonCode = reasoncode;
        if (((b042204220422042204220422 + b042204220422042204220422) * b042204220422042204220422) % b042204220422042204220422 != b042204220422042204220422)
        {
            b042204220422042204220422 = 34;
label1:
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
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label1;
                }
            } while (true);
            s = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\006\u0446\u0446\u0446TPVVTPVV\u0446", 'd', '\002'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042204220422042204220422 = ((Integer)s).intValue();
        }
        correlationId = s1;
    }

    public static int b042204220422042204220422()
    {
        return 1;
    }

    public static int b042204220422042204220422()
    {
        return 2;
    }

    public static int b042204220422042204220422()
    {
        return 99;
    }

    public String getCorrelationId()
    {
        String s;
        InvocationTargetException invocationtargetexception;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            s = correlationId;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\207\u0447\u0447\u0447UYWWUYWW\u0447", '%', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        j = b042204220422042204220422;
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("c\u0423\u0423\u042315331533\u0423", '\375', '\374', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        l = b042204220422042204220422;
        i1 = b042204220422042204220422;
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u0200\u05C0\u05C0\u05C0\u01CE\u01D2\u01D0\u01D0\u01CE\u01D2\u01D0\u01D0\u05C0", '\317', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        InvocationTargetException invocationtargetexception1;
        try
        {
            b042204220422042204220422 = i;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA9\u0369\u0369\u0369\uFF77\uFF7B\uFF79\uFF79\uFF77\uFF7B\uFF79\uFF79\u0369", '\271', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042204220422042204220422 = i;
        return s;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        InvocationTargetException invocationtargetexception2;
        invocationtargetexception2;
        throw invocationtargetexception2.getCause();
    }

    public int getErrorCode()
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            i = errorCode;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        j = b042204220422042204220422;
        k = b042204220422042204220422;
        l = b042204220422042204220422;
        i1 = b042204220422042204220422;
        j1 = b042204220422042204220422;
        k1 = b042204220422042204220422;
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\316\234\240\236\236\u048E\u048E\234\240\236\236\234\240\236\236\u048E", 'W', '\303', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((((Integer)obj).intValue() + k1) * b042204220422042204220422) % b042204220422042204220422 != b042204220422042204220422)
        {
            Object obj1 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\274\u047C\u047C\u047C\212\216\214\214\212\216\214\214\u047C", '-', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042204220422042204220422 = ((Integer)obj1).intValue();
            b042204220422042204220422 = 56;
        }
        if (((j + k) * l) % i1 != j1)
        {
            obj1 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\226\u0456\u0456\u0456dhffdhff\u0456", '\262', '~', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042204220422042204220422 = ((Integer)obj1).intValue();
            b042204220422042204220422 = 15;
        }
        return i;
    }

    public String getErrorMessage()
    {
        String s = errorMessage;
        int i = b042204220422042204220422;
        int k = b042204220422042204220422;
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
        switch ((i * (k + i)) % b042204220422042204220422)
        {
        default:
            int j = b042204220422042204220422;
            int l = b042204220422042204220422;
            int i1 = b042204220422042204220422;
            Object obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u0190\u0550\u015E\u0162\u0160\u0160\u0550\u015E\u0162\u0160\u0160\u015E\u0162\u0160\u0160\u0550", '\227', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            if ((i1 * (j + l)) % ((Integer)obj).intValue() != b042204220422042204220422)
            {
                b042204220422042204220422 = 24;
                Object obj1 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u0102\u04C2\u04C2\u04C2\320\324\322\322\320\324\322\322\u04C2", '\240', '\005'), new Class[0]);
                InvocationTargetException invocationtargetexception1;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042204220422042204220422 = ((Integer)obj1).intValue();
            }
            b042204220422042204220422 = 6;
            obj1 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\362\u04B2\u04B2\u04B2\240\244\242\242\240\244\242\242\u04B2", '\220', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042204220422042204220422 = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            return s;
        }
    }

    public ReasonCode getReasonCode()
    {
        int i = b042204220422042204220422;
        switch ((i * (b042204220422042204220422 + i)) % b042204220422042204220422)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\334\u049C\u049C\u049C\252\256\254\254\252\256\254\254\u049C", '\362', 'x', '\002'), new Class[0]);
            int j;
            int k;
            int l;
            int i1;
            int j1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042204220422042204220422 = ((Integer)obj).intValue();
            b042204220422042204220422 = 99;
            // fall through

        case 0: // '\0'
            obj = reasonCode;
            j = b042204220422042204220422;
            k = b042204220422042204220422;
            l = b042204220422042204220422;
            i1 = b042204220422042204220422;
            j1 = b042204220422042204220422;
            break;
        }
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
        if (((j + k) * l) % i1 != j1)
        {
            b042204220422042204220422 = 38;
            b042204220422042204220422 = 45;
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
        return ((ReasonCode) (obj));
    }
}
