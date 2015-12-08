// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetProfileProductsService

class ccessCallback
    implements WishApiCallback
{

    final GetProfileProductsService this$0;
    final nServiceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetProfileProductsService.access$002(GetProfileProductsService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetProfileProductsService.access$002(GetProfileProductsService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
_L6:
        return;
_L2:
        ArrayList arraylist;
        wishapirequest = wishapiresponse.getData().getJSONArray("items");
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
        flag = wishapiresponse.getData().getBoolean("no_more");
        i = wishapiresponse.getData().getInt("offset");
        WishFeedEndedButtonSpec wishfeedendedbuttonspec;
        wishfeedendedbuttonspec = null;
        wishapirequest = wishfeedendedbuttonspec;
        if (!wishapiresponse.getData().has("banner_title"))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        wishapirequest = wishfeedendedbuttonspec;
        if (!wishapiresponse.getData().isNull("banner_title"))
        {
            wishapirequest = wishapiresponse.getData().getString("banner_title");
        }
        Object obj;
        obj = null;
        wishfeedendedbuttonspec = obj;
        if (!wishapiresponse.getData().has("feed_ended_button_spec"))
        {
            continue; /* Loop/switch isn't completed */
        }
        wishapiresponse = wishapiresponse.getData().getJSONObject("feed_ended_button_spec");
        try
        {
            wishfeedendedbuttonspec = new WishFeedEndedButtonSpec(wishapiresponse);
        }
        // Misplaced declaration of an exception variable
        catch (WishApiResponse wishapiresponse)
        {
            wishfeedendedbuttonspec = obj;
        }
        if (val$successCallback == null) goto _L6; else goto _L5
_L5:
        val$successCallback.onServiceSucceeded(arraylist, flag, i, wishfeedendedbuttonspec, wishapirequest);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
            return;
        }
        continue; /* Loop/switch isn't completed */
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    ccessCallback()
    {
        this$0 = final_getprofileproductsservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
