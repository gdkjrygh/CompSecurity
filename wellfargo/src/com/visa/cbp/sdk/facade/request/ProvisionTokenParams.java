// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.request;

import com.visa.cbp.external.common.ConsumerInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class ProvisionTokenParams
{

    public static int b043C043C043C043C043C043C = 0;
    public static int b043C043C043C043C043C043C = 91;
    public static int b043C043C043C043C043C043C = 2;
    public static int b043C043C043C043C043C043C = 1;
    private String cardArtUri;
    private String cardRefId;
    private ConsumerInfo consumerInfo;
    private String encPaymentInstrument;

    public ProvisionTokenParams(String s, String s1)
    {
        if (((b043C043C043C043C043C043C + b043C043C043C043C043C043C) * b043C043C043C043C043C043C) % b043C043C043C043C043C043C != b043C043C043C043C043C043C)
        {
            b043C043C043C043C043C043C = 0;
            Object obj = com/visa/cbp/sdk/facade/request/ProvisionTokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\u01EE\u05C8\u01BC\u01C0\u01BF\u01CF\u01BC\u01C0\u01BF\u01CF\u01BC\u01C0\u01BF\u01CF\u01BC\u01C0\u01BF\u01CF\u05C8", '\204', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj).intValue();
        }
        this(null, s, s1, null, null, null, null, null);
    }

    public ProvisionTokenParams(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7)
    {
        encPaymentInstrument = s;
        cardRefId = s1;
        cardArtUri = s2;
        s = com/visa/cbp/sdk/facade/request/ProvisionTokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\u0119\u04F3\347\353\352\372\347\353\352\372\347\353\352\372\347\353\352\372\u04F3", '\256', '\t', '\003'), new Class[0]);
        int i;
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        i = ((Integer)s).intValue();
        switch ((i * (b043C043C043C043C043C043C + i)) % b043C043C043C043C043C043C)
        {
        default:
            b043C043C043C043C043C043C = 12;
            s = com/visa/cbp/sdk/facade/request/ProvisionTokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\331\u04B3\247\253\252\272\247\253\252\272\247\253\252\272\247\253\252\272\u04B3", ':', '=', '\003'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)s).intValue();
            // fall through

        case 0: // '\0'
            consumerInfo = new ConsumerInfo();
            s = consumerInfo;
            s1 = com/visa/cbp/external/common/ConsumerInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u01EB\u01DD\u01EC\u01C4\u01E7\u01DB\u01D9\u01E4\u01DD", '\274', '\001'), new Class[] {
                java/lang/String
            });
            break;
        }
        try
        {
            s1.invoke(s, new Object[] {
                s7
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = consumerInfo;
        s1 = com/visa/cbp/external/common/ConsumerInfo.getMethod(nuuuuu.b0417041704170417041704170417("^P_;SZYP", '\026', '+', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            s1.invoke(s, new Object[] {
                s6
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = consumerInfo;
        s1 = com/visa/cbp/external/common/ConsumerInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB5\uFEA7\uFEB6\uFE88\uFEAB\uFEB4\uFEB5\uFEB6\uFE90\uFEA3\uFEAF\uFEA7", '\322', '\354', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            s1.invoke(s, new Object[] {
                s3
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = consumerInfo;
        s1 = com/visa/cbp/external/common/ConsumerInfo.getMethod(nuuuuu.b0417041704170417041704170417("\331\317\336\346\313\331\336\344\313\307\317", '\252', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            s1.invoke(s, new Object[] {
                s4
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = consumerInfo;
        s1 = com/visa/cbp/external/common/ConsumerInfo.getMethod(nuuuuu.b0417041704170417041704170417("ykzKsgor", '\003', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            s1.invoke(s, new Object[] {
                s5
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
    }

    public static int b043C043C043C043C043C043C()
    {
        return 0;
    }

    public static int b043C043C043C043C043C043C()
    {
        return 90;
    }

    public static int b043C043C043C043C043C043C()
    {
        return 2;
    }

    public static int b043C043C043C043C043C043C()
    {
        return 1;
    }

    public String getCardArtUri()
    {
        return cardArtUri;
    }

    public String getCardRefId()
    {
        int i = b043C043C043C043C043C043C;
        int j = b043C043C043C043C043C043C;
        int k = b043C043C043C043C043C043C;
        switch ((k * (b043C043C043C043C043C043C + k)) % b043C043C043C043C043C043C)
        {
        default:
            b043C043C043C043C043C043C = 40;
            b043C043C043C043C043C043C = 24;
            // fall through

        case 0: // '\0'
            switch ((i * (j + i)) % b043C043C043C043C043C043C)
            {
            default:
                b043C043C043C043C043C043C = 43;
                b043C043C043C043C043C043C = 7;
                break;

            case 0: // '\0'
                break;
            }
            break;
        }
        String s;
        try
        {
            s = cardRefId;
        }
        catch (Exception exception)
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
            throw exception;
        }
        return s;
    }

    public ConsumerInfo getConsumerInfo()
    {
        ConsumerInfo consumerinfo = consumerInfo;
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
        if (((b043C043C043C043C043C043C + b043C043C043C043C043C043C) * b043C043C043C043C043C043C) % b043C043C043C043C043C043C != b043C043C043C043C043C043C)
        {
            b043C043C043C043C043C043C = 59;
            b043C043C043C043C043C043C = 71;
            int i = b043C043C043C043C043C043C;
            switch ((i * (b043C043C043C043C043C043C + i)) % b043C043C043C043C043C043C)
            {
            default:
                b043C043C043C043C043C043C = 75;
                b043C043C043C043C043C043C = 79;
                break;

            case 0: // '\0'
                break;
            }
        }
        return consumerinfo;
    }

    public String getEncPaymentInstrument()
    {
        String s = encPaymentInstrument;
        int i = b043C043C043C043C043C043C;
        int k = b043C043C043C043C043C043C;
        int l = b043C043C043C043C043C043C;
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
        switch ((i * (k + i)) % l)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/request/ProvisionTokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4E\u0328\uFF1C\uFF20\uFF1F\uFF2F\uFF1C\uFF20\uFF1F\uFF2F\uFF1C\uFF20\uFF1F\uFF2F\uFF1C\uFF20\uFF1F\uFF2F\u0328", '\212', '\003'), new Class[0]);
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj).intValue();
            b043C043C043C043C043C043C = 78;
            j = b043C043C043C043C043C043C;
            obj = com/visa/cbp/sdk/facade/request/ProvisionTokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\311\u04A3\u04A3\u04A3\u04A3\u04A3\227\233\232\252", ';', '\242', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            if (((((Integer)obj).intValue() + j) * b043C043C043C043C043C043C) % b043C043C043C043C043C043C != b043C043C043C043C043C043C)
            {
                b043C043C043C043C043C043C = 90;
                Object obj1 = com/visa/cbp/sdk/facade/request/ProvisionTokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\uFF64\u033E\uFF32\uFF36\uFF35\uFF45\uFF32\uFF36\uFF35\uFF45\uFF32\uFF36\uFF35\uFF45\uFF32\uFF36\uFF35\uFF45\u033E", '\351', '\025', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b043C043C043C043C043C043C = ((Integer)obj1).intValue();
            }
            // fall through

        case 0: // '\0'
            return s;
        }
    }
}
