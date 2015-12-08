// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzbk

class zzrC
    implements Runnable
{

    final View zzrC;
    final zzbk zzrD;

    public void run()
    {
        zzrD.zzg(zzrC);
    }

    (zzbk zzbk1, View view)
    {
        zzrD = zzbk1;
        zzrC = view;
        super();
    }
}
