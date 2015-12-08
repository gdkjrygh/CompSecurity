// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzb

class zzmC
    implements android.view.nTouchListener
{

    final zzb zzmC;
    final zza zzmD;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        zzmC.recordClick();
        return false;
    }

    (zza zza1, zzb zzb1)
    {
        zzmD = zza1;
        zzmC = zzb1;
        super();
    }
}
