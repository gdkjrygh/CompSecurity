// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            Suggestion

class ck extends RestTaskCallback
{

    final Suggestion this$0;
    final Callback val$callback;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        load(jsonobject.getJSONObject("suggestion"));
        val$callback.onModel(Suggestion.this);
    }

    ck(Callback callback2)
    {
        this$0 = final_suggestion;
        val$callback = callback2;
        super(Callback.this);
    }
}
