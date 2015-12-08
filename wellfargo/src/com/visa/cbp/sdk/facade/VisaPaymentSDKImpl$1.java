// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade;

import com.visa.cbp.external.aam.CheckStatusResponse;
import com.visa.cbp.sdk.facade.activeaccountmanagement.CheckStatusCallback;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade:
//            VisaPaymentSDKImpl

class back
    implements CheckStatusCallback
{

    public static int b043204320432043204320432 = 0;
    public static int b043204320432043204320432 = 1;
    public static int b043204320432043204320432 = 2;
    public static int b043204320432043204320432 = 18;
    final VisaPaymentSDKImpl this$0;
    final ResponseCallback val$checkStatusCallback;

    public static int b043204320432043204320432()
    {
        return 43;
    }

    public static int b043204320432043204320432()
    {
        return 2;
    }

    public static int b043204320432043204320432()
    {
        return 1;
    }

    public void failure(CbpError cbperror)
    {
        ResponseCallback responsecallback;
        Method method;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            responsecallback = val$checkStatusCallback;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\003\uFFFE\006\t\022\017\002", '+', '\216', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        method.invoke(responsecallback, new Object[] {
            cbperror
        });
        i = b043204320432043204320432;
        cbperror = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl$1.getMethod(nuuuuu.b0417041704170417041704170417("\204\u04D4\u04D4\u04D4\326\322\325\324\326\322\325\324\u04D4", '\346', '\002'), new Class[0]);
        cbperror = ((CbpError) (cbperror.invoke(null, new Object[0])));
        j = ((Integer)cbperror).intValue();
        k = b043204320432043204320432;
        l = b043204320432043204320432;
        i1 = b043204320432043204320432;
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        cbperror = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl$1.getMethod(nuuuuu.b0417041704170417041704170417("\207UYXW\u0457UYXW\u0457UYXW\u0457", '\366', '\321', '\002'), new Class[0]);
        cbperror = ((CbpError) (cbperror.invoke(null, new Object[0])));
        i = ((Integer)cbperror).intValue();
        b043204320432043204320432 = i;
        b043204320432043204320432 = 9;
        return;
        cbperror;
        throw cbperror.getCause();
        cbperror;
        throw cbperror.getCause();
        cbperror;
        try
        {
            throw cbperror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
    }

    public void success(CheckStatusResponse checkstatusresponse, List list, GenericResponse genericresponse)
    {
        checkstatusresponse = val$checkStatusCallback;
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
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
        {
            b043204320432043204320432 = 66;
            list = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFE84\uFE52\uFE56\uFE55\uFE54\u0254\uFE52\uFE56\uFE55\uFE54\u0254\uFE52\uFE56\uFE55\uFE54\u0254", '\357', '\003'), new Class[0]);
            try
            {
                list = ((List) (list.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (CheckStatusResponse checkstatusresponse)
            {
                throw checkstatusresponse.getCause();
            }
            b043204320432043204320432 = ((Integer)list).intValue();
        }
        list = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC0\uFFC2\uFFB0\uFFB0\uFFB2\uFFC0\uFFC0", '\227', '\034', '\0'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        try
        {
            list.invoke(checkstatusresponse, new Object[] {
                null, genericresponse
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusResponse checkstatusresponse)
        {
            throw checkstatusresponse.getCause();
        }
    }

    back()
    {
        this$0 = final_visapaymentsdkimpl;
        val$checkStatusCallback = ResponseCallback.this;
        super();
    }
}
