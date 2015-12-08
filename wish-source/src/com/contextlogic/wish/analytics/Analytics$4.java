// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.contextlogic.wish.analytics:
//            Analytics

class val.label
    implements Runnable
{

    final Analytics this$0;
    final String val$event;
    final String val$label;
    final String val$pageViewString;

    public void run()
    {
        try
        {
            Crashlytics.setString("LastEvent", (new StringBuilder()).append(val$pageViewString).append("-").append(val$event).append("-").append(val$label).toString());
            if (Analytics.access$000(Analytics.this) != null)
            {
                com.google.android.gms.analytics.EventBuilder eventbuilder = new com.google.android.gms.analytics.EventBuilder();
                eventbuilder.setCategory(val$pageViewString);
                eventbuilder.setAction(val$event);
                eventbuilder.setLabel(val$label);
                Analytics.access$000(Analytics.this).send(eventbuilder.build());
            }
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    .EventBuilder()
    {
        this$0 = final_analytics;
        val$pageViewString = s;
        val$event = s1;
        val$label = String.this;
        super();
    }
}
