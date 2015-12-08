// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import com.mixpanel.android.viewcrawler.UpdatesFromMixpanel;
import org.json.JSONArray;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI, Tweaks

private class mTweaks
    implements UpdatesFromMixpanel
{

    private final Tweaks mTweaks;
    final MixpanelAPI this$0;

    public Tweaks getTweaks()
    {
        return mTweaks;
    }

    public void setEventBindings(JSONArray jsonarray)
    {
    }

    public void setVariants(JSONArray jsonarray)
    {
    }

    public void startUpdates()
    {
    }

    public (Tweaks tweaks)
    {
        this$0 = MixpanelAPI.this;
        super();
        mTweaks = tweaks;
    }
}
