// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            n

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    String OL;
    String OM;
    String OO;
    String OP;
    String OQ;
    String OR;
    String OS;
    String accountName;
    private final int jE;

    LoyaltyWalletObject()
    {
        jE = 3;
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7)
    {
        jE = i;
        OL = s;
        OM = s1;
        OO = s2;
        OP = s3;
        accountName = s4;
        OQ = s5;
        OR = s6;
        OS = s7;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getAccountId()
    {
        return OM;
    }

    public final String getAccountName()
    {
        return accountName;
    }

    public final String getBarcodeAlternateText()
    {
        return OQ;
    }

    public final String getBarcodeType()
    {
        return OR;
    }

    public final String getBarcodeValue()
    {
        return OS;
    }

    public final String getId()
    {
        return OL;
    }

    public final String getIssuerName()
    {
        return OO;
    }

    public final String getProgramName()
    {
        return OP;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel);
    }

}
