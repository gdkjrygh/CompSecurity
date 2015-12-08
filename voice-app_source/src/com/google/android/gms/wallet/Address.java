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
    private final int zzCY;
    String zzEr;
    String zzaQd;
    String zzaQe;
    String zzawA;
    String zzawB;
    String zzawC;
    String zzawH;
    String zzawJ;
    boolean zzawK;
    String zzawL;

    Address()
    {
        zzCY = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        zzCY = i;
        name = s;
        zzawA = s1;
        zzawB = s2;
        zzawC = s3;
        zzEr = s4;
        zzaQd = s5;
        zzaQe = s6;
        zzawH = s7;
        zzawJ = s8;
        zzawK = flag;
        zzawL = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return zzawA;
    }

    public String getAddress2()
    {
        return zzawB;
    }

    public String getAddress3()
    {
        return zzawC;
    }

    public String getCity()
    {
        return zzaQd;
    }

    public String getCompanyName()
    {
        return zzawL;
    }

    public String getCountryCode()
    {
        return zzEr;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return zzawJ;
    }

    public String getPostalCode()
    {
        return zzawH;
    }

    public String getState()
    {
        return zzaQe;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean isPostBox()
    {
        return zzawK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
