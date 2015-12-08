// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public final class <init>
{

    final WalletFragmentInitParams zzaSj;

    public WalletFragmentInitParams build()
    {
        boolean flag1 = true;
        boolean flag;
        if (WalletFragmentInitParams.zza(zzaSj) != null && WalletFragmentInitParams.zzb(zzaSj) == null || WalletFragmentInitParams.zza(zzaSj) == null && WalletFragmentInitParams.zzb(zzaSj) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
        if (WalletFragmentInitParams.zzc(zzaSj) >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "masked wallet request code is required and must be non-negative");
        return zzaSj;
    }

    public zzaSj setAccountName(String s)
    {
        WalletFragmentInitParams.zza(zzaSj, s);
        return this;
    }

    public zzaSj setMaskedWallet(MaskedWallet maskedwallet)
    {
        WalletFragmentInitParams.zza(zzaSj, maskedwallet);
        return this;
    }

    public zzaSj setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        WalletFragmentInitParams.zza(zzaSj, maskedwalletrequest);
        return this;
    }

    public zzaSj setMaskedWalletRequestCode(int i)
    {
        WalletFragmentInitParams.zza(zzaSj, i);
        return this;
    }

    private (WalletFragmentInitParams walletfragmentinitparams)
    {
        zzaSj = walletfragmentinitparams;
        super();
    }

    zzaSj(WalletFragmentInitParams walletfragmentinitparams, zzaSj zzasj)
    {
        this(walletfragmentinitparams);
    }
}
