// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            Comment, Suggestion, BaseModel

static final class lback extends RestTaskCallback
{

    final Callback val$callback;
    final Suggestion val$suggestion;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.vent.COMMENT_IDEA, val$suggestion.getId());
        val$callback.onModel(BaseModel.deserializeObject(jsonobject, "comment", com/uservoice/uservoicesdk/model/Comment));
    }

    (Callback callback1, Suggestion suggestion1, Callback callback2)
    {
        val$suggestion = suggestion1;
        val$callback = callback2;
        super(callback1);
    }
}
