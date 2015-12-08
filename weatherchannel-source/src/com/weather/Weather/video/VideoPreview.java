// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.video.FeedType;
import com.weather.commons.video.VideoFeedsManager;
import com.weather.commons.video.VideoMessage;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.CountryCodeUtil;
import com.weather.util.device.LocaleUtil;
import com.weather.util.time.TimeOfDay;
import com.weather.util.time.TimeOfDayRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class VideoPreview
    implements VideoPreviewFactory.VideoPreviewComponent
{

    private static final String TAG = "VideoPreview";
    private final Context context;
    private final String feedId;
    private final Handler handler;
    private final View localVideoForecast;
    private final Collection localVideoRanges;
    private final LocalyticsHandler localyticsHandler;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private final int mustSeeVideoIndex;
    private final Picasso picasso;
    private final VideoFeedsManager videoFeedsManager;
    final Receiver videoReceiver = new _cls2();
    private final View videoSeparator;
    private FeedType videosToShow;

    public VideoPreview(Collection collection, VideoFeedsManager videofeedsmanager, Handler handler1, View view, Context context1, Picasso picasso1, LocalyticsHandler localyticshandler, 
            String s, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler, int i)
    {
        context = context1;
        picasso = picasso1;
        feedId = s;
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
        mustSeeVideoIndex = i;
        localVideoRanges = ImmutableList.copyOf(collection);
        videoFeedsManager = (VideoFeedsManager)Preconditions.checkNotNull(videofeedsmanager);
        handler = (Handler)Preconditions.checkNotNull(handler1);
        localVideoForecast = (View)Preconditions.checkNotNull(view.findViewById(0x7f0d022c));
        videoSeparator = view.findViewById(0x7f0d022b);
        localyticsHandler = localyticshandler;
    }

    private void hideVideo()
    {
        if (videoSeparator != null)
        {
            videoSeparator.setVisibility(8);
        }
        localVideoForecast.setVisibility(8);
    }

    private boolean isTimeToShowLocalUSVideo()
    {
        TimeOfDay timeofday = TimeOfDay.now();
        for (Iterator iterator = localVideoRanges.iterator(); iterator.hasNext();)
        {
            if (((TimeOfDayRange)iterator.next()).contains(timeofday))
            {
                return true;
            }
        }

        return false;
    }

    private void showVideo()
    {
        if (videoSeparator != null)
        {
            videoSeparator.setVisibility(0);
        }
        localVideoForecast.setVisibility(0);
    }

    private void showVideo(VideoMessage videomessage, int i, FeedType feedtype)
    {
        ((TextView)Preconditions.checkNotNull((TextView)localVideoForecast.findViewById(0x7f0d0230))).setText(videomessage.getTitle());
        ImageView imageview = (ImageView)localVideoForecast.findViewById(0x7f0d022d);
        videomessage = videomessage.getRegularThumbnailLink();
        if (URLUtil.isValidUrl(videomessage))
        {
            picasso.load(videomessage).config(android.graphics.Bitmap.Config.RGB_565).placeholder(0x7f0204a5).error(0x7f0204a5).into(imageview);
        }
        localVideoForecast.setOnClickListener(new _cls1(i, feedtype));
    }

    private void updateVideoOnUi()
    {
        handler.post(new _cls3());
    }

    public void requestVideo(boolean flag)
    {
        SavedLocation savedlocation = CurrentLocation.getInstance().getLocation();
        if (LocaleUtil.isDeviceInUS() && savedlocation != null && CountryCodeUtil.isUs(savedlocation.getCountryCode()))
        {
            FeedType feedtype;
            if (isTimeToShowLocalUSVideo())
            {
                feedtype = FeedType.LOCAL;
            } else
            {
                feedtype = FeedType.MUST_SEE;
            }
            videosToShow = feedtype;
            videoFeedsManager.requestVideos(videoReceiver, null, new FeedType[] {
                videosToShow
            });
            return;
        } else
        {
            videosToShow = null;
            updateVideoDisplay();
            return;
        }
    }

    public void updateVideoDisplay()
    {
        Object obj = null;
        boolean flag = false;
        VideoMessage videomessage;
        int i;
        if (videosToShow == FeedType.LOCAL)
        {
            List list = videoFeedsManager.getLocalVideos(CurrentLocation.getInstance().getLocation());
            videomessage = obj;
            i = ((flag) ? 1 : 0);
            if (!list.isEmpty())
            {
                videomessage = (VideoMessage)list.get(0);
                i = ((flag) ? 1 : 0);
            }
        } else
        {
            videomessage = obj;
            i = ((flag) ? 1 : 0);
            if (videosToShow == FeedType.MUST_SEE)
            {
                List list1 = videoFeedsManager.getMustSeeVideos();
                videomessage = obj;
                i = ((flag) ? 1 : 0);
                if (!list1.isEmpty())
                {
                    i = Math.min(list1.size() - 1, mustSeeVideoIndex);
                    videomessage = (VideoMessage)list1.get(i);
                }
            }
        }
        if (videomessage != null)
        {
            showVideo();
            showVideo(videomessage, i, videosToShow);
            return;
        } else
        {
            hideVideo();
            return;
        }
    }






    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
