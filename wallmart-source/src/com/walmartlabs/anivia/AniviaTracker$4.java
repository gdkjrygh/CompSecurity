// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;


// Referenced classes of package com.walmartlabs.anivia:
//            AniviaTracker, AniviaEventAsJson

class n.Builder
    implements Runnable
{

    final AniviaTracker this$0;
    final n.Builder val$builder;

    public void run()
    {
        AniviaEventAsJson aniviaeventasjson = val$builder.build();
        if (aniviaeventasjson.eventAsJson != null)
        {
            AniviaTracker.access$200(AniviaTracker.this, aniviaeventasjson.eventAsJson);
        }
    }

    n.Builder()
    {
        this$0 = final_aniviatracker;
        val$builder = n.Builder.this;
        super();
    }
}
