// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.provider;

import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.TokenStatusError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rrrrrr.llpllp;
import rrrrrr.lpplll;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.provider:
//            ResponseCallback

public class InnerCallback
    implements Callback
{

    public static int b043F043F043F043F043F043F = 1;
    public static int b043F043F043F043F043F043F = 27;
    public static int b043F043F043F043F043F043F = 0;
    public static int b043F043F043F043F043F043F = 2;
    private ResponseCallback callback;

    public InnerCallback(ResponseCallback responsecallback)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b043F043F043F043F043F043F()
    {
        return 1;
    }

    public static int b043F043F043F043F043F043F()
    {
        return 1;
    }

    public static int b043F043F043F043F043F043F()
    {
        return 0;
    }

    public void failure(RetrofitError retrofiterror)
    {
        Method method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF2C\uFEFA\uFEFE\uFEFE\uFF01\u0311\uFEFA\uFEFE\uFEFE\uFF01\uFEFA\uFEFE\uFEFE\uFF01\u0311\uFEFA\uFEFE\uFEFE\uFF01", '\365', 'A', '\0'), new Class[] {
            retrofit/RetrofitError
        });
        retrofiterror = ((RetrofitError) (method.invoke(null, new Object[] {
            retrofiterror
        })));
        retrofiterror = (CbpError)retrofiterror;
        method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\247uyy|uyy|uyy|uyy|\u048Cuyy|", 'K', '\220', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        retrofiterror = ((RetrofitError) (method.invoke(null, new Object[] {
            retrofiterror
        })));
        retrofiterror = (TokenStatusError)retrofiterror;
        Object obj;
        Method method1;
        int i;
        int j;
        int k;
        try
        {
            i = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror;
        }
        try
        {
            j = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror;
        }
        k = b043F043F043F043F043F043F;
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 136
    //                   0 294;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_294;
_L1:
        obj = com/visa/cbp/sdk/facade/provider/InnerCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u01CB\u0199\u019D\u019C\u01AF\u05A8\u0199\u019D\u019C\u01AF\u05A8\u05A8\u05A8", '\310', '\241', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043F043F043F043F043F043F = i;
        obj = com/visa/cbp/sdk/facade/provider/InnerCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u020C\u01DA\u01DE\u01DD\u01F0\u05E9\u01DA\u01DE\u01DD\u01F0\u05E9\u05E9\u05E9", '\270', '\362', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043F043F043F043F043F043F = i;
        if (((b043F043F043F043F043F043F + b043F043F043F043F043F043F) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            obj = com/visa/cbp/sdk/facade/provider/InnerCallback.getMethod(nuuuuu.b0417041704170417041704170417("^,0/B\u043B,0/B\u043B\u043B\u043B", 'i', 'e', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (RetrofitError retrofiterror)
            {
                throw retrofiterror.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
            b043F043F043F043F043F043F = 92;
        }
        obj = callback;
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
        method1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\\W_bkh[", '\230', '\216', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        method1.invoke(obj, new Object[] {
            retrofiterror
        });
        return;
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        throw retrofiterror.getCause();
    }

    public void success(Object obj, Response response)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void success(Response response, Response response1)
    {
_L2:
        response1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("$-&/< ", 'H', '\002'), new Class[0]);
        response1 = ((Response) (response1.invoke(null, new Object[0])));
        ((Integer)response1).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        response1;
        try
        {
            throw response1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Response response1)
        {
            response1 = callback;
        }
_L7:
        switch (1)
        {
        case 0: // '\0'
            continue; /* Loop/switch isn't completed */

        default:
label0:
            while (true) 
            {
                switch (0)
                {
                default:
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    continue; /* Loop/switch isn't completed */
                }
            }
            // fall through

        case 1: // '\001'
            if (((b043F043F043F043F043F043F + b043F043F043F043F043F043F) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
            {
                Object obj = com/visa/cbp/sdk/facade/provider/InnerCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6F\uFF3D\uFF41\uFF40\uFF53\u034C\uFF3D\uFF41\uFF40\uFF53\u034C\u034C\u034C", '\214', 'g', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    throw response.getCause();
                }
                b043F043F043F043F043F043F = ((Integer)obj).intValue();
                b043F043F043F043F043F043F = 38;
            }
            break;
        }
        1;
        JVM INSTR tableswitch 0 1: default 192
    //                   0 51
    //                   1 219;
           goto _L3 _L4 _L5
_L4:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
        obj = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u0130\376\u0102\u0100\377\u04EF\376\u0102\u0100\377\u04EF\376\u0102\u0100\377\376\u0102\u0100\377\u04EF", 'g', '\001'), new Class[] {
            retrofit/client/Response
        });
        try
        {
            response = ((Response) (((Method) (obj)).invoke(null, new Object[] {
                response
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        response = (GenericResponse)response;
        obj = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC5\uFFC7\uFFB5\uFFB5\uFFB7\uFFC5\uFFC5", '\256', '\0'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        try
        {
            ((Method) (obj)).invoke(response1, new Object[] {
                null, response
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
    }
}
