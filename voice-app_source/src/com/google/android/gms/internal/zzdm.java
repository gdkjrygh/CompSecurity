// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzep, zzeo, zzer, 
//            zzeq, zzid

public class zzdm
    implements zzdg
{

    static final Map zzwy;
    private final zzd zzww;
    private final zzep zzwx;

    public zzdm(zzd zzd1, zzep zzep1)
    {
        zzww = zzd1;
        zzwx = zzep1;
    }

    public void zza(zzid zzid, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)zzwy.get(s)).intValue();
        if (i != 5 && zzww != null && !zzww.zzbd())
        {
            zzww.zzo(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            zzb.zzaA("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            zzwx.zzh(map);
            return;

        case 4: // '\004'
            (new zzeo(zzid, map)).execute();
            return;

        case 3: // '\003'
            (new zzer(zzid, map)).execute();
            return;

        case 5: // '\005'
            (new zzeq(zzid, map)).execute();
            return;

        case 6: // '\006'
            zzwx.zzn(true);
            break;
        }
    }

    static 
    {
        zzwy = new HashMap();
        zzwy.put("resize", Integer.valueOf(1));
        zzwy.put("playVideo", Integer.valueOf(2));
        zzwy.put("storePicture", Integer.valueOf(3));
        zzwy.put("createCalendarEvent", Integer.valueOf(4));
        zzwy.put("setOrientationProperties", Integer.valueOf(5));
        zzwy.put("closeResizedAd", Integer.valueOf(6));
    }
}
