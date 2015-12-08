// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.util.DateUtil;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetLandingPageService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public GetLandingPageService()
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

    public void requestService(int i, String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getLandingPage(i, s, new WishApiCallback() {

            final GetLandingPageService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
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
                        if (wishapiresponse.getData().has("next_landing_page") && !wishapiresponse.getData().isNull("next_landing_page"))
                        {
                            if (wishapiresponse.getData().has("next_landing_page_expiry") && !wishapiresponse.getData().isNull("next_landing_page_expiry"))
                            {
                                UserPreferences.setNextLandingPageExpiry(DateUtil.parseIsoDate(wishapiresponse.getData().getString("next_landing_page_expiry")).getTime());
                            }
                            UserPreferences.setNextLandingPage(wishapiresponse.getData().getString("next_landing_page"));
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest) { }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest) { }
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                        return;
                    }
                }
            }

            
            {
                this$0 = GetLandingPageService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetLandingPageService getlandingpageservice, WishApiRequest wishapirequest)
    {
        getlandingpageservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
