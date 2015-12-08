// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.TransientCache;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetProfileUsersService

class ccessCallback
    implements WishApiCallback
{

    final GetProfileUsersService this$0;
    final k val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetProfileUsersService.access$002(GetProfileUsersService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetProfileUsersService.access$002(GetProfileUsersService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L6:
        return;
_L2:
        JSONArray jsonarray;
        ArrayList arraylist;
        jsonarray = wishapiresponse.getData().getJSONArray("items");
        arraylist = new ArrayList();
        int i = 0;
_L4:
        WishUser wishuser;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        wishapirequest = new WishUser(jsonarray.getJSONObject(i));
        wishuser = TransientCache.getInstance().getCachedUser(wishapirequest.getUserId());
        if (wishuser != null)
        {
            wishapirequest = wishuser;
        }
        arraylist.add(wishapirequest);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            boolean flag = wishapiresponse.getData().getBoolean("no_more");
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded(arraylist, flag);
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
        this$0 = final_getprofileusersservice;
        val$failureCallback = k;
        val$successCallback = ccessCallback.this;
        super();
    }
}
