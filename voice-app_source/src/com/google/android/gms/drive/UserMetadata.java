// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            zzj

public class UserMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final int zzCY;
    final String zzadH;
    final String zzadI;
    final String zzadJ;
    final boolean zzadK;
    final String zzadL;

    UserMetadata(int i, String s, String s1, String s2, boolean flag, String s3)
    {
        zzCY = i;
        zzadH = s;
        zzadI = s1;
        zzadJ = s2;
        zzadK = flag;
        zzadL = s3;
    }

    public UserMetadata(String s, String s1, String s2, boolean flag, String s3)
    {
        this(1, s, s1, s2, flag, s3);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[] {
            zzadH, zzadI, zzadJ, Boolean.valueOf(zzadK), zzadL
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

}
