// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzh

class zzaTo
    implements Runnable
{

    final zzaTo zzaTi;
    final zzh zzaTn;
    final AncsNotificationParcelable zzaTo;

    public void run()
    {
        zzaTn.zza(zzaTo);
    }

    lable(lable lable, zzh zzh1, AncsNotificationParcelable ancsnotificationparcelable)
    {
        zzaTi = lable;
        zzaTn = zzh1;
        zzaTo = ancsnotificationparcelable;
        super();
    }
}
