// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI, MPConfig

class val.pushId
    implements ssor
{

    final val.pushId this$1;
    private final String val$pushId;

    public void process(MixpanelAPI mixpanelapi)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.API", (new StringBuilder("Using existing pushId ")).append(val$pushId).toString());
        }
        mixpanelapi.getPeople().hRegistrationId(val$pushId);
    }

    ssor()
    {
        this$1 = final_ssor;
        val$pushId = String.this;
        super();
    }
}
