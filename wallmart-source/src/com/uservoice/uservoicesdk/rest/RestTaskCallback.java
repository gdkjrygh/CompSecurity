// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.rest;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.rest:
//            Callback, RestResult

public abstract class RestTaskCallback
{

    private final Callback callback;

    public RestTaskCallback(Callback callback1)
    {
        callback = callback1;
    }

    public abstract void onComplete(JSONObject jsonobject)
        throws JSONException;

    public void onError(RestResult restresult)
    {
        callback.onError(restresult);
    }
}
