// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            StringToIntConverter, zzc

public static final class zzaeP
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    final int versionCode;
    final String zzaeO;
    final int zzaeP;

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }


    (int i, String s, int j)
    {
        versionCode = i;
        zzaeO = s;
        zzaeP = j;
    }

    zzaeP(String s, int i)
    {
        versionCode = 1;
        zzaeO = s;
        zzaeP = i;
    }
}
