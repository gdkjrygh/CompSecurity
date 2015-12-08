// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.google.common.base.Preconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.audio:
//            TwcMediaPlayer, AudioFocusRequester

public class AudioFocusAwarePlayer extends BroadcastReceiver
    implements android.media.AudioManager.OnAudioFocusChangeListener, TwcMediaPlayer, AudioFocusRequester
{

    private static final float FRACTION_OF_CURRENT_AUDIO_LEVEL = 0.4F;
    private static final String TAG = "AudioFocusAwarePlayer";
    private final AudioManager audioManager;
    private final Context context;
    private boolean haveAudioFocus;
    private final IntentFilter noisyIntentFilter = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    private boolean pausedPermanently;
    private int previousFocusChange;
    private boolean registeredForNoisyBroadcast;
    private final TwcMediaPlayer source;
    private final int stream;
    private float volumeWas;
    private boolean wasPlayingWhenTransientLoss;

    public AudioFocusAwarePlayer(Context context1, int i, TwcMediaPlayer twcmediaplayer)
    {
        audioManager = (AudioManager)((Context)Preconditions.checkNotNull(context1)).getSystemService("audio");
        context = context1;
        stream = i;
        source = (TwcMediaPlayer)Preconditions.checkNotNull(twcmediaplayer);
        registeredForNoisyBroadcast = false;
        pausedPermanently = false;
    }

    private void doPause()
    {
        pausedPermanently = false;
        unregister();
        source.pause();
    }

    private void doPausePermanently()
    {
        pausedPermanently = true;
        unregister();
        source.pausePermanently();
    }

    private void doPlay(boolean flag)
    {
        pausedPermanently = false;
        context.registerReceiver(this, noisyIntentFilter);
        registeredForNoisyBroadcast = true;
        source.play(flag);
    }

    private void lowerVolume()
    {
        volumeWas = getVolume();
        setVolumeToFractionOfCurrent(0.4F);
    }

    private void playWithFocus(boolean flag)
    {
        if (haveAudioFocus)
        {
            doPlay(flag);
            return;
        } else
        {
            requestFocusThenPlay(flag);
            return;
        }
    }

    private void raiseVolume()
    {
        setVolumeTo(volumeWas);
    }

    private void requestFocusThenPlay(boolean flag)
    {
        if (requestFocus())
        {
            doPlay(flag);
        }
    }

    private void setVolumeTo(float f)
    {
        LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "onAudioFocusChange set video volume to %s", new Object[] {
            Float.valueOf(f)
        });
        source.setVolume(f);
    }

    private void setVolumeToFractionOfCurrent(float f)
    {
        float f1 = getVolume() * f;
        f = f1;
        if (f1 > 1.0F)
        {
            f = 1.0F;
        }
        setVolumeTo(f);
    }

    private void unregister()
    {
        if (registeredForNoisyBroadcast)
        {
            context.unregisterReceiver(this);
            registeredForNoisyBroadcast = false;
        }
    }

    public float getVolume()
    {
        return source.getVolume();
    }

    public boolean isPausedPermanently()
    {
        return pausedPermanently;
    }

    public boolean isPlaying()
    {
        return source.isPlaying();
    }

    public void onAudioFocusChange(int i)
    {
        LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "onAudioFocusChangeHandling focusChange=%s", new Object[] {
            Integer.valueOf(i)
        });
        i;
        JVM INSTR tableswitch -3 1: default 56
    //                   -3 256
    //                   -2 197
    //                   -1 166
    //                   0 56
    //                   1 62;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        previousFocusChange = i;
        return;
_L5:
        haveAudioFocus = true;
        LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "onAudioFocusChangeHandling AUDIOFOCUS_GAIN", new Object[0]);
        if (previousFocusChange == -3)
        {
            LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "--- onAudioFocusChangeHandling AUDIOFOCUS_GAIN was ducking raise volume", new Object[0]);
            raiseVolume();
        } else
        if (previousFocusChange == -2)
        {
            if (wasPlayingWhenTransientLoss)
            {
                LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "--- onAudioFocusChangeHandling AUDIOFOCUS_GAIN restart playing", new Object[0]);
                playWithFocus(false);
            } else
            {
                LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "--- onAudioFocusChangeHandling AUDIOFOCUS_GAIN wasn't playing before", new Object[0]);
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        haveAudioFocus = false;
        wasPlayingWhenTransientLoss = false;
        LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "onAudioFocusChangeHandling AUDIOFOCUS_LOSS stop playback", new Object[0]);
        doPausePermanently();
        continue; /* Loop/switch isn't completed */
_L3:
        haveAudioFocus = false;
        wasPlayingWhenTransientLoss = source.isPlaying();
        LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append("onAudioFocusChangeHandling AUDIOFOCUS_LOSS_TRANSIENT pause playback isPlaying ").append(wasPlayingWhenTransientLoss).toString(), new Object[0]);
        doPause();
        continue; /* Loop/switch isn't completed */
_L2:
        LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "onAudioFocusChangeHandling AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK duck audio", new Object[0]);
        haveAudioFocus = false;
        wasPlayingWhenTransientLoss = false;
        lowerVolume();
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onReceive(Context context1, Intent intent)
    {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction()))
        {
            doPause();
        }
    }

    public void pause()
    {
        source.pause();
    }

    public void pausePermanently()
    {
        source.pausePermanently();
    }

    public void play(boolean flag)
    {
        playWithFocus(flag);
    }

    public void release()
    {
        unregister();
        audioManager.abandonAudioFocus(this);
    }

    public boolean requestFocus()
    {
        if (!haveAudioFocus)
        {
            int i = audioManager.requestAudioFocus(this, stream, 1);
            previousFocusChange = 0x7fffffff;
            if (i == 1)
            {
                LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append("onAudioFocusChangeHandling: focus granted current volume: ").append(getVolume()).toString(), new Object[0]);
                haveAudioFocus = true;
            } else
            {
                haveAudioFocus = false;
                LogUtil.d("AudioFocusAwarePlayer", LoggingMetaTags.TWC_VIDEOS, "onAudioFocusChangeHandling: focus not granted, no autoplay.  result=%s", new Object[] {
                    Integer.valueOf(i)
                });
            }
        }
        return haveAudioFocus;
    }

    public void setVolume(float f)
    {
        source.setVolume(f);
    }
}
