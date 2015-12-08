// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.video2.Dma;
import com.weather.commons.video2.VideoManager;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.List;

public class VideoModule extends Module
{

    private static final String DEFAULT_PLAYLIST = "pl-editor-picks";
    private static final String NEWS_INTERNATIONAL = "news/international";
    private static final String NEWS_INTERNATIONAL_UK = "news/international/uk";
    private static final String TAG = "VideoModule";
    private static final String VIDEOS_GERMANY = "neuigkeiten/deutschland";
    private LinearLayout content;
    private Dma dma;
    private final Receiver editorialFeedVideoReceiver;
    private RelativeLayout invalidData;
    private final Receiver listStringReceiver;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private final ModuleType moduleType;
    private String moreStories;
    private TextView moreStoriesView;
    private String previousScreen;
    private final List videoHolders;
    private final VideoManager videoManager;
    private List videos;

    public VideoModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler, ModuleType moduletype)
    {
        this(context, moduleconfig, handler, clickablelocalyticsmodulehandler, moduletype, FlagshipApplication.getInstance().getVideoManager());
    }

    VideoModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler, ModuleType moduletype, VideoManager videomanager)
    {
        super(context, moduleconfig, handler, clickablelocalyticsmodulehandler);
        videos = new ArrayList();
        videoHolders = new ArrayList();
        moreStories = "pl-editor-picks";
        editorialFeedVideoReceiver = new _cls2();
        listStringReceiver = new _cls3();
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
    /* block-local class not found */
    class ModuleType {}

        moduleType = (ModuleType)Preconditions.checkNotNull(moduletype);
        videoManager = (VideoManager)Preconditions.checkNotNull(videomanager);
    }

    private void fetchVideos(boolean flag)
    {
        LogUtil.v("VideoModule", LoggingMetaTags.TWC_VIDEOS, "fetchVideos", new Object[0]);
        setDma();
        if (!LocaleUtil.isDeviceInUS()) goto _L2; else goto _L1
_L1:
        moreStories = "pl-editor-picks";
        videoManager.requestProgrammedVideos(editorialFeedVideoReceiver, flag, com.weather.commons.video2.VideoManager.EditorialFeed.MAIN);
_L11:
        Object obj;
        Iterable iterable;
        Dma dma1;
        byte byte0;
        if (moreStoriesView != null)
        {
            if (dma != null)
            {
                moreStoriesView.setText(0x7f07031f);
            } else
            {
                moreStoriesView.setText(0x7f070320);
            }
        }
        iterable = LoggingMetaTags.TWC_VIDEOS;
        dma1 = dma;
        if (moreStoriesView == null)
        {
            obj = "null";
        } else
        {
            obj = moreStoriesView.getText();
        }
        LogUtil.v("VideoModule", iterable, "  dma=%s, moreStoriesView=%s, moreStories=%s", new Object[] {
            dma1, obj, moreStories
        });
        return;
_L2:
        obj = LocaleUtil.getTwoPartLocale();
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 5: default 180
    //                   95454463: 284
    //                   96646026: 269
    //                   96646068: 239
    //                   96646193: 224
    //                   96646267: 254;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_284;
_L9:
        switch (byte0)
        {
        default:
            showHide();
            break;

        case 0: // '\0'
            moreStories = "news/international/uk";
            videoManager.requestPlaylistVideos(listStringReceiver, flag, (new StringBuilder()).append('/').append(moreStories).toString());
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            moreStories = "news/international";
            videoManager.requestPlaylistVideos(listStringReceiver, flag, (new StringBuilder()).append('/').append(moreStories).toString());
            break;

        case 4: // '\004'
            moreStories = "neuigkeiten/deutschland";
            videoManager.requestPlaylistVideos(listStringReceiver, flag, (new StringBuilder()).append('/').append(moreStories).toString());
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (((String) (obj)).equals("en_GB"))
        {
            byte0 = 0;
        }
          goto _L9
_L6:
        if (((String) (obj)).equals("en_CA"))
        {
            byte0 = 1;
        }
          goto _L9
_L8:
        if (((String) (obj)).equals("en_IN"))
        {
            byte0 = 2;
        }
          goto _L9
_L5:
        if (((String) (obj)).equals("en_AU"))
        {
            byte0 = 3;
        }
          goto _L9
        if (((String) (obj)).equals("de_DE"))
        {
            byte0 = 4;
        }
          goto _L9
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void fillVideoDetails()
    {
        ((Activity)context).runOnUiThread(new _cls4());
    }

    private void setDma()
    {
        SavedLocation savedlocation = CurrentLocation.getInstance().getLocation();
        if (DataUnits.getCurrentUnitType() == UnitType.ENGLISH && savedlocation != null && savedlocation.getCountryCode().equals("US") && savedlocation.getDma() != null)
        {
            dma = new Dma(savedlocation.getCountryCode(), savedlocation.getDma());
        } else
        {
            dma = null;
        }
        LogUtil.v("VideoModule", LoggingMetaTags.TWC_VIDEOS, "setDma dma=%s", new Object[] {
            dma
        });
    }

    private boolean showHide()
    {
        if (content == null || invalidData == null)
        {
            return false;
        }
        if (videos.isEmpty())
        {
            content.setVisibility(8);
            invalidData.setVisibility(0);
            return false;
        } else
        {
            content.setVisibility(0);
            invalidData.setVisibility(8);
            return true;
        }
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(moduleType.getLayout(), viewgroup, false);
        previousScreen = moduleType.getPreviousScreen();
        content = (LinearLayout)viewgroup.findViewById(0x7f0d032c);
        moreStoriesView = (TextView)viewgroup.findViewById(0x7f0d0330);
        invalidData = (RelativeLayout)viewgroup.findViewById(0x7f0d0339);
        if (viewgroup.findViewById(0x7f0d032b) != null)
        {
            View view = viewgroup.findViewById(0x7f0d032b);
    /* block-local class not found */
    class VideoViewHolder {}

            int i;
            if (LocaleUtil.isDeviceInGermanyGerman())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
        videoHolders.add(new VideoViewHolder(viewgroup.findViewById(0x7f0d032d)));
        videoHolders.add(new VideoViewHolder(viewgroup.findViewById(0x7f0d032e)));
        videoHolders.add(new VideoViewHolder(viewgroup.findViewById(0x7f0d032f)));
        if (moduleType.getVideoCount() > 3)
        {
            videoHolders.add(new VideoViewHolder(viewgroup.findViewById(0x7f0d0331)));
        }
        moreStoriesView.setOnClickListener(new _cls1());
        return viewgroup;
    }

    public void onChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        ((Activity)context).runOnUiThread(new _cls5());
    }

    public void resume()
    {
        super.resume();
        fetchVideos(false);
    }

    public void runRefresh()
    {
        fetchVideos(false);
    }

    protected void updateUi(Object obj)
    {
        fetchVideos(false);
    }












/*
    static List access$602(VideoModule videomodule, List list)
    {
        videomodule.videos = list;
        return list;
    }

*/




    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls5 {}

}
