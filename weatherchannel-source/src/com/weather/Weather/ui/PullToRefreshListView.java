// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.google.common.base.Preconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.TimerMetric;
import com.weather.util.ui.MotionUtils;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.Weather.ui:
//            FrontPageView, Refreshable

public class PullToRefreshListView extends ListView
{

    private static final float MAXIMUM_PULL_DP = 120F;
    private static final float MINIMUM_PULL_DP = 15F;
    private static final String TAG = "PullToRefreshListView";
    private boolean cancelledParentGesture;
    private FrontPageView headerView;
    private final int maximumPullPixels;
    private boolean mightBePulling;
    private final int minimumPullPixels;
    private int minimumYDuringPull;
    private int pullPointerId;
    private boolean reallyPulling;
    private Refreshable refreshable;
    private int yAtStartOfPull;

    public PullToRefreshListView(Context context)
    {
        super(context);
        minimumPullPixels = UIUtil.convertDpToPixelInt(context, 15F);
        maximumPullPixels = UIUtil.convertDpToPixelInt(context, 120F);
        init();
    }

    public PullToRefreshListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        minimumPullPixels = UIUtil.convertDpToPixelInt(context, 15F);
        maximumPullPixels = UIUtil.convertDpToPixelInt(context, 120F);
        init();
    }

    public PullToRefreshListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        minimumPullPixels = UIUtil.convertDpToPixelInt(context, 15F);
        maximumPullPixels = UIUtil.convertDpToPixelInt(context, 120F);
        init();
    }

    private void donePulling(MotionEvent motionevent, int i)
    {
        i = getRawY(motionevent, i);
        LogUtil.v("PullToRefreshListView", LoggingMetaTags.TWC_UI, "... rawY=%s, yAtStartOfPull=%s, minimumPullPixels=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(yAtStartOfPull), Integer.valueOf(minimumPullPixels)
        });
        if (i > yAtStartOfPull || headerView.getExtraTopPadding() != 0)
        {
            headerView.bounceToTop();
            if (i > yAtStartOfPull + minimumPullPixels)
            {
                MetricRegistry.getInstance().timer(com.weather.util.metric.Metric.MetricTag.TIMER_PULL_TO_REFRESH_DISPLAY.getMetricName()).reset().start();
                refreshable.runRefresh();
            }
        }
    }

    private int getRawY(MotionEvent motionevent, int i)
    {
        int ai[] = new int[2];
        ai[0] = (int)motionevent.getX(i);
        ai[1] = (int)motionevent.getY(i);
        MotionUtils.convertToRaw(ai, this);
        return ai[1];
    }

    private void init()
    {
        resetPullTracking();
        setPersistentDrawingCache(2);
        setScrollingCacheEnabled(false);
    /* block-local class not found */
    class PullRecyclerListener {}

        setRecyclerListener(new PullRecyclerListener(null));
    }

    private boolean isAtTop()
    {
        while (getChildCount() == 0 || getChildAt(0).getTop() == 0) 
        {
            return true;
        }
        return false;
    }

    private void resetPullTracking()
    {
        mightBePulling = false;
        reallyPulling = false;
        minimumYDuringPull = 0;
        yAtStartOfPull = 0;
        cancelledParentGesture = false;
        pullPointerId = 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_UI, 2))
        {
            LogUtil.v("PullToRefreshListView", LoggingMetaTags.TWC_UI, "onInterceptTouchEvent: action=%s, mightBePulling=%s, reallyPulling=%s", new Object[] {
                MotionUtils.actionToString(motionevent), Boolean.valueOf(mightBePulling), Boolean.valueOf(reallyPulling)
            });
            MotionUtils.logSamples(motionevent, "PullToRefreshListView", false, this);
        }
        flag1 = false;
        flag = flag1;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 112
    //                   0 173
    //                   1 429
    //                   2 274
    //                   3 429
    //                   4 116
    //                   5 116
    //                   6 371;
           goto _L1 _L2 _L3 _L4 _L3 _L5 _L5 _L6
_L3:
        break MISSING_BLOCK_LABEL_429;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag1;
_L7:
        flag1 = false;
        if (!flag)
        {
            flag1 = super.onInterceptTouchEvent(motionevent);
        }
        LogUtil.v("PullToRefreshListView", LoggingMetaTags.TWC_UI, "... weStoleGesture=%s, superStoleGesture=%s", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        MotionEvent motionevent1;
        int i;
        int j;
        int k;
        return flag || flag1;
_L2:
        resetPullTracking();
        headerView.stopAnimating();
        flag = flag1;
        if (isAtTop())
        {
            i = headerView.getExtraTopPadding();
            LogUtil.v("PullToRefreshListView", LoggingMetaTags.TWC_UI, "... DOWN while atTop, could be the start of a pull, extraTopPadding=%s", new Object[] {
                Integer.valueOf(i)
            });
            j = (int)motionevent.getRawY();
            k = motionevent.getPointerId(0);
            yAtStartOfPull = j;
            minimumYDuringPull = j - Math.max(0, i);
            mightBePulling = true;
            pullPointerId = k;
            flag = flag1;
        }
          goto _L7
_L4:
        flag = flag1;
        if (mightBePulling)
        {
            i = motionevent.findPointerIndex(pullPointerId);
            if (i == -1)
            {
                Log.w("PullToRefreshListView", "there is no pull pointer, ignoring move of orphaned secondary pointer(s)");
                resetPullTracking();
                flag = flag1;
            } else
            {
                flag = flag1;
                if (getRawY(motionevent, i) > yAtStartOfPull)
                {
                    mightBePulling = false;
                    reallyPulling = true;
                    flag = true;
                    motionevent1 = MotionEvent.obtain(motionevent);
                    motionevent1.setAction(3);
                    super.onInterceptTouchEvent(motionevent1);
                    motionevent1.recycle();
                }
            }
        }
          goto _L7
_L6:
        flag = flag1;
        if (mightBePulling)
        {
            i = motionevent.getPointerId(motionevent.getActionIndex());
            flag = flag1;
            if (pullPointerId == i)
            {
                resetPullTracking();
                headerView.stopAnimating();
                headerView.setExtraTopPadding(0);
                flag = flag1;
            }
        }
          goto _L7
        flag = flag1;
        if (mightBePulling)
        {
            resetPullTracking();
            headerView.stopAnimating();
            headerView.setExtraTopPadding(0);
            flag = flag1;
        }
          goto _L7
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_UI, 2))
        {
            LogUtil.v("PullToRefreshListView", LoggingMetaTags.TWC_UI, "onTouchEvent: action=%s, mightBePulling=%s, reallyPulling=%s", new Object[] {
                MotionUtils.actionToString(motionevent), Boolean.valueOf(mightBePulling), Boolean.valueOf(reallyPulling)
            });
            MotionUtils.logSamples(motionevent, "PullToRefreshListView", false, this);
        }
        flag3 = false;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 6: default 116
    //                   1 175
    //                   2 261
    //                   3 558
    //                   4 120
    //                   5 120
    //                   6 510;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L6
_L4:
        break MISSING_BLOCK_LABEL_558;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag2;
_L7:
        if (!flag)
        {
            flag1 = super.onTouchEvent(motionevent);
        }
        LogUtil.v("PullToRefreshListView", LoggingMetaTags.TWC_UI, "... weConsumedEvent=%s, superConsumedEvent=%s", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        MotionEvent motionevent1;
        int i;
        int j;
        return flag || flag1;
_L2:
        if (reallyPulling)
        {
            i = motionevent.findPointerIndex(pullPointerId);
            if (i == -1)
            {
                Log.w("PullToRefreshListView", "UP on last pointer while pulling, but it was not the pull pointer so how were they pulling?");
                headerView.stopAnimating();
                headerView.setExtraTopPadding(0);
            } else
            {
                donePulling(motionevent, i);
            }
            flag = true;
        } else
        {
            headerView.stopAnimating();
            headerView.setExtraTopPadding(0);
            flag = flag3;
        }
        resetPullTracking();
          goto _L7
_L3:
        if (mightBePulling) goto _L9; else goto _L8
_L8:
        flag = flag2;
        if (!reallyPulling) goto _L7; else goto _L9
_L9:
        i = motionevent.findPointerIndex(pullPointerId);
        if (i == -1)
        {
            Log.w("PullToRefreshListView", "no pull pointer, ignoring orphaned secondary pointer move");
            resetPullTracking();
            headerView.stopAnimating();
            headerView.setExtraTopPadding(0);
            flag = flag2;
        } else
        {
            i = getRawY(motionevent, i);
            if (mightBePulling && i > yAtStartOfPull)
            {
                mightBePulling = false;
                reallyPulling = true;
                if (!cancelledParentGesture)
                {
                    cancelledParentGesture = true;
                    motionevent1 = MotionEvent.obtain(motionevent);
                    motionevent1.setAction(3);
                    super.onTouchEvent(motionevent1);
                    motionevent1.recycle();
                }
            }
            flag = flag2;
            if (reallyPulling)
            {
                j = Math.min(maximumPullPixels, Math.max(0, i - minimumYDuringPull));
                headerView.setExtraTopPadding(j);
                if (LogUtil.isLoggable(LoggingMetaTags.TWC_UI, 2))
                {
                    Log.v("PullToRefreshListView", (new StringBuilder()).append("... pullPointerRawY=").append(i).append(", minimumYDuringPull=").append(minimumYDuringPull).append(", maximumPullPixels=").append(maximumPullPixels).append(", extraTopPadding=").append(j).toString());
                }
                flag = true;
            }
        }
          goto _L7
_L6:
        flag = flag2;
        if (reallyPulling)
        {
            i = motionevent.getActionIndex();
            flag = flag2;
            if (pullPointerId == motionevent.getPointerId(i))
            {
                donePulling(motionevent, i);
                flag = true;
                resetPullTracking();
            }
        }
          goto _L7
        resetPullTracking();
        headerView.stopAnimating();
        headerView.setExtraTopPadding(0);
        flag = flag2;
          goto _L7
    }

    public void setActivity(Refreshable refreshable1, FrontPageView frontpageview)
    {
        refreshable = (Refreshable)Preconditions.checkNotNull(refreshable1);
        headerView = (FrontPageView)Preconditions.checkNotNull(frontpageview);
    }
}
