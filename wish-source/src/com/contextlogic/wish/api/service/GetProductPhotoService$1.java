// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetProductPhotoService

class ccessCallback
    implements WishApiCallback
{

    final GetProductPhotoService this$0;
    final k val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetProductPhotoService.access$002(GetProductPhotoService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetProductPhotoService.access$002(GetProductPhotoService.this, null);
        if (!wishapiresponse.isErrorResponse() && wishapiresponse.hasData()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L4:
        return;
_L2:
        String s;
        s = null;
        wishapirequest = s;
        if (!wishapiresponse.getData().has("uploader_name"))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        wishapirequest = s;
        if (!wishapiresponse.getData().isNull("uploader_name"))
        {
            wishapirequest = wishapiresponse.getData().getString("uploader_name");
        }
        Object obj;
        obj = null;
        s = obj;
        if (!wishapiresponse.getData().has("uploader_fbid"))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = obj;
        if (!wishapiresponse.getData().isNull("uploader_fbid"))
        {
            s = StringUtil.ensureString(wishapiresponse.getData().get("uploader_fbid"));
        }
        wishapirequest = new WishUser(wishapirequest, s);
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded(wishapirequest);
            return;
        }
        continue; /* Loop/switch isn't completed */
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
        if (true) goto _L4; else goto _L3
_L3:
    }

    ccessCallback()
    {
        this$0 = final_getproductphotoservice;
        val$failureCallback = k;
        val$successCallback = ccessCallback.this;
        super();
    }
}
