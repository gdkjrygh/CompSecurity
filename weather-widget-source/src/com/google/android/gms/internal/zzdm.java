// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzew, zzev, zzey, 
//            zzex, zzip

public class zzdm
    implements zzdg
{

    static final Map zzxl;
    private final zze zzxj;
    private final zzew zzxk;

    public zzdm(zze zze1, zzew zzew1)
    {
        zzxj = zze1;
        zzxk = zzew1;
    }

    public void zza(zzip zzip, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)zzxl.get(s)).intValue();
        if (i != 5 && zzxj != null && !zzxj.zzbe())
        {
            zzxj.zzp(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            zzb.zzaD("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            zzxk.zzg(map);
            return;

        case 4: // '\004'
            (new zzev(zzip, map)).execute();
            return;

        case 3: // '\003'
            (new zzey(zzip, map)).execute();
            return;

        case 5: // '\005'
            (new zzex(zzip, map)).execute();
            return;

        case 6: // '\006'
            zzxk.zzn(true);
            break;
        }
    }

    static 
    {
        zzxl = new HashMap();
        zzxl.put("resize", Integer.valueOf(1));
        zzxl.put("playVideo", Integer.valueOf(2));
        zzxl.put("storePicture", Integer.valueOf(3));
        zzxl.put("createCalendarEvent", Integer.valueOf(4));
        zzxl.put("setOrientationProperties", Integer.valueOf(5));
        zzxl.put("closeResizedAd", Integer.valueOf(6));
    }
}
