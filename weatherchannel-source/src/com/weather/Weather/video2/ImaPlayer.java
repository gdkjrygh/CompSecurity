// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video2;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.android.libraries.mediaframework.exoplayerextensions.PlayerControlCallback;
import com.google.android.libraries.mediaframework.exoplayerextensions.Video;
import com.google.android.libraries.mediaframework.layeredvideo.SimpleVideoPlayer;
import com.google.android.libraries.mediaframework.layeredvideo.Util;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.audio.AudioFocusRequester;
import com.weather.commons.audio.TwcMediaPlayer;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.UIUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.video2:
//            AccumulatedAdTimer, SimpleWatchDog, ImaPlayerState, MediaState, 
//            ImaPlayerStateParameters, ImaPlayerAudioFocuser, MediaEvent

public class ImaPlayer
    implements TwcMediaPlayer
{

    private static final String TAG = "ImaPlayer";
    private static final long WATCHDOG_TIME_LIMIT_FOR_AD_REQUESTING = 4000L;
    private final Activity activity;
    private AdDisplayContainer adDisplayContainer;
    private final AdListener adListener = new AdListener(null);
    private final com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener adPlaybackListener = new _cls1();
    private SimpleVideoPlayer adPlayer;
    private final List adPlayerCallbacks = new ArrayList();
    private FrameLayout adPlayerContainer;
    private final PlayerControlCallback adPlayerControlCallback = new DefaultPlayerControlCallback();
    private boolean adRequested;
    private String adTagUrl;
    private final AccumulatedAdTimer adTimer = new AccumulatedAdTimer();
    private final FrameLayout adUiContainer;
    private final AdsLoader adsLoader;
    private AdsManager adsManager;
    private AudioFocusRequester audioFocusRequester;
    private final LinearLayout companionAdView;
    private final FrameLayout container;
    private final com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener contentPlaybackListener = new _cls2();
    private final SimpleVideoPlayer contentPlayer;
    private com.google.android.libraries.mediaframework.layeredvideo.PlaybackControlLayer.FullscreenCallback fullscreenCallback;
    private boolean hasIMAKilled;
    private ImaPlayerState imaPlayerState;
    private volatile boolean isPausedBySystem;
    private final MediaState mediaState = new MediaState(this);
    private final SimpleWatchDog myWatchDog = new SimpleWatchDog(new Handler());
    private final ImaPlayerStateParameters stateParameters;
    private final String vastTagUrl;
    private final VideoAdPlayer videoAdPlayer = new _cls3();
    private final String videoId;

    public ImaPlayer(Activity activity1, FrameLayout framelayout, LinearLayout linearlayout, Video video, String s, String s1, boolean flag, 
            com.google.android.libraries.mediaframework.layeredvideo.PlaybackControlLayer.FullscreenCallback fullscreencallback, com.google.android.libraries.mediaframework.layeredvideo.PlaybackControlLayer.ShouldBePlayingCallback shouldbeplayingcallback, boolean flag1, ImaPlayerStateParameters imaplayerstateparameters)
    {
        imaPlayerState = ImaPlayerState.PLAY_CONTENT;
    /* block-local class not found */
    class DefaultPlayerControlCallback {}

        activity = activity1;
        container = framelayout;
        vastTagUrl = s1;
        Preconditions.checkNotNull(imaplayerstateparameters);
        stateParameters = imaplayerstateparameters;
        s1 = ImaSdkFactory.getInstance().createImaSdkSettings();
        s1.setLanguage(LocaleUtil.getLocale().getLanguage());
        adsLoader = ImaSdkFactory.getInstance().createAdsLoader(activity1, s1);
    /* block-local class not found */
    class AdListener {}

        adsLoader.addAdErrorListener(adListener);
        adsLoader.addAdsLoadedListener(adListener);
        boolean flag2 = flag1;
        if (isAdSupport())
        {
            flag2 = false;
        }
        stateParameters.pushPlayPauseState(flag1);
        contentPlayer = new SimpleVideoPlayer(activity1, framelayout, video, s, flag2, stateParameters.retryContentPosition, null, shouldbeplayingcallback, "content", flag);
        contentPlayer.addPlaybackListener(contentPlaybackListener);
        contentPlayer.addPlayerControlCallback(new ImaPlayerAudioFocuser(this));
        contentPlayer.addPlayerControlCallback(new DefaultPlayerControlCallback());
        contentPlayer.hideTopChrome();
        contentPlayer.moveSurfaceToBackground();
        hideContentPlayer();
        videoId = video.getContentId();
        adUiContainer = new FrameLayout(activity1);
        framelayout.addView(adUiContainer);
        adUiContainer.setLayoutParams(Util.getLayoutParamsBasedOnParent(adUiContainer, -1, -1));
        companionAdView = linearlayout;
        setFullscreenCallback(fullscreencallback);
    }

    private AdsRequest buildAdsRequest(String s)
    {
        adDisplayContainer = ImaSdkFactory.getInstance().createAdDisplayContainer();
        adDisplayContainer.setPlayer(videoAdPlayer);
        adDisplayContainer.setAdContainer(adUiContainer);
        Object obj = ImaSdkFactory.getInstance().createCompanionAdSlot();
        ((CompanionAdSlot) (obj)).setContainer(companionAdView);
        ((CompanionAdSlot) (obj)).setSize(320, 50);
        adDisplayContainer.setCompanionSlots(ImmutableList.of(obj));
        obj = ImaSdkFactory.getInstance().createAdsRequest();
        ((AdsRequest) (obj)).setAdTagUrl(s);
        ((AdsRequest) (obj)).setAdDisplayContainer(adDisplayContainer);
        ((AdsRequest) (obj)).setContentProgressProvider(new _cls6());
        return ((AdsRequest) (obj));
    }

    private void createAdPlayer()
    {
        debug("createAdPlayer()", new Object[0]);
        debug("clean previous ad player call destroyAdPlayer()", new Object[0]);
        destroyAdPlayer();
        adPlayerContainer = new FrameLayout(activity);
        container.addView(adPlayerContainer);
        adPlayerContainer.setLayoutParams(Util.getLayoutParamsBasedOnParent(adPlayerContainer, -1, -1));
        container.removeView(adUiContainer);
        container.addView(adUiContainer);
        Video video = new Video(adTagUrl, com.google.android.libraries.mediaframework.exoplayerextensions.Video.VideoType.OTHER);
        adPlayer = new SimpleVideoPlayer(activity, adPlayerContainer, video, "", false, 0L, fullscreenCallback, null, "ads", false);
        adPlayer.addPlaybackListener(adPlaybackListener);
        adPlayer.addPlayerControlCallback(new ImaPlayerAudioFocuser(this));
        adPlayer.addPlayerControlCallback(adPlayerControlCallback);
        adPlayer.moveSurfaceToForeground();
        adPlayer.disableControlUI();
        adPlayer.setFullscreen(contentPlayer.isFullscreen());
    }

    private transient void debug(String s, Object aobj[])
    {
        LogUtil.d("ImaPlayer", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append(toString()).append(" [").append(Thread.currentThread().getName()).append("] ").append(s).toString(), aobj);
    }

    private void destroyAdPlayer()
    {
        if (adPlayerContainer != null)
        {
            container.removeView(adPlayerContainer);
        }
        if (adUiContainer != null)
        {
            container.removeView(adUiContainer);
        }
        if (adPlayer != null)
        {
            contentPlayer.setFullscreen(adPlayer.isFullscreen());
            adPlayer.removePlaybackListener(adPlaybackListener);
            adPlayer.removePlayerControlCallback(adPlayerControlCallback);
            adPlayer.pause();
            adPlayer.release();
            adPlayer = null;
        }
        adPlayerContainer = null;
        setFullscreenCallback(fullscreenCallback);
    }

    private void destroyAdsManagerListener()
    {
        debug("destroy adsManager", new Object[0]);
        if (adsManager != null)
        {
            adsManager.removeAdErrorListener(adListener);
            adsManager.removeAdEventListener(adListener);
            adsManager.destroy();
            adsManager = null;
        }
    }

    private void hideCompanionAd()
    {
        companionAdView.setVisibility(8);
    }

    private void hideContentPlayer()
    {
        contentPlayer.hide();
    }

    private void pauseAd()
    {
        debug("pauseAd()", new Object[0]);
        if (adPlayer != null)
        {
            adPlayer.pause();
            adTimer.stopAndGetAccumulateTime();
        }
    }

    private void pauseContentPlayer()
    {
        debug("pauseContentPlayer() contentPlayer %s", new Object[] {
            contentPlayer
        });
        stateParameters.pushPlayPauseState(contentPlayer.shouldBePlaying());
        contentPlayer.pause();
    }

    private void playAd()
    {
        debug("playAd()", new Object[0]);
        if (adPlayer != null)
        {
            adPlayer.play();
            adTimer.start();
        }
    }

    private void playContentPlayer()
    {
        playContentPlayer(false);
    }

    private void playContentPlayer(boolean flag)
    {
        if (isPausedBySystem)
        {
            debug("playContentPlayer:skip content play", new Object[0]);
        } else
        {
            if (stateParameters.popPlayPauseState())
            {
                contentPlayer.play();
                return;
            }
            if (flag)
            {
                contentPlayer.seekBack(1);
                return;
            }
        }
    }

    private void releaseContentPlayer()
    {
        contentPlayer.release();
    }

    private void releaseIma()
    {
        hasIMAKilled = true;
        hideCompanionAd();
        releaseWatchDog();
        destroyAdsManagerListener();
        removeAdsLoaderListener();
        destroyAdPlayer();
    }

    private void releaseWatchDog()
    {
        myWatchDog.release();
    }

    private void removeAdsLoaderListener()
    {
        debug("remove adsLoader listeners", new Object[0]);
        if (adsLoader != null)
        {
            adsLoader.removeAdErrorListener(adListener);
            adsLoader.removeAdsLoadedListener(adListener);
        }
    }

    private void showContentPlayer()
    {
        contentPlayer.show();
    }

    private void startWatchDogForAdRequesting()
    {
        debug("watchdog: set ad reqeust timer ", new Object[0]);
        myWatchDog.addAndStartWatchDogItem(4000L, new _cls4());
    }

    private void stopAndDestroyAdPlayer()
    {
        debug("stopAndDestroyAdPlayer", new Object[0]);
        adTimer.stopAndGetAccumulateTime();
        destroyAdPlayer();
    }

    private void updateCompanionAdVisibility()
    {
        Collection collection;
        LinearLayout linearlayout;
        byte byte0;
        byte0 = 8;
        if (!isAdPlaying() || UIUtil.isInLandscape(activity))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        collection = adDisplayContainer.getCompanionSlots();
        linearlayout = companionAdView;
        break MISSING_BLOCK_LABEL_35;
        if (collection != null && !collection.isEmpty())
        {
            byte0 = 0;
        }
        linearlayout.setVisibility(byte0);
        return;
        hideCompanionAd();
        return;
    }

    public void addActionButton(Drawable drawable, String s, android.view.View.OnClickListener onclicklistener)
    {
        contentPlayer.addActionButton(drawable, s, onclicklistener);
    }

    public long getAdTotalDuration()
    {
        long l = adTimer.getAccumulatedTime();
        debug("getAdTotalDuration %s", new Object[] {
            Long.valueOf(l)
        });
        return l;
    }

    public AudioFocusRequester getAudioFocusRequester()
    {
        return audioFocusRequester;
    }

    public long getContentDuration()
    {
        if (contentPlayer != null)
        {
            return (long)contentPlayer.getDuration();
        } else
        {
            return -1L;
        }
    }

    public long getCurrentContentPosition()
    {
        return (long)contentPlayer.getCurrentPosition();
    }

    public String getVideoId()
    {
        return videoId;
    }

    public float getVolume()
    {
        float f = -1F;
        if (adPlayer != null)
        {
            f = adPlayer.getVolume();
        }
        if (contentPlayer != null)
        {
            f = contentPlayer.getVolume();
        }
        return f;
    }

    public boolean hasAllAdsEnded()
    {
        return !isAdSupport() || mediaState.isAllAdsEnded();
    }

    public boolean isAdPlaying()
    {
        return isAdSupport() && adPlayer != null && adPlayer.getDuration() > 0;
    }

    boolean isAdSupport()
    {
        return !TextUtils.isEmpty(vastTagUrl);
    }

    public boolean isPlaying()
    {
        boolean flag = false;
        if (contentPlayer != null)
        {
            flag = contentPlayer.isSystemOrUserPaused();
        }
        if (adPlayer != null)
        {
            flag = adPlayer.isSystemOrUserPaused();
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        debug((new StringBuilder()).append("isPlay() isPlaying ").append(flag).toString(), new Object[0]);
        return flag;
    }

    public void pause()
    {
        debug("pause()", new Object[0]);
        isPausedBySystem = true;
        myWatchDog.onPause();
        if (isAdPlaying())
        {
            if (adsManager != null)
            {
                debug("call adsManager.pause()", new Object[0]);
                adsManager.pause();
            }
            return;
        } else
        {
            pauseContentPlayer();
            return;
        }
    }

    public void pausePermanently()
    {
        boolean flag = isAdPlaying();
        debug("pausePermanently()", new Object[0]);
        pause();
        if (flag)
        {
            debug("pausePermanently skip ads to the end", new Object[0]);
            adPlayer.seekToEnd();
        }
    }

    public void play(boolean flag)
    {
        debug("play()", new Object[0]);
        isPausedBySystem = false;
        if (flag)
        {
            myWatchDog.onResume();
        }
        if (isAdSupport()) goto _L2; else goto _L1
_L1:
        debug("call contentPlayer.playIfItShouldPlay() as no ad support or all ads shown", new Object[0]);
        showContentPlayer();
        playContentPlayer(flag);
_L4:
        return;
_L2:
        if (!adRequested)
        {
            adRequested = true;
            debug("requesting ads. vastTagUrl=%s", new Object[] {
                vastTagUrl
            });
            adsLoader.requestAds(buildAdsRequest(vastTagUrl));
            imaPlayerState = imaPlayerState.processEvent(MediaEvent.REQUEST_AD);
            if (imaPlayerState == ImaPlayerState.PREPARING_AD)
            {
                startWatchDogForAdRequesting();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!isAdPlaying())
        {
            break; /* Loop/switch isn't completed */
        }
        debug("call adsManager.resume()", new Object[0]);
        adsManager.resume();
        if (flag)
        {
            Iterator iterator = adPlayerCallbacks.iterator();
            while (iterator.hasNext()) 
            {
                ((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback)iterator.next()).onResume();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        showContentPlayer();
        playContentPlayer(flag);
        return;
    }

    public void release()
    {
        debug("release()", new Object[0]);
        releaseIma();
        releaseContentPlayer();
    }

    public void setAudioFocusRequester(AudioFocusRequester audiofocusrequester)
    {
        audioFocusRequester = audiofocusrequester;
    }

    public void setChromeColor(int i)
    {
        contentPlayer.setChromeColor(i);
    }

    public void setFullscreen(boolean flag)
    {
        if (adPlayer != null)
        {
            LogUtil.d("ImaPlayer", LoggingMetaTags.TWC_VIDEOS, "setFullscreen: setting ad player '%s' to fullscreen=%s", new Object[] {
                adPlayer.getPlayerName(), Boolean.valueOf(flag)
            });
            adPlayer.setFullscreen(flag);
            if (flag)
            {
                hideCompanionAd();
            } else
            {
                updateCompanionAdVisibility();
            }
        }
        LogUtil.d("ImaPlayer", LoggingMetaTags.TWC_VIDEOS, "setFullscreen: setting content player '%s' to fullscreen=%s", new Object[] {
            contentPlayer.getPlayerName(), Boolean.valueOf(flag)
        });
        contentPlayer.setFullscreen(flag);
    }

    public final void setFullscreenCallback(com.google.android.libraries.mediaframework.layeredvideo.PlaybackControlLayer.FullscreenCallback fullscreencallback)
    {
        if (fullscreencallback != null)
        {
            fullscreenCallback = new _cls5(fullscreencallback);
        }
        if (adPlayer != null)
        {
            adPlayer.setFullscreenCallback(fullscreencallback);
            return;
        } else
        {
            contentPlayer.setFullscreenCallback(fullscreencallback);
            return;
        }
    }

    public void setHighLevelMediaControlCallback(MediaState.HighLevelMediaStateListener highlevelmediastatelistener)
    {
        mediaState.setHighLevelMediaControlCallback(highlevelmediastatelistener);
    }

    public void setLogoImage(Drawable drawable)
    {
        contentPlayer.setLogoImage(drawable);
    }

    public void setPlaybackControlColor(int i)
    {
        contentPlayer.setPlaybackControlColor(i);
    }

    public void setVolume(float f)
    {
        debug("set to: %f currentVolume: %f", new Object[] {
            Float.valueOf(f), Float.valueOf(getVolume())
        });
        if (contentPlayer != null)
        {
            contentPlayer.setVolume(f);
        }
        if (adPlayer != null)
        {
            adPlayer.setVolume(f);
        }
    }

    public boolean shouldContentBePlaying()
    {
        if (isAdPlaying())
        {
            return stateParameters.peekPlayPauseState();
        }
        return contentPlayer != null && contentPlayer.shouldBePlaying();
    }








/*
    static AdsManager access$1402(ImaPlayer imaplayer, AdsManager adsmanager)
    {
        imaplayer.adsManager = adsmanager;
        return adsmanager;
    }

*/












/*
    static String access$2402(ImaPlayer imaplayer, String s)
    {
        imaplayer.adTagUrl = s;
        return s;
    }

*/





/*
    static ImaPlayerState access$302(ImaPlayer imaplayer, ImaPlayerState imaplayerstate)
    {
        imaplayer.imaPlayerState = imaplayerstate;
        return imaplayerstate;
    }

*/







    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}
