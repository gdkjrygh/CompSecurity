// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import com.mixpanel.android.mpmetrics.SuperPropertyUpdate;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewCrawler

class val.variantObject
    implements SuperPropertyUpdate
{

    final val.variantObject this$1;
    private final JSONObject val$variantObject;

    public JSONObject update(JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("$experiments", val$variantObject);
        }
        catch (JSONException jsonexception)
        {
            Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    ()
    {
        this$1 = final_;
        val$variantObject = JSONObject.this;
        super();
    }
}
