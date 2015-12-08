// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.content.Context;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.share.ShareMediaSupport;
import com.weather.commons.share.ShareableMedia;

// Referenced classes of package com.weather.Weather.chat:
//            ChatActivity

private static class A extends ShareMediaSupport
{

    public void fireBeacon(ShareableMedia shareablemedia)
    {
        Analytics.trackState(context.getString(0x7f0704c0), null);
    }

    A(Context context, int i, int j, int k, int l)
    {
        super(context, i, j, k, l);
    }
}
