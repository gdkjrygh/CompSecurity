// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video2;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.video2.ThumbnailSize;
import com.weather.commons.video2.VideoManager;
import com.weather.commons.video2.VideoMessage;
import com.weather.dal2.net.Receiver;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

public class VideoPreview2
    implements com.weather.Weather.video.VideoPreviewFactory.VideoPreviewComponent
{

    private static final String TAG = "VideoPreview2";
    private final Context context;
    private final String feedId;
    private String fromModuleId;
    private final Handler handler;
    private final LocalyticsHandler localyticsHandler;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private final Picasso picasso;
    private final VideoManager videoManager;
    private final View videoPreview;
    final Receiver videoReceiver = new _cls2();
    private final View videoSeparator;

    public VideoPreview2(VideoManager videomanager, Handler handler1, View view, Context context1, Picasso picasso1, LocalyticsHandler localyticshandler, String s, 
            ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler, String s1)
    {
        context = context1;
        picasso = picasso1;
        feedId = s;
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
        videoManager = (VideoManager)Preconditions.checkNotNull(videomanager);
        handler = (Handler)Preconditions.checkNotNull(handler1);
        videoPreview = (View)Preconditions.checkNotNull(view.findViewById(0x7f0d022c));
        videoSeparator = view.findViewById(0x7f0d022b);
        localyticsHandler = localyticshandler;
        fromModuleId = s1;
    }

    private void hideVideoPreview()
    {
        if (videoSeparator != null)
        {
            videoSeparator.setVisibility(8);
        }
        videoPreview.setVisibility(8);
    }

    private void showVideo(VideoMessage videomessage)
    {
        ((TextView)Preconditions.checkNotNull((TextView)videoPreview.findViewById(0x7f0d0230))).setText(videomessage.getTeaserTitle());
        ImageView imageview = (ImageView)videoPreview.findViewById(0x7f0d022d);
        String s = videomessage.getThumbnailUrl(ThumbnailSize.MEDIUM);
        LogUtil.d("VideoPreview2", LoggingMetaTags.TWC_VIDEOS, "url=%s", new Object[] {
            s
        });
        picasso.load(s).config(android.graphics.Bitmap.Config.RGB_565).noPlaceholder().error(0x7f0204a5).into(imageview);
        videoPreview.setOnClickListener(new _cls1(videomessage));
    }

    private void showVideoPreview()
    {
        if (videoSeparator != null)
        {
            videoSeparator.setVisibility(0);
        }
        videoPreview.setVisibility(0);
    }

    private void updateVideoOnUi()
    {
        handler.post(new _cls3());
    }

    boolean canShowVideoPreview()
    {
        return LocaleUtil.isDeviceInUS();
    }

    public void requestVideo(boolean flag)
    {
        if (canShowVideoPreview())
        {
            showVideoPreview();
            videoManager.requestProgrammedVideos(videoReceiver, false, com.weather.commons.video2.VideoManager.EditorialFeed.RIGHT_NOW);
            return;
        } else
        {
            hideVideoPreview();
            return;
        }
    }

    public void updateVideoDisplay()
    {
        Object obj = null;
        VideoMessage videomessage = obj;
        if (canShowVideoPreview())
        {
            List list = videoManager.getVideos(com.weather.commons.video2.VideoManager.EditorialFeed.RIGHT_NOW);
            videomessage = obj;
            if (!list.isEmpty())
            {
                videomessage = (VideoMessage)list.get(0);
            }
        }
        if (videomessage != null)
        {
            showVideoPreview();
            showVideo(videomessage);
            return;
        } else
        {
            hideVideoPreview();
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
