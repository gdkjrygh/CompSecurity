// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import com.contextlogic.wish.http.JsonHttpResponseHandler;
import com.contextlogic.wish.http.WishHttpClient;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.core:
//            WishApiResponse, WishApiCallback

public class WishApiRequest extends JsonHttpResponseHandler
{

    private WishApiCallback callback;
    private boolean cancelled;
    private boolean requestFinished;
    private Object requestTag;

    public WishApiRequest(WishApiCallback wishapicallback)
    {
        requestTag = new Object();
        requestFinished = false;
        callback = wishapicallback;
        cancelled = false;
    }

    public void cancel()
    {
        if (!requestFinished)
        {
            cancelled = true;
            callback = null;
            requestFinished = true;
            WishHttpClient.getInstance().cancelRequests(requestTag);
        }
    }

    public Object getRequestTag()
    {
        return requestTag;
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public void onFailure(Throwable throwable, JSONObject jsonobject)
    {
label0:
        {
            requestFinished = true;
            if (callback != null && !cancelled)
            {
                if (jsonobject == null)
                {
                    break label0;
                }
                callback.onFailure(this, new WishApiResponse(jsonobject));
            }
            return;
        }
        callback.onFailure(this, null);
    }

    public void onSuccess(JSONObject jsonobject)
    {
        requestFinished = true;
        if (callback != null && !cancelled)
        {
            callback.onSuccess(this, new WishApiResponse(jsonobject));
        }
    }
}
