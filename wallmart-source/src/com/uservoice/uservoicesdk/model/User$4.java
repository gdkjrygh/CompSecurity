// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            User, AccessToken, BaseModel, AccessTokenResult

static final class  extends RestTaskCallback
{

    final Callback val$callback;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        AccessToken accesstoken = (AccessToken)BaseModel.deserializeObject(jsonobject, "token", com/uservoice/uservoicesdk/model/AccessToken);
        jsonobject = (User)BaseModel.deserializeObject(jsonobject, "user", com/uservoice/uservoicesdk/model/User);
        val$callback.onModel(new AccessTokenResult(jsonobject, accesstoken));
    }

    (Callback callback1, Callback callback2)
    {
        val$callback = callback2;
        super(callback1);
    }
}
