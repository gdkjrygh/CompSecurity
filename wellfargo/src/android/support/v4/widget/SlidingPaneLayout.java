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

    private static final int DEFAULT_FADE_COLOR = 0xcccccccc;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    static final SlidingPanelLayoutImpl IMPL;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
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
        boolean flag = false;
        if (mFirstLayout || smoothSlideTo(0.0F, i))
        {
            mPreservedOpenState = false;
            flag = true;
        }
        return flag;
    }

    private void dimChildView(View view, float f, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f > 0.0F && i != 0)
        {
            int j = (int)((float)((0xff000000 & i) >>> 24) * f);
            if (layoutparams.dimPaint == null)
            {
                layoutparams.dimPaint = new Paint();
            }
            layoutparams.dimPaint.setColorFilter(new PorterDuffColorFilter(j << 24 | 0xffffff & i, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (ViewCompat.getLayerType(view) != 2)
            {
                ViewCompat.setLayerType(view, 2, layoutparams.dimPaint);
            }
            invalidateChildRegion(view);
        } else
        if (ViewCompat.getLayerType(view) != 0)
        {
            if (layoutparams.dimPaint != null)
            {
                layoutparams.dimPaint.setColorFilter(null);
            }
            view = new DisableLayerRunnable(view);
            mPostedRunnables.add(view);
            ViewCompat.postOnAnimation(this, view);
            return;
        }
    }

    private void invalidateChildRegion(View view)
    {
        IMPL.invalidateChildRegion(this, view);
    }

    private boolean isLayoutRtlSupport()
    {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    private void onPanelDragged(int i)
    {
        if (mSlideableView == null)
        {
            mSlideOffset = 0.0F;
            return;
        }
        boolean flag = isLayoutRtlSupport();
        LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
        int k = mSlideableView.getWidth();
        int j = i;
        if (flag)
        {
            j = getWidth() - i - k;
        }
        if (flag)
        {
            i = getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag)
        {
            k = layoutparams.rightMargin;
        } else
        {
            k = layoutparams.leftMargin;
        }
        mSlideOffset = (float)(j - (k + i)) / (float)mSlideRange;
        if (mParallaxBy != 0)
        {
            parallaxOtherViews(mSlideOffset);
        }
        if (layoutparams.dimWhenOffset)
        {
            dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
        }
        dispatchOnPanelSlide(mSlideableView);
    }

    private boolean openPane(View view, int i)
    {
        if (mFirstLayout || smoothSlideTo(1.0F, i))
        {
            mPreservedOpenState = true;
            return true;
        } else
        {
            return false;
        }
    }

    private void parallaxOtherViews(float f)
    {
        Object obj;
        int i;
        boolean flag;
        flag = isLayoutRtlSupport();
        obj = (LayoutParams)mSlideableView.getLayoutParams();
        if (((LayoutParams) (obj)).dimWhenOffset)
        {
label0:
            {
                int j;
                int i1;
                if (flag)
                {
                    i = ((LayoutParams) (obj)).rightMargin;
                } else
                {
                    i = ((LayoutParams) (obj)).leftMargin;
                }
                if (i <= 0)
                {
                    i = 1;
                    break label0;
                }
            }
        }
        i = 0;
        continue;
        while (true) 
        {
            i1 = getChildCount();
            j = 0;
            while (j < i1) 
            {
                obj = getChildAt(j);
                if (obj != mSlideableView)
                {
                    int k = (int)((1.0F - mParallaxOffset) * (float)mParallaxBy);
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
                            f1 = mParallaxOffset - 1.0F;
                        } else
                        {
                            f1 = 1.0F - mParallaxOffset;
                        }
                        dimChildView(((View) (obj)), f1, mCoveredFadeColor);
                    }
                }
                j++;
            }
            return;
        }
    }

    private static boolean viewIsOpaque(View view)
    {
        if (!ViewCompat.isOpaque(view))
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                return false;
            }
            view = view.getBackground();
            if (view != null)
            {
                if (view.getOpacity() != -1)
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

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l;
        int i1;
        int j1;
        viewgroup = (ViewGroup)view;
        i1 = view.getScrollX();
        j1 = view.getScrollY();
        l = viewgroup.getChildCount() - 1;
_L8:
        if (l < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l);
        if (j + i1 < view1.getLeft() || j + i1 >= view1.getRight() || k + j1 < view1.getTop() || k + j1 >= view1.getBottom() || !canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!isLayoutRtlSupport())
        {
            i = -i;
        }
        if (ViewCompat.canScrollHorizontally(view, i)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean canSlide()
    {
        return mCanSlide;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public boolean closePane()
    {
        return closePane(mSlideableView, 0);
    }

    public void computeScroll()
    {
label0:
        {
            if (mDragHelper.continueSettling(true))
            {
                if (mCanSlide)
                {
                    break label0;
                }
                mDragHelper.abort();
            }
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dispatchOnPanelClosed(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelOpened(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelSlide(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelSlide(view, mSlideOffset);
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (isLayoutRtlSupport())
        {
            drawable = mShadowDrawableRight;
        } else
        {
            drawable = mShadowDrawableLeft;
        }
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || drawable == null)
        {
            return;
        }
        int k = view.getTop();
        int l = view.getBottom();
        int i1 = drawable.getIntrinsicWidth();
        int i;
        int j;
        if (isLayoutRtlSupport())
        {
            j = view.getRight();
            i = j + i1;
        } else
        {
            i = view.getLeft();
            j = i - i1;
        }
        drawable.setBounds(j, k, i, l);
        drawable.draw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i = canvas.save(2);
        boolean flag;
        if (mCanSlide && !layoutparams.slideable && mSlideableView != null)
        {
            canvas.getClipBounds(mTmpRect);
            if (isLayoutRtlSupport())
            {
                mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
            } else
            {
                mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
            }
            canvas.clipRect(mTmpRect);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = super.drawChild(canvas, view, l);
        } else
        if (layoutparams.dimWhenOffset && mSlideOffset > 0.0F)
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.dimPaint);
                flag = false;
            } else
            {
                Log.e("SlidingPaneLayout", (new StringBuilder()).append("drawChild: child view ").append(view).append(" returned null drawing cache").toString());
                flag = super.drawChild(canvas, view, l);
            }
        } else
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
            flag = super.drawChild(canvas, view, l);
        }
        canvas.restoreToCount(i);
        return flag;
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
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getCoveredFadeColor()
    {
        return mCoveredFadeColor;
    }

    public int getParallaxDistance()
    {
        return mParallaxBy;
    }

    public int getSliderFadeColor()
    {
        return mSliderFadeColor;
    }

    boolean isDimmed(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        boolean flag;
        if (mCanSlide && ((LayoutParams) (view)).dimWhenOffset && mSlideOffset > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public boolean isOpen()
    {
        return !mCanSlide || mSlideOffset == 1.0F;
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
        super.onDetachedFromWindow();
        mFirstLayout = true;
        int j = mPostedRunnables.size();
        for (int i = 0; i < j; i++)
        {
            ((DisableLayerRunnable)mPostedRunnables.get(i)).run();
        }

        mPostedRunnables.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (!mCanSlide && i == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mPreservedOpenState = flag;
            }
        }
        if (mCanSlide && (!mIsUnableToDrag || i == 0)) goto _L2; else goto _L1
_L1:
        mDragHelper.cancel();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i == 3 || i == 1)
        {
            mDragHelper.cancel();
            return false;
        }
        i;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 189
    //                   1 164
    //                   2 249;
           goto _L3 _L4 _L3 _L5
_L3:
        i = 0;
_L9:
        if (mDragHelper.shouldInterceptTouchEvent(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!i) goto _L7; else goto _L6
_L6:
        return true;
_L4:
        float f;
        float f2;
        mIsUnableToDrag = false;
        f = motionevent.getX();
        f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        if (!mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2) || !isDimmed(mSlideableView)) goto _L3; else goto _L8
_L8:
        i = 1;
          goto _L9
_L5:
        float f3 = motionevent.getX();
        float f1 = motionevent.getY();
        f3 = Math.abs(f3 - mInitialMotionX);
        f1 = Math.abs(f1 - mInitialMotionY);
        if (f3 > (float)mDragHelper.getTouchSlop() && f1 > f3)
        {
            mDragHelper.cancel();
            mIsUnableToDrag = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag1 = isLayoutRtlSupport();
        int k1;
        int l1;
        int i2;
        if (flag1)
        {
            mDragHelper.setEdgeTrackingEnabled(2);
        } else
        {
            mDragHelper.setEdgeTrackingEnabled(1);
        }
        k1 = k - i;
        if (flag1)
        {
            i = getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag1)
        {
            l = getPaddingLeft();
        } else
        {
            l = getPaddingRight();
        }
        i2 = getPaddingTop();
        l1 = getChildCount();
        if (mFirstLayout)
        {
            float f;
            int i1;
            if (mCanSlide && mPreservedOpenState)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            mSlideOffset = f;
        }
        i1 = 0;
        j = i;
        while (i1 < l1) 
        {
            View view = getChildAt(i1);
            if (view.getVisibility() == 8)
            {
                k = i;
                i = j;
                j = k;
            } else
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int j2 = view.getMeasuredWidth();
                int j1;
                if (layoutparams.slideable)
                {
                    k = layoutparams.leftMargin;
                    j1 = layoutparams.rightMargin;
                    j1 = Math.min(i, k1 - l - mOverhangSize) - j - (k + j1);
                    mSlideRange = j1;
                    if (flag1)
                    {
                        k = layoutparams.rightMargin;
                    } else
                    {
                        k = layoutparams.leftMargin;
                    }
                    if (j + k + j1 + j2 / 2 > k1 - l)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.dimWhenOffset = flag;
                    j1 = (int)((float)j1 * mSlideOffset);
                    j += k + j1;
                    mSlideOffset = (float)j1 / (float)mSlideRange;
                    k = 0;
                } else
                if (mCanSlide && mParallaxBy != 0)
                {
                    k = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
                    j = i;
                } else
                {
                    k = 0;
                    j = i;
                }
                if (flag1)
                {
                    j1 = (k1 - j) + k;
                    k = j1 - j2;
                } else
                {
                    k = j - k;
                    j1 = k + j2;
                }
                view.layout(k, i2, j1, view.getMeasuredHeight() + i2);
                k = view.getWidth() + i;
                i = j;
                j = k;
            }
            i1++;
            k = i;
            i = j;
            j = k;
        }
        if (mFirstLayout)
        {
            if (mCanSlide)
            {
                if (mParallaxBy != 0)
                {
                    parallaxOtherViews(mSlideOffset);
                }
                if (((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
                {
                    dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
                }
            } else
            {
                i = 0;
                while (i < l1) 
                {
                    dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
                    i++;
                }
            }
            updateObscuredViewsVisibility(mSlideableView);
        }
        mFirstLayout = false;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        i1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(j);
        if (i1 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        if (i1 != 0x80000000) goto _L6; else goto _L5
_L5:
        j = k;
        k = l;
_L16:
        k;
        JVM INSTR lookupswitch 2: default 80
    //                   -2147483648: 298
    //                   1073741824: 280;
           goto _L7 _L8 _L9
_L7:
        i = 0;
        i1 = -1;
_L13:
        float f;
        int i3;
        int k3;
        int l3;
        boolean flag;
        flag = false;
        k3 = j - getPaddingLeft() - getPaddingRight();
        l3 = getChildCount();
        if (l3 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        mSlideableView = null;
        i3 = 0;
        l = k3;
        f = 0.0F;
_L11:
        float f1;
        View view;
        LayoutParams layoutparams;
        if (i3 >= l3)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(i3);
        layoutparams = (LayoutParams)view.getLayoutParams();
        int k1;
        if (view.getVisibility() == 8)
        {
            layoutparams.dimWhenOffset = false;
            int j1 = l;
            l = i;
            i = j1;
        } else
        {
label0:
            {
                f1 = f;
                if (layoutparams.weight <= 0.0F)
                {
                    break label0;
                }
                f += layoutparams.weight;
                f1 = f;
                if (layoutparams.width != 0)
                {
                    break label0;
                }
                int l1 = i;
                i = l;
                l = l1;
            }
        }
_L14:
        i3++;
        k1 = l;
        l = i;
        i = k1;
        if (true) goto _L11; else goto _L10
_L6:
        if (i1 == 0)
        {
            k = l;
            j = 300;
            continue; /* Loop/switch isn't completed */
        }
          goto _L12
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        if (l == 0)
        {
            if (isInEditMode())
            {
                if (l == 0)
                {
                    l = 0x80000000;
                    j = k;
                    i = 300;
                    k = l;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
          goto _L12
_L9:
        i = i - getPaddingTop() - getPaddingBottom();
        i1 = i;
          goto _L13
_L8:
        i1 = getPaddingTop();
        k1 = getPaddingBottom();
        l = 0;
        i1 = i - i1 - k1;
        i = l;
          goto _L13
        int i2 = layoutparams.leftMargin + layoutparams.rightMargin;
        int k2;
        int i4;
        boolean flag1;
        if (layoutparams.width == -2)
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i2, 0x80000000);
        } else
        if (layoutparams.width == -1)
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i2, 0x40000000);
        } else
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
        if (layoutparams.height == -2)
        {
            k2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
        } else
        if (layoutparams.height == -1)
        {
            k2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            k2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        }
        view.measure(i2, k2);
        k2 = view.getMeasuredWidth();
        i4 = view.getMeasuredHeight();
        i2 = i;
        if (k == 0x80000000)
        {
            i2 = i;
            if (i4 > i)
            {
                i2 = Math.min(i4, i1);
            }
        }
        i = l - k2;
        if (i < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.slideable = flag1;
        if (layoutparams.slideable)
        {
            mSlideableView = view;
        }
        l = i2;
        flag = flag1 | flag;
        f = f1;
          goto _L14
_L10:
        if (flag || f > 0.0F)
        {
            int j3 = k3 - mOverhangSize;
            int j2 = 0;
            while (j2 < l3) 
            {
                View view1 = getChildAt(j2);
                if (view1.getVisibility() != 8)
                {
                    LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                    if (view1.getVisibility() != 8)
                    {
                        int l2;
                        if (layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
                        {
                            l2 = 0;
                        } else
                        {
                            l2 = view1.getMeasuredWidth();
                        }
                        if (flag && view1 != mSlideableView)
                        {
                            if (layoutparams1.width < 0 && (l2 > j3 || layoutparams1.weight > 0.0F))
                            {
                                if (k != 0)
                                {
                                    if (layoutparams1.height == -2)
                                    {
                                        k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                                    } else
                                    if (layoutparams1.height == -1)
                                    {
                                        k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                                    } else
                                    {
                                        k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                                    }
                                } else
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                                }
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000), k);
                            }
                        } else
                        if (layoutparams1.weight > 0.0F)
                        {
                            if (layoutparams1.width == 0)
                            {
                                if (layoutparams1.height == -2)
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                                } else
                                if (layoutparams1.height == -1)
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                                } else
                                {
                                    k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                                }
                            } else
                            {
                                k = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                            }
                            if (flag)
                            {
                                int j4 = layoutparams1.leftMargin;
                                j4 = k3 - (layoutparams1.rightMargin + j4);
                                int l4 = android.view.View.MeasureSpec.makeMeasureSpec(j4, 0x40000000);
                                if (l2 != j4)
                                {
                                    view1.measure(l4, k);
                                }
                            } else
                            {
                                int k4 = Math.max(0, l);
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams1.weight * (float)k4) / f) + l2, 0x40000000), k);
                            }
                        }
                    }
                }
                j2++;
            }
        }
        setMeasuredDimension(j, getPaddingTop() + i + getPaddingBottom());
        mCanSlide = flag;
        if (mDragHelper.getViewDragState() != 0 && !flag)
        {
            mDragHelper.abort();
        }
        return;
_L12:
        j = k;
        k = l;
        if (true) goto _L16; else goto _L15
_L15:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).isOpen)
        {
            openPane();
        } else
        {
            closePane();
        }
        mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (isSlideable())
        {
            flag = isOpen();
        } else
        {
            flag = mPreservedOpenState;
        }
        savedstate.isOpen = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k)
        {
            mFirstLayout = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (!mCanSlide)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            mDragHelper.processTouchEvent(motionevent);
            int i = motionevent.getAction();
            boolean flag1 = true;
            switch (i & 0xff)
            {
            default:
                return true;

            case 0: // '\0'
                float f = motionevent.getX();
                float f2 = motionevent.getY();
                mInitialMotionX = f;
                mInitialMotionY = f2;
                return true;

            case 1: // '\001'
                flag = flag1;
                break;
            }
            if (isDimmed(mSlideableView))
            {
                float f1 = motionevent.getX();
                float f3 = motionevent.getY();
                float f4 = f1 - mInitialMotionX;
                float f5 = f3 - mInitialMotionY;
                int j = mDragHelper.getTouchSlop();
                flag = flag1;
                if (f4 * f4 + f5 * f5 < (float)(j * j))
                {
                    flag = flag1;
                    if (mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3))
                    {
                        closePane(mSlideableView, 0);
                        return true;
                    }
                }
            }
        }
        return flag;
    }

    public boolean openPane()
    {
        return openPane(mSlideableView, 0);
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !mCanSlide)
        {
            boolean flag;
            if (view == mSlideableView)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mPreservedOpenState = flag;
        }
    }

    void setAllChildrenVisible()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    public void setCoveredFadeColor(int i)
    {
        mCoveredFadeColor = i;
    }

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
        mPanelSlideListener = panelslidelistener;
    }

    public void setParallaxDistance(int i)
    {
        mParallaxBy = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable)
    {
        mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable)
    {
        mShadowDrawableRight = drawable;
    }

    public void setShadowResource(int i)
    {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i)
    {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i)
    {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i)
    {
        mSliderFadeColor = i;
    }

    public void smoothSlideClosed()
    {
        closePane();
    }

    public void smoothSlideOpen()
    {
        openPane();
    }

    boolean smoothSlideTo(float f, int i)
    {
        if (!mCanSlide)
        {
            return false;
        }
        boolean flag = isLayoutRtlSupport();
        LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
        if (flag)
        {
            i = getPaddingRight();
            int j = layoutparams.rightMargin;
            int k = mSlideableView.getWidth();
            i = (int)((float)getWidth() - ((float)(j + i) + (float)mSlideRange * f + (float)k));
        } else
        {
            i = getPaddingLeft();
            i = (int)((float)(layoutparams.leftMargin + i) + (float)mSlideRange * f);
        }
        if (mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
        {
            setAllChildrenVisible();
            ViewCompat.postInvalidateOnAnimation(this);
            return true;
        } else
        {
            return false;
        }
    }

    void updateObscuredViewsVisibility(View view)
    {
        boolean flag = isLayoutRtlSupport();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (flag)
        {
            i = getWidth() - getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag)
        {
            j = getPaddingLeft();
        } else
        {
            j = getWidth() - getPaddingRight();
        }
        i2 = getPaddingTop();
        j2 = getHeight();
        k2 = getPaddingBottom();
        if (view != null && viewIsOpaque(view))
        {
            j1 = view.getLeft();
            i1 = view.getRight();
            l = view.getTop();
            k = view.getBottom();
        } else
        {
            k = 0;
            l = 0;
            i1 = 0;
            j1 = 0;
        }
        l2 = getChildCount();
        k1 = 0;
        do
        {
            View view1;
label0:
            {
                if (k1 < l2)
                {
                    view1 = getChildAt(k1);
                    if (view1 != view)
                    {
                        break label0;
                    }
                }
                return;
            }
            int l1;
            int i3;
            int j3;
            int k3;
            if (flag)
            {
                l1 = j;
            } else
            {
                l1 = i;
            }
            i3 = Math.max(l1, view1.getLeft());
            j3 = Math.max(i2, view1.getTop());
            if (flag)
            {
                l1 = i;
            } else
            {
                l1 = j;
            }
            l1 = Math.min(l1, view1.getRight());
            k3 = Math.min(j2 - k2, view1.getBottom());
            if (i3 >= j1 && j3 >= l && l1 <= i1 && k3 <= k)
            {
                l1 = 4;
            } else
            {
                l1 = 0;
            }
            view1.setVisibility(l1);
            k1++;
        } while (true);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 17)
        {
            IMPL = new SlidingPanelLayoutImplJBMR1();
        } else
        if (i >= 16)
        {
            IMPL = new SlidingPanelLayoutImplJB();
        } else
        {
            IMPL = new SlidingPanelLayoutImplBase();
        }
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
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                view = getChildAt(i);
                if (!filter(view) && view.getVisibility() == 0)
                {
                    ViewCompat.setImportantForAccessibility(view, 1);
                    accessibilitynodeinfocompat.addChild(view);
                }
            }

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
            view = (LayoutParams)mSlideableView.getLayoutParams();
            if (isLayoutRtlSupport())
            {
                j = getWidth();
                int k = getPaddingRight();
                j -= ((LayoutParams) (view)).rightMargin + k + mSlideableView.getWidth();
                k = mSlideRange;
                return Math.max(Math.min(i, j), j - k);
            } else
            {
                j = getPaddingLeft();
                j = ((LayoutParams) (view)).leftMargin + j;
                int l = mSlideRange;
                return Math.min(Math.max(i, j), l + j);
            }
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
                if (mDragHelper.getViewDragState() == 0)
                {
                    if (mSlideOffset != 0.0F)
                    {
                        break label0;
                    }
                    updateObscuredViewsVisibility(mSlideableView);
                    dispatchOnPanelClosed(mSlideableView);
                    mPreservedOpenState = false;
                }
                return;
            }
            dispatchOnPanelOpened(mSlideableView);
            mPreservedOpenState = true;
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
label0:
            {
                i = getPaddingRight();
                int j = layoutparams.rightMargin + i;
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
            int k = mSlideableView.getWidth();
            i = getWidth() - i - k;
_L4:
            mDragHelper.settleCapturedViewAt(i, view.getTop());
            invalidate();
            return;
_L2:
            i = getPaddingLeft();
            int l = layoutparams.leftMargin + i;
            if (f <= 0.0F)
            {
                i = l;
                if (f != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = l;
                if (mSlideOffset <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i = l + mSlideRange;
            if (true) goto _L4; else goto _L3
_L3:
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

        public LayoutParams(int i, int j)
        {
            super(i, j);
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

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            weight = 0.0F;
            weight = layoutparams.weight;
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

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
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

        private Method mGetDisplayList;
        private Field mRecreateDisplayList;

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            if (mGetDisplayList != null && mRecreateDisplayList != null)
            {
                try
                {
                    mRecreateDisplayList.setBoolean(view, true);
                    mGetDisplayList.invoke(view, (Object[])null);
                }
                catch (Exception exception)
                {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", exception);
                }
                super.invalidateChildRegion(slidingpanelayout, view);
                return;
            } else
            {
                view.invalidate();
                return;
            }
        }

        SlidingPanelLayoutImplJB()
        {
            try
            {
                mGetDisplayList = android/view/View.getDeclaredMethod("getDisplayList", (Class[])null);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", nosuchmethodexception);
            }
            try
            {
                mRecreateDisplayList = android/view/View.getDeclaredField("mRecreateDisplayList");
                mRecreateDisplayList.setAccessible(true);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", nosuchfieldexception);
            }
        }
    }

}
