// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import com.visa.cbp.external.common.EnvInfo;
import com.visa.cbp.external.common.TokenInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class ReplenishAckRequest
{

    public static int b044504450445044504450445 = 28;
    public static int b044504450445044504450445 = 1;
    public static int b044504450445044504450445 = 0;
    public static int b044504450445044504450445 = 2;
    private EnvInfo envInfo;
    private TokenInfo tokenInfo;

    public ReplenishAckRequest()
    {
    }

    public static int b044504450445044504450445()
    {
        return 1;
    }

    public static int b044504450445044504450445()
    {
        return 14;
    }

    public EnvInfo getEnvInfo()
    {
        int i = b044504450445044504450445;
        int j = b044504450445044504450445;
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
        switch ((i * (j + i)) % b044504450445044504450445)
        {
        default:
            b044504450445044504450445 = 87;
            b044504450445044504450445 = 80;
            // fall through

        case 0: // '\0'
            return envInfo;
        }
    }

    public TokenInfo getTokenInfo()
    {
        TokenInfo tokeninfo;
        int i;
        int j;
        int k;
        try
        {
            i = b044504450445044504450445;
            j = b044504450445044504450445;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            k = b044504450445044504450445;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 92;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_92;
_L1:
        i = b044504450445044504450445;
        switch ((i * (b044504450445044504450445 + i)) % b044504450445044504450445)
        {
        default:
            b044504450445044504450445 = 70;
            b044504450445044504450445 = 93;
            break;

        case 0: // '\0'
            break;
        }
        b044504450445044504450445 = 35;
        b044504450445044504450445 = 58;
        tokeninfo = tokenInfo;
        return tokeninfo;
    }

    public void setEnvInfo(EnvInfo envinfo)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b044504450445044504450445;
            j = b044504450445044504450445;
            k = b044504450445044504450445;
            l = b044504450445044504450445;
        }
        // Misplaced declaration of an exception variable
        catch (EnvInfo envinfo)
        {
            throw envinfo;
        }
        try
        {
            i1 = b044504450445044504450445;
        }
        // Misplaced declaration of an exception variable
        catch (EnvInfo envinfo)
        {
            throw envinfo;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        i = b044504450445044504450445;
        switch ((i * (b044504450445044504450445 + i)) % b044504450445044504450445)
        {
        default:
            b044504450445044504450445 = 72;
            b044504450445044504450445 = 11;
            // fall through

        case 0: // '\0'
            obj = com/visa/cbp/external/aam/ReplenishAckRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFD7D\u0160\uFD4B\uFD4F\uFD4F\uFD50\u0160\uFD4B\uFD4F\uFD4F\uFD50\u0160\uFD4B\uFD4F\uFD4F\uFD50", '\367', '\004'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b044504450445044504450445 = i;
        b044504450445044504450445 = 88;
        try
        {
            envInfo = envinfo;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EnvInfo envinfo) { }
        throw envinfo;
        envinfo;
        throw envinfo.getCause();
    }

    public void setTokenInfo(TokenInfo tokeninfo)
    {
        int i;
        int k;
        int l;
        try
        {
            tokenInfo = tokeninfo;
            i = b044504450445044504450445;
            k = b044504450445044504450445;
            l = b044504450445044504450445;
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo)
        {
            throw tokeninfo;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 144;
           goto _L1 _L2
_L1:
        tokeninfo = com/visa/cbp/external/aam/ReplenishAckRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFE66\u0249\uFE34\uFE38\uFE38\uFE39\u0249\uFE34\uFE38\uFE38\uFE39\u0249\uFE34\uFE38\uFE38\uFE39", '\376', '\003'), new Class[0]);
        tokeninfo = ((TokenInfo) (tokeninfo.invoke(null, new Object[0])));
        int j = ((Integer)tokeninfo).intValue();
        try
        {
            b044504450445044504450445 = j;
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo)
        {
            throw tokeninfo;
        }
        tokeninfo = com/visa/cbp/external/aam/ReplenishAckRequest.getMethod(nuuuuu.b0417041704170417041704170417("\007\u0420UQQP\u0420UQQP\u0420UQQP", 'e', '\002'), new Class[0]);
        tokeninfo = ((TokenInfo) (tokeninfo.invoke(null, new Object[0])));
        j = ((Integer)tokeninfo).intValue();
        b044504450445044504450445 = j;
        return;
        tokeninfo;
        throw tokeninfo.getCause();
        tokeninfo;
        throw tokeninfo.getCause();
_L2:
    }
}
