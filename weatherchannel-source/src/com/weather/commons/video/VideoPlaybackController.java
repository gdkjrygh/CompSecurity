// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsVideoSummaryRecorder;
import com.weather.commons.video.vast.ContentContainer;
import com.weather.commons.video.vast.Vast;
import com.weather.commons.video.vast.VastBeaconSender;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.commons.video:
//            VideoPlaybackSupport, VideoViewWithPositionCallbacks

public class VideoPlaybackController
{

    private static final int DURATION_TO_SHOW_LEARN_MORE_MS = 5000;
    private static final String TAG = "VideoPlaybackController";
    private int adLength;
    private Map beaconParameters;
    private final VideoViewWithPositionCallbacks.PositionListener hideLearnMoreListener = new VideoViewWithPositionCallbacks.PositionListener() {

        final VideoPlaybackController this$0;

        public void onPositionChange()
        {
            LogUtil.d("VideoPlaybackController", LoggingMetaTags.TWC_UI, "in hideLearnMoreListener.run", new Object[0]);
            learnMore.setVisibility(4);
        }

            
            {
                this$0 = VideoPlaybackController.this;
                super();
            }
    };
    private boolean isAdCompleteBeaconFired;
    private boolean isAdStartBeaconFired;
    private boolean isVideoStartBeaconFired;
    private final ImageView learnMore;
    private MediaController mc;
    private final VideoViewWithPositionCallbacks.PositionListener midPointListener;
    private final VideoPlaybackSupport playbackSupport;
    private final VideoViewWithPositionCallbacks.PositionListener setMediaControllerListener = new VideoViewWithPositionCallbacks.PositionListener() {

        final VideoPlaybackController this$0;

        public void onPositionChange()
        {
            LogUtil.d("VideoPlaybackController", LoggingMetaTags.TWC_UI, "in setMediaControllerListener.run", new Object[0]);
            if (videoHasPreRoll && !isAdCompleteBeaconFired)
            {
                Analytics.trackAction(AbstractTwcApplication.getRootContext().getResources().getString(com.weather.commons.R.string.beacon_video_ad_complete), null);
                isAdCompleteBeaconFired = true;
                if (adLength > 0)
                {
                    LocalyticsHandler.getInstance().getLocalyticsVideoSummaryRecorder().recordTotalAdLength(adLength);
                }
            }
            videoView.setOnClickListener(null);
            videoView.setOnTouchListener(null);
            mc = playbackSupport.createMediaController();
            if (mc != null)
            {
                if (!isVideoStartBeaconFired)
                {
                    Analytics.trackAction(AbstractTwcApplication.getRootContext().getResources().getString(com.weather.commons.R.string.beacon_video_start), beaconParameters);
                    isVideoStartBeaconFired = true;
                }
                videoView.setMediaController(mc);
                mc.setAnchorView(videoView);
            }
            learnMore.setVisibility(4);
        }

            
            {
                this$0 = VideoPlaybackController.this;
                super();
            }
    };
    private int stopPosition;
    private boolean videoHasPreRoll;
    private final TextView videoLoading;
    private final VideoViewWithPositionCallbacks videoView;

    public VideoPlaybackController(TextView textview, ImageView imageview, VideoViewWithPositionCallbacks videoviewwithpositioncallbacks, VideoPlaybackSupport videoplaybacksupport, VideoViewWithPositionCallbacks.PositionListener positionlistener)
    {
        beaconParameters = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
        playbackSupport = (VideoPlaybackSupport)Preconditions.checkNotNull(videoplaybacksupport);
        midPointListener = positionlistener;
        videoLoading = (TextView)Preconditions.checkNotNull(textview);
        learnMore = (ImageView)Preconditions.checkNotNull(imageview);
        videoView = (VideoViewWithPositionCallbacks)Preconditions.checkNotNull(videoviewwithpositioncallbacks);
    }

    private void doClickThrough(Vast vast)
    {
        VastBeaconSender.sendClickThrough(vast);
        Activity activity = playbackSupport.getActivity();
        if (activity != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(vast.getClickThroughUrl()));
            activity.startActivity(intent);
        }
    }

    private void startPlaying(Vast vast)
    {
        videoView.clearPositionListeners();
        if (midPointListener != null)
        {
            videoView.addPositionListener(midPointListener, vast.getContent().getContentMidPointLength() + adLength);
        }
        int i = stopPosition;
        stopPosition = 0;
        VastBeaconSender.registerBeaconSenders(vast, videoView, i);
        videoLoading.setVisibility(4);
        playbackSupport.onPlaybackStarted();
    }

    public void hideVideoView()
    {
        videoView.stopPlayback();
        videoView.setVisibility(4);
        if (mc != null && mc.getVisibility() == 0)
        {
            LogUtil.d("VideoPlaybackController", LoggingMetaTags.TWC_UI, "media controller is being hidden", new Object[0]);
            mc.hide();
        }
    }

    public void pausePlayback()
    {
        stopPosition = videoView.getCurrentPosition();
        videoView.pause();
    }

    public void playVast(final Vast vast)
    {
        final String clickThroughURL = vast.getClickThroughUrl();
        adLength = (int)TimeUnit.SECONDS.toMillis(vast.getContent().getPayloadLength() - vast.getContent().getContentLength());
        isAdCompleteBeaconFired = false;
        isAdStartBeaconFired = false;
        isVideoStartBeaconFired = false;
        String s = vast.getFullVideoUrl();
        try
        {
            videoView.setVideoURI(Uri.parse(s));
        }
        catch (Exception exception)
        {
            String s1 = vast.getContent().getContentUri();
            videoView.setVideoURI(Uri.parse(s1));
        }
        videoView.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoPlaybackController this$0;
            final Vast val$vast;

            public void onClick(View view)
            {
                doClickThrough(vast);
            }

            
            {
                this$0 = VideoPlaybackController.this;
                vast = vast1;
                super();
            }
        });
        videoView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final VideoPlaybackController this$0;
            final String val$clickThroughURL;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag1 = true;
                boolean flag;
                if (videoView.getCurrentPosition() > adLength)
                {
                    flag = false;
                } else
                {
                    flag = flag1;
                    if (motionevent.getAction() == 1)
                    {
                        flag = flag1;
                        if (!TextUtils.isEmpty(clickThroughURL))
                        {
                            videoView.performClick();
                            return true;
                        }
                    }
                }
                return flag;
            }

            
            {
                this$0 = VideoPlaybackController.this;
                clickThroughURL = s;
                super();
            }
        });
        learnMore.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoPlaybackController this$0;
            final String val$clickThroughURL;
            final Vast val$vast;

            public void onClick(View view)
            {
                if (!TextUtils.isEmpty(clickThroughURL))
                {
                    view.setVisibility(4);
                    doClickThrough(vast);
                }
            }

            
            {
                this$0 = VideoPlaybackController.this;
                clickThroughURL = s;
                vast = vast1;
                super();
            }
        });
        videoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final VideoPlaybackController this$0;
            final Vast val$vast;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                if (playbackSupport.shouldContinuePlaying())
                {
                    startPlaying(vast);
                    if (vast.hasCreative())
                    {
                        videoHasPreRoll = true;
                        videoView.setMediaController(null);
                        videoView.addPositionListener(setMediaControllerListener, adLength);
                        learnMore.setVisibility(0);
                        videoView.addPositionListener(hideLearnMoreListener, 5000);
                        if (!isAdStartBeaconFired)
                        {
                            Analytics.trackAction(AbstractTwcApplication.getRootContext().getResources().getString(com.weather.commons.R.string.beacon_video_ad_start), null);
                            isAdStartBeaconFired = true;
                        }
                        return;
                    } else
                    {
                        videoHasPreRoll = false;
                        setMediaControllerListener.onPositionChange();
                        learnMore.setVisibility(4);
                        return;
                    }
                } else
                {
                    mediaplayer.pause();
                    return;
                }
            }

            
            {
                this$0 = VideoPlaybackController.this;
                vast = vast1;
                super();
            }
        });
        videoView.start();
    }

    public void resumePlayback()
    {
        learnMore.setVisibility(4);
        if (!videoView.isPlaying())
        {
            videoView.seekTo(stopPosition);
            videoView.start();
        }
    }

    public void setBeaconParameters(Map map)
    {
        beaconParameters = map;
    }

    public void showVideo()
    {
        videoView.setVisibility(0);
        learnMore.setVisibility(8);
    }

    public void stopPlayback()
    {
        videoView.stopPlayback();
    }

    public void switchToVideoLoadError()
    {
        videoLoading.setText(com.weather.commons.R.string.video_playing_error);
        videoLoading.setVisibility(0);
    }

    public void switchToVideoLoading()
    {
        videoLoading.setText(com.weather.commons.R.string.video_loading);
        videoLoading.setVisibility(0);
    }



/*
    static boolean access$002(VideoPlaybackController videoplaybackcontroller, boolean flag)
    {
        videoplaybackcontroller.videoHasPreRoll = flag;
        return flag;
    }

*/




/*
    static boolean access$102(VideoPlaybackController videoplaybackcontroller, boolean flag)
    {
        videoplaybackcontroller.isAdCompleteBeaconFired = flag;
        return flag;
    }

*/





/*
    static boolean access$1302(VideoPlaybackController videoplaybackcontroller, boolean flag)
    {
        videoplaybackcontroller.isAdStartBeaconFired = flag;
        return flag;
    }

*/





/*
    static MediaController access$402(VideoPlaybackController videoplaybackcontroller, MediaController mediacontroller)
    {
        videoplaybackcontroller.mc = mediacontroller;
        return mediacontroller;
    }

*/




/*
    static boolean access$602(VideoPlaybackController videoplaybackcontroller, boolean flag)
    {
        videoplaybackcontroller.isVideoStartBeaconFired = flag;
        return flag;
    }

*/



}
