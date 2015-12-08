// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetBrandFeedService

class ccessCallback
    implements WishApiCallback
{

    final GetBrandFeedService this$0;
    final back val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetBrandFeedService.access$002(GetBrandFeedService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetBrandFeedService.access$002(GetBrandFeedService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L8:
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
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (!wishapiresponse.getData().has("credit"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        Object obj2;
        if (wishapiresponse.getData().isNull("credit"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new WishCredit(wishapiresponse.getData().getJSONObject("credit"));
        obj2 = arraylist.iterator();
_L6:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Iterator) (obj2)).next();
        if (obj instanceof WishProduct)
        {
            ((WishProduct)obj).setCreditId(((WishCredit) (obj1)).getCreditId());
        }
        if (true) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
        obj1 = null;
        if (wishapiresponse.getData().has("recommend_widget_tag"))
        {
            obj1 = wishapiresponse.getData().getString("recommend_widget_tag");
        }
        obj2 = null;
        if (wishapiresponse.getData().has("recommend_widget_fb_message"))
        {
            obj2 = wishapiresponse.getData().getString("recommend_widget_fb_message");
        }
        WishFeedEndedButtonSpec wishfeedendedbuttonspec;
        Object obj3;
        obj3 = null;
        wishfeedendedbuttonspec = obj3;
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
            wishfeedendedbuttonspec = obj3;
        }
        if (val$successCallback == null) goto _L8; else goto _L9
_L9:
        val$successCallback.onServiceSucceeded(arraylist, flag, i, ((WishCredit) (obj)), ((String) (obj1)), ((String) (obj2)), wishfeedendedbuttonspec, wishapirequest);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
            return;
        }
        if (true) goto _L8; else goto _L10
_L10:
    }

    ccessCallback()
    {
        this$0 = final_getbrandfeedservice;
        val$failureCallback = back;
        val$successCallback = ccessCallback.this;
        super();
    }
}
