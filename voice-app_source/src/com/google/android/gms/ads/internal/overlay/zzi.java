// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzlb;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

public class zzi extends SurfaceView
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.SurfaceHolder.Callback
{

    private static final Map zzzU;
    private int zzAa;
    private int zzAb;
    private int zzAc;
    private int zzAd;
    private int zzAe;
    private float zzAf;
    private boolean zzAg;
    private boolean zzAh;
    private int zzAi;
    private zzg zzAj;
    private int zzzV;
    private int zzzW;
    private SurfaceHolder zzzX;
    private MediaPlayer zzzY;
    private Uri zzzZ;

    public zzi(Context context)
    {
        super(context);
        zzzV = 0;
        zzzW = 0;
        zzAf = 1.0F;
        getHolder().addCallback(this);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            getHolder().setType(3);
        }
    }

    static zzg zza(zzi zzi1)
    {
        return zzi1.zzAj;
    }

    private void zzb(float f)
    {
        if (zzzY != null)
        {
            try
            {
                zzzY.setVolume(f, f);
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                return;
            }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("AdVideoView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
    }

    private void zzeP()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView init MediaPlayer");
        if (zzzZ == null || zzzX == null)
        {
            return;
        }
        zzv(false);
        zzzY = new MediaPlayer();
        zzzY.setOnBufferingUpdateListener(this);
        zzzY.setOnCompletionListener(this);
        zzzY.setOnErrorListener(this);
        zzzY.setOnInfoListener(this);
        zzzY.setOnPreparedListener(this);
        zzzY.setOnVideoSizeChangedListener(this);
        zzAe = 0;
        zzzY.setDataSource(getContext(), zzzZ);
        zzzY.setDisplay(zzzX);
        zzzY.setAudioStreamType(3);
        zzzY.setScreenOnWhilePlaying(true);
        zzzY.prepareAsync();
        zzzV = 1;
        return;
        Object obj;
        obj;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Failed to initialize MediaPlayer at ").append(zzzZ).toString(), ((Throwable) (obj)));
        onError(zzzY, 1, 0);
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void zzeQ()
    {
        if (zzeT() && zzzW != 3)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView nudging MediaPlayer");
            zzzY.start();
            int i = zzzY.getCurrentPosition();
            for (long l = zzo.zzbz().currentTimeMillis(); zzeT() && zzzY.getCurrentPosition() == i && zzo.zzbz().currentTimeMillis() - l <= 250L;) { }
            zzzY.pause();
        }
    }

    private void zzeR()
    {
label0:
        {
            AudioManager audiomanager = zzeX();
            if (audiomanager != null && !zzAh)
            {
                if (audiomanager.requestAudioFocus(this, 3, 2) != 1)
                {
                    break label0;
                }
                zzeU();
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("AdVideoView audio focus request failed");
    }

    private void zzeS()
    {
label0:
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView abandon audio focus");
            AudioManager audiomanager = zzeX();
            if (audiomanager != null && zzAh)
            {
                if (audiomanager.abandonAudioFocus(this) != 1)
                {
                    break label0;
                }
                zzAh = false;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("AdVideoView abandon audio focus failed");
    }

    private boolean zzeT()
    {
        return zzzY != null && zzzV != -1 && zzzV != 0 && zzzV != 1;
    }

    private void zzeU()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView audio focus gained");
        zzAh = true;
        zzeW();
    }

    private void zzeV()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView audio focus lost");
        zzAh = false;
        zzeW();
    }

    private void zzeW()
    {
        if (!zzAg && zzAh)
        {
            zzb(zzAf);
            return;
        } else
        {
            zzb(0.0F);
            return;
        }
    }

    private AudioManager zzeX()
    {
        return (AudioManager)getContext().getSystemService("audio");
    }

    private void zzv(boolean flag)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView release");
        if (zzzY != null)
        {
            zzzY.reset();
            zzzY.release();
            zzzY = null;
            zzzV = 0;
            if (flag)
            {
                zzzW = 0;
            }
            zzeS();
        }
    }

    public int getCurrentPosition()
    {
        if (zzeT())
        {
            return zzzY.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public void onAudioFocusChange(int i)
    {
        if (i > 0)
        {
            zzeU();
        } else
        if (i < 0)
        {
            zzeV();
            return;
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        zzAe = i;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView completion");
        zzzV = 5;
        zzzW = 5;
        zzhl.zzGk.post(new Runnable() {

            final zzi zzAl;

            public void run()
            {
                if (zzi.zza(zzAl) != null)
                {
                    zzi.zza(zzAl).zzeF();
                }
            }

            
            {
                zzAl = zzi.this;
                super();
            }
        });
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = (String)zzzU.get(Integer.valueOf(i));
        String s = (String)zzzU.get(Integer.valueOf(j));
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdVideoView MediaPlayer error: ").append(mediaplayer).append(":").append(s).toString());
        zzzV = -1;
        zzzW = -1;
        zzhl.zzGk.post(new Runnable(mediaplayer, s) {

            final zzi zzAl;
            final String zzAm;
            final String zzAn;

            public void run()
            {
                if (zzi.zza(zzAl) != null)
                {
                    zzi.zza(zzAl).zzg(zzAm, zzAn);
                }
            }

            
            {
                zzAl = zzi.this;
                zzAm = s;
                zzAn = s1;
                super();
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = (String)zzzU.get(Integer.valueOf(i));
        String s = (String)zzzU.get(Integer.valueOf(j));
        com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("AdVideoView MediaPlayer info: ").append(mediaplayer).append(":").append(s).toString());
        return true;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int k1;
        i1 = getDefaultSize(zzAa, i);
        k1 = getDefaultSize(zzAb, j);
        l = k1;
        k = i1;
        if (zzAa <= 0) goto _L2; else goto _L1
_L1:
        l = k1;
        k = i1;
        if (zzAb <= 0) goto _L2; else goto _L3
_L3:
        int l1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        l1 = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (k1 != 0x40000000 || l1 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (zzAa * j < zzAb * i)
        {
            k = (zzAa * j) / zzAb;
            l = j;
        } else
        if (zzAa * j > zzAb * i)
        {
            l = (zzAb * i) / zzAa;
            k = i;
        } else
        {
            l = j;
            k = i;
        }
_L2:
        setMeasuredDimension(k, l);
        return;
_L5:
        if (k1 == 0x40000000)
        {
            l = (zzAb * i) / zzAa;
            int j1;
            if (l1 == 0x80000000 && l > j)
            {
                l = j;
                k = i;
            } else
            {
                k = i;
            }
        } else
        if (l1 == 0x40000000)
        {
            j1 = (zzAa * j) / zzAb;
            l = j;
            k = j1;
            if (k1 == 0x80000000)
            {
                l = j;
                k = j1;
                if (j1 > i)
                {
                    l = j;
                    k = i;
                }
            }
        } else
        {
            j1 = zzAa;
            k = zzAb;
            if (l1 == 0x80000000 && k > j)
            {
                j1 = (zzAa * j) / zzAb;
            } else
            {
                j = k;
            }
            l = j;
            k = j1;
            if (k1 == 0x80000000)
            {
                l = j;
                k = j1;
                if (j1 > i)
                {
                    l = (zzAb * i) / zzAa;
                    k = i;
                }
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView prepared");
        zzzV = 2;
        zzhl.zzGk.post(new Runnable(mediaplayer) {

            final MediaPlayer zzAk;
            final zzi zzAl;

            public void run()
            {
                if (zzi.zza(zzAl) != null)
                {
                    zzi.zza(zzAl).onPrepared(zzAk);
                }
            }

            
            {
                zzAl = zzi.this;
                zzAk = mediaplayer;
                super();
            }
        });
        zzAa = mediaplayer.getVideoWidth();
        zzAb = mediaplayer.getVideoHeight();
        if (zzAi != 0)
        {
            seekTo(zzAi);
        }
        zzeQ();
        if (zzAa == 0 || zzAb == 0) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.zzb.zzaA((new StringBuilder()).append("AdVideoView stream dimensions: ").append(zzAa).append(" x ").append(zzAb).toString());
        getHolder().setFixedSize(zzAa, zzAb);
        if (zzAc == zzAa && zzAd == zzAb && zzzW == 3)
        {
            play();
        }
_L4:
        zzeR();
        zzeW();
        return;
_L2:
        if (zzzW == 3)
        {
            play();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("AdVideoView size changed: ").append(i).append(" x ").append(j).toString());
        zzAa = mediaplayer.getVideoWidth();
        zzAb = mediaplayer.getVideoHeight();
        if (zzAa != 0 && zzAb != 0)
        {
            getHolder().setFixedSize(zzAa, zzAb);
            requestLayout();
        }
    }

    public void pause()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView pause");
        if (zzeT() && zzzY.isPlaying())
        {
            zzzY.pause();
            zzzV = 4;
            zzhl.zzGk.post(new Runnable() {

                final zzi zzAl;

                public void run()
                {
                    if (zzi.zza(zzAl) != null)
                    {
                        zzi.zza(zzAl).onPaused();
                    }
                }

            
            {
                zzAl = zzi.this;
                super();
            }
            });
        }
        zzzW = 4;
    }

    public void play()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView play");
        if (zzeT())
        {
            zzzY.start();
            zzzV = 3;
            zzhl.zzGk.post(new Runnable() {

                final zzi zzAl;

                public void run()
                {
                    if (zzi.zza(zzAl) != null)
                    {
                        zzi.zza(zzAl).zzeE();
                    }
                }

            
            {
                zzAl = zzi.this;
                super();
            }
            });
        }
        zzzW = 3;
    }

    public void seekTo(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("AdVideoView seek ").append(i).toString());
        if (zzeT())
        {
            zzzY.seekTo(i);
            zzAi = 0;
            return;
        } else
        {
            zzAi = i;
            return;
        }
    }

    public void setVideoPath(String s)
    {
        setVideoURI(Uri.parse(s));
    }

    public void setVideoURI(Uri uri)
    {
        zzzZ = uri;
        zzAi = 0;
        zzeP();
        requestLayout();
        invalidate();
    }

    public void stop()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView stop");
        if (zzzY != null)
        {
            zzzY.stop();
            zzzY.release();
            zzzY = null;
            zzzV = 0;
            zzzW = 0;
            zzeS();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        boolean flag = true;
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView surface changed");
        zzAc = j;
        zzAd = k;
        if (zzzW == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (zzAa == j && zzAb == k)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (zzzY != null && i != 0 && j != 0)
        {
            if (zzAi != 0)
            {
                seekTo(zzAi);
            }
            play();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView surface created");
        zzzX = surfaceholder;
        zzeP();
        zzhl.zzGk.post(new Runnable() {

            final zzi zzAl;

            public void run()
            {
                if (zzi.zza(zzAl) != null)
                {
                    zzi.zza(zzAl).zzeD();
                }
            }

            
            {
                zzAl = zzi.this;
                super();
            }
        });
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("AdVideoView surface destroyed");
        if (zzzY != null && zzAi == 0)
        {
            zzAi = zzzY.getCurrentPosition();
        }
        zzzX = null;
        zzhl.zzGk.post(new Runnable() {

            final zzi zzAl;

            public void run()
            {
                if (zzi.zza(zzAl) != null)
                {
                    zzi.zza(zzAl).onPaused();
                    zzi.zza(zzAl).zzeG();
                }
            }

            
            {
                zzAl = zzi.this;
                super();
            }
        });
        zzv(true);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).toString();
    }

    public void zza(float f)
    {
        zzAf = f;
        zzeW();
    }

    public void zza(zzg zzg)
    {
        zzAj = zzg;
    }

    public void zzeI()
    {
        zzAg = true;
        zzeW();
    }

    public void zzeJ()
    {
        zzAg = false;
        zzeW();
    }

    static 
    {
        zzzU = new HashMap();
        zzzU.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
        zzzU.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
        zzzU.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
        zzzU.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
        zzzU.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        zzzU.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        zzzU.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        zzzU.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzzU.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        zzzU.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        zzzU.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        zzzU.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        zzzU.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        zzzU.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        zzzU.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        zzzU.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }
}
