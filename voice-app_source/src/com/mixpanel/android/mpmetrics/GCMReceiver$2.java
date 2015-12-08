// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            GCMReceiver, MixpanelAPI

class this._cls0
    implements stanceProcessor
{

    final GCMReceiver this$0;

    public void process(MixpanelAPI mixpanelapi)
    {
        mixpanelapi.getPeople().clearPushRegistrationId();
    }

    ople()
    {
        this$0 = GCMReceiver.this;
        super();
    }
}
