// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.app.BaseWeatherFragment;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsVideoDetailRecorder;
import com.weather.commons.analytics.LocalyticsVideoSummaryRecorder;
import com.weather.commons.analytics.profile.LocalyticsProfileAttribute;
import com.weather.commons.analytics.profile.LocalyticsProfileHandler;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.video.FeedType;
import com.weather.commons.video.VideoFeedConnection;
import com.weather.commons.video.VideoFeedsManager;
import com.weather.commons.video.VideoMessage;
import com.weather.commons.video.VideoPlaybackController;
import com.weather.commons.video.VideoPlaybackSupport;
import com.weather.commons.video.VideoViewWithPositionCallbacks;
import com.weather.commons.video.vast.UncachedVastConnection;
import com.weather.commons.video.vast.Vast;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.sessionm.SessionMUtils;
import com.weather.util.ui.UIUtil;
import java.io.IOException;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.Weather.video:
//            VideoListManager

public final class VideoFragment extends BaseWeatherFragment
    implements android.view.View.OnClickListener, android.widget.ViewSwitcher.ViewFactory, VideoPlaybackSupport
{
    private class LoadHeroImageTask extends AsyncTask
    {

        final VideoFragment this$0;

        protected transient Drawable doInBackground(String as[])
        {
            Object obj;
            obj = as[0];
            if (VideoFragment.LOG_UI)
            {
                Log.d("VideoFragment", (new StringBuilder()).append("in LoadHeroImageTask.doInBackground with url : ").append(((String) (obj))).toString());
            }
            if (obj == null) goto _L2; else goto _L1
_L1:
            android.graphics.Bitmap bitmap;
            try
            {
                bitmap = Picasso.with(AbstractTwcApplication.getRootContext()).load(((String) (obj))).skipMemoryCache().get();
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return null;
            }
            obj = bitmap;
            if (bitmap != null) goto _L4; else goto _L3
_L3:
            obj = Picasso.with(AbstractTwcApplication.getRootContext()).load(as[1]).skipMemoryCache().get();
              goto _L4
_L5:
            as = new BitmapDrawable(getResources(), ((android.graphics.Bitmap) (obj)));
            return as;
_L4:
            if (obj != null) goto _L5; else goto _L2
_L2:
            return null;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        private LoadHeroImageTask()
        {
            this$0 = VideoFragment.this;
            super();
        }

        LoadHeroImageTask(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int HERO_IMAGE_COUNT = 5;
    private static final long IMAGE_SWAP_DELAY = 5000L;
    private static final String LOCAL_AD_SLOT = "video.local";
    public static final String LOCAL_BEACON_TAB_NAME = "Local";
    private static final String LOCATION_KEY = "location";
    private static final boolean LOG_UI;
    private static final String MUST_SEE_AD_SLOT = "video.must_see";
    private static final String MUST_SEE_BEACON_TAB_NAME = "Must See";
    private static final String ON_TV_BEACON_TAB_NAME = "On TV";
    private static final String SELECTED_POSITION = "selectedPosition";
    private static final String TAG = "VideoFragment";
    private static final String TV_AD_SLOT = "video.tv";
    private final Map beaconParameters = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
    private TextView currentSelection;
    private int displayedImagePosition;
    private final Handler handler = new Handler();
    private boolean hasScrolled;
    private final Runnable heroImageRunnable = new _cls2();
    private boolean isResumed;
    private boolean isVideoMidBeaconFired;
    private VideoListManager localUSVideos;
    private volatile SavedLocation location;
    private final com.weather.commons.video.VideoViewWithPositionCallbacks.PositionListener midPointListener = new _cls1();
    private VideoListManager mustSeeVideos;
    private VideoListManager onTVVideos;
    private VideoPlaybackController playbackController;
    private VideoListManager playingListManager;
    private boolean shouldUpdateAdapter;
    private final Runnable skipWrongVideoRunnable = new SkipWrongVideoRunnable(null);
    private Vast vast;
    private final VideoFeedsManager videoFeedsManager = new VideoFeedsManager(VideoFeedConnection.getInstance());
    private LinearLayout videoFrame;
    private GridView videoGridView;
    private LinearLayout videoLeftOrTop;
    private TextView videoMainSummary;
    private TextView videoMainTitle;
    final Receiver videoReceiver = new _cls8();
    private LinearLayout videoRightOrBottom;
    private LocalyticsVideoSummaryRecorder videoSummaryRecorder;
    private VideoViewWithPositionCallbacks videoView;
    private ViewGroup videoViewLayout;
    private VideoListManager visibleListManager;

    public VideoFragment()
    {
    /* block-local class not found */
    class SkipWrongVideoRunnable {}

    }

    private void configureVideoView()
    {
        videoView.setOnCompletionListener(new _cls6());
        videoView.setOnErrorListener(new _cls7());
    }

    private void displayLoadError()
    {
        Activity activity = getActivity();
        if (activity != null && isResumed())
        {
            long l = activity.getResources().getInteger(0x7f09002d);
            activity.runOnUiThread(new _cls11());
            handler.postDelayed(skipWrongVideoRunnable, l);
        }
    }

    private void loadHeroImage(int i)
    {
        VideoListManager.VideoPick videopick = visibleListManager.getVideoForPosition(i);
        if (videopick != null)
        {
            displayedImagePosition = videopick.position;
            loadHeroImage(videopick.videoMessage);
        }
    }

    private void loadHeroImage(VideoMessage videomessage)
    {
        videoMainTitle.setText(videomessage.getTitle());
        videoMainSummary.setText(videomessage.getDescription());
        String s = videomessage.getLargerThumbnailLink();
        videomessage = videomessage.getThumbnailLink();
        (new LoadHeroImageTask(null)).execute(new String[] {
            s, videomessage
        });
    }

    private void loadInitialData(Intent intent)
    {
        TextView textview = (TextView)getActivity().findViewById(0x7f0d0152);
        TextView textview1 = (TextView)Preconditions.checkNotNull((TextView)getActivity().findViewById(0x7f0d0153));
        textview.setOnClickListener(this);
        textview1.setOnClickListener(this);
        if (intent.getBooleanExtra("Local", false))
        {
            intent = textview1;
        } else
        {
            intent = textview;
        }
        currentSelection = intent;
        currentSelection.setSelected(true);
        localizeAndLoadData();
    }

    private void localizeAndLoadData()
    {
        TextView textview = (TextView)Preconditions.checkNotNull((TextView)getActivity().findViewById(0x7f0d0152));
        TextView textview1 = (TextView)Preconditions.checkNotNull((TextView)getActivity().findViewById(0x7f0d0153));
        TextView textview2 = (TextView)Preconditions.checkNotNull((TextView)getActivity().findViewById(0x7f0d0154));
        textview.setOnClickListener(this);
        textview1.setOnClickListener(this);
        textview2.setOnClickListener(this);
        if (LocaleUtil.isDeviceInUS())
        {
            videoFeedsManager.requestVideos(videoReceiver, null, new FeedType[] {
                FeedType.MUST_SEE, FeedType.ON_TV, FeedType.LOCAL
            });
            return;
        } else
        {
            textview1.setVisibility(8);
            textview2.setVisibility(8);
            videoFeedsManager.requestVideos(videoReceiver, null, new FeedType[] {
                FeedType.MUST_SEE
            });
            return;
        }
    }

    private void makeVastCall(String s)
    {
        try
        {
    /* block-local class not found */
    class VastReceiver {}

            UncachedVastConnection.getInstance().asyncFetch(s, new VastReceiver(null), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("VideoFragment", (new StringBuilder()).append("in makeVastCall error:").append(s).toString());
        }
    }

    private void recordLocalyticsForVideoStart(VideoMessage videomessage)
    {
        String s;
        com.weather.commons.analytics.LocalyticsVideoTags.VideoDetailsTagName videodetailstagname;
        videoSummaryRecorder = LocalyticsHandler.getInstance().getLocalyticsVideoSummaryRecorder();
        s = com.weather.commons.analytics.LocalyticsAttributeValues.VideoCategory.MUST_SEE.getAttributeValue();
        videodetailstagname = com.weather.commons.analytics.LocalyticsVideoTags.VideoDetailsTagName.VIDEO_CATEGORY_MUST_SEE;
        if (!visibleListManager.equals(onTVVideos)) goto _L2; else goto _L1
_L1:
        s = com.weather.commons.analytics.LocalyticsAttributeValues.VideoCategory.ON_TV.getAttributeValue();
        videodetailstagname = com.weather.commons.analytics.LocalyticsVideoTags.VideoDetailsTagName.VIDEO_CATEGORY_ON_TV;
_L4:
        videoSummaryRecorder.recordVideoIdTitleCategory(videomessage, s);
        LocalyticsHandler.getInstance().getLocalyticsVideoDetailRecorder().incrementVideoCategoryViews(videodetailstagname);
        LocalyticsHandler.getInstance().getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.VIDEOS_WATCHED);
        return;
_L2:
        if (visibleListManager.equals(localUSVideos))
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.VideoCategory.LOCAL.getAttributeValue();
            videodetailstagname = com.weather.commons.analytics.LocalyticsVideoTags.VideoDetailsTagName.VIDEO_CATEGORY_LOCAL;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void resetAndStartNextVideo(MediaPlayer mediaplayer)
    {
        mediaplayer.setDisplay(null);
        mediaplayer.reset();
        mediaplayer.setDisplay(videoView.getHolder());
        Analytics.trackAction(getResources().getString(0x7f0704dc), beaconParameters);
        videoSummaryRecorder.recordVideoCompletion(vast);
        LocalyticsHandler.getInstance().tagSummaryEvent(LocalyticsEvent.VIDEO_SUMMARY);
        LocalyticsHandler.getInstance().getLocalyticsVideoSummaryRecorder().recordVideoStartAfterVideoCompletion();
        videoView.setKeepScreenOn(false);
        if (LOG_UI)
        {
            Log.d("VideoFragment", "in VideoFragment onCompletion");
        }
        int i = playingListManager.incrementVideoPosition();
        SessionMUtils.logAction("must_see_video");
        startPlayingVideo(i);
    }

    private void setVideoLayoutInPortrait(Activity activity)
    {
        activity = activity.getWindow();
        if (activity != null)
        {
            activity.addFlags(1024);
        }
        activity = (RelativeLayout)getActivity().findViewById(0x7f0d014a);
        Object obj = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        obj = new android.widget.LinearLayout.LayoutParams(-1, (((DisplayMetrics) (obj)).widthPixels * 9) / 16);
        obj.gravity = 17;
        activity.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private void startPlayingVideo(int i)
    {
label0:
        {
            Object obj = getActivity();
            if (obj != null)
            {
                playbackController.showVideo();
                VideoMessage videomessage = playingListManager.startPlayingVideo(i);
                if (videomessage == null)
                {
                    break label0;
                }
                handler.removeCallbacksAndMessages(null);
                videoMainTitle.setText(videomessage.getTitle());
                videoMainSummary.setText(videomessage.getDescription());
                beaconParameters.clear();
                beaconParameters.put(BeaconTargetingParam.VIDEO, videomessage.getTitle());
                beaconParameters.put(BeaconTargetingParam.VIDEO_ID, videomessage.getClipid());
                isVideoMidBeaconFired = false;
                Analytics.trackAction(((Activity) (obj)).getResources().getString(0x7f0704da), beaconParameters);
                recordLocalyticsForVideoStart(videomessage);
                LocalyticsProfileHandler.getInstance().incrementIntegerProfileAttribute(LocalyticsProfileAttribute.VIDEOS_WATCHED_COUNT);
                playbackController.setBeaconParameters(beaconParameters);
                playbackController.switchToVideoLoading();
                playbackController.stopPlayback();
                videoGridView.setSelection(i);
                videoGridView.setSelected(true);
                String s = videomessage.getUnicornVideoLink(playingListManager.getAdSlotName());
                obj = s;
                if (s == null)
                {
                    obj = videomessage.getVideoLink();
                }
                makeVastCall(((String) (obj)));
            }
            return;
        }
        Log.e("VideoFragment", "in VideoFragment startPlayingVideo position > size");
    }

    private void switchPlayingList(VideoListManager videolistmanager)
    {
        if (playingListManager != null)
        {
            playingListManager.clearSelection();
        }
        playingListManager = videolistmanager;
    }

    private void updateCurrentSelection(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131558738: 
        case 2131558739: 
        case 2131558740: 
            currentSelection.setSelected(false);
            break;
        }
        currentSelection = (TextView)view;
        currentSelection.setSelected(true);
    }

    private void updateListOfVideos(int i, Collection collection)
    {
        Activity activity = getActivity();
        if (activity != null)
        {
            activity.runOnUiThread(new _cls9(i, collection));
        }
    }

    private void updateOnVisible()
    {
        while (!isResumed || !isVisible()) 
        {
            return;
        }
        if (shouldUpdateAdapter)
        {
            if (LOG_UI)
            {
                Log.d("VideoFragment", "updateVideoList called from updateOnVisible");
            }
            getActivity().runOnUiThread(new _cls5());
        }
        handler.removeCallbacksAndMessages(null);
    }

    private void updateVideoList(VideoListManager videolistmanager)
    {
        handler.removeCallbacks(heroImageRunnable);
        visibleListManager = videolistmanager;
        if (LOG_UI)
        {
            Log.d("VideoFragment", "updateVideoList called from VideoFragment.updateVideoList");
        }
        videoGridView.setAdapter(videolistmanager.getAdapter());
    }

    public MediaController createMediaController()
    {
        Activity activity = getActivity();
        if (activity == null)
        {
            return null;
        } else
        {
            return new MediaController(activity);
        }
    }

    public boolean isFullScreen()
    {
        return false;
    }

    public View makeView()
    {
        ImageView imageview = new ImageView(getActivity());
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        imageview.setBackgroundColor(0xff000000);
        return imageview;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        videoView = (VideoViewWithPositionCallbacks)activity.findViewById(0x7f0d014b);
        if (videoView == null)
        {
            return;
        }
        playbackController = new VideoPlaybackController((TextView)activity.findViewById(0x7f0d014c), (ImageView)activity.findViewById(0x7f0d014d), videoView, this, midPointListener);
        configureVideoView();
        int i = activity.getResources().getConfiguration().orientation;
        videoGridView = (GridView)activity.findViewById(0x7f0d0155);
        mustSeeVideos = new VideoListManager(activity, "Must See", "video.must_see");
        localUSVideos = new VideoListManager(activity, "Local", "video.local");
        onTVVideos = new VideoListManager(activity, "On TV", "video.tv");
        Intent intent = activity.getIntent();
        int j;
        if (intent.getBooleanExtra("Local", false))
        {
            bundle = localUSVideos;
        } else
        {
            bundle = mustSeeVideos;
        }
        visibleListManager = bundle;
        j = intent.getIntExtra("selectedPosition", -1);
        videoGridView.setNumColumns(1);
        videoGridView.setAdapter(visibleListManager.getAdapter());
        updateVideoList(visibleListManager);
        visibleListManager.setInitialPosition(j);
        videoGridView.setOnItemClickListener(new _cls3());
        videoGridView.setOnScrollListener(new _cls4());
        videoMainTitle = (TextView)activity.findViewById(0x7f0d014e);
        videoMainSummary = (TextView)activity.findViewById(0x7f0d014f);
        if (i != 2)
        {
            setVideoLayoutInPortrait(activity);
        }
        loadInitialData(intent);
    }

    public void onClick(View view)
    {
        int i = view.getId();
        updateCurrentSelection(view);
        switch (i)
        {
        default:
            return;

        case 2131558738: 
            updateVideoList(mustSeeVideos);
            Analytics.trackState(getResources().getString(0x7f0704e0), null);
            return;

        case 2131558739: 
            updateVideoList(localUSVideos);
            Analytics.trackState(getResources().getString(0x7f0704dd), null);
            return;

        case 2131558740: 
            updateVideoList(onTVVideos);
            break;
        }
        Analytics.trackState(getResources().getString(0x7f0704e2), null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        if (bundle != null)
        {
            bundle1 = bundle;
        }
        if (bundle1 != null)
        {
            location = (SavedLocation)bundle1.getSerializable("location");
        }
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03004a, viewgroup, false);
        videoFrame = (LinearLayout)layoutinflater.findViewById(0x7f0d0148);
        videoLeftOrTop = (LinearLayout)layoutinflater.findViewById(0x7f0d0149);
        videoRightOrBottom = (LinearLayout)layoutinflater.findViewById(0x7f0d0150);
        videoViewLayout = (ViewGroup)layoutinflater.findViewById(0x7f0d014a);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        videoView.stopPlayback();
    }

    public void onLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        currentlocationchangeevent = getActivity();
        if (currentlocationchangeevent != null)
        {
            currentlocationchangeevent.runOnUiThread(new _cls10());
        }
    }

    public void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        handler.removeCallbacksAndMessages(null);
        isResumed = false;
        videoSummaryRecorder = LocalyticsHandler.getInstance().getLocalyticsVideoSummaryRecorder();
        if (!videoSummaryRecorder.getAttributesMap().isEmpty())
        {
            videoSummaryRecorder.recordExitAfterVideoClick(vast, TimeUnit.MILLISECONDS.toSeconds(videoView.getCurrentPosition()));
        }
        LocalyticsHandler.getInstance().tagSummaryEvent(LocalyticsEvent.VIDEO_SUMMARY);
        if (playbackController != null)
        {
            playbackController.pausePlayback();
        }
        super.onPause();
    }

    public void onPlaybackStarted()
    {
    }

    public void onResume()
    {
        super.onResume();
        isResumed = true;
        handler.removeCallbacksAndMessages(null);
        location = CurrentLocation.getInstance().getLocation();
        updateOnVisible();
        if (playbackController != null)
        {
            playbackController.resumePlayback();
        }
        DataAccessLayer.BUS.register(this);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putSerializable("location", location);
        super.onSaveInstanceState(bundle);
    }

    public void sendDisplayPageBeacon()
    {
        Analytics.trackState(getResources().getString(0x7f0704e8), null);
    }

    public void setOrientation(Activity activity, boolean flag)
    {
        boolean flag1 = videoView.isPlaying();
        if (flag1)
        {
            videoView.pause();
        }
        if (flag)
        {
            activity = activity.getWindow();
            if (activity != null)
            {
                activity.addFlags(1024);
            }
            activity = new android.widget.LinearLayout.LayoutParams(-1, -1);
            activity.gravity = 17;
            videoRightOrBottom.setVisibility(8);
            videoViewLayout.setLayoutParams(activity);
            videoFrame.setPadding(0, 0, 0, 0);
            videoFrame.setGravity(17);
        } else
        {
            setVideoLayoutInPortrait(activity);
            videoLeftOrTop.setPadding(0, 0, 0, 0);
            videoRightOrBottom.setVisibility(0);
        }
        if (flag1)
        {
            videoView.start();
        }
    }

    public void setUserVisibleHint(boolean flag)
    {
        Activity activity = getActivity();
        if (activity == null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (LOG_UI)
        {
            Log.d("VideoFragment", "in VideoFragment.setUserVisibleHint setting SCREEN_ORIENTATION_UNSPECIFIED");
        }
        activity.setRequestedOrientation(-1);
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            super.setUserVisibleHint(flag);
        }
        if (flag)
        {
            updateOnVisible();
        }
        return;
_L4:
        if (!UIUtil.isTablet(getActivity().getApplicationContext()))
        {
            if (LOG_UI)
            {
                Log.d("VideoFragment", "in VideoFragment.setUserVisibleHint setting SCREEN_ORIENTATION_PORTRAIT");
            }
            activity.setRequestedOrientation(1);
        }
        try
        {
            if (playbackController != null)
            {
                playbackController.hideVideoView();
                handler.removeCallbacksAndMessages(null);
                switchPlayingList(null);
            }
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void shareCurrentVideo()
    {
    }

    public boolean shouldContinuePlaying()
    {
        return isVisible();
    }

    public void toggleFullScreenMode()
    {
    }

    static 
    {
        LOG_UI = LogUtil.isLoggable(LoggingMetaTags.TWC_UI, 3);
    }









/*
    static boolean access$1502(VideoFragment videofragment, boolean flag)
    {
        videofragment.hasScrolled = flag;
        return flag;
    }

*/





/*
    static boolean access$1902(VideoFragment videofragment, boolean flag)
    {
        videofragment.shouldUpdateAdapter = flag;
        return flag;
    }

*/




/*
    static boolean access$202(VideoFragment videofragment, boolean flag)
    {
        videofragment.isVideoMidBeaconFired = flag;
        return flag;
    }

*/





/*
    static SavedLocation access$2302(VideoFragment videofragment, SavedLocation savedlocation)
    {
        videofragment.location = savedlocation;
        return savedlocation;
    }

*/







/*
    static int access$402(VideoFragment videofragment, int i)
    {
        videofragment.displayedImagePosition = i;
        return i;
    }

*/


/*
    static int access$408(VideoFragment videofragment)
    {
        int i = videofragment.displayedImagePosition;
        videofragment.displayedImagePosition = i + 1;
        return i;
    }

*/






/*
    static Vast access$902(VideoFragment videofragment, Vast vast1)
    {
        videofragment.vast = vast1;
        return vast1;
    }

*/

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls10 {}

}
