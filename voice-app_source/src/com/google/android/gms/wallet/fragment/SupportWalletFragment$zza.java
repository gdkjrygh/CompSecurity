// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

static class zzaRY extends com.google.android.gms.internal.nt.zza
{

    private ateChangedListener zzaRX;
    private final SupportWalletFragment zzaRY;

    public void zza(int i, int j, Bundle bundle)
    {
        if (zzaRX != null)
        {
            zzaRX.onStateChanged(zzaRY, i, j, bundle);
        }
    }

    public void zza(ateChangedListener atechangedlistener)
    {
        zzaRX = atechangedlistener;
    }

    ateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        zzaRY = supportwalletfragment;
    }
}
