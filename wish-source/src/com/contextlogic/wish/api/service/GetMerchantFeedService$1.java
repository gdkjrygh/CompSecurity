// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishMerchant;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetMerchantFeedService

class ccessCallback
    implements WishApiCallback
{

    final GetMerchantFeedService this$0;
    final k val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetMerchantFeedService.access$002(GetMerchantFeedService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetMerchantFeedService.access$002(GetMerchantFeedService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L6:
        return;
_L2:
        ArrayList arraylist;
        wishapirequest = wishapiresponse.getData().getJSONArray("results");
        arraylist = new ArrayList();
        int i = 0;
_L4:
        if (i >= wishapirequest.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(new WishProduct(wishapirequest.getJSONObject(i)));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag;
        flag = wishapiresponse.getData().getBoolean("feed_ended");
        i = wishapiresponse.getData().getInt("next_offset");
        Object obj;
        obj = null;
        wishapirequest = ((WishApiRequest) (obj));
        if (!wishapiresponse.getData().has("banner_title"))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        wishapirequest = ((WishApiRequest) (obj));
        if (!wishapiresponse.getData().isNull("banner_title"))
        {
            wishapirequest = wishapiresponse.getData().getString("banner_title");
        }
        WishMerchant wishmerchant;
        wishmerchant = null;
        obj = wishmerchant;
        if (!wishapiresponse.getData().has("feed_ended_button_spec"))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        obj = wishapiresponse.getData().getJSONObject("feed_ended_button_spec");
        Object obj1;
        try
        {
            obj = new WishFeedEndedButtonSpec(((JSONObject) (obj)));
        }
        catch (Throwable throwable)
        {
            throwable = wishmerchant;
        }
        obj1 = null;
        wishmerchant = obj1;
        if (!wishapiresponse.getData().has("merchant_info"))
        {
            continue; /* Loop/switch isn't completed */
        }
        wishapiresponse = wishapiresponse.getData().getJSONObject("merchant_info");
        try
        {
            wishmerchant = new WishMerchant(wishapiresponse);
        }
        // Misplaced declaration of an exception variable
        catch (WishApiResponse wishapiresponse)
        {
            wishmerchant = obj1;
        }
        if (val$successCallback == null) goto _L6; else goto _L5
_L5:
        val$successCallback.onServiceSucceeded(arraylist, flag, i, ((WishFeedEndedButtonSpec) (obj)), wishapirequest, wishmerchant);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
            return;
        }
        continue; /* Loop/switch isn't completed */
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    ccessCallback()
    {
        this$0 = final_getmerchantfeedservice;
        val$failureCallback = k;
        val$successCallback = ccessCallback.this;
        super();
    }
}
