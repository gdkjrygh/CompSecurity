// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.sessionm.b.a;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.ui:
//            VideoErrorListener, VideoProgressListener, SessionMVideoView

public class HTML5InlineVideoJSInterface
    implements VideoErrorListener, VideoProgressListener
{
    private class VideoProgressTask extends TimerTask
    {

        final HTML5InlineVideoJSInterface this$0;

        public void run()
        {
            checkProgress();
        }

        private VideoProgressTask()
        {
            this$0 = HTML5InlineVideoJSInterface.this;
            super();
        }

    }

    public static final class VideoState extends Enum
    {

        private static final VideoState $VALUES[];
        public static final VideoState COMPLETE;
        public static final VideoState ERROR;
        public static final VideoState IDLE;
        public static final VideoState INITIALIZED;
        public static final VideoState PAUSED;
        public static final VideoState PREPARED;
        public static final VideoState STARTED;
        public static final VideoState STOPPED;

        public static VideoState valueOf(String s)
        {
            return (VideoState)Enum.valueOf(com/sessionm/ui/HTML5InlineVideoJSInterface$VideoState, s);
        }

        public static VideoState[] values()
        {
            return (VideoState[])$VALUES.clone();
        }

        static 
        {
            IDLE = new VideoState("IDLE", 0);
            INITIALIZED = new VideoState("INITIALIZED", 1);
            PREPARED = new VideoState("PREPARED", 2);
            STARTED = new VideoState("STARTED", 3);
            STOPPED = new VideoState("STOPPED", 4);
            PAUSED = new VideoState("PAUSED", 5);
            COMPLETE = new VideoState("COMPLETE", 6);
            ERROR = new VideoState("ERROR", 7);
            $VALUES = (new VideoState[] {
                IDLE, INITIALIZED, PREPARED, STARTED, STOPPED, PAUSED, COMPLETE, ERROR
            });
        }

        private VideoState(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface VideoStateListener
    {

        public abstract void onVideoStateChanged(VideoState videostate);
    }


    private static final String TAG = "SessionM.Video";
    private static String testURL = null;
    private static String testVideoUrl = null;
    private VideoStateListener listener;
    private Activity mActivity;
    private String mEventCallback;
    private android.widget.RelativeLayout.LayoutParams mLayoutParams;
    private boolean mPlaying;
    private TimerTask mProgressTask;
    private Timer mProgressTimer;
    private int mVideoErrorExtra;
    private int mVideoErrorWhat;
    private SessionMVideoView mVideoView;
    private WebView mWebView;
    private VideoState videoState;

    public HTML5InlineVideoJSInterface(Activity activity, WebView webview)
    {
        mPlaying = false;
        mVideoErrorWhat = 0;
        mVideoErrorExtra = 0;
        mActivity = activity;
        mWebView = webview;
        setVideoState(VideoState.IDLE);
    }

    private void addProgressTask()
    {
        mProgressTask = new VideoProgressTask();
        mProgressTimer.scheduleAtFixedRate(mProgressTask, 100L, 1000L);
    }

    private void checkProgress()
    {
        this;
        JVM INSTR monitorenter ;
        Timer timer = mProgressTimer;
        if (timer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!playing()) goto _L4; else goto _L3
_L3:
        if (mProgressTask == null)
        {
            addProgressTask();
        }
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L4:
        if (mProgressTask == null && !mVideoView.isPlaying()) goto _L1; else goto _L5
_L5:
        removeProgressTask();
          goto _L1
    }

    private int convertDpToPixels(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        float f = mActivity.getResources().getDisplayMetrics().density;
        i = (int)(f * (float)i + 0.5F);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private int convertPixelsToDp(int i)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        Activity activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return j;
_L2:
        if (mActivity.getResources().getDisplayMetrics().density == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f = i;
        float f1 = mActivity.getResources().getDisplayMetrics().density;
        j = (int)(f / f1 + 0.5F);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static String getTestVideoUrl()
    {
        return testVideoUrl;
    }

    private void notifyContentAboutError(String s, int i, int j)
    {
        if (mActivity == null || mWebView == null)
        {
            return;
        } else
        {
            a a1 = a.aJ();
            a1.put("code", ActivityController.ContentError.ANDROID_VIDEO_ERROR.getCode());
            a1.put("message", ActivityController.ContentError.ANDROID_VIDEO_ERROR.toString());
            a1.put("url", s);
            a1.put("what", i);
            a1.put("extra", j);
            s = new Runnable() {

                final HTML5InlineVideoJSInterface this$0;
                final String val$jsString;

                public void run()
                {
                    synchronized (HTML5InlineVideoJSInterface.this)
                    {
                        if (mWebView != null)
                        {
                            mWebView.loadUrl(jsString);
                        }
                    }
                    return;
                    exception;
                    html5inlinevideojsinterface;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                jsString = s;
                super();
            }
            };
            mActivity.runOnUiThread(s);
            return;
        }
    }

    private void notifyWebView(final String name)
    {
        this;
        JVM INSTR monitorenter ;
        if (mActivity == null) goto _L2; else goto _L1
_L1:
        WebView webview = mWebView;
        if (webview != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        name = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;
            final String val$name;

            public void run()
            {
                synchronized (HTML5InlineVideoJSInterface.this)
                {
                    if (mWebView != null)
                    {
                        mWebView.loadUrl((new StringBuilder()).append("javascript:").append(mEventCallback).append("(\"").append(name).append("\")").toString());
                    }
                }
                return;
                exception;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                name = s;
                super();
            }
        };
        mActivity.runOnUiThread(name);
        if (true) goto _L2; else goto _L4
_L4:
        name;
        throw name;
    }

    private void pauseVideo()
    {
        while (!ready() || !mVideoView.isPlaying()) 
        {
            return;
        }
        mVideoView.pause();
        checkProgress();
    }

    private void playVideo()
    {
        if (ready())
        {
            mVideoView.start();
            setVideoState(VideoState.STARTED);
            checkProgress();
        }
    }

    private void removeProgressTask()
    {
        mProgressTask.cancel();
        mProgressTask = null;
        mProgressTimer.purge();
    }

    public static void setTestURL(String s)
    {
        testURL = s;
    }

    public static void setTestVideoUrl(String s)
    {
        testVideoUrl = s;
    }

    private void setVideoState(VideoState videostate)
    {
        if (videoState != VideoState.ERROR) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "Video is an error state and cannot transition.");
        }
_L4:
        return;
_L2:
        if (videostate != VideoState.IDLE || videoState == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("SessionM.Video", 6))
        {
            Log.e("SessionM.Video", String.format("Invalid State transition: %s", new Object[] {
                videostate
            }));
        }
_L5:
        videoState = videostate;
        if (listener != null)
        {
            listener.onVideoStateChanged(videoState);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (videostate == VideoState.INITIALIZED && videoState != VideoState.IDLE)
        {
            if (Log.isLoggable("SessionM.Video", 6))
            {
                Log.e("SessionM.Video", String.format("Invalid State transition: %s", new Object[] {
                    videostate
                }));
            }
        } else
        if (videostate == VideoState.PREPARED && videoState != VideoState.INITIALIZED)
        {
            if (Log.isLoggable("SessionM.Video", 6))
            {
                Log.e("SessionM.Video", String.format("Invalid State transition: %s", new Object[] {
                    videostate
                }));
            }
        } else
        if (videostate == VideoState.COMPLETE && videoState != VideoState.STARTED)
        {
            if (Log.isLoggable("SessionM.Video", 6))
            {
                Log.e("SessionM.Video", String.format("Invalid State transition: %s", new Object[] {
                    videostate
                }));
            }
        } else
        if (videostate == VideoState.PAUSED && videoState != VideoState.STARTED)
        {
            if (Log.isLoggable("SessionM.Video", 6))
            {
                Log.e("SessionM.Video", String.format("Invalid State transition: %s", new Object[] {
                    videostate
                }));
            }
        } else
        if (videostate == VideoState.STOPPED && Log.isLoggable("SessionM.Video", 6))
        {
            Log.e("SessionM.Video", String.format("Invalid State transition: %s", new Object[] {
                videostate
            }));
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void setupInternal(String s, int i, int j, int k, int l, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mVideoView != null)
        {
            if (Log.isLoggable("SessionM.Video", 3))
            {
                Log.d("SessionM.Video", String.format(Locale.US, "removing existing video %s", new Object[] {
                    mVideoView.getUrl()
                }));
            }
            dismiss();
        }
        if (mWebView != null && mActivity != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM.Video", 6))
        {
            Log.e("SessionM.Video", "Setup called with null webView or activity. Was it destroyed? Ignoring...");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (videoState != VideoState.IDLE)
        {
            dismiss();
            videoState = VideoState.IDLE;
        }
        if (testURL != null)
        {
            s = testURL;
        }
        if (testVideoUrl != null)
        {
            if (Log.isLoggable("SessionM.Video", 3))
            {
                Log.d("SessionM.Video", String.format(Locale.US, "override video with test url: %s", new Object[] {
                    testVideoUrl
                }));
            }
            s = testVideoUrl;
        }
        mEventCallback = s1;
        mLayoutParams = new android.widget.RelativeLayout.LayoutParams(convertDpToPixels(k), convertDpToPixels(l));
        mLayoutParams.leftMargin = convertDpToPixels(i);
        mLayoutParams.topMargin = convertDpToPixels(j);
        mVideoView = new SessionMVideoView(mActivity);
        mVideoView.enableSeek(true);
        mVideoView.addErrorListener(this);
        mVideoView.addProgressListener(this);
        mVideoView.setZOrderMediaOverlay(true);
        mVideoView.setZOrderOnTop(true);
        mVideoView.setLayoutParams(mLayoutParams);
        mVideoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final HTML5InlineVideoJSInterface this$0;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                synchronized (HTML5InlineVideoJSInterface.this)
                {
                    if (Log.isLoggable("SessionM.Video", 3))
                    {
                        Log.d("SessionM.Video", "video is ready for playback");
                    }
                    setVideoState(VideoState.PREPARED);
                    notifyWebView("ready");
                    if (mPlaying)
                    {
                        show();
                        playVideo();
                    }
                }
                return;
                exception;
                mediaplayer;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                super();
            }
        });
        mProgressTimer = new Timer();
        ((ViewGroup)mWebView.getParent()).addView(mVideoView);
        mVideoView.setUrl(s);
        setVideoState(VideoState.INITIALIZED);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public int currentTime()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ready()) goto _L2; else goto _L1
_L1:
        int i = mVideoView.getCurrentPosition();
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        dismiss();
        mVideoView = null;
        mActivity = null;
        mWebView = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void dismiss()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "dismiss video called");
        }
        mPlaying = false;
        if (mVideoView == null) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        if (getVideoState() != VideoState.ERROR && mVideoView.isPlaying())
        {
            mVideoView.stopPlayback();
        }
        viewgroup = (ViewGroup)mVideoView.getParent();
        if (viewgroup == null) goto _L4; else goto _L3
_L3:
        viewgroup.removeView(mVideoView);
_L6:
        mVideoView = null;
_L2:
        if (mProgressTask != null)
        {
            mProgressTask.cancel();
            mProgressTask = null;
        }
        if (mProgressTimer != null)
        {
            mProgressTimer.cancel();
            mProgressTimer = null;
        }
        mLayoutParams = null;
        mEventCallback = null;
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!Log.isLoggable("SessionM.Video", 5)) goto _L6; else goto _L5
_L5:
        Log.w("SessionM.Video", "video view had no parent?");
          goto _L6
        Exception exception;
        exception;
        throw exception;
    }

    public int duration()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ready()) goto _L2; else goto _L1
_L1:
        int i = mVideoView.getDuration();
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void finalize()
    {
        super.finalize();
_L2:
        destroy();
        return;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM.Video", 6))
        {
            Log.e("SessionM.Video", (new StringBuilder()).append("Finalize error: ").append(throwable).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int getHeight()
    {
        this;
        JVM INSTR monitorenter ;
        SessionMVideoView sessionmvideoview = mVideoView;
        if (sessionmvideoview != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = convertPixelsToDp(mVideoView.getHeight());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public VideoState getVideoState()
    {
        return videoState;
    }

    public int getWidth()
    {
        this;
        JVM INSTR monitorenter ;
        SessionMVideoView sessionmvideoview = mVideoView;
        if (sessionmvideoview != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = convertPixelsToDp(mVideoView.getWidth());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int getX()
    {
        this;
        JVM INSTR monitorenter ;
        SessionMVideoView sessionmvideoview = mVideoView;
        if (sessionmvideoview != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = convertPixelsToDp(mVideoView.getLeft());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int getY()
    {
        this;
        JVM INSTR monitorenter ;
        SessionMVideoView sessionmvideoview = mVideoView;
        if (sessionmvideoview != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = convertPixelsToDp(mVideoView.getTop());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void hide()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", String.format(Locale.US, "hide video called", new Object[0]));
        }
        activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mActivity.runOnUiThread(new Runnable() {

            final HTML5InlineVideoJSInterface this$0;

            public void run()
            {
                synchronized (HTML5InlineVideoJSInterface.this)
                {
                    if (mVideoView != null)
                    {
                        mVideoView.setVisibility(8);
                    }
                }
                return;
                exception1;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                super();
            }
        });
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void move(final int x, final int y)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", String.format("moving video x: %d y: %d", new Object[] {
                Integer.valueOf(x), Integer.valueOf(y)
            }));
        }
        Runnable runnable = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;
            final int val$x;
            final int val$y;

            public void run()
            {
label0:
                {
                    synchronized (HTML5InlineVideoJSInterface.this)
                    {
                        if (mVideoView != null)
                        {
                            break label0;
                        }
                        if (Log.isLoggable("SessionM.Video", 5))
                        {
                            Log.w("SessionM.Video", "trying to move video view before it is initialized");
                        }
                    }
                    return;
                }
                mLayoutParams.leftMargin = convertDpToPixels(x);
                mLayoutParams.topMargin = convertDpToPixels(y);
                mVideoView.setLayoutParams(mLayoutParams);
                if (Log.isLoggable("SessionM.Video", 3))
                {
                    Log.i("SessionM.Video", (new StringBuilder()).append("video is playing: ").append(mPlaying).append(" video state: ").append(getVideoState()).append(" x: ").append(x).append(" y: ").append(y).toString());
                }
                if (x >= 0 && y >= 0)
                {
                    break MISSING_BLOCK_LABEL_223;
                }
                setVideoState(VideoState.ERROR);
                notifyWebView("error");
                remove();
_L1:
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                return;
                exception1;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception1;
                notifyWebView("moved");
                  goto _L1
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                x = i;
                y = j;
                super();
            }
        };
        mActivity.runOnUiThread(runnable);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onVideoCompleted(SessionMVideoView sessionmvideoview)
    {
        this;
        JVM INSTR monitorenter ;
        notifyWebView("complete");
        setVideoState(VideoState.COMPLETE);
        this;
        JVM INSTR monitorexit ;
        return;
        sessionmvideoview;
        throw sessionmvideoview;
    }

    public boolean onVideoError(SessionMVideoView sessionmvideoview, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", String.format(Locale.US, "video error, what: %d extra: %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
        mVideoErrorWhat = i;
        mVideoErrorExtra = j;
        setVideoState(VideoState.ERROR);
        notifyContentAboutError(mVideoView.getUrl(), i, j);
        remove();
        this;
        JVM INSTR monitorexit ;
        return false;
        sessionmvideoview;
        throw sessionmvideoview;
    }

    public void onVideoProgress(SessionMVideoView sessionmvideoview, int i)
    {
        this;
        JVM INSTR monitorenter ;
        notifyWebView("timeupdate");
        this;
        JVM INSTR monitorexit ;
        return;
        sessionmvideoview;
        throw sessionmvideoview;
    }

    public void onVideoStarted(SessionMVideoView sessionmvideoview)
    {
    }

    public void pause()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "pause video");
        }
        if (mActivity == null) goto _L2; else goto _L1
_L1:
        SessionMVideoView sessionmvideoview = mVideoView;
        if (sessionmvideoview != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        mPlaying = false;
        Runnable runnable = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;

            public void run()
            {
label0:
                {
                    synchronized (HTML5InlineVideoJSInterface.this)
                    {
                        VideoState videostate = getVideoState();
                        if (videostate != VideoState.IDLE && videostate != VideoState.INITIALIZED && videostate != VideoState.STOPPED && videostate != VideoState.ERROR)
                        {
                            break label0;
                        }
                        if (Log.isLoggable("SessionM.Video", 5))
                        {
                            Log.w("SessionM.Video", "trying to pause video before video is read for playback");
                        }
                    }
                    return;
                }
                pauseVideo();
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                return;
                exception1;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                super();
            }
        };
        mActivity.runOnUiThread(runnable);
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public int percentageComplete()
    {
        int i = 100;
        this;
        JVM INSTR monitorenter ;
        if (getVideoState() == VideoState.ERROR || mVideoView == null || mVideoView.getDuration() <= 0) goto _L2; else goto _L1
_L1:
        int j = mVideoView.getCurrentPosition();
        if (j > 0) goto _L3; else goto _L2
_L2:
        i = 0;
_L5:
        this;
        JVM INSTR monitorexit ;
        return i;
_L3:
        double d;
        d = mVideoView.getCurrentPosition();
        j = mVideoView.getDuration();
        j = (int)((100D * d) / (double)j);
        if (j <= 100)
        {
            i = j;
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void play()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "play video");
        }
        activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mPlaying = true;
        Runnable runnable = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;

            public void run()
            {
label0:
                {
                    synchronized (HTML5InlineVideoJSInterface.this)
                    {
                        if (ready())
                        {
                            break label0;
                        }
                        if (Log.isLoggable("SessionM.Video", 5))
                        {
                            Log.w("SessionM.Video", "trying to play video before video is ready for playback");
                        }
                    }
                    return;
                }
                playVideo();
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                return;
                exception1;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                super();
            }
        };
        mActivity.runOnUiThread(runnable);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean playing()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ready()) goto _L2; else goto _L1
_L1:
        boolean flag = mVideoView.isPlaying();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean ready()
    {
        this;
        JVM INSTR monitorenter ;
        VideoState videostate = getVideoState();
        if (mVideoView == null || videostate == VideoState.ERROR || videostate == VideoState.IDLE) goto _L2; else goto _L1
_L1:
        VideoState videostate1 = VideoState.INITIALIZED;
        if (videostate == videostate1) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void remove()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "remove video");
        }
        activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Runnable runnable = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;

            public void run()
            {
                dismiss();
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                super();
            }
        };
        mActivity.runOnUiThread(runnable);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void resize(final int width, final int height)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", String.format("resizing video width: %d height: %d", new Object[] {
                Integer.valueOf(width), Integer.valueOf(height)
            }));
        }
        Runnable runnable = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;
            final int val$height;
            final int val$width;

            public void run()
            {
label0:
                {
                    synchronized (HTML5InlineVideoJSInterface.this)
                    {
                        if (mVideoView != null)
                        {
                            break label0;
                        }
                        if (Log.isLoggable("SessionM.Video", 5))
                        {
                            Log.w("SessionM.Video", "trying to move video view before it is initialized");
                        }
                    }
                    return;
                }
                if (height >= 0 && width >= 0)
                {
                    break MISSING_BLOCK_LABEL_85;
                }
                setVideoState(VideoState.ERROR);
                notifyWebView("error");
                remove();
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                return;
                exception1;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception1;
                mLayoutParams.width = convertDpToPixels(width);
                mLayoutParams.height = convertDpToPixels(height);
                mVideoView.setLayoutParams(mLayoutParams);
                notifyWebView("moved");
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                height = i;
                width = j;
                super();
            }
        };
        mActivity.runOnUiThread(runnable);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void seek(final int msec)
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "seeking video");
        }
        activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Runnable runnable = new Runnable() {

            final HTML5InlineVideoJSInterface this$0;
            final int val$msec;

            public void run()
            {
label0:
                {
                    synchronized (HTML5InlineVideoJSInterface.this)
                    {
                        obj = getVideoState();
                        if (obj != VideoState.IDLE && obj != VideoState.INITIALIZED && obj != VideoState.STOPPED && obj != VideoState.ERROR)
                        {
                            break label0;
                        }
                        if (Log.isLoggable("SessionM.Video", 5))
                        {
                            Log.w("SessionM.Video", "trying to seek before video is ready for playback");
                        }
                    }
                    return;
                }
                if (mVideoView == null) goto _L2; else goto _L1
_L1:
                mVideoView.seekTo(msec);
                notifyWebView("seeking");
_L4:
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                return;
                obj;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw obj;
_L2:
                if (!Log.isLoggable("SessionM.Video", 5)) goto _L4; else goto _L3
_L3:
                Log.w("SessionM.Video", String.format("Attempting to seek without a video view available state: %s", new Object[] {
                    obj
                }));
                  goto _L4
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                msec = i;
                super();
            }
        };
        mActivity.runOnUiThread(runnable);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setVideoStateListener(VideoStateListener videostatelistener)
    {
        listener = videostatelistener;
    }

    public void setup(final String url, final int x, final int y, final int width, final int height, final String eventCallback)
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", String.format(Locale.US, "video setup for %s", new Object[] {
                url
            }));
        }
        activity = mActivity;
        if (activity != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mActivity.runOnUiThread(new Runnable() {

            final HTML5InlineVideoJSInterface this$0;
            final String val$eventCallback;
            final int val$height;
            final String val$url;
            final int val$width;
            final int val$x;
            final int val$y;

            public void run()
            {
                setupInternal(url, x, y, width, height, eventCallback);
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                url = s;
                x = i;
                y = j;
                width = k;
                height = l;
                eventCallback = s1;
                super();
            }
        });
        if (true) goto _L1; else goto _L3
_L3:
        url;
        throw url;
    }

    public void show()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "show video");
        }
        if (mActivity != null || !ready()) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.d("SessionM.Video", "Video show called before video was prepared.");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mActivity.runOnUiThread(new Runnable() {

            final HTML5InlineVideoJSInterface this$0;

            public void run()
            {
                synchronized (HTML5InlineVideoJSInterface.this)
                {
                    if (mVideoView != null)
                    {
                        mVideoView.setVisibility(0);
                    }
                }
                return;
                exception1;
                html5inlinevideojsinterface;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = HTML5InlineVideoJSInterface.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int videoErrorExtra()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mVideoErrorExtra;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int videoErrorWhat()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mVideoErrorWhat;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }













}
