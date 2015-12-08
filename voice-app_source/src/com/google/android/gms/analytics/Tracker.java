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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zznz;
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

        final Tracker zzIU;
        private boolean zzIV;
        private int zzIW;
        private long zzIX;
        private boolean zzIY;
        private long zzIZ;

        private void zzhr()
        {
            if (zzIX >= 0L || zzIV)
            {
                zzhg().zza(com.google.android.gms.analytics.Tracker.zza(zzIU));
                return;
            } else
            {
                zzhg().zzb(com.google.android.gms.analytics.Tracker.zza(zzIU));
                return;
            }
        }

        public void enableAutoActivityTracking(boolean flag)
        {
            zzIV = flag;
            zzhr();
        }

        public void setSessionTimeout(long l)
        {
            zzIX = l;
            zzhr();
        }

        protected void zzhn()
        {
        }

        public boolean zzhq()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            flag = zzIY;
            zzIY = false;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean zzhs()
        {
            return zzhP().elapsedRealtime() >= zzIZ + Math.max(1000L, zzIX);
        }

        public void zzn(Activity activity)
        {
            if (zzIW == 0 && zzhs())
            {
                zzIY = true;
            }
            zzIW = zzIW + 1;
            if (zzIV)
            {
                Object obj = activity.getIntent();
                if (obj != null)
                {
                    zzIU.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
                }
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                Tracker tracker = zzIU;
                if (com.google.android.gms.analytics.Tracker.zzk(zzIU) != null)
                {
                    obj = com.google.android.gms.analytics.Tracker.zzk(zzIU).zzq(activity);
                } else
                {
                    obj = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", ((String) (obj)));
                if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
                {
                    activity = Tracker.zzp(activity);
                    if (!TextUtils.isEmpty(activity))
                    {
                        hashmap.put("&dr", activity);
                    }
                }
                zzIU.send(hashmap);
            }
        }

        public void zzo(Activity activity)
        {
            zzIW = zzIW - 1;
            zzIW = Math.max(0, zzIW);
            if (zzIW == 0)
            {
                zzIZ = zzhP().elapsedRealtime();
            }
        }

        protected zza(zzf zzf1)
        {
            zzIU = Tracker.this;
            super(zzf1);
            zzIX = -1L;
        }
    }


    private boolean zzIH;
    private final Map zzII = new HashMap();
    private final zzad zzIJ;
    private final zza zzIK;
    private ExceptionReporter zzIL;
    private zzal zzIM;
    private final Map zzyn = new HashMap();

    Tracker(zzf zzf1, String s, zzad zzad1)
    {
        super(zzf1);
        if (s != null)
        {
            zzyn.put("&tid", s);
        }
        zzyn.put("useSecure", "1");
        zzyn.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzad1 == null)
        {
            zzIJ = new zzad("tracking");
        } else
        {
            zzIJ = zzad1;
        }
        zzIK = new zza(zzf1);
    }

    static zza zza(Tracker tracker)
    {
        return tracker.zzIK;
    }

    private static void zza(Map map, Map map1)
    {
        zzu.zzu(map1);
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
        return tracker.zzhW();
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
        zzu.zzu(map1);
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
        return tracker.zzhX();
    }

    static com.google.android.gms.analytics.internal.zzu zzd(Tracker tracker)
    {
        return tracker.zzhY();
    }

    static com.google.android.gms.analytics.internal.zzu zze(Tracker tracker)
    {
        return tracker.zzhY();
    }

    static zzad zzf(Tracker tracker)
    {
        return tracker.zzIJ;
    }

    static zzaf zzg(Tracker tracker)
    {
        return tracker.zzhQ();
    }

    static zzaf zzh(Tracker tracker)
    {
        return tracker.zzhQ();
    }

    private boolean zzho()
    {
        return zzIL != null;
    }

    static zzb zzi(Tracker tracker)
    {
        return tracker.zzhl();
    }

    static zzb zzj(Tracker tracker)
    {
        return tracker.zzhl();
    }

    static zzal zzk(Tracker tracker)
    {
        return tracker.zzIM;
    }

    static String zzp(Activity activity)
    {
        zzu.zzu(activity);
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
        zzIH = flag;
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        zzIK.enableAutoActivityTracking(flag);
    }

    public void enableExceptionReporting(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzho() != flag)
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
        zzIL = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), context);
        Thread.setDefaultUncaughtExceptionHandler(zzIL);
        zzaT("Uncaught exceptions will be reported to Google Analytics");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Thread.setDefaultUncaughtExceptionHandler(zzIL.zzhh());
        zzaT("Uncaught exceptions will not be reported to Google Analytics");
          goto _L1
    }

    public String get(String s)
    {
        zzia();
        if (!TextUtils.isEmpty(s))
        {
            if (zzyn.containsKey(s))
            {
                return (String)zzyn.get(s);
            }
            if (s.equals("&ul"))
            {
                return zzam.zza(Locale.getDefault());
            }
            if (s.equals("&cid"))
            {
                return zzhV().zziP();
            }
            if (s.equals("&sr"))
            {
                return zzhY().zzjF();
            }
            if (s.equals("&aid"))
            {
                return zzhX().zzix().zzsK();
            }
            if (s.equals("&an"))
            {
                return zzhX().zzix().zzjL();
            }
            if (s.equals("&av"))
            {
                return zzhX().zzix().zzjN();
            }
            if (s.equals("&aiid"))
            {
                return zzhX().zzix().zzwi();
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
        l = zzhP().currentTimeMillis();
        if (zzhg().getAppOptOut())
        {
            zzaU("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = zzhg().isDryRunEnabled();
        hashmap = new HashMap();
        zza(zzyn, hashmap);
        zza(map, hashmap);
        flag1 = zzam.zze((String)zzyn.get("useSecure"), true);
        zzb(zzII, hashmap);
        zzII.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            zzhQ().zzg(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            zzhQ().zzg(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = zzhp();
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        j = Integer.parseInt((String)zzyn.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        zzyn.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        zzhS().zze(new Runnable(hashmap, flag2, map, l, flag, flag1, s) {

            final Map zzIN;
            final boolean zzIO;
            final String zzIP;
            final long zzIQ;
            final boolean zzIR;
            final boolean zzIS;
            final String zzIT;
            final Tracker zzIU;

            public void run()
            {
                boolean flag4 = true;
                if (com.google.android.gms.analytics.Tracker.zza(zzIU).zzhq())
                {
                    zzIN.put("sc", "start");
                }
                zzam.zzc(zzIN, "cid", zzIU.zzhg().getClientId());
                Object obj = (String)zzIN.get("sf");
                if (obj != null)
                {
                    double d = zzam.zza(((String) (obj)), 100D);
                    if (zzam.zza(d, (String)zzIN.get("cid")))
                    {
                        zzIU.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                        return;
                    }
                }
                obj = com.google.android.gms.analytics.Tracker.zzb(zzIU);
                boolean flag3;
                if (zzIO)
                {
                    zzam.zzb(zzIN, "ate", ((com.google.android.gms.analytics.internal.zza) (obj)).zzhy());
                    zzam.zzb(zzIN, "adid", ((com.google.android.gms.analytics.internal.zza) (obj)).zzhC());
                } else
                {
                    zzIN.remove("ate");
                    zzIN.remove("adid");
                }
                obj = Tracker.zzc(zzIU).zzix();
                zzam.zzb(zzIN, "an", ((zznx) (obj)).zzjL());
                zzam.zzb(zzIN, "av", ((zznx) (obj)).zzjN());
                zzam.zzb(zzIN, "aid", ((zznx) (obj)).zzsK());
                zzam.zzb(zzIN, "aiid", ((zznx) (obj)).zzwi());
                zzIN.put("v", "1");
                zzIN.put("_v", zze.zzJB);
                zzam.zzb(zzIN, "ul", com.google.android.gms.analytics.Tracker.zzd(zzIU).zzjE().getLanguage());
                zzam.zzb(zzIN, "sr", com.google.android.gms.analytics.Tracker.zze(zzIU).zzjF());
                if (zzIP.equals("transaction") || zzIP.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !com.google.android.gms.analytics.Tracker.zzf(zzIU).zzkb())
                {
                    Tracker.zzg(zzIU).zzg(zzIN, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l2 = zzam.zzbj((String)zzIN.get("ht"));
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = zzIQ;
                }
                if (zzIR)
                {
                    obj = new zzab(zzIU, zzIN, l1, zzIS);
                    com.google.android.gms.analytics.Tracker.zzh(zzIU).zzc("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)zzIN.get("cid");
                HashMap hashmap1 = new HashMap();
                zzam.zza(hashmap1, "uid", zzIN);
                zzam.zza(hashmap1, "an", zzIN);
                zzam.zza(hashmap1, "aid", zzIN);
                zzam.zza(hashmap1, "av", zzIN);
                zzam.zza(hashmap1, "aiid", zzIN);
                String s1 = zzIT;
                if (TextUtils.isEmpty((CharSequence)zzIN.get("adid")))
                {
                    flag4 = false;
                }
                obj = new zzh(0L, ((String) (obj)), s1, flag4, 0L, hashmap1);
                l2 = Tracker.zzi(zzIU).zza(((zzh) (obj)));
                zzIN.put("_s", String.valueOf(l2));
                obj = new zzab(zzIU, zzIN, l1, zzIS);
                Tracker.zzj(zzIU).zza(((zzab) (obj)));
            }

            
            {
                zzIU = Tracker.this;
                zzIN = map;
                zzIO = flag;
                zzIP = s;
                zzIQ = l;
                zzIR = flag1;
                zzIS = flag2;
                zzIT = s1;
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
        zzu.zzb(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            zzyn.put(s, s1);
            return;
        }
    }

    public void setAnonymizeIp(boolean flag)
    {
        set("&aip", zzam.zzH(flag));
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
                    zzII.put("&ci", s);
                }
                s = uri.getQueryParameter("anid");
                if (s != null)
                {
                    zzII.put("&anid", s);
                }
                s = uri.getQueryParameter("utm_campaign");
                if (s != null)
                {
                    zzII.put("&cn", s);
                }
                s = uri.getQueryParameter("utm_content");
                if (s != null)
                {
                    zzII.put("&cc", s);
                }
                s = uri.getQueryParameter("utm_medium");
                if (s != null)
                {
                    zzII.put("&cm", s);
                }
                s = uri.getQueryParameter("utm_source");
                if (s != null)
                {
                    zzII.put("&cs", s);
                }
                s = uri.getQueryParameter("utm_term");
                if (s != null)
                {
                    zzII.put("&ck", s);
                }
                s = uri.getQueryParameter("dclid");
                if (s != null)
                {
                    zzII.put("&dclid", s);
                }
                s = uri.getQueryParameter("gclid");
                if (s != null)
                {
                    zzII.put("&gclid", s);
                }
                uri = uri.getQueryParameter("aclid");
                if (uri != null)
                {
                    zzII.put("&aclid", uri);
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
            zzaW("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            set("&sr", (new StringBuilder()).append(i).append("x").append(j).toString());
            return;
        }
    }

    public void setSessionTimeout(long l)
    {
        zzIK.setSessionTimeout(1000L * l);
    }

    public void setTitle(String s)
    {
        set("&dt", s);
    }

    public void setUseSecure(boolean flag)
    {
        set("useSecure", zzam.zzH(flag));
    }

    public void setViewportSize(String s)
    {
        set("&vp", s);
    }

    void zza(zzal zzal1)
    {
        zzaT("Loading Tracker config values");
        zzIM = zzal1;
        if (zzIM.zzky())
        {
            zzal1 = zzIM.getTrackingId();
            set("&tid", zzal1);
            zza("trackingId loaded", zzal1);
        }
        if (zzIM.zzkz())
        {
            zzal1 = Double.toString(zzIM.zzkA());
            set("&sf", zzal1);
            zza("Sample frequency loaded", zzal1);
        }
        if (zzIM.zzkB())
        {
            int i = zzIM.getSessionTimeout();
            setSessionTimeout(i);
            zza("Session timeout loaded", Integer.valueOf(i));
        }
        if (zzIM.zzkC())
        {
            boolean flag = zzIM.zzkD();
            enableAutoActivityTracking(flag);
            zza("Auto activity tracking loaded", Boolean.valueOf(flag));
        }
        if (zzIM.zzkE())
        {
            boolean flag1 = zzIM.zzkF();
            if (flag1)
            {
                set("&aip", "1");
            }
            zza("Anonymize ip loaded", Boolean.valueOf(flag1));
        }
        enableExceptionReporting(zzIM.zzkG());
    }

    protected void zzhn()
    {
        zzIK.zza();
        String s = zzhm().zzjL();
        if (s != null)
        {
            set("&an", s);
        }
        s = zzhm().zzjN();
        if (s != null)
        {
            set("&av", s);
        }
    }

    boolean zzhp()
    {
        return zzIH;
    }
}
