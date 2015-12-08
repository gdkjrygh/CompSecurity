// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zzc, Dimension

public final class WalletFragmentStyle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int zzCY;
    Bundle zzaSm;
    int zzaSn;

    public WalletFragmentStyle()
    {
        zzCY = 1;
        zzaSm = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        zzCY = i;
        zzaSm = bundle;
        zzaSn = j;
    }

    private void zza(TypedArray typedarray, int i, String s)
    {
        if (!zzaSm.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                zzaSm.putLong(s, Dimension.zza(typedarray));
                return;
            }
        }
    }

    private void zza(TypedArray typedarray, int i, String s, String s1)
    {
        if (!zzaSm.containsKey(s) && !zzaSm.containsKey(s1))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                if (((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    zzaSm.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    zzaSm.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
            }
        }
    }

    private void zzb(TypedArray typedarray, int i, String s)
    {
        if (!zzaSm.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                zzaSm.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int i)
    {
        zzaSm.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i)
    {
        zzaSm.putLong("buyButtonHeight", Dimension.zzjx(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i, float f)
    {
        zzaSm.putLong("buyButtonHeight", Dimension.zza(i, f));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int i)
    {
        zzaSm.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i)
    {
        zzaSm.putLong("buyButtonWidth", Dimension.zzjx(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i, float f)
    {
        zzaSm.putLong("buyButtonWidth", Dimension.zza(i, f));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i)
    {
        zzaSm.remove("maskedWalletDetailsBackgroundResource");
        zzaSm.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i)
    {
        zzaSm.remove("maskedWalletDetailsBackgroundColor");
        zzaSm.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i)
    {
        zzaSm.remove("maskedWalletDetailsButtonBackgroundResource");
        zzaSm.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i)
    {
        zzaSm.remove("maskedWalletDetailsButtonBackgroundColor");
        zzaSm.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i)
    {
        zzaSm.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i)
    {
        zzaSm.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i)
    {
        zzaSm.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i)
    {
        zzaSm.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i)
    {
        zzaSm.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int i)
    {
        zzaSn = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public int zza(String s, DisplayMetrics displaymetrics, int i)
    {
        if (zzaSm.containsKey(s))
        {
            i = Dimension.zza(zzaSm.getLong(s), displaymetrics);
        }
        return i;
    }

    public void zzaL(Context context)
    {
        int i;
        if (zzaSn <= 0)
        {
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        } else
        {
            i = zzaSn;
        }
        context = context.obtainStyledAttributes(i, com.google.android.gms.R.styleable.WalletFragmentStyle);
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        context.recycle();
    }

}
