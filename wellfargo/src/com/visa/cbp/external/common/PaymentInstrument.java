// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.external.common:
//            BillingAddress, ExpirationDate, PaymentType

public class PaymentInstrument
{

    public static int b041404140414041404140414 = 1;
    public static int b041404140414041404140414 = 2;
    public static int b041404140414041404140414 = 0;
    public static int b041404140414041404140414 = 68;
    private String accountNumber;
    private BillingAddress billingAddress;
    private String cvv2;
    private ExpirationDate expirationDate;
    private String last4;
    private String name;
    private String panReferenceID;
    private PaymentType paymentType;

    public PaymentInstrument()
    {
        int i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u01FE\u01CC\u01D0\u01CD\u01D0\u01CC\u01D0\u01CD\u01D0\u05B0\u05B0\u05B0\u01CC\u01D0\u01CD\u01D0", '\316', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            b041404140414041404140414 = 75;
            // fall through

        case 0: // '\0'
            super();
            break;
        }
label0:
        do
        {
            if (((b041404140414041404140414 + b041404140414041404140414) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
            {
                obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\\*.+.*.+.\u040E\u040E\u040E*.+.", '\003', '\003'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b041404140414041404140414 = ((Integer)obj).intValue();
                obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\021\uFFDF\uFFE3\uFFE0\uFFE3\uFFDF\uFFE3\uFFE0\uFFE3\u03C3\u03C3\u03C3\uFFDF\uFFE3\uFFE0\uFFE3", 'Q', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b041404140414041404140414 = ((Integer)obj).intValue();
            }
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
    }

    public static int b041404140414041404140414()
    {
        return 2;
    }

    public static int b041404140414041404140414()
    {
        return 95;
    }

    public static int b041404140414041404140414()
    {
        return 0;
    }

    public static int b041404140414041404140414()
    {
        return 1;
    }

    public String getAccountNumber()
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
        String s = accountNumber;
        int i = b041404140414041404140414;
        int j = b041404140414041404140414;
        int k = b041404140414041404140414;
        int l = b041404140414041404140414;
        Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u01D3\u01A1\u01A5\u01A2\u01A5\u0585\u01A1\u01A5\u01A2\u01A5\u0585\u0585\u01A1\u01A5\u01A2\u01A5", '\261', '\300', '\003'), new Class[0]);
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
            b041404140414041404140414 = 9;
            Object obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\376\314\320\315\320\314\320\315\320\u04B0\u04B0\u04B0\314\320\315\320", '\234', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041404140414041404140414 = ((Integer)obj1).intValue();
        }
        return s;
    }

    public BillingAddress getBillingAddress()
    {
        BillingAddress billingaddress;
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            billingaddress = billingAddress;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
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
            i = b041404140414041404140414;
            j = b041404140414041404140414;
            k = b041404140414041404140414;
            l = b041404140414041404140414;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == b041404140414041404140414)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        b041404140414041404140414 = 93;
        obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFE9A\uFE68\uFE6C\uFE69\uFE6C\uFE68\uFE6C\uFE69\uFE6C\u024C\u024C\u024C\uFE68\uFE6C\uFE69\uFE6C", '\230', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b041404140414041404140414 = i;
        i = b041404140414041404140414;
        j = b041404140414041404140414;
        obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\220^b_b^b_b^b_b\u0442\u0442^b_b", '\246', 'x', '\002'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        switch (((j + i) * i) % ((Integer)obj1).intValue())
        {
        default:
            b041404140414041404140414 = 92;
            obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFF3E\uFF0C\uFF10\uFF0D\uFF10\uFF0C\uFF10\uFF0D\uFF10\u02F0\u02F0\u02F0\uFF0C\uFF10\uFF0D\uFF10", '\222', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        return billingaddress;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }

    public String getCvv2()
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
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        try
        {
            i = b041404140414041404140414;
            j = b041404140414041404140414;
            k = b041404140414041404140414;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 92
    //                   0 177;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_177;
_L1:
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0134\u0102\u0106\u0103\u0106\u0102\u0106\u0103\u0106\u04E6\u04E6\u04E6\u0102\u0106\u0103\u0106", '\345', '\023', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b041404140414041404140414 = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u01FA\u01C8\u01CC\u01C9\u01CC\u01C8\u01CC\u01C9\u01CC\u05AC\u05AC\u05AC\u01C8\u01CC\u01C9\u01CC", '\210', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041404140414041404140414 = i;
        obj = cvv2;
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            b041404140414041404140414 = 51;
            obj2 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u016D\u013B\u013F\u013C\u013F\u013B\u013F\u013C\u013F\u051F\u051F\u051F\u013B\u013F\u013C\u013F", 'Y', '\006'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj2).intValue();
            // fall through

        case 0: // '\0'
            return ((String) (obj));
        }
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public ExpirationDate getExpirationDate()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b041404140414041404140414;
            j = b041404140414041404140414;
            k = b041404140414041404140414;
            l = b041404140414041404140414;
            i1 = b041404140414041404140414;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u015C\u012A\u012E\u012B\u012E\u012A\u012E\u012B\u012E\u050E\u050E\u050E\u012A\u012E\u012B\u012E", '}', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b041404140414041404140414 = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB9\uFF87\uFF8B\uFF88\uFF8B\uFF87\uFF8B\uFF88\uFF8B\u036B\u036B\u036B\uFF87\uFF8B\uFF88\uFF8B", '\251', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041404140414041404140414 = i;
        obj = expirationDate;
        i = b041404140414041404140414;
        j = b041404140414041404140414;
        k = b041404140414041404140414;
        obj2 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("5\003\007\004\007\003\007\004\007\003\007\004\007\u03E7\u03E7\003\007\004\007", '\017', '\004'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        if ((k * (i + j)) % ((Integer)obj2).intValue() != b041404140414041404140414)
        {
            b041404140414041404140414 = 16;
            b041404140414041404140414 = 2;
        }
        return ((ExpirationDate) (obj));
        obj1;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public String getLast4()
    {
        int i = 5;
        do
        {
            do
            {
                i /= 0;
            } while (((b041404140414041404140414 + b041404140414041404140414) * b041404140414041404140414) % b041404140414041404140414 == b041404140414041404140414);
            Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFF3E\uFF0C\uFF10\uFF0D\uFF10\uFF0C\uFF10\uFF0D\uFF10\u02F0\u02F0\u02F0\uFF0C\uFF10\uFF0D\uFF10", 'w', '\255', '\0'), new Class[0]);
            Object obj1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFF30\uFEFE\uFF02\uFEFF\uFF02\uFEFE\uFF02\uFEFF\uFF02\u02E2\u02E2\u02E2\uFEFE\uFF02\uFEFF\uFF02", 'f', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
        } while (true);
        obj1;
        obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0143\u0111\u0115\u0112\u0115\u0111\u0115\u0112\u0115\u04F5\u04F5\u04F5\u0111\u0115\u0112\u0115", 'K', '\006'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        b041404140414041404140414 = ((Integer)obj1).intValue();
        try
        {
            obj1 = last4;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        return ((String) (obj1));
    }

    public String getName()
    {
        if (((b041404140414041404140414 + b041404140414041404140414) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
        {
            b041404140414041404140414 = 95;
            b041404140414041404140414 = 71;
        }
        return name;
    }

    public String getPanReferenceID()
    {
        int i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0287\u0255\u0259\u0256\u0259\u0255\u0259\u0256\u0259\u0639\u0639\u0639\u0255\u0259\u0256\u0259", '\267', '\006'), new Class[0]);
            Exception exception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF1\uFEBF\uFEC3\uFEC0\uFEC3\uFEBF\uFEC3\uFEC0\uFEC3\u02A3\u02A3\u02A3\uFEBF\uFEC3\uFEC0\uFEC3", '\266', '\273', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = panReferenceID;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return ((String) (obj));
    }

    public PaymentType getPaymentType()
    {
        PaymentType paymenttype = paymentType;
        int i = b041404140414041404140414;
        Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFD8C\u013E\uFD5A\uFD5E\uFD5B\uFD5E\uFD5A\uFD5E\uFD5B\uFD5E\u013E\u013E\uFD5A\uFD5E\uFD5B\uFD5E", '\362', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
        {
            Object obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\216\\`]`\\`]`\u0440\u0440\u0440\\`]`", '\030', 'D', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj1).intValue();
            b041404140414041404140414 = 53;
        }
        return paymenttype;
    }

    public void setAccountNumber(String s)
    {
        int i = b041404140414041404140414;
        Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("~\u0430LPMPLPMP\u0430\u0430LPMP", '\024', '\b', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
        {
            b041404140414041404140414 = 86;
            Object obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u01B8\u0186\u018A\u0187\u018A\u0186\u018A\u0187\u018A\u056A\u056A\u056A\u0186\u018A\u0187\u018A", '\253', '\001'), new Class[0]);
            int j;
            int k;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            j = ((Integer)obj1).intValue();
            k = b041404140414041404140414;
            obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFF40\uFF0E\uFF12\uFF0F\uFF12\uFF0E\uFF12\uFF0F\uFF12\u02F2\u02F2\u02F2\uFF0E\uFF12\uFF0F\uFF12", '\237', '\203', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            if ((((Integer)obj1).intValue() * (k + j)) % b041404140414041404140414 != b041404140414041404140414)
            {
                Object obj2 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("'\uFFF5\uFFF9\uFFF6\uFFF9\uFFF5\uFFF9\uFFF6\uFFF9\u03D9\u03D9\u03D9\uFFF5\uFFF9\uFFF6\uFFF9", '6', '\005', '\0'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b041404140414041404140414 = ((Integer)obj2).intValue();
                b041404140414041404140414 = 42;
            }
            b041404140414041404140414 = 52;
        }
        try
        {
            accountNumber = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setBillingAddress(BillingAddress billingaddress)
    {
        int i = 5;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        catch (Exception exception)
        {
            b041404140414041404140414 = 20;
        }
        billingAddress = billingaddress;
    }

    public void setCvv2(String s)
    {
        Object obj;
        int i;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            i = b041404140414041404140414;
            k = b041404140414041404140414;
            l = b041404140414041404140414;
            i1 = b041404140414041404140414;
            j1 = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((i + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        i = b041404140414041404140414;
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u01C1\u0573\u018F\u0193\u0190\u0193\u018F\u0193\u0190\u0193\u0573\u0573\u018F\u0193\u0190\u0193", 'u', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b041404140414041404140414)
        {
        default:
            Object obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\204RVSVRVSV\u0436\u0436\u0436RVSV", '9', '\027', '\002'), new Class[0]);
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)obj1).intValue();
            b041404140414041404140414 = 46;
            // fall through

        case 0: // '\0'
            obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE3\uFFB1\uFFB5\uFFB2\uFFB5\uFFB1\uFFB5\uFFB2\uFFB5\u0395\u0395\u0395\uFFB1\uFFB5\uFFB2\uFFB5", '\177', '\0'), new Class[0]);
            break;
        }
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        b041404140414041404140414 = j;
        b041404140414041404140414 = 30;
        try
        {
            cvv2 = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s;
        throw s.getCause();
    }

    public void setExpirationDate(ExpirationDate expirationdate)
    {
        Object obj;
        int i;
        int j;
        int k;
        try
        {
            i = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (ExpirationDate expirationdate)
        {
            throw expirationdate;
        }
        try
        {
            j = b041404140414041404140414;
            k = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (ExpirationDate expirationdate)
        {
            throw expirationdate;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 85;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_85;
_L1:
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\022@DAD@DAD\u0464\u0464\u0464@DAD", 'p', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041404140414041404140414 = i;
        b041404140414041404140414 = 58;
        expirationDate = expirationdate;
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            expirationdate = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\032\uFFE8\uFFEC\uFFE9\uFFEC\uFFE8\uFFEC\uFFE9\uFFEC\u03CC\u03CC\u03CC\uFFE8\uFFEC\uFFE9\uFFEC", 'H', '\0'), new Class[0]);
            try
            {
                expirationdate = ((ExpirationDate) (expirationdate.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ExpirationDate expirationdate)
            {
                throw expirationdate.getCause();
            }
            b041404140414041404140414 = ((Integer)expirationdate).intValue();
            b041404140414041404140414 = 57;
            // fall through

        case 0: // '\0'
            return;
        }
        expirationdate;
        throw expirationdate;
        expirationdate;
        throw expirationdate.getCause();
    }

    public void setLast4(String s)
    {
        int i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
label0:
            while (true) 
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
            }
            Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u02BD\u028B\u028F\u028C\u028F\u028B\u028F\u028C\u028F\u066F\u066F\u066F\u028B\u028F\u028C\u028F", '\311', '\006'), new Class[0]);
            int j;
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
            b041404140414041404140414 = ((Integer)obj).intValue();
            b041404140414041404140414 = 44;
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD8\uFFA6\uFFAA\uFFA7\uFFAA\uFFA6\uFFAA\uFFA7\uFFAA\u038A\u038A\u038A\uFFA6\uFFAA\uFFA7\uFFAA", '\344', 'Z', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            j = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0116\u04C8\344\350\345\350\344\350\345\350\u04C8\u04C8\344\350\345\350", '<', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            k = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7A\uFE48\uFE4C\uFE49\uFE4C\uFE48\uFE4C\uFE49\uFE4C\u022C\u022C\u022C\uFE48\uFE4C\uFE49\uFE4C", '\364', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            if ((((Integer)obj).intValue() * (j + k)) % b041404140414041404140414 != b041404140414041404140414)
            {
                Object obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("a/303/303\u0413\u0413\u0413/303", '\363', '\364', '\002'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b041404140414041404140414 = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0197\u0165\u0169\u0166\u0169\u0165\u0169\u0166\u0169\u0549\u0549\u0549\u0165\u0169\u0166\u0169", 'g', '\006'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b041404140414041404140414 = ((Integer)obj1).intValue();
            }
            // fall through

        case 0: // '\0'
            last4 = s;
            return;
        }
    }

    public void setName(String s)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0290\u0642\u025E\u0262\u025F\u0262\u025E\u0262\u025F\u0262\u0642\u0642\u025E\u0262\u025F\u0262", '\272', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        k = b041404140414041404140414;
        l = b041404140414041404140414;
        i1 = b041404140414041404140414;
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\322\240\244\241\244\240\244\241\244\u0484\u0484\u0484\240\244\241\244", '\020', '\200', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0119\347\353\350\353\347\353\350\353\u04CB\u04CB\u04CB\347\353\350\353", '\353', '4', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF1\uFEBF\uFEC3\uFEC0\uFEC3\uFEBF\uFEC3\uFEC0\uFEC3\u02A3\u02A3\u02A3\uFEBF\uFEC3\uFEC0\uFEC3", '{', '\004'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b041404140414041404140414 = i;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\020\uFFDE\uFFE2\uFFDF\uFFE2\uFFDE\uFFE2\uFFDF\uFFE2\u03C2\u03C2\u03C2\uFFDE\uFFE2\uFFDF\uFFE2", ')', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041404140414041404140414 = i;
        try
        {
            name = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_301;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        throw s;
    }

    public void setPanReferenceID(String s)
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    if (((b041404140414041404140414 + b041404140414041404140414) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
                    {
                        Object obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("X&*'*&*'*\u040A\u040A\u040A&*'*", '\005', '\003'), new Class[0]);
                        int i;
                        int j;
                        int k;
                        int l;
                        int i1;
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b041404140414041404140414 = ((Integer)obj).intValue();
                        b041404140414041404140414 = 28;
                    }
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
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0153\u0121\u0125\u0122\u0125\u0121\u0125\u0122\u0125\u0505\u0505\u0505\u0121\u0125\u0122\u0125", '\361', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            j = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("!swrwswrw\u0457\u0457\u0457swrw", 'C', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        l = b041404140414041404140414;
        i1 = b041404140414041404140414;
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u011F\355\361\356\361\355\361\356\361\u04D1\u04D1\u04D1\355\361\356\361", '?', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b041404140414041404140414 = i;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/external/common/PaymentInstrument.getMethod(nuuuuu.b0417041704170417041704170417("\u0119\347\353\350\353\347\353\350\353\u04CB\u04CB\u04CB\347\353\350\353", '=', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041404140414041404140414 = i;
        panReferenceID = s;
        return;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public void setPaymentType(PaymentType paymenttype)
    {
        paymentType = paymenttype;
    }
}
