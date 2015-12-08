// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, Event

class val.event
    implements Runnable
{

    final KahunaCommon this$0;
    final Event val$event;

    public void run()
    {
        try
        {
            KahunaCommon.access$1500(KahunaCommon.this, val$event);
            return;
        }
        catch (Exception exception)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackEvent(): ").append(exception).toString());
        }
    }

    ()
    {
        this$0 = final_kahunacommon;
        val$event = Event.this;
        super();
    }
}
