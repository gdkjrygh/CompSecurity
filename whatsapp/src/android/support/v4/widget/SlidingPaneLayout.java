// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{

    static final SlidingPanelLayoutImpl IMPL;
    public static int a;
    private static final String z[];
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public SlidingPaneLayout(Context context)
    {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSliderFadeColor = 0xcccccccc;
        mFirstLayout = true;
        mTmpRect = new Rect();
        mPostedRunnables = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        mOverhangSize = (int)(32F * f + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        mDragHelper = ViewDragHelper.create(this, 0.5F, new DragHelperCallback(null));
        mDragHelper.setMinVelocity(f * 400F);
    }

    private boolean closePane(View view, int i)
    {
        boolean flag;
        try
        {
            flag = mFirstLayout;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        if (!smoothSlideTo(0.0F, i))
        {
            break MISSING_BLOCK_LABEL_31;
        }
        mPreservedOpenState = false;
        return true;
        return false;
    }

    private void dimChildView(View view, float f, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f <= 0.0F || i == 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        int j = (int)((float)((0xff000000 & i) >>> 24) * f);
        try
        {
            if (layoutparams.dimPaint == null)
            {
                layoutparams.dimPaint = new Paint();
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            layoutparams.dimPaint.setColorFilter(new PorterDuffColorFilter(j << 24 | 0xffffff & i, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (ViewCompat.getLayerType(view) != 2)
            {
                ViewCompat.setLayerType(view, 2, layoutparams.dimPaint);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        invalidateChildRegion(view);
        i = a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        i = ViewCompat.getLayerType(view);
        if (i != 0)
        {
            try
            {
                if (layoutparams.dimPaint != null)
                {
                    layoutparams.dimPaint.setColorFilter(null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            view = new DisableLayerRunnable(view);
            mPostedRunnables.add(view);
            ViewCompat.postOnAnimation(this, view);
        }
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    private void invalidateChildRegion(View view)
    {
        IMPL.invalidateChildRegion(this, view);
    }

    private boolean isLayoutRtlSupport()
    {
        int i;
        try
        {
            i = ViewCompat.getLayoutDirection(this);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i == 1;
    }

    private void onPanelDragged(int i)
    {
        try
        {
            if (mSlideableView == null)
            {
                mSlideOffset = 0.0F;
                return;
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        boolean flag = isLayoutRtlSupport();
        Object obj = (LayoutParams)mSlideableView.getLayoutParams();
        int k = mSlideableView.getWidth();
        int j = i;
        if (flag)
        {
            float f;
            try
            {
                j = getWidth();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            j = j - i - k;
        }
        if (flag)
        {
            try
            {
                i = getPaddingRight();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            i = getPaddingLeft();
        }
        if (flag)
        {
            try
            {
                k = ((LayoutParams) (obj)).rightMargin;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            k = ((LayoutParams) (obj)).leftMargin;
        }
        f = j - (i + k);
        try
        {
            mSlideOffset = f / (float)mSlideRange;
            if (mParallaxBy != 0)
            {
                parallaxOtherViews(mSlideOffset);
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        try
        {
            if (((LayoutParams) (obj)).dimWhenOffset)
            {
                dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        dispatchOnPanelSlide(mSlideableView);
    }

    private boolean openPane(View view, int i)
    {
        boolean flag;
        try
        {
            flag = mFirstLayout;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        if (!smoothSlideTo(1.0F, i))
        {
            break MISSING_BLOCK_LABEL_31;
        }
        mPreservedOpenState = true;
        return true;
        return false;
    }

    private void parallaxOtherViews(float f)
    {
        Object obj;
        int i1;
        boolean flag;
        i1 = a;
        flag = isLayoutRtlSupport();
        obj = (LayoutParams)mSlideableView.getLayoutParams();
        boolean flag1 = ((LayoutParams) (obj)).dimWhenOffset;
        if (!flag1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int j1;
        if (flag)
        {
            try
            {
                i = ((LayoutParams) (obj)).rightMargin;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            i = ((LayoutParams) (obj)).leftMargin;
        }
        if (i > 0) goto _L2; else goto _L3
_L3:
        i = 1;
_L8:
        j1 = getChildCount();
        j = 0;
_L9:
        if (j >= j1) goto _L5; else goto _L4
_L4:
        obj = getChildAt(j);
        View view;
        try
        {
            view = mSlideableView;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj != view) goto _L7; else goto _L6
_L6:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
_L5:
        return;
        obj;
        throw obj;
_L2:
        i = 0;
          goto _L8
_L7:
        int k;
        k = (int)((1.0F - mParallaxOffset) * (float)mParallaxBy);
        mParallaxOffset = f;
        int l = k - (int)((1.0F - f) * (float)mParallaxBy);
        k = l;
        if (flag)
        {
            k = -l;
        }
        ((View) (obj)).offsetLeftAndRight(k);
        if (i != 0)
        {
            float f1;
            if (flag)
            {
                IllegalStateException illegalstateexception;
                try
                {
                    f1 = mParallaxOffset;
                }
                catch (IllegalStateException illegalstateexception1)
                {
                    throw illegalstateexception1;
                }
                f1--;
            } else
            {
                f1 = 1.0F - mParallaxOffset;
            }
            dimChildView(((View) (obj)), f1, mCoveredFadeColor);
        }
          goto _L6
        illegalstateexception;
        throw illegalstateexception;
        j++;
          goto _L9
    }

    private static boolean viewIsOpaque(View view)
    {
        boolean flag;
        try
        {
            flag = ViewCompat.isOpaque(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!flag)
        {
            int i;
            try
            {
                i = android.os.Build.VERSION.SDK_INT;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (i >= 18)
            {
                return false;
            }
            view = view.getBackground();
            if (view != null)
            {
                int j;
                try
                {
                    j = view.getOpacity();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (j != -1)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        boolean flag;
        try
        {
            flag = layoutparams instanceof LayoutParams;
        }
        // Misplaced declaration of an exception variable
        catch (android.view.ViewGroup.LayoutParams layoutparams)
        {
            try
            {
                throw layoutparams;
            }
            // Misplaced declaration of an exception variable
            catch (android.view.ViewGroup.LayoutParams layoutparams)
            {
                throw layoutparams;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (super.checkLayoutParams(layoutparams))
        {
            return true;
        }
        return false;
    }

    public boolean closePane()
    {
        return closePane(mSlideableView, 0);
    }

    public void computeScroll()
    {
        boolean flag = mDragHelper.continueSettling(true);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        IllegalStateException illegalstateexception;
        try
        {
            if (!mCanSlide)
            {
                mDragHelper.abort();
                return;
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        break MISSING_BLOCK_LABEL_34;
        illegalstateexception;
        throw illegalstateexception;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dispatchOnPanelClosed(View view)
    {
        try
        {
            if (mPanelSlideListener != null)
            {
                mPanelSlideListener.onPanelClosed(view);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelOpened(View view)
    {
        try
        {
            if (mPanelSlideListener != null)
            {
                mPanelSlideListener.onPanelOpened(view);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelSlide(View view)
    {
        try
        {
            if (mPanelSlideListener != null)
            {
                mPanelSlideListener.onPanelSlide(view, mSlideOffset);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
    }

    public void draw(Canvas canvas)
    {
        Drawable drawable;
        int i;
label0:
        {
            i = a;
            super.draw(canvas);
            if (isLayoutRtlSupport())
            {
                drawable = mShadowDrawableRight;
                if (i == 0)
                {
                    break label0;
                }
            }
            drawable = mShadowDrawableLeft;
        }
        if (getChildCount() <= 1) goto _L2; else goto _L1
_L1:
        View view = getChildAt(1);
_L4:
        if (view == null || drawable == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
        canvas;
        throw canvas;
_L2:
        view = null;
        if (true) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        int i1;
        k = view.getTop();
        l = view.getBottom();
        i1 = drawable.getIntrinsicWidth();
        if (!isLayoutRtlSupport()) goto _L6; else goto _L5
_L5:
        int j = view.getRight();
        if (i == 0) goto _L7; else goto _L6
_L6:
        i = view.getLeft();
        j = i - i1;
_L9:
        drawable.setBounds(j, k, i, l);
        drawable.draw(canvas);
        return;
_L7:
        i = j + i1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        LayoutParams layoutparams;
        int i;
        int j;
        i = a;
        layoutparams = (LayoutParams)view.getLayoutParams();
        j = canvas.save(2);
        boolean flag = mCanSlide;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        flag = layoutparams.slideable;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        View view1 = mSlideableView;
        if (view1 == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        canvas.getClipBounds(mTmpRect);
        flag = isLayoutRtlSupport();
        if (flag)
        {
            float f;
            android.graphics.Bitmap bitmap;
            try
            {
                mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_128;
            }
        }
        mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
        canvas.clipRect(mTmpRect);
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        flag = super.drawChild(canvas, view, l);
        if (i == 0) goto _L3; else goto _L2
_L2:
        flag = layoutparams.dimWhenOffset;
        if (!flag) goto _L5; else goto _L4
_L4:
        f = mSlideOffset;
        if (f <= 0.0F) goto _L5; else goto _L6
_L6:
        try
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L8; else goto _L7
_L7:
        canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.dimPaint);
        if (i == 0) goto _L9; else goto _L8
_L8:
        Log.e(z[6], (new StringBuilder()).append(z[4]).append(view).append(z[5]).toString());
        flag = super.drawChild(canvas, view, l);
_L11:
        if (i == 0) goto _L3; else goto _L5
_L5:
        try
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        flag = super.drawChild(canvas, view, l);
_L3:
        canvas.restoreToCount(j);
        return flag;
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        throw canvas;
        canvas;
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        throw canvas;
_L9:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
label0:
        {
            try
            {
                if (!(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams))
                {
                    break label0;
                }
                layoutparams = new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
            }
            // Misplaced declaration of an exception variable
            catch (android.view.ViewGroup.LayoutParams layoutparams)
            {
                throw layoutparams;
            }
            return layoutparams;
        }
        return new LayoutParams(layoutparams);
    }

    boolean isDimmed(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        boolean flag = mCanSlide;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = ((LayoutParams) (view)).dimWhenOffset;
        if (!flag) goto _L2; else goto _L3
_L3:
        float f;
        try
        {
            f = mSlideOffset;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (f <= 0.0F) goto _L2; else goto _L4
_L4:
        flag = true;
_L6:
        return flag;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isOpen()
    {
        boolean flag;
        try
        {
            flag = mCanSlide;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (mSlideOffset != 1.0F)
        {
            return false;
        }
        return true;
    }

    public boolean isSlideable()
    {
        return mCanSlide;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        int j = a;
        super.onDetachedFromWindow();
        mFirstLayout = true;
        int k = mPostedRunnables.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    ((DisableLayerRunnable)mPostedRunnables.get(i)).run();
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                mPostedRunnables.clear();
                return;
            }
            i++;
        } while (true);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag2;
        flag2 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        boolean flag1 = mCanSlide;
        if (!flag1 && i == 0)
        {
            int j;
            try
            {
                j = getChildCount();
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            if (j > 1)
            {
                View view = getChildAt(1);
                if (view != null)
                {
                    try
                    {
                        flag1 = mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY());
                    }
                    // Misplaced declaration of an exception variable
                    catch (MotionEvent motionevent)
                    {
                        throw motionevent;
                    }
                    if (!flag1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    mPreservedOpenState = flag1;
                }
            }
        }
        flag1 = mCanSlide;
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag1 = mIsUnableToDrag;
        if (!flag1 || i == 0) goto _L3; else goto _L2
_L2:
        try
        {
            mDragHelper.cancel();
            flag1 = super.onInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
_L8:
        return flag1;
        motionevent;
        throw motionevent;
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        throw motionevent;
_L3:
        if (i == 3 || i == 1)
        {
            try
            {
                mDragHelper.cancel();
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            return false;
        }
        i;
        JVM INSTR tableswitch 0 2: default 204
    //                   0 229
    //                   1 204
    //                   2 379;
           goto _L4 _L5 _L4 _L6
_L4:
        i = 0;
_L13:
        if (mDragHelper.shouldInterceptTouchEvent(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (!i) goto _L8; else goto _L7
_L7:
        return true;
_L5:
        float f;
        float f2;
        mIsUnableToDrag = false;
        f = motionevent.getX();
        f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        if (!mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2)) goto _L4; else goto _L9
_L9:
        flag1 = isDimmed(mSlideableView);
        if (!flag1) goto _L4; else goto _L10
_L10:
        if (a == 0) goto _L12; else goto _L11
_L11:
        boolean flag = true;
_L14:
        float f3 = motionevent.getX();
        float f1 = motionevent.getY();
        f3 = Math.abs(f3 - mInitialMotionX);
        f1 = Math.abs(f1 - mInitialMotionY);
        i = ((flag) ? 1 : 0);
        if (f3 > (float)mDragHelper.getTouchSlop())
        {
            i = ((flag) ? 1 : 0);
            if (f1 > f3)
            {
                try
                {
                    mDragHelper.cancel();
                    mIsUnableToDrag = true;
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
                return false;
            }
        }
          goto _L13
        motionevent;
        throw motionevent;
_L12:
        i = 1;
          goto _L13
_L6:
        flag = false;
          goto _L14
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        float f;
        LayoutParams layoutparams;
        int i1;
        int l1 = a;
        boolean flag1 = isLayoutRtlSupport();
        if (flag1)
        {
            View view;
            int j1;
            int k1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            try
            {
                mDragHelper.setEdgeTrackingEnabled(2);
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_37;
            }
        }
        mDragHelper.setEdgeTrackingEnabled(1);
        i2 = k - i;
        if (flag1)
        {
            try
            {
                i = getPaddingRight();
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        } else
        {
            i = getPaddingLeft();
        }
        if (flag1)
        {
            try
            {
                l = getPaddingLeft();
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        } else
        {
            l = getPaddingRight();
        }
        k2 = getPaddingTop();
        j2 = getChildCount();
        flag = mFirstLayout;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = mCanSlide;
        if (!flag) goto _L4; else goto _L3
_L3:
        try
        {
            flag = mPreservedOpenState;
        }
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        f = 1.0F;
_L19:
        mSlideOffset = f;
_L2:
        i1 = 0;
        k = i;
        j = i;
        i = k;
_L21:
        if (i1 >= j2) goto _L7; else goto _L6
_L6:
        view = getChildAt(i1);
        IllegalStateException illegalstateexception3;
        try
        {
            k = view.getVisibility();
        }
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        if (k == 8 && l1 == 0)
        {
            break MISSING_BLOCK_LABEL_693;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        l2 = view.getMeasuredWidth();
        j1 = 0;
        if (!layoutparams.slideable) goto _L9; else goto _L8
_L8:
        k = layoutparams.leftMargin;
        k1 = layoutparams.rightMargin;
        k1 = Math.min(i, i2 - l - mOverhangSize) - j - (k + k1);
        try
        {
            mSlideRange = k1;
        }
        catch (IllegalStateException illegalstateexception6)
        {
            throw illegalstateexception6;
        }
        if (!flag1) goto _L11; else goto _L10
_L10:
        k = layoutparams.rightMargin;
_L20:
        try
        {
            i3 = l2 / 2;
        }
        catch (IllegalStateException illegalstateexception7)
        {
            throw illegalstateexception7;
        }
        if (j + k + k1 + i3 > i2 - l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        layoutparams.dimWhenOffset = flag;
        k1 = (int)((float)k1 * mSlideOffset);
        j += k + k1;
        f = k1;
        try
        {
            mSlideOffset = f / (float)mSlideRange;
        }
        catch (IllegalStateException illegalstateexception8)
        {
            try
            {
                throw illegalstateexception8;
            }
            catch (IllegalStateException illegalstateexception9)
            {
                throw illegalstateexception9;
            }
        }
        k = j1;
        if (l1 == 0) goto _L12; else goto _L9
_L9:
        if (!mCanSlide) goto _L14; else goto _L13
_L13:
        j = mParallaxBy;
        if (j == 0) goto _L14; else goto _L15
_L15:
        j = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
        if (l1 == 0) goto _L17; else goto _L16
_L16:
        k = j;
        j = i;
_L12:
label0:
        {
            if (flag1)
            {
                k1 = (i2 - j) + k;
                j1 = k1 - l2;
                if (l1 == 0)
                {
                    break label0;
                }
            }
            j1 = j - k;
            k1 = j1 + l2;
        }
        view.layout(j1, k2, k1, view.getMeasuredHeight() + k2);
        k = view.getWidth() + i;
        i = j;
        j = k;
_L22:
        if (l1 == 0) goto _L18; else goto _L7
_L7:
        flag = mFirstLayout;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_544;
        }
        flag = mCanSlide;
label1:
        {
            if (flag)
            {
                IllegalStateException illegalstateexception10;
                try
                {
                    if (mParallaxBy != 0)
                    {
                        parallaxOtherViews(mSlideOffset);
                    }
                }
                catch (IllegalStateException illegalstateexception11)
                {
                    throw illegalstateexception11;
                }
                try
                {
                    if (!((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
                    {
                        break label1;
                    }
                    dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
                }
                catch (IllegalStateException illegalstateexception12)
                {
                    throw illegalstateexception12;
                }
                if (l1 == 0)
                {
                    break label1;
                }
            }
            i = 0;
            do
            {
                if (i >= j2)
                {
                    break;
                }
                dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
                i++;
            } while (l1 == 0);
        }
        updateObscuredViewsVisibility(mSlideableView);
        mFirstLayout = false;
        return;
        illegalstateexception3;
        throw illegalstateexception3;
        illegalstateexception3;
        throw illegalstateexception3;
_L4:
        f = 0.0F;
          goto _L19
_L11:
        k = layoutparams.leftMargin;
          goto _L20
        illegalstateexception10;
        throw illegalstateexception10;
        illegalstateexception10;
        throw illegalstateexception10;
_L18:
        i1++;
        k = i;
        i = j;
        j = k;
          goto _L21
_L17:
        k = j;
        j = i;
          goto _L12
_L14:
        j = 0;
          goto _L16
        k = j;
        j = i;
        i = k;
          goto _L22
    }

    protected void onMeasure(int i, int j)
    {
        int l;
        int j1;
        int i2;
        int j2;
        int i3;
label0:
        {
            i3 = a;
            i2 = android.view.View.MeasureSpec.getMode(i);
            int k = android.view.View.MeasureSpec.getSize(i);
            int i1 = android.view.View.MeasureSpec.getMode(j);
            int k1 = android.view.View.MeasureSpec.getSize(j);
            if (i2 != 0x40000000)
            {
                boolean flag;
                try
                {
                    flag = isInEditMode();
                }
                catch (IllegalStateException illegalstateexception1)
                {
                    throw illegalstateexception1;
                }
                if (flag)
                {
                    i = i2;
                    if (i2 == 0x80000000)
                    {
                        i = 0x40000000;
                        j = k1;
                        j2 = i1;
                        i2 = k;
                        if (i3 == 0)
                        {
                            break label0;
                        }
                    }
                    j = k1;
                    j2 = i1;
                    i2 = k;
                    if (i != 0)
                    {
                        break label0;
                    }
                    i2 = 300;
                    j = k1;
                    j2 = i1;
                    if (i3 == 0)
                    {
                        break label0;
                    }
                }
                try
                {
                    throw new IllegalStateException(z[3]);
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
            }
            j = k1;
            j2 = i1;
            i2 = k;
            if (i1 != 0)
            {
                break label0;
            }
            boolean flag1;
            try
            {
                flag1 = isInEditMode();
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
            if (flag1)
            {
                j = k1;
                j2 = i1;
                i2 = k;
                if (i1 != 0)
                {
                    break label0;
                }
                j2 = 0x80000000;
                j = 300;
                i2 = k;
                if (i3 == 0)
                {
                    break label0;
                }
            }
            try
            {
                throw new IllegalStateException(z[0]);
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        i = 0;
        j1 = 0;
        l = -1;
        j2;
        JVM INSTR lookupswitch 2: default 256
    //                   -2147483648: 958
    //                   1073741824: 941;
           goto _L1 _L2 _L3
_L1:
        i = j1;
_L40:
        float f;
        float f1;
        Object obj;
        LayoutParams layoutparams;
        int l1;
        int k2;
        int l2;
        boolean flag2;
        flag2 = false;
        l2 = i2 - getPaddingLeft() - getPaddingRight();
        int j3 = getChildCount();
        float f2;
        View view;
        int k3;
        int l3;
        if (j3 > 2)
        {
            try
            {
                Log.e(z[1], z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        mSlideableView = null;
        k2 = 0;
        j = l2;
        j1 = i;
        f = 0.0F;
        i = j;
        j = j1;
_L37:
        if (k2 >= j3) goto _L5; else goto _L4
_L4:
        obj = getChildAt(k2);
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        j1 = ((View) (obj)).getVisibility();
        if (j1 != 8) goto _L7; else goto _L6
_L6:
        try
        {
            layoutparams.dimWhenOffset = false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i3 == 0) goto _L8; else goto _L7
_L7:
        f2 = layoutparams.weight;
        f1 = f;
        if (f2 <= 0.0F) goto _L10; else goto _L9
_L9:
        f += layoutparams.weight;
        try
        {
            j1 = layoutparams.width;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        f1 = f;
        if (j1 != 0) goto _L10; else goto _L8
_L8:
        if (i3 == 0) goto _L12; else goto _L11
_L11:
        j1 = i;
_L38:
        if (!flag2 && f <= 0.0F) goto _L14; else goto _L13
_L13:
        k2 = l2 - mOverhangSize;
        l1 = 0;
_L36:
        if (l1 >= j3) goto _L14; else goto _L15
_L15:
        obj = getChildAt(l1);
        boolean flag3;
        try
        {
            i = ((View) (obj)).getVisibility();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i == 8 && i3 == 0) goto _L17; else goto _L16
_L16:
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        i = ((View) (obj)).getVisibility();
        if (i == 8 && i3 == 0) goto _L17; else goto _L18
_L18:
        i = layoutparams.width;
        if (i != 0) goto _L20; else goto _L19
_L19:
        try
        {
            f1 = layoutparams.weight;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (f1 <= 0.0F) goto _L20; else goto _L21
_L21:
        i = 1;
_L35:
        if (i != 0)
        {
            j2 = 0;
        } else
        {
            j2 = ((View) (obj)).getMeasuredWidth();
        }
        if (!flag2) goto _L23; else goto _L22
_L22:
        view = mSlideableView;
        if (obj == view) goto _L23; else goto _L24
_L24:
        k3 = layoutparams.width;
        if (k3 >= 0) goto _L17; else goto _L25
_L25:
        if (j2 > k2) goto _L27; else goto _L26
_L26:
        f1 = layoutparams.weight;
        if (f1 <= 0.0F) goto _L17; else goto _L27
_L27:
label1:
        {
            if (i != 0)
            {
                IllegalStateException illegalstateexception4;
                try
                {
                    i = layoutparams.height;
                }
                catch (IllegalStateException illegalstateexception5)
                {
                    throw illegalstateexception5;
                }
                if (i == -2)
                {
                    i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
                    if (i3 == 0)
                    {
                        break label1;
                    }
                }
                try
                {
                    i = layoutparams.height;
                }
                catch (IllegalStateException illegalstateexception6)
                {
                    throw illegalstateexception6;
                }
                if (i == -1)
                {
                    i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                    if (i3 == 0)
                    {
                        break label1;
                    }
                }
                i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                if (i3 == 0)
                {
                    break label1;
                }
            }
            i = android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredHeight(), 0x40000000);
        }
        k3 = android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000);
        ((View) (obj)).measure(k3, i);
        if (i3 == 0) goto _L17; else goto _L23
_L23:
        try
        {
            f1 = layoutparams.weight;
        }
        catch (IllegalStateException illegalstateexception8)
        {
            try
            {
                throw illegalstateexception8;
            }
            catch (IllegalStateException illegalstateexception9)
            {
                throw illegalstateexception9;
            }
        }
        if (f1 <= 0.0F) goto _L17; else goto _L28
_L28:
        if (layoutparams.width != 0)
        {
            break MISSING_BLOCK_LABEL_784;
        }
        i = layoutparams.height;
        if (i == -2)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
            if (i3 == 0)
            {
                break MISSING_BLOCK_LABEL_796;
            }
        }
        IllegalStateException illegalstateexception7;
        try
        {
            i = layoutparams.height;
        }
        catch (IllegalStateException illegalstateexception10)
        {
            throw illegalstateexception10;
        }
        if (i == -1)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
            if (i3 == 0)
            {
                break MISSING_BLOCK_LABEL_796;
            }
        }
        i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        if (i3 == 0)
        {
            break MISSING_BLOCK_LABEL_796;
        }
        i = android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredHeight(), 0x40000000);
        if (!flag2) goto _L30; else goto _L29
_L29:
        k3 = l2 - (layoutparams.leftMargin + layoutparams.rightMargin);
        l3 = android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000);
        if (j2 != k3)
        {
            try
            {
                ((View) (obj)).measure(l3, i);
            }
            catch (IllegalStateException illegalstateexception11)
            {
                throw illegalstateexception11;
            }
        }
        if (i3 == 0) goto _L17; else goto _L30
_L30:
        k3 = Math.max(0, j1);
        ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams.weight * (float)k3) / f) + j2, 0x40000000), i);
_L17:
        if (i3 == 0) goto _L31; else goto _L14
_L14:
        i = getPaddingTop();
        l = getPaddingBottom();
        try
        {
            setMeasuredDimension(i2, i + j + l);
            mCanSlide = flag2;
            i = mDragHelper.getViewDragState();
        }
        catch (IllegalStateException illegalstateexception12)
        {
            try
            {
                throw illegalstateexception12;
            }
            catch (IllegalStateException illegalstateexception13)
            {
                throw illegalstateexception13;
            }
        }
        if (i == 0 || flag2)
        {
            break MISSING_BLOCK_LABEL_940;
        }
        mDragHelper.abort();
        return;
_L3:
        i = j - getPaddingTop() - getPaddingBottom();
        if (i3 == 0) goto _L32; else goto _L2
_L2:
        l = j - getPaddingTop() - getPaddingBottom();
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
_L10:
label2:
        {
            j1 = layoutparams.leftMargin;
            l1 = layoutparams.rightMargin + j1;
            if (layoutparams.width == -2)
            {
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(l2 - l1, 0x80000000);
                if (i3 == 0)
                {
                    break label2;
                }
            }
            try
            {
                j1 = layoutparams.width;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (j1 == -1)
            {
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(l2 - l1, 0x40000000);
                if (i3 == 0)
                {
                    break label2;
                }
            }
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
label3:
        {
            if (layoutparams.height == -2)
            {
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
                if (i3 == 0)
                {
                    break label3;
                }
            }
            try
            {
                l1 = layoutparams.height;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (l1 == -1)
            {
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                if (i3 == 0)
                {
                    break label3;
                }
            }
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        }
        ((View) (obj)).measure(j1, l1);
        j1 = ((View) (obj)).getMeasuredWidth();
        l1 = ((View) (obj)).getMeasuredHeight();
        if (j2 == 0x80000000 && l1 > j)
        {
            j = Math.min(l1, l);
        }
        i -= j1;
        if (i < 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        layoutparams.slideable = flag3;
        flag2 |= flag3;
        if (!layoutparams.slideable) goto _L34; else goto _L33
_L33:
        mSlideableView = ((View) (obj));
        f = f1;
          goto _L8
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L20:
        i = 0;
          goto _L35
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception7;
        throw illegalstateexception7;
_L31:
        l1++;
          goto _L36
_L12:
        k2++;
          goto _L37
_L34:
        f = f1;
          goto _L8
_L5:
        j1 = i;
          goto _L38
_L32:
        l = i;
        if (true) goto _L40; else goto _L39
_L39:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        boolean flag;
        try
        {
            super.onRestoreInstanceState(parcelable.getSuperState());
            flag = ((SavedState) (parcelable)).isOpen;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            try
            {
                throw parcelable;
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        openPane();
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        closePane();
        mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
        return;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (!isSlideable()) goto _L2; else goto _L1
_L1:
        boolean flag = isOpen();
_L4:
        savedstate.isOpen = flag;
        return savedstate;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
_L2:
        flag = mPreservedOpenState;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        try
        {
            super.onSizeChanged(i, j, k, l);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (i == k)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        mFirstLayout = true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mCanSlide) goto _L2; else goto _L1
_L1:
        boolean flag = super.onTouchEvent(motionevent);
_L7:
        return flag;
        motionevent;
        throw motionevent;
_L2:
        int i;
        boolean flag1;
        mDragHelper.processTouchEvent(motionevent);
        i = motionevent.getAction();
        flag1 = true;
        i & 0xff;
        JVM INSTR tableswitch 0 1: default 64
    //                   0 66
    //                   1 96;
           goto _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        return true;
_L4:
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        float f2;
        float f3;
        int j;
        boolean flag2;
        try
        {
            mInitialMotionX = f;
            mInitialMotionY = f1;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        flag = flag1;
        if (a == 0) goto _L7; else goto _L6
_L6:
        flag2 = isDimmed(mSlideableView);
        flag = flag1;
        if (!flag2) goto _L7; else goto _L8
_L8:
        f = motionevent.getX();
        f1 = motionevent.getY();
        f2 = f - mInitialMotionX;
        f3 = f1 - mInitialMotionY;
        j = mDragHelper.getTouchSlop();
        flag = flag1;
        if (f2 * f2 + f3 * f3 >= (float)(j * j)) goto _L7; else goto _L9
_L9:
        flag = flag1;
        if (!mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f1)) goto _L7; else goto _L10
_L10:
        closePane(mSlideableView, 0);
        return true;
        motionevent;
        throw motionevent;
    }

    public boolean openPane()
    {
        return openPane(mSlideableView, 0);
    }

    public void requestChildFocus(View view, View view1)
    {
        boolean flag;
        super.requestChildFocus(view, view1);
        flag = isInTouchMode();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        flag = mCanSlide;
        if (!flag)
        {
            boolean flag1;
            try
            {
                view1 = mSlideableView;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (view == view1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mPreservedOpenState = flag1;
        }
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    void setAllChildrenVisible()
    {
        int i = 0;
        int j = a;
        int k = getChildCount();
        do
        {
            if (i >= k)
            {
                break;
            }
            View view = getChildAt(i);
            try
            {
                if (view.getVisibility() == 4)
                {
                    view.setVisibility(0);
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            i++;
        } while (j == 0);
    }

    boolean smoothSlideTo(float f, int i)
    {
label0:
        {
            boolean flag;
            try
            {
                flag = mCanSlide;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (!flag)
            {
                return false;
            }
            flag = isLayoutRtlSupport();
            LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
            if (flag)
            {
                i = getPaddingRight();
                int j = layoutparams.rightMargin;
                int k = mSlideableView.getWidth();
                i = (int)((float)getWidth() - ((float)(i + j) + (float)mSlideRange * f + (float)k));
                if (a == 0)
                {
                    break label0;
                }
            }
            i = getPaddingLeft();
            i = (int)((float)(layoutparams.leftMargin + i) + (float)mSlideRange * f);
        }
label1:
        {
            try
            {
                if (!mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
                {
                    break label1;
                }
                setAllChildrenVisible();
                ViewCompat.postInvalidateOnAnimation(this);
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            return true;
        }
        return false;
    }

    void updateObscuredViewsVisibility(View view)
    {
        int i;
        int j;
        int k1;
label0:
        {
            int i2 = a;
            boolean flag = isLayoutRtlSupport();
            if (flag)
            {
                View view1;
                int k;
                int l;
                int i1;
                int j1;
                int j2;
                int k2;
                int l2;
                int i3;
                int j3;
                int k3;
                int l3;
                boolean flag1;
                try
                {
                    i = getWidth();
                    j = getPaddingRight();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                i -= j;
            } else
            {
                i = getPaddingLeft();
            }
            if (flag)
            {
                try
                {
                    j = getPaddingLeft();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
            } else
            {
                j = getWidth() - getPaddingRight();
            }
            j2 = getPaddingTop();
            k2 = getHeight();
            l2 = getPaddingBottom();
            if (view != null)
            {
                try
                {
                    flag1 = viewIsOpaque(view);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (flag1)
                {
                    j1 = view.getLeft();
                    i1 = view.getRight();
                    l = view.getTop();
                    k = view.getBottom();
                    if (i2 == 0)
                    {
                        break label0;
                    }
                }
            }
            k = 0;
            l = 0;
            i1 = 0;
            j1 = 0;
        }
        i3 = getChildCount();
        k1 = 0;
        do
        {
label1:
            {
label2:
                {
label3:
                    {
                        if (k1 >= i3)
                        {
                            break label2;
                        }
                        view1 = getChildAt(k1);
                        if (view1 == view && i2 == 0)
                        {
                            break label2;
                        }
                        int l1;
                        if (flag)
                        {
                            l1 = j;
                        } else
                        {
                            l1 = i;
                        }
                        j3 = Math.max(l1, view1.getLeft());
                        k3 = Math.max(j2, view1.getTop());
                        if (flag)
                        {
                            l1 = i;
                        } else
                        {
                            l1 = j;
                        }
                        l1 = Math.min(l1, view1.getRight());
                        l3 = Math.min(k2 - l2, view1.getBottom());
                        if (j3 >= j1 && k3 >= l && l1 <= i1 && l3 <= k)
                        {
                            l1 = 4;
                            if (i2 == 0)
                            {
                                break label3;
                            }
                        }
                        l1 = 0;
                    }
                    view1.setVisibility(l1);
                    if (i2 == 0)
                    {
                        break label1;
                    }
                }
                return;
            }
            k1++;
        } while (true);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[7];
        obj = "}_{\022bA\032\177\000yA\032|\032~\025XwU_{iB0I||[0N";
        byte0 = -1;
        j = 0;
_L10:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L7:
        if (l <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "fV{\021c[]B\024dPvs\fe@N";
                j = 1;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "ZT_\020kFO`\0200\025w}\007o\025Nz\024d\025Ne\032*VR{\031n\025L{\020}F\032s\007o\025T}\001*FOb\005eGNw\021$";
                j = 2;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "bSv\001b\025Wg\006~\025Rs\003o\025[|UoM[q\001*C[~\000o\025U`UGtnQ=Ue{@0Da";
                j = 3;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "QHs\002I]S~\0210\025Yz\034fQ\032d\034oB\032";
                j = 4;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "\025Hw\001\177GTw\021*[O~\031*QHs\002c[]2\026kVRw";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "fV{\021c[]B\024dPvs\fe@N";
                byte0 = 5;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[j] = ((String) (obj));
                z = as;
                int i = android.os.Build.VERSION.SDK_INT;
                byte byte1;
                char c;
                if (i >= 17)
                {
                    try
                    {
                        IMPL = new SlidingPanelLayoutImplJBMR1();
                    }
                    catch (IllegalStateException illegalstateexception)
                    {
                        throw illegalstateexception;
                    }
                } else
                if (i >= 16)
                {
                    try
                    {
                        IMPL = new SlidingPanelLayoutImplJB();
                    }
                    catch (IllegalStateException illegalstateexception1)
                    {
                        throw illegalstateexception1;
                    }
                } else
                {
                    IMPL = new SlidingPanelLayoutImplBase();
                }
                break;
            }
            break MISSING_BLOCK_LABEL_340;
        }
        c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_300;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 10;
_L8:
        obj[k] = (char)(byte1 ^ c);
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 53;
          goto _L8
_L3:
        byte1 = 58;
          goto _L8
_L4:
        byte1 = 18;
          goto _L8
        byte1 = 117;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }








/*
    static boolean access$502(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.mPreservedOpenState = flag;
        return flag;
    }

*/




    private class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        private final Rect mTmpRect = new Rect();
        final SlidingPaneLayout this$0;

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
            Rect rect = mTmpRect;
            accessibilitynodeinfocompat1.getBoundsInParent(rect);
            accessibilitynodeinfocompat.setBoundsInParent(rect);
            accessibilitynodeinfocompat1.getBoundsInScreen(rect);
            accessibilitynodeinfocompat.setBoundsInScreen(rect);
            accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
            accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
            accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
            accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
            accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
            accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
            accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
            accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
            accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
            accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
            accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
            accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
            accessibilitynodeinfocompat.setMovementGranularities(accessibilitynodeinfocompat1.getMovementGranularities());
        }

        public boolean filter(View view)
        {
            return isDimmed(view);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            int j = SlidingPaneLayout.a;
            AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
            copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat1.recycle();
            accessibilitynodeinfocompat.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
            accessibilitynodeinfocompat.setSource(view);
            view = ViewCompat.getParentForAccessibility(view);
            if (view instanceof View)
            {
                accessibilitynodeinfocompat.setParent((View)view);
            }
            int k = getChildCount();
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                view = getChildAt(i);
                if (!filter(view) && view.getVisibility() == 0)
                {
                    ViewCompat.setImportantForAccessibility(view, 1);
                    accessibilitynodeinfocompat.addChild(view);
                }
                i++;
            } while (j == 0);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (!filter(view))
            {
                return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        AccessibilityDelegate()
        {
            this$0 = SlidingPaneLayout.this;
            super();
        }
    }


    private class DragHelperCallback extends ViewDragHelper.Callback
    {

        final SlidingPaneLayout this$0;

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
label0:
            {
                view = (LayoutParams)mSlideableView.getLayoutParams();
                if (isLayoutRtlSupport())
                {
                    j = getWidth() - (getPaddingRight() + ((LayoutParams) (view)).rightMargin + mSlideableView.getWidth());
                    int k = mSlideRange;
                    j = Math.max(Math.min(i, j), j - k);
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                j = getPaddingLeft();
                j = ((LayoutParams) (view)).leftMargin + j;
                int l = mSlideRange;
                return Math.min(Math.max(i, j), l + j);
            }
            return j;
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view)
        {
            return mSlideRange;
        }

        public void onEdgeDragStarted(int i, int j)
        {
            mDragHelper.captureChildView(mSlideableView, j);
        }

        public void onViewCaptured(View view, int i)
        {
            setAllChildrenVisible();
        }

        public void onViewDragStateChanged(int i)
        {
label0:
            {
                if (mDragHelper.getViewDragState() != 0)
                {
                    break label0;
                }
                if (mSlideOffset == 0.0F)
                {
                    updateObscuredViewsVisibility(mSlideableView);
                    dispatchOnPanelClosed(mSlideableView);
                    mPreservedOpenState = false;
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                dispatchOnPanelOpened(mSlideableView);
                mPreservedOpenState = true;
            }
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            onPanelDragged(i);
            invalidate();
        }

        public void onViewReleased(View view, float f, float f1)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (!isLayoutRtlSupport()) goto _L2; else goto _L1
_L1:
            int i;
            int k;
            int l;
label0:
            {
                int j = getPaddingRight() + layoutparams.rightMargin;
                if (f >= 0.0F)
                {
                    i = j;
                    if (f != 0.0F)
                    {
                        break label0;
                    }
                    i = j;
                    if (mSlideOffset <= 0.5F)
                    {
                        break label0;
                    }
                }
                i = j + mSlideRange;
            }
            k = mSlideableView.getWidth();
            l = getWidth();
            if (SlidingPaneLayout.a == 0) goto _L3; else goto _L2
_L2:
label1:
            {
                i = getPaddingLeft();
                k = layoutparams.leftMargin + i;
                if (f <= 0.0F)
                {
                    i = k;
                    if (f != 0.0F)
                    {
                        break label1;
                    }
                    i = k;
                    if (mSlideOffset <= 0.5F)
                    {
                        break label1;
                    }
                }
                i = k + mSlideRange;
            }
_L5:
            mDragHelper.settleCapturedViewAt(i, view.getTop());
            invalidate();
            return;
_L3:
            i = l - i - k;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public boolean tryCaptureView(View view, int i)
        {
            if (mIsUnableToDrag)
            {
                return false;
            } else
            {
                return ((LayoutParams)view.getLayoutParams()).slideable;
            }
        }

        private DragHelperCallback()
        {
            this$0 = SlidingPaneLayout.this;
            super();
        }

        DragHelperCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int ATTRS[] = {
            0x1010181
        };
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;


        public LayoutParams()
        {
            super(-1, -1);
            weight = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            weight = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ATTRS);
            weight = context.getFloat(0, 0.0F);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            weight = 0.0F;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            weight = 0.0F;
        }
    }


    private class DisableLayerRunnable
        implements Runnable
    {

        final View mChildView;
        final SlidingPaneLayout this$0;

        public void run()
        {
            if (mChildView.getParent() == SlidingPaneLayout.this)
            {
                ViewCompat.setLayerType(mChildView, 0, null);
                invalidateChildRegion(mChildView);
            }
            mPostedRunnables.remove(this);
        }

        DisableLayerRunnable(View view)
        {
            this$0 = SlidingPaneLayout.this;
            super();
            mChildView = view;
        }
    }


    private class SlidingPanelLayoutImpl
    {

        public abstract void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view);
    }


    private class PanelSlideListener
    {

        public abstract void onPanelClosed(View view);

        public abstract void onPanelOpened(View view);

        public abstract void onPanelSlide(View view, float f);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        boolean isOpen;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (isOpen)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isOpen = flag;
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }


    private class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase
    {
        private class SlidingPanelLayoutImplBase
            implements SlidingPanelLayoutImpl
        {

            public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
            {
                ViewCompat.postInvalidateOnAnimation(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }

            SlidingPanelLayoutImplBase()
            {
            }
        }


        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            ViewCompat.setLayerPaint(view, ((LayoutParams)view.getLayoutParams()).dimPaint);
        }

        SlidingPanelLayoutImplJBMR1()
        {
        }
    }


    private class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImplBase
    {

        private static final String z[];
        private Method mGetDisplayList;
        private Field mRecreateDisplayList;

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            if (mGetDisplayList == null) goto _L2; else goto _L1
_L1:
            Field field = mRecreateDisplayList;
            if (field == null) goto _L2; else goto _L3
_L3:
            mRecreateDisplayList.setBoolean(view, true);
            mGetDisplayList.invoke(view, (Object[])null);
_L4:
            super.invalidateChildRegion(slidingpanelayout, view);
            return;
            slidingpanelayout;
            throw slidingpanelayout;
            Exception exception;
            exception;
            Log.e(z[0], z[1], exception);
            if (SlidingPaneLayout.a == 0) goto _L4; else goto _L2
_L2:
            view.invalidate();
            return;
            slidingpanelayout;
            throw slidingpanelayout;
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[8];
            obj = "\177ZLY{BQu\\|IzDD}YB";
            byte0 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "iDWR`\fD@[`IEMT|K\026ATa\\ZDD2@_VI2_BDIw";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "oYPQvB\021Q\035tIBFU2KSQy{_FI\\k`_VI2ASQU}H\r\005Y{A[LSu\fAJS5X\026RR`G\026WTuDB\013";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "\177ZLY{BQu\\|IzDD}YB";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = "KSQy{_FI\\k`_VI";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = "\177ZLY{BQu\\|IzDD}YB";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    i = 6;
                    obj = "Ad@^`IWQXVEEUQsUzLNf";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i] = ((String) (obj));
                    i = 7;
                    obj = "oYPQvB\021Q\035tIBFU2Ad@^`IWQXVEEUQsUzLNf\fPLX~H\r\005Y{A[LSu\fALQ~\fT@\035a@YR\023";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 256
        //                       0 279
        //                       1 286
        //                       2 293
        //                       3 300;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_300;
_L3:
            byte byte1 = 18;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 44;
              goto _L9
_L5:
            byte1 = 54;
              goto _L9
_L6:
            byte1 = 37;
              goto _L9
            byte1 = 61;
              goto _L9
        }

        SlidingPanelLayoutImplJB()
        {
            try
            {
                mGetDisplayList = android/view/View.getDeclaredMethod(z[4], (Class[])null);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e(z[5], z[2], nosuchmethodexception);
            }
            try
            {
                mRecreateDisplayList = android/view/View.getDeclaredField(z[6]);
                mRecreateDisplayList.setAccessible(true);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e(z[3], z[7], nosuchfieldexception);
            }
        }
    }

}
