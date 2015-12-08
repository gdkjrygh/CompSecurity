// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

// Referenced classes of package com.walmartlabs.payment.view:
//            ViewDragHelper

public class SlidingUpPanelLayout extends ViewGroup
{
    private class DragHelperCallback extends ViewDragHelper.Callback
    {

        final SlidingUpPanelLayout this$0;

        public int clampViewPositionVertical(View view, int i, int j)
        {
            j = computePanelTopPosition(0.0F);
            int k = computePanelTopPosition(1.0F);
            if (mIsSlidingUp)
            {
                return Math.min(Math.max(i, k), j);
            } else
            {
                return Math.min(Math.max(i, j), k);
            }
        }

        public int getViewVerticalDragRange(View view)
        {
            return mSlideRange;
        }

        public void onViewCaptured(View view, int i)
        {
            setAllChildrenVisible();
        }

        public void onViewDragStateChanged(int i)
        {
            if (mDragHelper.getViewDragState() != 0) goto _L2; else goto _L1
_L1:
            mSlideOffset = computeSlideOffset(mSlideableView.getTop());
            applyParallaxForCurrentSlideOffset();
            if (mSlideOffset != 1.0F) goto _L4; else goto _L3
_L3:
            if (mSlideState != PanelState.EXPANDED)
            {
                updateObscuredViewVisibility();
                mSlideState = PanelState.EXPANDED;
                dispatchOnPanelExpanded(mSlideableView);
            }
_L2:
            return;
_L4:
            if (mSlideOffset != 0.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            if (mSlideState != PanelState.COLLAPSED)
            {
                mSlideState = PanelState.COLLAPSED;
                dispatchOnPanelCollapsed(mSlideableView);
                return;
            }
            if (true) goto _L2; else goto _L5
_L5:
            if (mSlideOffset < 0.0F)
            {
                mSlideState = PanelState.HIDDEN;
                mSlideableView.setVisibility(4);
                dispatchOnPanelHidden(mSlideableView);
                return;
            }
            if (mSlideState != PanelState.ANCHORED)
            {
                updateObscuredViewVisibility();
                mSlideState = PanelState.ANCHORED;
                dispatchOnPanelAnchored(mSlideableView);
                return;
            }
            if (true) goto _L2; else goto _L6
_L6:
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            onPanelDragged(j);
            invalidate();
        }

        public void onViewReleased(View view, float f, float f1)
        {
            int i;
            if (mIsSlidingUp)
            {
                f = -f1;
            } else
            {
                f = f1;
            }
            if (f > 0.0F && mSlideOffset <= mAnchorPoint)
            {
                i = computePanelTopPosition(mAnchorPoint);
            } else
            if (f > 0.0F && mSlideOffset > mAnchorPoint)
            {
                i = computePanelTopPosition(1.0F);
            } else
            if (f < 0.0F && mSlideOffset >= mAnchorPoint)
            {
                i = computePanelTopPosition(mAnchorPoint);
            } else
            if (f < 0.0F && mSlideOffset < mAnchorPoint)
            {
                i = computePanelTopPosition(0.0F);
            } else
            if (mSlideOffset >= (mAnchorPoint + 1.0F) / 2.0F)
            {
                i = computePanelTopPosition(1.0F);
            } else
            if (mSlideOffset >= mAnchorPoint / 2.0F)
            {
                i = computePanelTopPosition(mAnchorPoint);
            } else
            {
                i = computePanelTopPosition(0.0F);
            }
            mDragHelper.settleCapturedViewAt(view.getLeft(), i);
            invalidate();
        }

        public boolean tryCaptureView(View view, int i)
        {
            while (mIsUnableToDrag || view != mSlideableView) 
            {
                return false;
            }
            return true;
        }

        private DragHelperCallback()
        {
            this$0 = SlidingUpPanelLayout.this;
            super();
        }

    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int ATTRS[] = {
            0x1010181
        };


        public LayoutParams()
        {
            super(-1, -1);
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context.obtainStyledAttributes(attributeset, ATTRS).recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

    public static interface PanelSlideListener
    {

        public abstract void onPanelAnchored(View view);

        public abstract void onPanelCollapsed(View view);

        public abstract void onPanelExpanded(View view);

        public abstract void onPanelHidden(View view);

        public abstract void onPanelSlide(View view, float f);
    }

    public static final class PanelState extends Enum
    {

        private static final PanelState $VALUES[];
        public static final PanelState ANCHORED;
        public static final PanelState COLLAPSED;
        public static final PanelState DRAGGING;
        public static final PanelState EXPANDED;
        public static final PanelState HIDDEN;

        public static PanelState valueOf(String s)
        {
            return (PanelState)Enum.valueOf(com/walmartlabs/payment/view/SlidingUpPanelLayout$PanelState, s);
        }

        public static PanelState[] values()
        {
            return (PanelState[])$VALUES.clone();
        }

        static 
        {
            EXPANDED = new PanelState("EXPANDED", 0);
            COLLAPSED = new PanelState("COLLAPSED", 1);
            ANCHORED = new PanelState("ANCHORED", 2);
            HIDDEN = new PanelState("HIDDEN", 3);
            DRAGGING = new PanelState("DRAGGING", 4);
            $VALUES = (new PanelState[] {
                EXPANDED, COLLAPSED, ANCHORED, HIDDEN, DRAGGING
            });
        }

        private PanelState(String s, int i)
        {
            super(s, i);
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
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

        };
        PanelState mSlideState;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(mSlideState.toString());
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            try
            {
                mSlideState = (PanelState)Enum.valueOf(com/walmartlabs/payment/view/SlidingUpPanelLayout$PanelState, parcel.readString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                mSlideState = PanelState.COLLAPSED;
            }
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static class SimplePanelSlideListener
        implements PanelSlideListener
    {

        public void onPanelAnchored(View view)
        {
        }

        public void onPanelCollapsed(View view)
        {
        }

        public void onPanelExpanded(View view)
        {
        }

        public void onPanelHidden(View view)
        {
        }

        public void onPanelSlide(View view, float f)
        {
        }

        public SimplePanelSlideListener()
        {
        }
    }


    private static final float DEFAULT_ANCHOR_POINT = 1F;
    private static final int DEFAULT_ATTRS[] = {
        0x10100af
    };
    private static final boolean DEFAULT_CLIP_PANEL_FLAG = true;
    private static final int DEFAULT_FADE_COLOR = 0x99000000;
    private static final int DEFAULT_MIN_FLING_VELOCITY = 400;
    private static final boolean DEFAULT_OVERLAY_FLAG = false;
    private static final int DEFAULT_PANEL_HEIGHT = 68;
    private static final int DEFAULT_PARALAX_OFFSET = 0;
    private static final int DEFAULT_SHADOW_HEIGHT = 4;
    private static PanelState DEFAULT_SLIDE_STATE;
    private static final String TAG = com/walmartlabs/payment/view/SlidingUpPanelLayout.getSimpleName();
    private float mAnchorPoint;
    private boolean mClipPanel;
    private int mCoveredFadeColor;
    private final Paint mCoveredFadePaint;
    private final ViewDragHelper mDragHelper;
    private View mDragView;
    private int mDragViewResId;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsScrollableViewHandlingTouch;
    private boolean mIsSlidingUp;
    private boolean mIsTouchEnabled;
    private boolean mIsUnableToDrag;
    private PanelState mLastNotDraggingSlideState;
    private View mMainView;
    private int mMinFlingVelocity;
    private boolean mOverlayContent;
    private int mPanelHeight;
    private PanelSlideListener mPanelSlideListener;
    private int mParallaxOffset;
    private float mPrevMotionY;
    private View mScrollableView;
    private int mScrollableViewResId;
    private final Drawable mShadowDrawable;
    private int mShadowHeight;
    private float mSlideOffset;
    private int mSlideRange;
    private PanelState mSlideState;
    private View mSlideableView;
    private final Rect mTmpRect;

    public SlidingUpPanelLayout(Context context)
    {
        this(context, null);
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMinFlingVelocity = 400;
        mCoveredFadeColor = 0x99000000;
        mCoveredFadePaint = new Paint();
        mPanelHeight = -1;
        mShadowHeight = -1;
        mParallaxOffset = -1;
        mOverlayContent = false;
        mClipPanel = true;
        mDragViewResId = -1;
        mSlideState = DEFAULT_SLIDE_STATE;
        mLastNotDraggingSlideState = null;
        mAnchorPoint = 1.0F;
        mIsScrollableViewHandlingTouch = false;
        mFirstLayout = true;
        mTmpRect = new Rect();
        if (isInEditMode())
        {
            mShadowDrawable = null;
            mDragHelper = null;
            return;
        }
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, DEFAULT_ATTRS);
            if (typedarray != null)
            {
                setGravity(typedarray.getInt(0, 0));
            }
            typedarray.recycle();
            attributeset = context.obtainStyledAttributes(attributeset, com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout);
            if (attributeset != null)
            {
                mPanelHeight = attributeset.getDimensionPixelSize(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoPanelHeight, -1);
                mShadowHeight = attributeset.getDimensionPixelSize(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoShadowHeight, -1);
                mParallaxOffset = attributeset.getDimensionPixelSize(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoParalaxOffset, -1);
                mMinFlingVelocity = attributeset.getInt(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoFlingVelocity, 400);
                mCoveredFadeColor = attributeset.getColor(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoFadeColor, 0x99000000);
                mDragViewResId = attributeset.getResourceId(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoDragView, -1);
                mScrollableViewResId = attributeset.getResourceId(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoScrollableView, -1);
                mOverlayContent = attributeset.getBoolean(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoOverlay, false);
                mClipPanel = attributeset.getBoolean(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoClipPanel, true);
                mAnchorPoint = attributeset.getFloat(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoAnchorPoint, 1.0F);
                mSlideState = PanelState.values()[attributeset.getInt(com.walmartlabs.android.payment.R.styleable.SlidingUpPanelLayout_umanoInitialState, DEFAULT_SLIDE_STATE.ordinal())];
            }
            attributeset.recycle();
        }
        float f = context.getResources().getDisplayMetrics().density;
        if (mPanelHeight == -1)
        {
            mPanelHeight = (int)(68F * f + 0.5F);
        }
        if (mShadowHeight == -1)
        {
            mShadowHeight = (int)(4F * f + 0.5F);
        }
        if (mParallaxOffset == -1)
        {
            mParallaxOffset = (int)(0.0F * f);
        }
        if (mShadowHeight > 0)
        {
            if (mIsSlidingUp)
            {
                mShadowDrawable = getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.above_shadow);
            } else
            {
                mShadowDrawable = getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.below_shadow);
            }
        } else
        {
            mShadowDrawable = null;
        }
        setWillNotDraw(false);
        mDragHelper = ViewDragHelper.create(this, 0.5F, new DragHelperCallback());
        mDragHelper.setMinVelocity((float)mMinFlingVelocity * f);
        mIsTouchEnabled = true;
    }

    private void applyParallaxForCurrentSlideOffset()
    {
        if (mParallaxOffset > 0)
        {
            int i = getCurrentParalaxOffset();
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                mMainView.setTranslationY(i);
            }
        }
    }

    private int computePanelTopPosition(float f)
    {
        int i;
        int j;
        if (mSlideableView != null)
        {
            i = mSlideableView.getMeasuredHeight();
        } else
        {
            i = 0;
        }
        j = (int)((float)mSlideRange * f);
        if (mIsSlidingUp)
        {
            return getMeasuredHeight() - getPaddingBottom() - mPanelHeight - j;
        } else
        {
            return (getPaddingTop() - i) + mPanelHeight + j;
        }
    }

    private float computeSlideOffset(int i)
    {
        int j = computePanelTopPosition(0.0F);
        if (mIsSlidingUp)
        {
            return (float)(j - i) / (float)mSlideRange;
        } else
        {
            return (float)(i - j) / (float)mSlideRange;
        }
    }

    private int getScrollableViewScrollPosition()
    {
        if (mScrollableView == null)
        {
            return 0;
        }
        if (mScrollableView instanceof ScrollView)
        {
            if (mIsSlidingUp)
            {
                return mScrollableView.getScrollY();
            } else
            {
                ScrollView scrollview = (ScrollView)mScrollableView;
                return scrollview.getChildAt(0).getBottom() - (scrollview.getHeight() + scrollview.getScrollY());
            }
        }
        if ((mScrollableView instanceof ListView) && ((ListView)mScrollableView).getChildCount() > 0)
        {
            ListView listview = (ListView)mScrollableView;
            if (listview.getAdapter() == null)
            {
                return 0;
            }
            if (mIsSlidingUp)
            {
                View view = listview.getChildAt(0);
                return listview.getFirstVisiblePosition() * view.getHeight() - view.getTop();
            } else
            {
                View view1 = listview.getChildAt(listview.getChildCount() - 1);
                return ((listview.getAdapter().getCount() - listview.getLastVisiblePosition() - 1) * view1.getHeight() + view1.getBottom()) - listview.getBottom();
            }
        }
        if ((mScrollableView instanceof RecyclerView) && ((RecyclerView)mScrollableView).getChildCount() > 0)
        {
            RecyclerView recyclerview = (RecyclerView)mScrollableView;
            if (recyclerview.getAdapter() == null)
            {
                return 0;
            }
            if (mIsSlidingUp)
            {
                View view2 = recyclerview.getChildAt(0);
                return recyclerview.getChildLayoutPosition(view2) * view2.getHeight() - view2.getTop();
            } else
            {
                View view3 = recyclerview.getChildAt(recyclerview.getChildCount() - 1);
                return ((recyclerview.getAdapter().getItemCount() - 1) * view3.getHeight() + view3.getBottom()) - recyclerview.getBottom();
            }
        } else
        {
            return 0;
        }
    }

    private static boolean hasOpaqueBackground(View view)
    {
        view = view.getBackground();
        return view != null && view.getOpacity() == -1;
    }

    private boolean isViewUnder(View view, int i, int j)
    {
        boolean flag = true;
        if (view == null)
        {
            return false;
        }
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int ai1[] = new int[2];
        getLocationOnScreen(ai1);
        i = ai1[0] + i;
        j = ai1[1] + j;
        if (i < ai[0] || i >= ai[0] + view.getWidth() || j < ai[1] || j >= ai[1] + view.getHeight())
        {
            flag = false;
        }
        return flag;
    }

    private void onPanelDragged(int i)
    {
        mLastNotDraggingSlideState = mSlideState;
        mSlideState = PanelState.DRAGGING;
        mSlideOffset = computeSlideOffset(i);
        applyParallaxForCurrentSlideOffset();
        dispatchOnPanelSlide(mSlideableView);
        LayoutParams layoutparams = (LayoutParams)mMainView.getLayoutParams();
        int j = getHeight() - getPaddingBottom() - getPaddingTop() - mPanelHeight;
        if (mSlideOffset <= 0.0F && !mOverlayContent)
        {
            if (mIsSlidingUp)
            {
                i -= getPaddingBottom();
            } else
            {
                i = getHeight() - getPaddingBottom() - mSlideableView.getMeasuredHeight() - i;
            }
            layoutparams.height = i;
            mMainView.requestLayout();
        } else
        if (layoutparams.height != j && !mOverlayContent)
        {
            layoutparams.height = j;
            mMainView.requestLayout();
            return;
        }
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int i1 = view.getScrollX();
            int j1 = view.getScrollY();
            for (int l = viewgroup.getChildCount() - 1; l >= 0; l--)
            {
                View view1 = viewgroup.getChildAt(l);
                if (j + i1 >= view1.getLeft() && j + i1 < view1.getRight() && k + j1 >= view1.getTop() && k + j1 < view1.getBottom() && canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop()))
                {
                    return true;
                }
            }

        }
        return flag && ViewCompat.canScrollHorizontally(view, -i);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (mDragHelper != null && mDragHelper.continueSettling(true))
            {
                if (isEnabled())
                {
                    break label0;
                }
                mDragHelper.abort();
            }
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dispatchOnPanelAnchored(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelAnchored(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelCollapsed(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelCollapsed(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelExpanded(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelExpanded(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelHidden(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelHidden(view);
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

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        float f;
        int i;
        byte byte0;
        byte0 = -1;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (!isEnabled() || !isTouchEnabled() || mIsUnableToDrag && i != 0)
        {
            mDragHelper.cancel();
            return super.dispatchTouchEvent(motionevent);
        }
        f = motionevent.getY();
        if (i != 0) goto _L2; else goto _L1
_L1:
        mIsScrollableViewHandlingTouch = false;
        mPrevMotionY = f;
_L4:
        return super.dispatchTouchEvent(motionevent);
_L2:
        if (i == 2)
        {
            float f1 = f - mPrevMotionY;
            mPrevMotionY = f;
            if (!isViewUnder(mScrollableView, (int)mInitialMotionX, (int)mInitialMotionY))
            {
                return super.dispatchTouchEvent(motionevent);
            }
            if (mIsSlidingUp)
            {
                i = 1;
            } else
            {
                i = -1;
            }
            if ((float)i * f1 > 0.0F)
            {
                if (getScrollableViewScrollPosition() > 0)
                {
                    mIsScrollableViewHandlingTouch = true;
                    return super.dispatchTouchEvent(motionevent);
                }
                if (mIsScrollableViewHandlingTouch)
                {
                    MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
                    motionevent1.setAction(3);
                    super.dispatchTouchEvent(motionevent1);
                    motionevent1.recycle();
                    motionevent.setAction(0);
                }
                mIsScrollableViewHandlingTouch = false;
                return onTouchEvent(motionevent);
            }
            i = byte0;
            if (mIsSlidingUp)
            {
                i = 1;
            }
            if ((float)i * f1 < 0.0F)
            {
                if (mSlideOffset < 1.0F)
                {
                    mIsScrollableViewHandlingTouch = false;
                    return onTouchEvent(motionevent);
                }
                if (!mIsScrollableViewHandlingTouch && mDragHelper.isDragging())
                {
                    mDragHelper.cancel();
                    motionevent.setAction(0);
                }
                mIsScrollableViewHandlingTouch = true;
                return super.dispatchTouchEvent(motionevent);
            }
        } else
        if (i == 1 && mIsScrollableViewHandlingTouch)
        {
            mDragHelper.setDragState(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mShadowDrawable != null)
        {
            int k = mSlideableView.getRight();
            int i;
            int j;
            int l;
            if (mIsSlidingUp)
            {
                j = mSlideableView.getTop() - mShadowHeight;
                i = mSlideableView.getTop();
            } else
            {
                j = mSlideableView.getBottom();
                i = mSlideableView.getBottom() + mShadowHeight;
            }
            l = mSlideableView.getLeft();
            mShadowDrawable.setBounds(l, j, k, i);
            mShadowDrawable.draw(canvas);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        int i = canvas.save(2);
        boolean flag;
        if (mSlideableView != view)
        {
            canvas.getClipBounds(mTmpRect);
            boolean flag1;
            if (!mOverlayContent)
            {
                if (mIsSlidingUp)
                {
                    mTmpRect.bottom = Math.min(mTmpRect.bottom, mSlideableView.getTop());
                } else
                {
                    mTmpRect.top = Math.max(mTmpRect.top, mSlideableView.getBottom());
                }
            }
            if (mClipPanel)
            {
                canvas.clipRect(mTmpRect);
            }
            flag1 = super.drawChild(canvas, view, l);
            flag = flag1;
            if (mCoveredFadeColor != 0)
            {
                flag = flag1;
                if (mSlideOffset > 0.0F)
                {
                    int j = (int)((float)((mCoveredFadeColor & 0xff000000) >>> 24) * mSlideOffset);
                    int k = mCoveredFadeColor;
                    mCoveredFadePaint.setColor(j << 24 | k & 0xffffff);
                    canvas.drawRect(mTmpRect, mCoveredFadePaint);
                    flag = flag1;
                }
            }
        } else
        {
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

    public float getAnchorPoint()
    {
        return mAnchorPoint;
    }

    public int getCoveredFadeColor()
    {
        return mCoveredFadeColor;
    }

    public int getCurrentParalaxOffset()
    {
        int j = (int)((float)mParallaxOffset * Math.max(mSlideOffset, 0.0F));
        int i = j;
        if (mIsSlidingUp)
        {
            i = -j;
        }
        return i;
    }

    public int getMinFlingVelocity()
    {
        return mMinFlingVelocity;
    }

    public int getPanelHeight()
    {
        return mPanelHeight;
    }

    public PanelState getPanelState()
    {
        return mSlideState;
    }

    public int getShadowHeight()
    {
        return mShadowHeight;
    }

    public boolean isClipPanel()
    {
        return mClipPanel;
    }

    public boolean isOverlayed()
    {
        return mOverlayContent;
    }

    public boolean isTouchEnabled()
    {
        return mIsTouchEnabled && mSlideableView != null && mSlideState != PanelState.HIDDEN;
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
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (mDragViewResId != -1)
        {
            setDragView(findViewById(mDragViewResId));
        }
        if (mScrollableViewResId != -1)
        {
            setScrollableView(findViewById(mScrollableViewResId));
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i;
        if (mIsScrollableViewHandlingTouch)
        {
            mDragHelper.cancel();
            return false;
        }
        i = MotionEventCompat.getActionMasked(motionevent);
        f1 = motionevent.getX();
        f = motionevent.getY();
        i;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 73
    //                   1 165
    //                   2 91
    //                   3 165;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return mDragHelper.shouldInterceptTouchEvent(motionevent);
_L2:
        mIsUnableToDrag = false;
        mInitialMotionX = f1;
        mInitialMotionY = f;
        continue; /* Loop/switch isn't completed */
_L4:
        f1 = Math.abs(f1 - mInitialMotionX);
        f = Math.abs(f - mInitialMotionY);
        if (f > (float)mDragHelper.getTouchSlop() && f1 > f || !isViewUnder(mDragView, (int)mInitialMotionX, (int)mInitialMotionY))
        {
            mDragHelper.cancel();
            mIsUnableToDrag = true;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mDragHelper.isDragging())
        {
            mDragHelper.processTouchEvent(motionevent);
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        i1 = getPaddingLeft();
        l = getPaddingTop();
        int j1 = getChildCount();
        if (mFirstLayout)
        {
            static class _cls2
            {

                static final int $SwitchMap$com$walmartlabs$payment$view$SlidingUpPanelLayout$PanelState[];

                static 
                {
                    $SwitchMap$com$walmartlabs$payment$view$SlidingUpPanelLayout$PanelState = new int[PanelState.values().length];
                    try
                    {
                        $SwitchMap$com$walmartlabs$payment$view$SlidingUpPanelLayout$PanelState[PanelState.EXPANDED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$payment$view$SlidingUpPanelLayout$PanelState[PanelState.ANCHORED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$payment$view$SlidingUpPanelLayout$PanelState[PanelState.HIDDEN.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$payment$view$SlidingUpPanelLayout$PanelState[PanelState.COLLAPSED.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2..SwitchMap.com.walmartlabs.payment.view.SlidingUpPanelLayout.PanelState[mSlideState.ordinal()])
            {
            default:
                mSlideOffset = 0.0F;
                break;

            case 1: // '\001'
                mSlideOffset = 1.0F;
                continue;

            case 2: // '\002'
                mSlideOffset = mAnchorPoint;
                continue;

            case 3: // '\003'
                j = computePanelTopPosition(0.0F);
                if (mIsSlidingUp)
                {
                    i = mPanelHeight;
                } else
                {
                    i = -mPanelHeight;
                }
                mSlideOffset = computeSlideOffset(j + i);
                continue;
            }
            break;
        }
        do
        {
            j = 0;
            while (j < j1) 
            {
                View view = getChildAt(j);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (view.getVisibility() != 8 || j != 0 && !mFirstLayout)
                {
                    int k1 = view.getMeasuredHeight();
                    i = l;
                    if (view == mSlideableView)
                    {
                        i = computePanelTopPosition(mSlideOffset);
                    }
                    k = i;
                    if (!mIsSlidingUp)
                    {
                        k = i;
                        if (view == mMainView)
                        {
                            k = i;
                            if (!mOverlayContent)
                            {
                                k = computePanelTopPosition(mSlideOffset) + mSlideableView.getMeasuredHeight();
                            }
                        }
                    }
                    i = i1 + layoutparams.leftMargin;
                    view.layout(i, k, i + view.getMeasuredWidth(), k + k1);
                }
                j++;
            }
            if (mFirstLayout)
            {
                updateObscuredViewVisibility();
            }
            applyParallaxForCurrentSlideOffset();
            mFirstLayout = false;
            return;
        } while (true);
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        int j1 = android.view.View.MeasureSpec.getSize(i);
        i = android.view.View.MeasureSpec.getMode(j);
        int k1 = android.view.View.MeasureSpec.getSize(j);
        if (k != 0x40000000)
        {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (i != 0x40000000)
        {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        int l1 = getChildCount();
        if (l1 != 2)
        {
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        }
        mMainView = getChildAt(0);
        mSlideableView = getChildAt(1);
        if (mDragView == null)
        {
            setDragView(mSlideableView);
        }
        if (mSlideableView.getVisibility() != 0)
        {
            mSlideState = PanelState.HIDDEN;
        }
        int i2 = getPaddingTop();
        int j2 = getPaddingBottom();
        int k2 = getPaddingLeft();
        int l2 = getPaddingRight();
        k = 0;
        do
        {
            if (k < l1)
            {
                View view = getChildAt(k);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (view.getVisibility() != 8 || k != 0)
                {
                    j = k1 - i2 - j2;
                    int i1 = j1 - k2 - l2;
                    int l;
                    if (view == mMainView)
                    {
                        i = j;
                        if (!mOverlayContent)
                        {
                            i = j;
                            if (mSlideState != PanelState.HIDDEN)
                            {
                                i = j - mPanelHeight;
                            }
                        }
                        l = i1 - (layoutparams.leftMargin + layoutparams.rightMargin);
                    } else
                    {
                        i = j;
                        l = i1;
                        if (view == mSlideableView)
                        {
                            i = j - layoutparams.topMargin;
                            l = i1;
                        }
                    }
                    if (layoutparams.width == -2)
                    {
                        j = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
                    } else
                    if (layoutparams.width == -1)
                    {
                        j = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                    } else
                    {
                        j = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
                    }
                    if (layoutparams.height == -2)
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000);
                    } else
                    if (layoutparams.height == -1)
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
                    } else
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                    }
                    view.measure(j, i);
                    if (view == mSlideableView)
                    {
                        mSlideRange = mSlideableView.getMeasuredHeight() - mPanelHeight;
                    }
                }
            } else
            {
                setMeasuredDimension(j1, k1);
                return;
            }
            k++;
        } while (true);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).mSlideState != null)
        {
            parcelable = ((SavedState) (parcelable)).mSlideState;
        } else
        {
            parcelable = DEFAULT_SLIDE_STATE;
        }
        mSlideState = parcelable;
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mSlideState != PanelState.DRAGGING)
        {
            savedstate.mSlideState = mSlideState;
            return savedstate;
        } else
        {
            savedstate.mSlideState = mLastNotDraggingSlideState;
            return savedstate;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (j != l)
        {
            mFirstLayout = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled() || !isTouchEnabled())
        {
            return super.onTouchEvent(motionevent);
        }
        try
        {
            mDragHelper.processTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return true;
    }

    void setAllChildrenVisible()
    {
        int i = 0;
        for (int j = getChildCount(); i < j; i++)
        {
            View view = getChildAt(i);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    public void setAnchorPoint(float f)
    {
        if (f > 0.0F && f <= 1.0F)
        {
            mAnchorPoint = f;
        }
    }

    public void setClipPanel(boolean flag)
    {
        mClipPanel = flag;
    }

    public void setCoveredFadeColor(int i)
    {
        mCoveredFadeColor = i;
        invalidate();
    }

    public void setDragView(int i)
    {
        mDragViewResId = i;
        setDragView(findViewById(i));
    }

    public void setDragView(View view)
    {
        if (mDragView != null)
        {
            mDragView.setOnClickListener(null);
        }
        mDragView = view;
        if (mDragView != null)
        {
            mDragView.setClickable(true);
            mDragView.setFocusable(false);
            mDragView.setFocusableInTouchMode(false);
            mDragView.setOnClickListener(new android.view.View.OnClickListener() {

                final SlidingUpPanelLayout this$0;

                public void onClick(View view1)
                {
                    if (!isEnabled() || !isTouchEnabled())
                    {
                        return;
                    }
                    if (mSlideState != PanelState.EXPANDED && mSlideState != PanelState.ANCHORED)
                    {
                        if (mAnchorPoint < 1.0F)
                        {
                            setPanelState(PanelState.ANCHORED);
                            return;
                        } else
                        {
                            setPanelState(PanelState.EXPANDED);
                            return;
                        }
                    } else
                    {
                        setPanelState(PanelState.COLLAPSED);
                        return;
                    }
                }

            
            {
                this$0 = SlidingUpPanelLayout.this;
                super();
            }
            });
        }
    }

    public void setGravity(int i)
    {
        if (i != 48 && i != 80)
        {
            throw new IllegalArgumentException("gravity must be set to either top or bottom");
        }
        boolean flag;
        if (i == 80)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsSlidingUp = flag;
        if (!mFirstLayout)
        {
            requestLayout();
        }
    }

    public void setMinFlingVelocity(int i)
    {
        mMinFlingVelocity = i;
    }

    public void setOverlayed(boolean flag)
    {
        mOverlayContent = flag;
    }

    public void setPanelHeight(int i)
    {
        if (getPanelHeight() != i)
        {
            mPanelHeight = i;
            if (!mFirstLayout)
            {
                requestLayout();
            }
            if (getPanelState() == PanelState.COLLAPSED)
            {
                smoothToBottom();
                invalidate();
                return;
            }
        }
    }

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
        mPanelSlideListener = panelslidelistener;
    }

    public void setPanelState(PanelState panelstate)
    {
        if (panelstate == null || panelstate == PanelState.DRAGGING)
        {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        }
        if (!isEnabled() || !mFirstLayout && mSlideableView == null || panelstate == mSlideState || mSlideState == PanelState.DRAGGING)
        {
            return;
        }
        if (mFirstLayout)
        {
            mSlideState = panelstate;
            return;
        }
        if (mSlideState == PanelState.HIDDEN)
        {
            mSlideableView.setVisibility(0);
            requestLayout();
        }
        int j;
        switch (_cls2..SwitchMap.com.walmartlabs.payment.view.SlidingUpPanelLayout.PanelState[panelstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            smoothSlideTo(1.0F, 0);
            return;

        case 2: // '\002'
            smoothSlideTo(mAnchorPoint, 0);
            return;

        case 4: // '\004'
            smoothSlideTo(0.0F, 0);
            return;

        case 3: // '\003'
            j = computePanelTopPosition(0.0F);
            break;
        }
        int i;
        if (mIsSlidingUp)
        {
            i = mPanelHeight;
        } else
        {
            i = -mPanelHeight;
        }
        smoothSlideTo(computeSlideOffset(j + i), 0);
    }

    public void setParalaxOffset(int i)
    {
        mParallaxOffset = i;
        if (!mFirstLayout)
        {
            requestLayout();
        }
    }

    public void setScrollableView(View view)
    {
        mScrollableView = view;
    }

    public void setShadowHeight(int i)
    {
        mShadowHeight = i;
        if (!mFirstLayout)
        {
            invalidate();
        }
    }

    public void setTouchEnabled(boolean flag)
    {
        mIsTouchEnabled = flag;
    }

    boolean smoothSlideTo(float f, int i)
    {
        if (isEnabled() && mSlideableView != null)
        {
            if (mDragHelper.smoothSlideViewTo(mSlideableView, mSlideableView.getLeft(), i = computePanelTopPosition(f)))
            {
                setAllChildrenVisible();
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    protected void smoothToBottom()
    {
        smoothSlideTo(0.0F, 0);
    }

    void updateObscuredViewVisibility()
    {
        if (getChildCount() == 0)
        {
            return;
        }
        int j2 = getPaddingLeft();
        int k1 = getWidth();
        int l1 = getPaddingRight();
        int i2 = getPaddingTop();
        int i1 = getHeight();
        int j1 = getPaddingBottom();
        View view;
        int i;
        int j;
        int k;
        int l;
        if (mSlideableView != null && hasOpaqueBackground(mSlideableView))
        {
            j = mSlideableView.getLeft();
            k = mSlideableView.getRight();
            l = mSlideableView.getTop();
            i = mSlideableView.getBottom();
        } else
        {
            i = 0;
            l = 0;
            k = 0;
            j = 0;
        }
        view = getChildAt(0);
        j2 = Math.max(j2, view.getLeft());
        i2 = Math.max(i2, view.getTop());
        k1 = Math.min(k1 - l1, view.getRight());
        i1 = Math.min(i1 - j1, view.getBottom());
        if (j2 >= j && i2 >= l && k1 <= k && i1 <= i)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
    }

    static 
    {
        DEFAULT_SLIDE_STATE = PanelState.COLLAPSED;
    }




/*
    static PanelState access$102(SlidingUpPanelLayout slidinguppanellayout, PanelState panelstate)
    {
        slidinguppanellayout.mSlideState = panelstate;
        return panelstate;
    }

*/









/*
    static float access$602(SlidingUpPanelLayout slidinguppanellayout, float f)
    {
        slidinguppanellayout.mSlideOffset = f;
        return f;
    }

*/



}
