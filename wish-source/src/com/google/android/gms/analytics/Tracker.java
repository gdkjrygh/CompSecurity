// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzaa;
import com.google.android.gms.analytics.internal.zzac;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzg;
import com.google.android.gms.analytics.internal.zzj;
import com.google.android.gms.analytics.internal.zzt;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzkr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            GoogleAnalytics

public class Tracker extends zzd
{
    private class zza extends zzd
    {

        final Tracker zzEX;
        private long zzFa;
        private boolean zzFb;

        protected void zzgb()
        {
        }

        public boolean zzge()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            flag = zzFb;
            zzFb = false;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        protected zza(zze zze1)
        {
            zzEX = Tracker.this;
            super(zze1);
            zzFa = -1L;
        }
    }


    private boolean zzEK;
    private final Map zzEL = new HashMap();
    private final zzac zzEM;
    private final zza zzEN;
    private final Map zzvi = new HashMap();

    Tracker(zze zze1, String s, zzac zzac1)
    {
        super(zze1);
        if (s != null)
        {
            zzvi.put("&tid", s);
        }
        zzvi.put("useSecure", "1");
        zzvi.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzac1 == null)
        {
            zzEM = new zzac("tracking");
        } else
        {
            zzEM = zzac1;
        }
        zzEN = new zza(zze1);
    }

    static zza zza(Tracker tracker)
    {
        return tracker.zzEN;
    }

    private static void zza(Map map, Map map1)
    {
        zzv.zzr(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = zzb(entry);
                if (s != null)
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    private static boolean zza(java.util.Map.Entry entry)
    {
        String s = (String)entry.getKey();
        entry = (String)entry.getValue();
        return s.startsWith("&") && s.length() >= 2;
    }

    static com.google.android.gms.analytics.internal.zza zzb(Tracker tracker)
    {
        return tracker.zzgN();
    }

    private static String zzb(java.util.Map.Entry entry)
    {
        if (!zza(entry))
        {
            return null;
        } else
        {
            return ((String)entry.getKey()).substring(1);
        }
    }

    private static void zzb(Map map, Map map1)
    {
        zzv.zzr(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = zzb(entry);
                if (s != null && !map1.containsKey(s))
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static zzj zzc(Tracker tracker)
    {
        return tracker.zzgO();
    }

    static zzt zzd(Tracker tracker)
    {
        return tracker.zzgP();
    }

    static zzt zze(Tracker tracker)
    {
        return tracker.zzgP();
    }

    static zzac zzf(Tracker tracker)
    {
        return tracker.zzEM;
    }

    static zzae zzg(Tracker tracker)
    {
        return tracker.zzgH();
    }

    static zzae zzh(Tracker tracker)
    {
        return tracker.zzgH();
    }

    static zzb zzi(Tracker tracker)
    {
        return tracker.zzfZ();
    }

    static zzb zzj(Tracker tracker)
    {
        return tracker.zzfZ();
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzEK = flag;
    }

    public void send(Map map)
    {
        HashMap hashmap;
        String s;
        long l;
        boolean flag;
        boolean flag1;
        l = zzgG().currentTimeMillis();
        if (zzfT().getAppOptOut())
        {
            zzaG("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = zzfT().isDryRunEnabled();
        hashmap = new HashMap();
        zza(zzvi, hashmap);
        zza(map, hashmap);
        flag1 = zzal.zze((String)zzvi.get("useSecure"), true);
        zzb(zzEL, hashmap);
        zzEL.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            zzgH().zze(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            zzgH().zze(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = zzgd();
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_249;
        }
        j = Integer.parseInt((String)zzvi.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        zzvi.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        zzgJ().zze(new Runnable(hashmap, flag2, map, l, flag, flag1, s) {

            final Map zzEQ;
            final boolean zzER;
            final String zzES;
            final long zzET;
            final boolean zzEU;
            final boolean zzEV;
            final String zzEW;
            final Tracker zzEX;

            public void run()
            {
                boolean flag4 = true;
                if (com.google.android.gms.analytics.Tracker.zza(zzEX).zzge())
                {
                    zzEQ.put("sc", "start");
                }
                zzal.zzc(zzEQ, "cid", zzEX.zzfT().getClientId());
                if (zzEQ.get("&sf") != null)
                {
                    double d = zzal.zza((String)zzEQ.get("&sf"), 100D);
                    if (zzal.zza(d, (String)zzEQ.get("&cid")))
                    {
                        zzEX.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                        return;
                    }
                }
                Object obj = com.google.android.gms.analytics.Tracker.zzb(zzEX);
                boolean flag3;
                if (zzER)
                {
                    zzal.zzb(zzEQ, "ate", ((com.google.android.gms.analytics.internal.zza) (obj)).zzgn());
                    zzal.zzb(zzEQ, "adid", ((com.google.android.gms.analytics.internal.zza) (obj)).zzgr());
                } else
                {
                    zzEQ.remove("ate");
                    zzEQ.remove("adid");
                }
                obj = Tracker.zzc(zzEX).zzhp();
                zzal.zzb(zzEQ, "an", ((zzkp) (obj)).zziD());
                zzal.zzb(zzEQ, "av", ((zzkp) (obj)).zziF());
                zzal.zzb(zzEQ, "aid", ((zzkp) (obj)).zzqS());
                zzal.zzb(zzEQ, "aiid", ((zzkp) (obj)).zzuq());
                zzEQ.put("v", "1");
                zzEQ.put("_v", "ma4.5.0");
                zzal.zzb(zzEQ, "ul", com.google.android.gms.analytics.Tracker.zzd(zzEX).zziw().getLanguage());
                zzal.zzb(zzEQ, "sr", com.google.android.gms.analytics.Tracker.zze(zzEX).zzix());
                if (zzES.equals("transaction") || zzES.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !Tracker.zzf(zzEX).zziT())
                {
                    com.google.android.gms.analytics.Tracker.zzg(zzEX).zze(zzEQ, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l2 = zzal.zzaV((String)zzEQ.get("ht"));
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = zzET;
                }
                if (zzEU)
                {
                    obj = new zzaa(zzEX, zzEQ, l1, zzEV);
                    Tracker.zzh(zzEX).zzc("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)zzEQ.get("cid");
                HashMap hashmap1 = new HashMap();
                zzal.zza(hashmap1, "uid", zzEQ);
                zzal.zza(hashmap1, "an", zzEQ);
                zzal.zza(hashmap1, "aid", zzEQ);
                zzal.zza(hashmap1, "av", zzEQ);
                zzal.zza(hashmap1, "aiid", zzEQ);
                String s1 = zzEW;
                if (TextUtils.isEmpty((CharSequence)zzEQ.get("adid")))
                {
                    flag4 = false;
                }
                obj = new zzg(0L, ((String) (obj)), s1, flag4, 0L, hashmap1);
                l2 = Tracker.zzi(zzEX).zza(((zzg) (obj)));
                zzEQ.put("_s", String.valueOf(l2));
                obj = new zzaa(zzEX, zzEQ, l1, zzEV);
                com.google.android.gms.analytics.Tracker.zzj(zzEX).zza(((zzaa) (obj)));
            }

            
            {
                zzEX = Tracker.this;
                zzEQ = map;
                zzER = flag;
                zzES = s;
                zzET = l;
                zzEU = flag1;
                zzEV = flag2;
                zzEW = s1;
                super();
            }
        });
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void set(String s, String s1)
    {
        zzv.zzb(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            zzvi.put(s, s1);
            return;
        }
    }

    public void setSampleRate(double d)
    {
        set("&sf", Double.toString(d));
    }

    public void setScreenName(String s)
    {
        set("&cd", s);
    }

    protected void zzgb()
    {
        zzEN.zzfV();
        String s = zzga().zziD();
        if (s != null)
        {
            set("&an", s);
        }
        s = zzga().zziF();
        if (s != null)
        {
            set("&av", s);
        }
    }

    boolean zzgd()
    {
        return zzEK;
    }
}
