// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            zzj

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    int state;
    private final int zzCY;
    String zzaBb;
    String zzaQM;
    String zzaQN;
    String zzaQO;
    String zzaQP;
    String zzaQQ;
    String zzaQR;
    String zzaQS;
    String zzaQT;
    ArrayList zzaQU;
    TimeInterval zzaQV;
    ArrayList zzaQW;
    String zzaQX;
    String zzaQY;
    ArrayList zzaQZ;
    boolean zzaRa;
    ArrayList zzaRb;
    ArrayList zzaRc;
    ArrayList zzaRd;
    LoyaltyPoints zzaRe;
    String zzhI;

    LoyaltyWalletObject()
    {
        zzCY = 4;
        zzaQU = zzkx.zzoP();
        zzaQW = zzkx.zzoP();
        zzaQZ = zzkx.zzoP();
        zzaRb = zzkx.zzoP();
        zzaRc = zzkx.zzoP();
        zzaRd = zzkx.zzoP();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int j, ArrayList arraylist, TimeInterval timeinterval, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, LoyaltyPoints loyaltypoints)
    {
        zzCY = i;
        zzhI = s;
        zzaQM = s1;
        zzaQN = s2;
        zzaQO = s3;
        zzaBb = s4;
        zzaQP = s5;
        zzaQQ = s6;
        zzaQR = s7;
        zzaQS = s8;
        zzaQT = s9;
        state = j;
        zzaQU = arraylist;
        zzaQV = timeinterval;
        zzaQW = arraylist1;
        zzaQX = s10;
        zzaQY = s11;
        zzaQZ = arraylist2;
        zzaRa = flag;
        zzaRb = arraylist3;
        zzaRc = arraylist4;
        zzaRd = arraylist5;
        zzaRe = loyaltypoints;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return zzaQM;
    }

    public String getAccountName()
    {
        return zzaBb;
    }

    public String getBarcodeAlternateText()
    {
        return zzaQP;
    }

    public String getBarcodeType()
    {
        return zzaQQ;
    }

    public String getBarcodeValue()
    {
        return zzaQR;
    }

    public String getId()
    {
        return zzhI;
    }

    public String getIssuerName()
    {
        return zzaQN;
    }

    public String getProgramName()
    {
        return zzaQO;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

}
