// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzhv

public final class zzgp
{

    private int mOrientation;
    private List zzCX;
    private String zzFf;
    private String zzFg;
    private List zzFh;
    private String zzFi;
    private String zzFj;
    private List zzFk;
    private long zzFl;
    private boolean zzFm;
    private final long zzFn = -1L;
    private long zzFo;
    private boolean zzFp;
    private boolean zzFq;
    private boolean zzFr;
    private boolean zzFs;
    private int zzFt;
    private String zzvM;
    private final AdRequestInfoParcel zzyd;

    public zzgp(AdRequestInfoParcel adrequestinfoparcel)
    {
        zzFl = -1L;
        zzFm = false;
        zzFo = -1L;
        mOrientation = -1;
        zzFp = false;
        zzFq = false;
        zzFr = false;
        zzFs = true;
        zzFt = 0;
        zzyd = adrequestinfoparcel;
    }

    static String zzd(Map map, String s)
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

    static long zze(Map map, String s)
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    static List zzf(Map map, String s)
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

    private boolean zzg(Map map, String s)
    {
        map = (List)map.get(s);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    private void zzi(Map map)
    {
        zzFf = zzd(map, "X-Afma-Ad-Size");
    }

    private void zzj(Map map)
    {
        map = zzf(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            zzFh = map;
        }
    }

    private void zzk(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            zzFi = (String)map.get(0);
        }
    }

    private void zzl(Map map)
    {
        map = zzf(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            zzFk = map;
        }
    }

    private void zzm(Map map)
    {
        long l = zze(map, "X-Afma-Interstitial-Timeout");
        if (l != -1L)
        {
            zzFl = l;
        }
    }

    private void zzn(Map map)
    {
        zzFj = zzd(map, "X-Afma-ActiveView");
    }

    private void zzo(Map map)
    {
        boolean flag1 = zzFq;
        boolean flag;
        if (zzyd != null && zzyd.zzDE != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzFq = flag | flag1;
    }

    private void zzp(Map map)
    {
        zzFp = zzFp | zzg(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void zzq(Map map)
    {
        zzFm = zzFm | zzg(map, "X-Afma-Mediation");
    }

    private void zzr(Map map)
    {
        map = zzf(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            zzCX = map;
        }
    }

    private void zzs(Map map)
    {
        long l = zze(map, "X-Afma-Refresh-Rate");
        if (l != -1L)
        {
            zzFo = l;
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
                mOrientation = com.google.android.gms.ads.internal.zzp.zzbz().zzgw();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = com.google.android.gms.ads.internal.zzp.zzbz().zzgv();
                return;
            }
        }
    }

    private void zzu(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            zzFr = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzv(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            zzFs = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzw(Map map)
    {
        map = zzf(map, "X-Afma-OAuth-Token-Status");
        zzFt = 0;
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
                zzFt = 1;
                return;
            }
        } while (!"No-Op".equalsIgnoreCase(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        zzFt = 0;
        return;
    }

    public void zzb(String s, Map map, String s1)
    {
        zzFg = s;
        zzvM = s1;
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

    public AdResponseParcel zzj(long l)
    {
        return new AdResponseParcel(zzyd, zzFg, zzvM, zzFh, zzFk, zzFl, zzFm, -1L, zzCX, zzFo, mOrientation, zzFf, l, zzFi, zzFj, zzFp, zzFq, zzFr, zzFs, false, zzFt);
    }
}
