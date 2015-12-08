// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI

class val.mixpanel extends BroadcastReceiver
{

    private final MixpanelAPI val$mixpanel;

    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle;
        context = new JSONObject();
        bundle = intent.getBundleExtra("event_args");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = bundle.keySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        val$mixpanel.track((new StringBuilder("$")).append(intent.getStringExtra("event_name")).toString(), context);
        return;
_L3:
        String s = (String)iterator.next();
        try
        {
            context.put(s, bundle.get(s));
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.AL", (new StringBuilder("failed to add key \"")).append(s).append("\" to properties for tracking bolts event").toString(), jsonexception);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    ()
    {
        val$mixpanel = mixpanelapi;
        super();
    }
}
