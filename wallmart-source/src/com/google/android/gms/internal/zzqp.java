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

public class zzqp
{
    public static class zza
    {

        private final zzag.zza zzaRQ;
        private final Map zzaTS;

        public static zzb zzBC()
        {
            return new zzb();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Properties: ").append(zzBD()).append(" pushAfterEvaluate: ").append(zzaRQ).toString();
        }

        public zzag.zza zzAI()
        {
            return zzaRQ;
        }

        public Map zzBD()
        {
            return Collections.unmodifiableMap(zzaTS);
        }

        public void zza(String s, zzag.zza zza1)
        {
            zzaTS.put(s, zza1);
        }

        private zza(Map map, zzag.zza zza1)
        {
            zzaTS = map;
            zzaRQ = zza1;
        }

    }

    public static class zzb
    {

        private zzag.zza zzaRQ;
        private final Map zzaTS;

        public zza zzBE()
        {
            return new zza(zzaTS, zzaRQ);
        }

        public zzb zzb(String s, zzag.zza zza1)
        {
            zzaTS.put(s, zza1);
            return this;
        }

        public zzb zzq(zzag.zza zza1)
        {
            zzaRQ = zza1;
            return this;
        }

        private zzb()
        {
            zzaTS = new HashMap();
        }

    }

    public static class zzc
    {

        private final String zzWs;
        private final List zzaTT;
        private final Map zzaTU;
        private final int zzaTV;

        public static zzd zzBF()
        {
            return new zzd();
        }

        public String getVersion()
        {
            return zzWs;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Rules: ").append(zzBG()).append("  Macros: ").append(zzaTU).toString();
        }

        public List zzBG()
        {
            return zzaTT;
        }

        public Map zzBH()
        {
            return zzaTU;
        }

        private zzc(List list, Map map, String s, int i)
        {
            zzaTT = Collections.unmodifiableList(list);
            zzaTU = Collections.unmodifiableMap(map);
            zzWs = s;
            zzaTV = i;
        }

    }

    public static class zzd
    {

        private String zzWs;
        private final List zzaTT;
        private final Map zzaTU;
        private int zzaTV;

        public zzc zzBI()
        {
            return new zzc(zzaTT, zzaTU, zzWs, zzaTV);
        }

        public zzd zzb(zze zze1)
        {
            zzaTT.add(zze1);
            return this;
        }

        public zzd zzc(zza zza1)
        {
            String s = zzdf.zzg((zzag.zza)zza1.zzBD().get(zzae.zzfu.toString()));
            List list = (List)zzaTU.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                zzaTU.put(s, obj);
            }
            ((List) (obj)).add(zza1);
            return this;
        }

        public zzd zzfk(String s)
        {
            zzWs = s;
            return this;
        }

        public zzd zzjm(int i)
        {
            zzaTV = i;
            return this;
        }

        private zzd()
        {
            zzaTT = new ArrayList();
            zzaTU = new HashMap();
            zzWs = "";
            zzaTV = 0;
        }

    }

    public static class zze
    {

        private final List zzaTW;
        private final List zzaTX;
        private final List zzaTY;
        private final List zzaTZ;
        private final List zzaUa;
        private final List zzaUb;
        private final List zzaUc;
        private final List zzaUd;
        private final List zzaUe;
        private final List zzaUf;

        public static zzf zzBJ()
        {
            return new zzf();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Positive predicates: ").append(zzBK()).append("  Negative predicates: ").append(zzBL()).append("  Add tags: ").append(zzBM()).append("  Remove tags: ").append(zzBN()).append("  Add macros: ").append(zzBO()).append("  Remove macros: ").append(zzBT()).toString();
        }

        public List zzBK()
        {
            return zzaTW;
        }

        public List zzBL()
        {
            return zzaTX;
        }

        public List zzBM()
        {
            return zzaTY;
        }

        public List zzBN()
        {
            return zzaTZ;
        }

        public List zzBO()
        {
            return zzaUa;
        }

        public List zzBP()
        {
            return zzaUc;
        }

        public List zzBQ()
        {
            return zzaUd;
        }

        public List zzBR()
        {
            return zzaUe;
        }

        public List zzBS()
        {
            return zzaUf;
        }

        public List zzBT()
        {
            return zzaUb;
        }

        private zze(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            zzaTW = Collections.unmodifiableList(list);
            zzaTX = Collections.unmodifiableList(list1);
            zzaTY = Collections.unmodifiableList(list2);
            zzaTZ = Collections.unmodifiableList(list3);
            zzaUa = Collections.unmodifiableList(list4);
            zzaUb = Collections.unmodifiableList(list5);
            zzaUc = Collections.unmodifiableList(list6);
            zzaUd = Collections.unmodifiableList(list7);
            zzaUe = Collections.unmodifiableList(list8);
            zzaUf = Collections.unmodifiableList(list9);
        }

    }

    public static class zzf
    {

        private final List zzaTW;
        private final List zzaTX;
        private final List zzaTY;
        private final List zzaTZ;
        private final List zzaUa;
        private final List zzaUb;
        private final List zzaUc;
        private final List zzaUd;
        private final List zzaUe;
        private final List zzaUf;

        public zze zzBU()
        {
            return new zze(zzaTW, zzaTX, zzaTY, zzaTZ, zzaUa, zzaUb, zzaUc, zzaUd, zzaUe, zzaUf);
        }

        public zzf zzd(zza zza1)
        {
            zzaTW.add(zza1);
            return this;
        }

        public zzf zze(zza zza1)
        {
            zzaTX.add(zza1);
            return this;
        }

        public zzf zzf(zza zza1)
        {
            zzaTY.add(zza1);
            return this;
        }

        public zzf zzfl(String s)
        {
            zzaUe.add(s);
            return this;
        }

        public zzf zzfm(String s)
        {
            zzaUf.add(s);
            return this;
        }

        public zzf zzfn(String s)
        {
            zzaUc.add(s);
            return this;
        }

        public zzf zzfo(String s)
        {
            zzaUd.add(s);
            return this;
        }

        public zzf zzg(zza zza1)
        {
            zzaTZ.add(zza1);
            return this;
        }

        public zzf zzh(zza zza1)
        {
            zzaUa.add(zza1);
            return this;
        }

        public zzf zzi(zza zza1)
        {
            zzaUb.add(zza1);
            return this;
        }

        private zzf()
        {
            zzaTW = new ArrayList();
            zzaTX = new ArrayList();
            zzaTY = new ArrayList();
            zzaTZ = new ArrayList();
            zzaUa = new ArrayList();
            zzaUb = new ArrayList();
            zzaUc = new ArrayList();
            zzaUd = new ArrayList();
            zzaUe = new ArrayList();
            zzaUf = new ArrayList();
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
            zzfi((new StringBuilder()).append("Value cycle detected.  Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        zza1 = (zzag.zza)zza(((Object []) (zzf1.zzif)), i, "values");
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
            zzfi((new StringBuilder()).append("Invalid value: ").append(zza1).toString());
        }
        azza[i] = ((zzag.zza) (obj));
        set.remove(Integer.valueOf(i));
        return ((zzag.zza) (obj));
_L3:
        obj = zzp(zza1);
        zzag.zza zza2 = zzo(zza1);
        zza2.zziV = new zzag.zza[((zzaf.zzh) (obj)).zziG.length];
        int ai[] = ((zzaf.zzh) (obj)).zziG;
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
            zza2.zziV[j] = zza(l2, zzf1, azza, set);
            j1++;
            j++;
        } while (true);
_L4:
        zzag.zza zza3 = zzo(zza1);
        obj = zzp(zza1);
        if (((zzaf.zzh) (obj)).zziH.length != ((zzaf.zzh) (obj)).zziI.length)
        {
            zzfi((new StringBuilder()).append("Uneven map keys (").append(((zzaf.zzh) (obj)).zziH.length).append(") and map values (").append(((zzaf.zzh) (obj)).zziI.length).append(")").toString());
        }
        zza3.zziW = new zzag.zza[((zzaf.zzh) (obj)).zziH.length];
        zza3.zziX = new zzag.zza[((zzaf.zzh) (obj)).zziH.length];
        int ai1[] = ((zzaf.zzh) (obj)).zziH;
        l2 = ai1.length;
        int k1 = 0;
        for (int k = 0; k1 < l2; k++)
        {
            int j3 = ai1[k1];
            zza3.zziW[k] = zza(j3, zzf1, azza, set);
            k1++;
        }

        ai1 = ((zzaf.zzh) (obj)).zziI;
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
            zza3.zziX[l] = zza(j2, zzf1, azza, set);
            k1++;
            l++;
        } while (true);
_L5:
        obj = zzo(zza1);
        obj.zziY = zzdf.zzg(zza(zzp(zza1).zziL, zzf1, azza, set));
        continue; /* Loop/switch isn't completed */
_L6:
        zzag.zza zza4 = zzo(zza1);
        obj = zzp(zza1);
        zza4.zzjc = new zzag.zza[((zzaf.zzh) (obj)).zziK.length];
        int ai2[] = ((zzaf.zzh) (obj)).zziK;
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
            zza4.zzjc[i1] = zza(i3, zzf1, azza, set);
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
        zzb zzb2 = zza.zzBC();
        zzb1 = zzb1.zzhQ;
        int j = zzb1.length;
        i = 0;
        while (i < j) 
        {
            int k = zzb1[i];
            Object obj = (zzaf.zze)zza(((Object []) (zzf1.zzig)), Integer.valueOf(k).intValue(), "properties");
            String s = (String)zza(((Object []) (zzf1.zzie)), ((zzaf.zze) (obj)).key, "keys");
            obj = (zzag.zza)zza(((Object []) (azza)), ((zzaf.zze) (obj)).value, "values");
            if (zzae.zzgv.toString().equals(s))
            {
                zzb2.zzq(((zzag.zza) (obj)));
            } else
            {
                zzb2.zzb(s, ((zzag.zza) (obj)));
            }
            i++;
        }
        return zzb2.zzBE();
    }

    private static zze zza(zzaf.zzg zzg1, List list, List list1, List list2, zzaf.zzf zzf1)
    {
        zzf zzf2 = zze.zzBJ();
        int ai[] = zzg1.zziu;
        int k2 = ai.length;
        for (int i = 0; i < k2; i++)
        {
            zzf2.zzd((zza)list2.get(Integer.valueOf(ai[i]).intValue()));
        }

        ai = zzg1.zziv;
        k2 = ai.length;
        for (int j = 0; j < k2; j++)
        {
            zzf2.zze((zza)list2.get(Integer.valueOf(ai[j]).intValue()));
        }

        list2 = zzg1.zziw;
        k2 = list2.length;
        for (int k = 0; k < k2; k++)
        {
            zzf2.zzf((zza)list.get(Integer.valueOf(list2[k]).intValue()));
        }

        list2 = zzg1.zziy;
        k2 = list2.length;
        for (int l = 0; l < k2; l++)
        {
            int l2 = list2[l];
            zzf2.zzfl(zzf1.zzif[Integer.valueOf(l2).intValue()].zziU);
        }

        list2 = zzg1.zzix;
        k2 = list2.length;
        for (int i1 = 0; i1 < k2; i1++)
        {
            zzf2.zzg((zza)list.get(Integer.valueOf(list2[i1]).intValue()));
        }

        list = zzg1.zziz;
        k2 = list.length;
        for (int j1 = 0; j1 < k2; j1++)
        {
            int i3 = list[j1];
            zzf2.zzfm(zzf1.zzif[Integer.valueOf(i3).intValue()].zziU);
        }

        list = zzg1.zziA;
        k2 = list.length;
        for (int k1 = 0; k1 < k2; k1++)
        {
            zzf2.zzh((zza)list1.get(Integer.valueOf(list[k1]).intValue()));
        }

        list = zzg1.zziC;
        k2 = list.length;
        for (int l1 = 0; l1 < k2; l1++)
        {
            int j3 = list[l1];
            zzf2.zzfn(zzf1.zzif[Integer.valueOf(j3).intValue()].zziU);
        }

        list = zzg1.zziB;
        k2 = list.length;
        for (int i2 = 0; i2 < k2; i2++)
        {
            zzf2.zzi((zza)list1.get(Integer.valueOf(list[i2]).intValue()));
        }

        zzg1 = zzg1.zziD;
        k2 = zzg1.length;
        for (int j2 = 0; j2 < k2; j2++)
        {
            int k3 = zzg1[j2];
            zzf2.zzfo(zzf1.zzif[Integer.valueOf(k3).intValue()].zziU);
        }

        return zzf2.zzBU();
    }

    private static Object zza(Object aobj[], int i, String s)
        throws zzg
    {
        if (i < 0 || i >= aobj.length)
        {
            zzfi((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    public static zzc zzb(zzaf.zzf zzf1)
        throws zzg
    {
        boolean flag = false;
        Object aobj[] = new zzag.zza[zzf1.zzif.length];
        for (int i = 0; i < zzf1.zzif.length; i++)
        {
            zza(i, zzf1, ((zzag.zza []) (aobj)), new HashSet(0));
        }

        zzd zzd1 = zzc.zzBF();
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < zzf1.zzii.length; j++)
        {
            arraylist.add(zza(zzf1.zzii[j], zzf1, ((zzag.zza []) (aobj)), j));
        }

        ArrayList arraylist1 = new ArrayList();
        for (int k = 0; k < zzf1.zzij.length; k++)
        {
            arraylist1.add(zza(zzf1.zzij[k], zzf1, ((zzag.zza []) (aobj)), k));
        }

        ArrayList arraylist2 = new ArrayList();
        for (int l = 0; l < zzf1.zzih.length; l++)
        {
            zza zza1 = zza(zzf1.zzih[l], zzf1, ((zzag.zza []) (aobj)), l);
            zzd1.zzc(zza1);
            arraylist2.add(zza1);
        }

        aobj = zzf1.zzik;
        int j1 = aobj.length;
        for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            zzd1.zzb(zza(aobj[i1], arraylist, arraylist2, arraylist1, zzf1));
        }

        zzd1.zzfk(zzf1.version);
        zzd1.zzjm(zzf1.zzis);
        return zzd1.zzBI();
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

    private static void zzfi(String s)
        throws zzg
    {
        zzbg.e(s);
        throw new zzg(s);
    }

    public static zzag.zza zzo(zzag.zza zza1)
    {
        zzag.zza zza2 = new zzag.zza();
        zza2.type = zza1.type;
        zza2.zzjd = (int[])zza1.zzjd.clone();
        if (zza1.zzje)
        {
            zza2.zzje = zza1.zzje;
        }
        return zza2;
    }

    private static zzaf.zzh zzp(zzag.zza zza1)
        throws zzg
    {
        if ((zzaf.zzh)zza1.zza(zzaf.zzh.zziE) == null)
        {
            zzfi((new StringBuilder()).append("Expected a ServingValue and didn't get one. Value is: ").append(zza1).toString());
        }
        return (zzaf.zzh)zza1.zza(zzaf.zzh.zziE);
    }
}
