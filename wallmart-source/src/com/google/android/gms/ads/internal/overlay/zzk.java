// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzip;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzh, zzj, zzq, zzi

public class zzk extends FrameLayout
    implements zzh
{

    private final FrameLayout zzBb;
    private final zzq zzBc = new zzq(this);
    private zzi zzBd;
    private boolean zzBe;
    private boolean zzBf;
    private TextView zzBg;
    private long zzBh;
    private long zzBi;
    private String zzBj;
    private final zzip zzoL;
    private String zzxs;

    public zzk(Context context, zzip zzip1, int i, zzcd zzcd, zzcc zzcc)
    {
        super(context);
        zzoL = zzip1;
        zzBb = new FrameLayout(context);
        addView(zzBb);
        zzb.zzr(zzip1.zzgP());
        zzBd = zzip1.zzgP().zzoG.zza(context, zzip1, i, zzcd, zzcc);
        zzBb.addView(zzBd, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        zzBg = new TextView(context);
        zzBg.setBackgroundColor(0xff000000);
        zzeS();
        zzBc.zzfa();
        zzBd.zza(this);
    }

    private transient void zza(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int j = as.length;
        int i = 0;
        s = null;
        while (i < j) 
        {
            String s1 = as[i];
            if (s == null)
            {
                s = s1;
            } else
            {
                hashmap.put(s, s1);
                s = null;
            }
            i++;
        }
        zzoL.zzc("onVideoEvent", hashmap);
    }

    public static void zzd(zzip zzip1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        zzip1.zzc("onVideoEvent", hashmap);
    }

    private void zzeS()
    {
        if (!zzeU())
        {
            zzBb.addView(zzBg, new android.widget.FrameLayout.LayoutParams(-1, -1));
            zzBb.bringChildToFront(zzBg);
        }
    }

    private void zzeT()
    {
        if (zzeU())
        {
            zzBb.removeView(zzBg);
        }
    }

    private boolean zzeU()
    {
        return zzBg.getParent() != null;
    }

    private void zzeV()
    {
        if (zzoL.zzgN() != null && !zzBe)
        {
            boolean flag;
            if ((zzoL.zzgN().getWindow().getAttributes().flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzBf = flag;
            if (!zzBf)
            {
                zzoL.zzgN().getWindow().addFlags(128);
                zzBe = true;
                return;
            }
        }
    }

    private void zzeW()
    {
        while (zzoL.zzgN() == null || !zzBe || zzBf) 
        {
            return;
        }
        zzoL.zzgN().getWindow().clearFlags(128);
        zzBe = false;
    }

    public void destroy()
    {
        zzBc.cancel();
        zzBd.stop();
        zzeW();
    }

    public void onPaused()
    {
        zza("pause", new String[0]);
        zzeW();
    }

    public void pause()
    {
        zzBd.pause();
    }

    public void play()
    {
        zzBd.play();
    }

    public void seekTo(int i)
    {
        zzBd.seekTo(i);
    }

    public void setMimeType(String s)
    {
        zzBj = s;
    }

    public void zza(float f)
    {
        zzBd.zza(f);
    }

    public void zzak(String s)
    {
        zzxs = s;
    }

    public void zzd(MotionEvent motionevent)
    {
        zzBd.dispatchTouchEvent(motionevent);
    }

    public void zze(int i, int j, int k, int l)
    {
        if (k == 0 || l == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k + 2, l + 2);
            layoutparams.setMargins(i - 1, j - 1, 0, 0);
            zzBb.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    public void zzeK()
    {
    }

    public void zzeL()
    {
        if (zzBi == 0L)
        {
            zza("canplaythrough", new String[] {
                "duration", String.valueOf((float)zzBd.getDuration() / 1000F), "videoWidth", String.valueOf(zzBd.getVideoWidth()), "videoHeight", String.valueOf(zzBd.getVideoHeight())
            });
        }
    }

    public void zzeM()
    {
        zzeV();
    }

    public void zzeN()
    {
        zza("ended", new String[0]);
        zzeW();
    }

    public void zzeO()
    {
        zzeS();
        zzBi = zzBh;
    }

    public void zzeP()
    {
        if (!TextUtils.isEmpty(zzxs))
        {
            zzBd.setMimeType(zzBj);
            zzBd.setVideoPath(zzxs);
            return;
        } else
        {
            zza("no_src", new String[0]);
            return;
        }
    }

    public void zzeQ()
    {
        TextView textview = new TextView(zzBd.getContext());
        textview.setText((new StringBuilder()).append("AdMob - ").append(zzBd.zzek()).toString());
        textview.setTextColor(0xffff0000);
        textview.setBackgroundColor(-256);
        zzBb.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        zzBb.bringChildToFront(textview);
    }

    void zzeR()
    {
        long l = zzBd.getCurrentPosition();
        if (zzBh != l && l > 0L)
        {
            zzeT();
            zza("timeupdate", new String[] {
                "time", String.valueOf((float)l / 1000F)
            });
            zzBh = l;
        }
    }

    public void zzeq()
    {
        zzBd.zzeq();
    }

    public void zzer()
    {
        zzBd.zzer();
    }

    public void zzh(String s, String s1)
    {
        zza("error", new String[] {
            "what", s, "extra", s1
        });
    }
}
