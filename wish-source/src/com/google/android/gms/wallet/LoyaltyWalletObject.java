// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhq;
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
    String zzaIB;
    String zzaIC;
    String zzaID;
    String zzaIE;
    String zzaIF;
    String zzaIG;
    String zzaIH;
    String zzaII;
    ArrayList zzaIJ;
    TimeInterval zzaIK;
    ArrayList zzaIL;
    String zzaIM;
    String zzaIN;
    ArrayList zzaIO;
    boolean zzaIP;
    ArrayList zzaIQ;
    ArrayList zzaIR;
    ArrayList zzaIS;
    LoyaltyPoints zzaIT;
    String zzate;
    String zzga;
    private final int zzzH;

    LoyaltyWalletObject()
    {
        zzzH = 4;
        zzaIJ = zzhq.zznb();
        zzaIL = zzhq.zznb();
        zzaIO = zzhq.zznb();
        zzaIQ = zzhq.zznb();
        zzaIR = zzhq.zznb();
        zzaIS = zzhq.zznb();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int j, ArrayList arraylist, TimeInterval timeinterval, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, LoyaltyPoints loyaltypoints)
    {
        zzzH = i;
        zzga = s;
        zzaIB = s1;
        zzaIC = s2;
        zzaID = s3;
        zzate = s4;
        zzaIE = s5;
        zzaIF = s6;
        zzaIG = s7;
        zzaIH = s8;
        zzaII = s9;
        state = j;
        zzaIJ = arraylist;
        zzaIK = timeinterval;
        zzaIL = arraylist1;
        zzaIM = s10;
        zzaIN = s11;
        zzaIO = arraylist2;
        zzaIP = flag;
        zzaIQ = arraylist3;
        zzaIR = arraylist4;
        zzaIS = arraylist5;
        zzaIT = loyaltypoints;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

}
