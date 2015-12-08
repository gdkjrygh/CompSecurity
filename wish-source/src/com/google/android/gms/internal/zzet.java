// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzfm

public final class zzet
{

    private int mOrientation;
    private String zzAB;
    private String zzAC;
    private List zzAD;
    private String zzAE;
    private String zzAF;
    private List zzAG;
    private long zzAH;
    private boolean zzAI;
    private final long zzAJ = -1L;
    private long zzAK;
    private boolean zzAL;
    private boolean zzAM;
    private boolean zzAN;
    private boolean zzAO;
    private int zzAP;
    private String zzsI;
    private final AdRequestInfoParcel zzul;
    private List zzyz;

    public zzet(AdRequestInfoParcel adrequestinfoparcel)
    {
        zzAH = -1L;
        zzAI = false;
        zzAK = -1L;
        mOrientation = -1;
        zzAL = false;
        zzAM = false;
        zzAN = false;
        zzAO = true;
        zzAP = 0;
        zzul = adrequestinfoparcel;
    }

    static String zza(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            return (String)map.get(0);
        } else
        {
            return null;
        }
    }

    static long zzb(Map map, String s)
    {
        map = (List)map.get(s);
        if (map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        map = (String)map.get(0);
        float f = Float.parseFloat(map);
        return (long)(f * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    static List zzc(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if (map != null)
            {
                return Arrays.asList(map.trim().split("\\s+"));
            }
        }
        return null;
    }

    private boolean zzd(Map map, String s)
    {
        map = (List)map.get(s);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    private void zzi(Map map)
    {
        zzAB = zza(map, "X-Afma-Ad-Size");
    }

    private void zzj(Map map)
    {
        map = zzc(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            zzAD = map;
        }
    }

    private void zzk(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            zzAE = (String)map.get(0);
        }
    }

    private void zzl(Map map)
    {
        map = zzc(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            zzAG = map;
        }
    }

    private void zzm(Map map)
    {
        long l = zzb(map, "X-Afma-Interstitial-Timeout");
        if (l != -1L)
        {
            zzAH = l;
        }
    }

    private void zzn(Map map)
    {
        zzAF = zza(map, "X-Afma-ActiveView");
    }

    private void zzo(Map map)
    {
        zzAM = zzAM | zzd(map, "X-Afma-Native");
    }

    private void zzp(Map map)
    {
        zzAL = zzAL | zzd(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void zzq(Map map)
    {
        zzAI = zzAI | zzd(map, "X-Afma-Mediation");
    }

    private void zzr(Map map)
    {
        map = zzc(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            zzyz = map;
        }
    }

    private void zzs(Map map)
    {
        long l = zzb(map, "X-Afma-Refresh-Rate");
        if (l != -1L)
        {
            zzAK = l;
        }
    }

    private void zzt(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                mOrientation = com.google.android.gms.ads.internal.zzh.zzaS().zzff();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = com.google.android.gms.ads.internal.zzh.zzaS().zzfe();
                return;
            }
        }
    }

    private void zzu(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            zzAN = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzv(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            zzAO = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzw(Map map)
    {
        map = zzc(map, "X-Afma-OAuth-Token-Status");
        zzAP = 0;
        if (map != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        map = map.iterator();
        String s;
        do
        {
            if (!map.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)map.next();
            if ("Clear".equalsIgnoreCase(s))
            {
                zzAP = 1;
                return;
            }
        } while (!"No-Op".equalsIgnoreCase(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        zzAP = 0;
        return;
    }

    public void zza(String s, Map map, String s1)
    {
        zzAC = s;
        zzsI = s1;
        zzh(map);
    }

    public void zzh(Map map)
    {
        zzi(map);
        zzj(map);
        zzk(map);
        zzl(map);
        zzm(map);
        zzq(map);
        zzr(map);
        zzs(map);
        zzt(map);
        zzn(map);
        zzu(map);
        zzp(map);
        zzo(map);
        zzv(map);
        zzw(map);
    }

    public AdResponseParcel zzi(long l)
    {
        return new AdResponseParcel(zzul, zzAC, zzsI, zzAD, zzAG, zzAH, zzAI, -1L, zzyz, zzAK, mOrientation, zzAB, l, zzAE, zzAF, zzAL, zzAM, zzAN, zzAO, false, zzAP);
    }
}
