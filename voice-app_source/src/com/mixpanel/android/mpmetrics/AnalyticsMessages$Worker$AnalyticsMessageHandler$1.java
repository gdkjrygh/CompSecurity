// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            AnalyticsMessages, MPConfig, MixpanelAPI

class val.registrationId
    implements val.registrationId
{

    final val.registrationId this$2;
    private final String val$registrationId;

    public void process(MixpanelAPI mixpanelapi)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder("Using existing pushId ")).append(val$registrationId).toString());
        }
        mixpanelapi.getPeople().registrationId(val$registrationId);
    }

    ()
    {
        this$2 = final_;
        val$registrationId = String.this;
        super();
    }
}
