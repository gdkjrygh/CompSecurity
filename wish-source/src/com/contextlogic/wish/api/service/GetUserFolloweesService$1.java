// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetUserFolloweesService

class ccessCallback
    implements WishApiCallback
{

    final GetUserFolloweesService this$0;
    final  val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetUserFolloweesService.access$002(GetUserFolloweesService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetUserFolloweesService.access$002(GetUserFolloweesService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L6:
        return;
_L2:
        wishapirequest = wishapiresponse.getData().getJSONArray("followees");
        wishapiresponse = new HashMap();
        int i = 0;
_L4:
        if (i >= wishapirequest.length())
        {
            break; /* Loop/switch isn't completed */
        }
        wishapiresponse.put(wishapirequest.getString(i), Boolean.valueOf(true));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            LoggedInUser.getInstance().getFollowingManager().setFollowingMapping(wishapiresponse);
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ccessCallback()
    {
        this$0 = final_getuserfolloweesservice;
        val$failureCallback = ;
        val$successCallback = ccessCallback.this;
        super();
    }
}
