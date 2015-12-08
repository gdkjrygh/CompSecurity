// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

class this._cls0 extends Handler
{

    final MainActivity this$0;

    public void handleMessage(Message message)
    {
        Object obj;
        obj = message.getData().getString("attributionData");
        if (obj == null || ((String) (obj)).equals("false"))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        message = new JSONObject();
        obj = new JSONObject(((String) (obj)));
        if (((JSONObject) (obj)).has("tracker"))
        {
            message.put("campaign", ((JSONObject) (obj)).get("tracker"));
        }
        if (((JSONObject) (obj)).has("tracker_id"))
        {
            message.put("campaign_id", ((JSONObject) (obj)).get("tracker_id"));
        }
        mixpanel.registerSuperProperties(message);
        return;
        message;
    }

    PI()
    {
        this$0 = MainActivity.this;
        super();
    }
}
