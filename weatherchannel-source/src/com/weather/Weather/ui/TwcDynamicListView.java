// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.nhaarman.listviewanimations.itemmanipulation.swipedismiss.SwipeOnTouchListener;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.TypeEvaluator;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;

public class TwcDynamicListView extends ListView
{
    public static interface OnHoverCellListener
    {

        public abstract Drawable onHoverCellCreated(Drawable drawable);
    }

    public static interface OnItemMovedListener
    {

        public abstract void onItemMoved(int i);
    }

    public static interface Swappable
    {

        public abstract void swapItems(int i, int j);
    }


    private static final TypeEvaluator sBoundEvaluator = new TypeEvaluator() {

        public Rect evaluate(float f, Rect rect, Rect rect1)
        {
            return new Rect(interpolate(rect.left, rect1.left, f), interpolate(rect.top, rect1.top, f), interpolate(rect.right, rect1.right, f), interpolate(rect.bottom, rect1.bottom, f));
        }

        public volatile Object evaluate(float f, Object obj, Object obj1)
        {
            return evaluate(f, (Rect)obj, (Rect)obj1);
        }

        public int interpolate(int i, int j, float f)
        {
            return (int)((float)i + (float)(j - i) * f);
        }

    };
    private final int INVALID_ID;
    private final int INVALID_POINTER_ID;
    private final int MOVE_DURATION;
    private final int SMOOTH_SCROLL_AMOUNT_AT_EDGE;
    private long mAboveItemId;
    private int mActivePointerId;
    private long mBelowItemId;
    private boolean mCellIsMobile;
    private int mDownX;
    private int mDownY;
    private boolean mDynamicTouchChildTouched;
    private Drawable mHoverCell;
    private Rect mHoverCellCurrentBounds;
    private Rect mHoverCellOriginalBounds;
    private boolean mIsMobileScrolling;
    private boolean mIsParentHorizontalScrollContainer;
    private boolean mIsWaitingForScrollFinish;
    private int mLastEventX;
    private int mLastEventY;
    private int mLastMovedToIndex;
    private long mMobileItemId;
    private OnHoverCellListener mOnHoverCellListener;
    private android.widget.AdapterView.OnItemLongClickListener mOnItemLongClickListener = new android.widget.AdapterView.OnItemLongClickListener() {

        final TwcDynamicListView this$0;

        public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
        {
            if (mResIdOfDynamicTouchChild == 0)
            {
                mDynamicTouchChildTouched = true;
                makeCellMobile();
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = TwcDynamicListView.this;
                super();
            }
    };
    private OnItemMovedListener mOnItemMovedListener;
    private android.view.View.OnTouchListener mOnTouchListener;
    private int mOriginalTranscriptMode;
    private int mResIdOfDynamicTouchChild;
    private android.widget.AbsListView.OnScrollListener mScrollListener = new android.widget.AbsListView.OnScrollListener() {

        private int mCurrentFirstVisibleItem;
        private int mCurrentScrollState;
        private int mCurrentVisibleItemCount;
        private int mPreviousFirstVisibleItem;
        private int mPreviousVisibleItemCount;
        final TwcDynamicListView this$0;

        private void isScrollCompleted()
        {
            if (mCurrentVisibleItemCount > 0 && mCurrentScrollState == 0)
            {
                if (mCellIsMobile && mIsMobileScrolling)
                {
                    handleMobileCellScroll();
                } else
                if (mIsWaitingForScrollFinish)
                {
                    touchEventsEnded();
                    return;
                }
            }
        }

        public void checkAndHandleFirstVisibleCellChange()
        {
            if (mCurrentFirstVisibleItem != mPreviousFirstVisibleItem && mCellIsMobile && mMobileItemId != -1L)
            {
                updateNeighborViewsForId(mMobileItemId);
                handleCellSwitch();
            }
        }

        public void checkAndHandleLastVisibleCellChange()
        {
            if (mCurrentFirstVisibleItem + mCurrentVisibleItemCount != mPreviousFirstVisibleItem + mPreviousVisibleItemCount && mCellIsMobile && mMobileItemId != -1L)
            {
                updateNeighborViewsForId(mMobileItemId);
                handleCellSwitch();
            }
        }

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            mCurrentFirstVisibleItem = i;
            mCurrentVisibleItemCount = j;
            if (mPreviousFirstVisibleItem == -1)
            {
                i = mCurrentFirstVisibleItem;
            } else
            {
                i = mPreviousFirstVisibleItem;
            }
            mPreviousFirstVisibleItem = i;
            if (mPreviousVisibleItemCount == -1)
            {
                i = mCurrentVisibleItemCount;
            } else
            {
                i = mPreviousVisibleItemCount;
            }
            mPreviousVisibleItemCount = i;
            checkAndHandleFirstVisibleCellChange();
            checkAndHandleLastVisibleCellChange();
            mPreviousFirstVisibleItem = mCurrentFirstVisibleItem;
            mPreviousVisibleItemCount = mCurrentVisibleItemCount;
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            mCurrentScrollState = i;
            mScrollState = i;
            isScrollCompleted();
        }

            
            {
                this$0 = TwcDynamicListView.this;
                super();
                mPreviousFirstVisibleItem = -1;
                mPreviousVisibleItemCount = -1;
            }
    };
    private int mScrollState;
    private boolean mSkipCallingOnTouchListener;
    private int mSlop;
    private int mSmoothScrollAmountAtEdge;
    private int mTotalOffset;

    public TwcDynamicListView(Context context)
    {
        super(context);
        SMOOTH_SCROLL_AMOUNT_AT_EDGE = 15;
        MOVE_DURATION = 150;
        mLastEventY = -1;
        mLastEventX = -1;
        mDownY = -1;
        mDownX = -1;
        mTotalOffset = 0;
        mCellIsMobile = false;
        mIsMobileScrolling = false;
        mSmoothScrollAmountAtEdge = 0;
        INVALID_ID = -1;
        mAboveItemId = -1L;
        mMobileItemId = -1L;
        mBelowItemId = -1L;
        INVALID_POINTER_ID = -1;
        mActivePointerId = -1;
        mIsWaitingForScrollFinish = false;
        mScrollState = 0;
        init(context);
    }

    public TwcDynamicListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        SMOOTH_SCROLL_AMOUNT_AT_EDGE = 15;
        MOVE_DURATION = 150;
        mLastEventY = -1;
        mLastEventX = -1;
        mDownY = -1;
        mDownX = -1;
        mTotalOffset = 0;
        mCellIsMobile = false;
        mIsMobileScrolling = false;
        mSmoothScrollAmountAtEdge = 0;
        INVALID_ID = -1;
        mAboveItemId = -1L;
        mMobileItemId = -1L;
        mBelowItemId = -1L;
        INVALID_POINTER_ID = -1;
        mActivePointerId = -1;
        mIsWaitingForScrollFinish = false;
        mScrollState = 0;
        init(context);
    }

    public TwcDynamicListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        SMOOTH_SCROLL_AMOUNT_AT_EDGE = 15;
        MOVE_DURATION = 150;
        mLastEventY = -1;
        mLastEventX = -1;
        mDownY = -1;
        mDownX = -1;
        mTotalOffset = 0;
        mCellIsMobile = false;
        mIsMobileScrolling = false;
        mSmoothScrollAmountAtEdge = 0;
        INVALID_ID = -1;
        mAboveItemId = -1L;
        mMobileItemId = -1L;
        mBelowItemId = -1L;
        INVALID_POINTER_ID = -1;
        mActivePointerId = -1;
        mIsWaitingForScrollFinish = false;
        mScrollState = 0;
        init(context);
    }

    private BitmapDrawable getAndAddHoverView(View view)
    {
        int i = view.getWidth();
        int j = view.getHeight();
        int k = view.getTop();
        int l = view.getLeft();
        view = getBitmapFromView(view);
        view = new BitmapDrawable(getResources(), view);
        mHoverCellOriginalBounds = new Rect(l, k, l + i, k + j);
        mHoverCellCurrentBounds = new Rect(mHoverCellOriginalBounds);
        view.setBounds(mHoverCellCurrentBounds);
        return view;
    }

    private Bitmap getBitmapFromView(View view)
    {
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmap));
        return bitmap;
    }

    private Rect getChildViewRect(View view, View view1)
    {
        Rect rect = new Rect(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
        Object obj = view1;
        if (view != view1)
        {
            while ((obj = (ViewGroup)((View) (obj)).getParent()) != view) 
            {
                rect.offset(((ViewGroup) (obj)).getLeft(), ((ViewGroup) (obj)).getTop());
            }
        }
        return rect;
    }

    private int getPositionForId(long l)
    {
        View view = getViewForId(l);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPositionForView(view);
        }
    }

    private View getViewForId(long l)
    {
        int j = getFirstVisiblePosition();
        ListAdapter listadapter = getAdapter();
        if (!listadapter.hasStableIds())
        {
            throw new IllegalStateException("Adapter doesn't have stable ids! Make sure your adapter has stable ids, and override hasStableIds() to return true.");
        }
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (listadapter.getItemId(j + i) == l)
            {
                return view;
            }
        }

        return null;
    }

    private void handleCellSwitch()
    {
        final int deltaY = mLastEventY - mDownY;
        int i = mHoverCellOriginalBounds.top + mTotalOffset + deltaY;
        final Object observer = getViewForId(mBelowItemId);
        View view1 = getViewForId(mMobileItemId);
        View view = getViewForId(mAboveItemId);
        final int switchViewStartTop;
        if (observer != null && i > ((View) (observer)).getTop())
        {
            switchViewStartTop = 1;
        } else
        {
            switchViewStartTop = 0;
        }
        if (view != null && i < view.getTop())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (switchViewStartTop != 0 || i)
        {
            final long switchItemId;
            if (switchViewStartTop != 0)
            {
                switchItemId = mBelowItemId;
            } else
            {
                switchItemId = mAboveItemId;
            }
            if (switchViewStartTop == 0)
            {
                observer = view;
            }
            switchViewStartTop = getPositionForView(view1);
            if (observer == null)
            {
                updateNeighborViewsForId(mMobileItemId);
            } else
            if (getPositionForView(((View) (observer))) >= getHeaderViewsCount())
            {
                swapElements(switchViewStartTop, getPositionForView(((View) (observer))));
                BaseAdapter baseadapter;
                if (getAdapter() instanceof HeaderViewListAdapter)
                {
                    baseadapter = (BaseAdapter)((HeaderViewListAdapter)getAdapter()).getWrappedAdapter();
                } else
                {
                    baseadapter = (BaseAdapter)getAdapter();
                }
                baseadapter.notifyDataSetChanged();
                mDownY = mLastEventY;
                mDownX = mLastEventX;
                switchViewStartTop = ((View) (observer)).getTop();
                if (android.os.Build.VERSION.SDK_INT <= 19)
                {
                    view1.setVisibility(0);
                    ((View) (observer)).setVisibility(4);
                } else
                {
                    view1.setVisibility(4);
                    ((View) (observer)).setVisibility(0);
                }
                updateNeighborViewsForId(mMobileItemId);
                observer = getViewTreeObserver();
                ((ViewTreeObserver) (observer)).addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                    final TwcDynamicListView this$0;
                    final int val$deltaY;
                    final ViewTreeObserver val$observer;
                    final long val$switchItemId;
                    final int val$switchViewStartTop;

                    public boolean onPreDraw()
                    {
                        observer.removeOnPreDrawListener(this);
                        Object obj = getViewForId(switchItemId);
                        mTotalOffset = mTotalOffset + deltaY;
                        int j = ((View) (obj)).getTop();
                        ViewHelper.setTranslationY(((View) (obj)), switchViewStartTop - j);
                        obj = ObjectAnimator.ofFloat(obj, "translationY", new float[] {
                            0.0F
                        });
                        ((ObjectAnimator) (obj)).setDuration(150L);
                        ((ObjectAnimator) (obj)).start();
                        return true;
                    }

            
            {
                this$0 = TwcDynamicListView.this;
                observer = viewtreeobserver;
                switchItemId = l;
                deltaY = i;
                switchViewStartTop = j;
                super();
            }
                });
                return;
            }
        }
    }

    private void handleMobileCellScroll()
    {
        mIsMobileScrolling = handleMobileCellScroll(mHoverCellCurrentBounds);
    }

    private boolean handleMobileCellScroll(Rect rect)
    {
        int i = computeVerticalScrollOffset();
        int j = getHeight();
        int k = computeVerticalScrollExtent();
        int l = computeVerticalScrollRange();
        int i1 = rect.top;
        int j1 = rect.height();
        if (i1 <= 0 && i > 0)
        {
            smoothScrollBy(-mSmoothScrollAmountAtEdge, 0);
            return true;
        }
        if (i1 + j1 >= j && i + k < l)
        {
            smoothScrollBy(mSmoothScrollAmountAtEdge, 0);
            return true;
        } else
        {
            return false;
        }
    }

    private void makeCellMobile()
    {
        int i = pointToPosition(mDownX, mDownY);
        View view = getChildAt(i - getFirstVisiblePosition());
        if (view == null || i < getHeaderViewsCount() || i >= getAdapter().getCount() - getHeaderViewsCount())
        {
            return;
        }
        mOriginalTranscriptMode = getTranscriptMode();
        setTranscriptMode(1);
        mTotalOffset = 0;
        mMobileItemId = getAdapter().getItemId(i);
        mHoverCell = getAndAddHoverView(view);
        if (mOnHoverCellListener != null)
        {
            mHoverCell = mOnHoverCellListener.onHoverCellCreated(mHoverCell);
        }
        view.setVisibility(4);
        mCellIsMobile = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        updateNeighborViewsForId(mMobileItemId);
    }

    private void swapElements(int i, int j)
    {
        mLastMovedToIndex = j;
        ListAdapter listadapter1 = getAdapter();
        ListAdapter listadapter = listadapter1;
        if (listadapter1 instanceof HeaderViewListAdapter)
        {
            listadapter = ((HeaderViewListAdapter)listadapter1).getWrappedAdapter();
        }
        if (listadapter instanceof Swappable)
        {
            ((Swappable)listadapter).swapItems(i - getHeaderViewsCount(), j - getHeaderViewsCount());
        }
    }

    private void touchEventsCancelled()
    {
        View view = getViewForId(mMobileItemId);
        if (mCellIsMobile)
        {
            mAboveItemId = -1L;
            mMobileItemId = -1L;
            mBelowItemId = -1L;
            view.setVisibility(0);
            mHoverCell = null;
            invalidate();
        }
        mCellIsMobile = false;
        mIsMobileScrolling = false;
        mActivePointerId = -1;
    }

    private void touchEventsEnded()
    {
        final View mobileView = getViewForId(mMobileItemId);
        if (mCellIsMobile || mIsWaitingForScrollFinish)
        {
            mCellIsMobile = false;
            mIsWaitingForScrollFinish = false;
            mIsMobileScrolling = false;
            mActivePointerId = -1;
            setTranscriptMode(mOriginalTranscriptMode);
            if (mScrollState != 0)
            {
                mIsWaitingForScrollFinish = true;
                return;
            } else
            {
                mHoverCellCurrentBounds.offsetTo(mHoverCellOriginalBounds.left, mobileView.getTop());
                ObjectAnimator objectanimator = ObjectAnimator.ofObject(mHoverCell, "bounds", sBoundEvaluator, new Object[] {
                    mHoverCellCurrentBounds
                });
                objectanimator.addUpdateListener(new com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener() {

                    final TwcDynamicListView this$0;

                    public void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        invalidate();
                    }

            
            {
                this$0 = TwcDynamicListView.this;
                super();
            }
                });
                objectanimator.addListener(new AnimatorListenerAdapter() {

                    final TwcDynamicListView this$0;
                    final View val$mobileView;

                    public void onAnimationEnd(Animator animator)
                    {
                        mAboveItemId = -1L;
                        mMobileItemId = -1L;
                        mBelowItemId = -1L;
                        mobileView.setVisibility(0);
                        mHoverCell = null;
                        setEnabled(true);
                        invalidate();
                        if (mOnItemMovedListener != null)
                        {
                            mOnItemMovedListener.onItemMoved(mLastMovedToIndex - getHeaderViewsCount());
                        }
                    }

                    public void onAnimationStart(Animator animator)
                    {
                        setEnabled(false);
                    }

            
            {
                this$0 = TwcDynamicListView.this;
                mobileView = view;
                super();
            }
                });
                objectanimator.start();
                return;
            }
        } else
        {
            touchEventsCancelled();
            return;
        }
    }

    private void updateNeighborViewsForId(long l)
    {
        long l1 = 0x8000000000000000L;
        int i = getPositionForId(l);
        ListAdapter listadapter = getAdapter();
        if (!listadapter.hasStableIds())
        {
            throw new IllegalStateException("Adapter doesn't have stable ids! Make sure your adapter has stable ids, and override hasStableIds() to return true.");
        }
        if (i - 1 >= 0)
        {
            l = listadapter.getItemId(i - 1);
        } else
        {
            l = 0x8000000000000000L;
        }
        mAboveItemId = l;
        l = l1;
        if (i + 1 < listadapter.getCount())
        {
            l = listadapter.getItemId(i + 1);
        }
        mBelowItemId = l;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (mHoverCell != null)
        {
            mHoverCell.draw(canvas);
        }
    }

    public void init(Context context)
    {
        setOnItemLongClickListener(mOnItemLongClickListener);
        setOnScrollListener(mScrollListener);
        mSmoothScrollAmountAtEdge = (int)(15F / context.getResources().getDisplayMetrics().density);
        mSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public boolean isParentHorizontalScrollContainer()
    {
        return mIsParentHorizontalScrollContainer;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mSkipCallingOnTouchListener)
        {
            return super.onTouchEvent(motionevent);
        }
        if ((mOnTouchListener instanceof SwipeOnTouchListener) && ((SwipeOnTouchListener)mOnTouchListener).isSwiping())
        {
            mSkipCallingOnTouchListener = true;
            boolean flag = mOnTouchListener.onTouch(this, motionevent);
            mSkipCallingOnTouchListener = false;
            return flag || super.onTouchEvent(motionevent);
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 128
    //                   0 137
    //                   1 500
    //                   2 303
    //                   3 512
    //                   4 128
    //                   5 128
    //                   6 524;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        if (mCellIsMobile)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        mDownX = (int)motionevent.getX();
        mDownY = (int)motionevent.getY();
        mActivePointerId = motionevent.getPointerId(0);
        mDynamicTouchChildTouched = false;
        if (mResIdOfDynamicTouchChild != 0)
        {
            mIsParentHorizontalScrollContainer = false;
            int i = pointToPosition(mDownX, mDownY);
            View view;
            if (i != -1)
            {
                i -= getFirstVisiblePosition();
            } else
            {
                i = -1;
            }
            if (i >= 0)
            {
                view = getChildAt(i);
            } else
            {
                view = null;
            }
            if (view != null)
            {
                view = view.findViewById(mResIdOfDynamicTouchChild);
            } else
            {
                view = null;
            }
            if (view != null && getChildViewRect(this, view).contains(mDownX, mDownY))
            {
                mDynamicTouchChildTouched = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (mIsParentHorizontalScrollContainer)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mActivePointerId != -1)
        {
            int j = motionevent.findPointerIndex(mActivePointerId);
            mLastEventY = (int)motionevent.getY(j);
            mLastEventX = (int)motionevent.getX(j);
            j = mLastEventY - mDownY;
            int k = mLastEventX;
            int l = mDownX;
            if (!mCellIsMobile && mDynamicTouchChildTouched && Math.abs(j) > mSlop && Math.abs(j) > Math.abs(k - l))
            {
                makeCellMobile();
                MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
                motionevent1.setAction(motionevent.getActionIndex() << 8 | 3);
                super.onTouchEvent(motionevent1);
                motionevent1.recycle();
            }
            if (mCellIsMobile)
            {
                mHoverCellCurrentBounds.offsetTo(mHoverCellOriginalBounds.left, mHoverCellOriginalBounds.top + j + mTotalOffset);
                mHoverCell.setBounds(mHoverCellCurrentBounds);
                invalidate();
                handleCellSwitch();
                mIsMobileScrolling = false;
                handleMobileCellScroll();
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mDynamicTouchChildTouched = false;
        touchEventsEnded();
        continue; /* Loop/switch isn't completed */
_L5:
        mDynamicTouchChildTouched = false;
        touchEventsCancelled();
        continue; /* Loop/switch isn't completed */
_L6:
        if (motionevent.getPointerId((motionevent.getAction() & 0xff00) >> 8) == mActivePointerId)
        {
            mDynamicTouchChildTouched = false;
            touchEventsEnded();
        }
        if (true) goto _L1; else goto _L7
_L7:
        if (mOnTouchListener != null)
        {
            mSkipCallingOnTouchListener = true;
            boolean flag1 = mOnTouchListener.onTouch(this, motionevent);
            mSkipCallingOnTouchListener = false;
            if (flag1)
            {
                return true;
            }
        }
        return super.onTouchEvent(motionevent);
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (!(listadapter instanceof BaseAdapter))
        {
            throw new IllegalArgumentException("DynamicListView needs a BaseAdapter!");
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setDynamicTouchChild(int i)
    {
        mResIdOfDynamicTouchChild = i;
        if (i != 0)
        {
            setIsParentHorizontalScrollContainer(false);
        }
    }

    public void setIsParentHorizontalScrollContainer(boolean flag)
    {
        if (mResIdOfDynamicTouchChild == 0 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsParentHorizontalScrollContainer = flag;
    }

    public void setOnHoverCellListener(OnHoverCellListener onhovercelllistener)
    {
        mOnHoverCellListener = onhovercelllistener;
    }

    public void setOnItemMovedListener(OnItemMovedListener onitemmovedlistener)
    {
        mOnItemMovedListener = onitemmovedlistener;
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        mOnTouchListener = ontouchlistener;
    }





/*
    static boolean access$102(TwcDynamicListView twcdynamiclistview, boolean flag)
    {
        twcdynamiclistview.mDynamicTouchChildTouched = flag;
        return flag;
    }

*/


/*
    static int access$1102(TwcDynamicListView twcdynamiclistview, int i)
    {
        twcdynamiclistview.mScrollState = i;
        return i;
    }

*/












/*
    static int access$402(TwcDynamicListView twcdynamiclistview, int i)
    {
        twcdynamiclistview.mTotalOffset = i;
        return i;
    }

*/


/*
    static long access$502(TwcDynamicListView twcdynamiclistview, long l)
    {
        twcdynamiclistview.mAboveItemId = l;
        return l;
    }

*/



/*
    static long access$602(TwcDynamicListView twcdynamiclistview, long l)
    {
        twcdynamiclistview.mMobileItemId = l;
        return l;
    }

*/


/*
    static long access$702(TwcDynamicListView twcdynamiclistview, long l)
    {
        twcdynamiclistview.mBelowItemId = l;
        return l;
    }

*/


/*
    static Drawable access$802(TwcDynamicListView twcdynamiclistview, Drawable drawable)
    {
        twcdynamiclistview.mHoverCell = drawable;
        return drawable;
    }

*/

}
