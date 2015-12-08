// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            zzb

public class ProxyRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public static final int zzPh = 0;
    public static final int zzPi = 1;
    public static final int zzPj = 2;
    public static final int zzPk = 3;
    public static final int zzPl = 4;
    public static final int zzPm = 5;
    public static final int zzPn = 6;
    public static final int zzPo = 7;
    public static final int zzPp = 7;
    final int versionCode;
    public final int zzPq;
    public final long zzPr;
    public final byte zzPs[];
    Bundle zzPt;
    public final String zzzf;

    ProxyRequest(int i, String s, int j, long l, byte abyte0[], Bundle bundle)
    {
        versionCode = i;
        zzzf = s;
        zzPq = j;
        zzPr = l;
        zzPs = abyte0;
        zzPt = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ProxyRequest[ url: ").append(zzzf).append(", method: ").append(zzPq).append(" ]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
