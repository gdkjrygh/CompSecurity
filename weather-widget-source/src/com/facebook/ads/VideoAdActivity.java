// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.facebook.ads.a.a.b;
import com.facebook.ads.a.a.c;
import com.facebook.ads.a.y;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.ads:
//            InterstitialAdActivity

public class VideoAdActivity extends Activity
{

    private static final long CONTROLS_FADE_DELAY = 3000L;
    public static final String MARKET_URI_INTENT_EXTRA = "adMarketUri";
    public static final String URI_INTENT_EXTRA = "adUri";
    public static final String VIDEO_PATH_INTENT_EXTRA = "adVideoPath";
    private List mAllControls;
    private List mBufferingView;
    private ImageButton mCloseButton;
    private int mCurrentPosition;
    private List mEndControls;
    private List mFullPlayingControls;
    private boolean mGoToAppStore;
    private Handler mHandler;
    private ImageButton mInstallButton;
    private boolean mIsMuted;
    private MediaPlayer mMediaPlayer;
    private List mMinPlayingControls;
    private ImageButton mMuteButton;
    private List mPausedControls;
    private View mRootView;
    private ImageButton mSkipButton;
    private a mState;
    private long mTimeOfLastTouch;
    private VideoView mVideoView;
    private Uri marketUri;
    private String path;
    private RelativeLayout relativeLayout;
    private String uniqueId;
    private Uri uri;

    public VideoAdActivity()
    {
        mIsMuted = false;
        mCurrentPosition = -1;
        mHandler = new Handler();
        mGoToAppStore = false;
    }

    private void activateControlSet(List list)
    {
        for (Iterator iterator = mAllControls.iterator(); iterator.hasNext();)
        {
            ImageButton imagebutton = (ImageButton)iterator.next();
            if (list.contains(imagebutton))
            {
                imagebutton.setVisibility(0);
            } else
            {
                imagebutton.setVisibility(8);
            }
        }

    }

    private void bindModel()
    {
        setState(a.a);
        mInstallButton.setBackground(getResources().getDrawable(0x1080081));
        mSkipButton.setBackground(getResources().getDrawable(0x1080041));
        mMuteButton.setBackground(getResources().getDrawable(0x1080032));
        mCloseButton.setBackground(getResources().getDrawable(0x1080038));
        mVideoView.setVideoPath(path);
    }

    private void configureLayout()
    {
        relativeLayout.addView(mRootView);
        relativeLayout.addView(mInstallButton);
        relativeLayout.addView(mSkipButton);
        relativeLayout.addView(mMuteButton);
        relativeLayout.addView(mCloseButton);
    }

    private void configureViews()
    {
        mAllControls = Arrays.asList(new ImageButton[] {
            mInstallButton, mMuteButton, mCloseButton, mSkipButton
        });
        mFullPlayingControls = Arrays.asList(new ImageButton[] {
            mInstallButton, mMuteButton, mCloseButton, mSkipButton
        });
        mMinPlayingControls = Arrays.asList(new ImageButton[] {
            mCloseButton, mInstallButton, mSkipButton
        });
        mPausedControls = Arrays.asList(new ImageButton[] {
            mInstallButton, mMuteButton, mCloseButton, mSkipButton
        });
        mEndControls = Arrays.asList(new ImageButton[] {
            mInstallButton, mMuteButton, mCloseButton, mSkipButton
        });
        mBufferingView = Arrays.asList(new ImageButton[] {
            mInstallButton, mCloseButton, mSkipButton
        });
        _cls5 _lcls5 = new _cls5();
        mInstallButton.setOnTouchListener(_lcls5);
        mSkipButton.setOnTouchListener(_lcls5);
        mMuteButton.setOnTouchListener(_lcls5);
        mCloseButton.setOnTouchListener(_lcls5);
        mInstallButton.setOnClickListener(new _cls6());
        mSkipButton.setOnClickListener(new _cls7());
        mMuteButton.setOnClickListener(new _cls8());
        mCloseButton.setOnClickListener(new _cls9());
        mRootView.setOnTouchListener(new _cls10());
        mVideoView.setOnPreparedListener(new _cls11());
        mVideoView.setOnCompletionListener(new _cls12());
        mVideoView.setOnTouchListener(new _cls2());
    }

    private void displayInterstitial()
    {
        Intent intent = new Intent(this, com/facebook/ads/InterstitialAdActivity);
        Display display = ((WindowManager)getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        intent.putExtra("displayRotation", display.getRotation());
        intent.putExtra("displayWidth", displaymetrics.widthPixels);
        intent.putExtra("displayHeight", displaymetrics.heightPixels);
        intent.putExtra("adInterstitialUniqueId", uniqueId);
        y.b(getIntent()).a(intent);
        startActivity(intent);
        finish();
    }

    private void getIntentExtras()
    {
        Bundle bundle = getIntent().getExtras();
        uri = Uri.parse(bundle.getString("adUri"));
        marketUri = Uri.parse(bundle.getString("adMarketUri"));
        path = bundle.getString("adVideoPath");
        uniqueId = bundle.getString("adInterstitialUniqueId");
    }

    private void pulseControlsFromTouch()
    {
        mTimeOfLastTouch = System.currentTimeMillis();
        updateControlState();
        mHandler.removeCallbacksAndMessages(null);
        mHandler.postDelayed(new _cls3(), 3000L);
    }

    private void setButtonPosition()
    {
        mInstallButton.setX(270F);
        mInstallButton.setY(1400F);
        mSkipButton.setX(700F);
        mSkipButton.setY(1400F);
        mMuteButton.setX(10F);
        mMuteButton.setY(1160F);
        mCloseButton.setX(970F);
        mInstallButton.setScaleX(1.5F);
        mInstallButton.setScaleY(1.5F);
        mSkipButton.setScaleX(1.5F);
        mSkipButton.setScaleY(1.5F);
    }

    private void setState(a a1)
    {
        if (a1 != mState)
        {
            mState = a1;
            pulseControlsFromTouch();
        }
    }

    private void updateControlState()
    {
        mInstallButton.setAlpha(1.0F);
        mSkipButton.setAlpha(1.0F);
        mCloseButton.setAlpha(1.0F);
        mVideoView.setAlpha(1.0F);
        switch (_cls4.a[mState.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (System.currentTimeMillis() - mTimeOfLastTouch >= 3000L)
            {
                activateControlSet(mMinPlayingControls);
                mInstallButton.setAlpha(0.5F);
                mSkipButton.setAlpha(0.5F);
                mCloseButton.setAlpha(0.5F);
                return;
            } else
            {
                activateControlSet(mFullPlayingControls);
                return;
            }

        case 2: // '\002'
            activateControlSet(mPausedControls);
            return;

        case 3: // '\003'
            activateControlSet(mBufferingView);
            return;

        case 4: // '\004'
            activateControlSet(mBufferingView);
            return;

        case 5: // '\005'
            activateControlSet(mEndControls);
            mMediaPlayer.seekTo((int)((float)mMediaPlayer.getDuration() * 0.75F));
            mVideoView.setAlpha(1.0F);
            return;
        }
    }

    private void updateVideoPlayerSize()
    {
        if (mMediaPlayer != null)
        {
            float f = Math.min((float)mRootView.getWidth() / (float)mMediaPlayer.getVideoWidth(), (float)mRootView.getHeight() / (float)mMediaPlayer.getVideoHeight());
            int i = (int)((float)mMediaPlayer.getVideoWidth() * f);
            int j = (int)(f * (float)mMediaPlayer.getVideoHeight());
            mVideoView.getHolder().setFixedSize(i, j);
            mVideoView.requestLayout();
            mVideoView.invalidate();
        }
    }

    private void videoBackground()
    {
        if (mVideoView.isPlaying())
        {
            mCurrentPosition = mVideoView.getCurrentPosition();
        }
        mVideoView.pause();
        mHandler.removeCallbacksAndMessages(null);
        mMediaPlayer = null;
    }

    private void videoMute()
    {
        if (mState != a.a)
        {
            boolean flag;
            if (mIsMuted)
            {
                mMediaPlayer.setVolume(1.0F, 1.0F);
                mMuteButton.setBackground(getResources().getDrawable(0x1080032));
            } else
            {
                mMediaPlayer.setVolume(0.0F, 0.0F);
                mMuteButton.setBackground(getResources().getDrawable(0x1080031));
            }
            if (!mIsMuted)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mIsMuted = flag;
        }
    }

    private void videoPlay()
    {
        if (mState != a.a && mState != com.facebook.ads.a.c)
        {
            if (mState == a.e)
            {
                mVideoView.seekTo(0);
            }
            mVideoView.start();
            mCurrentPosition = mVideoView.getCurrentPosition();
            setState(com.facebook.ads.a.c);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mRootView.getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        relativeLayout = new RelativeLayout(this);
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        bundle.addRule(15);
        setContentView(relativeLayout, bundle);
        mVideoView = new VideoView(this);
        mVideoView.setLayoutParams(bundle);
        relativeLayout.addView(mVideoView);
        mRootView = new View(this);
        mInstallButton = new ImageButton(this);
        mSkipButton = new ImageButton(this);
        mMuteButton = new ImageButton(this);
        mCloseButton = new ImageButton(this);
        getIntentExtras();
        setVolumeControlStream(3);
        configureViews();
        bindModel();
        setButtonPosition();
        configureLayout();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (mGoToAppStore)
        {
            ((c)b.a(this, uri)).d();
        }
    }

    protected void onPause()
    {
        super.onPause();
        videoBackground();
    }

    protected void onResume()
    {
        super.onResume();
        if (mState == com.facebook.ads.a.c && !mVideoView.isPlaying())
        {
            mVideoView.seekTo(mCurrentPosition);
            mVideoView.start();
        }
        pulseControlsFromTouch();
    }

    protected void onStop()
    {
        super.onStop();
        videoBackground();
    }







/*
    static boolean access$202(VideoAdActivity videoadactivity, boolean flag)
    {
        videoadactivity.mGoToAppStore = flag;
        return flag;
    }

*/






/*
    static MediaPlayer access$602(VideoAdActivity videoadactivity, MediaPlayer mediaplayer)
    {
        videoadactivity.mMediaPlayer = mediaplayer;
        return mediaplayer;
    }

*/




    private class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/facebook/ads/VideoAdActivity$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("UNINITIALIZED", 0);
            b = new a("INITIALIZED", 1);
            c = new a("PLAYING", 2);
            d = new a("PAUSED", 3);
            e = new a("COMPLETED", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls5
        implements android.view.View.OnTouchListener
    {

        final VideoAdActivity a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
            view.setAlpha(0.5F);
_L4:
            return false;
_L2:
            if (motionevent.getAction() == 1)
            {
                view.setAlpha(1.0F);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls5()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final VideoAdActivity a;

        public void onClick(View view)
        {
            a.mGoToAppStore = true;
            a.finish();
        }

        _cls6()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final VideoAdActivity a;

        public void onClick(View view)
        {
            a.displayInterstitial();
        }

        _cls7()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final VideoAdActivity a;

        public void onClick(View view)
        {
            a.videoMute();
        }

        _cls8()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final VideoAdActivity a;

        public void onClick(View view)
        {
            a.finish();
        }

        _cls9()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls10
        implements android.view.View.OnTouchListener
    {

        final VideoAdActivity a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            a.pulseControlsFromTouch();
            return false;
        }

        _cls10()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls11
        implements android.media.MediaPlayer.OnPreparedListener
    {

        final VideoAdActivity a;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            a.mMediaPlayer = mediaplayer;
            if (a.mIsMuted)
            {
                a.mMediaPlayer.setVolume(0.0F, 0.0F);
            } else
            {
                a.mMediaPlayer.setVolume(1.0F, 1.0F);
            }
            a.updateVideoPlayerSize();
            if (a.mState == a.d || a.mState == a.e)
            {
                a.mMediaPlayer.seekTo(a.mCurrentPosition);
            } else
            {
                if (a.mState == com.facebook.ads.a.c)
                {
                    a.mMediaPlayer.seekTo(a.mCurrentPosition);
                    a.videoPlay();
                    return;
                }
                if (a.mState == a.a)
                {
                    a.setState(com.facebook.ads.a.b);
                    a.videoPlay();
                    return;
                }
            }
        }

        _cls11()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls12
        implements android.media.MediaPlayer.OnCompletionListener
    {

        final VideoAdActivity a;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            a.setState(a.e);
            a.displayInterstitial();
        }

        _cls12()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnTouchListener
    {

        final VideoAdActivity a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            a.pulseControlsFromTouch();
            return false;
        }

        _cls2()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final VideoAdActivity a;

        public void run()
        {
            a.updateControlState();
        }

        _cls3()
        {
            a = VideoAdActivity.this;
            super();
        }
    }


    private class _cls4
    {

        static final int a[];

        static 
        {
            a = new int[a.values().length];
            try
            {
                a[com.facebook.ads.a.c.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[a.d.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[a.a.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.facebook.ads.a.b.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final VideoAdActivity a;

        public void onGlobalLayout()
        {
            a.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            a.updateVideoPlayerSize();
        }

        _cls1()
        {
            a = VideoAdActivity.this;
            super();
        }
    }

}
