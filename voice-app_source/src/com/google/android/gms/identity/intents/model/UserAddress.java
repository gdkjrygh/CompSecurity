// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            zzb

public final class UserAddress
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    String name;
    private final int zzCY;
    String zzEr;
    String zzawA;
    String zzawB;
    String zzawC;
    String zzawD;
    String zzawE;
    String zzawF;
    String zzawG;
    String zzawH;
    String zzawI;
    String zzawJ;
    boolean zzawK;
    String zzawL;
    String zzawM;

    UserAddress()
    {
        zzCY = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        zzCY = i;
        name = s;
        zzawA = s1;
        zzawB = s2;
        zzawC = s3;
        zzawD = s4;
        zzawE = s5;
        zzawF = s6;
        zzawG = s7;
        zzEr = s8;
        zzawH = s9;
        zzawI = s10;
        zzawJ = s11;
        zzawK = flag;
        zzawL = s12;
        zzawM = s13;
    }

    public static UserAddress fromIntent(Intent intent)
    {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS"))
        {
            return null;
        } else
        {
            return (UserAddress)intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
        }
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

    public String getAddress4()
    {
        return zzawD;
    }

    public String getAddress5()
    {
        return zzawE;
    }

    public String getAdministrativeArea()
    {
        return zzawF;
    }

    public String getCompanyName()
    {
        return zzawL;
    }

    public String getCountryCode()
    {
        return zzEr;
    }

    public String getEmailAddress()
    {
        return zzawM;
    }

    public String getLocality()
    {
        return zzawG;
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

    public String getSortingCode()
    {
        return zzawI;
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
        zzb.zza(this, parcel, i);
    }

}
