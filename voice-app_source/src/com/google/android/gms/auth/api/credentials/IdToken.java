// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zzc

public final class IdToken
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int zzCY;
    private final String zzOX;
    private final String zzPa;

    IdToken(int i, String s, String s1)
    {
        zzCY = i;
        zzOX = s;
        zzPa = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountType()
    {
        return zzOX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public String zzlc()
    {
        return zzPa;
    }

}
