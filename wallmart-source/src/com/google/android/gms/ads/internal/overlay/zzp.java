// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzhx;
import com.google.android.gms.internal.zzlm;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzi

public class zzp
{

    private final Context mContext;
    private boolean zzBA;
    private long zzBB;
    private final String zzBm;
    private final zzcc zzBn;
    private final zzcd zzBo;
    private final VersionInfoParcel zzBp;
    private final zzhx zzBq = (new com.google.android.gms.internal.zzhx.zzb()).zza("min_1", 4.9406564584124654E-324D, 1.0D).zza("1_5", 1.0D, 5D).zza("5_10", 5D, 10D).zza("10_20", 10D, 20D).zza("20_30", 20D, 30D).zza("30_max", 30D, 1.7976931348623157E+308D).zzgz();
    private final long zzBr[];
    private final String zzBs[];
    private zzcc zzBt;
    private zzcc zzBu;
    private zzcc zzBv;
    private zzcc zzBw;
    private boolean zzBx;
    private zzi zzBy;
    private boolean zzBz;

    public zzp(Context context, VersionInfoParcel versioninfoparcel, String s, zzcd zzcd1, zzcc zzcc)
    {
        zzBB = -1L;
        mContext = context;
        zzBp = versioninfoparcel;
        zzBm = s;
        zzBo = zzcd1;
        zzBn = zzcc;
        context = (String)zzby.zzuq.get();
        if (context == null)
        {
            zzBs = new String[0];
            zzBr = new long[0];
        } else
        {
            context = TextUtils.split(context, ",");
            zzBs = new String[context.length];
            zzBr = new long[context.length];
            int i = 0;
            while (i < context.length) 
            {
                try
                {
                    zzBr[i] = Long.parseLong(context[i]);
                }
                // Misplaced declaration of an exception variable
                catch (VersionInfoParcel versioninfoparcel)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Unable to parse frame hash target time number.", versioninfoparcel);
                    zzBr[i] = -1L;
                }
                i++;
            }
        }
    }

    private void zzc(zzi zzi1)
    {
        int i;
        long l;
        long l1;
        l = ((Long)zzby.zzur.get()).longValue();
        l1 = zzi1.getCurrentPosition();
        i = 0;
_L3:
        if (i >= zzBs.length)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (zzBs[i] != null || l <= Math.abs(l1 - zzBr[i])) goto _L5; else goto _L4
_L4:
        zzBs[i] = zza(zzi1);
_L2:
    }

    private void zzeX()
    {
        if (zzBv != null && zzBw == null)
        {
            zzBo.zza(zzBv, new String[] {
                "vff"
            });
            zzBo.zza(zzBn, new String[] {
                "vtt"
            });
            zzBw = zzBo.zzdl();
        }
        long l = com.google.android.gms.ads.internal.zzp.zzbB().nanoTime();
        if (zzBx && zzBA && zzBB != -1L)
        {
            double d = (double)TimeUnit.SECONDS.toNanos(1L) / (double)(l - zzBB);
            zzBq.zza(d);
        }
        zzBA = zzBx;
        zzBB = l;
    }

    public void onStop()
    {
        if (((Boolean)zzby.zzup.get()).booleanValue() && !zzBz)
        {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", zzBm);
            bundle.putString("player", zzBy.zzek());
            com.google.android.gms.internal.zzhx.zza zza1;
            for (Iterator iterator = zzBq.getBuckets().iterator(); iterator.hasNext(); bundle.putString((new StringBuilder()).append("fps_p_").append(zza1.name).toString(), Double.toString(zza1.zzIb)))
            {
                zza1 = (com.google.android.gms.internal.zzhx.zza)iterator.next();
                bundle.putString((new StringBuilder()).append("fps_c_").append(zza1.name).toString(), Integer.toString(zza1.count));
            }

            int i = 0;
            while (i < zzBr.length) 
            {
                String s = zzBs[i];
                if (s != null)
                {
                    bundle.putString((new StringBuilder()).append("fh_").append(Long.valueOf(zzBr[i])).toString(), s);
                }
                i++;
            }
            com.google.android.gms.ads.internal.zzp.zzbx().zza(mContext, zzBp.zzIz, "gmob-apps", bundle, true);
            zzBz = true;
        }
    }

    String zza(TextureView textureview)
    {
        textureview = textureview.getBitmap(8, 8);
        long l2 = 0L;
        long l1 = 63L;
        for (int i = 0; i < 8;)
        {
            long l3 = l1;
            int j = 0;
            l1 = l2;
            l2 = l3;
            while (j < 8) 
            {
                int k = textureview.getPixel(j, i);
                int l = Color.blue(k);
                int i1 = Color.red(k);
                if (Color.green(k) + (l + i1) > 128)
                {
                    l3 = 1L;
                } else
                {
                    l3 = 0L;
                }
                l1 |= l3 << (int)l2;
                l2--;
                j++;
            }
            i++;
            l3 = l1;
            l1 = l2;
            l2 = l3;
        }

        return String.format("%016X", new Object[] {
            Long.valueOf(l2)
        });
    }

    public void zza(zzi zzi1)
    {
        zzBo.zza(zzBn, new String[] {
            "vpc"
        });
        zzBt = zzBo.zzdl();
        zzBy = zzi1;
    }

    public void zzb(zzi zzi1)
    {
        zzeX();
        zzc(zzi1);
    }

    public void zzeL()
    {
        if (zzBt == null || zzBu != null)
        {
            return;
        } else
        {
            zzBo.zza(zzBt, new String[] {
                "vfr"
            });
            zzBu = zzBo.zzdl();
            return;
        }
    }

    public void zzeY()
    {
        zzBx = true;
        if (zzBu != null && zzBv == null)
        {
            zzBo.zza(zzBu, new String[] {
                "vfp"
            });
            zzBv = zzBo.zzdl();
        }
    }

    public void zzeZ()
    {
        zzBx = false;
    }
}
