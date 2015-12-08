// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class zzaZl
    implements Runnable
{

    final zzaZl zzaZh;
    final CapabilityInfoParcelable zzaZl;

    public void run()
    {
        zzaZh.aZf.onCapabilityChanged(zzaZl);
    }

    ble(ble ble, CapabilityInfoParcelable capabilityinfoparcelable)
    {
        zzaZh = ble;
        zzaZl = capabilityinfoparcelable;
        super();
    }
}
