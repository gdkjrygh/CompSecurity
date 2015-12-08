// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.zzid;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg, zzi, zzm

public class zzh extends FrameLayout
    implements zzg
{

    private final zzid zzoA;
    private String zzwC;
    private final FrameLayout zzzO;
    private final zzi zzzP;
    private final zzm zzzQ = new zzm(this);
    private TextView zzzR;
    private long zzzS;
    private long zzzT;

    public zzh(Context context, zzid zzid1)
    {
        super(context);
        zzoA = zzid1;
        zzzO = new FrameLayout(context);
        addView(zzzO);
        zzzP = new zzi(context);
        zzzO.addView(zzzP, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        zzzR = new TextView(context);
        zzzR.setBackgroundColor(0xff000000);
        zzeM();
        zzzQ.zzeY();
        zzzP.zza(this);
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
        zzoA.zzc("onVideoEvent", hashmap);
    }

    public static void zzd(zzid zzid1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        zzid1.zzc("onVideoEvent", hashmap);
    }

    private void zzeM()
    {
        if (!zzeO())
        {
            zzzO.addView(zzzR, new android.widget.FrameLayout.LayoutParams(-1, -1));
            zzzO.bringChildToFront(zzzR);
        }
    }

    private void zzeN()
    {
        if (zzeO())
        {
            zzzO.removeView(zzzR);
        }
    }

    private boolean zzeO()
    {
        return zzzR.getParent() != null;
    }

    public void destroy()
    {
        zzzQ.cancel();
        zzzP.stop();
    }

    public void onPaused()
    {
        zza("pause", new String[0]);
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (zzzT == 0L)
        {
            zza("canplaythrough", new String[] {
                "duration", String.valueOf((float)mediaplayer.getDuration() / 1000F), "videoWidth", String.valueOf(mediaplayer.getVideoWidth()), "videoHeight", String.valueOf(mediaplayer.getVideoHeight())
            });
        }
    }

    public void pause()
    {
        zzzP.pause();
    }

    public void play()
    {
        zzzP.play();
    }

    public void seekTo(int i)
    {
        zzzP.seekTo(i);
    }

    public void zza(float f)
    {
        zzzP.zza(f);
    }

    public void zzah(String s)
    {
        zzwC = s;
    }

    public void zzc(MotionEvent motionevent)
    {
        zzzP.dispatchTouchEvent(motionevent);
    }

    public void zzeD()
    {
    }

    public void zzeE()
    {
    }

    public void zzeF()
    {
        zza("ended", new String[0]);
    }

    public void zzeG()
    {
        zzeM();
        zzzT = zzzS;
    }

    public void zzeH()
    {
        if (!TextUtils.isEmpty(zzwC))
        {
            zzzP.setVideoPath(zzwC);
            return;
        } else
        {
            zza("no_src", new String[0]);
            return;
        }
    }

    public void zzeI()
    {
        zzzP.zzeI();
    }

    public void zzeJ()
    {
        zzzP.zzeJ();
    }

    public void zzeK()
    {
        TextView textview = new TextView(zzzP.getContext());
        textview.setText("AdMob");
        textview.setTextColor(0xffff0000);
        textview.setBackgroundColor(-256);
        zzzO.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        zzzO.bringChildToFront(textview);
    }

    void zzeL()
    {
        long l = zzzP.getCurrentPosition();
        if (zzzS != l && l > 0L)
        {
            zzeN();
            zza("timeupdate", new String[] {
                "time", String.valueOf((float)l / 1000F)
            });
            zzzS = l;
        }
    }

    public void zzf(int i, int j, int k, int l)
    {
        if (k == 0 || l == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k + 2, l + 2);
            layoutparams.setMargins(i - 1, j - 1, 0, 0);
            zzzO.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    public void zzg(String s, String s1)
    {
        zza("error", new String[] {
            "what", s, "extra", s1
        });
    }
}
