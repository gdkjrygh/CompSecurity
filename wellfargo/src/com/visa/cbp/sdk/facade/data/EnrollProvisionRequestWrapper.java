// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import com.visa.cbp.external.enp.EnrollAndProvisionRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class EnrollProvisionRequestWrapper
{

    public static int b044904490449044904490449 = 2;
    public static int b044904490449044904490449 = 28;
    public static int b044904490449044904490449 = 1;
    public static int b044904490449044904490449;
    private String cardArtUri;
    private String cardRefId;
    private EnrollAndProvisionRequest enrollAndProvisionRequest;

    public EnrollProvisionRequestWrapper(String s, String s1, EnrollAndProvisionRequest enrollandprovisionrequest)
    {
        cardRefId = s;
        cardArtUri = s1;
        int i = b044904490449044904490449;
        int j = b044904490449044904490449;
        int k = b044904490449044904490449;
        if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b044904490449044904490449 != b044904490449044904490449)
        {
            b044904490449044904490449 = 84;
            s = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("6\004\b\b\r\u041D\004\b\b\r\004\b\b\r\u041D\u041D", '2', '^', '\002'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044904490449044904490449 = ((Integer)s).intValue();
        }
        switch (((j + i) * i) % k)
        {
        default:
            b044904490449044904490449 = 74;
            b044904490449044904490449 = 58;
            // fall through

        case 0: // '\0'
            enrollAndProvisionRequest = enrollandprovisionrequest;
            break;
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
    }

    public static int b044904490449044904490449()
    {
        return 2;
    }

    public static int b044904490449044904490449()
    {
        return 6;
    }

    public static int b044904490449044904490449()
    {
        return 1;
    }

    public String getCardArtUri()
    {
        String s;
        Object obj1;
        int i;
        int k;
        try
        {
            s = cardArtUri;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        i = b044904490449044904490449;
        k = b044904490449044904490449;
        obj1 = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("\u0350\u031E\u0322\u0322\u0327\u031E\u0322\u0322\u0327\u031E\u0322\u0322\u0327\u031E\u0322\u0322\u0327\u0737\u0737", '\372', '\006'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        switch (((k + i) * i) % ((Integer)obj1).intValue())
        {
        default:
            b044904490449044904490449 = 26;
            Object obj2 = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("\u0114\342\346\346\353\u04FB\342\346\346\353\342\346\346\353\u04FB\u04FB", '\262', '\005'), new Class[0]);
            Object obj;
            int j;
            int l;
            int i1;
            int j1;
            int k1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b044904490449044904490449 = ((Integer)obj2).intValue();
            break;

        case 0: // '\0'
            break;
        }
        j = b044904490449044904490449;
        obj2 = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("j\u04418<<18<<18<<1\u0441\u0441", '\b', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        l = ((Integer)obj2).intValue();
        i1 = b044904490449044904490449;
        j1 = b044904490449044904490449;
        k1 = b044904490449044904490449;
        if (((l + j) * i1) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        obj2 = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("k9==0\u04409==09==0\u0440\u0440", '\t', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        b044904490449044904490449 = j;
        b044904490449044904490449 = 31;
        return s;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }

    public String getCardRefId()
    {
        int i = b044904490449044904490449;
        switch ((i * (b044904490449044904490449 + i)) % b044904490449044904490449)
        {
        default:
            b044904490449044904490449 = 35;
            b044904490449044904490449 = 97;
            break;

        case 0: // '\0'
            break;
        }
        if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b044904490449044904490449 != b044904490449044904490449)
        {
            b044904490449044904490449 = 72;
            b044904490449044904490449 = 29;
        }
        String s;
        try
        {
            s = cardRefId;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return s;
    }

    public EnrollAndProvisionRequest getEnrollAndProvisionRequest()
    {
        EnrollAndProvisionRequest enrollandprovisionrequest = enrollAndProvisionRequest;
        if (((b044904490449044904490449 + b044904490449044904490449) * b044904490449044904490449) % b044904490449044904490449 != b044904490449044904490449)
        {
            int i = b044904490449044904490449;
            switch ((i * (b044904490449044904490449 + i)) % b044904490449044904490449)
            {
            default:
                b044904490449044904490449 = 99;
                Object obj = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("[)--2\u0442)--2)--2\u0442\u0442", '\007', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b044904490449044904490449 = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
                b044904490449044904490449 = 44;
                b044904490449044904490449 = 25;
                break;
            }
        }
        return enrollandprovisionrequest;
    }
}
