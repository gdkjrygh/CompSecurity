// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            Article, BaseModel

static final class lback extends RestTaskCallback
{

    final Callback val$callback;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        val$callback.onModel(BaseModel.deserializeHeterogenousList(jsonobject, "instant_answers"));
    }

    lback(Callback callback1, Callback callback2)
    {
        val$callback = callback2;
        super(callback1);
    }
}
