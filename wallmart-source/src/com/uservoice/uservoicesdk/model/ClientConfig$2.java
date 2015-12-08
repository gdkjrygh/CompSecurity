// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.content.SharedPreferences;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            ClientConfig, BaseModel

static final class  extends RestTaskCallback
{

    final String val$cacheKey;
    final Callback val$callback;
    final SharedPreferences val$prefs;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = (ClientConfig)BaseModel.deserializeObject(jsonobject, "client", com/uservoice/uservoicesdk/model/ClientConfig);
        jsonobject.persist(val$prefs, val$cacheKey, "client");
        val$callback.onModel(jsonobject);
    }

    (Callback callback1, SharedPreferences sharedpreferences, String s, Callback callback2)
    {
        val$prefs = sharedpreferences;
        val$cacheKey = s;
        val$callback = callback2;
        super(callback1);
    }
}
