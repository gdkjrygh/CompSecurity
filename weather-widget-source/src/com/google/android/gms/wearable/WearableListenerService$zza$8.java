// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzj

class zzaZo
    implements Runnable
{

    final zzaZo zzaZh;
    final zzj zzaZm;
    final AmsEntityUpdateParcelable zzaZo;

    public void run()
    {
        zzaZm.zza(zzaZo);
    }

    able(able able, zzj zzj1, AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
        zzaZh = able;
        zzaZm = zzj1;
        zzaZo = amsentityupdateparcelable;
        super();
    }
}
