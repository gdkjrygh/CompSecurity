// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzi, Feature

public class RegisterSectionInfo
    implements SafeParcelable
{
    public static final class zza
    {

        private final String mName;
        private boolean zzNA;
        private int zzNB;
        private boolean zzNC;
        private String zzND;
        private final List zzNE = new ArrayList();
        private BitSet zzNF;
        private String zzNG;
        private String zzNz;

        public zza zzJ(boolean flag)
        {
            zzNA = flag;
            return this;
        }

        public zza zzK(boolean flag)
        {
            zzNC = flag;
            return this;
        }

        public zza zzaj(int i)
        {
            if (zzNF == null)
            {
                zzNF = new BitSet();
            }
            zzNF.set(i);
            return this;
        }

        public zza zzbr(String s)
        {
            zzNz = s;
            return this;
        }

        public zza zzbs(String s)
        {
            zzNG = s;
            return this;
        }

        public RegisterSectionInfo zzkM()
        {
            int i = 0;
            int ai[] = null;
            if (zzNF != null)
            {
                int ai1[] = new int[zzNF.cardinality()];
                int j = zzNF.nextSetBit(0);
                do
                {
                    ai = ai1;
                    if (j < 0)
                    {
                        break;
                    }
                    ai1[i] = j;
                    j = zzNF.nextSetBit(j + 1);
                    i++;
                } while (true);
            }
            return new RegisterSectionInfo(mName, zzNz, zzNA, zzNB, zzNC, zzND, (Feature[])zzNE.toArray(new Feature[zzNE.size()]), ai, zzNG);
        }

        public zza(String s)
        {
            mName = s;
            zzNB = 1;
        }
    }


    public static final zzi CREATOR = new zzi();
    public final String name;
    public final int weight;
    final int zzCY;
    public final String zzNs;
    public final boolean zzNt;
    public final boolean zzNu;
    public final String zzNv;
    public final Feature zzNw[];
    final int zzNx[];
    public final String zzNy;

    RegisterSectionInfo(int i, String s, String s1, boolean flag, int j, boolean flag1, String s2, 
            Feature afeature[], int ai[], String s3)
    {
        zzCY = i;
        name = s;
        zzNs = s1;
        zzNt = flag;
        weight = j;
        zzNu = flag1;
        zzNv = s2;
        zzNw = afeature;
        zzNx = ai;
        zzNy = s3;
    }

    RegisterSectionInfo(String s, String s1, boolean flag, int i, boolean flag1, String s2, Feature afeature[], 
            int ai[], String s3)
    {
        this(2, s, s1, flag, i, flag1, s2, afeature, ai, s3);
    }

    public int describeContents()
    {
        zzi zzi1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi zzi1 = CREATOR;
        zzi.zza(this, parcel, i);
    }

}
