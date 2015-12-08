// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import com.sessionm.core.Session;

// Referenced classes of package com.sessionm.ui:
//            VideoProgressListener, SessionMVideoView, VideoErrorListener

public class SessionMVideoActivity extends Activity
    implements VideoProgressListener
{

    protected static final String MRAID_VIDEO_URL = "mraid_video_url";
    private static final String TAG = "SessionM.Video";
    private static VideoErrorListener errorListener;
    private static VideoProgressListener progressListener;
    private SessionMVideoView videoView;

    public SessionMVideoActivity()
    {
    }

    private static Intent createIntent(Context context, String s)
    {
        context = new Intent(context, com/sessionm/ui/SessionMVideoActivity);
        context.putExtra("mraid_video_url", s);
        return context;
    }

    public static void setErrorListener(VideoErrorListener videoerrorlistener)
    {
        errorListener = videoerrorlistener;
    }

    public static void setProgressListener(VideoProgressListener videoprogresslistener)
    {
        progressListener = videoprogresslistener;
    }

    public static boolean start(Context context, String s)
    {
        s = createIntent(context, s);
        try
        {
            context.startActivity(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("SessionM.Video", 6))
            {
                Log.e("SessionM.Video", "Activity SessionMVideoActivity not found. Did you declare it in your AndroidManifest.xml?");
            }
            return false;
        }
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        bundle = new RelativeLayout(this);
        videoView = new SessionMVideoView(this);
        videoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final SessionMVideoActivity this$0;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                videoView.start();
            }

            
            {
                this$0 = SessionMVideoActivity.this;
                super();
            }
        });
        videoView.addProgressListener(Session.D().L());
        videoView.addErrorListener(Session.D().L());
        videoView.addProgressListener(this);
        videoView.addProgressListener(progressListener);
        videoView.addErrorListener(errorListener);
        Object obj = new MediaController(this);
        ((MediaController) (obj)).setAnchorView(videoView);
        videoView.setMediaController(((MediaController) (obj)));
        ((MediaController) (obj)).findViewById(getResources().getIdentifier("mediacontroller_progress", "id", "android")).setVisibility(4);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
        bundle.addView(videoView, ((android.view.ViewGroup.LayoutParams) (obj)));
        setContentView(bundle);
        bundle = getIntent().getStringExtra("mraid_video_url");
        videoView.setUrl(bundle);
    }

    public void onVideoCompleted(SessionMVideoView sessionmvideoview)
    {
        finish();
    }

    public void onVideoProgress(SessionMVideoView sessionmvideoview, int i)
    {
    }

    public void onVideoStarted(SessionMVideoView sessionmvideoview)
    {
    }

}
