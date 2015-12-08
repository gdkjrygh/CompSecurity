// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.google.common.collect.ImmutableMap;
import com.weather.ads2.util.LaunchPartner;
import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.ads2.targeting:
//            StaticAdParameters, AdTargetingChange, AdTargetingParam

class this._cls0
    implements Runnable
{

    final StaticAdParameters this$0;

    public void run()
    {
        StaticAdParameters.access$100(StaticAdParameters.this).post(new AdTargetingChange(ImmutableMap.of(AdTargetingParam.AID, StaticAdParameters.access$200(StaticAdParameters.this), AdTargetingParam.ADID, StaticAdParameters.access$300(StaticAdParameters.this), AdTargetingParam.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner())));
    }

    ()
    {
        this$0 = StaticAdParameters.this;
        super();
    }
}
