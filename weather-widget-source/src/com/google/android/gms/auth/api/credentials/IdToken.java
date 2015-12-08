// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zzd

public final class IdToken
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    final int mVersionCode;
    private final String zzRf;
    private final String zzRn;

    IdToken(int i, String s, String s1)
    {
        mVersionCode = i;
        zzRf = s;
        zzRn = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountType()
    {
        return zzRf;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public String zzlv()
    {
        return zzRn;
    }

}
