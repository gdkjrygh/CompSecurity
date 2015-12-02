// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat, SlidingPaneLayout

public class ViewDragHelper
{

    private static final Interpolator sInterpolator;
    private static final String z[];
    private int mActivePointerId;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int mEdgeDragsInProgress[];
    private int mEdgeDragsLocked[];
    private int mEdgeSize;
    private int mInitialEdgesTouched[];
    private float mInitialMotionX[];
    private float mInitialMotionY[];
    private float mLastMotionX[];
    private float mLastMotionY[];
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable = new _cls2();
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    private ViewDragHelper(Context context, ViewGroup viewgroup, Callback callback)
    {
        mActivePointerId = -1;
        if (viewgroup == null)
        {
            throw new IllegalArgumentException(z[3]);
        }
        if (callback == null)
        {
            try
            {
                throw new IllegalArgumentException(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        } else
        {
            mParentView = viewgroup;
            mCallback = callback;
            viewgroup = ViewConfiguration.get(context);
            mEdgeSize = (int)(context.getResources().getDisplayMetrics().density * 20F + 0.5F);
            mTouchSlop = viewgroup.getScaledTouchSlop();
            mMaxVelocity = viewgroup.getScaledMaximumFlingVelocity();
            mMinVelocity = viewgroup.getScaledMinimumFlingVelocity();
            mScroller = ScrollerCompat.create(context, sInterpolator);
            return;
        }
    }

    private boolean checkNewEdgeDrag(float f, float f1, int i, int j)
    {
        f = Math.abs(f);
        f1 = Math.abs(f1);
        int k = mInitialEdgesTouched[i];
        if ((k & j) != j) goto _L2; else goto _L1
_L1:
        k = mTrackingEdges;
        if ((k & j) == 0) goto _L2; else goto _L3
_L3:
        k = mEdgeDragsLocked[i];
        if ((k & j) == j) goto _L2; else goto _L4
_L4:
        k = mEdgeDragsInProgress[i];
        if ((k & j) == j) goto _L2; else goto _L5
_L5:
        k = mTouchSlop;
        if (f > (float)k) goto _L7; else goto _L6
_L6:
        IllegalArgumentException illegalargumentexception;
        try
        {
            k = mTouchSlop;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (f1 > (float)k) goto _L7; else goto _L2
_L2:
        return false;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
_L7:
label0:
        {
            if (f >= f1 * 0.5F)
            {
                break label0;
            }
            int ai[];
            try
            {
                if (!mCallback.onEdgeLock(j))
                {
                    break label0;
                }
                ai = mEdgeDragsLocked;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            ai[i] = ai[i] | j;
            return false;
        }
        try
        {
            i = mEdgeDragsInProgress[i];
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            try
            {
                throw illegalargumentexception3;
            }
            catch (IllegalArgumentException illegalargumentexception4)
            {
                throw illegalargumentexception4;
            }
        }
        if ((i & j) != 0) goto _L2; else goto _L8
_L8:
        if (f <= (float)mTouchSlop) goto _L2; else goto _L9
_L9:
        return true;
    }

    private boolean checkTouchSlop(View view, float f, float f1)
    {
        boolean flag = true;
        if (view != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        int i;
        int k;
        try
        {
            i = mCallback.getViewHorizontalDragRange(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            k = mCallback.getViewVerticalDragRange(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (k > 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (i == 0 || k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            i = mTouchSlop;
            k = mTouchSlop;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (f * f + f1 * f1 <= (float)(i * k))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            f = Math.abs(f);
            i = mTouchSlop;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (f <= (float)i)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (k != 0)
        {
            int j;
            try
            {
                f = Math.abs(f1);
                j = mTouchSlop;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (f <= (float)j)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private float clampMag(float f, float f1, float f2)
    {
        float f3 = Math.abs(f);
        if (f3 < f1)
        {
            f1 = 0.0F;
        } else
        if (f3 > f2)
        {
            f1 = f2;
            if (f <= 0.0F)
            {
                return -f2;
            }
        } else
        {
            return f;
        }
        return f1;
    }

    private int clampMag(int i, int j, int k)
    {
        int l = Math.abs(i);
        if (l < j)
        {
            j = 0;
        } else
        if (l > k)
        {
            j = k;
            if (i <= 0)
            {
                return -k;
            }
        } else
        {
            return i;
        }
        return j;
    }

    private void clearMotionHistory()
    {
        float af[];
        try
        {
            af = mInitialMotionX;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (af == null)
        {
            return;
        } else
        {
            Arrays.fill(mInitialMotionX, 0.0F);
            Arrays.fill(mInitialMotionY, 0.0F);
            Arrays.fill(mLastMotionX, 0.0F);
            Arrays.fill(mLastMotionY, 0.0F);
            Arrays.fill(mInitialEdgesTouched, 0);
            Arrays.fill(mEdgeDragsInProgress, 0);
            Arrays.fill(mEdgeDragsLocked, 0);
            mPointersDown = 0;
            return;
        }
    }

    private void clearMotionHistory(int i)
    {
        float af[];
        try
        {
            af = mInitialMotionX;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (af == null)
        {
            return;
        } else
        {
            mInitialMotionX[i] = 0.0F;
            mInitialMotionY[i] = 0.0F;
            mLastMotionX[i] = 0.0F;
            mLastMotionY[i] = 0.0F;
            mInitialEdgesTouched[i] = 0;
            mEdgeDragsInProgress[i] = 0;
            mEdgeDragsLocked[i] = 0;
            mPointersDown = mPointersDown & ~(1 << i);
            return;
        }
    }

    private int computeAxisDuration(int i, int j, int k)
    {
label0:
        {
            if (i == 0)
            {
                return 0;
            }
            int l = mParentView.getWidth();
            int i1 = l / 2;
            float f2 = Math.min(1.0F, (float)Math.abs(i) / (float)l);
            float f = i1;
            float f1 = i1;
            f2 = distanceInfluenceForSnapDuration(f2);
            j = Math.abs(j);
            if (j > 0)
            {
                j = Math.round(Math.abs((f2 * f1 + f) / (float)j) * 1000F) * 4;
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            j = (int)(((float)Math.abs(i) / (float)k + 1.0F) * 256F);
        }
        return Math.min(j, 600);
    }

    private int computeSettleDuration(View view, int i, int j, int k, int l)
    {
        k = clampMag(k, (int)mMinVelocity, (int)mMaxVelocity);
        l = clampMag(l, (int)mMinVelocity, (int)mMaxVelocity);
        int i1 = Math.abs(i);
        int j1 = Math.abs(j);
        int k1 = Math.abs(k);
        int l1 = Math.abs(l);
        int i2 = k1 + l1;
        int j2 = i1 + j1;
        float f;
        float f1;
        if (k != 0)
        {
            f = (float)k1 / (float)i2;
        } else
        {
            f = (float)i1 / (float)j2;
        }
        if (l != 0)
        {
            f1 = (float)l1 / (float)i2;
        } else
        {
            f1 = (float)j1 / (float)j2;
        }
        i = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
        j = computeAxisDuration(j, l, mCallback.getViewVerticalDragRange(view));
        return (int)(f * (float)i + f1 * (float)j);
    }

    public static ViewDragHelper create(ViewGroup viewgroup, float f, Callback callback)
    {
        viewgroup = create(viewgroup, callback);
        viewgroup.mTouchSlop = (int)((float)((ViewDragHelper) (viewgroup)).mTouchSlop * (1.0F / f));
        return viewgroup;
    }

    public static ViewDragHelper create(ViewGroup viewgroup, Callback callback)
    {
        return new ViewDragHelper(viewgroup.getContext(), viewgroup, callback);
    }

    private void dispatchViewReleased(float f, float f1)
    {
        try
        {
            mReleaseInProgress = true;
            mCallback.onViewReleased(mCapturedView, f, f1);
            mReleaseInProgress = false;
            if (mDragState == 1)
            {
                setDragState(0);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    private float distanceInfluenceForSnapDuration(float f)
    {
        return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
    }

    private void dragTo(int i, int j, int k, int l)
    {
        int i1 = mCapturedView.getLeft();
        int j1 = mCapturedView.getTop();
        if (k != 0)
        {
            i = mCallback.clampViewPositionHorizontal(mCapturedView, i, k);
            mCapturedView.offsetLeftAndRight(i - i1);
        }
        if (l != 0)
        {
            j = mCallback.clampViewPositionVertical(mCapturedView, j, l);
            mCapturedView.offsetTopAndBottom(j - j1);
        }
        if (k != 0 || l != 0)
        {
            mCallback.onViewPositionChanged(mCapturedView, i, j, i - i1, j - j1);
        }
    }

    private void ensureMotionHistorySizeForId(int i)
    {
label0:
        {
label1:
            {
                float af[];
                float af1[];
                float af2[];
                float af3[];
                int ai[];
                int ai1[];
                int ai2[];
                int j;
                try
                {
                    if (mInitialMotionX == null)
                    {
                        break label1;
                    }
                    j = mInitialMotionX.length;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (j > i)
                {
                    break label0;
                }
            }
            af = new float[i + 1];
            af1 = new float[i + 1];
            af2 = new float[i + 1];
            af3 = new float[i + 1];
            ai = new int[i + 1];
            ai1 = new int[i + 1];
            ai2 = new int[i + 1];
            try
            {
                if (mInitialMotionX != null)
                {
                    System.arraycopy(mInitialMotionX, 0, af, 0, mInitialMotionX.length);
                    System.arraycopy(mInitialMotionY, 0, af1, 0, mInitialMotionY.length);
                    System.arraycopy(mLastMotionX, 0, af2, 0, mLastMotionX.length);
                    System.arraycopy(mLastMotionY, 0, af3, 0, mLastMotionY.length);
                    System.arraycopy(mInitialEdgesTouched, 0, ai, 0, mInitialEdgesTouched.length);
                    System.arraycopy(mEdgeDragsInProgress, 0, ai1, 0, mEdgeDragsInProgress.length);
                    System.arraycopy(mEdgeDragsLocked, 0, ai2, 0, mEdgeDragsLocked.length);
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            mInitialMotionX = af;
            mInitialMotionY = af1;
            mLastMotionX = af2;
            mLastMotionY = af3;
            mInitialEdgesTouched = ai;
            mEdgeDragsInProgress = ai1;
            mEdgeDragsLocked = ai2;
        }
    }

    private boolean forceSettleCapturedViewAt(int i, int j, int k, int l)
    {
        int i1 = mCapturedView.getLeft();
        int j1 = mCapturedView.getTop();
        i -= i1;
        j -= j1;
        if (i == 0 && j == 0)
        {
            try
            {
                mScroller.abortAnimation();
                setDragState(0);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return false;
        } else
        {
            k = computeSettleDuration(mCapturedView, i, j, k, l);
            mScroller.startScroll(i1, j1, i, j, k);
            setDragState(2);
            return true;
        }
    }

    private int getEdgesTouched(int i, int j)
    {
        int l = 0;
        if (i < mParentView.getLeft() + mEdgeSize)
        {
            l = 1;
        }
        int k = l;
        if (j < mParentView.getTop() + mEdgeSize)
        {
            k = l | 4;
        }
        l = k;
        if (i > mParentView.getRight() - mEdgeSize)
        {
            l = k | 2;
        }
        i = l;
        if (j > mParentView.getBottom() - mEdgeSize)
        {
            i = l | 8;
        }
        return i;
    }

    private void releaseViewForPointerUp()
    {
        mVelocityTracker.computeCurrentVelocity(1000, mMaxVelocity);
        dispatchViewReleased(clampMag(VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId), mMinVelocity, mMaxVelocity), clampMag(VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId), mMinVelocity, mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f, float f1, int i)
    {
        int k = 1;
        int ai[];
        int j;
        if (!checkNewEdgeDrag(f, f1, i, 1))
        {
            k = 0;
        }
        j = k;
        if (checkNewEdgeDrag(f1, f, i, 4))
        {
            j = k | 4;
        }
        k = j;
        if (checkNewEdgeDrag(f, f1, i, 2))
        {
            k = j | 2;
        }
        j = k;
        if (checkNewEdgeDrag(f1, f, i, 8))
        {
            j = k | 8;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        try
        {
            ai = mEdgeDragsInProgress;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        ai[i] = ai[i] | j;
        mCallback.onEdgeDragStarted(j, i);
    }

    private void saveInitialMotion(float f, float f1, int i)
    {
        ensureMotionHistorySizeForId(i);
        float af[] = mInitialMotionX;
        mLastMotionX[i] = f;
        af[i] = f;
        af = mInitialMotionY;
        mLastMotionY[i] = f1;
        af[i] = f1;
        mInitialEdgesTouched[i] = getEdgesTouched((int)f, (int)f1);
        mPointersDown = mPointersDown | 1 << i;
    }

    private void saveLastMotion(MotionEvent motionevent)
    {
        int j = SlidingPaneLayout.a;
        int k = MotionEventCompat.getPointerCount(motionevent);
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            int l = MotionEventCompat.getPointerId(motionevent, i);
            float f = MotionEventCompat.getX(motionevent, i);
            float f1 = MotionEventCompat.getY(motionevent, i);
            mLastMotionX[l] = f;
            mLastMotionY[l] = f1;
            i++;
        } while (j == 0);
    }

    public void abort()
    {
        cancel();
        if (mDragState == 2)
        {
            int i = mScroller.getCurrX();
            int j = mScroller.getCurrY();
            mScroller.abortAnimation();
            int k = mScroller.getCurrX();
            int l = mScroller.getCurrY();
            mCallback.onViewPositionChanged(mCapturedView, k, l, k - i, l - j);
        }
        setDragState(0);
    }

    public void cancel()
    {
        try
        {
            mActivePointerId = -1;
            clearMotionHistory();
            if (mVelocityTracker != null)
            {
                mVelocityTracker.recycle();
                mVelocityTracker = null;
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void captureChildView(View view, int i)
    {
        try
        {
            if (view.getParent() != mParentView)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(mParentView).append(")").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        mCapturedView = view;
        mActivePointerId = i;
        mCallback.onViewCaptured(view, i);
        setDragState(1);
    }

    public boolean checkTouchSlop(int i)
    {
        boolean flag1 = false;
        int k = SlidingPaneLayout.a;
        int l = mInitialMotionX.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < l)
                {
                    try
                    {
                        flag = checkTouchSlop(i, j);
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
            if (k != 0)
            {
                return false;
            }
        } while (true);
    }

    public boolean checkTouchSlop(int i, int j)
    {
        boolean flag1 = true;
        boolean flag2;
        try
        {
            flag2 = isPointerDown(j);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag2) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        float f;
        float f2;
        boolean flag;
        if ((i & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 2) == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        f = mLastMotionX[j] - mInitialMotionX[j];
        f2 = mLastMotionY[j] - mInitialMotionY[j];
        if (!flag || i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            i = mTouchSlop;
            j = mTouchSlop;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (f * f + f2 * f2 <= (float)(i * j))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            f = Math.abs(f);
            i = mTouchSlop;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (f <= (float)i)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i != 0)
        {
            float f1;
            try
            {
                f1 = Math.abs(f2);
                i = mTouchSlop;
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            if (f1 <= (float)i)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public boolean continueSettling(boolean flag)
    {
label0:
        {
            if (mDragState != 2)
            {
                break MISSING_BLOCK_LABEL_187;
            }
            boolean flag1 = mScroller.computeScrollOffset();
            int j = mScroller.getCurrX();
            int i = mScroller.getCurrY();
            int k = j - mCapturedView.getLeft();
            int l = i - mCapturedView.getTop();
            if (k != 0)
            {
                try
                {
                    mCapturedView.offsetLeftAndRight(k);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
            if (l != 0)
            {
                try
                {
                    mCapturedView.offsetTopAndBottom(l);
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
            }
            if (k != 0 || l != 0)
            {
                try
                {
                    mCallback.onViewPositionChanged(mCapturedView, j, i, k, l);
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    throw illegalargumentexception2;
                }
            }
            if (!flag1)
            {
                break label0;
            }
            try
            {
                if (j != mScroller.getFinalX())
                {
                    break label0;
                }
                j = mScroller.getFinalY();
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            if (i == j)
            {
                mScroller.abortAnimation();
                flag1 = false;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        mParentView.post(mSetIdleRunnable);
        if (SlidingPaneLayout.a == 0)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        setDragState(0);
        IllegalArgumentException illegalargumentexception4;
        try
        {
            i = mDragState;
        }
        catch (IllegalArgumentException illegalargumentexception5)
        {
            throw illegalargumentexception5;
        }
        return i == 2;
        illegalargumentexception4;
        throw illegalargumentexception4;
    }

    public View findTopChildUnder(int i, int j)
    {
        int k;
        int l;
        l = SlidingPaneLayout.a;
        k = mParentView.getChildCount() - 1;
_L2:
        View view;
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        view = mParentView.getChildAt(mCallback.getOrderedChildIndex(k));
        int i1 = view.getLeft();
        if (i < i1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        i1 = view.getRight();
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        i1 = view.getTop();
        if (j >= i1)
        {
            IllegalArgumentException illegalargumentexception;
            int j1;
            try
            {
                j1 = view.getBottom();
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (j < j1)
            {
                return view;
            }
        }
        break MISSING_BLOCK_LABEL_100;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        return null;
        k--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public View getCapturedView()
    {
        return mCapturedView;
    }

    public int getEdgeSize()
    {
        return mEdgeSize;
    }

    public int getTouchSlop()
    {
        return mTouchSlop;
    }

    public int getViewDragState()
    {
        return mDragState;
    }

    public boolean isCapturedViewUnder(int i, int j)
    {
        return isViewUnder(mCapturedView, i, j);
    }

    public boolean isPointerDown(int i)
    {
        int j;
        try
        {
            j = mPointersDown;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return (j & 1 << i) != 0;
    }

    public boolean isViewUnder(View view, int i, int j)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        int k;
        return false;
_L2:
        if (i < (k = view.getLeft()))
        {
            continue; /* Loop/switch isn't completed */
        }
        k = view.getRight();
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = view.getTop();
        if (j >= i)
        {
            try
            {
                i = view.getBottom();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (j < i)
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    public void processTouchEvent(MotionEvent motionevent)
    {
        int l;
        int k1;
        k1 = SlidingPaneLayout.a;
        int i = MotionEventCompat.getActionMasked(motionevent);
        l = MotionEventCompat.getActionIndex(motionevent);
        if (i == 0)
        {
            try
            {
                cancel();
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        try
        {
            if (mVelocityTracker == null)
            {
                mVelocityTracker = VelocityTracker.obtain();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        mVelocityTracker.addMovement(motionevent);
        i;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 99
    //                   1 770
    //                   2 314
    //                   3 791
    //                   4 92
    //                   5 183
    //                   6 571;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return;
_L2:
        int j;
        int i1;
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        j = MotionEventCompat.getPointerId(motionevent, 0);
        View view = findTopChildUnder((int)f, (int)f2);
        saveInitialMotion(f, f2, j);
        tryCaptureViewForDrag(view, j);
        i1 = mInitialEdgesTouched[j];
        if ((mTrackingEdges & i1) == 0) goto _L1; else goto _L8
_L8:
        mCallback.onEdgeTouched(i1 & mTrackingEdges, j);
        if (k1 == 0) goto _L1; else goto _L6
_L6:
        int k = MotionEventCompat.getPointerId(motionevent, l);
        float f1 = MotionEventCompat.getX(motionevent, l);
        float f3 = MotionEventCompat.getY(motionevent, l);
        saveInitialMotion(f1, f3, k);
        if (mDragState != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f3), k);
        int j1 = mInitialEdgesTouched[k];
        float f4;
        float f5;
        View view1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        boolean flag;
        try
        {
            if ((mTrackingEdges & j1) != 0)
            {
                mCallback.onEdgeTouched(j1 & mTrackingEdges, k);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (k1 == 0) goto _L1; else goto _L9
_L9:
        j1 = (int)f1;
        l1 = (int)f3;
        flag = isCapturedViewUnder(j1, l1);
        if (!flag) goto _L1; else goto _L10
_L10:
        try
        {
            tryCaptureViewForDrag(mCapturedView, k);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        k = mDragState;
        if (k != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        f1 = MotionEventCompat.getX(motionevent, k);
        f3 = MotionEventCompat.getY(motionevent, k);
        k = (int)(f1 - mLastMotionX[mActivePointerId]);
        j1 = (int)(f3 - mLastMotionY[mActivePointerId]);
        dragTo(mCapturedView.getLeft() + k, mCapturedView.getTop() + j1, k, j1);
        saveLastMotion(motionevent);
        if (k1 == 0) goto _L1; else goto _L11
_L11:
        j1 = MotionEventCompat.getPointerCount(motionevent);
        k = 0;
_L15:
        if (k >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = MotionEventCompat.getPointerId(motionevent, k);
        f1 = MotionEventCompat.getX(motionevent, k);
        f3 = MotionEventCompat.getY(motionevent, k);
        f4 = f1 - mInitialMotionX[l1];
        f5 = f3 - mInitialMotionY[l1];
        try
        {
            reportNewEdgeDrags(f4, f5, l1);
            i2 = mDragState;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (i2 == 1 && k1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = findTopChildUnder((int)f1, (int)f3);
        try
        {
            flag = checkTouchSlop(view1, f4, f5);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        if (!flag) goto _L13; else goto _L12
_L12:
        flag = tryCaptureViewForDrag(view1, l1);
        if (flag && k1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L13:
        k++;
        if (k1 == 0) goto _L15; else goto _L14
_L14:
        saveLastMotion(motionevent);
        if (k1 == 0) goto _L1; else goto _L7
_L7:
label0:
        {
            l1 = MotionEventCompat.getPointerId(motionevent, l);
            try
            {
                if (mDragState != 1)
                {
                    break label0;
                }
                k = mActivePointerId;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            if (l1 != k)
            {
                break label0;
            }
            i2 = MotionEventCompat.getPointerCount(motionevent);
            j1 = 0;
            k = -1;
label1:
            do
            {
label2:
                {
                    l = k;
                    if (j1 >= i2)
                    {
                        break label1;
                    }
                    j2 = MotionEventCompat.getPointerId(motionevent, j1);
                    try
                    {
                        l = mActivePointerId;
                    }
                    // Misplaced declaration of an exception variable
                    catch (MotionEvent motionevent)
                    {
                        throw motionevent;
                    }
                    if (j2 == l)
                    {
                        l = k;
                        if (k1 == 0)
                        {
                            break label2;
                        }
                    }
                    f1 = MotionEventCompat.getX(motionevent, j1);
                    f3 = MotionEventCompat.getY(motionevent, j1);
                    k2 = (int)f1;
                    l2 = (int)f3;
                    l = k;
                    try
                    {
                        if (findTopChildUnder(k2, l2) != mCapturedView)
                        {
                            break label2;
                        }
                        flag = tryCaptureViewForDrag(mCapturedView, j2);
                    }
                    // Misplaced declaration of an exception variable
                    catch (MotionEvent motionevent)
                    {
                        throw motionevent;
                    }
                    l = k;
                    if (flag)
                    {
                        k = mActivePointerId;
                        l = k;
                        if (k1 == 0)
                        {
                            break label1;
                        }
                        l = k;
                    }
                }
                j1++;
                k = l;
            } while (k1 == 0);
            if (l == -1)
            {
                try
                {
                    releaseViewForPointerUp();
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
            }
        }
        clearMotionHistory(l1);
        if (k1 == 0) goto _L1; else goto _L3
_L3:
        try
        {
            if (mDragState == 1)
            {
                releaseViewForPointerUp();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        cancel();
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        try
        {
            if (mDragState == 1)
            {
                dispatchViewReleased(0.0F, 0.0F);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        cancel();
        return;
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
    }

    void setDragState(int i)
    {
        int j = mDragState;
        IllegalArgumentException illegalargumentexception;
        if (j != i)
        {
            try
            {
                mDragState = i;
                mCallback.onViewDragStateChanged(i);
                if (mDragState == 0)
                {
                    mCapturedView = null;
                    return;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        break MISSING_BLOCK_LABEL_42;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public void setEdgeTrackingEnabled(int i)
    {
        mTrackingEdges = i;
    }

    public void setMinVelocity(float f)
    {
        mMinVelocity = f;
    }

    public boolean settleCapturedViewAt(int i, int j)
    {
        try
        {
            if (!mReleaseInProgress)
            {
                throw new IllegalStateException(z[1]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return forceSettleCapturedViewAt(i, j, (int)VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId), (int)VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId));
    }

    public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
    {
        int l;
        int i1;
        l = SlidingPaneLayout.a;
        int i = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        if (i == 0)
        {
            try
            {
                cancel();
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        try
        {
            if (mVelocityTracker == null)
            {
                mVelocityTracker = VelocityTracker.obtain();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        mVelocityTracker.addMovement(motionevent);
        i;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 112
    //                   1 648
    //                   2 339
    //                   3 648
    //                   4 92
    //                   5 217
    //                   6 629;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        int j;
        float f;
        float f1;
        float f2;
        float f3;
        View view;
        View view1;
        int k;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        boolean flag;
        try
        {
            i = mDragState;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        return i == 1;
_L2:
        f = motionevent.getX();
        f1 = motionevent.getY();
        j = MotionEventCompat.getPointerId(motionevent, 0);
        saveInitialMotion(f, f1, j);
        view = findTopChildUnder((int)f, (int)f1);
        view1 = mCapturedView;
        if (view == view1)
        {
            try
            {
                if (mDragState == 2)
                {
                    tryCaptureViewForDrag(view, j);
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        k = mInitialEdgesTouched[j];
        if ((mTrackingEdges & k) == 0) goto _L1; else goto _L7
_L7:
        mCallback.onEdgeTouched(k & mTrackingEdges, j);
        if (l == 0) goto _L1; else goto _L5
_L5:
        j = MotionEventCompat.getPointerId(motionevent, i1);
        f = MotionEventCompat.getX(motionevent, i1);
        f1 = MotionEventCompat.getY(motionevent, i1);
        saveInitialMotion(f, f1, j);
        if (mDragState != 0) goto _L9; else goto _L8
_L8:
        k = mInitialEdgesTouched[j];
        try
        {
            if ((mTrackingEdges & k) != 0)
            {
                mCallback.onEdgeTouched(k & mTrackingEdges, j);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (l == 0) goto _L1; else goto _L9
_L9:
        try
        {
            k = mDragState;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (k != 2) goto _L1; else goto _L10
_L10:
        view = findTopChildUnder((int)f, (int)f1);
        try
        {
            if (view == mCapturedView)
            {
                tryCaptureViewForDrag(view, j);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (l == 0) goto _L1; else goto _L4
_L4:
        j1 = MotionEventCompat.getPointerCount(motionevent);
        j = 0;
_L23:
        if (j >= j1) goto _L12; else goto _L11
_L11:
        k1 = MotionEventCompat.getPointerId(motionevent, j);
        f = MotionEventCompat.getX(motionevent, j);
        f1 = MotionEventCompat.getY(motionevent, j);
        f2 = f - mInitialMotionX[k1];
        f3 = f1 - mInitialMotionY[k1];
        view = findTopChildUnder((int)f, (int)f1);
        if (view == null) goto _L14; else goto _L13
_L13:
        try
        {
            flag = checkTouchSlop(view, f2, f3);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag) goto _L14; else goto _L15
_L15:
        k = 1;
_L22:
        if (!k) goto _L17; else goto _L16
_L16:
        l1 = view.getLeft();
        i2 = (int)f2;
        i2 = mCallback.clampViewPositionHorizontal(view, i2 + l1, (int)f2);
        j2 = view.getTop();
        k2 = (int)f3;
        k2 = mCallback.clampViewPositionVertical(view, k2 + j2, (int)f3);
        l2 = mCallback.getViewHorizontalDragRange(view);
        i3 = mCallback.getViewVerticalDragRange(view);
        if ((l2 == 0 || l2 > 0 && i2 == l1) && (i3 == 0 || i3 > 0 && k2 == j2 && l == 0)) goto _L12; else goto _L17
_L17:
        try
        {
            reportNewEdgeDrags(f2, f3, k1);
            l1 = mDragState;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        if (l1 == 1 && l == 0) goto _L12; else goto _L18
_L18:
        if (!k) goto _L20; else goto _L19
_L19:
        flag = tryCaptureViewForDrag(view, k1);
        if (flag && l == 0) goto _L12; else goto _L20
_L20:
        if (l == 0) goto _L21; else goto _L12
_L12:
        saveLastMotion(motionevent);
        if (l == 0) goto _L1; else goto _L6
_L6:
        j = MotionEventCompat.getPointerId(motionevent, i1);
        try
        {
            clearMotionHistory(j);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (l == 0) goto _L1; else goto _L3
_L3:
        cancel();
          goto _L1
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
_L14:
        k = 0;
          goto _L22
_L21:
        j++;
          goto _L23
    }

    public boolean smoothSlideViewTo(View view, int i, int j)
    {
        boolean flag;
        mCapturedView = view;
        mActivePointerId = -1;
        flag = forceSettleCapturedViewAt(i, j, 0, 0);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        try
        {
            i = mDragState;
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
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (mCapturedView == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        mCapturedView = null;
        return flag;
        return flag;
    }

    boolean tryCaptureViewForDrag(View view, int i)
    {
        View view1;
        try
        {
            view1 = mCapturedView;
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
        if (view != view1)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (mActivePointerId == i)
        {
            return true;
        }
label0:
        {
            if (view == null)
            {
                break label0;
            }
            try
            {
                if (!mCallback.tryCaptureView(view, i))
                {
                    break label0;
                }
                mActivePointerId = i;
                captureChildView(view, i);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            return true;
        }
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "MG[j\022\\Chv\016BB}w\002Y\034\013n\006\\GF{\023KT\013s\022]R\013|\002\016G\013z\002]ENp\003OH_>\bH\006_v\002\016pB{\020jTJy/KJ[{\025\tU\013j\025OE@{\003\016VJl\002@R\013h\016KQ\0136";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "mGEp\bZ\006X{\023ZJN]\006^R^l\002JpB{\020oR\013q\022ZUBz\002\016IM>\006\016EJr\013\016RD>$OJG|\006MM\bq\txONi5KJN\177\024KB";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "mGGr\005OE@>\nO_\013p\bZ\006I{G@SGr";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "~GY{\tZ\006]w\002Y\006F\177\036\016HDjGLC\013p\022BJ";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                sInterpolator = new _cls1();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 188
    //                   0 209
    //                   1 215
    //                   2 221
    //                   3 227;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_227;
_L3:
        byte byte0 = 103;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 46;
          goto _L9
_L5:
        byte0 = 38;
          goto _L9
_L6:
        byte0 = 43;
          goto _L9
        byte0 = 30;
          goto _L9
    }

    private class _cls2
        implements Runnable
    {

        final ViewDragHelper this$0;

        public void run()
        {
            setDragState(0);
        }

        _cls2()
        {
            this$0 = ViewDragHelper.this;
            super();
        }
    }


    private class Callback
    {

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
            return 0;
        }

        public int getOrderedChildIndex(int i)
        {
            return i;
        }

        public int getViewHorizontalDragRange(View view)
        {
            return 0;
        }

        public int getViewVerticalDragRange(View view)
        {
            return 0;
        }

        public void onEdgeDragStarted(int i, int j)
        {
        }

        public boolean onEdgeLock(int i)
        {
            return false;
        }

        public void onEdgeTouched(int i, int j)
        {
        }

        public void onViewCaptured(View view, int i)
        {
        }

        public void onViewDragStateChanged(int i)
        {
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
        }

        public void onViewReleased(View view, float f, float f1)
        {
        }

        public abstract boolean tryCaptureView(View view, int i);

        public Callback()
        {
        }
    }


    private class _cls1
        implements Interpolator
    {

        public float getInterpolation(float f)
        {
            f--;
            return f * (f * f * f * f) + 1.0F;
        }

        _cls1()
        {
        }
    }

}
