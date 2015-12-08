// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.ads2.targeting:
//            StaticAdParameters, AdTargetingChange

class this._cls0
    implements Runnable
{

    final StaticAdParameters this$0;

    public void run()
    {
        StaticAdParameters.access$100(StaticAdParameters.this).post(new AdTargetingChange(StaticAdParameters.access$000(StaticAdParameters.this)));
    }

    ()
    {
        this$0 = StaticAdParameters.this;
        super();
    }
}
