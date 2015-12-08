// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragment

static class zzaSg extends com.google.android.gms.internal.nt.zza
{

    private ateChangedListener zzaSf;
    private final WalletFragment zzaSg;

    public void zza(int i, int j, Bundle bundle)
    {
        if (zzaSf != null)
        {
            zzaSf.onStateChanged(zzaSg, i, j, bundle);
        }
    }

    public void zza(ateChangedListener atechangedlistener)
    {
        zzaSf = atechangedlistener;
    }

    ateChangedListener(WalletFragment walletfragment)
    {
        zzaSg = walletfragment;
    }
}
