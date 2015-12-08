// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.error;

import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.error:
//            CbpError, ReasonCode

public class TokenStatusError extends CbpError
{

    public static int b041C041C041C041C041C041C = 2;
    public static int b041C041C041C041C041C041C = 0;
    public static int b041C041C041C041C041C041C = 1;
    public static int b041C041C041C041C041C041C = 13;
    private LcmParams lcmParams;
    private TokenStatus tokenStatus;

    public TokenStatusError(int i, String s, ReasonCode reasoncode, String s1)
    {
        Object obj;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            j = b041C041C041C041C041C041C;
            k = b041C041C041C041C041C041C;
            l = b041C041C041C041C041C041C;
            i1 = b041C041C041C041C041C041C;
            j1 = b041C041C041C041C041C041C;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        try
        {
            b041C041C041C041C041C041C = 86;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\356\u04A8\u04A8\274\300\275\317\274\300\275\317\u04A8\274\300\275\317", 'F', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b041C041C041C041C041C041C = j;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    j = b041C041C041C041C041C041C;
                    k = b041C041C041C041C041C041C;
                    l = b041C041C041C041C041C041C;
                    obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFF82\u033C\uFF50\uFF54\uFF51\uFF63\uFF50\uFF54\uFF51\uFF63\uFF50\uFF54\uFF51\uFF63\u033C\uFF50\uFF54\uFF51\uFF63", 'p', '\003'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s.getCause();
                    }
                    i1 = ((Integer)obj).intValue();
                    obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\241osp\202\u045Bosp\202osp\202\u045Bosp\202", '\215', 'N', '\002'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s.getCause();
                    }
                    if ((l * (j + k)) % i1 != ((Integer)obj).intValue())
                    {
                        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAB\u0365\u0365\uFF79\uFF7D\uFF7A\uFF8C\uFF79\uFF7D\uFF7A\uFF8C\u0365\uFF79\uFF7D\uFF7A\uFF8C", '=', '\004'), new Class[0]);
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b041C041C041C041C041C041C = ((Integer)obj).intValue();
                        b041C041C041C041C041C041C = 10;
                    }
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
        super(i, s, reasoncode, s1);
        return;
        s;
        throw s.getCause();
    }

    public static int b041C041C041C041C041C041C()
    {
        return 1;
    }

    public static int b041C041C041C041C041C041C()
    {
        return 0;
    }

    public static int b041C041C041C041C041C041C()
    {
        return 2;
    }

    public static int b041C041C041C041C041C041C()
    {
        return 66;
    }

    public LcmParams getLcmParams()
    {
        LcmParams lcmparams = lcmParams;
        InvocationTargetException invocationtargetexception;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b041C041C041C041C041C041C;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\226dhewdhewdhewdhew\u0450dhew", '4', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        if (((j + i) * b041C041C041C041C041C041C) % b041C041C041C041C041C041C == b041C041C041C041C041C041C)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        b041C041C041C041C041C041C = 0;
        obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("@\u03FA\u03FA\016\022\017!\016\022\017!\u03FA\016\022\017!", '"', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        j = b041C041C041C041C041C041C;
        k = b041C041C041C041C041C041C;
        l = b041C041C041C041C041C041C;
        i1 = b041C041C041C041C041C041C;
        obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\314\232\236\233\255\u0486\232\236\233\255\232\236\233\255\u0486\232\236\233\255", '\031', '\203', '\001'), new Class[0]);
        Object obj;
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if (((j + k) * l) % i1 != ((Integer)obj1).intValue())
        {
            b041C041C041C041C041C041C = 72;
            b041C041C041C041C041C041C = 53;
        }
        try
        {
            b041C041C041C041C041C041C = i;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return lcmparams;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw obj;
    }

    public TokenStatus getTokenStatus()
    {
        Object obj;
        int i;
        int j;
        int l;
        int j1;
        try
        {
            i = b041C041C041C041C041C041C;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        j = b041C041C041C041C041C041C;
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\244rvs\205rvs\205rvs\205rvs\205\u045Ervs\205", '!', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        l = ((Integer)obj).intValue();
        j1 = b041C041C041C041C041C041C;
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFE3D\u01F7\uFE0B\uFE0F\uFE0C\uFE1E\uFE0B\uFE0F\uFE0C\uFE1E\uFE0B\uFE0F\uFE0C\uFE1E\u01F7\uFE0B\uFE0F\uFE0C\uFE1E", '\267', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((j1 * (l + j)) % ((Integer)obj).intValue() != b041C041C041C041C041C041C)
        {
            b041C041C041C041C041C041C = 97;
            Object obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\u01BB\u0575\u0575\u0189\u018D\u018A\u019C\u0189\u018D\u018A\u019C\u0575\u0189\u018D\u018A\u019C", 's', '\006'), new Class[0]);
            Object obj2;
            int k;
            int i1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041C041C041C041C041C041C = ((Integer)obj1).intValue();
        }
        k = b041C041C041C041C041C041C;
        i1 = b041C041C041C041C041C041C;
        ((k + i) * i) % i1;
        JVM INSTR tableswitch 0 0: default 180
    //                   0 225;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_225;
_L1:
        obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("~\u0438\u0438LPM_LPM_\u0438LPM_", '\034', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            b041C041C041C041C041C041C = i;
            b041C041C041C041C041C041C = 78;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        obj1 = tokenStatus;
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
        return ((TokenStatus) (obj1));
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }

    public void setLcmParams(LcmParams lcmparams)
    {
        try
        {
            lcmParams = lcmparams;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
    }

    public void setTokenStatus(TokenStatus tokenstatus)
    {
        Object obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\u0232\u05EC\u05EC\u0200\u0204\u0201\u0213\u0200\u0204\u0201\u0213\u05EC\u0200\u0204\u0201\u0213", '\350', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int i = ((Integer)obj).intValue();
        int j;
        int k;
        int l;
        int i1;
        try
        {
            j = b041C041C041C041C041C041C;
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus;
        }
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\213\u04F5\u04F5\331\335\330\252\331\335\330\252\u04F5\331\335\330\252", '\351', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        try
        {
            l = b041C041C041C041C041C041C;
            i1 = b041C041C041C041C041C041C;
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus;
        }
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        i = b041C041C041C041C041C041C;
        j = b041C041C041C041C041C041C;
        k = b041C041C041C041C041C041C;
        l = b041C041C041C041C041C041C;
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\263\341\345\340\222\u04CD\341\345\340\222\341\345\340\222\u04CD\341\345\340\222", '\321', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj).intValue())
        {
            obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("f\u0420\u0420485G485G\u0420485G", '\002', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenStatus tokenstatus)
            {
                throw tokenstatus.getCause();
            }
            b041C041C041C041C041C041C = ((Integer)obj).intValue();
            b041C041C041C041C041C041C = 67;
        }
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFF81\u033B\u033B\uFF4F\uFF53\uFF50\uFF62\uFF4F\uFF53\uFF50\uFF62\u033B\uFF4F\uFF53\uFF50\uFF62", '-', '\264', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041C041C041C041C041C041C = i;
        obj = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\374\u0482\u0482\256\252\257\335\256\252\257\335\u0482\256\252\257\335", '\236', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041C041C041C041C041C041C = i;
        try
        {
            tokenStatus = tokenstatus;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus) { }
        throw tokenstatus;
        tokenstatus;
        throw tokenstatus.getCause();
        tokenstatus;
        throw tokenstatus.getCause();
        tokenstatus;
        throw tokenstatus.getCause();
        tokenstatus;
        throw tokenstatus.getCause();
    }
}
