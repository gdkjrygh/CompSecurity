// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zznz;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

class zzIT
    implements Runnable
{

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
        boolean flag1 = true;
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
        boolean flag;
        if (zzIO)
        {
            zzam.zzb(zzIN, "ate", ((zza) (obj)).zzhy());
            zzam.zzb(zzIN, "adid", ((zza) (obj)).zzhC());
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
        zzam.zzb(zzIN, "ul", Tracker.zzd(zzIU).zzjE().getLanguage());
        zzam.zzb(zzIN, "sr", com.google.android.gms.analytics.Tracker.zze(zzIU).zzjF());
        if (zzIP.equals("transaction") || zzIP.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !Tracker.zzf(zzIU).zzkb())
        {
            Tracker.zzg(zzIU).zzg(zzIN, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = zzam.zzbj((String)zzIN.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = zzIQ;
        }
        if (zzIR)
        {
            obj = new zzab(zzIU, zzIN, l, zzIS);
            com.google.android.gms.analytics.Tracker.zzh(zzIU).zzc("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)zzIN.get("cid");
        HashMap hashmap = new HashMap();
        zzam.zza(hashmap, "uid", zzIN);
        zzam.zza(hashmap, "an", zzIN);
        zzam.zza(hashmap, "aid", zzIN);
        zzam.zza(hashmap, "av", zzIN);
        zzam.zza(hashmap, "aiid", zzIN);
        String s = zzIT;
        if (TextUtils.isEmpty((CharSequence)zzIN.get("adid")))
        {
            flag1 = false;
        }
        obj = new zzh(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l1 = Tracker.zzi(zzIU).zza(((zzh) (obj)));
        zzIN.put("_s", String.valueOf(l1));
        obj = new zzab(zzIU, zzIN, l, zzIS);
        Tracker.zzj(zzIU).zza(((zzab) (obj)));
    }

    zb(Tracker tracker, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        zzIU = tracker;
        zzIN = map;
        zzIO = flag;
        zzIP = s;
        zzIQ = l;
        zzIR = flag1;
        zzIS = flag2;
        zzIT = s1;
        super();
    }
}
