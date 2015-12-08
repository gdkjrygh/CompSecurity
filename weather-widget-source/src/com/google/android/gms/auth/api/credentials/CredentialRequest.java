// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zzc, CredentialPickerConfig

public final class CredentialRequest
    implements SafeParcelable
{
    public static final class Builder
    {

        private boolean zzRj;
        private String zzRk[];
        private CredentialPickerConfig zzRl;
        private CredentialPickerConfig zzRm;

        static boolean zza(Builder builder)
        {
            return builder.zzRj;
        }

        static String[] zzb(Builder builder)
        {
            return builder.zzRk;
        }

        static CredentialPickerConfig zzc(Builder builder)
        {
            return builder.zzRl;
        }

        static CredentialPickerConfig zzd(Builder builder)
        {
            return builder.zzRm;
        }

        public CredentialRequest build()
        {
            if (zzRk == null)
            {
                zzRk = new String[0];
            }
            if (!zzRj && zzRk.length == 0)
            {
                throw new IllegalStateException("At least one authentication method must be specified");
            } else
            {
                return new CredentialRequest(this);
            }
        }

        public transient Builder setAccountTypes(String as[])
        {
            zzRk = as;
            return this;
        }

        public Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
        {
            zzRm = credentialpickerconfig;
            return this;
        }

        public Builder setCredentialPickerConfig(CredentialPickerConfig credentialpickerconfig)
        {
            zzRl = credentialpickerconfig;
            return this;
        }

        public Builder setSupportsPasswordLogin(boolean flag)
        {
            zzRj = flag;
            return this;
        }

        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int mVersionCode;
    private final boolean zzRj;
    private final String zzRk[];
    private final CredentialPickerConfig zzRl;
    private final CredentialPickerConfig zzRm;

    CredentialRequest(int i, boolean flag, String as[], CredentialPickerConfig credentialpickerconfig, CredentialPickerConfig credentialpickerconfig1)
    {
        mVersionCode = i;
        zzRj = flag;
        zzRk = (String[])zzx.zzv(as);
        as = credentialpickerconfig;
        if (credentialpickerconfig == null)
        {
            as = (new CredentialPickerConfig.Builder()).build();
        }
        zzRl = as;
        as = credentialpickerconfig1;
        if (credentialpickerconfig1 == null)
        {
            as = (new CredentialPickerConfig.Builder()).build();
        }
        zzRm = as;
    }

    private CredentialRequest(Builder builder)
    {
        this(2, Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder));
    }


    public int describeContents()
    {
        return 0;
    }

    public String[] getAccountTypes()
    {
        return zzRk;
    }

    public CredentialPickerConfig getCredentialHintPickerConfig()
    {
        return zzRm;
    }

    public CredentialPickerConfig getCredentialPickerConfig()
    {
        return zzRl;
    }

    public boolean getSupportsPasswordLogin()
    {
        return zzRj;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
