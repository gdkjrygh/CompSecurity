// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.DealDashPageInfo;
import com.contextlogic.wish.api.service.DealDashFeedService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.text.AutoResizeTextView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedProductView;
import java.util.Date;
import java.util.EnumMap;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashModal

public class DealDashView extends LinearLayout
{

    private static int COUNT_DOWN_TIME = 3;
    private UnifiedFontTextView bottomSubText;
    private UnifiedFontTextView bottomSubText2;
    private UnifiedFontTextView countdownText;
    private int countdownTime;
    private Timer countdownTimer;
    private CountdownTimerView countdownView;
    private DealDashFeedService dealDashFeedService;
    private FilterFeedFragment filterFragment;
    private Handler handler;
    private ImageView imageView;
    private DealDashInfo infoMap;
    private UnifiedFontButton startButton;
    private com.contextlogic.wish.api.data.DealDashPageInfo.PAGE status;
    private UnifiedFontTextView titleText;
    private View topCountView;
    private AutoResizeTextView topCountdownTextView;
    private CountdownTimerView topCountdownView;
    private UnifiedFontTextView topSubText;

    public DealDashView(Context context)
    {
        this(context, null);
    }

    public DealDashView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void hideAllElements()
    {
        titleText.setVisibility(8);
        topSubText.setVisibility(8);
        bottomSubText.setVisibility(8);
        bottomSubText2.setVisibility(8);
        startButton.setVisibility(8);
        imageView.setVisibility(8);
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03003a, this);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final DealDashView this$0;

            public void onClick(View view1)
            {
                if (getState() == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_GRANTED)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_DEAL_DASH_START);
                    startAnimation();
                }
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        };
        titleText = (UnifiedFontTextView)view.findViewById(0x7f0d0151);
        topSubText = (UnifiedFontTextView)view.findViewById(0x7f0d0153);
        bottomSubText = (UnifiedFontTextView)view.findViewById(0x7f0d0155);
        bottomSubText2 = (UnifiedFontTextView)view.findViewById(0x7f0d0158);
        countdownText = (UnifiedFontTextView)view.findViewById(0x7f0d0152);
        imageView = (ImageView)view.findViewById(0x7f0d0154);
        startButton = (UnifiedFontButton)view.findViewById(0x7f0d0157);
        startButton.setOnClickListener(onclicklistener);
        countdownView = (CountdownTimerView)view.findViewById(0x7f0d0156);
        setGravity(1);
        setBackgroundResource(0x7f0c0084);
        setOrientation(1);
        setOnClickListener(onclicklistener);
        countdownTimer = new Timer();
        countdownTime = COUNT_DOWN_TIME;
        handler = new Handler();
        dealDashFeedService = new DealDashFeedService();
    }

    private void showAllElements()
    {
        handler.post(new Runnable() {

            final DealDashView this$0;

            public void run()
            {
                titleText.setVisibility(0);
                topSubText.setVisibility(0);
                bottomSubText.setVisibility(0);
                bottomSubText2.setVisibility(0);
                startButton.setVisibility(0);
                imageView.setVisibility(0);
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        });
    }

    private void startAnimation()
    {
        hideAllElements();
        trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_COUNTDOWN);
        status = com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.COUNTDOWN;
        countdownText.setVisibility(0);
        TimerTask timertask = new TimerTask() {

            final DealDashView this$0;

            public void run()
            {
                handler.post(new Runnable() {

                    final _cls7 this$1;

                    public void run()
                    {
                        updateCountdownText();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        };
        countdownTimer.schedule(timertask, 0L, 1000L);
        dealDashFeedService.requestService(new com.contextlogic.wish.api.service.DealDashFeedService.SuccessCallback() {

            final DealDashView this$0;

            public void onServiceSucceeded()
            {
                if (filterFragment.getDealDashProdView() != null)
                {
                    filterFragment.getDealDashProdView().updateFeed(null, null);
                }
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.DealDashFeedService.FailureCallback() {

            final DealDashView this$0;

            public void onServiceFailed(String s)
            {
                PopupAlertDialog.showError(getContext(), getResources().getString(0x7f0602c5), getResources().getString(0x7f0602c4));
                countdownTimer.cancel();
                countdownTime = 0;
                updateCountdownText();
                changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_GRANTED);
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        });
        filterFragment.getDealDashProdView().refreshViewState();
    }

    private void updateCountdownText()
    {
        if (countdownTime > 0)
        {
            countdownText.setText(String.valueOf(countdownTime));
            countdownTime = countdownTime - 1;
            return;
        } else
        {
            countdownTimer.cancel();
            countdownTimer = new Timer();
            countdownText.setVisibility(8);
            countdownTime = COUNT_DOWN_TIME;
            hideAllElements();
            setVisibility(8);
            return;
        }
    }

    public void changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE page)
    {
        if (page == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_BLOCKED)
        {
            changeState(page, infoMap.getWaitTime());
            return;
        }
        if (page == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.PLAYING)
        {
            changeState(page, infoMap.getPlayTime());
            return;
        } else
        {
            changeState(page, 0L);
            return;
        }
    }

    public void changeState(final com.contextlogic.wish.api.data.DealDashPageInfo.PAGE state, final long time)
    {
        status = state;
        if (state == com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.PLAYING) goto _L2; else goto _L1
_L1:
        showAllElements();
        handler.post(new Runnable() {

            final DealDashView this$0;
            final com.contextlogic.wish.api.data.DealDashPageInfo.PAGE val$state;

            public void run()
            {
                setVisibility(0);
                topCountView.setVisibility(8);
                titleText.setText(((DealDashPageInfo)infoMap.getPageMap().get(state)).getTitle());
                topSubText.setText(((DealDashPageInfo)infoMap.getPageMap().get(state)).getTopSubtitle());
                bottomSubText.setText(((DealDashPageInfo)infoMap.getPageMap().get(state)).getBottomSubtitle());
                bottomSubText2.setText(((DealDashPageInfo)infoMap.getPageMap().get(state)).getBottomSubtitle());
                startButton.setText(((DealDashPageInfo)infoMap.getPageMap().get(state)).getButtonText());
            }

            
            {
                this$0 = DealDashView.this;
                state = page;
                super();
            }
        });
        if (state != com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_BLOCKED) goto _L4; else goto _L3
_L3:
        trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_WAIT);
        handler.post(new Runnable() {

            final DealDashView this$0;
            final long val$time;

            public void run()
            {
                bottomSubText.setVisibility(8);
                startButton.setVisibility(8);
                imageView.setVisibility(8);
                if (countdownView != null)
                {
                    countdownView.pauseTimer();
                }
                countdownView.setVisibility(0);
                countdownView.setup(new Date(System.currentTimeMillis() + time * 1000L), 40, getResources().getColor(0x7f0c00e8), getResources().getColor(0x7f0c006d), getResources().getColor(0x7f0c00e8), 0x7f0201aa, true, new com.contextlogic.wish.ui.components.timer.CountdownTimerView.DoneCallback() {

                    final _cls2 this$1;

                    public void onCountdownEnd()
                    {
                        changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_GRANTED);
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                countdownView.startTimer();
            }

            
            {
                this$0 = DealDashView.this;
                time = l;
                super();
            }
        });
_L6:
        return;
_L4:
        trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_START);
        handler.post(new Runnable() {

            final DealDashView this$0;

            public void run()
            {
                if (countdownView != null)
                {
                    countdownView.pauseTimer();
                    countdownView.setVisibility(8);
                }
                bottomSubText2.setVisibility(8);
                startButton.setVisibility(0);
                imageView.setVisibility(0);
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        });
        return;
_L2:
        trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_FEED);
        countdownText.setVisibility(8);
        setVisibility(8);
        topCountdownTextView = (AutoResizeTextView)topCountView.findViewById(0x7f0d01d0);
        topCountdownTextView.setSingleLine();
        topCountdownTextView.setText(((DealDashPageInfo)infoMap.getPageMap().get(state)).getTitle());
        topCountdownView = (CountdownTimerView)topCountView.findViewById(0x7f0d01cf);
        if (topCountdownView != null)
        {
            topCountdownView.pauseTimer();
        }
        topCountdownView.setup(new Date(System.currentTimeMillis() + 1000L * time), 20, getResources().getColor(0x7f0c00e8), getResources().getColor(0x7f0c006d), getResources().getColor(0x7f0c00e8), 0x7f0201aa, true, new com.contextlogic.wish.ui.components.timer.CountdownTimerView.DoneCallback() {

            final DealDashView this$0;

            public void onCountdownEnd()
            {
                changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_BLOCKED);
                Object obj = filterFragment.getActivity();
                if (filterFragment.getCurrentIndex() == filterFragment.getDealDashPosition())
                {
                    trackEvent(WishAnalyticsEvent.IMPRESSION_DEAL_DASH_MODAL);
                    obj = new DealDashModal(((Context) (obj)));
                    ((DealDashModal) (obj)).setup((DealDashPageInfo)infoMap.getPageMap().get(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.TIMES_UP), new android.view.View.OnClickListener() {

                        final _cls4 this$1;

                        public void onClick(View view)
                        {
                            trackEvent(WishAnalyticsEvent.CLICK_DEAL_DASH_GO_TO_CART_MODAL);
                            filterFragment.clearOverlay();
                            ((RootActivity)filterFragment.getActivity()).showCart(null, null, null, 0);
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    handler.post(((_cls2) (obj)). new Runnable() {

                        final _cls4 this$1;
                        final DealDashModal val$modal;

                        public void run()
                        {
                            filterFragment.showOverlay(modal, true);
                        }

            
            {
                this$1 = final__pcls4;
                modal = DealDashModal.this;
                super();
            }
                    });
                }
                filterFragment.getDealDashProdView().updateFeed(null, null);
            }

            
            {
                this$0 = DealDashView.this;
                super();
            }
        });
        if (!dealDashFeedService.isPending())
        {
            if (filterFragment.getCurrentIndex() == filterFragment.getDealDashPosition())
            {
                topCountView.setVisibility(0);
            }
            topCountdownView.startTimer();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void cleanup()
    {
        if (topCountdownView != null)
        {
            topCountdownView.pauseTimer();
        }
        if (countdownView != null)
        {
            countdownView.pauseTimer();
        }
        handler.removeCallbacksAndMessages(null);
    }

    public com.contextlogic.wish.api.data.DealDashPageInfo.PAGE getState()
    {
        return status;
    }

    public void refreshWishStates()
    {
        if (filterFragment != null && filterFragment.getCurrentIndex() == filterFragment.getDealDashPosition())
        {
            setInfo(infoMap);
        }
    }

    public void setCountdownView(View view)
    {
        topCountView = view;
    }

    public void setFilterFragment(FilterFeedFragment filterfeedfragment)
    {
        filterFragment = filterfeedfragment;
    }

    public void setInfo(DealDashInfo dealdashinfo)
    {
        infoMap = dealdashinfo;
        long l = infoMap.getTimeElapsed();
        if (l < infoMap.getPlayTime())
        {
            changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.PLAYING, ((long)COUNT_DOWN_TIME + infoMap.getPlayTime()) - l);
            return;
        }
        if (l < infoMap.getPlayTime() + infoMap.getWaitTime())
        {
            changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_BLOCKED, ((long)COUNT_DOWN_TIME + infoMap.getWaitTime()) - (l - infoMap.getPlayTime()));
            return;
        } else
        {
            changeState(com.contextlogic.wish.api.data.DealDashPageInfo.PAGE.ACCESS_GRANTED);
            return;
        }
    }

    public void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }









/*
    static int access$1402(DealDashView dealdashview, int i)
    {
        dealdashview.countdownTime = i;
        return i;
    }

*/








}
