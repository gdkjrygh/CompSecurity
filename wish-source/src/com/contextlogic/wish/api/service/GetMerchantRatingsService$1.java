// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishRatingSummary;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetMerchantRatingsService

class ccessCallback
    implements WishApiCallback
{

    final GetMerchantRatingsService this$0;
    final nServiceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetMerchantRatingsService.access$002(GetMerchantRatingsService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetMerchantRatingsService.access$002(GetMerchantRatingsService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
_L5:
        return;
_L2:
        Object obj;
        obj = wishapiresponse.getData().getJSONArray("results");
        wishapirequest = new ArrayList();
        int i = 0;
_L4:
        int k = ((JSONArray) (obj)).length();
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        wishapirequest.add(new WishRating(((JSONArray) (obj)).getJSONObject(i)));
_L8:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        obj = new WishRatingSummary(wishapiresponse.getData().getJSONObject("merchant_info"));
        int j = wishapiresponse.getData().getInt("num_results");
        int l = wishapiresponse.getData().getInt("next_offset");
        boolean flag = wishapiresponse.getData().getBoolean("no_more_ratings");
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded(((WishRatingSummary) (obj)), wishapirequest, j, l, flag);
            return;
        }
          goto _L5
        wishapirequest;
_L7:
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
            return;
        }
          goto _L5
        wishapirequest;
_L6:
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
            return;
        }
          goto _L5
        wishapirequest;
          goto _L6
        wishapirequest;
          goto _L7
        ApiMalformedDataException apimalformeddataexception;
        apimalformeddataexception;
          goto _L8
    }

    ccessCallback()
    {
        this$0 = final_getmerchantratingsservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
