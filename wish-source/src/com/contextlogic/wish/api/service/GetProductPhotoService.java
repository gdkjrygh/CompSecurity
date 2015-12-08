// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetProductPhotoService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishUser wishuser);
    }


    private WishApiRequest apiRequest;

    public GetProductPhotoService()
    {
    }

    public void cancelAllRequests()
    {
        if (apiRequest != null)
        {
            apiRequest.cancel();
            apiRequest = null;
        }
    }

    public boolean isPending()
    {
        return apiRequest != null;
    }

    public void requestService(String s, int i, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getProductPhotoDetails(s, i, new WishApiCallback() {

            final GetProductPhotoService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequest = null;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse() && wishapiresponse.hasData()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
_L4:
                return;
_L2:
                String s1;
                s1 = null;
                wishapirequest = s1;
                if (!wishapiresponse.getData().has("uploader_name"))
                {
                    break MISSING_BLOCK_LABEL_80;
                }
                wishapirequest = s1;
                if (!wishapiresponse.getData().isNull("uploader_name"))
                {
                    wishapirequest = wishapiresponse.getData().getString("uploader_name");
                }
                Object obj;
                obj = null;
                s1 = obj;
                if (!wishapiresponse.getData().has("uploader_fbid"))
                {
                    break MISSING_BLOCK_LABEL_126;
                }
                s1 = obj;
                if (!wishapiresponse.getData().isNull("uploader_fbid"))
                {
                    s1 = StringUtil.ensureString(wishapiresponse.getData().get("uploader_fbid"));
                }
                wishapirequest = new WishUser(wishapirequest, s1);
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(wishapirequest);
                    return;
                }
                continue; /* Loop/switch isn't completed */
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                continue; /* Loop/switch isn't completed */
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = GetProductPhotoService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetProductPhotoService getproductphotoservice, WishApiRequest wishapirequest)
    {
        getproductphotoservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
