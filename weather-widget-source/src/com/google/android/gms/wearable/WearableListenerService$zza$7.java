// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzj

class zzaZn
    implements Runnable
{

    final zzaZn zzaZh;
    final zzj zzaZm;
    final AncsNotificationParcelable zzaZn;

    public void run()
    {
        zzaZm.zza(zzaZn);
    }

    lable(lable lable, zzj zzj1, AncsNotificationParcelable ancsnotificationparcelable)
    {
        zzaZh = lable;
        zzaZm = zzj1;
        zzaZn = ancsnotificationparcelable;
        super();
    }
}
