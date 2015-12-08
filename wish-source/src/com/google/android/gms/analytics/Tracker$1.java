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
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzg;
import com.google.android.gms.analytics.internal.zzj;
import com.google.android.gms.analytics.internal.zzt;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzkr;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

class zzEW
    implements Runnable
{

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
        boolean flag1 = true;
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
        boolean flag;
        if (zzER)
        {
            zzal.zzb(zzEQ, "ate", ((zza) (obj)).zzgn());
            zzal.zzb(zzEQ, "adid", ((zza) (obj)).zzgr());
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
        zzal.zzb(zzEQ, "ul", Tracker.zzd(zzEX).zziw().getLanguage());
        zzal.zzb(zzEQ, "sr", Tracker.zze(zzEX).zzix());
        if (zzES.equals("transaction") || zzES.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !Tracker.zzf(zzEX).zziT())
        {
            com.google.android.gms.analytics.Tracker.zzg(zzEX).zze(zzEQ, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = zzal.zzaV((String)zzEQ.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = zzET;
        }
        if (zzEU)
        {
            obj = new zzaa(zzEX, zzEQ, l, zzEV);
            Tracker.zzh(zzEX).zzc("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)zzEQ.get("cid");
        HashMap hashmap = new HashMap();
        zzal.zza(hashmap, "uid", zzEQ);
        zzal.zza(hashmap, "an", zzEQ);
        zzal.zza(hashmap, "aid", zzEQ);
        zzal.zza(hashmap, "av", zzEQ);
        zzal.zza(hashmap, "aiid", zzEQ);
        String s = zzEW;
        if (TextUtils.isEmpty((CharSequence)zzEQ.get("adid")))
        {
            flag1 = false;
        }
        obj = new zzg(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l1 = Tracker.zzi(zzEX).zza(((zzg) (obj)));
        zzEQ.put("_s", String.valueOf(l1));
        obj = new zzaa(zzEX, zzEQ, l, zzEV);
        com.google.android.gms.analytics.Tracker.zzj(zzEX).zza(((zzaa) (obj)));
    }

    zb(Tracker tracker, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        zzEX = tracker;
        zzEQ = map;
        zzER = flag;
        zzES = s;
        zzET = l;
        zzEU = flag1;
        zzEV = flag2;
        zzEW = s1;
        super();
    }
}
