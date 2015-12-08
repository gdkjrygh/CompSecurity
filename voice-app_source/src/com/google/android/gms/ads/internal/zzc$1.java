// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzd

class zzou
    implements android.view.nTouchListener
{

    final zzd zzou;
    final zzc zzov;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        zzou.recordClick();
        return false;
    }

    (zzc zzc1, zzd zzd1)
    {
        zzov = zzc1;
        zzou = zzd1;
        super();
    }
}
