// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.aam.CheckStatusResponse;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            nnnlnn, lpplll

public class llplpl
    implements Callback
{

    public static int b044B044B044B044B044B044B_int_static_fld = 2;
    public static int b044B044B044B044B044B044B_int_static_fld = 0;
    public static int b044B044B044B044B044B044B_int_static_fld = 1;
    public static int b044B044B044B044B044B044B_int_static_fld = 76;
    public final nnnlnn b044B044B044B044B044B044B_rrrrrr_nnnlnn_fld;
    public final ResponseCallback b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;

    public llplpl(nnnlnn nnnlnn1, ResponseCallback responsecallback)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b041B041B041B041B041B041B()
    {
        return 0;
    }

    public static int b041B041B041B041B041B041B()
    {
        return 1;
    }

    public static int b043104310431043104310431()
    {
        return 20;
    }

    public void b041B041B041B041B041B041B(CheckStatusResponse checkstatusresponse, Response response)
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            i = b044B044B044B044B044B044B_int_static_fld;
            k = b044B044B044B044B044B044B_int_static_fld;
            l = b044B044B044B044B044B044B_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusResponse checkstatusresponse)
        {
            throw checkstatusresponse;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 91;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_91;
_L1:
        obj = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA8\u0377\uFF76\uFF7A\uFF79\uFF77\uFF76\uFF7A\uFF79\uFF77\uFF76\uFF7A\uFF79\uFF77\uFF76\uFF7A\uFF79\uFF77\uFF76\uFF7A\uFF79\uFF77", ']', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        Object obj1;
        Method method;
        try
        {
            b044B044B044B044B044B044B_int_static_fld = j;
            b044B044B044B044B044B044B_int_static_fld = 11;
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusResponse checkstatusresponse)
        {
            throw checkstatusresponse;
        }
        obj = b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        obj1 = b044B044B044B044B044B044B_rrrrrr_nnnlnn_fld;
        method = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5D\u0341\uFF2B\uFF2F\uFF2F\uFF31\u0341\u0341\uFF2B\uFF2F\uFF2F\uFF31\u0341\u0341", '5', '\320', '\0'), new Class[] {
            rrrrrr/nnnlnn, retrofit/client/Response
        });
        response = ((Response) (method.invoke(null, new Object[] {
            obj1, response
        })));
        response = (GenericResponse)response;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    if (((b044B044B044B044B044B044B_int_static_fld + b044B044B044B044B044B044B_int_static_fld) * b044B044B044B044B044B044B_int_static_fld) % b044B044B044B044B044B044B_int_static_fld != b044B044B044B044B044B044B_int_static_fld)
                    {
                        b044B044B044B044B044B044B_int_static_fld = 94;
                        b044B044B044B044B044B044B_int_static_fld = 8;
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
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        obj1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\222\224\202\202\204\222\222", '\037', '\005'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        ((Method) (obj1)).invoke(obj, new Object[] {
            checkstatusresponse, response
        });
        return;
        checkstatusresponse;
        throw checkstatusresponse.getCause();
        checkstatusresponse;
        throw checkstatusresponse.getCause();
        checkstatusresponse;
        throw checkstatusresponse.getCause();
    }

    public void failure(RetrofitError retrofiterror)
    {
        ResponseCallback responsecallback = b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        Method method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\u02A8\u0276\u027A\u027A\u027D\u068D\u0276\u027A\u027A\u027D\u0276\u027A\u027A\u027D\u068D\u0276\u027A\u027A\u027D", '\302', '\006'), new Class[] {
            retrofit/RetrofitError
        });
        retrofiterror = ((RetrofitError) (method.invoke(null, new Object[] {
            retrofiterror
        })));
        retrofiterror = (CbpError)retrofiterror;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b044B044B044B044B044B044B_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror;
        }
        try
        {
            j = b044B044B044B044B044B044B_int_static_fld;
            k = b044B044B044B044B044B044B_int_static_fld;
            l = b044B044B044B044B044B044B_int_static_fld;
            i1 = b044B044B044B044B044B044B_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        obj = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01E2\u05B1\u01B0\u01B4\u01B3\u01B1\u01B0\u01B4\u01B3\u01B1\u01B0\u01B4\u01B3\u01B1\u01B0\u01B4\u01B3\u01B1\u01B0\u01B4\u01B3\u01B1", '\300', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b044B044B044B044B044B044B_int_static_fld = i;
        obj = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\260\u047F~\202\201\177~\202\201\177~\202\201\177~\202\201\177~\202\201\177", '\032', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b044B044B044B044B044B044B_int_static_fld = i;
        i = b044B044B044B044B044B044B_int_static_fld;
        switch ((i * (b044B044B044B044B044B044B_int_static_fld + i)) % b044B044B044B044B044B044B_int_static_fld)
        {
        default:
            b044B044B044B044B044B044B_int_static_fld = 63;
            obj = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF16\u02E5\uFEE4\uFEE8\uFEE7\uFEE5\uFEE4\uFEE8\uFEE7\uFEE5\uFEE4\uFEE8\uFEE7\uFEE5\uFEE4\uFEE8\uFEE7\uFEE5\uFEE4\uFEE8\uFEE7\uFEE5", '\177', '\315', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (RetrofitError retrofiterror)
            {
                throw retrofiterror.getCause();
            }
            b044B044B044B044B044B044B_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        obj = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\371\364\374\377\u0108\u0105\370", '\223', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj)).invoke(responsecallback, new Object[] {
            retrofiterror
        });
        return;
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        try
        {
            throw retrofiterror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror) { }
        throw retrofiterror;
_L2:
        throw retrofiterror;
        retrofiterror;
        try
        {
            throw retrofiterror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror) { }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void success(Object obj, Response response)
    {
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b044B044B044B044B044B044B_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7D\u0336\uFF4B\uFF4F\uFF4C\uFF5D\u0336\u0336\u0336\u0336", '\345', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        k = b044B044B044B044B044B044B_int_static_fld;
        l = b044B044B044B044B044B044B_int_static_fld;
        i1 = b044B044B044B044B044B044B_int_static_fld;
        if (((j + i) * k) % l != i1)
        {
            i = b044B044B044B044B044B044B_int_static_fld;
            j = b044B044B044B044B044B044B_int_static_fld;
            k = b044B044B044B044B044B044B_int_static_fld;
            l = b044B044B044B044B044B044B_int_static_fld;
            obj1 = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\316\234\240\235\256\234\240\235\256\u0487\u0487\u0487\u0487", '6', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            if (((i + j) * k) % l != ((Integer)obj1).intValue())
            {
                obj1 = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\352\u04B9\270\274\273\271\270\274\273\271\270\274\273\271\270\274\273\271\270\274\273\271", 'D', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw ((InvocationTargetException) (obj)).getCause();
                }
                b044B044B044B044B044B044B_int_static_fld = ((Integer)obj1).intValue();
                obj1 = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF73\u0342\uFF41\uFF45\uFF44\uFF42\uFF41\uFF45\uFF44\uFF42\uFF41\uFF45\uFF44\uFF42\uFF41\uFF45\uFF44\uFF42\uFF41\uFF45\uFF44\uFF42", '\357', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw ((InvocationTargetException) (obj)).getCause();
                }
                b044B044B044B044B044B044B_int_static_fld = ((Integer)obj1).intValue();
            }
            try
            {
                b044B044B044B044B044B044B_int_static_fld = 33;
                b044B044B044B044B044B044B_int_static_fld = 77;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        obj = (CheckStatusResponse)obj;
        obj1 = rrrrrr/llplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0194\u0162\u0166\u0163\u0174\u054D\u054D\u054D\u054D\u054D", '\231', '\001'), new Class[] {
            com/visa/cbp/external/aam/CheckStatusResponse, retrofit/client/Response
        });
        ((Method) (obj1)).invoke(this, new Object[] {
            obj, response
        });
        return;
_L2:
        throw obj;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        try
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
