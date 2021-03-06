// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, ViewPager

public class PagerTabStrip extends PagerTitleStrip
{

    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    public PagerTabStrip(Context context)
    {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeset)
    {
        boolean flag = ViewPager.a;
        super(context, attributeset);
        mTabPaint = new Paint();
        mTempRect = new Rect();
        mTabAlpha = 255;
        mDrawFullUnderline = false;
        mDrawFullUnderlineSet = false;
        mIndicatorColor = mTextColor;
        mTabPaint.setColor(mIndicatorColor);
        float f = context.getResources().getDisplayMetrics().density;
        mIndicatorHeight = (int)(3F * f + 0.5F);
        mMinPaddingBottom = (int)(6F * f + 0.5F);
        mMinTextSpacing = (int)(64F * f);
        mTabPadding = (int)(16F * f + 0.5F);
        mFullUnderlineHeight = (int)(1.0F * f + 0.5F);
        mMinStripHeight = (int)(f * 32F + 0.5F);
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        mPrevText.setFocusable(true);
        mPrevText.setOnClickListener(new _cls1());
        mNextText.setFocusable(true);
        mNextText.setOnClickListener(new _cls2());
        if (getBackground() == null)
        {
            mDrawFullUnderline = true;
        }
        if (flag)
        {
            Fragment.a++;
        }
    }

    int getMinHeight()
    {
        return Math.max(super.getMinHeight(), mMinStripHeight);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i = getHeight();
        int j = mCurrText.getLeft();
        int k = mTabPadding;
        int l = mCurrText.getRight();
        int i1 = mTabPadding;
        int j1 = mIndicatorHeight;
        mTabPaint.setColor(mTabAlpha << 24 | mIndicatorColor & 0xffffff);
        canvas.drawRect(j - k, i - j1, l + i1, i, mTabPaint);
        if (mDrawFullUnderline)
        {
            mTabPaint.setColor(0xff000000 | mIndicatorColor & 0xffffff);
            canvas.drawRect(getPaddingLeft(), i - mFullUnderlineHeight, getWidth() - getPaddingRight(), i, mTabPaint);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i;
        boolean flag;
        flag = ViewPager.a;
        i = motionevent.getAction();
        if (i != 0 && mIgnoreTap)
        {
            return false;
        }
        f = motionevent.getX();
        f1 = motionevent.getY();
        i;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 66
    //                   1 132
    //                   2 86;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        mInitialMotionX = f;
        mInitialMotionY = f1;
        mIgnoreTap = false;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (Math.abs(f - mInitialMotionX) <= (float)mTouchSlop && Math.abs(f1 - mInitialMotionY) <= (float)mTouchSlop)
        {
            continue; /* Loop/switch isn't completed */
        }
        mIgnoreTap = true;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (f < (float)(mCurrText.getLeft() - mTabPadding))
        {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (f > (float)(mCurrText.getRight() + mTabPadding))
        {
            mPager.setCurrentItem(mPager.getCurrentItem() + 1);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setBackgroundColor(int i)
    {
        super.setBackgroundColor(i);
        if (!mDrawFullUnderlineSet)
        {
            boolean flag;
            if ((0xff000000 & i) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mDrawFullUnderline = flag;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (!mDrawFullUnderlineSet)
        {
            boolean flag;
            if (drawable == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mDrawFullUnderline = flag;
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (!mDrawFullUnderlineSet)
        {
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mDrawFullUnderline = flag;
        }
    }

    public void setPadding(int i, int j, int k, int l)
    {
        int i1 = l;
        if (l < mMinPaddingBottom)
        {
            i1 = mMinPaddingBottom;
        }
        super.setPadding(i, j, k, i1);
    }

    public void setTextSpacing(int i)
    {
        int j = i;
        if (i < mMinTextSpacing)
        {
            j = mMinTextSpacing;
        }
        super.setTextSpacing(j);
    }

    void updateTextPositions(int i, float f, boolean flag)
    {
        Rect rect = mTempRect;
        int j = getHeight();
        int k = mCurrText.getLeft();
        int l = mTabPadding;
        int i1 = mCurrText.getRight();
        int j1 = mTabPadding;
        int k1 = j - mIndicatorHeight;
        rect.set(k - l, k1, i1 + j1, j);
        super.updateTextPositions(i, f, flag);
        mTabAlpha = (int)(Math.abs(f - 0.5F) * 2.0F * 255F);
        rect.union(mCurrText.getLeft() - mTabPadding, k1, mCurrText.getRight() + mTabPadding, j);
        invalidate(rect);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PagerTabStrip this$0;

        public void onClick(View view)
        {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }

        _cls1()
        {
            this$0 = PagerTabStrip.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PagerTabStrip this$0;

        public void onClick(View view)
        {
            mPager.setCurrentItem(mPager.getCurrentItem() + 1);
        }

        _cls2()
        {
            this$0 = PagerTabStrip.this;
            super();
        }
    }

}
