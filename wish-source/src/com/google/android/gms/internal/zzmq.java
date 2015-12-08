// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzb

public class zzmq
{
    public static class zza
    {

        private final zzd.zza zzaFi;
        private final Map zzaHk;

        public static zzb zzyq()
        {
            return new zzb();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Properties: ").append(zzyr()).append(" pushAfterEvaluate: ").append(zzaFi).toString();
        }

        public void zza(String s, zzd.zza zza1)
        {
            zzaHk.put(s, zza1);
        }

        public zzd.zza zzxw()
        {
            return zzaFi;
        }

        public Map zzyr()
        {
            return Collections.unmodifiableMap(zzaHk);
        }

        private zza(Map map, zzd.zza zza1)
        {
            zzaHk = map;
            zzaFi = zza1;
        }

    }

    public static class zzb
    {

        private zzd.zza zzaFi;
        private final Map zzaHk;

        public zzb zzb(String s, zzd.zza zza1)
        {
            zzaHk.put(s, zza1);
            return this;
        }

        public zzb zzq(zzd.zza zza1)
        {
            zzaFi = zza1;
            return this;
        }

        public zza zzys()
        {
            return new zza(zzaHk, zzaFi);
        }

        private zzb()
        {
            zzaHk = new HashMap();
        }

    }

    public static class zzc
    {

        private final List zzaHl;
        private final Map zzaHm;
        private final int zzaHn;
        private final String zzacK;

        public static zzd zzyt()
        {
            return new zzd();
        }

        public String getVersion()
        {
            return zzacK;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Rules: ").append(zzyu()).append("  Macros: ").append(zzaHm).toString();
        }

        public List zzyu()
        {
            return zzaHl;
        }

        public Map zzyv()
        {
            return zzaHm;
        }

        private zzc(List list, Map map, String s, int i)
        {
            zzaHl = Collections.unmodifiableList(list);
            zzaHm = Collections.unmodifiableMap(map);
            zzacK = s;
            zzaHn = i;
        }

    }

    public static class zzd
    {

        private final List zzaHl;
        private final Map zzaHm;
        private int zzaHn;
        private String zzacK;

        public zzd zzb(zze zze1)
        {
            zzaHl.add(zze1);
            return this;
        }

        public zzd zzc(zza zza1)
        {
            String s = zzdf.zzg((zzd.zza)zza1.zzyr().get(com.google.android.gms.internal.zzb.zzdJ.toString()));
            List list = (List)zzaHm.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                zzaHm.put(s, obj);
            }
            ((List) (obj)).add(zza1);
            return this;
        }

        public zzd zzen(String s)
        {
            zzacK = s;
            return this;
        }

        public zzd zzhM(int i)
        {
            zzaHn = i;
            return this;
        }

        public zzc zzyw()
        {
            return new zzc(zzaHl, zzaHm, zzacK, zzaHn);
        }

        private zzd()
        {
            zzaHl = new ArrayList();
            zzaHm = new HashMap();
            zzacK = "";
            zzaHn = 0;
        }

    }

    public static class zze
    {

        private final List zzaHo;
        private final List zzaHp;
        private final List zzaHq;
        private final List zzaHr;
        private final List zzaHs;
        private final List zzaHt;
        private final List zzaHu;
        private final List zzaHv;
        private final List zzaHw;
        private final List zzaHx;

        public static zzf zzyx()
        {
            return new zzf();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Positive predicates: ").append(zzyy()).append("  Negative predicates: ").append(zzyz()).append("  Add tags: ").append(zzyA()).append("  Remove tags: ").append(zzyB()).append("  Add macros: ").append(zzyC()).append("  Remove macros: ").append(zzyH()).toString();
        }

        public List zzyA()
        {
            return zzaHq;
        }

        public List zzyB()
        {
            return zzaHr;
        }

        public List zzyC()
        {
            return zzaHs;
        }

        public List zzyD()
        {
            return zzaHu;
        }

        public List zzyE()
        {
            return zzaHv;
        }

        public List zzyF()
        {
            return zzaHw;
        }

        public List zzyG()
        {
            return zzaHx;
        }

        public List zzyH()
        {
            return zzaHt;
        }

        public List zzyy()
        {
            return zzaHo;
        }

        public List zzyz()
        {
            return zzaHp;
        }

        private zze(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            zzaHo = Collections.unmodifiableList(list);
            zzaHp = Collections.unmodifiableList(list1);
            zzaHq = Collections.unmodifiableList(list2);
            zzaHr = Collections.unmodifiableList(list3);
            zzaHs = Collections.unmodifiableList(list4);
            zzaHt = Collections.unmodifiableList(list5);
            zzaHu = Collections.unmodifiableList(list6);
            zzaHv = Collections.unmodifiableList(list7);
            zzaHw = Collections.unmodifiableList(list8);
            zzaHx = Collections.unmodifiableList(list9);
        }

    }

    public static class zzf
    {

        private final List zzaHo;
        private final List zzaHp;
        private final List zzaHq;
        private final List zzaHr;
        private final List zzaHs;
        private final List zzaHt;
        private final List zzaHu;
        private final List zzaHv;
        private final List zzaHw;
        private final List zzaHx;

        public zzf zzd(zza zza1)
        {
            zzaHo.add(zza1);
            return this;
        }

        public zzf zze(zza zza1)
        {
            zzaHp.add(zza1);
            return this;
        }

        public zzf zzeo(String s)
        {
            zzaHw.add(s);
            return this;
        }

        public zzf zzep(String s)
        {
            zzaHx.add(s);
            return this;
        }

        public zzf zzeq(String s)
        {
            zzaHu.add(s);
            return this;
        }

        public zzf zzer(String s)
        {
            zzaHv.add(s);
            return this;
        }

        public zzf zzf(zza zza1)
        {
            zzaHq.add(zza1);
            return this;
        }

        public zzf zzg(zza zza1)
        {
            zzaHr.add(zza1);
            return this;
        }

        public zzf zzh(zza zza1)
        {
            zzaHs.add(zza1);
            return this;
        }

        public zzf zzi(zza zza1)
        {
            zzaHt.add(zza1);
            return this;
        }

        public zze zzyI()
        {
            return new zze(zzaHo, zzaHp, zzaHq, zzaHr, zzaHs, zzaHt, zzaHu, zzaHv, zzaHw, zzaHx);
        }

        private zzf()
        {
            zzaHo = new ArrayList();
            zzaHp = new ArrayList();
            zzaHq = new ArrayList();
            zzaHr = new ArrayList();
            zzaHs = new ArrayList();
            zzaHt = new ArrayList();
            zzaHu = new ArrayList();
            zzaHv = new ArrayList();
            zzaHw = new ArrayList();
            zzaHx = new ArrayList();
        }

    }

    public static class zzg extends Exception
    {

        public zzg(String s)
        {
            super(s);
        }
    }


    public static zzd.zza zzo(zzd.zza zza1)
    {
        zzd.zza zza2 = new zzd.zza();
        zza2.type = zza1.type;
        zza2.zzht = (int[])zza1.zzht.clone();
        if (zza1.zzhu)
        {
            zza2.zzhu = zza1.zzhu;
        }
        return zza2;
    }
}
