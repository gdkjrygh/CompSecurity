// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zzb, WalletFragmentStyle

public final class WalletFragmentOptions
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentOptions zzaSl;

        public WalletFragmentOptions build()
        {
            return zzaSl;
        }

        public Builder setEnvironment(int i)
        {
            WalletFragmentOptions.zza(zzaSl, i);
            return this;
        }

        public Builder setFragmentStyle(int i)
        {
            WalletFragmentOptions.zza(zzaSl, (new WalletFragmentStyle()).setStyleResourceId(i));
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
        {
            WalletFragmentOptions.zza(zzaSl, walletfragmentstyle);
            return this;
        }

        public Builder setMode(int i)
        {
            WalletFragmentOptions.zzc(zzaSl, i);
            return this;
        }

        public Builder setTheme(int i)
        {
            WalletFragmentOptions.zzb(zzaSl, i);
            return this;
        }

        private Builder()
        {
            zzaSl = WalletFragmentOptions.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private int mTheme;
    final int zzCY;
    private int zzaRH;
    private WalletFragmentStyle zzaSk;
    private int zzacS;

    private WalletFragmentOptions()
    {
        zzCY = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        zzCY = i;
        zzaRH = j;
        mTheme = k;
        zzaSk = walletfragmentstyle;
        zzacS = l;
    }

    public static Builder newBuilder()
    {
        WalletFragmentOptions walletfragmentoptions = new WalletFragmentOptions();
        walletfragmentoptions.getClass();
        return walletfragmentoptions. new Builder();
    }

    static int zza(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.zzaRH = i;
        return i;
    }

    public static WalletFragmentOptions zza(Context context, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.gms.R.styleable.WalletFragmentOptions);
        int i = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_appTheme, 0);
        int j = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_environment, 1);
        int k = attributeset.getResourceId(com.google.android.gms.R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int l = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_fragmentMode, 1);
        attributeset.recycle();
        attributeset = new WalletFragmentOptions();
        attributeset.mTheme = i;
        attributeset.zzaRH = j;
        attributeset.zzaSk = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).zzaSk.zzaL(context);
        attributeset.zzacS = l;
        return attributeset;
    }

    static WalletFragmentStyle zza(WalletFragmentOptions walletfragmentoptions, WalletFragmentStyle walletfragmentstyle)
    {
        walletfragmentoptions.zzaSk = walletfragmentstyle;
        return walletfragmentstyle;
    }

    static int zzb(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.mTheme = i;
        return i;
    }

    static int zzc(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.zzacS = i;
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEnvironment()
    {
        return zzaRH;
    }

    public WalletFragmentStyle getFragmentStyle()
    {
        return zzaSk;
    }

    public int getMode()
    {
        return zzacS;
    }

    public int getTheme()
    {
        return mTheme;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.zzb.zza(this, parcel, i);
    }

    public void zzaL(Context context)
    {
        if (zzaSk != null)
        {
            zzaSk.zzaL(context);
        }
    }

}
