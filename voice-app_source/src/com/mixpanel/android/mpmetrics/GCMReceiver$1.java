// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            GCMReceiver, MixpanelAPI

class val.registration
    implements stanceProcessor
{

    final GCMReceiver this$0;
    private final String val$registration;

    public void process(MixpanelAPI mixpanelapi)
    {
        mixpanelapi.getPeople().setPushRegistrationId(val$registration);
    }

    ople()
    {
        this$0 = final_gcmreceiver;
        val$registration = String.this;
        super();
    }
}
