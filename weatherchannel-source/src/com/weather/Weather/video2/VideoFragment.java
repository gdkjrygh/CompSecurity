// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video2;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.mediaframework.exoplayerextensions.Video;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.weather.Weather.app.BaseWeatherFragment;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.video2.ChunkedMessage;
import com.weather.commons.video2.Dma;
import com.weather.commons.video2.QueryRange;
import com.weather.commons.video2.RangedQuery;
import com.weather.commons.video2.VideoCollectionChunkQuery;
import com.weather.commons.video2.VideoListMerger;
import com.weather.commons.video2.VideoManager;
import com.weather.commons.video2.VideoMessage;
import com.weather.commons.video2.VideoUtil;
import com.weather.commons.video2.dsx.VideoStreamType;
import com.weather.dal2.net.Receiver;
import com.weather.util.TwcPreconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.UIUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.video2:
//            Loader, VideoListAdapter, LoadMoreOnScrollListener, ImaPlayerStateParameters, 
//            ImaPlayer, VideoPlayerHolder, VideoAnalyticsReporter

public class VideoFragment extends BaseWeatherFragment
    implements Loader
{

    private static final String AD_SLOT_VIDEO = "video";
    private static final int CHUNK_SIZE = 100;
    private static final boolean DEFAULT_VIDEO_AUTOPLAY = true;
    private static final int END_OF_LIST_THRESHOLD = 5;
    private static final long FORCE_CHUNK_LOAD = 0L;
    private static final int MINIMUM_CHUNK_INTERVAL_MS = 450;
    private static final String SAVED_ALL_ADS_COMPLETED = "com.weather.Weather.video2.VideoFragment.allAdsCompleted";
    private static final String SAVED_CHUNK = "com.weather.Weather.video2.VideoFragment.savedChunk";
    private static final String SAVED_CONTENT_PLAYHEAD_POSITION = "com.weather.Weather.video2.VideoFragment.contentPlayheadPosition";
    private static final String SAVED_CONTENT_PLAY_STATE = "com.weather.Weather.video2.VideoFragment.contentPlayState";
    private static final String SAVE_NOW_PLAYING = "com.weather.Weather.video2.VideoFragment.nowPlaying";
    private static final String TAG = "VideoFragment";
    private static final boolean USE_IMA = VideoUtil.useImaVideoFeature();
    private VideoAnalyticsReporter analyticsReporter;
    private LinearLayout companionAdLayout;
    private final com.google.android.libraries.mediaframework.layeredvideo.PlaybackControlLayer.FullscreenCallback emptyCallback = new _cls2();
    private View fragmentView;
    private String fromModuleId;
    private boolean landscape;
    private boolean loadingMoreVideos;
    private RangedQuery nextChunk;
    private int playingVideoPosition;
    private Dma requestedDma;
    private String requestedPlaylistOrCollectionId;
    private ArrayList requestedVideoAssetQueries;
    private String requestedVideoId;
    private boolean savedAllAdsCompleted;
    private RangedQuery savedChunk;
    private Boolean savedContentPlayState;
    private Long savedContentPlayheadPosition;
    private String savedNowPlayingVideoId;
    private final com.google.android.libraries.mediaframework.layeredvideo.PlaybackControlLayer.ShouldBePlayingCallback screenControl = new _cls3();
    private long timeOfLastChunkLoadAttempt;
    private final Receiver videoChunkQueryAppendingReceiver = new VideoListChunkAppendingReceiver("collectionChunkAppend");
    private final Receiver videoChunkQueryReplacementReceiver = new VideoListReplacementReceiver("collectionChunkReplace");
    private final Receiver videoDmaReplacementReceiver = new VideoListReplacementReceiver("dma");
    private RelativeLayout videoFailureLayout;
    private TextView videoFailureMessageView;
    private VideoListAdapter videoListAdapter;
    private RecyclerView videoListRecyclerView;
    private final VideoManager videoManager = FlagshipApplication.getInstance().getVideoManager();
    private VideoPlayerHolder videoPlayer;
    private FrameLayout videoPlayerLayout;
    private final Receiver videoQueryReceiver = new VideoListReplacementReceiver("assetQueries");
    private final Receiver videoReplacementReceiver = new VideoListReplacementReceiver("playlist");
    private List videos;

    public VideoFragment()
    {
        videos = ImmutableList.of();
    /* block-local class not found */
    class VideoListReplacementReceiver {}

    /* block-local class not found */
    class VideoListChunkAppendingReceiver {}

    }

    private void bindViewsOnCreate()
    {
        videoPlayerLayout = (FrameLayout)Preconditions.checkNotNull(fragmentView.findViewById(0x7f0d0159));
        companionAdLayout = (LinearLayout)Preconditions.checkNotNull(fragmentView.findViewById(0x7f0d015d));
        videoFailureLayout = (RelativeLayout)Preconditions.checkNotNull(fragmentView.findViewById(0x7f0d015a));
        videoFailureMessageView = (TextView)Preconditions.checkNotNull(fragmentView.findViewById(0x7f0d015b));
        Activity activity = (Activity)Preconditions.checkNotNull(getActivity());
        videoListRecyclerView = (RecyclerView)Preconditions.checkNotNull(fragmentView.findViewById(0x7f0d015c));
        LinearLayoutManager linearlayoutmanager = new LinearLayoutManager(activity);
        videoListRecyclerView.setLayoutManager(linearlayoutmanager);
        videoListRecyclerView.setHasFixedSize(true);
        videoListAdapter = new VideoListAdapter(activity);
        videoListAdapter.setOnItemClickListener(new _cls1());
        videoListRecyclerView.addOnScrollListener(new LoadMoreOnScrollListener(linearlayoutmanager, this, 5));
    /* block-local class not found */
    class LocalyticsOnScrollListener {}

        videoListRecyclerView.addOnScrollListener(new LocalyticsOnScrollListener(null));
        videoListRecyclerView.setAdapter(videoListAdapter);
    }

    private boolean canLoadChunk(RangedQuery rangedquery)
    {
        return !loadingMoreVideos && rangedquery != null && SystemClock.uptimeMillis() > timeOfLastChunkLoadAttempt + 450L;
    }

    private boolean createImaPlayer(VideoMessage videomessage, int i, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue attributevalue, ImaPlayerStateParameters imaplayerstateparameters)
    {
        TwcPreconditions.checkOnMainThread();
        releaseImaPlayer();
        videoPlayerLayout.removeAllViews();
        Activity activity = getActivity();
        if (activity == null)
        {
            return false;
        }
        List list = videomessage.getVideoStreamInfo(VideoUtil.imaVideoUseAbr());
        if (i >= list.size())
        {
            LogUtil.w("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "invalid streamNumber. videoMessage=%s. streamNumber=%s", new Object[] {
                videomessage, Integer.valueOf(i)
            });
            imaplayerstateparameters.errorReason = 2;
            videoFailure(videomessage, imaplayerstateparameters);
            return false;
        }
        Object obj1 = (com.weather.commons.video2.VideoMessage.VideoStreamInfo)list.get(i);
    /* block-local class not found */
    class PlayerHighLevelMediaStateListener {}

        Object obj;
        if (((com.weather.commons.video2.VideoMessage.VideoStreamInfo) (obj1)).type == VideoStreamType.HLS)
        {
            obj = com.google.android.libraries.mediaframework.exoplayerextensions.Video.VideoType.HLS;
        } else
        {
            obj = com.google.android.libraries.mediaframework.exoplayerextensions.Video.VideoType.OTHER;
        }
        obj1 = new Video(((com.weather.commons.video2.VideoMessage.VideoStreamInfo) (obj1)).url, ((com.google.android.libraries.mediaframework.exoplayerextensions.Video.VideoType) (obj)), videomessage.getId());
        obj = getVastTagUrl(videomessage);
        if (imaplayerstateparameters.isAContentRetry)
        {
            if (imaplayerstateparameters.skipAdBecauseOfContentError)
            {
                obj = null;
            }
        } else
        {
            imaplayerstateparameters.retryContentPosition = getSavedContentPlayheadPosition();
        }
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append(Thread.currentThread().getName()).append(" createImaPlayer: video=%s, streamNumber=%s stateParameters=%s").toString(), new Object[] {
            obj1, Integer.valueOf(i), imaplayerstateparameters
        });
        imaplayerstateparameters = new ImaPlayer(getActivity(), videoPlayerLayout, companionAdLayout, ((Video) (obj1)), videomessage.getTeaserTitle(), ((String) (obj)), videomessage.isLive(), emptyCallback, screenControl, shouldAutoPlay(), imaplayerstateparameters);
        imaplayerstateparameters.setHighLevelMediaControlCallback(new PlayerHighLevelMediaStateListener(((Video) (obj1)), i, list, videomessage, attributevalue));
        videoPlayer = new VideoPlayerHolder(activity, imaplayerstateparameters);
        videoPlayer.setFullscreen(landscape);
        imaplayerstateparameters.setAudioFocusRequester(videoPlayer.getPlayer());
        videoFailureLayout.setVisibility(8);
        videoPlayerLayout.setVisibility(0);
        return true;
    }

    private boolean createImaPlayer(VideoMessage videomessage, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        return createImaPlayer(videomessage, 0, attributevalue, new ImaPlayerStateParameters());
    }

    private long getSavedContentPlayheadPosition()
    {
        long l = 0L;
        if (savedContentPlayheadPosition != null)
        {
            l = savedContentPlayheadPosition.longValue();
            savedContentPlayheadPosition = null;
        }
        return l;
    }

    private String getVastTagUrl(VideoMessage videomessage)
    {
        if (savedAllAdsCompleted)
        {
            LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "Skip ad as already watched in previous instance", new Object[0]);
            savedAllAdsCompleted = false;
            return null;
        } else
        {
            return VideoUtil.getVideoAdTags("video", videomessage);
        }
    }

    private int getVideoRequestPosition(Iterable iterable, String s)
    {
        int i = 0;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (((VideoMessage)iterable.next()).getId().equals(s))
            {
                return i;
            }
            i++;
        }

        return -1;
    }

    private void handleSavedInstanceStateOnCreate(Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = getArguments();
        }
        if (bundle != null)
        {
            requestedPlaylistOrCollectionId = bundle.getString("com.weather.Weather.video.VideoActivity.playlist");
            requestedVideoId = bundle.getString("com.weather.Weather.video.VideoActivity.requested");
            requestedVideoAssetQueries = bundle.getParcelableArrayList("com.weather.Weather.video.VideoActivity.videoAssetQuery");
            requestedDma = (Dma)bundle.getParcelable("com.weather.Weather.video.VideoActivity.dma");
            fromModuleId = bundle.getString("com.weather.Weather.video.VideoActivity.fromModuleId", "deeplink");
            savedChunk = (RangedQuery)bundle.getParcelable("com.weather.Weather.video2.VideoFragment.savedChunk");
            RangedQuery rangedquery;
            if (savedChunk == null)
            {
                rangedquery = null;
            } else
            {
                rangedquery = savedChunk.next();
            }
            nextChunk = rangedquery;
            savedNowPlayingVideoId = bundle.getString("com.weather.Weather.video2.VideoFragment.nowPlaying");
            savedContentPlayheadPosition = Long.valueOf(bundle.getLong("com.weather.Weather.video2.VideoFragment.contentPlayheadPosition"));
            savedContentPlayState = Boolean.valueOf(bundle.getBoolean("com.weather.Weather.video2.VideoFragment.contentPlayState", true));
            savedAllAdsCompleted = bundle.getBoolean("com.weather.Weather.video2.VideoFragment.allAdsCompleted");
            LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "handleSavedInstanceStateOnCreate: configurationState=%s, requestedVideoId=%s", new Object[] {
                LogUtil.bundleToString(bundle), requestedVideoId
            });
        }
    }

    private boolean isVideoPlaying(String s)
    {
        if (videoPlayer == null)
        {
            LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "isVideoPlaying: videoIdToCheck=%s, videoPlayer=null", new Object[] {
                s
            });
            return false;
        } else
        {
            String s1 = videoPlayer.getVideoId();
            LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "isVideoPlaying: videoIdToCheck=%s, videoPlayer.getVideoId()=%s", new Object[] {
                s, s1
            });
            return s.equalsIgnoreCase(s1);
        }
    }

    private void pauseVideo()
    {
        if (videoPlayer != null)
        {
            videoPlayer.pause();
        }
    }

    private void playVideo(VideoMessage videomessage)
    {
        Preconditions.checkNotNull(videomessage);
        if (videoPlayer != null)
        {
            UIUtil.keepScreenOn(getActivity());
            KahunaEvents.getInstance().startVideo(new Date(), videomessage.getTitle(), videomessage.getCollectionId());
            LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append("playVideo: ").append(videomessage.getTitle()).append(" t ").append(videomessage.getTeaserTitle()).toString(), new Object[0]);
            videoPlayer.play(false);
        }
    }

    private void releaseImaPlayer()
    {
        if (videoPlayer != null)
        {
            videoPlayer.release();
            videoPlayer = null;
        }
    }

    private void replaceList(List list, String s, Object obj, String s1)
    {
        String s2;
        String s3;
        TwcPreconditions.checkOnMainThread();
        LogUtil.d(s1, LoggingMetaTags.TWC_VIDEOS, "replaceList: received videos. %s=%s, newVideoList size=%s, savedNowPlayingVideoId=%s, requestedVideoId=%s", new Object[] {
            s, obj, Integer.valueOf(list.size()), savedNowPlayingVideoId, requestedVideoId
        });
        loadingMoreVideos = false;
        videoListAdapter.setLoading(false);
        timeOfLastChunkLoadAttempt = 0L;
        s3 = savedNowPlayingVideoId;
        s2 = s3;
        if (s3 == null)
        {
            s2 = requestedVideoId;
        }
        s3 = s2;
        if (s2 != null) goto _L2; else goto _L1
_L1:
        if (!list.isEmpty()) goto _L4; else goto _L3
_L3:
        LogUtil.w(s1, LoggingMetaTags.TWC_VIDEOS, "onCompletion: Nothing to play: no requested video, and no videos in new list. %s=%s", new Object[] {
            s, obj
        });
        nextChunk = null;
_L6:
        return;
_L4:
        s3 = ((VideoMessage)list.get(0)).getId();
_L2:
        Preconditions.checkNotNull(s3);
        Object obj1 = new VideoListMerger();
        if (requestedVideoId == null)
        {
            ((VideoListMerger) (obj1)).add(list);
        } else
        {
            int i = getVideoRequestPosition(list, requestedVideoId);
            if (i == -1)
            {
                VideoMessage videomessage = videoManager.getVideo(requestedVideoId);
                if (videomessage != null)
                {
                    ((VideoListMerger) (obj1)).add(videomessage);
                }
                ((VideoListMerger) (obj1)).add(list);
            } else
            {
                ((VideoListMerger) (obj1)).add((VideoMessage)list.get(i)).add(list.subList(0, i)).add(list.subList(i + 1, list.size()));
            }
        }
        videos = ((VideoListMerger) (obj1)).getMergedResult();
        if (videos.isEmpty())
        {
            LogUtil.w(s1, LoggingMetaTags.TWC_VIDEOS, "onCompletion: Nothing to play: no videos in list. %s=%s", new Object[] {
                s, obj
            });
            nextChunk = null;
            return;
        }
        int k = getVideoRequestPosition(videos, s3);
        int j = k;
        if (k == -1)
        {
            j = 0;
        }
        playingVideoPosition = j;
        videoListAdapter.setVideoList(videos);
        showSelectedVideoItem();
        videoListRecyclerView.scrollToPosition(playingVideoPosition);
        obj1 = (VideoMessage)videos.get(playingVideoPosition);
        if (fromModuleId.equals("deeplink"))
        {
            list = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.VIDEO_START_METHOD_DEEP_LINK;
        } else
        {
            list = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.VIDEO_START_METHOD_MODULE_CLICK;
        }
        trackVideoAutoPlayOfInitialVideo(((VideoMessage) (obj1)), list);
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "replaceList: play initial video. id=%s", new Object[] {
            ((VideoMessage) (obj1)).getId()
        });
        if (createImaPlayer(((VideoMessage) (obj1)), list))
        {
            playVideo(((VideoMessage) (obj1)));
            if (!videos.isEmpty())
            {
                list = (VideoMessage)videos.get(videos.size() - 1);
                if (list instanceof ChunkedMessage)
                {
                    nextChunk = ((ChunkedMessage)list).getRangedQuery().next(100);
                    LogUtil.d(s1, LoggingMetaTags.TWC_VIDEOS, "nextChunk updated to %s, video=%s, %s=%s", new Object[] {
                        nextChunk, list, s, obj
                    });
                    return;
                }
                if (obj instanceof String)
                {
                    nextChunk = new VideoCollectionChunkQuery((String)obj, new QueryRange(0, 100));
                    LogUtil.d(s1, LoggingMetaTags.TWC_VIDEOS, "nextChunk updated to %s, video=%s, %s=%s", new Object[] {
                        nextChunk, list, s, obj
                    });
                    return;
                } else
                {
                    LogUtil.d(s1, LoggingMetaTags.TWC_VIDEOS, "chunks not supported for video=%s, %s=%s", new Object[] {
                        list, s, obj
                    });
                    return;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void requestChunk(RangedQuery rangedquery, Receiver receiver)
    {
        Preconditions.checkArgument(canLoadChunk(rangedquery));
        loadingMoreVideos = true;
        videoListAdapter.setLoading(true);
        videoManager.requestChunkOfVideos(receiver, false, rangedquery);
    }

    private boolean shouldAutoPlay()
    {
        boolean flag = true;
        if (savedContentPlayState != null)
        {
            flag = savedContentPlayState.booleanValue();
            savedContentPlayState = null;
        }
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "shouldAutoPlay: %s", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
    }

    private void showSelectedVideoItem()
    {
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "showSelectedVideoItem: playingVideoPosition=%s", new Object[] {
            Integer.valueOf(playingVideoPosition)
        });
        videoListAdapter.selectPosition(playingVideoPosition);
    }

    private void trackClickVideo(VideoMessage videomessage)
    {
        analyticsReporter.trackClickVideo(videoPlayer.getImaPlayer(), videomessage);
    }

    private void trackOnPause()
    {
        if (videoPlayer != null)
        {
            analyticsReporter.trackOnPause(videoPlayer.getImaPlayer());
        }
    }

    private void trackVideoAutoPlayOfInitialVideo(VideoMessage videomessage, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        analyticsReporter.trackInitialVideoPlay(videomessage, attributevalue);
    }

    private void trackVideoFailure(String s)
    {
        analyticsReporter.trackVideoFailure(s);
    }

    private void videoFailure(VideoMessage videomessage, ImaPlayerStateParameters imaplayerstateparameters)
    {
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "Video failed. Try again? videoMessage=%s", new Object[] {
            videomessage
        });
        videoFailureLayout.setVisibility(0);
        videoPlayerLayout.setVisibility(8);
        videoFailureLayout.setOnClickListener(new _cls4(imaplayerstateparameters));
        videomessage = null;
        TextView textview;
        if (imaplayerstateparameters.errorReason == 1)
        {
            videomessage = getString(0x7f070323);
        } else
        if (imaplayerstateparameters.errorReason == 2)
        {
            videomessage = getString(0x7f070322);
        }
        textview = videoFailureMessageView;
        if (videomessage == null)
        {
            imaplayerstateparameters = "";
        } else
        {
            imaplayerstateparameters = videomessage;
        }
        textview.setText(getString(0x7f070327, new Object[] {
            imaplayerstateparameters
        }));
        trackVideoFailure(videomessage);
        UIUtil.allowScreenOff(getActivity());
    }

    public boolean canLoadMore()
    {
        return canLoadChunk(nextChunk);
    }

    public void loadMore()
    {
        requestChunk((RangedQuery)Preconditions.checkNotNull(nextChunk), videoChunkQueryAppendingReceiver);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onActivityCreated", new Object[0]);
        if (getActivity() == null)
        {
            return;
        }
        bindViewsOnCreate();
        handleSavedInstanceStateOnCreate(bundle);
        if (savedChunk != null)
        {
            requestChunk(savedChunk, videoChunkQueryReplacementReceiver);
            return;
        }
        if (requestedDma != null)
        {
            videoManager.requestDmaVideos(videoDmaReplacementReceiver, false, requestedDma, "news/weather");
            return;
        }
        if (requestedVideoAssetQueries != null && !requestedVideoAssetQueries.isEmpty())
        {
            videoManager.requestQueryVideos(videoQueryReceiver, false, ImmutableSet.copyOf(requestedVideoAssetQueries));
            return;
        }
        if (requestedVideoId != null)
        {
            LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onActivityCreated: play specific video. savedNowPlayingVideoId=%s, requestedVideoId=%s, requestedPlaylistOrCollectionId=%s", new Object[] {
                savedNowPlayingVideoId, requestedVideoId, requestedPlaylistOrCollectionId
            });
            videoManager.requestVideoAndPlaylist(videoReplacementReceiver, false, requestedVideoId, requestedPlaylistOrCollectionId);
            return;
        }
        VideoManager videomanager = videoManager;
        Receiver receiver = videoReplacementReceiver;
        if (requestedPlaylistOrCollectionId == null)
        {
            bundle = "pl-editor-picks";
        } else
        {
            bundle = requestedPlaylistOrCollectionId;
        }
        videomanager.requestPlaylistVideos(receiver, false, bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onCreateView", new Object[0]);
        analyticsReporter = new VideoAnalyticsReporter(getActivity());
        fragmentView = (View)Preconditions.checkNotNull(layoutinflater.inflate(0x7f03004b, viewgroup, false));
        return fragmentView;
    }

    public void onDestroyView()
    {
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onDestroyView", new Object[0]);
        releaseImaPlayer();
        super.onDestroyView();
    }

    public void onPause()
    {
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onPause", new Object[0]);
        pauseVideo();
        trackOnPause();
        super.onPause();
    }

    public void onResume()
    {
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onResume", new Object[0]);
        super.onResume();
        if (videoPlayer != null && !videoPlayer.isPausedPermanently())
        {
            videoPlayer.play(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (requestedPlaylistOrCollectionId != null)
        {
            bundle.putString("com.weather.Weather.video.VideoActivity.playlist", requestedPlaylistOrCollectionId);
        }
        if (requestedVideoAssetQueries != null)
        {
            bundle.putParcelableArrayList("com.weather.Weather.video.VideoActivity.videoAssetQuery", requestedVideoAssetQueries);
        }
        if (requestedDma != null)
        {
            bundle.putParcelable("com.weather.Weather.video.VideoActivity.dma", requestedDma);
        }
        if (requestedVideoId != null)
        {
            bundle.putString("com.weather.Weather.video.VideoActivity.requested", requestedVideoId);
        }
        bundle.putString("com.weather.Weather.video.VideoActivity.fromModuleId", fromModuleId);
        if (!videos.isEmpty() && playingVideoPosition >= 0 && playingVideoPosition < videos.size())
        {
            Object obj = (VideoMessage)videos.get(playingVideoPosition);
            bundle.putString("com.weather.Weather.video2.VideoFragment.nowPlaying", ((VideoMessage) (obj)).getId());
            if (videoPlayer != null)
            {
                long l1 = videoPlayer.getCurrentContentPosition();
                long l = l1;
                if (l1 < 0L)
                {
                    l = 0L;
                }
                bundle.putLong("com.weather.Weather.video2.VideoFragment.contentPlayheadPosition", l);
                bundle.putBoolean("com.weather.Weather.video2.VideoFragment.contentPlayState", videoPlayer.shouldContentBePlaying());
                bundle.putBoolean("com.weather.Weather.video2.VideoFragment.allAdsCompleted", videoPlayer.getImaPlayer().hasAllAdsEnded());
            }
            if (obj instanceof ChunkedMessage)
            {
                obj = ((ChunkedMessage)obj).getRangedQuery();
                if (!((RangedQuery) (obj)).isBaseline())
                {
                    bundle.putParcelable("com.weather.Weather.video2.VideoFragment.savedChunk", ((android.os.Parcelable) (obj)));
                }
            }
        }
        LogUtil.d("VideoFragment", LoggingMetaTags.TWC_VIDEOS, "onSaveInstanceState: outState=%s", new Object[] {
            LogUtil.bundleToString(bundle)
        });
    }

    public void sendDisplayPageBeacon()
    {
        Analytics.trackState(getResources().getString(0x7f0704e8), null);
    }

    public void setOrientation(Activity activity, boolean flag)
    {
        landscape = flag;
        Iterable iterable = LoggingMetaTags.TWC_VIDEOS;
        byte byte0;
        if (landscape)
        {
            activity = "landscape";
        } else
        {
            activity = "portrait";
        }
        LogUtil.d("VideoFragment", iterable, "orientation set to %s", new Object[] {
            activity
        });
        if (videoPlayer != null)
        {
            videoPlayer.setFullscreen(landscape);
        }
        activity = videoListRecyclerView;
        if (landscape)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        activity.setVisibility(byte0);
    }




/*
    static List access$002(VideoFragment videofragment, List list)
    {
        videofragment.videos = list;
        return list;
    }

*/












/*
    static boolean access$1902(VideoFragment videofragment, boolean flag)
    {
        videofragment.loadingMoreVideos = flag;
        return flag;
    }

*/




/*
    static long access$2102(VideoFragment videofragment, long l)
    {
        videofragment.timeOfLastChunkLoadAttempt = l;
        return l;
    }

*/





/*
    static int access$302(VideoFragment videofragment, int i)
    {
        videofragment.playingVideoPosition = i;
        return i;
    }

*/


/*
    static int access$308(VideoFragment videofragment)
    {
        int i = videofragment.playingVideoPosition;
        videofragment.playingVideoPosition = i + 1;
        return i;
    }

*/







/*
    static RangedQuery access$902(VideoFragment videofragment, RangedQuery rangedquery)
    {
        videofragment.nextChunk = rangedquery;
        return rangedquery;
    }

*/

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
