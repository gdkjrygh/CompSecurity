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
import com.google.android.gms.internal.zzok;
import com.google.android.gms.internal.zzom;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

class zzKT
    implements Runnable
{

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
        boolean flag1 = true;
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
        boolean flag;
        if (zzKO)
        {
            zzam.zzb(zzKN, "ate", ((zza) (obj)).zzhM());
            zzam.zzb(zzKN, "adid", ((zza) (obj)).zzhQ());
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
        zzam.zzb(zzKN, "ul", Tracker.zzd(zzKU).zzjS().getLanguage());
        zzam.zzb(zzKN, "sr", com.google.android.gms.analytics.Tracker.zze(zzKU).zzjT());
        if (zzKP.equals("transaction") || zzKP.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !Tracker.zzf(zzKU).zzkp())
        {
            Tracker.zzg(zzKU).zzh(zzKN, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = zzam.zzbo((String)zzKN.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = zzKQ;
        }
        if (zzKR)
        {
            obj = new zzab(zzKU, zzKN, l, zzKS);
            com.google.android.gms.analytics.Tracker.zzh(zzKU).zzc("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)zzKN.get("cid");
        HashMap hashmap = new HashMap();
        zzam.zza(hashmap, "uid", zzKN);
        zzam.zza(hashmap, "an", zzKN);
        zzam.zza(hashmap, "aid", zzKN);
        zzam.zza(hashmap, "av", zzKN);
        zzam.zza(hashmap, "aiid", zzKN);
        String s = zzKT;
        if (TextUtils.isEmpty((CharSequence)zzKN.get("adid")))
        {
            flag1 = false;
        }
        obj = new zzh(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l1 = Tracker.zzi(zzKU).zza(((zzh) (obj)));
        zzKN.put("_s", String.valueOf(l1));
        obj = new zzab(zzKU, zzKN, l, zzKS);
        Tracker.zzj(zzKU).zza(((zzab) (obj)));
    }

    zb(Tracker tracker, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        zzKU = tracker;
        zzKN = map;
        zzKO = flag;
        zzKP = s;
        zzKQ = l;
        zzKR = flag1;
        zzKS = flag2;
        zzKT = s1;
        super();
    }
}
