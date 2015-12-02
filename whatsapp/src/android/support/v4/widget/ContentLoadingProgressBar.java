// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{

    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private long mStartTime;

    public ContentLoadingProgressBar(Context context)
    {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        mStartTime = -1L;
        mPostedHide = false;
        mPostedShow = false;
        mDismissed = false;
        mDelayedHide = new _cls1();
        mDelayedShow = new _cls2();
    }

    private void removeCallbacks()
    {
        removeCallbacks(mDelayedHide);
        removeCallbacks(mDelayedShow);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks();
    }


/*
    static boolean access$002(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
        contentloadingprogressbar.mPostedHide = flag;
        return flag;
    }

*/


/*
    static long access$102(ContentLoadingProgressBar contentloadingprogressbar, long l)
    {
        contentloadingprogressbar.mStartTime = l;
        return l;
    }

*/


/*
    static boolean access$202(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
        contentloadingprogressbar.mPostedShow = flag;
        return flag;
    }

*/


    private class _cls1
        implements Runnable
    {

        final ContentLoadingProgressBar this$0;

        public void run()
        {
            mPostedHide = false;
            mStartTime = -1L;
            setVisibility(8);
        }

        _cls1()
        {
            this$0 = ContentLoadingProgressBar.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ContentLoadingProgressBar this$0;

        public void run()
        {
            mPostedShow = false;
            if (!mDismissed)
            {
                mStartTime = System.currentTimeMillis();
                setVisibility(0);
            }
        }

        _cls2()
        {
            this$0 = ContentLoadingProgressBar.this;
            super();
        }
    }

}
