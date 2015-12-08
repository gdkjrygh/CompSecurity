// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.app.Activity;
import android.widget.FrameLayout;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerUtil;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;
import com.google.android.libraries.mediaframework.exoplayerextensions.ObservablePlayerControl;
import com.google.android.libraries.mediaframework.exoplayerextensions.Video;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            Layer

public class LayerManager
{

    private Activity activity;
    private FrameLayout container;
    private ObservablePlayerControl control;
    private ExoplayerWrapper exoplayerWrapper;
    private boolean hidden;
    private final String playerName;

    public LayerManager(Activity activity1, FrameLayout framelayout, Video video, List list, String s)
    {
        activity = activity1;
        container = framelayout;
        playerName = s;
        exoplayerWrapper = new ExoplayerWrapper(ExoplayerUtil.createRendererBuilder(activity1, video));
        exoplayerWrapper.prepare();
        control = exoplayerWrapper.getPlayerControl();
        framelayout.removeAllViews();
        for (activity1 = list.iterator(); activity1.hasNext(); video.onLayerDisplayed(this))
        {
            video = (Layer)activity1.next();
            framelayout.addView(video.createView(this));
        }

    }

    public Activity getActivity()
    {
        return activity;
    }

    public FrameLayout getContainer()
    {
        return container;
    }

    public ObservablePlayerControl getControl()
    {
        return control;
    }

    public ExoplayerWrapper getExoplayerWrapper()
    {
        return exoplayerWrapper;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public boolean isHidden()
    {
        return hidden;
    }

    public void release()
    {
        container.removeAllViews();
        if (exoplayerWrapper != null)
        {
            exoplayerWrapper.release();
            exoplayerWrapper = null;
        }
    }

    public void setHidden(boolean flag)
    {
        hidden = flag;
    }
}
