// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import com.visa.cbp.external.common.Status;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import rrrrrr.lnlnnn;
import uuuuuu.nuuuuu;

public class TokenParams
{

    public static int b043C043C043C043C043C043C = 2;
    public static int b043C043C043C043C043C043C = 0;
    public static int b043C043C043C043C043C043C = 1;
    public static int b043C043C043C043C043C043C = 66;
    public int atc;
    public lnlnnn lukStatus;
    public int sequenceCounter;
    public String tokenKey;
    public String tokenRefId;
    public String tokenRequestorId;
    public Status tokenStatus;
    private int transactionCounter;

    public TokenParams()
    {
        int i;
        int j;
        int k;
        int l;
        try
        {
            super();
            tokenStatus = new Status();
            lukStatus = lnlnnn.b041304130413041304130413;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b043C043C043C043C043C043C;
        j = b043C043C043C043C043C043C;
        k = b043C043C043C043C043C043C;
        l = b043C043C043C043C043C043C;
        switch ((l * (b043C043C043C043C043C043C + l)) % b043C043C043C043C043C043C)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\u0124\u04FE\u04FE\362\366\365\u0105\362\366\365\u0105\362\366\365\u0105\362\366\365\u0105", 'a', '\001'), new Class[0]);
            Exception exception1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("'\u0401\u0401\uFFF5\uFFF9\uFFF8\b\uFFF5\uFFF9\uFFF8\b\uFFF5\uFFF9\uFFF8\b\uFFF5\uFFF9\uFFF8\b", '\032', '!', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((j + i) * k) % b043C043C043C043C043C043C != b043C043C043C043C043C043C)
        {
            b043C043C043C043C043C043C = 50;
            b043C043C043C043C043C043C = 27;
        }
        try
        {
            sequenceCounter = 0;
            atc = 0;
            transactionCounter = 0;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            throw exception1;
        }
    }

    public static int b043C043C043C043C043C043C()
    {
        return 2;
    }

    public static int b043C043C043C043C043C043C()
    {
        return 32;
    }

    public int getTransactionCounter()
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
        if (((b043C043C043C043C043C043C + b043C043C043C043C043C043C) * b043C043C043C043C043C043C) % b043C043C043C043C043C043C != b043C043C043C043C043C043C)
        {
label1:
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
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            b043C043C043C043C043C043C = 19;
            Object obj = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\r\u0453\u0453_[\\,_[\\,_[\\,_[\\,", 'o', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj).intValue();
            if (((b043C043C043C043C043C043C + b043C043C043C043C043C043C) * b043C043C043C043C043C043C) % b043C043C043C043C043C043C != b043C043C043C043C043C043C)
            {
                Object obj1 = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("v\u0450\u0450DHGWDHGWDHGWDHGW", 'h', '|', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b043C043C043C043C043C043C = ((Integer)obj1).intValue();
                b043C043C043C043C043C043C = 41;
            }
        }
        return transactionCounter;
    }

    public void setTransactionCounter(int i)
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
        int j = b043C043C043C043C043C043C;
        int k = b043C043C043C043C043C043C;
        Object obj = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\uFF96\u0370\u0370\uFF64\uFF68\uFF67\uFF77\uFF64\uFF68\uFF67\uFF77\uFF64\uFF68\uFF67\uFF77\uFF64\uFF68\uFF67\uFF77", '\314', '\0'), new Class[0]);
        int l;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        l = ((Integer)obj).intValue();
        switch ((l * (b043C043C043C043C043C043C + l)) % b043C043C043C043C043C043C)
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\uFF64\u033E\u033E\uFF32\uFF36\uFF35\uFF45\uFF32\uFF36\uFF35\uFF45\uFF32\uFF36\uFF35\uFF45\uFF32\uFF36\uFF35\uFF45", '\376', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            int i1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\u015F\u0539\u0539\u012D\u0131\u0130\u0140\u012D\u0131\u0130\u0140\u012D\u0131\u0130\u0140\u012D\u0131\u0130\u0140", '\375', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            i1 = b043C043C043C043C043C043C;
            obj1 = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\u017F\u014D\u0151\u0150\u0160\u0559\u014D\u0151\u0150\u0160\u014D\u0151\u0150\u0160\u014D\u0151\u0150\u0160\u014D\u0151\u0150\u0160", '\177', '\236', '\003'), new Class[0]);
            break;
        }
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((i1 * (j + k)) % ((Integer)obj1).intValue() != b043C043C043C043C043C043C)
        {
            obj1 = com/visa/cbp/sdk/facade/data/TokenParams.getMethod(nuuuuu.b0417041704170417041704170417("\322\u04AC\u04AC\240\244\243\263\240\244\243\263\240\244\243\263\240\244\243\263", '\344', 't', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043C043C043C043C043C043C = ((Integer)obj1).intValue();
            b043C043C043C043C043C043C = 77;
        }
        transactionCounter = i;
    }
}
