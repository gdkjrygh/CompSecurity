// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzbk

class zzrV
    implements Runnable
{

    final View zzrV;
    final zzbk zzrW;

    public void run()
    {
        zzrW.zzg(zzrV);
    }

    (zzbk zzbk1, View view)
    {
        zzrW = zzbk1;
        zzrV = view;
        super();
    }
}
