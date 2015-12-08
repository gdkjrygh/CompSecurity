// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzga, zzgb

public class zzfz
{

    public static void zza(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        (new zzga(view, ongloballayoutlistener)).zzfn();
    }

    public static void zza(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        (new zzgb(view, onscrollchangedlistener)).zzfn();
    }
}
