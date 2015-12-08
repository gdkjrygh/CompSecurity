// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class zzaTm
    implements Runnable
{

    final zzaTm zzaTi;
    final CapabilityInfoParcelable zzaTm;

    public void run()
    {
        zzaTi.aTg.onCapabilityChanged(zzaTm);
    }

    ble(ble ble, CapabilityInfoParcelable capabilityinfoparcelable)
    {
        zzaTi = ble;
        zzaTm = capabilityinfoparcelable;
        super();
    }
}
