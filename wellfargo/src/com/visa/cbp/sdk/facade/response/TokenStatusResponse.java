// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.response;

import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class TokenStatusResponse
{

    public static int b043204320432043204320432 = 84;
    public static int b043204320432043204320432 = 1;
    public static int b043204320432043204320432 = 2;
    public static int b043204320432043204320432;
    private LcmParams lcmParams;
    private TokenStatus tokenStatus;

    public TokenStatusResponse()
    {
        int i = 5;
        do
        {
            do
            {
                i /= 0;
            } while (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 == b043204320432043204320432);
            Object obj = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0189\u0157\u015B\u015A\u0159\u0157\u015B\u015A\u0159\u0157\u015B\u015A\u0159\u0157\u015B\u015A\u0159\u0157\u015B\u015A\u0159\u0559", '\346', 'A', '\003'), new Class[0]);
            Exception exception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            b043204320432043204320432 = 31;
        } while (true);
        exception;
        try
        {
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            try
            {
                throw exception;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                throw exception;
            }
        }
    }

    public static int b043204320432043204320432()
    {
        return 49;
    }

    public static int b043204320432043204320432()
    {
        return 0;
    }

    public static int b043204320432043204320432()
    {
        return 1;
    }

    public LcmParams getLcmParams()
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = lcmParams;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        obj1 = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u018E\u015C\u0160\u015F\u015E\u015C\u0160\u015F\u015E\u015C\u0160\u015F\u015E\u015C\u0160\u015F\u015E\u015C\u0160\u015F\u015E\u055E", 'd', '\006'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            j = b043204320432043204320432;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFE72\uFE40\uFE44\uFE43\uFE42\uFE40\uFE44\uFE43\uFE42\uFE40\uFE44\uFE43\uFE42\uFE40\uFE44\uFE43\uFE42\uFE40\uFE44\uFE43\uFE42\u0242", '\370', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        k = ((Integer)obj1).intValue();
        l = b043204320432043204320432;
        obj1 = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\267\345\341\346\347\345\341\346\347\u04E7\u04E7\u04E7\345\341\346\347", '\325', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        if ((k * (j + i)) % l == ((Integer)obj1).intValue())
        {
            break MISSING_BLOCK_LABEL_261;
        }
        i = b043204320432043204320432;
        switch ((i * (b043204320432043204320432 + i)) % b043204320432043204320432)
        {
        default:
            b043204320432043204320432 = 91;
            obj1 = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFF79\uFF47\uFF4B\uFF4A\uFF49\uFF47\uFF4B\uFF4A\uFF49\uFF47\uFF4B\uFF4A\uFF49\uFF47\uFF4B\uFF4A\uFF49\uFF47\uFF4B\uFF4A\uFF49\u0349", '\351', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b043204320432043204320432 = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        b043204320432043204320432 = 16;
        b043204320432043204320432 = 46;
        return ((LcmParams) (obj));
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        return ((LcmParams) (obj));
    }

    public TokenStatus getTokenStatus()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void setLcmParams(LcmParams lcmparams)
    {
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
        {
            Object obj = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0209\u01D7\u01DB\u01DA\u01D9\u01D7\u01DB\u01DA\u01D9\u01D7\u01DB\u01DA\u01D9\u01D7\u01DB\u01DA\u01D9\u01D7\u01DB\u01DA\u01D9\u05D9", '\215', '\006'), new Class[0]);
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            b043204320432043204320432 = 51;
        }
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    i = b043204320432043204320432;
                    switch ((i * (b043204320432043204320432 + i)) % b043204320432043204320432)
                    {
                    default:
                        obj = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("X&*)(&*)(&*)(&*)(&*)(\u0428", '\n', '\0'), new Class[0]);
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (LcmParams lcmparams)
                        {
                            throw lcmparams.getCause();
                        }
                        b043204320432043204320432 = ((Integer)obj).intValue();
                        obj = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\347\265\261\266\267\265\261\266\267\265\261\266\267\265\261\266\267\265\261\266\267\u04B7", '\205', '\002'), new Class[0]);
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (LcmParams lcmparams)
                        {
                            throw lcmparams.getCause();
                        }
                        b043204320432043204320432 = ((Integer)obj).intValue();
                        // fall through

                    case 0: // '\0'
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        lcmParams = lcmparams;
    }

    public void setTokenStatus(TokenStatus tokenstatus)
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (1)
                    {
                    case 0: // '\0'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label2;

                            case 1: // '\001'
                                break label1;
                            }
                        }
                        // fall through

                    case 1: // '\001'
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        int i = b043204320432043204320432;
        Object obj = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFE04\u01D4\uFDD2\uFDD6\uFDD5\uFDD4\u01D4\u01D4\u01D4\uFDD2\uFDD6\uFDD5\uFDD4", '\312', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b043204320432043204320432)
        {
        default:
            b043204320432043204320432 = 3;
            b043204320432043204320432 = 1;
            if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
            {
                b043204320432043204320432 = 76;
                Object obj1 = com/visa/cbp/sdk/facade/response/TokenStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("r@DCB@DCB@DCB@DCB@DCB\u0442", '\b', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (TokenStatus tokenstatus)
                {
                    throw tokenstatus.getCause();
                }
                b043204320432043204320432 = ((Integer)obj1).intValue();
            }
            // fall through

        case 0: // '\0'
            tokenStatus = tokenstatus;
            return;
        }
    }
}
