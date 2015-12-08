// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.squareup.picasso.Picasso;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.video2.VideoPreview2;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.video.VideoFeedConnection;
import com.weather.commons.video.VideoFeedsManager;
import com.weather.commons.video2.VideoUtil;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.Weather.video:
//            VideoPreview

public final class VideoPreviewFactory
{

    private VideoPreviewFactory()
    {
    }

    public static VideoPreviewComponent getVideoPreviewComponent(Context context, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler, View view, Handler handler, String s, String s1)
        throws IllegalStateException
    {
        try
        {
            FlagshipConfig flagshipconfig = ConfigurationManagers.getInstance().getFlagshipConfig();
            if (VideoUtil.useImaVideoFeature())
            {
                return new VideoPreview2(FlagshipApplication.getInstance().getVideoManager(), handler, view, context, Picasso.with(context), LocalyticsHandler.getInstance(), s, clickablelocalyticsmodulehandler, s1);
            }
            context = new VideoPreview(flagshipconfig.getLocalVideoRanges(), new VideoFeedsManager(VideoFeedConnection.getInstance()), handler, view, context, Picasso.with(context), LocalyticsHandler.getInstance(), s, clickablelocalyticsmodulehandler, flagshipconfig.mustSeeForecastVideoPosition);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException("Creating module before flagship config is ready", context);
        }
        return context;
    }

    // Unreferenced inner class com/weather/Weather/video/VideoPreviewFactory$VideoPreviewComponent
    /* block-local class not found */
    class VideoPreviewComponent {}

}
