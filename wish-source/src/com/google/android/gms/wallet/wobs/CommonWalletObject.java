// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhq;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zza, TimeInterval

public class CommonWalletObject
    implements SafeParcelable
{
    public final class zza
    {

        final CommonWalletObject zzaKp;

        public zza zzex(String s)
        {
            zzaKp.zzga = s;
            return this;
        }

        public CommonWalletObject zzyS()
        {
            return zzaKp;
        }

        private zza()
        {
            zzaKp = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.zza();
    String name;
    int state;
    String zzaIC;
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
    String zzga;
    private final int zzzH;

    CommonWalletObject()
    {
        zzzH = 1;
        zzaIJ = zzhq.zznb();
        zzaIL = zzhq.zznb();
        zzaIO = zzhq.zznb();
        zzaIQ = zzhq.zznb();
        zzaIR = zzhq.zznb();
        zzaIS = zzhq.zznb();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, TimeInterval timeinterval, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        zzzH = i;
        zzga = s;
        zzaII = s1;
        name = s2;
        zzaIC = s3;
        zzaIE = s4;
        zzaIF = s5;
        zzaIG = s6;
        zzaIH = s7;
        state = j;
        zzaIJ = arraylist;
        zzaIK = timeinterval;
        zzaIL = arraylist1;
        zzaIM = s8;
        zzaIN = s9;
        zzaIO = arraylist2;
        zzaIP = flag;
        zzaIQ = arraylist3;
        zzaIR = arraylist4;
        zzaIS = arraylist5;
    }

    public static zza zzyR()
    {
        CommonWalletObject commonwalletobject = new CommonWalletObject();
        commonwalletobject.getClass();
        return commonwalletobject. new zza();
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
        com.google.android.gms.wallet.wobs.zza.zza(this, parcel, i);
    }

}
