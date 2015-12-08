// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import com.walmartlabs.anivia.AniviaTracker;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app:
//            WalmartApplication

class val.tracker
    implements com.walmart.android.analytics.events.ncParamsListener
{

    final WalmartApplication this$0;
    final AniviaTracker val$tracker;

    public void onReceive(HashMap hashmap)
    {
        val$tracker.setExtraBulkParams(hashmap, false);
    }

    ulkParams.AsyncParamsListener()
    {
        this$0 = final_walmartapplication;
        val$tracker = AniviaTracker.this;
        super();
    }
}
