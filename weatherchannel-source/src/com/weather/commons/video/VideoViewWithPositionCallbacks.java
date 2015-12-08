// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.VideoView;
import com.google.common.base.Preconditions;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsVideoSummaryRecorder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class VideoViewWithPositionCallbacks extends VideoView
{
    public static interface PositionListener
    {

        public abstract void onPositionChange();
    }

    private static class PositionListenerEntry
    {

        private final PositionListener listener;
        private final int positionToListenFor;



        private PositionListenerEntry(PositionListener positionlistener, int i)
        {
            positionToListenFor = i;
            listener = positionlistener;
        }

    }


    private static final long INTERVAL = 500L;
    private final Collection changeListeners = new ArrayList();
    private final Handler handler = new Handler();
    private final Runnable updateTimeTask = new Runnable() {

        final VideoViewWithPositionCallbacks this$0;

        public void run()
        {
            checkPositionListeners();
            if (!changeListeners.isEmpty())
            {
                handler.postDelayed(updateTimeTask, 500L);
            }
        }

            
            {
                this$0 = VideoViewWithPositionCallbacks.this;
                super();
            }
    };

    public VideoViewWithPositionCallbacks(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void checkPositionListeners()
    {
        int i = getCurrentPosition();
        Object obj = new ArrayList();
        Iterator iterator = changeListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PositionListenerEntry positionlistenerentry = (PositionListenerEntry)iterator.next();
            if (i >= positionlistenerentry.positionToListenFor)
            {
                ((Collection) (obj)).add(positionlistenerentry);
            }
        } while (true);
        changeListeners.removeAll(((Collection) (obj)));
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((PositionListenerEntry)((Iterator) (obj)).next()).listener.onPositionChange()) { }
    }

    private void videoStarted()
    {
        checkPositionListeners();
        handler.removeCallbacks(updateTimeTask);
        if (!changeListeners.isEmpty())
        {
            handler.postDelayed(updateTimeTask, 500L);
        }
    }

    private void videoStopped()
    {
        handler.removeCallbacks(updateTimeTask);
        checkPositionListeners();
        LocalyticsHandler.getInstance().getLocalyticsVideoSummaryRecorder().recordVideoPause();
    }

    public void addPositionListener(PositionListener positionlistener, int i)
    {
        changeListeners.add(new PositionListenerEntry((PositionListener)Preconditions.checkNotNull(positionlistener), i));
    }

    public void clearPositionListeners()
    {
        changeListeners.clear();
    }

    protected void onDetachedFromWindow()
    {
        videoStopped();
        super.onDetachedFromWindow();
    }

    public void pause()
    {
        videoStopped();
        super.pause();
    }

    public void resume()
    {
        videoStarted();
        super.resume();
    }

    public void seekTo(int i)
    {
        checkPositionListeners();
        super.seekTo(i);
    }

    public void setVideoPath(String s)
    {
        changeListeners.clear();
        super.setVideoPath(s);
    }

    public void setVideoURI(Uri uri)
    {
        changeListeners.clear();
        super.setVideoURI(uri);
    }

    public void start()
    {
        videoStarted();
        super.start();
    }

    public void stopPlayback()
    {
        videoStopped();
        super.stopPlayback();
    }

    public void suspend()
    {
        videoStopped();
        super.suspend();
    }




}
