// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;


// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public final class <init>
{

    final WalletFragmentOptions zzaSl;

    public WalletFragmentOptions build()
    {
        return zzaSl;
    }

    public zzaSl setEnvironment(int i)
    {
        WalletFragmentOptions.zza(zzaSl, i);
        return this;
    }

    public zzaSl setFragmentStyle(int i)
    {
        WalletFragmentOptions.zza(zzaSl, (new WalletFragmentStyle()).setStyleResourceId(i));
        return this;
    }

    public sourceId setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
    {
        WalletFragmentOptions.zza(zzaSl, walletfragmentstyle);
        return this;
    }

    public zzaSl setMode(int i)
    {
        WalletFragmentOptions.zzc(zzaSl, i);
        return this;
    }

    public zzaSl setTheme(int i)
    {
        WalletFragmentOptions.zzb(zzaSl, i);
        return this;
    }

    private (WalletFragmentOptions walletfragmentoptions)
    {
        zzaSl = walletfragmentoptions;
        super();
    }

    zzaSl(WalletFragmentOptions walletfragmentoptions, zzaSl zzasl)
    {
        this(walletfragmentoptions);
    }
}
