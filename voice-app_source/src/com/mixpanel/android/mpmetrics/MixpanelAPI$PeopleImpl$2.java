// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI

class nit> extends nit>
{

    final val.distinctId this$1;
    private final String val$distinctId;

    public String getDistinctId()
    {
        return val$distinctId;
    }

    public void identify(String s)
    {
        throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
    }

    (String s)
    {
        this$1 = final_;
        val$distinctId = s;
        super(MixpanelAPI.this, null);
    }
}
