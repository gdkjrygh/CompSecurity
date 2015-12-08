// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import com.visa.cbp.external.common.Response;
import com.visa.cbp.external.common.TokenInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class ReplenishResponse extends Response
{

    public static int b042904290429042904290429 = 1;
    public static int b042904290429042904290429 = 70;
    public static int b042904290429042904290429 = 0;
    public static int b042904290429042904290429 = 2;
    private TokenInfo tokenInfo;

    public ReplenishResponse()
    {
        int i = b042904290429042904290429;
        int k = b042904290429042904290429;
        int i1 = b042904290429042904290429;
        int j1 = b042904290429042904290429;
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
        if (((i + k) * i1) % j1 != b042904290429042904290429)
        {
            b042904290429042904290429 = 78;
            Object obj = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("7\005\t\007\016\u03FE\u03FE\005\t\007\016\u03FE\005\t\007\016", '+', '\0'), new Class[0]);
            int j;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            j = ((Integer)obj).intValue();
            l = b042904290429042904290429;
            switch ((l * (b042904290429042904290429 + l)) % b042904290429042904290429)
            {
            default:
                Object obj1 = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("^,0.5\u0425\u0425,0.5\u0425,0.5", '\002', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042904290429042904290429 = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("\244\366\362\364\377\u04EF\u04EF\366\362\364\377\u04EF\366\362\364\377", '\306', '\002'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042904290429042904290429 = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b042904290429042904290429 = j;
                break;
            }
        }
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
        super();
    }

    public static int b042904290429042904290429()
    {
        return 11;
    }

    public TokenInfo getTokenInfo()
    {
        Object obj;
        Exception exception;
        int i;
        int j;
        int k;
        int l;
        try
        {
            i = b042904290429042904290429;
            j = b042904290429042904290429;
            k = b042904290429042904290429;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        l = b042904290429042904290429;
        (l * (b042904290429042904290429 + l)) % b042904290429042904290429;
        JVM INSTR tableswitch 0 0: default 48
    //                   0 90;
           goto _L1 _L2
_L1:
        b042904290429042904290429 = 14;
        obj = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("h6:8?\u042F\u042F6:8?\u042F6:8?", '\003', '\001'), new Class[0]);
        InvocationTargetException invocationtargetexception;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        b042904290429042904290429 = ((Integer)obj).intValue();
_L2:
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 116
    //                   0 163;
           goto _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_163;
_L3:
        obj = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u025A\u0228\u022C\u022A\u0231\u0621\u0621\u0228\u022C\u022A\u0231\u0621\u0228\u022C\u022A\u0231", '\250', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042904290429042904290429 = i;
        b042904290429042904290429 = 10;
        obj = tokenInfo;
        return ((TokenInfo) (obj));
        exception;
        throw exception;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
    }

    public void setTokenInfo(TokenInfo tokeninfo)
    {
        if (((b042904290429042904290429 + b042904290429042904290429) * b042904290429042904290429) % b042904290429042904290429 != b042904290429042904290429)
        {
            b042904290429042904290429 = 81;
            Object obj = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0120\356\362\360\367\u04E7\u04E7\356\362\360\367\u04E7\356\362\360\367", '\276', '\005'), new Class[0]);
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
            catch (TokenInfo tokeninfo)
            {
                throw tokeninfo.getCause();
            }
            b042904290429042904290429 = ((Integer)obj).intValue();
        }
        try
        {
            tokenInfo = tokeninfo;
            i = b042904290429042904290429;
            j = b042904290429042904290429;
            k = b042904290429042904290429;
            l = b042904290429042904290429;
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo)
        {
            throw tokeninfo;
        }
        try
        {
            i1 = b042904290429042904290429;
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo)
        {
            throw tokeninfo;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        tokeninfo = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("&\uFFF4\uFFF8\uFFF6\uFFFD\u03ED\u03ED\uFFF4\uFFF8\uFFF6\uFFFD\u03ED\uFFF4\uFFF8\uFFF6\uFFFD", '\213', 'O', '\001'), new Class[0]);
        tokeninfo = ((TokenInfo) (tokeninfo.invoke(null, new Object[0])));
        i = ((Integer)tokeninfo).intValue();
        b042904290429042904290429 = i;
        tokeninfo = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u014E\u011C\u0120\u011E\u0125\u0515\u0515\u011C\u0120\u011E\u0125\u0515\u011C\u0120\u011E\u0125", '\354', '\005'), new Class[0]);
        tokeninfo = ((TokenInfo) (tokeninfo.invoke(null, new Object[0])));
        i = ((Integer)tokeninfo).intValue();
        b042904290429042904290429 = i;
        return;
        tokeninfo;
        throw tokeninfo.getCause();
        tokeninfo;
        throw tokeninfo.getCause();
    }
}
