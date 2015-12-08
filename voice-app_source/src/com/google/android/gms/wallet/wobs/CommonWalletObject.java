// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zza, TimeInterval

public class CommonWalletObject
    implements SafeParcelable
{
    public final class zza
    {

        final CommonWalletObject zzaSw;

        public CommonWalletObject zzAO()
        {
            return zzaSw;
        }

        public zza zzff(String s)
        {
            zzaSw.zzhI = s;
            return this;
        }

        private zza()
        {
            zzaSw = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.zza();
    String name;
    int state;
    private final int zzCY;
    String zzaQN;
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
    String zzhI;

    CommonWalletObject()
    {
        zzCY = 1;
        zzaQU = zzkx.zzoP();
        zzaQW = zzkx.zzoP();
        zzaQZ = zzkx.zzoP();
        zzaRb = zzkx.zzoP();
        zzaRc = zzkx.zzoP();
        zzaRd = zzkx.zzoP();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, TimeInterval timeinterval, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        zzCY = i;
        zzhI = s;
        zzaQT = s1;
        name = s2;
        zzaQN = s3;
        zzaQP = s4;
        zzaQQ = s5;
        zzaQR = s6;
        zzaQS = s7;
        state = j;
        zzaQU = arraylist;
        zzaQV = timeinterval;
        zzaQW = arraylist1;
        zzaQX = s8;
        zzaQY = s9;
        zzaQZ = arraylist2;
        zzaRa = flag;
        zzaRb = arraylist3;
        zzaRc = arraylist4;
        zzaRd = arraylist5;
    }

    public static zza zzAN()
    {
        CommonWalletObject commonwalletobject = new CommonWalletObject();
        commonwalletobject.getClass();
        return commonwalletobject. new zza();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzhI;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.zza.zza(this, parcel, i);
    }

}
