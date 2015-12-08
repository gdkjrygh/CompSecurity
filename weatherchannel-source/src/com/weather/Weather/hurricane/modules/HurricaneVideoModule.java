// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.Module;
import com.weather.Weather.hurricane.HurricaneVideoModuleLocalyticsHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.video2.QueryRange;
import com.weather.commons.video2.ThumbnailSize;
import com.weather.commons.video2.VideoAssetQuery;
import com.weather.commons.video2.VideoManager;
import com.weather.commons.video2.VideoMessage;
import com.weather.commons.video2.VideoUtil;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collection;
import java.util.List;

public class HurricaneVideoModule extends Module
{
    static final class ModuleData
    {

        private final VideoMessage messageToShow;
        private final List queriesMade;



        ModuleData(VideoMessage videomessage, Collection collection)
        {
            messageToShow = videomessage;
            queriesMade = ImmutableList.copyOf(collection);
        }
    }


    static final int HURRICANE_COUNT = 10;
    private static final VideoAssetQuery HURRICANE_QUERY = new VideoAssetQuery("tags.keyword", "hurricane", new QueryRange(0, 10), true);
    static final int STORM_COUNT = 50;
    private TextView descriptionText;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private final HurricaneVideoModuleLocalyticsHandler localyticsModuleHandler;
    private View moduleView;
    Picasso picasso;
    private ImageView previewImage;
    private RelativeLayout previewLayout;
    String stormId;
    private final VideoManager videoManager;
    private final Receiver videoReceiver;

    public HurricaneVideoModule(Context context, ModuleConfig moduleconfig, Handler handler, HurricaneVideoModuleLocalyticsHandler hurricanevideomodulelocalyticshandler)
    {
        this(context, moduleconfig, handler, hurricanevideomodulelocalyticshandler, FlagshipApplication.getInstance().getVideoManager());
    }

    HurricaneVideoModule(Context context, ModuleConfig moduleconfig, Handler handler, HurricaneVideoModuleLocalyticsHandler hurricanevideomodulelocalyticshandler, VideoManager videomanager)
    {
        super(context, moduleconfig, handler, hurricanevideomodulelocalyticshandler);
        videoReceiver = new _cls2();
        videoManager = (VideoManager)Preconditions.checkNotNull(videomanager);
        localyticsModuleHandler = hurricanevideomodulelocalyticshandler;
    }

    private void hide()
    {
        moduleView.setOnClickListener(null);
        if (isHideable)
        {
            moduleView.setLayoutParams(new android.widget.AbsListView.LayoutParams(layoutParams.width, 1));
            setActive(false);
            return;
        } else
        {
            setActive(true);
            moduleView.setLayoutParams(layoutParams);
            previewLayout.setVisibility(8);
            descriptionText.setText(0x7f07016c);
            return;
        }
    }

    private void show(ModuleData moduledata)
    {
        setActive(true);
        moduleView.setLayoutParams(layoutParams);
        previewLayout.setVisibility(0);
        String s = moduledata.messageToShow.getThumbnailUrl(ThumbnailSize.LARGE);
        LogUtil.d(TAG, LoggingMetaTags.TWC_VIDEOS, "url=%s", new Object[] {
            s
        });
        if (URLUtil.isValidUrl(s))
        {
            picasso.load(s).config(android.graphics.Bitmap.Config.RGB_565).placeholder(0x7f0204a5).error(0x7f0204a5).into(previewImage);
        }
        descriptionText.setText(moduledata.messageToShow.getTeaserTitle());
        moduleView.setOnClickListener(new _cls1(moduledata));
    }

    protected View createView(ViewGroup viewgroup)
    {
        moduleView = LayoutInflater.from(context).inflate(0x7f030064, viewgroup, false);
        previewLayout = (RelativeLayout)moduleView.findViewById(0x7f0d0191);
        previewImage = (ImageView)moduleView.findViewById(0x7f0d0192);
        descriptionText = (TextView)moduleView.findViewById(0x7f0d0194);
        layoutParams = moduleView.getLayoutParams();
        return moduleView;
    }

    public void resume()
    {
label0:
        {
            super.resume();
            if (VideoUtil.useImaVideoFeature())
            {
                if (stormId == null)
                {
                    break label0;
                }
                VideoAssetQuery videoassetquery = new VideoAssetQuery("tags.storm", stormId, new QueryRange(0, 50), true);
                videoManager.requestQueryVideos(videoReceiver, false, ImmutableSet.of(videoassetquery, HURRICANE_QUERY));
            }
            return;
        }
        videoManager.requestQueryVideos(videoReceiver, false, ImmutableSet.of(HURRICANE_QUERY));
    }

    protected void updateUi(ModuleData moduledata)
    {
        if (moduledata == null)
        {
            hide();
            return;
        } else
        {
            show(moduledata);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((ModuleData)obj);
    }








    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
