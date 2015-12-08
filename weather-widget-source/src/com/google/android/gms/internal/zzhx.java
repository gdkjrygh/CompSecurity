// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;
import java.util.List;

public class zzhx
{
    public static class zza
    {

        public final int count;
        public final String name;
        public final double zzHZ;
        public final double zzIa;
        public final double zzIb;

        public boolean equals(Object obj)
        {
            if (obj instanceof zza)
            {
                if (zzw.equal(name, ((zza) (obj = (zza)obj)).name) && zzHZ == ((zza) (obj)).zzHZ && zzIa == ((zza) (obj)).zzIa && count == ((zza) (obj)).count && Double.compare(zzIb, ((zza) (obj)).zzIb) == 0)
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            return zzw.hashCode(new Object[] {
                name, Double.valueOf(zzHZ), Double.valueOf(zzIa), Double.valueOf(zzIb), Integer.valueOf(count)
            });
        }

        public String toString()
        {
            return zzw.zzu(this).zzg("name", name).zzg("minBound", Double.valueOf(zzIa)).zzg("maxBound", Double.valueOf(zzHZ)).zzg("percent", Double.valueOf(zzIb)).zzg("count", Integer.valueOf(count)).toString();
        }

        public zza(String s, double d, double d1, double d2, 
                int i)
        {
            name = s;
            zzIa = d;
            zzHZ = d1;
            zzIb = d2;
            count = i;
        }
    }

    public static class zzb
    {

        private final List zzIc = new ArrayList();
        private final List zzId = new ArrayList();
        private final List zzIe = new ArrayList();

        static List zza(zzb zzb1)
        {
            return zzb1.zzId;
        }

        static List zzb(zzb zzb1)
        {
            return zzb1.zzIc;
        }

        static List zzc(zzb zzb1)
        {
            return zzb1.zzIe;
        }

        public zzb zza(String s, double d, double d1)
        {
            int i = 0;
            do
            {
                double d2;
                double d3;
                if (i < zzIc.size())
                {
                    d2 = ((Double)zzIe.get(i)).doubleValue();
                    d3 = ((Double)zzId.get(i)).doubleValue();
                    break MISSING_BLOCK_LABEL_55;
                }
                do
                {
                    zzIc.add(i, s);
                    zzIe.add(i, Double.valueOf(d));
                    zzId.add(i, Double.valueOf(d1));
                    return this;
                } while (d < d2 || d2 == d && d1 < d3);
                i++;
            } while (true);
        }

        public zzhx zzgz()
        {
            return new zzhx(this);
        }

        public zzb()
        {
        }
    }


    private final String zzHU[];
    private final double zzHV[];
    private final double zzHW[];
    private final int zzHX[];
    private int zzHY;

    private zzhx(zzb zzb1)
    {
        int i = zzb.zza(zzb1).size();
        zzHU = (String[])zzb.zzb(zzb1).toArray(new String[i]);
        zzHV = zzc(zzb.zza(zzb1));
        zzHW = zzc(zzb.zzc(zzb1));
        zzHX = new int[i];
        zzHY = 0;
    }


    private double[] zzc(List list)
    {
        double ad[] = new double[list.size()];
        for (int i = 0; i < ad.length; i++)
        {
            ad[i] = ((Double)list.get(i)).doubleValue();
        }

        return ad;
    }

    public List getBuckets()
    {
        ArrayList arraylist = new ArrayList(zzHU.length);
        for (int i = 0; i < zzHU.length; i++)
        {
            arraylist.add(new zza(zzHU[i], zzHW[i], zzHV[i], (double)zzHX[i] / (double)zzHY, zzHX[i]));
        }

        return arraylist;
    }

    public void zza(double d)
    {
        zzHY = zzHY + 1;
        int i = 0;
        do
        {
label0:
            {
                if (i < zzHW.length)
                {
                    if (zzHW[i] <= d && d < zzHV[i])
                    {
                        int ai[] = zzHX;
                        ai[i] = ai[i] + 1;
                    }
                    if (d >= zzHW[i])
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }
}
