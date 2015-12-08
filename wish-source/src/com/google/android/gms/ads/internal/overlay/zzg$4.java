// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class zzwY
    implements Runnable
{

    final zzg zzwU;
    final int zzwY;

    public void run()
    {
        if (zzg.zza(zzwU) != null)
        {
            zzg.zza(zzwU).seekTo(zzwY);
            zzg.zzd(zzwU).start();
            zzg.zzd(zzwU).pause();
        }
    }

    (zzg zzg1, int i)
    {
        zzwU = zzg1;
        zzwY = i;
        super();
    }
}
