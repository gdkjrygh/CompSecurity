// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zza

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
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

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.zza(zzaSj, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.zza(zzaSj, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.zza(zzaSj, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.zza(zzaSj, i);
            return this;
        }

        private Builder()
        {
            zzaSj = WalletFragmentInitParams.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    private String zzOx;
    private MaskedWalletRequest zzaRU;
    private MaskedWallet zzaRV;
    private int zzaSi;

    private WalletFragmentInitParams()
    {
        zzCY = 1;
        zzaSi = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        zzCY = i;
        zzOx = s;
        zzaRU = maskedwalletrequest;
        zzaSi = j;
        zzaRV = maskedwallet;
    }

    public static Builder newBuilder()
    {
        WalletFragmentInitParams walletfragmentinitparams = new WalletFragmentInitParams();
        walletfragmentinitparams.getClass();
        return walletfragmentinitparams. new Builder();
    }

    static int zza(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.zzaSi = i;
        return i;
    }

    static MaskedWallet zza(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.zzaRV;
    }

    static MaskedWallet zza(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.zzaRV = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest zza(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.zzaRU = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String zza(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.zzOx = s;
        return s;
    }

    static MaskedWalletRequest zzb(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.zzaRU;
    }

    static int zzc(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.zzaSi;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return zzOx;
    }

    public MaskedWallet getMaskedWallet()
    {
        return zzaRV;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return zzaRU;
    }

    public int getMaskedWalletRequestCode()
    {
        return zzaSi;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.zza.zza(this, parcel, i);
    }

}
