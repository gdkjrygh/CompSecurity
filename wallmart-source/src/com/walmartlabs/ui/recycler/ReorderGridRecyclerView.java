// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Vibrator;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            GridRecyclerView, ReorderRecycleAdapter, BasicAdapter

public class ReorderGridRecyclerView extends GridRecyclerView
{
    class RearrangeItemAnimator extends android.support.v7.widget.RecyclerView.ItemAnimator
    {

        ArrayList mRunningAnimations;
        final ReorderGridRecyclerView this$0;

        public boolean animateAdd(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return false;
        }

        public boolean animateChange(android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
        {
            return false;
        }

        public boolean animateMove(final android.support.v7.widget.RecyclerView.ViewHolder holder, int i, int j, final int toX, int k)
        {
            final ReorderRecycleAdapter.DraggableViewHolder dragHolder = (ReorderRecycleAdapter.DraggableViewHolder)holder;
            if (dragHolder == mFloatingViewHolder)
            {
                dispatchMoveFinished(dragHolder);
                return false;
            } else
            {
                ViewCompat.setX(dragHolder.itemView, i);
                ViewCompat.setY(dragHolder.itemView, j);
                ViewCompat.animate(dragHolder.itemView).x(toX).y(k).setListener(k. new ViewPropertyAnimatorListener() {

                    final RearrangeItemAnimator this$1;
                    final ReorderRecycleAdapter.DraggableViewHolder val$dragHolder;
                    final android.support.v7.widget.RecyclerView.ViewHolder val$holder;
                    final int val$toX;
                    final int val$toY;

                    public void onAnimationCancel(View view)
                    {
                        ViewCompat.setX(view, toX);
                        ViewCompat.setY(view, toY);
                        dispatchMoveFinished(dragHolder);
                        dragHolder.setAnimating(false);
                        mRunningAnimations.remove(holder);
                        ViewCompat.setTranslationX(dragHolder.itemView, 0.0F);
                        ViewCompat.setTranslationY(dragHolder.itemView, 0.0F);
                    }

                    public void onAnimationEnd(View view)
                    {
                        dispatchMoveFinished(dragHolder);
                        dragHolder.setAnimating(false);
                        mRunningAnimations.remove(holder);
                        ViewCompat.setTranslationX(dragHolder.itemView, 0.0F);
                        ViewCompat.setTranslationY(dragHolder.itemView, 0.0F);
                    }

                    public void onAnimationStart(View view)
                    {
                        dispatchMoveStarting(dragHolder);
                        dragHolder.setAnimating(true);
                    }

            
            {
                this$1 = final_rearrangeitemanimator;
                dragHolder = draggableviewholder;
                holder = viewholder;
                toX = i;
                toY = I.this;
                super();
            }
                }).setDuration(getMoveDuration()).start();
                mRunningAnimations.add(holder);
                return true;
            }
        }

        public boolean animateRemove(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return false;
        }

        public void endAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            if (mRunningAnimations.remove(viewholder))
            {
                ViewCompat.animate(viewholder.itemView).cancel();
            }
        }

        public void endAnimations()
        {
            ArrayList arraylist = new ArrayList(mRunningAnimations.size());
            arraylist.addAll(mRunningAnimations);
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); ViewCompat.animate(((android.support.v7.widget.RecyclerView.ViewHolder)iterator.next()).itemView).cancel()) { }
            mRunningAnimations.removeAll(arraylist);
        }

        public boolean isRunning()
        {
            return mRunningAnimations.size() != 0;
        }

        public void runPendingAnimations()
        {
        }

        public RearrangeItemAnimator()
        {
            this$0 = ReorderGridRecyclerView.this;
            super();
            mRunningAnimations = new ArrayList();
        }
    }


    private static final int DEFAULT_ALPHA_VALUE = 204;
    private static final int DEFAULT_SCROLL_WIDTH = 100;
    private static final int DEFAULT_VIBRATOR_DURATION = 150;
    private static final int MAX_COORDINATE = 0x7fffffff;
    private static final String TAG = com/walmartlabs/ui/recycler/ReorderGridRecyclerView.getSimpleName();
    private int mAlphaValue;
    private final android.support.v7.widget.RecyclerView.ItemAnimator mAnimator;
    private boolean mDoDragDrop;
    private final Rect mDownScrollArea;
    private int mEndMove;
    private int mFirstPointerId;
    private BitmapDrawable mFloatingViewBitmap;
    private Canvas mFloatingViewCanvas;
    private final Rect mFloatingViewCurrentBounds;
    private ReorderRecycleAdapter.DraggableViewHolder mFloatingViewHolder;
    private GestureDetector mGestureDetector;
    private boolean mHaveAlpha;
    private boolean mInDrag;
    private boolean mInScrollMode;
    private boolean mInitializationDone;
    private final Rect mInvalidateRect;
    private boolean mItemsMoved;
    private int mLastItemBottom;
    private int mLastItemRight;
    private int mLastItemTop;
    private int mLastXPos;
    private int mLastYPos;
    private boolean mLongPressToDrag;
    private int mScrollAreaHeight;
    private int mStartMove;
    private int mStartPosition;
    private Bitmap mUnderlyingFloatingBitmap;
    private final Rect mUpScrollArea;
    private Vibrator mVibrator;

    public ReorderGridRecyclerView(Context context)
    {
        super(context);
        mInitializationDone = false;
        mFloatingViewCurrentBounds = new Rect();
        mInvalidateRect = new Rect();
        mStartPosition = -1;
        mAnimator = new RearrangeItemAnimator();
        mUpScrollArea = new Rect();
        mDownScrollArea = new Rect();
        mLongPressToDrag = false;
        mAlphaValue = 204;
        mLastItemTop = 0x7fffffff;
        mLastItemBottom = 0x7fffffff;
        mLastItemRight = 0x7fffffff;
    }

    public ReorderGridRecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mInitializationDone = false;
        mFloatingViewCurrentBounds = new Rect();
        mInvalidateRect = new Rect();
        mStartPosition = -1;
        mAnimator = new RearrangeItemAnimator();
        mUpScrollArea = new Rect();
        mDownScrollArea = new Rect();
        mLongPressToDrag = false;
        mAlphaValue = 204;
        mLastItemTop = 0x7fffffff;
        mLastItemBottom = 0x7fffffff;
        mLastItemRight = 0x7fffffff;
    }

    public ReorderGridRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mInitializationDone = false;
        mFloatingViewCurrentBounds = new Rect();
        mInvalidateRect = new Rect();
        mStartPosition = -1;
        mAnimator = new RearrangeItemAnimator();
        mUpScrollArea = new Rect();
        mDownScrollArea = new Rect();
        mLongPressToDrag = false;
        mAlphaValue = 204;
        mLastItemTop = 0x7fffffff;
        mLastItemBottom = 0x7fffffff;
        mLastItemRight = 0x7fffffff;
    }

    private void detectItemHover(MotionEvent motionevent, boolean flag)
    {
        if (!mAnimator.isRunning() || flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        int k;
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        motionevent = null;
        i = -1;
        if (k <= mLastItemBottom && (k <= mLastItemTop || j <= mLastItemRight))
        {
            break; /* Loop/switch isn't completed */
        }
        j = getAdapter().getItemCount() - 1;
        i = j;
        if (j > 0)
        {
            motionevent = (ReorderRecycleAdapter.DraggableViewHolder)findViewHolderForPosition(j);
            i = j;
        }
_L4:
        if (motionevent != null && i != mStartPosition && !motionevent.isAnimating())
        {
            if (mAnimator.isRunning() && flag)
            {
                mAnimator.endAnimations();
            }
            motionevent = getAdapter();
            motionevent.notifyItemMoved(mStartPosition, i);
            motionevent.moveItem(mStartPosition, i);
            mStartMove = mStartPosition;
            mEndMove = i;
            mItemsMoved = true;
            mStartPosition = i;
            motionevent.setDraggingPosition(i);
            invalidateItemDecorations();
            stopScroll();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        View view = findChildViewUnder(j, k);
        if (view != null)
        {
            motionevent = getChildViewHolder(view);
            i = getChildPosition(view);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private boolean detectScroll(MotionEvent motionevent)
    {
        if (!mAnimator.isRunning())
        {
            int i = (int)motionevent.getX();
            int j = (int)motionevent.getY();
            if (mUpScrollArea.contains(i, j) || j < mUpScrollArea.top)
            {
                scrollBy(0, getScrollSpeed(j, mScrollAreaHeight, false));
                mInScrollMode = true;
                return true;
            }
            if (mDownScrollArea.contains(i, j) || j > mDownScrollArea.bottom)
            {
                scrollBy(0, getScrollSpeed(j - mDownScrollArea.top, mScrollAreaHeight, true));
                mInScrollMode = true;
                return true;
            }
            updateCoordinatesForLastView();
            mInScrollMode = false;
            if (mInScrollMode)
            {
                mAnimator.endAnimations();
                return false;
            }
        }
        return false;
    }

    private BitmapDrawable getFloatingViewBitmap(View view, BitmapDrawable bitmapdrawable)
    {
        BitmapDrawable bitmapdrawable1;
        int i;
        int j;
        int k;
        int l;
label0:
        {
            i = (int)ViewCompat.getX(view);
            j = (int)ViewCompat.getY(view);
            k = view.getWidth();
            l = view.getHeight();
            if (mUnderlyingFloatingBitmap == null || mUnderlyingFloatingBitmap.getWidth() != k || mUnderlyingFloatingBitmap.getHeight() != l)
            {
                mUnderlyingFloatingBitmap = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.ARGB_8888);
                mFloatingViewCanvas = new Canvas(mUnderlyingFloatingBitmap);
            }
            if (bitmapdrawable != null)
            {
                bitmapdrawable1 = bitmapdrawable;
                if (bitmapdrawable.getBitmap() == mUnderlyingFloatingBitmap)
                {
                    break label0;
                }
            }
            bitmapdrawable1 = new BitmapDrawable(getResources(), mUnderlyingFloatingBitmap);
        }
        view.draw(mFloatingViewCanvas);
        mFloatingViewCurrentBounds.set(i, j, i + k, j + l);
        if (mHaveAlpha)
        {
            bitmapdrawable1.setAlpha(mAlphaValue);
            return bitmapdrawable1;
        } else
        {
            bitmapdrawable1.setAlpha(255);
            return bitmapdrawable1;
        }
    }

    private int getScrollSpeed(int i, int j, boolean flag)
    {
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        float f1 = Math.min((float)k / (float)j, 1.0F);
        float f = f1;
        if (!flag)
        {
            f = (1.0F - f1) * -1F;
        }
        return (int)(10F * f);
    }

    private boolean handleTouchEvent(MotionEvent motionevent)
    {
        if (mDoDragDrop) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j;
        int k;
        i = motionevent.getActionMasked();
        j = motionevent.getActionIndex();
        k = motionevent.getPointerId(j);
        if (mLongPressToDrag)
        {
            mGestureDetector.onTouchEvent(motionevent);
        }
        i;
        JVM INSTR tableswitch 0 6: default 84
    //                   0 86
    //                   1 116
    //                   2 150
    //                   3 187
    //                   4 84
    //                   5 84
    //                   6 116;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L3 _L5
_L7:
        continue; /* Loop/switch isn't completed */
_L3:
        return false;
_L4:
        if (mLongPressToDrag) goto _L1; else goto _L8
_L8:
        stopScroll();
        if (mInDrag) goto _L1; else goto _L9
_L9:
        updateCoordinatesForLastView();
        startDrag(motionevent, j);
        return true;
_L5:
        if (!mInDrag || k != mFirstPointerId) goto _L1; else goto _L10
_L10:
        stopDrag(motionevent);
        detectItemHover(motionevent, true);
        mInScrollMode = false;
        return true;
_L6:
        if (!mInDrag || k != mFirstPointerId) goto _L1; else goto _L11
_L11:
        updateDragView(motionevent);
        if (!detectScroll(motionevent))
        {
            detectItemHover(motionevent, false);
        }
        return true;
        if (!mInDrag || k != mFirstPointerId) goto _L1; else goto _L12
_L12:
        mInScrollMode = false;
        if (mFloatingViewHolder != null)
        {
            mFloatingViewHolder.setIsRecyclable(true);
            mFloatingViewHolder.onItemDragChange(0);
        }
        getAdapter().setDraggingPosition(-1);
        return false;
    }

    private void init(Context context)
    {
        setItemAnimator(mAnimator);
        addOnItemTouchListener(new android.support.v7.widget.RecyclerView.SimpleOnItemTouchListener() {

            final ReorderGridRecyclerView this$0;

            public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
            {
                return handleTouchEvent(motionevent);
            }

            public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
            {
                handleTouchEvent(motionevent);
            }

            
            {
                this$0 = ReorderGridRecyclerView.this;
                super();
            }
        });
        mGestureDetector = new GestureDetector(context, new android.view.GestureDetector.OnGestureListener() {

            final ReorderGridRecyclerView this$0;

            public boolean onDown(MotionEvent motionevent)
            {
                return false;
            }

            public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                return false;
            }

            public void onLongPress(MotionEvent motionevent)
            {
                stopScroll();
                if (!mInDrag)
                {
                    startDrag(motionevent, motionevent.getActionIndex());
                }
            }

            public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                return false;
            }

            public void onShowPress(MotionEvent motionevent)
            {
            }

            public boolean onSingleTapUp(MotionEvent motionevent)
            {
                return false;
            }

            
            {
                this$0 = ReorderGridRecyclerView.this;
                super();
            }
        });
        mVibrator = (Vibrator)context.getSystemService("vibrator");
        mInitializationDone = true;
    }

    private void setupScrollAreas(int i, int j)
    {
        mScrollAreaHeight = ViewUtil.dpToPixels(100, getContext());
        if (mScrollAreaHeight * 3 > j)
        {
            mScrollAreaHeight = j / 3;
        }
        mUpScrollArea.set(0, 0, i, mScrollAreaHeight);
        mDownScrollArea.set(0, j - mScrollAreaHeight, i, j);
    }

    private void startDrag(MotionEvent motionevent, int i)
    {
        if (!mInScrollMode)
        {
            int j = (int)motionevent.getX(i);
            int k = (int)motionevent.getY(i);
            View view = findChildViewUnder(j, k);
            if (view != null)
            {
                ReorderRecycleAdapter.DraggableViewHolder draggableviewholder = getChildViewHolder(view);
                if (draggableviewholder != null && (draggableviewholder.isViewDraggable(j - getLeft(), k - getTop()) || mLongPressToDrag))
                {
                    mFirstPointerId = motionevent.getPointerId(i);
                    mInDrag = true;
                    mLastXPos = j;
                    mLastYPos = k;
                    mFloatingViewBitmap = getFloatingViewBitmap(view, mFloatingViewBitmap);
                    i = getChildPosition(view);
                    draggableviewholder.onItemDragChange(1);
                    mFloatingViewHolder = draggableviewholder;
                    mFloatingViewHolder.setIsRecyclable(false);
                    mStartPosition = i;
                    getAdapter().setDraggingPosition(i);
                    if (mLongPressToDrag)
                    {
                        try
                        {
                            mVibrator.vibrate(150L);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (MotionEvent motionevent)
                        {
                            WLog.e(TAG, "Failed to vibrate. Missing permission?", motionevent);
                        }
                        return;
                    }
                }
            }
        }
    }

    private void stopDrag(MotionEvent motionevent)
    {
        mFirstPointerId = -1;
        mInDrag = false;
        invalidate(mFloatingViewCurrentBounds);
        motionevent = mFloatingViewHolder;
        getAdapter().setDraggingPosition(-1);
        if (motionevent != null)
        {
            motionevent.setIsRecyclable(true);
            motionevent.onItemDragChange(0);
            mAnimator.endAnimation(motionevent);
        }
    }

    private void updateCoordinatesForLastView()
    {
        int i = getAdapter().getItemCount() - 1;
        mLastItemTop = 0x7fffffff;
        mLastItemBottom = 0x7fffffff;
        mLastItemRight = 0x7fffffff;
        if (i > 0)
        {
            android.support.v7.widget.RecyclerView.ViewHolder viewholder = findViewHolderForPosition(i);
            if (viewholder != null)
            {
                int j = (int)ViewCompat.getX(viewholder.itemView);
                int k = (int)ViewCompat.getY(viewholder.itemView);
                int l = viewholder.itemView.getWidth();
                int i1 = viewholder.itemView.getHeight();
                mLastItemTop = k;
                mLastItemBottom = k + i1;
                mLastItemRight = j + l;
            }
        }
    }

    private void updateDragView(MotionEvent motionevent)
    {
        int i = (int)motionevent.getX();
        int j = (int)motionevent.getY();
        int k = mLastXPos;
        int l = mLastYPos;
        mLastXPos = i;
        mLastYPos = j;
        mInvalidateRect.set(mFloatingViewCurrentBounds);
        mFloatingViewCurrentBounds.offset(i - k, j - l);
        mFloatingViewBitmap.setBounds(mFloatingViewCurrentBounds);
        mInvalidateRect.union(mFloatingViewCurrentBounds);
        invalidate(mInvalidateRect);
    }

    protected void applySpacing(Rect rect, int i)
    {
        int j = i;
        if (!mItemsMoved) goto _L2; else goto _L1
_L1:
        byte byte0;
        int k;
        int l;
        if (mStartMove < mEndMove)
        {
            l = mStartMove;
            k = mEndMove;
            byte0 = -1;
        } else
        {
            l = mEndMove;
            k = mStartMove;
            byte0 = 1;
        }
        if (i != mStartMove) goto _L4; else goto _L3
_L3:
        j = mEndMove;
_L2:
        super.applySpacing(rect, j);
        return;
_L4:
        j = i;
        if (i >= l)
        {
            j = i;
            if (i <= k)
            {
                j = i + byte0;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (mInDrag)
        {
            mFloatingViewBitmap.draw(canvas);
        }
    }

    public volatile android.support.v7.widget.RecyclerView.Adapter getAdapter()
    {
        return getAdapter();
    }

    public volatile BasicAdapter getAdapter()
    {
        return getAdapter();
    }

    public ReorderRecycleAdapter getAdapter()
    {
        return (ReorderRecycleAdapter)super.getAdapter();
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder getChildViewHolder(View view)
    {
        return getChildViewHolder(view);
    }

    public ReorderRecycleAdapter.DraggableViewHolder getChildViewHolder(View view)
    {
        return (ReorderRecycleAdapter.DraggableViewHolder)super.getChildViewHolder(view);
    }

    protected void onAttachedToWindow()
    {
        if (!mInitializationDone)
        {
            throw new IllegalStateException("View not initialized. This class can only be created through XML");
        } else
        {
            return;
        }
    }

    protected void onFinishInflate()
    {
        init(getContext());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mItemsMoved = false;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        setupScrollAreas(i, j);
    }

    public void setAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        super.setAdapter(adapter);
        ((ReorderRecycleAdapter)adapter).setDraggableRecyclerView(this);
    }

    public void setAlpha(boolean flag)
    {
        mHaveAlpha = flag;
    }

    public void setAlphaValue(int i)
    {
        mAlphaValue = i;
    }

    public void setLongPressToDrag(boolean flag)
    {
        mLongPressToDrag = flag;
        mGestureDetector.setIsLongpressEnabled(flag);
    }

    public void setReorderingMode(boolean flag)
    {
        ReorderRecycleAdapter reorderrecycleadapter;
label0:
        {
            mDoDragDrop = flag;
            reorderrecycleadapter = getAdapter();
            if (reorderrecycleadapter != null)
            {
                if (!flag)
                {
                    break label0;
                }
                reorderrecycleadapter.startRearrange();
            }
            return;
        }
        reorderrecycleadapter.endRearrange();
    }

    void upDateFloatingViewHolder(ReorderRecycleAdapter.DraggableViewHolder draggableviewholder)
    {
        if (draggableviewholder != null && draggableviewholder != mFloatingViewHolder)
        {
            mFloatingViewHolder.setIsRecyclable(true);
            draggableviewholder.setIsRecyclable(false);
            mFloatingViewHolder = draggableviewholder;
        }
    }





}
