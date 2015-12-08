// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            zze

public final class SignInConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    final int versionCode;
    private final String zzRT;
    private String zzRU;
    private EmailSignInConfig zzRV;
    private GoogleSignInConfig zzRW;
    private FacebookSignInConfig zzRX;
    private String zzRY;

    SignInConfiguration(int i, String s, String s1, EmailSignInConfig emailsigninconfig, GoogleSignInConfig googlesigninconfig, FacebookSignInConfig facebooksigninconfig, String s2)
    {
        versionCode = i;
        zzRT = zzx.zzcs(s);
        zzRU = s1;
        zzRV = emailsigninconfig;
        zzRW = googlesigninconfig;
        zzRX = facebooksigninconfig;
        zzRY = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public String zzlF()
    {
        return zzRT;
    }

    public String zzlG()
    {
        return zzRU;
    }

    public EmailSignInConfig zzlH()
    {
        return zzRV;
    }

    public GoogleSignInConfig zzlI()
    {
        return zzRW;
    }

    public FacebookSignInConfig zzlJ()
    {
        return zzRX;
    }

    public String zzlK()
    {
        return zzRY;
    }

}
