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
    final SharedPreferences val$prefs;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        ((ClientConfig)BaseModel.deserializeObject(jsonobject, "client", com/uservoice/uservoicesdk/model/ClientConfig)).persist(val$prefs, val$cacheKey, "client");
    }

    (Callback callback, SharedPreferences sharedpreferences, String s)
    {
        val$prefs = sharedpreferences;
        val$cacheKey = s;
        super(callback);
    }
}
