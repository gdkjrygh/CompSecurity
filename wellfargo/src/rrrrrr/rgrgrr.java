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
//            llpllp, grggrr, lplplp, lpplll

public class rgrgrr
    implements Callback
{

    public static int b041904190419041904190419_int_static_fld = 33;
    public static int b041904190419041904190419_int_static_fld = 1;
    public static int b041904190419041904190419_int_static_fld = 2;
    public static int b041904190419041904190419_int_static_fld;
    public final ResponseCallback b041904190419041904190419_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
    public final DeviceRegistrationRequest b043304330433043304330433_com_visa_cbp_sdk_facade_request_DeviceRegistrationRequest_fld;
    public final lplplp b041904190419041904190419_rrrrrr_lplplp_fld;
    public final Object b043304330433043304330433_java_lang_Object_fld;

    public rgrgrr(lplplp lplplp1, DeviceRegistrationRequest deviceregistrationrequest, Object obj, ResponseCallback responsecallback)
    {
        b041904190419041904190419_rrrrrr_lplplp_fld = lplplp1;
        b043304330433043304330433_com_visa_cbp_sdk_facade_request_DeviceRegistrationRequest_fld = deviceregistrationrequest;
        int i = b041904190419041904190419_int_static_fld;
        int j = b041904190419041904190419_int_static_fld;
        int k = b041904190419041904190419_int_static_fld;
        lplplp1 = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\317\235\241\240\243\u04A3\235\241\240\243\235\241\240\243\u04A3\u04A3", '\200', '\023', '\002'), new Class[0]);
        try
        {
            lplplp1 = ((lplplp) (lplplp1.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (lplplp lplplp1)
        {
            throw lplplp1.getCause();
        }
        if ((k * (i + j)) % ((Integer)lplplp1).intValue() != b041904190419041904190419_int_static_fld)
        {
            b041904190419041904190419_int_static_fld = 76;
            b041904190419041904190419_int_static_fld = 75;
        }
        b043304330433043304330433_java_lang_Object_fld = obj;
        b041904190419041904190419_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld = responsecallback;
        super();
    }

    public static int b043604360436043604360436()
    {
        return 42;
    }

    public static int b043604360436043604360436()
    {
        return 2;
    }

    public static int b043604360436043604360436()
    {
        return 1;
    }

    public void b043604360436043604360436(DeviceRegistrationResponse deviceregistrationresponse, Response response)
    {
        int i = b041904190419041904190419_int_static_fld;
        Object obj;
        switch ((i * (b041904190419041904190419_int_static_fld + i)) % b041904190419041904190419_int_static_fld)
        {
        default:
            b041904190419041904190419_int_static_fld = 76;
            b041904190419041904190419_int_static_fld = 47;
            // fall through

        case 0: // '\0'
            obj = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u01AD\u017B\u017F\u017D\u017C\u056C\u017B\u017F\u017D\u017C\u056C\u017B\u017F\u017D\u017C\u017B\u017F\u017D\u017C\u056C", '\262', '\231', '\003'), new Class[] {
                retrofit/client/Response
            });
            break;
        }
        Method method;
        int j;
        boolean flag;
        try
        {
            response = ((Response) (((Method) (obj)).invoke(null, new Object[] {
                response
            })));
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        response = (GenericResponse)response;
        obj = b043304330433043304330433_com_visa_cbp_sdk_facade_request_DeviceRegistrationRequest_fld;
        method = com/visa/cbp/sdk/facade/request/DeviceRegistrationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF2\uFFF0\uFFFF\uFFCF\uFFF1\uFFFB\uFFDE\uFFF0\uFFFE\uFFFE\uFFF4\uFFFA\uFFF9\uFFD4\uFFEF", '\'', '\004'), new Class[0]);
        try
        {
            obj = method.invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        deviceregistrationresponse = new grggrr(deviceregistrationresponse, response, (String)obj);
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
        response = rrrrrr/grggrr.getMethod(nuuuuu.b0417041704170417041704170417("\351\267\273\272\275\267\273\272\275\267\273\272\275\267\273\272\275\267\273\272\275\u04BD", '-', '\006'), new Class[0]);
        try
        {
            deviceregistrationresponse = ((DeviceRegistrationResponse) (response.invoke(deviceregistrationresponse, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        flag = ((Boolean)deviceregistrationresponse).booleanValue();
        deviceregistrationresponse = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("4\002\006\005\b\002\006\005\b\002\006\005\b\002\006\005\b\u0408\u0408", '\031', '\025', '\0'), new Class[0]);
        try
        {
            deviceregistrationresponse = ((DeviceRegistrationResponse) (deviceregistrationresponse.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        i = ((Integer)deviceregistrationresponse).intValue();
        j = b041904190419041904190419_int_static_fld;
        deviceregistrationresponse = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("f487:487:487:487:\u043A\u043A", '\367', '\363', '\002'), new Class[0]);
        try
        {
            deviceregistrationresponse = ((DeviceRegistrationResponse) (deviceregistrationresponse.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        if ((((Integer)deviceregistrationresponse).intValue() * (j + i)) % b041904190419041904190419_int_static_fld != b041904190419041904190419_int_static_fld)
        {
            b041904190419041904190419_int_static_fld = 41;
            deviceregistrationresponse = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\u0134\u0102\u0106\u0105\u0108\u0102\u0106\u0105\u0108\u0102\u0106\u0105\u0108\u0102\u0106\u0105\u0108\u0508\u0508", '\322', '\005'), new Class[0]);
            Object obj1;
            Method method1;
            try
            {
                deviceregistrationresponse = ((DeviceRegistrationResponse) (deviceregistrationresponse.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (DeviceRegistrationResponse deviceregistrationresponse)
            {
                throw deviceregistrationresponse.getCause();
            }
            b041904190419041904190419_int_static_fld = ((Integer)deviceregistrationresponse).intValue();
        }
        if (flag)
        {
            deviceregistrationresponse = b041904190419041904190419_rrrrrr_lplplp_fld;
            response = ((Response) (b043304330433043304330433_java_lang_Object_fld));
            obj1 = b041904190419041904190419_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
            method1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\u0190\u0559\u015E\u0162\u0160\u0170\u0559\u0559\u015E\u0162\u0160\u0170\u0559", '\321', ']', '\003'), new Class[] {
                java/lang/Object, com/visa/cbp/sdk/facade/provider/ResponseCallback
            });
            try
            {
                method1.invoke(deviceregistrationresponse, new Object[] {
                    response, obj1
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (DeviceRegistrationResponse deviceregistrationresponse)
            {
                throw deviceregistrationresponse.getCause();
            }
        }
        deviceregistrationresponse = b041904190419041904190419_rrrrrr_lplplp_fld;
        response = SDKErrorType.DEVICE_REGISTRATION_EXPIRED;
        obj1 = ReasonCode.AUTHENTICATION_ERROR;
        method1 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("5\003\007\007\n\003\007\007\n\u041A\003\007\007\n\u041A\003\007\007\n", '-', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        try
        {
            response = ((Response) (method1.invoke(null, new Object[] {
                response, obj1
            })));
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
        response = (CbpError)response;
        obj1 = b041904190419041904190419_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        method1 = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\262\u047B\u047B\200\204\202\222\u047B\200\204\202\222\u047B", 'P', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            method1.invoke(deviceregistrationresponse, new Object[] {
                response, obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DeviceRegistrationResponse deviceregistrationresponse)
        {
            throw deviceregistrationresponse.getCause();
        }
    }

    public void failure(RetrofitError retrofiterror)
    {
        int i = b041904190419041904190419_int_static_fld;
        switch ((i * (b041904190419041904190419_int_static_fld + i)) % b041904190419041904190419_int_static_fld)
        {
        default:
            b041904190419041904190419_int_static_fld = 59;
            Object obj = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\247uyx{uyx{uyx{uyx{\u047B\u047B", 'E', '\005'), new Class[0]);
            Object obj1;
            Method method;
            int j;
            int k;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (RetrofitError retrofiterror)
            {
                throw retrofiterror.getCause();
            }
            b041904190419041904190419_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
label0:
        do
        {
            j = b041904190419041904190419_int_static_fld;
            k = b041904190419041904190419_int_static_fld;
            obj = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\032\uFFE8\uFFEC\uFFEB\uFFEE\u03EE\uFFE8\uFFEC\uFFEB\uFFEE\uFFE8\uFFEC\uFFEB\uFFEE\u03EE\u03EE", '$', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (RetrofitError retrofiterror)
            {
                throw retrofiterror.getCause();
            }
            switch (((k + j) * j) % ((Integer)obj).intValue())
            {
            default:
                obj = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE9\uFFB7\uFFBB\uFFBA\uFFBD\uFFB7\uFFBB\uFFBA\uFFBD\uFFB7\uFFBB\uFFBA\uFFBD\uFFB7\uFFBB\uFFBA\uFFBD\u03BD\u03BD", 'y', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (RetrofitError retrofiterror)
                {
                    throw retrofiterror.getCause();
                }
                b041904190419041904190419_int_static_fld = ((Integer)obj).intValue();
                b041904190419041904190419_int_static_fld = 17;
                // fall through

            case 0: // '\0'
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
                break;
            }
        } while (true);
        obj = b041904190419041904190419_rrrrrr_lplplp_fld;
        obj1 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("P\036\"\"%\u0435\036\"\"%\036\"\"%\u0435\036\"\"%", '\022', '\0'), new Class[] {
            retrofit/RetrofitError
        });
        try
        {
            retrofiterror = ((RetrofitError) (((Method) (obj1)).invoke(null, new Object[] {
                retrofiterror
            })));
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            throw retrofiterror.getCause();
        }
        retrofiterror = (CbpError)retrofiterror;
        obj1 = b041904190419041904190419_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        method = rrrrrr/lplplp.getMethod(nuuuuu.b0417041704170417041704170417("\332\u04A3\u04A3\250\254\252\272\u04A3\250\254\252\272\u04A3", '\177', '\007', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            method.invoke(obj, new Object[] {
                retrofiterror, obj1
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
        obj = (DeviceRegistrationResponse)obj;
        int i = b041904190419041904190419_int_static_fld;
        Object obj1 = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\263\u0487\u0487\u0487\u0487\201\205\204\207\u0487", 'Q', '\005'), new Class[0]);
        int j;
        int k;
        int l;
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        j = ((Integer)obj1).intValue();
        k = b041904190419041904190419_int_static_fld;
        l = b041904190419041904190419_int_static_fld;
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
        if (((j + i) * k) % l != b041904190419041904190419_int_static_fld)
        {
            Object obj2 = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("[)-,/)-,/)-,/)-,/\u042F\u042F", 't', '{', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b041904190419041904190419_int_static_fld = ((Integer)obj2).intValue();
            obj2 = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\365\247\243\244\241\247\243\244\241\247\243\244\241\247\243\244\241\u04A1\u04A1", '\227', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b041904190419041904190419_int_static_fld = ((Integer)obj2).intValue();
        }
        obj2 = rrrrrr/rgrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE3\u03B7\uFFB1\uFFB5\uFFB4\uFFB7\uFFB1\uFFB5\uFFB4\uFFB7\uFFB1\uFFB5\uFFB4\uFFB7\u03B7\u03B7", '\177', '\0'), new Class[] {
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
