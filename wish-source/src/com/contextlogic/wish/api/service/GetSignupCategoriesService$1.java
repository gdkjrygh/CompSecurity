// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishSignupCategory;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetSignupCategoriesService

class ccessCallback
    implements WishApiCallback
{

    final GetSignupCategoriesService this$0;
    final ServiceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetSignupCategoriesService.access$002(GetSignupCategoriesService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.ServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetSignupCategoriesService.access$002(GetSignupCategoriesService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.ServiceFailed();
        }
_L6:
        return;
_L2:
        wishapirequest = wishapiresponse.getData().getJSONArray("categories");
        wishapiresponse = new ArrayList();
        int i = 0;
_L4:
        if (i >= wishapirequest.length())
        {
            break; /* Loop/switch isn't completed */
        }
        wishapiresponse.add(new WishSignupCategory(wishapirequest.getJSONObject(i)));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded(wishapiresponse);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.ServiceFailed();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.ServiceFailed();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ccessCallback()
    {
        this$0 = final_getsignupcategoriesservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
