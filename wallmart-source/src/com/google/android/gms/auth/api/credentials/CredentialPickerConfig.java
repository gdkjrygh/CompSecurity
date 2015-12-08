// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zzb

public final class CredentialPickerConfig
    implements SafeParcelable
{
    public static class Builder
    {

        private boolean mShowCancelButton;
        private boolean zzRi;

        static boolean zza(Builder builder)
        {
            return builder.zzRi;
        }

        static boolean zzb(Builder builder)
        {
            return builder.mShowCancelButton;
        }

        public CredentialPickerConfig build()
        {
            return new CredentialPickerConfig(this);
        }

        public Builder setShowAddAccountButton(boolean flag)
        {
            zzRi = flag;
            return this;
        }

        public Builder setShowCancelButton(boolean flag)
        {
            mShowCancelButton = flag;
            return this;
        }

        public Builder()
        {
            zzRi = false;
            mShowCancelButton = true;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final boolean mShowCancelButton;
    final int mVersionCode;
    private final boolean zzRi;

    CredentialPickerConfig(int i, boolean flag, boolean flag1)
    {
        mVersionCode = i;
        zzRi = flag;
        mShowCancelButton = flag1;
    }

    private CredentialPickerConfig(Builder builder)
    {
        this(1, Builder.zza(builder), Builder.zzb(builder));
    }


    public int describeContents()
    {
        return 0;
    }

    public boolean shouldShowAddAccountButton()
    {
        return zzRi;
    }

    public boolean shouldShowCancelButton()
    {
        return mShowCancelButton;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
