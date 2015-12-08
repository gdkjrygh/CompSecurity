// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.aam.ReplenishResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            lpplll, ggrrgr

public class pppplp
    implements Callback
{

    public static int b043504350435043504350435_int_static_fld = 38;
    public static int b043504350435043504350435_int_static_fld = 1;
    public static int b043504350435043504350435_int_static_fld = 2;
    public static int b043504350435043504350435_int_static_fld;
    public final ResponseCallback b043504350435043504350435_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
    public final ggrrgr b043504350435043504350435_rrrrrr_ggrrgr_fld;

    public pppplp(ggrrgr ggrrgr, ResponseCallback responsecallback)
    {
        if (((b043504350435043504350435_int_static_fld + b043504350435043504350435_int_static_fld) * b043504350435043504350435_int_static_fld) % b043504350435043504350435_int_static_fld != b043504350435043504350435_int_static_fld)
        {
            Object obj = rrrrrr/pppplp.getMethod(nuuuuu.b0417041704170417041704170417("\u0140\u04FF\u010E\u0112\u0110\u010F\u010E\u0112\u0110\u010F\u04FF\u010E\u0112\u0110\u010F\u04FF\u010E\u0112\u0110\u010F", '\336', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgr ggrrgr)
            {
                throw ggrrgr.getCause();
            }
            b043504350435043504350435_int_static_fld = ((Integer)obj).intValue();
            b043504350435043504350435_int_static_fld = 74;
        }
        try
        {
            b043504350435043504350435_rrrrrr_ggrrgr_fld = ggrrgr;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgr ggrrgr)
        {
            try
            {
                throw ggrrgr;
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgr ggrrgr)
            {
                throw ggrrgr;
            }
        }
        ggrrgr = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\243\234\245\236\253\237", 'A', 'x', '\001'), new Class[0]);
        ggrrgr = ((ggrrgr) (ggrrgr.invoke(null, new Object[0])));
        ((Integer)ggrrgr).intValue();
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_70;
        }
        ggrrgr;
        try
        {
            throw ggrrgr.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgr ggrrgr) { }
        try
        {
            b043504350435043504350435_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld = responsecallback;
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgr ggrrgr) { }
        throw ggrrgr;
    }

    public static int b0421042104210421042104210421()
    {
        return 46;
    }

    public static int b0421042104210421042104210421()
    {
        return 1;
    }

    public void b0421042104210421042104210421(ReplenishResponse replenishresponse, Response response)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void failure(RetrofitError retrofiterror)
    {
        ResponseCallback responsecallback = b043504350435043504350435_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        Method method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\201\323\327\327\324\u04A4\323\327\327\324\323\327\327\324\u04A4\323\327\327\324", '\343', '\002'), new Class[] {
            retrofit/RetrofitError
        });
        try
        {
            retrofiterror = ((RetrofitError) (method.invoke(null, new Object[] {
                retrofiterror
            })));
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror.getCause();
        }
        retrofiterror = (CbpError)retrofiterror;
        method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u02BB\u02B6\u02BE\u02C1\u02CA\u02C7\u02BA", '\307', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            method.invoke(responsecallback, new Object[] {
                retrofiterror
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror.getCause();
        }
    }

    public void success(Object obj, Response response)
    {
        int i = b043504350435043504350435_int_static_fld;
        switch ((i * (b043504350435043504350435_int_static_fld + i)) % b043504350435043504350435_int_static_fld)
        {
        default:
            Object obj1 = rrrrrr/pppplp.getMethod(nuuuuu.b0417041704170417041704170417("\u0196\u0555\u0164\u0168\u0166\u0165\u0164\u0168\u0166\u0165\u0555\u0164\u0168\u0166\u0165\u0555\u0164\u0168\u0166\u0165", '\232', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b043504350435043504350435_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/pppplp.getMethod(nuuuuu.b0417041704170417041704170417("\274\u047B\212\216\214\213\212\216\214\213\u047B\212\216\214\213\u047B\212\216\214\213", '\\', '\266', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b043504350435043504350435_int_static_fld = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = (ReplenishResponse)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = rrrrrr/pppplp.getMethod(nuuuuu.b0417041704170417041704170417("\u0189\u0157\u015B\u0159\u0158\u0157\u015B\u0159\u0158\u0157\u015B\u0159\u0158\u0548\u0157\u015B\u0159\u0158\u0548\u0157\u015B\u0159\u0158", '\373', ',', '\003'), new Class[] {
            com/visa/cbp/external/aam/ReplenishResponse, retrofit/client/Response
        });
        ((Method) (obj1)).invoke(this, new Object[] {
            obj, response
        });
        return;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }
}
