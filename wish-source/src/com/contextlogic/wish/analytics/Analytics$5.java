// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.contextlogic.wish.analytics:
//            Analytics

class val.value
    implements Runnable
{

    final Analytics this$0;
    final entType val$eventType;
    final belType val$labelType;
    final String val$pageViewString;
    final int val$value;

    public void run()
    {
        try
        {
            Crashlytics.setString("LastEvent", (new StringBuilder()).append(val$pageViewString).append("-").append(val$eventType.name()).append("-").append(val$labelType.name()).toString());
            if (Analytics.access$000(Analytics.this) != null)
            {
                com.google.android.gms.analytics.EventBuilder eventbuilder = new com.google.android.gms.analytics.EventBuilder();
                eventbuilder.setCategory(val$pageViewString);
                eventbuilder.setAction(val$eventType.name());
                if (val$value != -1)
                {
                    eventbuilder.setValue(val$value);
                }
                eventbuilder.setLabel(val$labelType.name());
                Analytics.access$000(Analytics.this).send(eventbuilder.build());
            }
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    belType()
    {
        this$0 = final_analytics;
        val$pageViewString = s;
        val$eventType = enttype;
        val$labelType = beltype;
        val$value = I.this;
        super();
    }
}
