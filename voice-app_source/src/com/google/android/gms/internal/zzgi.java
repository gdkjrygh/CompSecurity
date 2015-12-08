// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzhm

public final class zzgi
{

    private int mOrientation;
    private List zzBK;
    private String zzDR;
    private String zzDS;
    private List zzDT;
    private String zzDU;
    private String zzDV;
    private List zzDW;
    private long zzDX;
    private boolean zzDY;
    private final long zzDZ = -1L;
    private long zzEa;
    private boolean zzEb;
    private boolean zzEc;
    private boolean zzEd;
    private boolean zzEe;
    private int zzEf;
    private String zzvj;
    private final AdRequestInfoParcel zzxm;

    public zzgi(AdRequestInfoParcel adrequestinfoparcel)
    {
        zzDX = -1L;
        zzDY = false;
        zzEa = -1L;
        mOrientation = -1;
        zzEb = false;
        zzEc = false;
        zzEd = false;
        zzEe = true;
        zzEf = 0;
        zzxm = adrequestinfoparcel;
    }

    static String zzc(Map map, String s)
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

    static long zzd(Map map, String s)
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
        zzb.zzaC((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    static List zze(Map map, String s)
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

    private boolean zzf(Map map, String s)
    {
        map = (List)map.get(s);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    private void zzj(Map map)
    {
        zzDR = zzc(map, "X-Afma-Ad-Size");
    }

    private void zzk(Map map)
    {
        map = zze(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            zzDT = map;
        }
    }

    private void zzl(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            zzDU = (String)map.get(0);
        }
    }

    private void zzm(Map map)
    {
        map = zze(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            zzDW = map;
        }
    }

    private void zzn(Map map)
    {
        long l = zzd(map, "X-Afma-Interstitial-Timeout");
        if (l != -1L)
        {
            zzDX = l;
        }
    }

    private void zzo(Map map)
    {
        zzDV = zzc(map, "X-Afma-ActiveView");
    }

    private void zzp(Map map)
    {
        boolean flag1 = zzEc;
        boolean flag;
        if (zzxm != null && zzxm.zzCs != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzEc = flag | flag1;
    }

    private void zzq(Map map)
    {
        zzEb = zzEb | zzf(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void zzr(Map map)
    {
        zzDY = zzDY | zzf(map, "X-Afma-Mediation");
    }

    private void zzs(Map map)
    {
        map = zze(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            zzBK = map;
        }
    }

    private void zzt(Map map)
    {
        long l = zzd(map, "X-Afma-Refresh-Rate");
        if (l != -1L)
        {
            zzEa = l;
        }
    }

    private void zzu(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                mOrientation = com.google.android.gms.ads.internal.zzo.zzbx().zzgr();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = com.google.android.gms.ads.internal.zzo.zzbx().zzgq();
                return;
            }
        }
    }

    private void zzv(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            zzEd = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzw(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            zzEe = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzx(Map map)
    {
        map = zze(map, "X-Afma-OAuth-Token-Status");
        zzEf = 0;
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
                zzEf = 1;
                return;
            }
        } while (!"No-Op".equalsIgnoreCase(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        zzEf = 0;
        return;
    }

    public void zza(String s, Map map, String s1)
    {
        zzDS = s;
        zzvj = s1;
        zzi(map);
    }

    public void zzi(Map map)
    {
        zzj(map);
        zzk(map);
        zzl(map);
        zzm(map);
        zzn(map);
        zzr(map);
        zzs(map);
        zzt(map);
        zzu(map);
        zzo(map);
        zzv(map);
        zzq(map);
        zzp(map);
        zzw(map);
        zzx(map);
    }

    public AdResponseParcel zzj(long l)
    {
        return new AdResponseParcel(zzxm, zzDS, zzvj, zzDT, zzDW, zzDX, zzDY, -1L, zzBK, zzEa, mOrientation, zzDR, l, zzDU, zzDV, zzEb, zzEc, zzEd, zzEe, false, zzEf);
    }
}
