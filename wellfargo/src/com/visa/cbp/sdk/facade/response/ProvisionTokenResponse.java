// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.response;

import com.visa.cbp.sdk.facade.data.TokenKey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class ProvisionTokenResponse
{

    public static int b042F042F042F042F042F042F = 19;
    public static int b042F042F042F042F042F042F = 2;
    public static int b042F042F042F042F042F042F = 0;
    public static int b042F042F042F042F042F042F = 1;
    private TokenKey tokenKey;

    public ProvisionTokenResponse(TokenKey tokenkey)
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
        super();
        int i = b042F042F042F042F042F042F;
        Object obj = com/visa/cbp/sdk/facade/response/ProvisionTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6C\uFF3A\uFF3E\uFF3C\uFF50\u0339\uFF3A\uFF3E\uFF3C\uFF50\uFF3A\uFF3E\uFF3C\uFF50\uFF3A\uFF3E\uFF3C\uFF50\u0339", 'F', '\260', '\0'), new Class[0]);
        int k;
        int l;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        k = ((Integer)obj).intValue();
        l = b042F042F042F042F042F042F;
        obj = com/visa/cbp/sdk/facade/response/ProvisionTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0133\u0500\u0101\u0105\u0103\u0117\u0101\u0105\u0103\u0117\u0101\u0105\u0103\u0117\u0101\u0105\u0103\u0117\u0500", '\321', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        if ((l * (k + i)) % ((Integer)obj).intValue() != b042F042F042F042F042F042F)
        {
            b042F042F042F042F042F042F = 67;
            Object obj1 = com/visa/cbp/sdk/facade/response/ProvisionTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u013E\u010C\u0110\u010E\u0122\u010C\u0110\u010E\u0122\u010C\u0110\u010E\u0122\u010C\u0110\u010E\u0122\u010C\u0110\u010E\u0122\u050B", '\017', '\315', '\003'), new Class[0]);
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
        }
        tokenKey = tokenkey;
        j = b042F042F042F042F042F042F;
        switch ((j * (b042F042F042F042F042F042F + j)) % b042F042F042F042F042F042F)
        {
        default:
            tokenkey = com/visa/cbp/sdk/facade/response/ProvisionTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0102\320\324\322\346\320\324\322\346\320\324\322\346\320\324\322\346\320\324\322\346\u04CF", '\036', '\202', '\003'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)tokenkey).intValue();
            tokenkey = com/visa/cbp/sdk/facade/response/ProvisionTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0184\u0152\u0156\u0154\u0168\u0152\u0156\u0154\u0168\u0152\u0156\u0154\u0168\u0152\u0156\u0154\u0168\u0152\u0156\u0154\u0168\u0551", '\221', '\001'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)tokenkey).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b042F042F042F042F042F042F()
    {
        return 35;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 1;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 2;
    }

    public TokenKey getTokenKey()
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
        TokenKey tokenkey = tokenKey;
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            int i = b042F042F042F042F042F042F;
            switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
            {
            default:
                b042F042F042F042F042F042F = 3;
                b042F042F042F042F042F042F = 1;
                // fall through

            case 0: // '\0'
                b042F042F042F042F042F042F = 87;
                break;
            }
            Object obj = com/visa/cbp/sdk/facade/response/ProvisionTokenResponse.getMethod(nuuuuu.b0417041704170417041704170417("V$(&:$(&:$(&:$(&:$(&:\u0423", '&', '2', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
        }
label1:
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
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        return tokenkey;
    }
}
