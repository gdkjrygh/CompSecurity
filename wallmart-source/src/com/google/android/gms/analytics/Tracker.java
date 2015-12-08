// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzof;
import com.google.android.gms.internal.zzok;
import com.google.android.gms.internal.zzom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            ExceptionReporter, GoogleAnalytics

public class Tracker extends zzd
{
    private class zza extends zzd
        implements GoogleAnalytics.zza
    {

        final Tracker zzKU;
        private boolean zzKV;
        private int zzKW;
        private long zzKX;
        private boolean zzKY;
        private long zzKZ;

        private void zzhF()
        {
            if (zzKX >= 0L || zzKV)
            {
                zzhu().zza(com.google.android.gms.analytics.Tracker.zza(zzKU));
                return;
            } else
            {
                zzhu().zzb(com.google.android.gms.analytics.Tracker.zza(zzKU));
                return;
            }
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            zzKV = flag;
            zzhF();
        }

        public void setSessionTimeout(long l)
        {
            zzKX = l;
            zzhF();
        }

        protected void zzhB()
        {
        }

        public boolean zzhE()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            flag = zzKY;
            zzKY = false;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean zzhG()
        {
            return zzid().elapsedRealtime() >= zzKZ + Math.max(1000L, zzKX);
        }

        public void zzo(Activity activity)
        {
            if (zzKW == 0 && zzhG())
            {
                zzKY = true;
            }
            zzKW = zzKW + 1;
            if (zzKV)
            {
                Object obj = activity.getIntent();
                if (obj != null)
                {
                    zzKU.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
                }
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                Tracker tracker = zzKU;
                if (com.google.android.gms.analytics.Tracker.zzk(zzKU) != null)
                {
                    obj = com.google.android.gms.analytics.Tracker.zzk(zzKU).zzr(activity);
                } else
                {
                    obj = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", ((String) (obj)));
                if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
                {
                    activity = Tracker.zzq(activity);
                    if (!TextUtils.isEmpty(activity))
                    {
                        hashmap.put("&dr", activity);
                    }
                }
                zzKU.send(hashmap);
            }
        }

        public void zzp(Activity activity)
        {
            zzKW = zzKW - 1;
            zzKW = Math.max(0, zzKW);
            if (zzKW == 0)
            {
                zzKZ = zzid().elapsedRealtime();
            }
        }

        protected zza(zzf zzf1)
        {
            zzKU = Tracker.this;
            super(zzf1);
            zzKX = -1L;
        }
    }


    private boolean zzKH;
    private final Map zzKI = new HashMap();
    private final zzad zzKJ;
    private final zza zzKK;
    private ExceptionReporter zzKL;
    private zzal zzKM;
    private final Map zzvs = new HashMap();

    Tracker(zzf zzf1, String s, zzad zzad1)
    {
        super(zzf1);
        if (s != null)
        {
            zzvs.put("&tid", s);
        }
        zzvs.put("useSecure", "1");
        zzvs.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzad1 == null)
        {
            zzKJ = new zzad("tracking");
        } else
        {
            zzKJ = zzad1;
        }
        zzKK = new zza(zzf1);
    }

    static zza zza(Tracker tracker)
    {
        return tracker.zzKK;
    }

    private static void zza(Map map, Map map1)
    {
        zzx.zzv(map1);
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
        return tracker.zzik();
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
        zzx.zzv(map1);
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

    static zzk zzc(Tracker tracker)
    {
        return tracker.zzil();
    }

    static zzu zzd(Tracker tracker)
    {
        return tracker.zzim();
    }

    static zzu zze(Tracker tracker)
    {
        return tracker.zzim();
    }

    static zzad zzf(Tracker tracker)
    {
        return tracker.zzKJ;
    }

    static zzaf zzg(Tracker tracker)
    {
        return tracker.zzie();
    }

    static zzaf zzh(Tracker tracker)
    {
        return tracker.zzie();
    }

    private boolean zzhC()
    {
        return zzKL != null;
    }

    static zzb zzi(Tracker tracker)
    {
        return tracker.zzhz();
    }

    static zzb zzj(Tracker tracker)
    {
        return tracker.zzhz();
    }

    static zzal zzk(Tracker tracker)
    {
        return tracker.zzKM;
    }

    static String zzq(Activity activity)
    {
        zzx.zzv(activity);
        activity = activity.getIntent();
        if (activity != null)
        {
            if (!TextUtils.isEmpty(activity = activity.getStringExtra("android.intent.extra.REFERRER_NAME")))
            {
                return activity;
            }
        }
        return null;
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzKH = flag;
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        zzKK.enableAutoActivityTracking(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzhC() != flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        android.content.Context context = getContext();
        zzKL = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), context);
        Thread.setDefaultUncaughtExceptionHandler(zzKL);
        zzaY("Uncaught exceptions will be reported to Google Analytics");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Thread.setDefaultUncaughtExceptionHandler(zzKL.zzhv());
        zzaY("Uncaught exceptions will not be reported to Google Analytics");
          goto _L1
    }

    public String get(String s)
    {
        zzio();
        if (!TextUtils.isEmpty(s))
        {
            if (zzvs.containsKey(s))
            {
                return (String)zzvs.get(s);
            }
            if (s.equals("&ul"))
            {
                return zzam.zza(Locale.getDefault());
            }
            if (s.equals("&cid"))
            {
                return zzij().zzjd();
            }
            if (s.equals("&sr"))
            {
                return zzim().zzjT();
            }
            if (s.equals("&aid"))
            {
                return zzil().zziL().zztW();
            }
            if (s.equals("&an"))
            {
                return zzil().zziL().zzjZ();
            }
            if (s.equals("&av"))
            {
                return zzil().zziL().zzkb();
            }
            if (s.equals("&aiid"))
            {
                return zzil().zziL().zzxA();
            }
        }
        return null;
    }

    public void send(Map map)
    {
        HashMap hashmap;
        String s;
        long l;
        boolean flag;
        boolean flag1;
        l = zzid().currentTimeMillis();
        if (zzhu().getAppOptOut())
        {
            zzaZ("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = zzhu().isDryRunEnabled();
        hashmap = new HashMap();
        zza(zzvs, hashmap);
        zza(map, hashmap);
        flag1 = zzam.zze((String)zzvs.get("useSecure"), true);
        zzb(zzKI, hashmap);
        zzKI.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            zzie().zzh(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            zzie().zzh(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = zzhD();
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        j = Integer.parseInt((String)zzvs.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        zzvs.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        zzig().zzf(new Runnable(hashmap, flag2, map, l, flag, flag1, s) {

            final Map zzKN;
            final boolean zzKO;
            final String zzKP;
            final long zzKQ;
            final boolean zzKR;
            final boolean zzKS;
            final String zzKT;
            final Tracker zzKU;

            public void run()
            {
                boolean flag4 = true;
                if (com.google.android.gms.analytics.Tracker.zza(zzKU).zzhE())
                {
                    zzKN.put("sc", "start");
                }
                zzam.zzc(zzKN, "cid", zzKU.zzhu().getClientId());
                Object obj = (String)zzKN.get("sf");
                if (obj != null)
                {
                    double d = zzam.zza(((String) (obj)), 100D);
                    if (zzam.zza(d, (String)zzKN.get("cid")))
                    {
                        zzKU.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                        return;
                    }
                }
                obj = com.google.android.gms.analytics.Tracker.zzb(zzKU);
                boolean flag3;
                if (zzKO)
                {
                    zzam.zzb(zzKN, "ate", ((com.google.android.gms.analytics.internal.zza) (obj)).zzhM());
                    zzam.zzb(zzKN, "adid", ((com.google.android.gms.analytics.internal.zza) (obj)).zzhQ());
                } else
                {
                    zzKN.remove("ate");
                    zzKN.remove("adid");
                }
                obj = Tracker.zzc(zzKU).zziL();
                zzam.zzb(zzKN, "an", ((zzok) (obj)).zzjZ());
                zzam.zzb(zzKN, "av", ((zzok) (obj)).zzkb());
                zzam.zzb(zzKN, "aid", ((zzok) (obj)).zztW());
                zzam.zzb(zzKN, "aiid", ((zzok) (obj)).zzxA());
                zzKN.put("v", "1");
                zzKN.put("_v", zze.zzLB);
                zzam.zzb(zzKN, "ul", com.google.android.gms.analytics.Tracker.zzd(zzKU).zzjS().getLanguage());
                zzam.zzb(zzKN, "sr", com.google.android.gms.analytics.Tracker.zze(zzKU).zzjT());
                if (zzKP.equals("transaction") || zzKP.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !com.google.android.gms.analytics.Tracker.zzf(zzKU).zzkp())
                {
                    Tracker.zzg(zzKU).zzh(zzKN, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l2 = zzam.zzbo((String)zzKN.get("ht"));
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = zzKQ;
                }
                if (zzKR)
                {
                    obj = new zzab(zzKU, zzKN, l1, zzKS);
                    com.google.android.gms.analytics.Tracker.zzh(zzKU).zzc("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)zzKN.get("cid");
                HashMap hashmap1 = new HashMap();
                zzam.zza(hashmap1, "uid", zzKN);
                zzam.zza(hashmap1, "an", zzKN);
                zzam.zza(hashmap1, "aid", zzKN);
                zzam.zza(hashmap1, "av", zzKN);
                zzam.zza(hashmap1, "aiid", zzKN);
                String s1 = zzKT;
                if (TextUtils.isEmpty((CharSequence)zzKN.get("adid")))
                {
                    flag4 = false;
                }
                obj = new zzh(0L, ((String) (obj)), s1, flag4, 0L, hashmap1);
                l2 = Tracker.zzi(zzKU).zza(((zzh) (obj)));
                zzKN.put("_s", String.valueOf(l2));
                obj = new zzab(zzKU, zzKN, l1, zzKS);
                Tracker.zzj(zzKU).zza(((zzab) (obj)));
            }

            
            {
                zzKU = Tracker.this;
                zzKN = map;
                zzKO = flag;
                zzKP = s;
                zzKQ = l;
                zzKR = flag1;
                zzKS = flag2;
                zzKT = s1;
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
        zzx.zzb(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            zzvs.put(s, s1);
            return;
        }
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", zzam.zzJ(flag));
    }

    public void setAppId(String s)
    {
        set("&aid", s);
    }

    public void setAppInstallerId(String s)
    {
        set("&aiid", s);
    }

    public void setAppName(String s)
    {
        set("&an", s);
    }

    public void setAppVersion(String s)
    {
        set("&av", s);
    }

    public void setCampaignParamsOnNextHit(Uri uri)
    {
        if (uri != null && !uri.isOpaque())
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                uri = Uri.parse((new StringBuilder()).append("http://hostname/?").append(uri).toString());
                String s = uri.getQueryParameter("utm_id");
                if (s != null)
                {
                    zzKI.put("&ci", s);
                }
                s = uri.getQueryParameter("anid");
                if (s != null)
                {
                    zzKI.put("&anid", s);
                }
                s = uri.getQueryParameter("utm_campaign");
                if (s != null)
                {
                    zzKI.put("&cn", s);
                }
                s = uri.getQueryParameter("utm_content");
                if (s != null)
                {
                    zzKI.put("&cc", s);
                }
                s = uri.getQueryParameter("utm_medium");
                if (s != null)
                {
                    zzKI.put("&cm", s);
                }
                s = uri.getQueryParameter("utm_source");
                if (s != null)
                {
                    zzKI.put("&cs", s);
                }
                s = uri.getQueryParameter("utm_term");
                if (s != null)
                {
                    zzKI.put("&ck", s);
                }
                s = uri.getQueryParameter("dclid");
                if (s != null)
                {
                    zzKI.put("&dclid", s);
                }
                s = uri.getQueryParameter("gclid");
                if (s != null)
                {
                    zzKI.put("&gclid", s);
                }
                uri = uri.getQueryParameter("aclid");
                if (uri != null)
                {
                    zzKI.put("&aclid", uri);
                    return;
                }
            }
        }
    }

    public void setClientId(String s)
    {
        set("&cid", s);
    }

    public void setEncoding(String s)
    {
        set("&de", s);
    }

    public void setHostname(String s)
    {
        set("&dh", s);
    }

    public void setLanguage(String s)
    {
        set("&ul", s);
    }

    public void setLocation(String s)
    {
        set("&dl", s);
    }

    public void setPage(String s)
    {
        set("&dp", s);
    }

    public void setReferrer(String s)
    {
        set("&dr", s);
    }

    public void setSampleRate(double d)
    {
        set("&sf", Double.toString(d));
    }

    public void setScreenColors(String s)
    {
        set("&sd", s);
    }

    public void setScreenName(String s)
    {
        set("&cd", s);
    }

    public void setScreenResolution(int i, int j)
    {
        if (i < 0 && j < 0)
        {
            zzbb("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        zzKK.setSessionTimeout(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", zzam.zzJ(flag));
    }

    public void setViewportSize(String s)
    {
        set("&vp", s);
    }

    void zza(zzal zzal1)
    {
        zzaY("Loading Tracker config values");
        zzKM = zzal1;
        if (zzKM.zzkM())
        {
            zzal1 = zzKM.getTrackingId();
            set("&tid", zzal1);
            zza("trackingId loaded", zzal1);
        }
        if (zzKM.zzkN())
        {
            zzal1 = Double.toString(zzKM.zzkO());
            set("&sf", zzal1);
            zza("Sample frequency loaded", zzal1);
        }
        if (zzKM.zzkP())
        {
            int i = zzKM.getSessionTimeout();
            setSessionTimeout(i);
            zza("Session timeout loaded", Integer.valueOf(i));
        }
        if (zzKM.zzkQ())
        {
            boolean flag = zzKM.zzkR();
            enableAutoActivityTracking(flag);
            zza("Auto activity tracking loaded", Boolean.valueOf(flag));
        }
        if (zzKM.zzkS())
        {
            boolean flag1 = zzKM.zzkT();
            if (flag1)
            {
                set("&aip", "1");
            }
            zza("Anonymize ip loaded", Boolean.valueOf(flag1));
        }
        enableExceptionReporting(zzKM.zzkU());
    }

    protected void zzhB()
    {
        zzKK.zza();
        String s = zzhA().zzjZ();
        if (s != null)
        {
            set("&an", s);
        }
        s = zzhA().zzkb();
        if (s != null)
        {
            set("&av", s);
        }
    }

    boolean zzhD()
    {
        return zzKH;
    }
}
