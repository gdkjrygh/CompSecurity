// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.animation.Animator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.exoplayer.util.PlayerControl;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerUtil;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;
import com.google.android.libraries.mediaframework.exoplayerextensions.ObservablePlayerControl;
import com.google.android.libraries.mediaframework.exoplayerextensions.PlayerControlCallback;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            Layer, LayerManager

public class PlaybackControlLayer
    implements Layer, PlayerControlCallback
{
    public static interface FullscreenCallback
    {

        public abstract void onGoToFullscreen();

        public abstract void onReturnFromFullscreen();
    }

    private static class MessageHandler extends Handler
    {

        private final WeakReference playbackControlLayer;

        public void handleMessage(Message message)
        {
            PlaybackControlLayer playbackcontrollayer = (PlaybackControlLayer)playbackControlLayer.get();
            if (playbackcontrollayer != null && playbackcontrollayer.getLayerManager().getControl() != null)
            {
                int i;
                switch (message.what)
                {
                default:
                    return;

                case 1: // '\001'
                    playbackcontrollayer.hide();
                    return;

                case 3: // '\003'
                    playbackcontrollayer.hideSystemUI();
                    return;

                case 2: // '\002'
                    i = playbackcontrollayer.updateProgress();
                    break;
                }
                if (!playbackcontrollayer.isSeekbarDragging && playbackcontrollayer.isVisible && playbackcontrollayer.getLayerManager().getControl().isPlaying())
                {
                    sendMessageDelayed(obtainMessage(2), 1000 - i % 1000);
                    return;
                }
            }
        }

        private MessageHandler(PlaybackControlLayer playbackcontrollayer)
        {
            playbackControlLayer = new WeakReference(playbackcontrollayer);
        }

    }

    public static interface ShouldBePlayingCallback
    {

        public abstract void onShouldBePlayingChanged();
    }


    public static final int DEFAULT_CHROME_COLOR = Color.argb(140, 0, 0, 0);
    public static final int DEFAULT_CONTROL_TINT_COLOR = 0;
    public static final int DEFAULT_TEXT_COLOR = -1;
    private static final int DEFAULT_TIMEOUT_MS = 2500;
    private static final int FADE_OUT = 1;
    private static final int FADE_OUT_DURATION_MS = 350;
    private static final int HIDE_SYSTEM_BARS = 3;
    private static final int SHOW_PROGRESS = 2;
    private static final String TAG = "PlaybackControlLayer";
    private static final int TIMEOUT_FOREVER = 0;
    private List actionButtons;
    private LinearLayout actionButtonsContainer;
    private View bottomChrome;
    private boolean canSeek;
    private int chromeColor;
    private int controlColor;
    private boolean controlUiDisabled;
    private TextView currentTime;
    private TextView endTime;
    private ImageButton fullscreenButton;
    private FullscreenCallback fullscreenCallback;
    private Handler handler;
    private boolean isFadingOut;
    private boolean isSeekbarDragging;
    private boolean isVisible;
    private LayerManager layerManager;
    private final boolean live;
    private Drawable logoDrawable;
    private ImageView logoImageView;
    private ImageButton pausePlayButton;
    private FrameLayout playbackControlRootView;
    private final String playerName;
    private SeekBar seekBar;
    private int seekbarColor;
    private boolean shouldBePlaying;
    private ShouldBePlayingCallback shouldBePlayingCallback;
    private int textColor;
    private StringBuilder timeFormat;
    private Formatter timeFormatter;
    private RelativeLayout topChrome;
    private String videoTitle;
    private TextView videoTitleView;

    public PlaybackControlLayer(String s, FullscreenCallback fullscreencallback, boolean flag, ShouldBePlayingCallback shouldbeplayingcallback, String s1, boolean flag1)
    {
        handler = new MessageHandler(this);
        playerName = s1;
        videoTitle = s;
        canSeek = true;
        fullscreenCallback = fullscreencallback;
        shouldBePlayingCallback = shouldbeplayingcallback;
        setShouldBePlaying(flag);
        actionButtons = new ArrayList();
        live = flag1;
    }

    private void doToggleFullscreen(boolean flag, boolean flag1)
    {
        if (controlUiDisabled)
        {
            return;
        }
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "doToggleFullscreen: player=%s, lockOrientation=%s, shouldBeFullscreen=%s", new Object[] {
            playerName, Boolean.valueOf(flag1), Boolean.valueOf(flag)
        });
        Activity activity = getLayerManager().getActivity();
        getLayerManager().getContainer();
        if (!flag)
        {
            if (fullscreenCallback != null)
            {
                fullscreenCallback.onReturnFromFullscreen();
            }
            if (flag1)
            {
                activity.setRequestedOrientation(1);
            }
            showSystemUI();
            setFullScreenButton(false);
            return;
        }
        if (fullscreenCallback != null)
        {
            fullscreenCallback.onGoToFullscreen();
        }
        if (flag1)
        {
            activity.setRequestedOrientation(0);
        }
        hideSystemUI();
        setFullScreenButton(true);
        activity.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {

            final PlaybackControlLayer this$0;

            public void onSystemUiVisibilityChange(int i)
            {
label0:
                {
                    LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "OnSystemUiVisibilityChangeListener: player=%s, visibility=%s, shouldBePlaying=%s, isPlaying=%s, isHidden=%s", new Object[] {
                        getLayerManager().getPlayerName(), Integer.valueOf(i), Boolean.valueOf(shouldBePlaying), Boolean.valueOf(layerManager.getControl().isPlaying()), Boolean.valueOf(layerManager.isHidden())
                    });
                    if (isLandscape() && (i & 4) == 0)
                    {
                        if (!layerManager.isHidden())
                        {
                            break label0;
                        }
                        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "OnSystemUiVisibilityChangeListener: player=%s, not visible, will hide system bars...", new Object[] {
                            getLayerManager().getPlayerName()
                        });
                        Message message = handler.obtainMessage(3);
                        handler.removeMessages(3);
                        handler.sendMessageDelayed(message, 2500L);
                    }
                    return;
                }
                LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "OnSystemUiVisibilityChangeListener: player=%s, visible, will show controls", new Object[] {
                    getLayerManager().getPlayerName()
                });
                show(2500);
            }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
        });
    }

    private void fadeOutControl(int i)
    {
        Message message = handler.obtainMessage(1);
        handler.removeMessages(1);
        if (i > 0)
        {
            handler.sendMessageDelayed(message, i);
        }
    }

    private void hidePlayPause()
    {
        pausePlayButton.setVisibility(8);
    }

    private void hideSystemUI()
    {
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "hideSystemUI: player=%s", new Object[] {
            playerName
        });
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            Window window = getLayerManager().getActivity().getWindow();
            if (window != null)
            {
                window.getDecorView().setSystemUiVisibility(4102);
            }
        }
    }

    private boolean isLive()
    {
        return live;
    }

    private void setFullScreenButton(boolean flag)
    {
        int i;
        if (isLive())
        {
            if (flag)
            {
                i = com.weather.commons.R.drawable.collapse;
            } else
            {
                i = com.weather.commons.R.drawable.expand;
            }
        } else
        if (flag)
        {
            i = com.weather.commons.R.drawable.ic_action_return_from_full_screen;
        } else
        {
            i = com.weather.commons.R.drawable.ic_action_full_screen;
        }
        fullscreenButton.setImageResource(i);
    }

    private boolean setShouldBePlaying(boolean flag)
    {
        boolean flag1 = shouldBePlaying;
        shouldBePlaying = flag;
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "setShouldBePlaying: player=%s, newShouldBePlaying=%s, oldShouldBePlaying=%s", new Object[] {
            playerName, Boolean.valueOf(flag), Boolean.valueOf(shouldBePlaying)
        });
        if (flag != flag1)
        {
            LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "setShouldBePlaying: player=%s, shouldBePlaying CHANGED to %s", new Object[] {
                playerName, Boolean.valueOf(flag)
            });
            if (shouldBePlayingCallback != null)
            {
                shouldBePlayingCallback.onShouldBePlayingChanged();
            }
        }
        return flag1;
    }

    private void setupAsLive()
    {
        playbackControlRootView.findViewById(com.weather.commons.R.id.bottom_chrome).setVisibility(8);
        playbackControlRootView.findViewById(com.weather.commons.R.id.bottom_chrome_live).setVisibility(0);
    }

    private void setupView()
    {
        pausePlayButton = (ImageButton)playbackControlRootView.findViewById(com.weather.commons.R.id.pause);
        if (isLive())
        {
            fullscreenButton = (ImageButton)playbackControlRootView.findViewById(com.weather.commons.R.id.fullscreen_live);
        } else
        {
            fullscreenButton = (ImageButton)playbackControlRootView.findViewById(com.weather.commons.R.id.fullscreen);
        }
        seekBar = (SeekBar)playbackControlRootView.findViewById(com.weather.commons.R.id.mediacontroller_progress);
        videoTitleView = (TextView)playbackControlRootView.findViewById(com.weather.commons.R.id.video_title);
        endTime = (TextView)playbackControlRootView.findViewById(com.weather.commons.R.id.time_duration);
        currentTime = (TextView)playbackControlRootView.findViewById(com.weather.commons.R.id.time_current);
        logoImageView = (ImageView)playbackControlRootView.findViewById(com.weather.commons.R.id.logo_image);
        topChrome = (RelativeLayout)playbackControlRootView.findViewById(com.weather.commons.R.id.top_chrome);
        bottomChrome = playbackControlRootView.findViewById(com.weather.commons.R.id.bottom_chrome);
        actionButtonsContainer = (LinearLayout)playbackControlRootView.findViewById(com.weather.commons.R.id.actions_container);
        if (isLive())
        {
            setupAsLive();
        }
        pausePlayButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PlaybackControlLayer this$0;

            public void onClick(View view)
            {
                show();
                togglePlayPause();
            }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
        });
        setFullScreenButton(isLandscape());
        fullscreenButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PlaybackControlLayer this$0;

            public void onClick(View view)
            {
                view = PlaybackControlLayer.this;
                boolean flag;
                if (!isLandscape())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.doToggleFullscreen(flag, true);
                show(2500);
                updateActionButtons();
                updateColors();
            }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
        });
        seekBar.setMax(1000);
        seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

            final PlaybackControlLayer this$0;

            public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
            {
                if (flag && canSeek)
                {
                    seekbar = getLayerManager().getControl();
                    long l = seekbar.getDuration();
                    l = ((long)i * l) / 1000L;
                    seekbar.seekTo((int)l);
                    if (currentTime != null)
                    {
                        currentTime.setText(stringForTime((int)l));
                        return;
                    }
                }
            }

            public void onStartTrackingTouch(SeekBar seekbar)
            {
                show(0);
                isSeekbarDragging = true;
                handler.removeMessages(2);
            }

            public void onStopTrackingTouch(SeekBar seekbar)
            {
                isSeekbarDragging = false;
                updateProgress();
                updatePlayPauseButton();
                show(2500);
                handler.sendEmptyMessage(2);
            }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
        });
        videoTitleView.setText(videoTitle);
        timeFormat = new StringBuilder();
        timeFormatter = new Formatter(timeFormat, Locale.getDefault());
    }

    private void showSystemUI()
    {
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "showSystemUI: player=%s", new Object[] {
            playerName
        });
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            Window window = getLayerManager().getActivity().getWindow();
            if (window != null)
            {
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
    }

    private void unhidePlayPause()
    {
        if (!isLive())
        {
            pausePlayButton.setVisibility(0);
        }
    }

    public void addActionButton(Activity activity, Drawable drawable, String s, android.view.View.OnClickListener onclicklistener)
    {
        ImageButton imagebutton = new ImageButton(activity);
        imagebutton.setContentDescription(s);
        imagebutton.setImageDrawable(drawable);
        imagebutton.setOnClickListener(onclicklistener);
        drawable = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int i = activity.getResources().getDisplayMetrics().densityDpi * 5;
        drawable.setMargins(i, 0, i, 0);
        imagebutton.setBackgroundColor(0);
        imagebutton.setLayoutParams(drawable);
        actionButtons.add(imagebutton);
        if (playbackControlRootView != null)
        {
            updateActionButtons();
            updateColors();
        }
    }

    public FrameLayout createView(LayerManager layermanager)
    {
        layerManager = layermanager;
        playbackControlRootView = (FrameLayout)layermanager.getActivity().getLayoutInflater().inflate(com.weather.commons.R.layout.playback_control_layer, null);
        setupView();
        textColor = -1;
        chromeColor = DEFAULT_CHROME_COLOR;
        controlColor = 0;
        seekbarColor = -1;
        if (logoDrawable != null)
        {
            logoImageView.setImageDrawable(logoDrawable);
        }
        layerManager.getControl().addCallback(this);
        layerManager.getContainer().setOnClickListener(new android.view.View.OnClickListener() {

            final PlaybackControlLayer this$0;

            public void onClick(View view)
            {
                LogUtil.v("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "container onClick: player=%s, isVisible=%s", new Object[] {
                    playerName, Boolean.valueOf(isVisible)
                });
                if (isVisible)
                {
                    hide();
                    return;
                } else
                {
                    show(2500);
                    return;
                }
            }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
        });
        playbackControlRootView.setVisibility(4);
        updateColors();
        return playbackControlRootView;
    }

    public void disableControlUi()
    {
        controlUiDisabled = true;
        playbackControlRootView.setVisibility(8);
        layerManager.getContainer().removeView(playbackControlRootView);
    }

    public void disableSeeking()
    {
        canSeek = false;
        if (playbackControlRootView != null)
        {
            updateColors();
        }
    }

    public void enableSeeking()
    {
        canSeek = true;
        if (playbackControlRootView != null)
        {
            updateColors();
        }
    }

    public LayerManager getLayerManager()
    {
        return layerManager;
    }

    public void hide()
    {
        if (!controlUiDisabled && !isFadingOut)
        {
            final FrameLayout container = getLayerManager().getContainer();
            if (container != null && isVisible)
            {
                isFadingOut = true;
                playbackControlRootView.animate().alpha(0.0F).setDuration(350L).setListener(new android.animation.Animator.AnimatorListener() {

                    private boolean cancelled;
                    final PlaybackControlLayer this$0;
                    final FrameLayout val$container;

                    public void onAnimationCancel(Animator animator)
                    {
                        cancelled = true;
                    }

                    public void onAnimationEnd(Animator animator)
                    {
                        isFadingOut = false;
                        if (!cancelled)
                        {
                            playbackControlRootView.setVisibility(4);
                            container.removeView(playbackControlRootView);
                            if (isLandscape())
                            {
                                hideSystemUI();
                            }
                            handler.removeMessages(2);
                            isVisible = false;
                        }
                    }

                    public void onAnimationRepeat(Animator animator)
                    {
                    }

                    public void onAnimationStart(Animator animator)
                    {
                    }

            
            {
                this$0 = PlaybackControlLayer.this;
                container = framelayout;
                super();
            }
                });
                return;
            }
        }
    }

    public void hideTopChrome()
    {
        topChrome.setVisibility(8);
    }

    public boolean isLandscape()
    {
        return layerManager.getActivity().getResources().getConfiguration().orientation == 2;
    }

    public void onLayerDisplayed(LayerManager layermanager)
    {
        layermanager.getExoplayerWrapper().addListener(new com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener() {

            final PlaybackControlLayer this$0;

            public void onError(Exception exception)
            {
                unhidePlayPause();
            }

            public void onStateChanged(boolean flag, int i)
            {
                LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "control layer onStateChanged: player=%s, playWhenReady=%s, playbackState=%s", new Object[] {
                    playerName, Boolean.valueOf(flag), ExoplayerUtil.getExoplayerStateString(i)
                });
                switch (i)
                {
                default:
                    return;

                case 4: // '\004'
                    if (!flag)
                    {
                        updateProgress();
                    }
                    // fall through

                case 1: // '\001'
                case 5: // '\005'
                    unhidePlayPause();
                    return;

                case 2: // '\002'
                case 3: // '\003'
                    hidePlayPause();
                    return;
                }
            }

            public void onVideoSizeChanged(int i, int j, int k, float f)
            {
            }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
        });
    }

    public void onPause()
    {
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "onPause: player=%s", new Object[] {
            playerName
        });
        updatePlayPauseButton();
    }

    public void onPlay()
    {
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "onPlay: player=%s", new Object[] {
            playerName
        });
        setShouldBePlaying(true);
        updatePlayPauseButton();
        fadeOutControl(2500);
    }

    public void setChromeColor(int i)
    {
        chromeColor = i;
        if (playbackControlRootView != null)
        {
            updateColors();
        }
    }

    public void setControlColor(int i)
    {
        controlColor = i;
        if (playbackControlRootView != null)
        {
            updateColors();
            updateActionButtons();
        }
    }

    public void setFullscreen(boolean flag)
    {
        doToggleFullscreen(flag, false);
    }

    public void setFullscreenCallback(FullscreenCallback fullscreencallback)
    {
        fullscreenCallback = fullscreencallback;
    }

    public void setLogoImageView(Drawable drawable)
    {
        logoDrawable = drawable;
        if (logoImageView != null)
        {
            logoImageView.setImageDrawable(drawable);
        }
    }

    public void setPlayPause(boolean flag)
    {
        setShouldBePlaying(flag);
        ObservablePlayerControl observableplayercontrol = getLayerManager().getControl();
        if (observableplayercontrol == null)
        {
            return;
        }
        if (flag)
        {
            observableplayercontrol.start();
        } else
        {
            observableplayercontrol.pause();
        }
        updatePlayPauseButton();
    }

    public void setSeekbarColor(int i)
    {
        seekbarColor = i;
        if (playbackControlRootView != null)
        {
            updateColors();
        }
    }

    public void setTextColor(int i)
    {
        textColor = i;
        if (playbackControlRootView != null)
        {
            updateColors();
        }
    }

    public void setVideoTitle(String s)
    {
        videoTitle = s;
        if (videoTitleView != null)
        {
            videoTitleView.setText(s);
        }
    }

    public boolean shouldBePlaying()
    {
        return shouldBePlaying;
    }

    public void show()
    {
        show(0);
    }

    public void show(int i)
    {
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "show(%s): player=%s, controlUiDisabled=%s, isFadingOut=%s, isVisible=%s", new Object[] {
            Integer.valueOf(i), playerName, Boolean.valueOf(controlUiDisabled), Boolean.valueOf(isFadingOut), Boolean.valueOf(isVisible)
        });
        if (controlUiDisabled)
        {
            return;
        }
        if (isFadingOut)
        {
            playbackControlRootView.animate().cancel();
            playbackControlRootView.setAlpha(1.0F);
        }
        if (!isVisible && getLayerManager().getContainer() != null)
        {
            playbackControlRootView.setAlpha(1.0F);
            playbackControlRootView.setVisibility(0);
            updateProgress();
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
            getLayerManager().getContainer().removeView(playbackControlRootView);
            getLayerManager().getContainer().addView(playbackControlRootView, layoutparams);
            LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "show(%s): player=%s, playbackControlRootView.getFitsSystemWindows()=%s", new Object[] {
                Integer.valueOf(i), playerName, Boolean.valueOf(playbackControlRootView.getFitsSystemWindows())
            });
            setupView();
            isVisible = true;
        }
        updatePlayPauseButton();
        handler.sendEmptyMessage(2);
        fadeOutControl(i);
    }

    public void showTopChrome()
    {
        topChrome.setVisibility(0);
        updateActionButtons();
        updateColors();
    }

    public String stringForTime(int i)
    {
        int k = i / 1000;
        i = k % 60;
        int j = (k / 60) % 60;
        k /= 3600;
        timeFormat.setLength(0);
        if (k > 0)
        {
            return timeFormatter.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i)
            }).toString();
        } else
        {
            return timeFormatter.format("%02d:%02d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(i)
            }).toString();
        }
    }

    public void togglePlayPause()
    {
        boolean flag;
        if (!getLayerManager().getControl().isPlaying())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setPlayPause(flag);
    }

    public void updateActionButtons()
    {
        actionButtonsContainer.removeAllViews();
        if (isLandscape())
        {
            ImageButton imagebutton1;
            for (Iterator iterator = actionButtons.iterator(); iterator.hasNext(); actionButtonsContainer.addView(imagebutton1))
            {
                imagebutton1 = (ImageButton)iterator.next();
            }

        } else
        {
            ImageButton imagebutton = new ImageButton(getLayerManager().getActivity());
            imagebutton.setContentDescription(getLayerManager().getActivity().getString(com.weather.commons.R.string.overflow));
            imagebutton.setImageDrawable(getLayerManager().getActivity().getResources().getDrawable(com.weather.commons.R.drawable.ic_action_overflow));
            Object obj = new android.app.AlertDialog.Builder(getLayerManager().getActivity());
            ((android.app.AlertDialog.Builder) (obj)).setTitle(getLayerManager().getActivity().getString(com.weather.commons.R.string.select_an_action));
            CharSequence acharsequence[] = new CharSequence[actionButtons.size()];
            for (int i = 0; i < actionButtons.size(); i++)
            {
                acharsequence[i] = ((ImageButton)actionButtons.get(i)).getContentDescription();
            }

            ((android.app.AlertDialog.Builder) (obj)).setItems(acharsequence, new android.content.DialogInterface.OnClickListener() {

                final PlaybackControlLayer this$0;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    ((ImageButton)actionButtons.get(k)).performClick();
                }

            
            {
                this$0 = PlaybackControlLayer.this;
                super();
            }
            });
            imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

                final PlaybackControlLayer this$0;
                final AlertDialog val$alertDialog;

                public void onClick(View view)
                {
                    alertDialog.show();
                }

            
            {
                this$0 = PlaybackControlLayer.this;
                alertDialog = alertdialog;
                super();
            }
            });
            obj = new android.widget.FrameLayout.LayoutParams(-2, -2);
            int j = getLayerManager().getActivity().getResources().getDisplayMetrics().densityDpi * 5;
            ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(j, 0, j, 0);
            imagebutton.setBackgroundColor(0);
            imagebutton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            imagebutton.setColorFilter(controlColor);
            actionButtonsContainer.addView(imagebutton);
        }
    }

    public void updateColors()
    {
        currentTime.setTextColor(textColor);
        endTime.setTextColor(textColor);
        videoTitleView.setTextColor(textColor);
        fullscreenButton.setColorFilter(controlColor);
        pausePlayButton.setColorFilter(controlColor);
        seekBar.getProgressDrawable().setColorFilter(seekbarColor, android.graphics.PorterDuff.Mode.SRC_ATOP);
        seekBar.getThumb().setColorFilter(seekbarColor, android.graphics.PorterDuff.Mode.SRC_ATOP);
        Iterator iterator;
        if (canSeek)
        {
            seekBar.getThumb().mutate().setAlpha(255);
        } else
        {
            seekBar.getThumb().mutate().setAlpha(0);
        }
        for (iterator = actionButtons.iterator(); iterator.hasNext(); ((ImageButton)iterator.next()).setColorFilter(controlColor)) { }
        topChrome.setBackgroundColor(chromeColor);
    }

    public void updatePlayPauseButton()
    {
        ObservablePlayerControl observableplayercontrol = getLayerManager().getControl();
        if (playbackControlRootView == null || pausePlayButton == null || observableplayercontrol == null)
        {
            return;
        }
        if (observableplayercontrol.isPlaying())
        {
            pausePlayButton.setImageResource(com.weather.commons.R.drawable.ic_action_pause_large);
            return;
        } else
        {
            pausePlayButton.setImageResource(com.weather.commons.R.drawable.ic_action_play_large);
            return;
        }
    }

    public int updateProgress()
    {
        ObservablePlayerControl observableplayercontrol = getLayerManager().getControl();
        int i;
        if (observableplayercontrol == null || isSeekbarDragging)
        {
            i = 0;
        } else
        {
            int j = observableplayercontrol.getCurrentPosition();
            i = observableplayercontrol.getDuration();
            if (seekBar != null)
            {
                if (i > 0)
                {
                    long l = (1000L * (long)j) / (long)i;
                    seekBar.setProgress((int)l);
                }
                int k = observableplayercontrol.getBufferPercentage();
                seekBar.setSecondaryProgress(k * 10);
            }
            if (endTime != null)
            {
                endTime.setText(stringForTime(i));
            }
            i = j;
            if (currentTime != null)
            {
                currentTime.setText(stringForTime(j));
                return j;
            }
        }
        return i;
    }






/*
    static boolean access$102(PlaybackControlLayer playbackcontrollayer, boolean flag)
    {
        playbackcontrollayer.isSeekbarDragging = flag;
        return flag;
    }

*/








/*
    static boolean access$202(PlaybackControlLayer playbackcontrollayer, boolean flag)
    {
        playbackcontrollayer.isVisible = flag;
        return flag;
    }

*/






/*
    static boolean access$802(PlaybackControlLayer playbackcontrollayer, boolean flag)
    {
        playbackcontrollayer.isFadingOut = flag;
        return flag;
    }

*/

}
