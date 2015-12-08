// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzhm, zzep, zzid, 
//            zzie, zzdi, zzhl

public final class zzdn
    implements zzdg
{

    private final zzd zzww;
    private final zzep zzwx;
    private final zzdi zzwz;

    public zzdn(zzdi zzdi1, zzd zzd1, zzep zzep1)
    {
        zzwz = zzdi1;
        zzww = zzd1;
        zzwx = zzep1;
    }

    private static boolean zzd(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int zze(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return zzo.zzbx().zzgr();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return zzo.zzbx().zzgq();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return zzo.zzbx().zzgs();
            }
        }
        return -1;
    }

    private void zzm(boolean flag)
    {
        if (zzwx != null)
        {
            zzwx.zzn(flag);
        }
    }

    public void zza(zzid zzid1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            zzb.zzaC("Action missing from an open GMSG.");
        } else
        {
            if (zzww != null && !zzww.zzbd())
            {
                zzww.zzo((String)map.get("u"));
                return;
            }
            zzie zzie1 = zzid1.zzgF();
            if ("expand".equalsIgnoreCase(s))
            {
                if (zzid1.zzgJ())
                {
                    zzb.zzaC("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    zzm(false);
                    zzie1.zza(zzd(map), zze(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                zzid1 = (String)map.get("u");
                zzm(false);
                if (zzid1 != null)
                {
                    zzie1.zza(zzd(map), zze(map), zzid1);
                    return;
                } else
                {
                    zzie1.zza(zzd(map), zze(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                zzid1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (zzwz != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        zzwz.zza(zzid1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        zzwz.zza(zzid1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                zzm(true);
                zzid1.zzgH();
                String s1 = (String)map.get("u");
                if (!TextUtils.isEmpty(s1))
                {
                    zzid1 = zzo.zzbv().zza(zzid1, s1);
                } else
                {
                    zzid1 = s1;
                }
                zzie1.zza(new AdLauncherIntentInfoParcel((String)map.get("i"), zzid1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
