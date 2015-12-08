// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.widget.VideoView;
import com.sessionm.core.Session;
import com.sessionm.core.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.sessionm.ui:
//            VideoProgressListener, VideoErrorListener

public class SessionMVideoView extends VideoView
{
    private class VideoProgressTask extends TimerTask
    {

        final SessionMVideoView this$0;

        public void run()
        {
            int i = getCurrentPosition();
            for (Iterator iterator = progressListeners.iterator(); iterator.hasNext(); ((VideoProgressListener)iterator.next()).onVideoProgress(SessionMVideoView.this, i)) { }
            checkProgress();
        }

        private VideoProgressTask()
        {
            this$0 = SessionMVideoView.this;
            super();
        }

    }


    private static final String TAG = "SessionM.Video";
    private boolean enableSeek;
    private final List errorListeners = new ArrayList();
    private final List progressListeners = new ArrayList();
    private VideoProgressTask progressTask;
    private Timer progressTimer;
    private String urlString;

    public SessionMVideoView(Context context)
    {
        super(context);
        setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final SessionMVideoView this$0;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                pause();
                for (mediaplayer = progressListeners.iterator(); mediaplayer.hasNext(); ((VideoProgressListener)mediaplayer.next()).onVideoCompleted(SessionMVideoView.this)) { }
            }

            
            {
                this$0 = SessionMVideoView.this;
                super();
            }
        });
        setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final SessionMVideoView this$0;

            public boolean onError(MediaPlayer mediaplayer, int i, int j)
            {
                for (mediaplayer = errorListeners.iterator(); mediaplayer.hasNext(); ((VideoErrorListener)mediaplayer.next()).onVideoError(SessionMVideoView.this, i, j)) { }
                return false;
            }

            
            {
                this$0 = SessionMVideoView.this;
                super();
            }
        });
    }

    private void addProgressTask()
    {
        if (progressTimer != null)
        {
            return;
        }
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "add video progress timer.");
        }
        progressTask = new VideoProgressTask();
        progressTimer = new Timer();
        progressTimer.scheduleAtFixedRate(progressTask, 100L, 1000L);
    }

    private void checkProgress()
    {
        if (isPlaying())
        {
            addProgressTask();
            return;
        } else
        {
            removeProgressTask();
            return;
        }
    }

    private void removeProgressTask()
    {
        if (progressTimer == null)
        {
            return;
        }
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "remove video progress timer.");
        }
        if (progressTask != null)
        {
            progressTask.cancel();
            progressTask = null;
        }
        progressTimer.purge();
        progressTimer = null;
    }

    public void addErrorListener(VideoErrorListener videoerrorlistener)
    {
        if (videoerrorlistener != null && !errorListeners.contains(videoerrorlistener))
        {
            errorListeners.add(videoerrorlistener);
        }
    }

    public void addProgressListener(VideoProgressListener videoprogresslistener)
    {
        if (videoprogresslistener != null && !progressListeners.contains(videoprogresslistener))
        {
            progressListeners.add(videoprogresslistener);
        }
    }

    void enableSeek(boolean flag)
    {
        enableSeek = flag;
    }

    public String getUrl()
    {
        return urlString;
    }

    public void pause()
    {
        super.pause();
        checkProgress();
    }

    public void seekTo(int i)
    {
        if (enableSeek)
        {
            super.seekTo(i);
        }
    }

    public void setUrl(String s)
    {
        urlString = s;
        b b1 = Session.D().av();
        if (b1 != null && b1.b(s))
        {
            addErrorListener(b1);
            if (Log.isLoggable("SessionM.Video", 3))
            {
                Log.d("SessionM.Video", "Playing video from local file.");
            }
            setVideoURI(b1.c(s));
            return;
        } else
        {
            setVideoURI(Uri.parse(s));
            return;
        }
    }

    public void start()
    {
        super.start();
        if (isPlaying())
        {
            Iterator iterator = progressListeners.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                VideoProgressListener videoprogresslistener = (VideoProgressListener)iterator.next();
                if (videoprogresslistener != null)
                {
                    videoprogresslistener.onVideoStarted(this);
                }
            } while (true);
        }
        checkProgress();
    }



}
