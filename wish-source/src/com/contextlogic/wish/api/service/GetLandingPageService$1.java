// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

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
//            GetLandingPageService

class ccessCallback
    implements WishApiCallback
{

    final GetLandingPageService this$0;
    final ck val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetLandingPageService.access$002(GetLandingPageService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetLandingPageService.access$002(GetLandingPageService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed();
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
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded();
                return;
            }
        }
    }

    ccessCallback()
    {
        this$0 = final_getlandingpageservice;
        val$failureCallback = ck;
        val$successCallback = ccessCallback.this;
        super();
    }
}
