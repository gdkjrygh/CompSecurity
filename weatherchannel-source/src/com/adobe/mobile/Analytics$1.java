// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            Analytics, AnalyticsTrackState

static final class val.cdata
    implements Runnable
{

    final Map val$cdata;
    final String val$state;

    public void run()
    {
        AnalyticsTrackState.trackState(val$state, val$cdata);
    }

    ckState(String s, Map map)
    {
        val$state = s;
        val$cdata = map;
        super();
    }
}
