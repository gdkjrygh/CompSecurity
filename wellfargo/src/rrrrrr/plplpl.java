// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.enp.EnrollAndProvisionResponse;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            lpplpl, lpplll

public class plplpl
    implements Callback
{

    public static int b044B044B044B044B044B044B_int_static_fld = 1;
    public static int b044B044B044B044B044B044B_int_static_fld = 0;
    public static int b044B044B044B044B044B044B_int_static_fld = 94;
    public static int b044B044B044B044B044B044B_int_static_fld = 2;
    public final lpplpl b044B044B044B044B044B044B_rrrrrr_lpplpl_fld;
    public final ResponseCallback b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;

    public plplpl(lpplpl lpplpl1, ResponseCallback responsecallback)
    {
_L8:
        1;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 0
    //                   1 51;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break label0;
            }
        }
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 103
    //                   1 0;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        int i = b044B044B044B044B044B044B_int_static_fld;
        switch ((i * (b044B044B044B044B044B044B_int_static_fld + i)) % b044B044B044B044B044B044B_int_static_fld)
        {
        default:
            int j = b044B044B044B044B044B044B_int_static_fld;
            Object obj;
            switch ((j * (b044B044B044B044B044B044B_int_static_fld + j)) % b044B044B044B044B044B044B_int_static_fld)
            {
            default:
                b044B044B044B044B044B044B_int_static_fld = 81;
                b044B044B044B044B044B044B_int_static_fld = 54;
                // fall through

            case 0: // '\0'
                obj = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("^\u0417\u0417,0->\u0417\u0417\u0417", 'R', 'V', '\002'), new Class[0]);
                break;
            }
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (lpplpl lpplpl1)
            {
                throw lpplpl1.getCause();
            }
            b044B044B044B044B044B044B_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u010D\u04C6\u04C6\333\337\334\355\u04C6\u04C6\u04C6", '\253', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (lpplpl lpplpl1)
            {
                throw lpplpl1.getCause();
            }
            b044B044B044B044B044B044B_int_static_fld = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            b044B044B044B044B044B044B_rrrrrr_lpplpl_fld = lpplpl1;
            b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld = responsecallback;
            super();
            return;
        }
    }

    public static int b041B041B041B041B041B041B()
    {
        return 1;
    }

    public static int b041B041B041B041B041B041B()
    {
        return 34;
    }

    public void b041B041B041B041B041B041B(EnrollAndProvisionResponse enrollandprovisionresponse, Response response)
    {
        Object obj = b044B044B044B044B044B044B_rrrrrr_lpplpl_fld;
        Object obj2 = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("\u010E\u010C\u011B\357\u010C\u0108\u010B\u010C\u0119\u011A", '.', '\325', '\001'), new Class[0]);
        Object obj3;
        int i;
        try
        {
            obj2 = ((Method) (obj2)).invoke(response, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        obj2 = (List)obj2;
        obj3 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF89\uFF57\uFF5B\uFF58\uFF69\uFF57\uFF5B\uFF58\uFF69\u0342\uFF57\uFF5B\uFF58\uFF69\u0342\u0342", '\004', '\335', '\002'), new Class[] {
            java/util/List
        });
        try
        {
            obj = ((Method) (obj3)).invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        obj = (Map)obj;
        obj2 = b044B044B044B044B044B044B_rrrrrr_lpplpl_fld;
        obj3 = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("\uFF73\uFF71\uFF80\uFF5F\uFF80\uFF6D\uFF80\uFF81\uFF7F", '\364', '\0'), new Class[0]);
        try
        {
            obj3 = ((Method) (obj3)).invoke(response, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        i = ((Integer)obj3).intValue();
        obj3 = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("\u0123\u0121\u0130\u010E\u0121\u011D\u012F\u012B\u012A", '^', '\001'), new Class[0]);
        try
        {
            response = ((Response) (((Method) (obj3)).invoke(response, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        response = (String)response;
        obj3 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("Q\u040A\u040A\037# 1\037# 1\u040A\u040A", '\321', '\300', '\001'), new Class[] {
            Integer.TYPE, java/lang/String, java/util/Map
        });
        try
        {
            response = ((Response) (((Method) (obj3)).invoke(obj2, new Object[] {
                Integer.valueOf(i), response, obj
            })));
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        response = (GenericResponse)response;
        i = b044B044B044B044B044B044B_int_static_fld;
        obj = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("9\u0440koj\031koj\031\u0440\u0440\u0440", '[', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b044B044B044B044B044B044B_int_static_fld) % b044B044B044B044B044B044B_int_static_fld != b044B044B044B044B044B044B_int_static_fld)
        {
            b044B044B044B044B044B044B_int_static_fld = 46;
            b044B044B044B044B044B044B_int_static_fld = 73;
            int j = b044B044B044B044B044B044B_int_static_fld;
            switch ((j * (b044B044B044B044B044B044B_int_static_fld + j)) % b044B044B044B044B044B044B_int_static_fld)
            {
            default:
                b044B044B044B044B044B044B_int_static_fld = 19;
                Object obj1 = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("\326\u048F\u048F\244\250\245\266\u048F\u048F\u048F", 't', '\005'), new Class[0]);
                Method method;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (EnrollAndProvisionResponse enrollandprovisionresponse)
                {
                    throw enrollandprovisionresponse.getCause();
                }
                b044B044B044B044B044B044B_int_static_fld = ((Integer)obj1).intValue();
                break;

            case 0: // '\0'
                break;
            }
        }
        obj1 = b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        1;
        JVM INSTR tableswitch 0 1: default 424
    //                   0 400
    //                   1 451;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
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
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 476
    //                   0 503
    //                   1 400;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L4:
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
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_400;
_L7:
        method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u01DA\u01DC\u01CA\u01CA\u01CC\u01DA\u01DA", '\334', '\213', '\003'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        try
        {
            method.invoke(obj1, new Object[] {
                enrollandprovisionresponse, response
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
    }

    public void failure(RetrofitError retrofiterror)
    {
        int i = b044B044B044B044B044B044B_int_static_fld;
        switch ((i * (b044B044B044B044B044B044B_int_static_fld + i)) % b044B044B044B044B044B044B_int_static_fld)
        {
        default:
            b044B044B044B044B044B044B_int_static_fld = 88;
            b044B044B044B044B044B044B_int_static_fld = 54;
            break;

        case 0: // '\0'
            break;
        }
        ResponseCallback responsecallback;
        Method method;
        try
        {
            responsecallback = b044B044B044B044B044B044B_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror;
        }
        method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCD\uFF9B\uFF9F\uFF9F\uFFA2\u03B2\uFF9B\uFF9F\uFF9F\uFFA2\uFF9B\uFF9F\uFF9F\uFFA2\u03B2\uFF9B\uFF9F\uFF9F\uFFA2", '$', '\271', '\002'), new Class[] {
            retrofit/RetrofitError
        });
        retrofiterror = ((RetrofitError) (method.invoke(null, new Object[] {
            retrofiterror
        })));
        retrofiterror = (CbpError)retrofiterror;
        method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u015F\u015A\u0162\u0165\u016E\u016B\u015E", '\273', '>', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        method.invoke(responsecallback, new Object[] {
            retrofiterror
        });
        return;
        retrofiterror;
        throw retrofiterror.getCause();
        retrofiterror;
        throw retrofiterror.getCause();
    }

    public void success(Object obj, Response response)
    {
        try
        {
            obj = (EnrollAndProvisionResponse)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (((b044B044B044B044B044B044B_int_static_fld + b044B044B044B044B044B044B_int_static_fld) * b044B044B044B044B044B044B_int_static_fld) % b044B044B044B044B044B044B_int_static_fld != b044B044B044B044B044B044B_int_static_fld)
        {
            int i = b044B044B044B044B044B044B_int_static_fld;
            switch ((i * (b044B044B044B044B044B044B_int_static_fld + i)) % b044B044B044B044B044B044B_int_static_fld)
            {
            default:
                Object obj1 = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF81\u033A\u033A\uFF4F\uFF53\uFF50\uFF61\u033A\u033A\u033A", 'K', '\004'), new Class[0]);
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
                b044B044B044B044B044B044B_int_static_fld = 56;
                // fall through

            case 0: // '\0'
                b044B044B044B044B044B044B_int_static_fld = 15;
                obj1 = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("\\\u0415\u0415*.+<\u0415\u0415\u0415", '\202', '|', '\001'), new Class[0]);
                break;
            }
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
        obj1 = rrrrrr/plplpl.getMethod(nuuuuu.b0417041704170417041704170417("\374\256\252\257\334\u0485\256\252\257\334\u0485\u0485\u0485", '\236', '\002'), new Class[] {
            com/visa/cbp/external/enp/EnrollAndProvisionResponse, retrofit/client/Response
        });
        ((Method) (obj1)).invoke(this, new Object[] {
            obj, response
        });
        return;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }
}
