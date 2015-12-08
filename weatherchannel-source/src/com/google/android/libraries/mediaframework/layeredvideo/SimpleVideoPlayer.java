// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerVolumeAdjuster;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;
import com.google.android.libraries.mediaframework.exoplayerextensions.ObservablePlayerControl;
import com.google.android.libraries.mediaframework.exoplayerextensions.PlayerControlCallback;
import com.google.android.libraries.mediaframework.exoplayerextensions.Video;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer, SubtitleLayer, VideoSurfaceLayer, PlayerBusyLayer, 
//            LayerManager

public class SimpleVideoPlayer
{

    private static final String TAG = "SimpleVideoPlayer";
    private static final AtomicInteger id = new AtomicInteger(0);
    private final Activity activity;
    private final ExoplayerWrapper exoplayerWrapper;
    private final LayerManager layerManager;
    private final PlaybackControlLayer playbackControlLayer;
    private final PlayerBusyLayer playerBusyLayer = new PlayerBusyLayer();
    private final String playerName;
    private final SubtitleLayer subtitleLayer = new SubtitleLayer();
    private boolean systemOrUserPaused;
    private final VideoSurfaceLayer videoSurfaceLayer;

    public SimpleVideoPlayer(Activity activity1, FrameLayout framelayout, Video video, String s, boolean flag, long l, 
            PlaybackControlLayer.FullscreenCallback fullscreencallback, PlaybackControlLayer.ShouldBePlayingCallback shouldbeplayingcallback, String s1, boolean flag1)
    {
        activity = activity1;
        playerName = (new StringBuilder()).append(s1).append('-').append(id.incrementAndGet()).toString();
        playbackControlLayer = new PlaybackControlLayer(s, fullscreencallback, flag, shouldbeplayingcallback, playerName, flag1);
        videoSurfaceLayer = new VideoSurfaceLayer(flag);
        s = new ArrayList();
        s.add(videoSurfaceLayer);
        s.add(playbackControlLayer);
        s.add(playerBusyLayer);
        s.add(subtitleLayer);
        layerManager = new LayerManager(activity1, framelayout, video, s, playerName);
        layerManager.getControl().addCallback(new PlayerControlCallback() {

            final SimpleVideoPlayer this$0;

            public void onPause()
            {
                systemOrUserPaused = true;
            }

            public void onPlay()
            {
                systemOrUserPaused = false;
            }

            
            {
                this$0 = SimpleVideoPlayer.this;
                super();
            }
        });
        exoplayerWrapper = layerManager.getExoplayerWrapper();
        if (l > 0L)
        {
            exoplayerWrapper.seekTo(l);
        }
    }

    private void setSystemOrUserPaused(boolean flag)
    {
        systemOrUserPaused = flag;
    }

    public void addActionButton(Drawable drawable, String s, android.view.View.OnClickListener onclicklistener)
    {
        playbackControlLayer.addActionButton(activity, drawable, s, onclicklistener);
    }

    public void addPlaybackListener(com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener listener)
    {
        layerManager.getExoplayerWrapper().addListener(listener);
    }

    public void addPlayerControlCallback(PlayerControlCallback playercontrolcallback)
    {
        layerManager.getControl().addCallback(playercontrolcallback);
    }

    public void disableControlUI()
    {
        playbackControlLayer.disableControlUi();
    }

    public void disableSeeking()
    {
        playbackControlLayer.disableSeeking();
    }

    public void enableSeeking()
    {
        playbackControlLayer.enableSeeking();
    }

    public int getCurrentPosition()
    {
        return layerManager.getControl().getCurrentPosition();
    }

    public int getDuration()
    {
        return layerManager.getControl().getDuration();
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public float getVolume()
    {
        if (exoplayerWrapper != null && exoplayerWrapper.getVolumeAdjuster() != null)
        {
            return exoplayerWrapper.getVolumeAdjuster().getVolume(activity);
        } else
        {
            return -1F;
        }
    }

    public void hide()
    {
        layerManager.setHidden(true);
        videoSurfaceLayer.hide();
        playbackControlLayer.hide();
        playerBusyLayer.hide();
        subtitleLayer.hide();
    }

    public void hideTopChrome()
    {
        playbackControlLayer.hideTopChrome();
    }

    public boolean isFullscreen()
    {
        return playbackControlLayer.isLandscape();
    }

    public boolean isShown()
    {
        return !layerManager.isHidden();
    }

    public boolean isSystemOrUserPaused()
    {
        return systemOrUserPaused;
    }

    public void moveSurfaceToBackground()
    {
        videoSurfaceLayer.moveSurfaceToBackground();
    }

    public void moveSurfaceToForeground()
    {
        videoSurfaceLayer.moveSurfaceToForeground();
    }

    public void pause()
    {
        setSystemOrUserPaused(true);
        videoSurfaceLayer.setAutoplay(false);
        layerManager.getControl().pause();
    }

    public void play()
    {
        setSystemOrUserPaused(false);
        videoSurfaceLayer.setAutoplay(true);
        layerManager.getControl().start();
    }

    public void release()
    {
        videoSurfaceLayer.release();
        layerManager.release();
    }

    public void removePlaybackListener(com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener listener)
    {
        layerManager.getExoplayerWrapper().removeListener(listener);
    }

    public void removePlayerControlCallback(PlayerControlCallback playercontrolcallback)
    {
        layerManager.getControl().removeCallback(playercontrolcallback);
    }

    public void seekBack(int i)
    {
        int j = getCurrentPosition() - i;
        ObservablePlayerControl observableplayercontrol = layerManager.getControl();
        i = j;
        if (j < 0)
        {
            i = -j;
        }
        observableplayercontrol.seekTo(i);
    }

    public void seekToEnd()
    {
label0:
        {
            if (exoplayerWrapper != null)
            {
                if (getDuration() >= 0)
                {
                    break label0;
                }
                exoplayerWrapper.seekTo(0L);
            }
            return;
        }
        exoplayerWrapper.seekTo(getDuration());
    }

    public void setChromeColor(int i)
    {
        playbackControlLayer.setChromeColor(i);
    }

    public void setFullscreen(boolean flag)
    {
        LogUtil.d("SimpleVideoPlayer", LoggingMetaTags.TWC_VIDEOS, "setFullscreen: player=%s, shouldBeFullscreen=%s", new Object[] {
            layerManager.getPlayerName(), Boolean.valueOf(flag)
        });
        playbackControlLayer.setFullscreen(flag);
        videoSurfaceLayer.setFullscreen(flag);
    }

    public void setFullscreenCallback(PlaybackControlLayer.FullscreenCallback fullscreencallback)
    {
        playbackControlLayer.setFullscreenCallback(fullscreencallback);
    }

    public void setLogoImage(Drawable drawable)
    {
        playbackControlLayer.setLogoImageView(drawable);
    }

    public void setPlaybackControlColor(int i)
    {
        playbackControlLayer.setControlColor(i);
    }

    public void setSeekbarColor(int i)
    {
        playbackControlLayer.setSeekbarColor(i);
    }

    public void setTextColor(int i)
    {
        playbackControlLayer.setTextColor(i);
    }

    public void setVideoTitle(String s)
    {
        playbackControlLayer.setVideoTitle(s);
    }

    public void setVolume(float f)
    {
        if (exoplayerWrapper != null && exoplayerWrapper.getVolumeAdjuster() != null)
        {
            exoplayerWrapper.getVolumeAdjuster().setVolume(f);
        }
    }

    public boolean shouldBePlaying()
    {
        return playbackControlLayer.shouldBePlaying();
    }

    public void show()
    {
        layerManager.setHidden(false);
        videoSurfaceLayer.show();
        playbackControlLayer.show();
        playerBusyLayer.show();
        subtitleLayer.show();
    }

    public void showTopChrome()
    {
        playbackControlLayer.showTopChrome();
    }

    public String toString()
    {
        return (new StringBuilder()).append("SimpleVideoPlayer[").append(playerName).append("] = (").append(getCurrentPosition()).append(':').append(getDuration()).append(')').toString();
    }



/*
    static boolean access$002(SimpleVideoPlayer simplevideoplayer, boolean flag)
    {
        simplevideoplayer.systemOrUserPaused = flag;
        return flag;
    }

*/
}
