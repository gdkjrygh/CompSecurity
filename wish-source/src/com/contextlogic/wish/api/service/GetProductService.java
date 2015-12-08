// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishProduct;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetProductService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishProduct wishproduct);
    }


    private WishApiRequest apiRequest;

    public GetProductService()
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

    public void requestService(String s, String s1, int i, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getProductInfo(s, s1, i, new WishApiCallback() {

            final GetProductService this$0;
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
                if (wishapiresponse.isErrorResponse())
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                {
                    try
                    {
                        wishapirequest = new WishProduct(wishapiresponse.getData().getJSONObject("contest"));
                        if (successCallback != null)
                        {
                            successCallback.onServiceSucceeded(wishapirequest);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed();
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed();
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = GetProductService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetProductService getproductservice, WishApiRequest wishapirequest)
    {
        getproductservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
