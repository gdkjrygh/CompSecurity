// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            CompleteFuturePayPalPaymentService

class ccessCallback
    implements WishApiCallback
{

    final CompleteFuturePayPalPaymentService this$0;
    final ilureCallback val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
label0:
        {
            boolean flag;
label1:
            {
                Object obj = null;
                boolean flag1 = false;
                handleFailureResponse(wishapirequest, wishapiresponse);
                CompleteFuturePayPalPaymentService.access$002(CompleteFuturePayPalPaymentService.this, null);
                if (val$failureCallback == null)
                {
                    break label0;
                }
                wishapirequest = obj;
                if (wishapiresponse != null)
                {
                    wishapirequest = wishapiresponse.getMessage();
                }
                flag = flag1;
                if (wishapiresponse == null)
                {
                    break label1;
                }
                if (wishapiresponse.getCode() != 22)
                {
                    flag = flag1;
                    if (wishapiresponse.getCode() != 21)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            val$failureCallback.onServiceFailed(wishapirequest, flag);
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        boolean flag1;
        wishapirequest = null;
        flag1 = false;
        CompleteFuturePayPalPaymentService.access$002(CompleteFuturePayPalPaymentService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
label0:
        {
            boolean flag;
label1:
            {
                if (val$failureCallback == null)
                {
                    break label0;
                }
                if (wishapiresponse != null)
                {
                    wishapirequest = wishapiresponse.getMessage();
                }
                flag = flag1;
                if (wishapiresponse == null)
                {
                    break label1;
                }
                if (wishapiresponse.getCode() != 22)
                {
                    flag = flag1;
                    if (wishapiresponse.getCode() != 21)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            val$failureCallback.onServiceFailed(wishapirequest, flag);
        }
_L4:
        return;
_L2:
        try
        {
            wishapirequest = wishapiresponse.getData().getString("transaction_id");
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded(wishapirequest);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed(null, false);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed(null, false);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ccessCallback()
    {
        this$0 = final_completefuturepaypalpaymentservice;
        val$failureCallback = ilurecallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
