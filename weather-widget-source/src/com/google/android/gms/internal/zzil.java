// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzim, zzin

public class zzil
{

    public static void zza(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        (new zzim(view, ongloballayoutlistener)).zzgL();
    }

    public static void zza(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        (new zzin(view, onscrollchangedlistener)).zzgL();
    }
}
