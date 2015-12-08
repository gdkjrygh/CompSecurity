// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;


// Referenced classes of package com.walmartlabs.anivia:
//            AniviaTracker, AniviaEvent

class val.event
    implements Runnable
{

    final AniviaTracker this$0;
    final AniviaEvent val$event;

    public void run()
    {
        android.content.ContentValues contentvalues = AniviaTracker.access$000(AniviaTracker.this, val$event);
        if (contentvalues != null)
        {
            AniviaTracker.access$100(AniviaTracker.this, contentvalues);
        }
    }

    ()
    {
        this$0 = final_aniviatracker;
        val$event = AniviaEvent.this;
        super();
    }
}
