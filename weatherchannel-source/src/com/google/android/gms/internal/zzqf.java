// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzae

public class zzqf
{
    public static class zza
    {

        private final zzag.zza zzaNw;
        private final Map zzaPy;

        public static zzb zzAm()
        {
            return new zzb();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Properties: ").append(zzAn()).append(" pushAfterEvaluate: ").append(zzaNw).toString();
        }

        public Map zzAn()
        {
            return Collections.unmodifiableMap(zzaPy);
        }

        public void zza(String s, zzag.zza zza1)
        {
            zzaPy.put(s, zza1);
        }

        public zzag.zza zzzs()
        {
            return zzaNw;
        }

        private zza(Map map, zzag.zza zza1)
        {
            zzaPy = map;
            zzaNw = zza1;
        }

    }

    public static class zzb
    {

        private zzag.zza zzaNw;
        private final Map zzaPy;

        public zza zzAo()
        {
            return new zza(zzaPy, zzaNw);
        }

        public zzb zzb(String s, zzag.zza zza1)
        {
            zzaPy.put(s, zza1);
            return this;
        }

        public zzb zzq(zzag.zza zza1)
        {
            zzaNw = zza1;
            return this;
        }

        private zzb()
        {
            zzaPy = new HashMap();
        }

    }

    public static class zzc
    {

        private final String zzTQ;
        private final Map zzaPA;
        private final int zzaPB;
        private final List zzaPz;

        public static zzd zzAp()
        {
            return new zzd();
        }

        public String getVersion()
        {
            return zzTQ;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Rules: ").append(zzAq()).append("  Macros: ").append(zzaPA).toString();
        }

        public List zzAq()
        {
            return zzaPz;
        }

        public Map zzAr()
        {
            return zzaPA;
        }

        private zzc(List list, Map map, String s, int i)
        {
            zzaPz = Collections.unmodifiableList(list);
            zzaPA = Collections.unmodifiableMap(map);
            zzTQ = s;
            zzaPB = i;
        }

    }

    public static class zzd
    {

        private String zzTQ;
        private final Map zzaPA;
        private int zzaPB;
        private final List zzaPz;

        public zzc zzAs()
        {
            return new zzc(zzaPz, zzaPA, zzTQ, zzaPB);
        }

        public zzd zzb(zze zze1)
        {
            zzaPz.add(zze1);
            return this;
        }

        public zzd zzc(zza zza1)
        {
            String s = zzdf.zzg((zzag.zza)zza1.zzAn().get(zzae.zzfr.toString()));
            List list = (List)zzaPA.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                zzaPA.put(s, obj);
            }
            ((List) (obj)).add(zza1);
            return this;
        }

        public zzd zzeV(String s)
        {
            zzTQ = s;
            return this;
        }

        public zzd zzjb(int i)
        {
            zzaPB = i;
            return this;
        }

        private zzd()
        {
            zzaPz = new ArrayList();
            zzaPA = new HashMap();
            zzTQ = "";
            zzaPB = 0;
        }

    }

    public static class zze
    {

        private final List zzaPC;
        private final List zzaPD;
        private final List zzaPE;
        private final List zzaPF;
        private final List zzaPG;
        private final List zzaPH;
        private final List zzaPI;
        private final List zzaPJ;
        private final List zzaPK;
        private final List zzaPL;

        public static zzf zzAt()
        {
            return new zzf();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Positive predicates: ").append(zzAu()).append("  Negative predicates: ").append(zzAv()).append("  Add tags: ").append(zzAw()).append("  Remove tags: ").append(zzAx()).append("  Add macros: ").append(zzAy()).append("  Remove macros: ").append(zzAD()).toString();
        }

        public List zzAA()
        {
            return zzaPJ;
        }

        public List zzAB()
        {
            return zzaPK;
        }

        public List zzAC()
        {
            return zzaPL;
        }

        public List zzAD()
        {
            return zzaPH;
        }

        public List zzAu()
        {
            return zzaPC;
        }

        public List zzAv()
        {
            return zzaPD;
        }

        public List zzAw()
        {
            return zzaPE;
        }

        public List zzAx()
        {
            return zzaPF;
        }

        public List zzAy()
        {
            return zzaPG;
        }

        public List zzAz()
        {
            return zzaPI;
        }

        private zze(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            zzaPC = Collections.unmodifiableList(list);
            zzaPD = Collections.unmodifiableList(list1);
            zzaPE = Collections.unmodifiableList(list2);
            zzaPF = Collections.unmodifiableList(list3);
            zzaPG = Collections.unmodifiableList(list4);
            zzaPH = Collections.unmodifiableList(list5);
            zzaPI = Collections.unmodifiableList(list6);
            zzaPJ = Collections.unmodifiableList(list7);
            zzaPK = Collections.unmodifiableList(list8);
            zzaPL = Collections.unmodifiableList(list9);
        }

    }

    public static class zzf
    {

        private final List zzaPC;
        private final List zzaPD;
        private final List zzaPE;
        private final List zzaPF;
        private final List zzaPG;
        private final List zzaPH;
        private final List zzaPI;
        private final List zzaPJ;
        private final List zzaPK;
        private final List zzaPL;

        public zze zzAE()
        {
            return new zze(zzaPC, zzaPD, zzaPE, zzaPF, zzaPG, zzaPH, zzaPI, zzaPJ, zzaPK, zzaPL);
        }

        public zzf zzd(zza zza1)
        {
            zzaPC.add(zza1);
            return this;
        }

        public zzf zze(zza zza1)
        {
            zzaPD.add(zza1);
            return this;
        }

        public zzf zzeW(String s)
        {
            zzaPK.add(s);
            return this;
        }

        public zzf zzeX(String s)
        {
            zzaPL.add(s);
            return this;
        }

        public zzf zzeY(String s)
        {
            zzaPI.add(s);
            return this;
        }

        public zzf zzeZ(String s)
        {
            zzaPJ.add(s);
            return this;
        }

        public zzf zzf(zza zza1)
        {
            zzaPE.add(zza1);
            return this;
        }

        public zzf zzg(zza zza1)
        {
            zzaPF.add(zza1);
            return this;
        }

        public zzf zzh(zza zza1)
        {
            zzaPG.add(zza1);
            return this;
        }

        public zzf zzi(zza zza1)
        {
            zzaPH.add(zza1);
            return this;
        }

        private zzf()
        {
            zzaPC = new ArrayList();
            zzaPD = new ArrayList();
            zzaPE = new ArrayList();
            zzaPF = new ArrayList();
            zzaPG = new ArrayList();
            zzaPH = new ArrayList();
            zzaPI = new ArrayList();
            zzaPJ = new ArrayList();
            zzaPK = new ArrayList();
            zzaPL = new ArrayList();
        }

    }

    public static class zzg extends Exception
    {

        public zzg(String s)
        {
            super(s);
        }
    }


    private static zzag.zza zza(int i, zzaf.zzf zzf1, zzag.zza azza[], Set set)
        throws zzg
    {
        Object obj;
        zzag.zza zza1;
        int j1;
        int i2;
        int l2;
        i2 = 0;
        l2 = 0;
        j1 = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            zzeT((new StringBuilder()).append("Value cycle detected.  Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        zza1 = (zzag.zza)zza(((Object []) (zzf1.zzic)), i, "values");
        if (azza[i] != null)
        {
            return azza[i];
        }
        obj = null;
        set.add(Integer.valueOf(i));
        zza1.type;
        JVM INSTR tableswitch 1 8: default 152
    //                   1 653
    //                   2 199
    //                   3 291
    //                   4 525
    //                   5 653
    //                   6 653
    //                   7 557
    //                   8 653;
           goto _L1 _L2 _L3 _L4 _L5 _L2 _L2 _L6 _L2
_L1:
        if (obj == null)
        {
            zzeT((new StringBuilder()).append("Invalid value: ").append(zza1).toString());
        }
        azza[i] = ((zzag.zza) (obj));
        set.remove(Integer.valueOf(i));
        return ((zzag.zza) (obj));
_L3:
        obj = zzp(zza1);
        zzag.zza zza2 = zzo(zza1);
        zza2.zziS = new zzag.zza[((zzaf.zzh) (obj)).zziD.length];
        int ai[] = ((zzaf.zzh) (obj)).zziD;
        i2 = ai.length;
        int j = 0;
        do
        {
            obj = zza2;
            if (j1 >= i2)
            {
                continue; /* Loop/switch isn't completed */
            }
            l2 = ai[j1];
            zza2.zziS[j] = zza(l2, zzf1, azza, set);
            j1++;
            j++;
        } while (true);
_L4:
        zzag.zza zza3 = zzo(zza1);
        obj = zzp(zza1);
        if (((zzaf.zzh) (obj)).zziE.length != ((zzaf.zzh) (obj)).zziF.length)
        {
            zzeT((new StringBuilder()).append("Uneven map keys (").append(((zzaf.zzh) (obj)).zziE.length).append(") and map values (").append(((zzaf.zzh) (obj)).zziF.length).append(")").toString());
        }
        zza3.zziT = new zzag.zza[((zzaf.zzh) (obj)).zziE.length];
        zza3.zziU = new zzag.zza[((zzaf.zzh) (obj)).zziE.length];
        int ai1[] = ((zzaf.zzh) (obj)).zziE;
        l2 = ai1.length;
        int k1 = 0;
        for (int k = 0; k1 < l2; k++)
        {
            int j3 = ai1[k1];
            zza3.zziT[k] = zza(j3, zzf1, azza, set);
            k1++;
        }

        ai1 = ((zzaf.zzh) (obj)).zziF;
        l2 = ai1.length;
        int l = 0;
        k1 = i2;
        do
        {
            obj = zza3;
            if (k1 >= l2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int j2 = ai1[k1];
            zza3.zziU[l] = zza(j2, zzf1, azza, set);
            k1++;
            l++;
        } while (true);
_L5:
        obj = zzo(zza1);
        obj.zziV = zzdf.zzg(zza(zzp(zza1).zziI, zzf1, azza, set));
        continue; /* Loop/switch isn't completed */
_L6:
        zzag.zza zza4 = zzo(zza1);
        obj = zzp(zza1);
        zza4.zziZ = new zzag.zza[((zzaf.zzh) (obj)).zziH.length];
        int ai2[] = ((zzaf.zzh) (obj)).zziH;
        int k2 = ai2.length;
        int i1 = 0;
        int l1 = l2;
        do
        {
            obj = zza4;
            if (l1 >= k2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int i3 = ai2[l1];
            zza4.zziZ[i1] = zza(i3, zzf1, azza, set);
            l1++;
            i1++;
        } while (true);
_L2:
        obj = zza1;
        if (true) goto _L1; else goto _L7
_L7:
    }

    private static zza zza(zzaf.zzb zzb1, zzaf.zzf zzf1, zzag.zza azza[], int i)
        throws zzg
    {
        zzb zzb2 = zza.zzAm();
        zzb1 = zzb1.zzhN;
        int j = zzb1.length;
        i = 0;
        while (i < j) 
        {
            int k = zzb1[i];
            Object obj = (zzaf.zze)zza(((Object []) (zzf1.zzid)), Integer.valueOf(k).intValue(), "properties");
            String s = (String)zza(((Object []) (zzf1.zzib)), ((zzaf.zze) (obj)).key, "keys");
            obj = (zzag.zza)zza(((Object []) (azza)), ((zzaf.zze) (obj)).value, "values");
            if (zzae.zzgs.toString().equals(s))
            {
                zzb2.zzq(((zzag.zza) (obj)));
            } else
            {
                zzb2.zzb(s, ((zzag.zza) (obj)));
            }
            i++;
        }
        return zzb2.zzAo();
    }

    private static zze zza(zzaf.zzg zzg1, List list, List list1, List list2, zzaf.zzf zzf1)
    {
        zzf zzf2 = zze.zzAt();
        int ai[] = zzg1.zzir;
        int k2 = ai.length;
        for (int i = 0; i < k2; i++)
        {
            zzf2.zzd((zza)list2.get(Integer.valueOf(ai[i]).intValue()));
        }

        ai = zzg1.zzis;
        k2 = ai.length;
        for (int j = 0; j < k2; j++)
        {
            zzf2.zze((zza)list2.get(Integer.valueOf(ai[j]).intValue()));
        }

        list2 = zzg1.zzit;
        k2 = list2.length;
        for (int k = 0; k < k2; k++)
        {
            zzf2.zzf((zza)list.get(Integer.valueOf(list2[k]).intValue()));
        }

        list2 = zzg1.zziv;
        k2 = list2.length;
        for (int l = 0; l < k2; l++)
        {
            int l2 = list2[l];
            zzf2.zzeW(zzf1.zzic[Integer.valueOf(l2).intValue()].zziR);
        }

        list2 = zzg1.zziu;
        k2 = list2.length;
        for (int i1 = 0; i1 < k2; i1++)
        {
            zzf2.zzg((zza)list.get(Integer.valueOf(list2[i1]).intValue()));
        }

        list = zzg1.zziw;
        k2 = list.length;
        for (int j1 = 0; j1 < k2; j1++)
        {
            int i3 = list[j1];
            zzf2.zzeX(zzf1.zzic[Integer.valueOf(i3).intValue()].zziR);
        }

        list = zzg1.zzix;
        k2 = list.length;
        for (int k1 = 0; k1 < k2; k1++)
        {
            zzf2.zzh((zza)list1.get(Integer.valueOf(list[k1]).intValue()));
        }

        list = zzg1.zziz;
        k2 = list.length;
        for (int l1 = 0; l1 < k2; l1++)
        {
            int j3 = list[l1];
            zzf2.zzeY(zzf1.zzic[Integer.valueOf(j3).intValue()].zziR);
        }

        list = zzg1.zziy;
        k2 = list.length;
        for (int i2 = 0; i2 < k2; i2++)
        {
            zzf2.zzi((zza)list1.get(Integer.valueOf(list[i2]).intValue()));
        }

        zzg1 = zzg1.zziA;
        k2 = zzg1.length;
        for (int j2 = 0; j2 < k2; j2++)
        {
            int k3 = zzg1[j2];
            zzf2.zzeZ(zzf1.zzic[Integer.valueOf(k3).intValue()].zziR);
        }

        return zzf2.zzAE();
    }

    private static Object zza(Object aobj[], int i, String s)
        throws zzg
    {
        if (i < 0 || i >= aobj.length)
        {
            zzeT((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    public static zzc zzb(zzaf.zzf zzf1)
        throws zzg
    {
        boolean flag = false;
        Object aobj[] = new zzag.zza[zzf1.zzic.length];
        for (int i = 0; i < zzf1.zzic.length; i++)
        {
            zza(i, zzf1, ((zzag.zza []) (aobj)), new HashSet(0));
        }

        zzd zzd1 = zzc.zzAp();
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < zzf1.zzif.length; j++)
        {
            arraylist.add(zza(zzf1.zzif[j], zzf1, ((zzag.zza []) (aobj)), j));
        }

        ArrayList arraylist1 = new ArrayList();
        for (int k = 0; k < zzf1.zzig.length; k++)
        {
            arraylist1.add(zza(zzf1.zzig[k], zzf1, ((zzag.zza []) (aobj)), k));
        }

        ArrayList arraylist2 = new ArrayList();
        for (int l = 0; l < zzf1.zzie.length; l++)
        {
            zza zza1 = zza(zzf1.zzie[l], zzf1, ((zzag.zza []) (aobj)), l);
            zzd1.zzc(zza1);
            arraylist2.add(zza1);
        }

        aobj = zzf1.zzih;
        int j1 = aobj.length;
        for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            zzd1.zzb(zza(aobj[i1], arraylist, arraylist2, arraylist1, zzf1));
        }

        zzd1.zzeV(zzf1.version);
        zzd1.zzjb(zzf1.zzip);
        return zzd1.zzAs();
    }

    public static void zzc(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }

    private static void zzeT(String s)
        throws zzg
    {
        zzbg.zzaz(s);
        throw new zzg(s);
    }

    public static zzag.zza zzo(zzag.zza zza1)
    {
        zzag.zza zza2 = new zzag.zza();
        zza2.type = zza1.type;
        zza2.zzja = (int[])zza1.zzja.clone();
        if (zza1.zzjb)
        {
            zza2.zzjb = zza1.zzjb;
        }
        return zza2;
    }

    private static zzaf.zzh zzp(zzag.zza zza1)
        throws zzg
    {
        if ((zzaf.zzh)zza1.zza(zzaf.zzh.zziB) == null)
        {
            zzeT((new StringBuilder()).append("Expected a ServingValue and didn't get one. Value is: ").append(zza1).toString());
        }
        return (zzaf.zzh)zza1.zza(zzaf.zzh.zziB);
    }
}
