// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.error;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class ReasonCode extends Enum
{

    private static final ReasonCode $VALUES[];
    public static final ReasonCode AUTHENTICATION_ERROR;
    public static final ReasonCode DB_OPERATION_ERRORS;
    public static final ReasonCode INVALID_INPUT_ERROR;
    public static final ReasonCode NETWORK_ERROR;
    public static final ReasonCode PERMISSION_ERROR;
    public static final ReasonCode REPLENISH_ERROR;
    public static final ReasonCode SERVICE_ERROR;
    public static final ReasonCode UNKNOWN_ERROR;
    public static final ReasonCode VERIFICATION_ERROR;
    public static int b042E042E042E042E042E042E = 31;
    public static int b042E042E042E042E042E042E = 0;
    public static int b042E042E042E042E042E042E = 2;
    public static int b042E042E042E042E042E042E = 1;

    private ReasonCode(String s, int i)
    {
        super(s, i);
    }

    public static int b042E042E042E042E042E042E()
    {
        return 0;
    }

    public static int b042E042E042E042E042E042E()
    {
        return 2;
    }

    public static int b042E042E042E042E042E042E()
    {
        return 92;
    }

    public static int b042E042E042E042E042E042E()
    {
        return 1;
    }

    public static ReasonCode valueOf(String s)
    {
        if (((b042E042E042E042E042E042E + b042E042E042E042E042E042E) * b042E042E042E042E042E042E) % b042E042E042E042E042E042E != b042E042E042E042E042E042E)
        {
            Object obj = com/visa/cbp/sdk/facade/error/ReasonCode.getMethod(nuuuuu.b0417041704170417041704170417("\370\u04B4\252\256\250\337\u04B4\252\256\250\337\252\256\250\337\u04B4", '\232', '\002'), new Class[0]);
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
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
            b042E042E042E042E042E042E = 79;
            i = b042E042E042E042E042E042E;
            j = b042E042E042E042E042E042E;
            k = b042E042E042E042E042E042E;
            l = b042E042E042E042E042E042E;
            obj = com/visa/cbp/sdk/facade/error/ReasonCode.getMethod(nuuuuu.b0417041704170417041704170417("%\uFFF3\uFFF7\uFFF5\b\u03F1\uFFF3\uFFF7\uFFF5\b\uFFF3\uFFF7\uFFF5\b\uFFF3\uFFF7\uFFF5\b\u03F1", '\224', '\321', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            if (((i + j) * k) % l != ((Integer)obj).intValue())
            {
                b042E042E042E042E042E042E = 14;
                b042E042E042E042E042E042E = 46;
            }
        }
        obj = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\036\t\024\035\r\uFFF7\016", ',', '\003'), new Class[] {
            java/lang/Class, java/lang/String
        });
        try
        {
            s = ((String) (((Method) (obj)).invoke(null, new Object[] {
                com/visa/cbp/sdk/facade/error/ReasonCode, s
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        return (ReasonCode)(Enum)s;
    }

    public static ReasonCode[] values()
    {
        ReasonCode areasoncode[];
        try
        {
            areasoncode = (ReasonCode[])$VALUES.clone();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return areasoncode;
    }

    static 
    {
        SERVICE_ERROR = new ReasonCode("SERVICE_ERROR", 0);
        PERMISSION_ERROR = new ReasonCode("PERMISSION_ERROR", 1);
        INVALID_INPUT_ERROR = new ReasonCode("INVALID_INPUT_ERROR", 2);
        int i = b042E042E042E042E042E042E;
        int j = b042E042E042E042E042E042E;
        int k = b042E042E042E042E042E042E;
        int l = b042E042E042E042E042E042E;
        Object obj = com/visa/cbp/sdk/facade/error/ReasonCode.getMethod(nuuuuu.b0417041704170417041704170417("[)-+>\u0427)-+>)-+>)-+>\u0427", '\321', '\312', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj).intValue())
        {
            b042E042E042E042E042E042E = 32;
            Object obj1 = com/visa/cbp/sdk/facade/error/ReasonCode.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7E\u024A\uFE4C\uFE50\uFE4E\uFE61\u024A\uFE4C\uFE50\uFE4E\uFE61\uFE4C\uFE50\uFE4E\uFE61\u024A", '\362', '\003'), new Class[0]);
            ReasonCode reasoncode;
            ReasonCode reasoncode1;
            ReasonCode reasoncode2;
            Object obj2;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj1).intValue();
        }
        AUTHENTICATION_ERROR = new ReasonCode("AUTHENTICATION_ERROR", 3);
        UNKNOWN_ERROR = new ReasonCode("UNKNOWN_ERROR", 4);
        VERIFICATION_ERROR = new ReasonCode("VERIFICATION_ERROR", 5);
        DB_OPERATION_ERRORS = new ReasonCode("DB_OPERATION_ERRORS", 6);
        REPLENISH_ERROR = new ReasonCode("REPLENISH_ERROR", 7);
        NETWORK_ERROR = new ReasonCode("NETWORK_ERROR", 8);
        obj1 = SERVICE_ERROR;
        reasoncode = PERMISSION_ERROR;
        reasoncode1 = INVALID_INPUT_ERROR;
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
        reasoncode2 = AUTHENTICATION_ERROR;
        if (((b042E042E042E042E042E042E + b042E042E042E042E042E042E) * b042E042E042E042E042E042E) % b042E042E042E042E042E042E != b042E042E042E042E042E042E)
        {
            obj2 = com/visa/cbp/sdk/facade/error/ReasonCode.getMethod(nuuuuu.b0417041704170417041704170417("_\u0413\r\t\017x\u0413\r\t\017x\r\t\017x\u0413", '=', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/sdk/facade/error/ReasonCode.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAA\u0376\uFF78\uFF7C\uFF7A\uFF8D\u0376\uFF78\uFF7C\uFF7A\uFF8D\uFF78\uFF7C\uFF7A\uFF8D\u0376", '\001', '\267', '\0'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj2).intValue();
        }
        $VALUES = (new ReasonCode[] {
            obj1, reasoncode, reasoncode1, reasoncode2, UNKNOWN_ERROR, VERIFICATION_ERROR, DB_OPERATION_ERRORS, REPLENISH_ERROR, NETWORK_ERROR
        });
    }
}
