// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.media.MediaPlayer;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class zzwU
    implements android.media.layer.OnInfoListener
{

    final zzg zzwU;

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 3)
        {
            zzg.zze(zzwU);
        }
        return false;
    }

    (zzg zzg1)
    {
        zzwU = zzg1;
        super();
    }
}
