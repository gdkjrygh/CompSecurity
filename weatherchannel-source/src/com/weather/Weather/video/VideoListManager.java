// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.ListAdapter;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video.VideoMessage;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.weather.Weather.video:
//            VideoListAdapter

public class VideoListManager
{
    public static final class VideoPick
    {

        public final int position;
        public final VideoMessage videoMessage;

        public VideoPick(int i, VideoMessage videomessage)
        {
            position = i;
            videoMessage = (VideoMessage)Preconditions.checkNotNull(videomessage);
        }
    }


    private static final boolean LOG_UI;
    private static final String TAG = "VideoListManager";
    private final String adSlotName;
    private int playingVideoPosition;
    private final VideoListAdapter videoListAdapter;
    private List videos;

    public VideoListManager(Activity activity, String s, String s1)
    {
        playingVideoPosition = -1;
        adSlotName = (String)Preconditions.checkNotNull(s1);
        videoListAdapter = new VideoListAdapter((Context)Preconditions.checkNotNull(activity), s);
        updateVideoList(ImmutableList.of(), true);
    }

    public void clearSelection()
    {
        videoListAdapter.clearSelection();
        videoListAdapter.notifyDataSetChanged();
    }

    public String getAdSlotName()
    {
        return adSlotName;
    }

    public ListAdapter getAdapter()
    {
        return videoListAdapter;
    }

    public VideoPick getVideoForPosition(int i)
    {
        if (videos.isEmpty())
        {
            return null;
        }
        int j = i;
        if (i >= videos.size())
        {
            j = 0;
        }
        return new VideoPick(j, (VideoMessage)videos.get(j));
    }

    public int incrementVideoPosition()
    {
        if (!videos.isEmpty()) goto _L2; else goto _L1
_L1:
        playingVideoPosition = -1;
_L4:
        return playingVideoPosition;
_L2:
        playingVideoPosition = playingVideoPosition + 1;
        if (playingVideoPosition >= videos.size())
        {
            playingVideoPosition = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setInitialPosition(int i)
    {
        playingVideoPosition = i;
    }

    public VideoMessage startPlayingVideo(int i)
    {
        playingVideoPosition = i;
        if (LOG_UI)
        {
            Log.d("VideoListManager", (new StringBuilder()).append("in VideoFragment startPlayingVideo with position: ").append(i).toString());
        }
        if (i >= videos.size())
        {
            return null;
        } else
        {
            videoListAdapter.setCurrentSelectedPosition(playingVideoPosition);
            videoListAdapter.notifyDataSetChanged();
            return (VideoMessage)videos.get(i);
        }
    }

    public void updateAdapter()
    {
        videoListAdapter.updateVideoList(videos);
        videoListAdapter.notifyDataSetChanged();
    }

    public final int updateVideoList(Collection collection, boolean flag)
    {
        videos = ImmutableList.copyOf(collection);
        if (playingVideoPosition >= videos.size() || playingVideoPosition == -1)
        {
            if (!videos.isEmpty())
            {
                playingVideoPosition = 0;
            } else
            {
                playingVideoPosition = -1;
            }
        }
        if (flag)
        {
            updateAdapter();
        }
        return playingVideoPosition;
    }

    static 
    {
        LOG_UI = LogUtil.isLoggable(LoggingMetaTags.TWC_UI, 3);
    }
}
