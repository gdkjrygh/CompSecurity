// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            GestureDetectorCompat, MotionEventCompat, VelocityTrackerCompat

static class init
    implements init
{
    private class GestureHandler extends Handler
    {

        final GestureDetectorCompat.GestureDetectorCompatImplBase this$1;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 3: default 32
        //                       1 56
        //                       2 76
        //                       3 84;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
            mListener.onShowPress(mCurrentDownEvent);
_L6:
            return;
_L3:
            dispatchLongPress();
            return;
_L4:
            if (mDoubleTapListener != null)
            {
                if (!mStillDown)
                {
                    mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
                    return;
                } else
                {
                    mDeferConfirmSingleTap = true;
                    return;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        GestureHandler()
        {
            this$1 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
            super();
        }

        GestureHandler(Handler handler)
        {
            this$1 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
            super(handler.getLooper());
        }
    }


    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
    private static final int LONG_PRESS = 2;
    private static final int SHOW_PRESS = 1;
    private static final int TAP = 3;
    private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private boolean mDeferConfirmSingleTap;
    private android.view.atImplBase.mDoubleTapListener mDoubleTapListener;
    private int mDoubleTapSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private final Handler mHandler;
    private boolean mInLongPress;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private final android.view.atImplBase.mDoubleTapListener mListener;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;

    private void cancel()
    {
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        mHandler.removeMessages(3);
        mVelocityTracker.recycle();
        mVelocityTracker = null;
        mIsDoubleTapping = false;
        mStillDown = false;
        mAlwaysInTapRegion = false;
        mAlwaysInBiggerTapRegion = false;
        mDeferConfirmSingleTap = false;
        if (mInLongPress)
        {
            mInLongPress = false;
        }
    }

    private void cancelTaps()
    {
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        mHandler.removeMessages(3);
        mIsDoubleTapping = false;
        mAlwaysInTapRegion = false;
        mAlwaysInBiggerTapRegion = false;
        mDeferConfirmSingleTap = false;
        if (mInLongPress)
        {
            mInLongPress = false;
        }
    }

    private void dispatchLongPress()
    {
        mHandler.removeMessages(3);
        mDeferConfirmSingleTap = false;
        mInLongPress = true;
        mListener.mListener(mCurrentDownEvent);
    }

    private void init(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (mListener == null)
        {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else
        {
            mIsLongpressEnabled = true;
            context = ViewConfiguration.get(context);
            int i = context.getScaledTouchSlop();
            int j = context.getScaledDoubleTapSlop();
            mMinimumFlingVelocity = context.getScaledMinimumFlingVelocity();
            mMaximumFlingVelocity = context.getScaledMaximumFlingVelocity();
            mTouchSlopSquare = i * i;
            mDoubleTapSlopSquare = j * j;
            return;
        }
    }

    private boolean isConsideredDoubleTap(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
    {
        if (mAlwaysInBiggerTapRegion && motionevent2.getEventTime() - motionevent1.getEventTime() <= (long)DOUBLE_TAP_TIMEOUT)
        {
            int i = (int)motionevent.getX() - (int)motionevent2.getX();
            int j = (int)motionevent.getY() - (int)motionevent2.getY();
            if (i * i + j * j < mDoubleTapSlopSquare)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isLongpressEnabled()
    {
        return mIsLongpressEnabled;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i;
        int i1;
        int k1;
        int l1;
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        int i2 = motionevent.getAction();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        if ((i2 & 0xff) == 6)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i1 = MotionEventCompat.getActionIndex(motionevent);
        } else
        {
            i1 = -1;
        }
        f1 = 0.0F;
        f = 0.0F;
        l1 = MotionEventCompat.getPointerCount(motionevent);
        k1 = 0;
_L27:
        if (k1 < l1) goto _L2; else goto _L1
_L1:
        if (i != 0)
        {
            i = l1 - 1;
        } else
        {
            i = l1;
        }
        f1 /= i;
        f /= i;
        i1 = 0;
        flag3 = false;
        flag4 = false;
        flag = false;
        flag1 = flag;
        i2 & 0xff;
        JVM INSTR tableswitch 0 6: default 160
    //                   0 393
    //                   1 893
    //                   2 658
    //                   3 1172
    //                   4 164
    //                   5 223
    //                   6 249;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        flag1 = flag;
_L8:
        return flag1;
_L2:
        if (i1 != k1)
        {
            f1 += MotionEventCompat.getX(motionevent, k1);
            f += MotionEventCompat.getY(motionevent, k1);
        }
        k1++;
        continue; /* Loop/switch isn't completed */
_L9:
        mLastFocusX = f1;
        mDownFocusX = f1;
        mLastFocusY = f;
        mDownFocusY = f;
        cancelTaps();
        return false;
_L10:
        mLastFocusX = f1;
        mDownFocusX = f1;
        mLastFocusY = f;
        mDownFocusY = f;
        mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        i = MotionEventCompat.getPointerId(motionevent, i1);
        f = VelocityTrackerCompat.getXVelocity(mVelocityTracker, i);
        f1 = VelocityTrackerCompat.getYVelocity(mVelocityTracker, i);
        i = 0;
_L12:
        flag1 = flag;
        if (i >= l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i != i1)
        {
            break; /* Loop/switch isn't completed */
        }
_L14:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        if (f * VelocityTrackerCompat.getXVelocity(mVelocityTracker, k1 = MotionEventCompat.getPointerId(motionevent, i)) + f1 * VelocityTrackerCompat.getYVelocity(mVelocityTracker, k1) >= 0.0F) goto _L14; else goto _L13
_L13:
        mVelocityTracker.clear();
        return false;
_L4:
        int j = i1;
        if (mDoubleTapListener != null)
        {
            flag = mHandler.hasMessages(3);
            if (flag)
            {
                mHandler.removeMessages(3);
            }
            if (mCurrentDownEvent != null && mPreviousUpEvent != null && flag && isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent))
            {
                mIsDoubleTapping = true;
                j = false | mDoubleTapListener.mDoubleTapListener(mCurrentDownEvent) | mDoubleTapListener.(motionevent);
            } else
            {
                mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
                j = i1;
            }
        }
        mLastFocusX = f1;
        mDownFocusX = f1;
        mLastFocusY = f;
        mDownFocusY = f;
        if (mCurrentDownEvent != null)
        {
            mCurrentDownEvent.recycle();
        }
        mCurrentDownEvent = MotionEvent.obtain(motionevent);
        mAlwaysInTapRegion = true;
        mAlwaysInBiggerTapRegion = true;
        mStillDown = true;
        mInLongPress = false;
        mDeferConfirmSingleTap = false;
        if (mIsLongpressEnabled)
        {
            mHandler.removeMessages(2);
            mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
        }
        mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
        return j | mListener.mListener(motionevent);
_L6:
        float f2;
        float f3;
        flag1 = flag;
        if (mInLongPress)
        {
            continue; /* Loop/switch isn't completed */
        }
        f2 = mLastFocusX - f1;
        f3 = mLastFocusY - f;
        if (mIsDoubleTapping)
        {
            return false | mDoubleTapListener.(motionevent);
        }
        if (!mAlwaysInTapRegion)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = (int)(f1 - mDownFocusX);
        int j1 = (int)(f - mDownFocusY);
        k = k * k + j1 * j1;
        flag = flag3;
        if (k > mTouchSlopSquare)
        {
            flag = mListener.mListener(mCurrentDownEvent, motionevent, f2, f3);
            mLastFocusX = f1;
            mLastFocusY = f;
            mAlwaysInTapRegion = false;
            mHandler.removeMessages(3);
            mHandler.removeMessages(1);
            mHandler.removeMessages(2);
        }
        flag1 = flag;
        if (k > mTouchSlopSquare)
        {
            mAlwaysInBiggerTapRegion = false;
            return flag;
        }
        if (true) goto _L8; else goto _L15
_L15:
        if (Math.abs(f2) >= 1.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (Math.abs(f3) < 1.0F) goto _L8; else goto _L16
_L16:
        flag = mListener.mListener(mCurrentDownEvent, motionevent, f2, f3);
        mLastFocusX = f1;
        mLastFocusY = f;
        return flag;
_L5:
        MotionEvent motionevent1;
        mStillDown = false;
        motionevent1 = MotionEvent.obtain(motionevent);
        if (!mIsDoubleTapping) goto _L18; else goto _L17
_L17:
        flag = false | mDoubleTapListener.(motionevent);
_L21:
        if (mPreviousUpEvent != null)
        {
            mPreviousUpEvent.recycle();
        }
        mPreviousUpEvent = motionevent1;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
        mIsDoubleTapping = false;
        mDeferConfirmSingleTap = false;
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        return flag;
_L18:
        if (!mInLongPress) goto _L20; else goto _L19
_L19:
        mHandler.removeMessages(3);
        mInLongPress = false;
        flag = flag4;
          goto _L21
_L20:
        if (!mAlwaysInTapRegion) goto _L23; else goto _L22
_L22:
        boolean flag2 = mListener.mListener(motionevent);
        flag = flag2;
        if (mDeferConfirmSingleTap)
        {
            flag = flag2;
            if (mDoubleTapListener != null)
            {
                mDoubleTapListener.rmed(motionevent);
                flag = flag2;
            }
        }
          goto _L21
_L23:
        VelocityTracker velocitytracker = mVelocityTracker;
        int l = MotionEventCompat.getPointerId(motionevent, 0);
        velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        f = VelocityTrackerCompat.getYVelocity(velocitytracker, l);
        f1 = VelocityTrackerCompat.getXVelocity(velocitytracker, l);
        if (Math.abs(f) > (float)mMinimumFlingVelocity) goto _L25; else goto _L24
_L24:
        flag = flag4;
        if (Math.abs(f1) <= (float)mMinimumFlingVelocity) goto _L21; else goto _L25
_L25:
        flag = mListener.mListener(mCurrentDownEvent, motionevent, f1, f);
          goto _L21
_L7:
        cancel();
        return false;
        if (true) goto _L27; else goto _L26
_L26:
    }

    public void setIsLongpressEnabled(boolean flag)
    {
        mIsLongpressEnabled = flag;
    }

    public void setOnDoubleTapListener(android.view.atImplBase atimplbase)
    {
        mDoubleTapListener = atimplbase;
    }








    public GestureHandler.this._cls1(Context context, android.view.atImplBase atimplbase, Handler handler)
    {
        if (handler != null)
        {
            mHandler = new GestureHandler(handler);
        } else
        {
            mHandler = new GestureHandler();
        }
        mListener = atimplbase;
        if (atimplbase instanceof android.view.atImplBase.mListener)
        {
            setOnDoubleTapListener((android.view.atImplBase.setOnDoubleTapListener)atimplbase);
        }
        init(context);
    }
}
