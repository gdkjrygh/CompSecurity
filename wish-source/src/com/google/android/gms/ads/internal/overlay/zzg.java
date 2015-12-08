// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzgd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class zzg extends FrameLayout
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class zza
    {

        private final Runnable zznB;
        private volatile boolean zzwZ;

        static boolean zza(zza zza1)
        {
            return zza1.zzwZ;
        }

        public void cancel()
        {
            zzwZ = true;
            zzfl.zzCr.removeCallbacks(zznB);
        }

        public void zzdR()
        {
            zzfl.zzCr.postDelayed(zznB, 250L);
        }

        public zza(zzg zzg1)
        {
            zzwZ = false;
            zznB = new _cls1(this, zzg1);
        }
    }


    private final zzgd zznp;
    private String zztN;
    private final MediaController zzwJ;
    private final zza zzwK = new zza(this);
    private final FrameLayout zzwL;
    private final VideoView zzwM;
    private TextView zzwN;
    private MediaPlayer zzwO;
    private boolean zzwP;
    private boolean zzwQ;
    private long zzwR;
    private long zzwS;
    private float zzwT;

    public zzg(Context context, zzgd zzgd1)
    {
        super(context);
        zznp = zzgd1;
        zzwL = new FrameLayout(context);
        addView(zzwL);
        zzwM = new VideoView(new ContextWrapper(context) {

            final zzg zzwU;

            public void sendBroadcast(Intent intent)
            {
            }

            
            {
                zzwU = zzg.this;
                super(context);
            }
        }) {

            final zzg zzwU;

            protected void onWindowVisibilityChanged(int i)
            {
                super.onWindowVisibilityChanged(i);
                if (i == 0 && zzg.zza(zzwU) == null)
                {
                    com.google.android.gms.ads.internal.overlay.zzg.zzb(zzwU);
                }
                if (i == 8)
                {
                    zzg.zza(zzwU, zzg.zzc(zzwU));
                    zzg.zza(zzwU, null);
                }
            }

            
            {
                zzwU = zzg.this;
                super(context);
            }
        };
        zzwL.addView(zzwM, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        zzwN = new TextView(context);
        zzwN.setBackgroundColor(0xff000000);
        zzdK();
        zzwJ = new MediaController(context);
        zzwT = 1.0F;
        zzwK.zzdR();
        zzwM.setOnCompletionListener(this);
        zzwM.setOnPreparedListener(this);
        zzwM.setOnErrorListener(this);
    }

    static long zza(zzg zzg1, long l)
    {
        zzg1.zzwS = l;
        return l;
    }

    static MediaPlayer zza(zzg zzg1)
    {
        return zzg1.zzwO;
    }

    static MediaPlayer zza(zzg zzg1, MediaPlayer mediaplayer)
    {
        zzg1.zzwO = mediaplayer;
        return mediaplayer;
    }

    private static void zza(zzgd zzgd1, String s)
    {
        zza(zzgd1, s, ((Map) (new HashMap(1))));
    }

    public static void zza(zzgd zzgd1, String s, String s1)
    {
        HashMap hashmap;
        boolean flag;
        byte byte0;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 3;
        }
        hashmap = new HashMap(byte0);
        hashmap.put("what", s);
        if (!flag)
        {
            hashmap.put("extra", s1);
        }
        zza(zzgd1, "error", ((Map) (hashmap)));
    }

    private static void zza(zzgd zzgd1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        zza(zzgd1, s, ((Map) (hashmap)));
    }

    private static void zza(zzgd zzgd1, String s, Map map)
    {
        map.put("event", s);
        zzgd1.zzb("onVideoEvent", map);
    }

    private void zzb(float f)
    {
        if (zzwO != null)
        {
            try
            {
                zzwO.setVolume(f, f);
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                return;
            }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("AdVideoView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
    }

    static void zzb(zzg zzg1)
    {
        zzg1.zzdK();
    }

    static long zzc(zzg zzg1)
    {
        return zzg1.zzwR;
    }

    static VideoView zzd(zzg zzg1)
    {
        return zzg1.zzwM;
    }

    private void zzdK()
    {
        if (!zzdM())
        {
            zzwL.addView(zzwN, new android.widget.FrameLayout.LayoutParams(-1, -1));
            zzwL.bringChildToFront(zzwN);
        }
    }

    private void zzdL()
    {
        if (zzdM())
        {
            zzwL.removeView(zzwN);
        }
    }

    private boolean zzdM()
    {
        return zzwN.getParent() != null;
    }

    private void zzdN()
    {
        zzwQ = true;
        zzdP();
    }

    private void zzdO()
    {
        zzwQ = false;
        zzdP();
    }

    private void zzdP()
    {
        if (!zzwP && zzwQ)
        {
            zzb(zzwT);
            return;
        } else
        {
            zzb(0.0F);
            return;
        }
    }

    private AudioManager zzdQ()
    {
        return (AudioManager)zzwM.getContext().getSystemService("audio");
    }

    static void zze(zzg zzg1)
    {
        zzg1.zzdL();
    }

    public void destroy()
    {
        AudioManager audiomanager = zzdQ();
        if (audiomanager != null)
        {
            audiomanager.abandonAudioFocus(this);
        }
        zzwK.cancel();
        zzwM.stopPlayback();
    }

    public void onAudioFocusChange(int i)
    {
        if (i > 0)
        {
            zzdN();
        } else
        if (i < 0)
        {
            zzdO();
            return;
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        zza(zznp, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        zza(zznp, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        zzwO = mediaplayer;
        if (zzwS == 0L)
        {
            mediaplayer = new HashMap((float)mediaplayer.getDuration() / 1000F, mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight()) {

                final zzg zzwU;
                final float zzwV;
                final int zzwW;
                final int zzwX;

            
            {
                zzwU = zzg.this;
                zzwV = f;
                zzwW = i;
                zzwX = j;
                super();
                put("duration", String.valueOf(zzwV));
                put("videoWidth", String.valueOf(zzwW));
                put("videoHeight", String.valueOf(zzwX));
            }
            };
            zza(zznp, "canplaythrough", mediaplayer);
        } else
        {
            int i = (int)zzwS;
            zzwM.post(new Runnable(i) {

                final zzg zzwU;
                final int zzwY;

                public void run()
                {
                    if (zzg.zza(zzwU) != null)
                    {
                        zzg.zza(zzwU).seekTo(zzwY);
                        zzg.zzd(zzwU).start();
                        zzg.zzd(zzwU).pause();
                    }
                }

            
            {
                zzwU = zzg.this;
                zzwY = i;
                super();
            }
            });
        }
        zzwO.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {

            final zzg zzwU;

            public boolean onInfo(MediaPlayer mediaplayer1, int j, int k)
            {
                if (j == 3)
                {
                    zzg.zze(zzwU);
                }
                return false;
            }

            
            {
                zzwU = zzg.this;
                super();
            }
        });
        zzdP();
    }

    public void pause()
    {
        zzwM.pause();
    }

    public void play()
    {
        if (!zzwQ)
        {
            AudioManager audiomanager = zzdQ();
            if (audiomanager != null && audiomanager.requestAudioFocus(this, 3, 2) == 1)
            {
                zzdN();
            }
        }
        zzwM.start();
    }

    public void seekTo(int i)
    {
        if (zzwO != null)
        {
            zzwM.seekTo(i);
        }
    }

    public void setBackgroundColor(int i)
    {
        super.setBackgroundColor(i);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).toString();
    }

    public void zzT(String s)
    {
        zztN = s;
    }

    public void zza(float f)
    {
        zzwT = f;
        zzdP();
    }

    public void zzb(MotionEvent motionevent)
    {
        zzwM.dispatchTouchEvent(motionevent);
    }

    public void zzdF()
    {
        if (!TextUtils.isEmpty(zztN))
        {
            zzwM.setVideoPath(zztN);
            return;
        } else
        {
            zza(zznp, "no_src", ((String) (null)));
            return;
        }
    }

    public void zzdG()
    {
        zzwP = true;
        zzdP();
    }

    public void zzdH()
    {
        zzwP = false;
        zzdP();
    }

    public void zzdI()
    {
        long l = zzwM.getCurrentPosition();
        if (zzwR != l && l > 0L)
        {
            zzdL();
            float f = (float)l / 1000F;
            zza(zznp, "timeupdate", "time", String.valueOf(f));
            zzwR = l;
        }
    }

    public void zzdJ()
    {
        TextView textview = new TextView(zzwM.getContext());
        textview.setText("AdMob");
        textview.setTextColor(0xffff0000);
        textview.setBackgroundColor(-256);
        zzwL.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        zzwL.bringChildToFront(textview);
    }

    public void zzf(int i, int j, int k, int l)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k, l);
        layoutparams.setMargins(i, j, 0, 0);
        zzwL.setLayoutParams(layoutparams);
        requestLayout();
    }

    public void zzv(boolean flag)
    {
        if (flag)
        {
            zzwM.setMediaController(zzwJ);
            return;
        } else
        {
            zzwJ.hide();
            zzwM.setMediaController(null);
            return;
        }
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/overlay/zzg$zza$1

/* anonymous class */
    class zza._cls1
        implements Runnable
    {

        private final WeakReference zzxa;
        final zzg zzxb;
        final zza zzxc;

        public void run()
        {
            zzg zzg1 = (zzg)zzxa.get();
            if (!zza.zza(zzxc) && zzg1 != null)
            {
                zzg1.zzdI();
                zzxc.zzdR();
            }
        }

            
            {
                zzxc = zza1;
                zzxb = zzg1;
                super();
                zzxa = new WeakReference(zzxb);
            }
    }

}
