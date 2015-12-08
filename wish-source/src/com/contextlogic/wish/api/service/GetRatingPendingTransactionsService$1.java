// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetRatingPendingTransactionsService

class ccessCallback
    implements WishApiCallback
{

    final GetRatingPendingTransactionsService this$0;
    final iled val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetRatingPendingTransactionsService.access$002(GetRatingPendingTransactionsService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.iled();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetRatingPendingTransactionsService.access$002(GetRatingPendingTransactionsService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.iled();
            }
        } else
        {
            try
            {
                wishapiresponse = wishapiresponse.getData();
                wishapirequest = wishapiresponse.getString("transaction_id");
                wishapiresponse = wishapiresponse.getString("action");
                if (val$successCallback != null)
                {
                    val$successCallback.onServiceSucceeded(wishapirequest, wishapiresponse);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (WishApiRequest wishapirequest)
            {
                if (val$failureCallback != null)
                {
                    val$failureCallback.iled();
                    return;
                }
            }
        }
    }

    ccessCallback()
    {
        this$0 = final_getratingpendingtransactionsservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
