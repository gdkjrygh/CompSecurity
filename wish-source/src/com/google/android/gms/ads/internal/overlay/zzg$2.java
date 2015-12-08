// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.widget.VideoView;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class zzwU extends VideoView
{

    final zzg zzwU;

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && zzg.zza(zzwU) == null)
        {
            zzg.zzb(zzwU);
        }
        if (i == 8)
        {
            zzg.zza(zzwU, zzg.zzc(zzwU));
            zzg.zza(zzwU, null);
        }
    }

    (zzg zzg1, Context context)
    {
        zzwU = zzg1;
        super(context);
    }
}
