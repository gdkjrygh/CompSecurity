// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, EventBuilder

class val.value
    implements Runnable
{

    final KahunaCommon this$0;
    final int val$count;
    final String val$eventNameCopy;
    final boolean val$hasPurchaseData;
    final int val$value;

    public void run()
    {
        try
        {
            EventBuilder eventbuilder = new EventBuilder(val$eventNameCopy);
            if (val$hasPurchaseData)
            {
                eventbuilder.setPurchaseData(val$count, val$value);
            }
            KahunaCommon.access$1500(KahunaCommon.this, eventbuilder.build());
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
        val$eventNameCopy = s;
        val$hasPurchaseData = flag;
        val$count = i;
        val$value = I.this;
        super();
    }
}
