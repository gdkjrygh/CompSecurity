// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.deflection;

import android.util.Log;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.deflection:
//            Deflection

static final class nit> extends RestTaskCallback
{

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        Log.d("UV", jsonobject.toString());
    }

    public void onError(RestResult restresult)
    {
        Log.e("UV", (new StringBuilder()).append("Failed sending deflection: ").append(restresult.getMessage()).toString());
    }

    (Callback callback)
    {
        super(callback);
    }
}
