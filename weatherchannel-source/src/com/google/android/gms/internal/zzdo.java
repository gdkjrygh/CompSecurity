// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzh;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzid

public final class zzdo
    implements zzdg
{

    private final Map zzwA = new WeakHashMap();

    public zzdo()
    {
    }

    private static int zza(Context context, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int j = i;
        if (map != null)
        {
            try
            {
                j = zzk.zzcA().zzb(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zzb.zzaC((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void zza(zzid zzid1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        zzb.zzaC("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (zzb.zzL(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            zzb.zzay((new StringBuilder()).append("Video GMSG: ").append(((String) (obj1))).append(" ").append(jsonobject.toString()).toString());
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            zzb.zzaC("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = zzid1.zzgD();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        map = map.zzeq();
        if (map != null)
        {
            try
            {
                map.setBackgroundColor(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (zzid zzid1)
            {
                zzb.zzaC("Invalid color parameter in video GMSG.");
            }
            return;
        }
        zzwA.put(zzid1, Integer.valueOf(i));
        return;
        Object obj = zzid1.zzgD();
        if (obj == null)
        {
            zzb.zzaC("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj1);
        boolean flag1 = "position".equals(obj1);
        if (flag || flag1)
        {
            obj1 = zzid1.getContext();
            int j = zza(((Context) (obj1)), map, "x", 0);
            int l = zza(((Context) (obj1)), map, "y", 0);
            int j1 = zza(((Context) (obj1)), map, "w", -1);
            int k1 = zza(((Context) (obj1)), map, "h", -1);
            if (flag && ((zzc) (obj)).zzeq() == null)
            {
                ((zzc) (obj)).zze(j, l, j1, k1);
                if (zzwA.containsKey(zzid1))
                {
                    j = ((Integer)zzwA.get(zzid1)).intValue();
                    ((zzc) (obj)).zzeq().setBackgroundColor(j);
                    return;
                }
            } else
            {
                ((zzc) (obj)).zzd(j, l, j1, k1);
                return;
            }
        } else
        {
            obj = ((zzc) (obj)).zzeq();
            if (obj == null)
            {
                zzh.zzd(zzid1);
                return;
            }
            if ("click".equals(obj1))
            {
                zzid1 = zzid1.getContext();
                int k = zza(((Context) (zzid1)), map, "x", 0);
                int i1 = zza(((Context) (zzid1)), map, "y", 0);
                long l1 = SystemClock.uptimeMillis();
                zzid1 = MotionEvent.obtain(l1, l1, 0, k, i1, 0);
                ((zzh) (obj)).zzc(zzid1);
                zzid1.recycle();
                return;
            }
            if ("currentTime".equals(obj1))
            {
                zzid1 = (String)map.get("time");
                if (zzid1 == null)
                {
                    zzb.zzaC("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    ((zzh) (obj)).seekTo((int)(Float.parseFloat(zzid1) * 1000F));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    zzb.zzaC((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(zzid1).toString());
                }
                return;
            }
            if ("hide".equals(obj1))
            {
                ((zzh) (obj)).setVisibility(4);
                return;
            }
            if ("load".equals(obj1))
            {
                ((zzh) (obj)).zzeH();
                return;
            }
            if ("muted".equals(obj1))
            {
                if (Boolean.parseBoolean((String)map.get("muted")))
                {
                    ((zzh) (obj)).zzeI();
                    return;
                } else
                {
                    ((zzh) (obj)).zzeJ();
                    return;
                }
            }
            if ("pause".equals(obj1))
            {
                ((zzh) (obj)).pause();
                return;
            }
            if ("play".equals(obj1))
            {
                ((zzh) (obj)).play();
                return;
            }
            if ("show".equals(obj1))
            {
                ((zzh) (obj)).setVisibility(0);
                return;
            }
            if ("src".equals(obj1))
            {
                ((zzh) (obj)).zzah((String)map.get("src"));
                return;
            }
            if ("volume".equals(obj1))
            {
                zzid1 = (String)map.get("volume");
                if (zzid1 == null)
                {
                    zzb.zzaC("Level parameter missing from volume video GMSG.");
                    return;
                }
                try
                {
                    ((zzh) (obj)).zza(Float.parseFloat(zzid1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    zzb.zzaC((new StringBuilder()).append("Could not parse volume parameter from volume video GMSG: ").append(zzid1).toString());
                }
                return;
            }
            if ("watermark".equals(obj1))
            {
                ((zzh) (obj)).zzeK();
                return;
            } else
            {
                zzb.zzaC((new StringBuilder()).append("Unknown video action: ").append(((String) (obj1))).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
