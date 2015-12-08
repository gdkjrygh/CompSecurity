// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.animation.AnimatorCompatHelper;
import android.support.v4.animation.AnimatorListenerCompat;
import android.support.v4.animation.AnimatorUpdateListenerCompat;
import android.support.v4.animation.ValueAnimatorCompat;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchUIUtil

public class ItemTouchHelper extends android.support.v7.widget.RecyclerView.ItemDecoration
    implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
{
    public static abstract class Callback
    {

        private static final int ABS_HORIZONTAL_DIR_FLAGS = 0xc0c0c;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
        static final int RELATIVE_DIR_FLAGS = 0x303030;
        private static final Interpolator sDragScrollInterpolator = new Interpolator() {

            public float getInterpolation(float f)
            {
                return f * f * f * f * f;
            }

        };
        private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() {

            public float getInterpolation(float f)
            {
                f--;
                return f * f * f * f * f + 1.0F;
            }

        };
        private static final ItemTouchUIUtil sUICallback;
        private int mCachedMaxScrollSpeed;

        public static int convertToRelativeDirection(int i, int j)
        {
            int k = i & 0xc0c0c;
            if (k == 0)
            {
                return i;
            }
            i &= ~k;
            if (j == 0)
            {
                return i | k << 2;
            } else
            {
                return i | k << 1 & 0xfff3f3f3 | (k << 1 & 0xc0c0c) << 2;
            }
        }

        public static ItemTouchUIUtil getDefaultUIUtil()
        {
            return sUICallback;
        }

        private int getMaxDragScroll(RecyclerView recyclerview)
        {
            if (mCachedMaxScrollSpeed == -1)
            {
                mCachedMaxScrollSpeed = recyclerview.getResources().getDimensionPixelSize(android.support.v7.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return mCachedMaxScrollSpeed;
        }

        private boolean hasDragFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return (0xff0000 & getAbsoluteMovementFlags(recyclerview, viewholder)) != 0;
        }

        private boolean hasSwipeFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return (0xff00 & getAbsoluteMovementFlags(recyclerview, viewholder)) != 0;
        }

        public static int makeFlag(int i, int j)
        {
            return j << i * 8;
        }

        public static int makeMovementFlags(int i, int j)
        {
            return makeFlag(0, j | i) | makeFlag(1, j) | makeFlag(2, i);
        }

        private void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
        {
            int l = list.size();
            for (int j = 0; j < l; j++)
            {
                RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
                recoveranimation.update();
                int i1 = canvas.save();
                onChildDraw(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
                canvas.restoreToCount(i1);
            }

            if (viewholder != null)
            {
                int k = canvas.save();
                onChildDraw(canvas, recyclerview, viewholder, f, f1, i, true);
                canvas.restoreToCount(k);
            }
        }

        private void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
        {
            int l = list.size();
            for (int j = 0; j < l; j++)
            {
                RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
                int i1 = canvas.save();
                onChildDrawOver(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
                canvas.restoreToCount(i1);
            }

            if (viewholder != null)
            {
                int k = canvas.save();
                onChildDrawOver(canvas, recyclerview, viewholder, f, f1, i, true);
                canvas.restoreToCount(k);
            }
            boolean flag = false;
            i = l - 1;
            while (i >= 0) 
            {
                canvas = (RecoverAnimation)list.get(i);
                if (((RecoverAnimation) (canvas)).mEnded && !((RecoverAnimation) (canvas)).mIsPendingCleanup)
                {
                    list.remove(i);
                    ((RecoverAnimation) (canvas)).mViewHolder.setIsRecyclable(true);
                } else
                if (!((RecoverAnimation) (canvas)).mEnded)
                {
                    flag = true;
                }
                i--;
            }
            if (flag)
            {
                recyclerview.invalidate();
            }
        }

        public boolean canDropOver(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1)
        {
            return true;
        }

        public android.support.v7.widget.RecyclerView.ViewHolder chooseDropTarget(android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, int j)
        {
            int j2 = viewholder.itemView.getWidth();
            int k2 = viewholder.itemView.getHeight();
            android.support.v7.widget.RecyclerView.ViewHolder viewholder3 = null;
            int l = -1;
            int l2 = i - viewholder.itemView.getLeft();
            int i3 = j - viewholder.itemView.getTop();
            int j3 = list.size();
            for (int i1 = 0; i1 < j3; i1++)
            {
                android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = (android.support.v7.widget.RecyclerView.ViewHolder)list.get(i1);
                android.support.v7.widget.RecyclerView.ViewHolder viewholder2 = viewholder3;
                int k = l;
                if (l2 > 0)
                {
                    int j1 = viewholder1.itemView.getRight() - (i + j2);
                    viewholder2 = viewholder3;
                    k = l;
                    if (j1 < 0)
                    {
                        viewholder2 = viewholder3;
                        k = l;
                        if (viewholder1.itemView.getRight() > viewholder.itemView.getRight())
                        {
                            j1 = Math.abs(j1);
                            viewholder2 = viewholder3;
                            k = l;
                            if (j1 > l)
                            {
                                k = j1;
                                viewholder2 = viewholder1;
                            }
                        }
                    }
                }
                viewholder3 = viewholder2;
                l = k;
                if (l2 < 0)
                {
                    int k1 = viewholder1.itemView.getLeft() - i;
                    viewholder3 = viewholder2;
                    l = k;
                    if (k1 > 0)
                    {
                        viewholder3 = viewholder2;
                        l = k;
                        if (viewholder1.itemView.getLeft() < viewholder.itemView.getLeft())
                        {
                            k1 = Math.abs(k1);
                            viewholder3 = viewholder2;
                            l = k;
                            if (k1 > k)
                            {
                                l = k1;
                                viewholder3 = viewholder1;
                            }
                        }
                    }
                }
                viewholder2 = viewholder3;
                k = l;
                if (i3 < 0)
                {
                    int l1 = viewholder1.itemView.getTop() - j;
                    viewholder2 = viewholder3;
                    k = l;
                    if (l1 > 0)
                    {
                        viewholder2 = viewholder3;
                        k = l;
                        if (viewholder1.itemView.getTop() < viewholder.itemView.getTop())
                        {
                            l1 = Math.abs(l1);
                            viewholder2 = viewholder3;
                            k = l;
                            if (l1 > l)
                            {
                                k = l1;
                                viewholder2 = viewholder1;
                            }
                        }
                    }
                }
                viewholder3 = viewholder2;
                l = k;
                if (i3 <= 0)
                {
                    continue;
                }
                int i2 = viewholder1.itemView.getBottom() - (j + k2);
                viewholder3 = viewholder2;
                l = k;
                if (i2 >= 0)
                {
                    continue;
                }
                viewholder3 = viewholder2;
                l = k;
                if (viewholder1.itemView.getBottom() <= viewholder.itemView.getBottom())
                {
                    continue;
                }
                i2 = Math.abs(i2);
                viewholder3 = viewholder2;
                l = k;
                if (i2 > k)
                {
                    l = i2;
                    viewholder3 = viewholder1;
                }
            }

            return viewholder3;
        }

        public void clearView(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            sUICallback.clearView(viewholder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int j)
        {
            int k = i & 0x303030;
            if (k == 0)
            {
                return i;
            }
            i &= ~k;
            if (j == 0)
            {
                return i | k >> 2;
            } else
            {
                return i | k >> 1 & 0xffcfcfcf | (k >> 1 & 0x303030) >> 2;
            }
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return convertToAbsoluteDirection(getMovementFlags(recyclerview, viewholder), ViewCompat.getLayoutDirection(recyclerview));
        }

        public long getAnimationDuration(RecyclerView recyclerview, int i, float f, float f1)
        {
            recyclerview = recyclerview.getItemAnimator();
            if (recyclerview == null)
            {
                return i != 8 ? 250L : 200L;
            }
            if (i == 8)
            {
                return recyclerview.getMoveDuration();
            } else
            {
                return recyclerview.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin()
        {
            return 0;
        }

        public float getMoveThreshold(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return 0.5F;
        }

        public abstract int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder);

        public float getSwipeThreshold(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return 0.5F;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerview, int i, int j, int k, long l)
        {
            k = getMaxDragScroll(recyclerview);
            int i1 = Math.abs(j);
            int j1 = (int)Math.signum(j);
            float f = Math.min(1.0F, (1.0F * (float)i1) / (float)i);
            i = (int)((float)(j1 * k) * sDragViewScrollCapInterpolator.getInterpolation(f));
            if (l > 2000L)
            {
                f = 1.0F;
            } else
            {
                f = (float)l / 2000F;
            }
            i = (int)((float)i * sDragScrollInterpolator.getInterpolation(f));
            if (i == 0)
            {
                return j <= 0 ? -1 : 1;
            } else
            {
                return i;
            }
        }

        public boolean isItemViewSwipeEnabled()
        {
            return true;
        }

        public boolean isLongPressDragEnabled()
        {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
        {
            sUICallback.onDraw(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
        {
            sUICallback.onDrawOver(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
        }

        public abstract boolean onMove(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1);

        public void onMoved(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int j, int k, int l)
        {
            android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
            if (layoutmanager instanceof ViewDropHandler)
            {
                ((ViewDropHandler)layoutmanager).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
            } else
            {
                if (layoutmanager.canScrollHorizontally())
                {
                    if (layoutmanager.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
                    {
                        recyclerview.scrollToPosition(j);
                    }
                    if (layoutmanager.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
                    {
                        recyclerview.scrollToPosition(j);
                    }
                }
                if (layoutmanager.canScrollVertically())
                {
                    if (layoutmanager.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
                    {
                        recyclerview.scrollToPosition(j);
                    }
                    if (layoutmanager.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
                    {
                        recyclerview.scrollToPosition(j);
                        return;
                    }
                }
            }
        }

        public void onSelectedChanged(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            if (viewholder != null)
            {
                sUICallback.onSelected(viewholder.itemView);
            }
        }

        public abstract void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i);

        static 
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                sUICallback = new ItemTouchUIUtilImpl.Lollipop();
            } else
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                sUICallback = new ItemTouchUIUtilImpl.Honeycomb();
            } else
            {
                sUICallback = new ItemTouchUIUtilImpl.Gingerbread();
            }
        }





        public Callback()
        {
            mCachedMaxScrollSpeed = -1;
        }
    }

    private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final ItemTouchHelper this$0;

        public boolean onDown(MotionEvent motionevent)
        {
            return true;
        }

        public void onLongPress(MotionEvent motionevent)
        {
            Object obj;
            obj = findChildView(motionevent);
            if (obj != null)
            {
                obj = mRecyclerView.getChildViewHolder(((View) (obj)));
                break MISSING_BLOCK_LABEL_29;
            }
_L1:
            return;
            if (obj != null && mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))) && MotionEventCompat.getPointerId(motionevent, 0) == mActivePointerId)
            {
                int i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
                float f = MotionEventCompat.getX(motionevent, i);
                float f1 = MotionEventCompat.getY(motionevent, i);
                mInitialTouchX = f;
                mInitialTouchY = f1;
                motionevent = ItemTouchHelper.this;
                mDy = 0.0F;
                motionevent.mDx = 0.0F;
                if (mCallback.isLongPressDragEnabled())
                {
                    select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
                    return;
                }
            }
              goto _L1
        }

        private ItemTouchHelperGestureListener()
        {
            this$0 = ItemTouchHelper.this;
            super();
        }

    }

    private class RecoverAnimation
        implements AnimatorListenerCompat
    {

        final int mActionState;
        private final int mAnimationType;
        private boolean mEnded;
        private float mFraction;
        public boolean mIsPendingCleanup;
        boolean mOverridden;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        private final ValueAnimatorCompat mValueAnimator = AnimatorCompatHelper.emptyValueAnimator();
        final android.support.v7.widget.RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;
        final ItemTouchHelper this$0;

        public void cancel()
        {
            mValueAnimator.cancel();
        }

        public void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat)
        {
            setFraction(1.0F);
        }

        public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
        {
            mEnded = true;
        }

        public void onAnimationRepeat(ValueAnimatorCompat valueanimatorcompat)
        {
        }

        public void onAnimationStart(ValueAnimatorCompat valueanimatorcompat)
        {
        }

        public void setDuration(long l)
        {
            mValueAnimator.setDuration(l);
        }

        public void setFraction(float f)
        {
            mFraction = f;
        }

        public void start()
        {
            mViewHolder.setIsRecyclable(false);
            mValueAnimator.start();
        }

        public void update()
        {
            if (mStartDx == mTargetX)
            {
                mX = ViewCompat.getTranslationX(mViewHolder.itemView);
            } else
            {
                mX = mStartDx + mFraction * (mTargetX - mStartDx);
            }
            if (mStartDy == mTargetY)
            {
                mY = ViewCompat.getTranslationY(mViewHolder.itemView);
                return;
            } else
            {
                mY = mStartDy + mFraction * (mTargetY - mStartDy);
                return;
            }
        }



        public RecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, int j, float f, float f1, float f2, 
                float f3)
        {
            this$0 = ItemTouchHelper.this;
            super();
            mOverridden = false;
            mEnded = false;
            mActionState = j;
            mAnimationType = i;
            mViewHolder = viewholder;
            mStartDx = f;
            mStartDy = f1;
            mTargetX = f2;
            mTargetY = f3;
            mValueAnimator.addUpdateListener(new _cls1());
            mValueAnimator.setTarget(viewholder.itemView);
            mValueAnimator.addListener(this);
            setFraction(0.0F);
        }
    }

    public static abstract class SimpleCallback extends Callback
    {

        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public int getDragDirs(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return mDefaultDragDirs;
        }

        public int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return makeMovementFlags(getDragDirs(recyclerview, viewholder), getSwipeDirs(recyclerview, viewholder));
        }

        public int getSwipeDirs(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            return mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i)
        {
            mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i)
        {
            mDefaultSwipeDirs = i;
        }

        public SimpleCallback(int i, int j)
        {
            mDefaultSwipeDirs = j;
            mDefaultDragDirs = i;
        }
    }

    public static interface ViewDropHandler
    {

        public abstract void prepareForDrop(View view, View view1, int i, int j);
    }


    private static final int ACTION_MODE_DRAG_MASK = 0xff0000;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    private static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    private static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    int mActionState;
    int mActivePointerId;
    Callback mCallback;
    private android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private List mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    private GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private final android.support.v7.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener = new android.support.v7.widget.RecyclerView.OnItemTouchListener() {

        final ItemTouchHelper this$0;

        public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
        {
            mGestureDetector.onTouchEvent(motionevent);
            int i = MotionEventCompat.getActionMasked(motionevent);
            if (i == 0)
            {
                mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
                mInitialTouchX = motionevent.getX();
                mInitialTouchY = motionevent.getY();
                obtainVelocityTracker();
                if (mSelected == null)
                {
                    recyclerview = findAnimation(motionevent);
                    if (recyclerview != null)
                    {
                        ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
                        itemtouchhelper.mInitialTouchX = itemtouchhelper.mInitialTouchX - ((RecoverAnimation) (recyclerview)).mX;
                        itemtouchhelper = ItemTouchHelper.this;
                        itemtouchhelper.mInitialTouchY = itemtouchhelper.mInitialTouchY - ((RecoverAnimation) (recyclerview)).mY;
                        endRecoverAnimation(((RecoverAnimation) (recyclerview)).mViewHolder, true);
                        if (mPendingCleanup.remove(((RecoverAnimation) (recyclerview)).mViewHolder.itemView))
                        {
                            mCallback.clearView(mRecyclerView, ((RecoverAnimation) (recyclerview)).mViewHolder);
                        }
                        select(((RecoverAnimation) (recyclerview)).mViewHolder, ((RecoverAnimation) (recyclerview)).mActionState);
                        updateDxDy(motionevent, mSelectedFlags, 0);
                    }
                }
            } else
            if (i == 3 || i == 1)
            {
                mActivePointerId = -1;
                select(null, 0);
            } else
            if (mActivePointerId != -1)
            {
                int j = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
                if (j >= 0)
                {
                    checkSelectForSwipe(i, motionevent, j);
                }
            }
            if (mVelocityTracker != null)
            {
                mVelocityTracker.addMovement(motionevent);
            }
            return mSelected != null;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean flag)
        {
            if (!flag)
            {
                return;
            } else
            {
                select(null, 0);
                return;
            }
        }

        public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
        {
            int i;
            i = 0;
            mGestureDetector.onTouchEvent(motionevent);
            if (mVelocityTracker != null)
            {
                mVelocityTracker.addMovement(motionevent);
            }
            if (mActivePointerId != -1) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int j;
            int k;
            j = MotionEventCompat.getActionMasked(motionevent);
            k = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            if (k >= 0)
            {
                checkSelectForSwipe(j, motionevent, k);
            }
            recyclerview = mSelected;
            if (recyclerview == null) goto _L1; else goto _L3
_L3:
            switch (j)
            {
            case 4: // '\004'
            case 5: // '\005'
            default:
                return;

            case 1: // '\001'
            case 3: // '\003'
                if (mVelocityTracker != null)
                {
                    mVelocityTracker.computeCurrentVelocity(1000, mRecyclerView.getMaxFlingVelocity());
                }
                select(null, 0);
                mActivePointerId = -1;
                return;

            case 2: // '\002'
                if (k >= 0)
                {
                    updateDxDy(motionevent, mSelectedFlags, k);
                    moveIfNecessary(recyclerview);
                    mRecyclerView.removeCallbacks(mScrollRunnable);
                    mScrollRunnable.run();
                    mRecyclerView.invalidate();
                    return;
                }
                break;

            case 6: // '\006'
                j = MotionEventCompat.getActionIndex(motionevent);
                continue; /* Loop/switch isn't completed */
            }
            if (true) goto _L1; else goto _L4
_L4:
            if (MotionEventCompat.getPointerId(motionevent, j) != mActivePointerId) goto _L1; else goto _L5
_L5:
            if (mVelocityTracker != null)
            {
                mVelocityTracker.computeCurrentVelocity(1000, mRecyclerView.getMaxFlingVelocity());
            }
            if (j == 0)
            {
                i = 1;
            }
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
            updateDxDy(motionevent, mSelectedFlags, j);
            return;
        }

            
            {
                this$0 = ItemTouchHelper.this;
                super();
            }
    };
    private View mOverdrawChild;
    private int mOverdrawChildPosition;
    final List mPendingCleanup = new ArrayList();
    List mRecoverAnimations;
    private RecyclerView mRecyclerView;
    private final Runnable mScrollRunnable = new Runnable() {

        final ItemTouchHelper this$0;

        public void run()
        {
            if (mSelected != null && scrollIfNecessary())
            {
                if (mSelected != null)
                {
                    moveIfNecessary(mSelected);
                }
                mRecyclerView.removeCallbacks(mScrollRunnable);
                ViewCompat.postOnAnimation(mRecyclerView, this);
            }
        }

            
            {
                this$0 = ItemTouchHelper.this;
                super();
            }
    };
    android.support.v7.widget.RecyclerView.ViewHolder mSelected;
    int mSelectedFlags;
    float mSelectedStartX;
    float mSelectedStartY;
    private int mSlop;
    private List mSwapTargets;
    private final float mTmpPosition[] = new float[2];
    private Rect mTmpRect;
    private VelocityTracker mVelocityTracker;

    public ItemTouchHelper(Callback callback)
    {
        mSelected = null;
        mActivePointerId = -1;
        mActionState = 0;
        mRecoverAnimations = new ArrayList();
        mChildDrawingOrderCallback = null;
        mOverdrawChild = null;
        mOverdrawChildPosition = -1;
        mCallback = callback;
    }

    private void addChildDrawingOrderCallback()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return;
        }
        if (mChildDrawingOrderCallback == null)
        {
            mChildDrawingOrderCallback = new android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback() {

                final ItemTouchHelper this$0;

                public int onGetChildDrawingOrder(int i, int j)
                {
                    if (mOverdrawChild != null)
                    {
                        int l = mOverdrawChildPosition;
                        int k = l;
                        if (l == -1)
                        {
                            k = mRecyclerView.indexOfChild(mOverdrawChild);
                            mOverdrawChildPosition = k;
                        }
                        if (j == i - 1)
                        {
                            return k;
                        }
                        if (j >= k)
                        {
                            return j + 1;
                        }
                    }
                    return j;
                }

            
            {
                this$0 = ItemTouchHelper.this;
                super();
            }
            };
        }
        mRecyclerView.setChildDrawingOrderCallback(mChildDrawingOrderCallback);
    }

    private int checkHorizontalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        if ((i & 0xc) != 0)
        {
            byte byte0;
            if (mDx > 0.0F)
            {
                byte0 = 8;
            } else
            {
                byte0 = 4;
            }
            if (mVelocityTracker != null && mActivePointerId > -1)
            {
                float f = VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId);
                byte byte1;
                if (f > 0.0F)
                {
                    byte1 = 8;
                } else
                {
                    byte1 = 4;
                }
                if ((byte1 & i) != 0 && byte0 == byte1 && Math.abs(f) >= (float)mRecyclerView.getMinFlingVelocity())
                {
                    return byte1;
                }
            }
            float f1 = mRecyclerView.getWidth();
            float f2 = mCallback.getSwipeThreshold(viewholder);
            if ((i & byte0) != 0 && Math.abs(mDx) > f1 * f2)
            {
                return byte0;
            }
        }
        return 0;
    }

    private boolean checkSelectForSwipe(int i, MotionEvent motionevent, int j)
    {
        if (mSelected != null || i != 2 || mActionState == 2 || !mCallback.isItemViewSwipeEnabled())
        {
            return false;
        }
        if (mRecyclerView.getScrollState() == 1)
        {
            return false;
        }
        android.support.v7.widget.RecyclerView.ViewHolder viewholder = findSwipedView(motionevent);
        if (viewholder == null)
        {
            return false;
        }
        i = (0xff00 & mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder)) >> 8;
        if (i == 0)
        {
            return false;
        }
        float f = MotionEventCompat.getX(motionevent, j);
        float f1 = MotionEventCompat.getY(motionevent, j);
        f -= mInitialTouchX;
        f1 -= mInitialTouchY;
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if (f2 < (float)mSlop && f3 < (float)mSlop)
        {
            return false;
        }
        if (f2 > f3)
        {
            if (f < 0.0F && (i & 4) == 0)
            {
                return false;
            }
            if (f > 0.0F && (i & 8) == 0)
            {
                return false;
            }
        } else
        {
            if (f1 < 0.0F && (i & 1) == 0)
            {
                return false;
            }
            if (f1 > 0.0F && (i & 2) == 0)
            {
                return false;
            }
        }
        mDy = 0.0F;
        mDx = 0.0F;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        select(viewholder, 1);
        return true;
    }

    private int checkVerticalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        if ((i & 3) != 0)
        {
            byte byte0;
            if (mDy > 0.0F)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            if (mVelocityTracker != null && mActivePointerId > -1)
            {
                float f = VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId);
                byte byte1;
                if (f > 0.0F)
                {
                    byte1 = 2;
                } else
                {
                    byte1 = 1;
                }
                if ((byte1 & i) != 0 && byte1 == byte0 && Math.abs(f) >= (float)mRecyclerView.getMinFlingVelocity())
                {
                    return byte1;
                }
            }
            float f1 = mRecyclerView.getHeight();
            float f2 = mCallback.getSwipeThreshold(viewholder);
            if ((i & byte0) != 0 && Math.abs(mDy) > f1 * f2)
            {
                return byte0;
            }
        }
        return 0;
    }

    private void destroyCallbacks()
    {
        mRecyclerView.removeItemDecoration(this);
        mRecyclerView.removeOnItemTouchListener(mOnItemTouchListener);
        mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
        {
            RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(0);
            mCallback.clearView(mRecyclerView, recoveranimation.mViewHolder);
        }

        mRecoverAnimations.clear();
        mOverdrawChild = null;
        mOverdrawChildPosition = -1;
        releaseVelocityTracker();
    }

    private int endRecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, boolean flag)
    {
        for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
        {
            RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
            if (recoveranimation.mViewHolder == viewholder)
            {
                recoveranimation.mOverridden = recoveranimation.mOverridden | flag;
                if (!recoveranimation.mEnded)
                {
                    recoveranimation.cancel();
                }
                mRecoverAnimations.remove(i);
                recoveranimation.mViewHolder.setIsRecyclable(true);
                return recoveranimation.mAnimationType;
            }
        }

        return 0;
    }

    private RecoverAnimation findAnimation(MotionEvent motionevent)
    {
        if (!mRecoverAnimations.isEmpty()) goto _L2; else goto _L1
_L1:
        motionevent = null;
_L4:
        return motionevent;
_L2:
        View view = findChildView(motionevent);
        int i = mRecoverAnimations.size() - 1;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
                motionevent = recoveranimation;
                if (recoveranimation.mViewHolder.itemView == view)
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private View findChildView(MotionEvent motionevent)
    {
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        if (mSelected != null)
        {
            motionevent = mSelected.itemView;
            if (hitTest(motionevent, f, f1, mSelectedStartX + mDx, mSelectedStartY + mDy))
            {
                return motionevent;
            }
        }
        for (int i = mRecoverAnimations.size() - 1; i >= 0; i--)
        {
            motionevent = (RecoverAnimation)mRecoverAnimations.get(i);
            View view = ((RecoverAnimation) (motionevent)).mViewHolder.itemView;
            if (hitTest(view, f, f1, ((RecoverAnimation) (motionevent)).mX, ((RecoverAnimation) (motionevent)).mY))
            {
                return view;
            }
        }

        return mRecyclerView.findChildViewUnder(f, f1);
    }

    private List findSwapTargets(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        View view;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        android.support.v7.widget.RecyclerView.LayoutManager layoutmanager;
        int i;
        int k2;
        if (mSwapTargets == null)
        {
            mSwapTargets = new ArrayList();
            mDistances = new ArrayList();
        } else
        {
            mSwapTargets.clear();
            mDistances.clear();
        }
        i = mCallback.getBoundingBoxMargin();
        i1 = Math.round(mSelectedStartX + mDx) - i;
        j1 = Math.round(mSelectedStartY + mDy) - i;
        k1 = viewholder.itemView.getWidth() + i1 + i * 2;
        l1 = viewholder.itemView.getHeight() + j1 + i * 2;
        i2 = (i1 + k1) / 2;
        j2 = (j1 + l1) / 2;
        layoutmanager = mRecyclerView.getLayoutManager();
        k2 = layoutmanager.getChildCount();
        i = 0;
        if (i >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        view = layoutmanager.getChildAt(i);
        if (view != viewholder.itemView && view.getBottom() >= j1 && view.getTop() <= l1 && view.getRight() >= i1 && view.getLeft() <= k1)
        {
            android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = mRecyclerView.getChildViewHolder(view);
            if (mCallback.canDropOver(mRecyclerView, mSelected, viewholder1))
            {
                int j = Math.abs(i2 - (view.getLeft() + view.getRight()) / 2);
                int l = Math.abs(j2 - (view.getTop() + view.getBottom()) / 2);
                int l2 = j * j + l * l;
                l = 0;
                int i3 = mSwapTargets.size();
                for (int k = 0; k < i3 && l2 > ((Integer)mDistances.get(k)).intValue(); k++)
                {
                    l++;
                }

                mSwapTargets.add(l, viewholder1);
                mDistances.add(l, Integer.valueOf(l2));
            }
        }
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_141;
_L1:
        return mSwapTargets;
    }

    private android.support.v7.widget.RecyclerView.ViewHolder findSwipedView(MotionEvent motionevent)
    {
        android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
        if (mActivePointerId != -1)
        {
            int i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            float f2 = MotionEventCompat.getX(motionevent, i);
            float f3 = mInitialTouchX;
            float f = MotionEventCompat.getY(motionevent, i);
            float f1 = mInitialTouchY;
            f2 = Math.abs(f2 - f3);
            f = Math.abs(f - f1);
            if ((f2 >= (float)mSlop || f >= (float)mSlop) && (f2 <= f || !layoutmanager.canScrollHorizontally()) && (f <= f2 || !layoutmanager.canScrollVertically()))
            {
                motionevent = findChildView(motionevent);
                if (motionevent != null)
                {
                    return mRecyclerView.getChildViewHolder(motionevent);
                }
            }
        }
        return null;
    }

    private void getSelectedDxDy(float af[])
    {
        if ((mSelectedFlags & 0xc) != 0)
        {
            af[0] = (mSelectedStartX + mDx) - (float)mSelected.itemView.getLeft();
        } else
        {
            af[0] = ViewCompat.getTranslationX(mSelected.itemView);
        }
        if ((mSelectedFlags & 3) != 0)
        {
            af[1] = (mSelectedStartY + mDy) - (float)mSelected.itemView.getTop();
            return;
        } else
        {
            af[1] = ViewCompat.getTranslationY(mSelected.itemView);
            return;
        }
    }

    private boolean hasRunningRecoverAnim()
    {
        int j = mRecoverAnimations.size();
        for (int i = 0; i < j; i++)
        {
            if (!((RecoverAnimation)mRecoverAnimations.get(i)).mEnded)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean hitTest(View view, float f, float f1, float f2, float f3)
    {
        return f >= f2 && f <= (float)view.getWidth() + f2 && f1 >= f3 && f1 <= (float)view.getHeight() + f3;
    }

    private void initGestureDetector()
    {
        if (mGestureDetector != null)
        {
            return;
        } else
        {
            mGestureDetector = new GestureDetectorCompat(mRecyclerView.getContext(), new ItemTouchHelperGestureListener());
            return;
        }
    }

    private void moveIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        if (!mRecyclerView.isLayoutRequested() && mActionState == 2)
        {
            float f = mCallback.getMoveThreshold(viewholder);
            int i = (int)(mSelectedStartX + mDx);
            int j = (int)(mSelectedStartY + mDy);
            if ((float)Math.abs(j - viewholder.itemView.getTop()) >= (float)viewholder.itemView.getHeight() * f || (float)Math.abs(i - viewholder.itemView.getLeft()) >= (float)viewholder.itemView.getWidth() * f)
            {
                Object obj = findSwapTargets(viewholder);
                if (((List) (obj)).size() != 0)
                {
                    obj = mCallback.chooseDropTarget(viewholder, ((List) (obj)), i, j);
                    if (obj == null)
                    {
                        mSwapTargets.clear();
                        mDistances.clear();
                        return;
                    }
                    int k = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).getAdapterPosition();
                    int l = viewholder.getAdapterPosition();
                    if (mCallback.onMove(mRecyclerView, viewholder, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
                    {
                        mCallback.onMoved(mRecyclerView, viewholder, l, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), k, i, j);
                        return;
                    }
                }
            }
        }
    }

    private void obtainVelocityTracker()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
        }
        mVelocityTracker = VelocityTracker.obtain();
    }

    private void postDispatchSwipe(final RecoverAnimation anim, final int swipeDir)
    {
        mRecyclerView.post(new Runnable() {

            final ItemTouchHelper this$0;
            final RecoverAnimation val$anim;
            final int val$swipeDir;

            public void run()
            {
label0:
                {
                    if (mRecyclerView != null && mRecyclerView.isAttachedToWindow() && !anim.mOverridden && anim.mViewHolder.getAdapterPosition() != -1)
                    {
                        android.support.v7.widget.RecyclerView.ItemAnimator itemanimator = mRecyclerView.getItemAnimator();
                        if (itemanimator != null && itemanimator.isRunning(null) || hasRunningRecoverAnim())
                        {
                            break label0;
                        }
                        mCallback.onSwiped(anim.mViewHolder, swipeDir);
                    }
                    return;
                }
                mRecyclerView.post(this);
            }

            
            {
                this$0 = ItemTouchHelper.this;
                anim = recoveranimation;
                swipeDir = i;
                super();
            }
        });
    }

    private void releaseVelocityTracker()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    private void removeChildDrawingOrderCallbackIfNecessary(View view)
    {
        if (view == mOverdrawChild)
        {
            mOverdrawChild = null;
            if (mChildDrawingOrderCallback != null)
            {
                mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    private boolean scrollIfNecessary()
    {
        if (mSelected == null)
        {
            mDragScrollStartTimeInMs = 0x8000000000000000L;
            return false;
        }
        long l2 = System.currentTimeMillis();
        android.support.v7.widget.RecyclerView.LayoutManager layoutmanager;
        int i;
        int j;
        int k;
        int l;
        long l1;
        if (mDragScrollStartTimeInMs == 0x8000000000000000L)
        {
            l1 = 0L;
        } else
        {
            l1 = l2 - mDragScrollStartTimeInMs;
        }
        layoutmanager = mRecyclerView.getLayoutManager();
        if (mTmpRect == null)
        {
            mTmpRect = new Rect();
        }
        j = 0;
        k = 0;
        layoutmanager.calculateItemDecorationsForChild(mSelected.itemView, mTmpRect);
        i = j;
        if (layoutmanager.canScrollHorizontally())
        {
            l = (int)(mSelectedStartX + mDx);
            i = l - mTmpRect.left - mRecyclerView.getPaddingLeft();
            if (mDx >= 0.0F || i >= 0)
            {
                i = j;
                if (mDx > 0.0F)
                {
                    l = (mSelected.itemView.getWidth() + l + mTmpRect.right) - (mRecyclerView.getWidth() - mRecyclerView.getPaddingRight());
                    i = j;
                    if (l > 0)
                    {
                        i = l;
                    }
                }
            }
        }
        j = k;
        if (layoutmanager.canScrollVertically())
        {
            l = (int)(mSelectedStartY + mDy);
            j = l - mTmpRect.top - mRecyclerView.getPaddingTop();
            if (mDy >= 0.0F || j >= 0)
            {
                j = k;
                if (mDy > 0.0F)
                {
                    l = (mSelected.itemView.getHeight() + l + mTmpRect.bottom) - (mRecyclerView.getHeight() - mRecyclerView.getPaddingBottom());
                    j = k;
                    if (l > 0)
                    {
                        j = l;
                    }
                }
            }
        }
        k = i;
        if (i != 0)
        {
            k = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getWidth(), i, mRecyclerView.getWidth(), l1);
        }
        i = j;
        if (j != 0)
        {
            i = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getHeight(), j, mRecyclerView.getHeight(), l1);
        }
        if (k != 0 || i != 0)
        {
            if (mDragScrollStartTimeInMs == 0x8000000000000000L)
            {
                mDragScrollStartTimeInMs = l2;
            }
            mRecyclerView.scrollBy(k, i);
            return true;
        } else
        {
            mDragScrollStartTimeInMs = 0x8000000000000000L;
            return false;
        }
    }

    private void select(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        final int final_i;
        int j;
        int k;
        if (viewholder == mSelected && i == mActionState)
        {
            return;
        }
        mDragScrollStartTimeInMs = 0x8000000000000000L;
        k = mActionState;
        endRecoverAnimation(viewholder, true);
        mActionState = i;
        if (i == 2)
        {
            mOverdrawChild = viewholder.itemView;
            addChildDrawingOrderCallback();
        }
        final_i = 0;
        j = 0;
        if (mSelected == null) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        final Object final_viewholder;
        final_viewholder = mSelected;
        if (((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView.getParent() == null)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        float f2;
        float f3;
        if (k == 2)
        {
            j = 0;
        } else
        {
            j = swipeIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
        }
        releaseVelocityTracker();
        j;
        JVM INSTR lookupswitch 6: default 164
    //                   1: 470
    //                   2: 470
    //                   4: 447
    //                   8: 447
    //                   16: 447
    //                   32: 447;
           goto _L3 _L4 _L4 _L5 _L5 _L5 _L5
_L3:
        f = 0.0F;
        f1 = 0.0F;
_L6:
        if (k == 2)
        {
            final_i = 8;
        } else
        if (j > 0)
        {
            final_i = 2;
        } else
        {
            final_i = 4;
        }
        getSelectedDxDy(mTmpPosition);
        f2 = mTmpPosition[0];
        f3 = mTmpPosition[1];
        final_viewholder = new RecoverAnimation(k, f2, f3, f, f1, j, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder))) {

            final ItemTouchHelper this$0;
            final android.support.v7.widget.RecyclerView.ViewHolder val$prevSelected;
            final int val$swipeDir;

            public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
            {
                super.onAnimationEnd(valueanimatorcompat);
                if (!mOverridden) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (swipeDir > 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                mCallback.clearView(mRecyclerView, prevSelected);
_L4:
                if (mOverdrawChild == prevSelected.itemView)
                {
                    removeChildDrawingOrderCallbackIfNecessary(prevSelected.itemView);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                mPendingCleanup.add(prevSelected.itemView);
                mIsPendingCleanup = true;
                if (swipeDir > 0)
                {
                    postDispatchSwipe(this, swipeDir);
                }
                  goto _L4
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                this$0 = ItemTouchHelper.this;
                swipeDir = k;
                prevSelected = viewholder1;
                super(final_viewholder, final_i, j, f, f1, f2, f3);
            }
        };
        ((RecoverAnimation) (final_viewholder)).setDuration(mCallback.getAnimationDuration(mRecyclerView, final_i, f - f2, f1 - f3));
        mRecoverAnimations.add(final_viewholder);
        ((RecoverAnimation) (final_viewholder)).start();
        final_i = 1;
_L7:
        mSelected = null;
_L2:
        if (viewholder != null)
        {
            mSelectedFlags = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & (1 << i * 8 + 8) - 1) >> mActionState * 8;
            mSelectedStartX = viewholder.itemView.getLeft();
            mSelectedStartY = viewholder.itemView.getTop();
            mSelected = viewholder;
            if (i == 2)
            {
                mSelected.itemView.performHapticFeedback(0);
            }
        }
        viewholder = mRecyclerView.getParent();
        if (viewholder != null)
        {
            boolean flag;
            if (mSelected != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            viewholder.requestDisallowInterceptTouchEvent(flag);
        }
        if (final_i == 0)
        {
            mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        mCallback.onSelectedChanged(mSelected, mActionState);
        mRecyclerView.invalidate();
        return;
_L5:
        f1 = 0.0F;
        f = Math.signum(mDx) * (float)mRecyclerView.getWidth();
          goto _L6
_L4:
        f = 0.0F;
        f1 = Math.signum(mDy) * (float)mRecyclerView.getHeight();
          goto _L6
        removeChildDrawingOrderCallbackIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView);
        mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
        final_i = j;
          goto _L7
    }

    private void setupCallbacks()
    {
        mSlop = ViewConfiguration.get(mRecyclerView.getContext()).getScaledTouchSlop();
        mRecyclerView.addItemDecoration(this);
        mRecyclerView.addOnItemTouchListener(mOnItemTouchListener);
        mRecyclerView.addOnChildAttachStateChangeListener(this);
        initGestureDetector();
    }

    private int swipeIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        if (mActionState != 2) goto _L2; else goto _L1
_L1:
        int i = 0;
_L8:
        return i;
_L2:
        int l;
        int i1;
        i = mCallback.getMovementFlags(mRecyclerView, viewholder);
        l = (mCallback.convertToAbsoluteDirection(i, ViewCompat.getLayoutDirection(mRecyclerView)) & 0xff00) >> 8;
        if (l == 0)
        {
            return 0;
        }
        i1 = (i & 0xff00) >> 8;
        if (Math.abs(mDx) <= Math.abs(mDy)) goto _L4; else goto _L3
_L3:
        int j = checkHorizontalSwipe(viewholder, l);
        if (j > 0)
        {
            i = j;
            if ((i1 & j) == 0)
            {
                return Callback.convertToRelativeDirection(j, ViewCompat.getLayoutDirection(mRecyclerView));
            }
            continue; /* Loop/switch isn't completed */
        }
        j = checkVerticalSwipe(viewholder, l);
        i = j;
        if (j > 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return 0;
_L4:
        int k;
        k = checkVerticalSwipe(viewholder, l);
        i = k;
        if (k > 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = checkHorizontalSwipe(viewholder, l);
        if (k <= 0) goto _L6; else goto _L5
_L5:
        i = k;
        if ((i1 & k) == 0)
        {
            return Callback.convertToRelativeDirection(k, ViewCompat.getLayoutDirection(mRecyclerView));
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void updateDxDy(MotionEvent motionevent, int i, int j)
    {
        float f = MotionEventCompat.getX(motionevent, j);
        float f1 = MotionEventCompat.getY(motionevent, j);
        mDx = f - mInitialTouchX;
        mDy = f1 - mInitialTouchY;
        if ((i & 4) == 0)
        {
            mDx = Math.max(0.0F, mDx);
        }
        if ((i & 8) == 0)
        {
            mDx = Math.min(0.0F, mDx);
        }
        if ((i & 1) == 0)
        {
            mDy = Math.max(0.0F, mDy);
        }
        if ((i & 2) == 0)
        {
            mDy = Math.min(0.0F, mDy);
        }
    }

    public void attachToRecyclerView(RecyclerView recyclerview)
    {
        if (mRecyclerView != recyclerview)
        {
            if (mRecyclerView != null)
            {
                destroyCallbacks();
            }
            mRecyclerView = recyclerview;
            if (mRecyclerView != null)
            {
                setupCallbacks();
                return;
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        rect.setEmpty();
    }

    public void onChildViewAttachedToWindow(View view)
    {
    }

    public void onChildViewDetachedFromWindow(View view)
    {
        removeChildDrawingOrderCallbackIfNecessary(view);
        view = mRecyclerView.getChildViewHolder(view);
        if (view != null)
        {
            if (mSelected != null && view == mSelected)
            {
                select(null, 0);
                return;
            }
            endRecoverAnimation(view, false);
            if (mPendingCleanup.remove(((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView))
            {
                mCallback.clearView(mRecyclerView, view);
                return;
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        mOverdrawChildPosition = -1;
        float f = 0.0F;
        float f1 = 0.0F;
        if (mSelected != null)
        {
            getSelectedDxDy(mTmpPosition);
            f = mTmpPosition[0];
            f1 = mTmpPosition[1];
        }
        mCallback.onDraw(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        float f = 0.0F;
        float f1 = 0.0F;
        if (mSelected != null)
        {
            getSelectedDxDy(mTmpPosition);
            f = mTmpPosition[0];
            f1 = mTmpPosition[1];
        }
        mCallback.onDrawOver(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
    }

    public void startDrag(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        if (!mCallback.hasDragFlag(mRecyclerView, viewholder))
        {
            Log.e("ItemTouchHelper", "Start drag has been called but swiping is not enabled");
            return;
        }
        if (viewholder.itemView.getParent() != mRecyclerView)
        {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        } else
        {
            obtainVelocityTracker();
            mDy = 0.0F;
            mDx = 0.0F;
            select(viewholder, 2);
            return;
        }
    }

    public void startSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        if (!mCallback.hasSwipeFlag(mRecyclerView, viewholder))
        {
            Log.e("ItemTouchHelper", "Start swipe has been called but dragging is not enabled");
            return;
        }
        if (viewholder.itemView.getParent() != mRecyclerView)
        {
            Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        } else
        {
            obtainVelocityTracker();
            mDy = 0.0F;
            mDx = 0.0F;
            select(viewholder, 1);
            return;
        }
    }












/*
    static int access$2302(ItemTouchHelper itemtouchhelper, int i)
    {
        itemtouchhelper.mOverdrawChildPosition = i;
        return i;
    }

*/









    // Unreferenced inner class android/support/v7/widget/helper/ItemTouchHelper$RecoverAnimation$1

/* anonymous class */
    class RecoverAnimation._cls1
        implements AnimatorUpdateListenerCompat
    {

        final RecoverAnimation this$1;
        final ItemTouchHelper val$this$0;

        public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
        {
            setFraction(valueanimatorcompat.getAnimatedFraction());
        }

            
            {
                this$1 = final_recoveranimation;
                this$0 = ItemTouchHelper.this;
                super();
            }
    }

}
