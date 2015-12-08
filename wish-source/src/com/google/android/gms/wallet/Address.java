// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zza

public final class Address
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    String name;
    String zzBc;
    String zzaHQ;
    String zzaHR;
    String zzapo;
    String zzapp;
    String zzapq;
    String zzapv;
    String zzapx;
    boolean zzapy;
    String zzapz;
    private final int zzzH;

    Address()
    {
        zzzH = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        zzzH = i;
        name = s;
        zzapo = s1;
        zzapp = s2;
        zzapq = s3;
        zzBc = s4;
        zzaHQ = s5;
        zzaHR = s6;
        zzapv = s7;
        zzapx = s8;
        zzapy = flag;
        zzapz = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return zzapo;
    }

    public String getAddress2()
    {
        return zzapp;
    }

    public String getCity()
    {
        return zzaHQ;
    }

    public String getCountryCode()
    {
        return zzBc;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return zzapx;
    }

    public String getPostalCode()
    {
        return zzapv;
    }

    public String getState()
    {
        return zzaHR;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
