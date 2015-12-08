// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import android.os.Bundle;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.dal2.lbs:
//            FusedLbsSystem

private class <init>
    implements com.google.android.gms.common.api.
{

    final FusedLbsSystem this$0;

    public void onConnected(Bundle bundle)
    {
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "onConnected", new Object[0]);
        FusedLbsSystem.access$200(FusedLbsSystem.this);
        onConnectionSuccess();
    }

    public void onConnectionSuspended(int i)
    {
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "onDisconnected", new Object[0]);
    }

    private onCallbacks()
    {
        this$0 = FusedLbsSystem.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
