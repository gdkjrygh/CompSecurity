// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.ReasonCode;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.request.DeviceRegistrationRequest;
import com.visa.cbp.sdk.facade.response.DeviceRegistrationResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            llpllp, grggrr, lpplll, lpllll

public class lppppl
    implements Callback
{

    public static int b043D043D043D043D043D043D_int_static_fld = 70;
    public static int b043D043D043D043D043D043D_int_static_fld = 1;
    public static int b043D043D043D043D043D043D_int_static_fld = 2;
    public static int b043D043D043D043D043D043D_int_static_fld;
    public final ResponseCallback b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
    public final lpllll b043D043D043D043D043D043D_rrrrrr_lpllll_fld;
    public final DeviceRegistrationRequest b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_request_DeviceRegistrationRequest_fld;

    public lppppl(lpllll lpllll, DeviceRegistrationRequest deviceregistrationrequest, ResponseCallback responsecallback)
    {
        try
        {
            b043D043D043D043D043D043D_rrrrrr_lpllll_fld = lpllll;
        }
        // Misplaced declaration of an exception variable
        catch (lpllll lpllll)
        {
            throw lpllll;
        }
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
        if (((b043D043D043D043D043D043D_int_static_fld + b043D043D043D043D043D043D_int_static_fld) * b043D043D043D043D043D043D_int_static_fld) % b043D043D043D043D043D043D_int_static_fld != b043D043D043D043D043D043D_int_static_fld)
        {
            int i = b043D043D043D043D043D043D_int_static_fld;
            switch ((i * (b043D043D043D043D043D043D_int_static_fld + i)) % b043D043D043D043D043D043D_int_static_fld)
            {
            default:
                lpllll = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4C\u030B\u030B\u030B\u030B\uFF1A\uFF1E\uFF1C\uFF1B\u030B\u030B", '\213', '\003'), new Class[0]);
                try
                {
                    lpllll = ((lpllll) (lpllll.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (lpllll lpllll)
                {
                    throw lpllll.getCause();
                }
                b043D043D043D043D043D043D_int_static_fld = ((Integer)lpllll).intValue();
                lpllll = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("&\u0465\u0465\u0465\u0465tpvu\u0465\u0465", 'D', '\002'), new Class[0]);
                try
                {
                    lpllll = ((lpllll) (lpllll.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (lpllll lpllll)
                {
                    throw lpllll.getCause();
                }
                b043D043D043D043D043D043D_int_static_fld = ((Integer)lpllll).intValue();
                // fall through

            case 0: // '\0'
                lpllll = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\u0115\u04D4\u04D4\u04D4\u04D4\343\347\345\344\u04D4\u04D4", '\263', '\005'), new Class[0]);
                break;
            }
            try
            {
                lpllll = ((lpllll) (lpllll.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (lpllll lpllll)
            {
                throw lpllll.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)lpllll).intValue();
            b043D043D043D043D043D043D_int_static_fld = 53;
        }
        b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_request_DeviceRegistrationRequest_fld = deviceregistrationrequest;
        try
        {
            b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld = responsecallback;
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lpllll lpllll)
        {
            throw lpllll;
        }
    }

    public static int b0421042104210421042104210421()
    {
        return 0;
    }

    public static int b0421042104210421042104210421()
    {
        return 1;
    }

    public static int b0421042104210421042104210421()
    {
        return 32;
    }

    public void b043604360436043604360436(DeviceRegistrationResponse deviceregistrationresponse, Response response)
    {
        Method method = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("J\030\034\032\031\u0409\030\034\032\031\u0409\030\034\032\031\030\034\032\031\u0409", 'G', '_', '\002'), new Class[] {
            retrofit/client/Response
        });
        response = ((Response) (method.invoke(null, new Object[] {
            response
        })));
        response = (GenericResponse)response;
        Object obj;
        Method method1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_request_DeviceRegistrationRequest_fld;
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse;
        }
        method1 = com/visa/cbp/sdk/facade/request/DeviceRegistrationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFF79\uFF77\uFF86\uFF56\uFF78\uFF82\uFF65\uFF77\uFF85\uFF85\uFF7B\uFF81\uFF80\uFF5B\uFF76", '\332', '\024', '\0'), new Class[0]);
        obj = method1.invoke(obj, new Object[0]);
        obj = (String)obj;
        obj = new grggrr(deviceregistrationresponse, response, ((String) (obj)));
        method1 = rrrrrr/grggrr.getMethod(nuuuuu.b0417041704170417041704170417("<\n\016\r\020\n\016\r\020\n\016\r\020\n\016\r\020\n\016\r\020\u0410", '\004', '"', '\0'), new Class[0]);
        obj = method1.invoke(obj, new Object[0]);
        if (!((Boolean)obj).booleanValue())
        {
            break MISSING_BLOCK_LABEL_483;
        }
        obj = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\u0122\u04E1\u04E1\u04E1\u04E1\360\364\362\361\u04E1\u04E1", '`', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b043D043D043D043D043D043D_int_static_fld;
        obj = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\233\u045A\u045A\u045A\u045Aimkj\u045A\u045A", '\216', 'U', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        k = ((Integer)obj).intValue();
        l = b043D043D043D043D043D043D_int_static_fld;
        obj = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\266\204\210\206\205\u0475\u0475\u0475\204\210\206\205\u0475\u0475", '\034', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        if ((k * (j + i)) % l != ((Integer)obj).intValue())
        {
            obj = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFE13\u01D2\u01D2\u01D2\u01D2\uFDE1\uFDE5\uFDE3\uFDE2\u01D2\u01D2", '\305', '\004'), new Class[0]);
            Object obj1;
            Method method2;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (DeviceRegistrationResponse deviceregistrationresponse)
            {
                throw deviceregistrationresponse.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFEFD\u02BC\u02BC\u02BC\u02BC\uFECB\uFECF\uFECD\uFECC\u02BC\u02BC", '\255', '\270', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (DeviceRegistrationResponse deviceregistrationresponse)
            {
                throw deviceregistrationresponse.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj).intValue();
            i = b043D043D043D043D043D043D_int_static_fld;
            switch ((i * (b043D043D043D043D043D043D_int_static_fld + i)) % b043D043D043D043D043D043D_int_static_fld)
            {
            default:
                b043D043D043D043D043D043D_int_static_fld = 57;
                b043D043D043D043D043D043D_int_static_fld = 63;
                break;

            case 0: // '\0'
                break;
            }
        }
        obj = b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        method1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFF51\uFF53\uFF41\uFF41\uFF43\uFF51\uFF51", '0', '\362', '\0'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        method1.invoke(obj, new Object[] {
            deviceregistrationresponse, response
        });
        return;
        deviceregistrationresponse;
        throw deviceregistrationresponse.getCause();
        deviceregistrationresponse;
        throw deviceregistrationresponse.getCause();
        deviceregistrationresponse;
        throw deviceregistrationresponse.getCause();
        deviceregistrationresponse = b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        try
        {
            response = SDKErrorType.CANNOT_STORE_DEVICE_ID;
            obj1 = ReasonCode.DB_OPERATION_ERRORS;
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse;
        }
        method2 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\016\uFFDC\uFFE0\uFFE0\uFFE3\uFFDC\uFFE0\uFFE0\uFFE3\u03F3\uFFDC\uFFE0\uFFE0\uFFE3\u03F3\uFFDC\uFFE0\uFFE0\uFFE3", 'u', '\311', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        response = ((Response) (method2.invoke(null, new Object[] {
            response, obj1
        })));
        response = (CbpError)response;
        obj1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u0198\u0193\u019B\u019E\u01A7\u01A4\u0197", '\231', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj1)).invoke(deviceregistrationresponse, new Object[] {
            response
        });
        return;
        deviceregistrationresponse;
        throw deviceregistrationresponse.getCause();
        deviceregistrationresponse;
        throw deviceregistrationresponse.getCause();
        deviceregistrationresponse;
        throw deviceregistrationresponse.getCause();
    }

    public void failure(RetrofitError retrofiterror)
    {
        ResponseCallback responsecallback;
        Object obj;
        int i;
        int k;
        int l;
        int i1;
        try
        {
            responsecallback = b043D043D043D043D043D043D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror;
        }
        i = b043D043D043D043D043D043D_int_static_fld;
        k = b043D043D043D043D043D043D_int_static_fld;
        l = b043D043D043D043D043D043D_int_static_fld;
        i1 = b043D043D043D043D043D043D_int_static_fld;
        obj = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF6\uFFC4\uFFC8\uFFC6\uFFC5\u03B5\u03B5\u03B5\uFFC4\uFFC8\uFFC6\uFFC5\u03B5\u03B5", '\316', 'b', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror.getCause();
        }
        if (((i + k) * l) % i1 != ((Integer)obj).intValue())
        {
            int j = b043D043D043D043D043D043D_int_static_fld;
            switch ((j * (b043D043D043D043D043D043D_int_static_fld + j)) % b043D043D043D043D043D043D_int_static_fld)
            {
            default:
                b043D043D043D043D043D043D_int_static_fld = 57;
                Object obj1 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF09\u02C8\u02C8\u02C8\u02C8\uFED7\uFEDB\uFED9\uFED8\u02C8\u02C8", 's', '\004'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (RetrofitError retrofiterror)
                {
                    throw retrofiterror.getCause();
                }
                b043D043D043D043D043D043D_int_static_fld = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b043D043D043D043D043D043D_int_static_fld = 16;
                obj1 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\210\u0447\u0447\u0447\u0447VZXW\u0447\u0447", 'n', 'H', '\002'), new Class[0]);
                break;
            }
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (RetrofitError retrofiterror)
            {
                throw retrofiterror.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj1).intValue();
        }
        obj1 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\u01C1\u018F\u0193\u0193\u0196\u05A6\u018F\u0193\u0193\u0196\u018F\u0193\u0193\u0196\u05A6\u018F\u0193\u0193\u0196", 'u', '\006'), new Class[] {
            retrofit/RetrofitError
        });
        retrofiterror = ((RetrofitError) (((Method) (obj1)).invoke(null, new Object[] {
            retrofiterror
        })));
        retrofiterror = (CbpError)retrofiterror;
        obj1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFF80\uFF7B\uFF83\uFF86\uFF8F\uFF8C\uFF7F", '\300', '&', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj1)).invoke(responsecallback, new Object[] {
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
        int i = b043D043D043D043D043D043D_int_static_fld;
        Object obj1 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\277\u047E\215\221\217\216\u047E\u047E\215\221\217\216\u047E\u047E", 'C', '\032', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if (((((Integer)obj1).intValue() + i) * b043D043D043D043D043D043D_int_static_fld) % b043D043D043D043D043D043D_int_static_fld != b043D043D043D043D043D043D_int_static_fld)
        {
            Object obj2 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("/\u03EE\u03EE\u03EE\u03EE\uFFFD\001\uFFFF\uFFFE\u03EE\u03EE", '\017', '$', '\0'), new Class[0]);
            int j;
            int k;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj2).intValue();
            b043D043D043D043D043D043D_int_static_fld = 25;
        }
        obj = (DeviceRegistrationResponse)obj;
        obj2 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0C\u02CB\u02CB\u02CB\u02CB\uFEDA\uFEDE\uFEDC\uFEDB\u02CB\u02CB", 'r', '\004'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        j = ((Integer)obj2).intValue();
        k = b043D043D043D043D043D043D_int_static_fld;
        obj2 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\u022E\u05ED\u05ED\u05ED\u05ED\u01FC\u0200\u01FE\u01FD\u05ED\u05ED", '\346', '\001'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((((Integer)obj2).intValue() * (k + j)) % b043D043D043D043D043D043D_int_static_fld != b043D043D043D043D043D043D_int_static_fld)
        {
            b043D043D043D043D043D043D_int_static_fld = 63;
            obj2 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5D\u031C\u031C\u031C\u031C\uFF2B\uFF2F\uFF2D\uFF2C\u031C\u031C", 'W', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj2).intValue();
        }
        obj2 = rrrrrr/lppppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB4\u0388\uFF82\uFF86\uFF85\uFF88\uFF82\uFF86\uFF85\uFF88\uFF82\uFF86\uFF85\uFF88\u0388\u0388", '&', '\210', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/response/DeviceRegistrationResponse, retrofit/client/Response
        });
        try
        {
            ((Method) (obj2)).invoke(this, new Object[] {
                obj, response
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
    }
}
