// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishNotification;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetNotificationsService

class ccessCallback
    implements WishApiCallback
{

    final GetNotificationsService this$0;
    final  val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetNotificationsService.access$002(GetNotificationsService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetNotificationsService.access$002(GetNotificationsService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L7:
        return;
_L2:
        ArrayList arraylist;
        wishapirequest = wishapiresponse.getData().getJSONArray("notifications");
        arraylist = new ArrayList();
        int i = 0;
_L5:
        int j = wishapirequest.length();
        if (i >= j) goto _L4; else goto _L3
_L3:
        try
        {
            arraylist.add(new WishNotification(wishapirequest.getJSONObject(i)));
        }
        catch (JSONException jsonexception) { }
        catch (ApiMalformedDataException apimalformeddataexception) { }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        try
        {
            i = wishapiresponse.getData().getInt("count");
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded(arraylist, i);
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
        if (true) goto _L7; else goto _L6
_L6:
    }

    ccessCallback()
    {
        this$0 = final_getnotificationsservice;
        val$failureCallback = ;
        val$successCallback = ccessCallback.this;
        super();
    }
}
