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
//            ViewPager, MotionEventCompat, VelocityTrackerCompat

class init
    implements init
{

    private static final int DOUBLE_TAP_TIMEOUT;
    private static final int LONGPRESS_TIMEOUT;
    private static final int TAP_TIMEOUT;
    private static final String z[];
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private boolean mDeferConfirmSingleTap;
    private android.view.atImplBase.DOUBLE_TAP_TIMEOUT mDoubleTapListener;
    private int mDoubleTapSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private final Handler mHandler = new GestureHandler();
    private boolean mInLongPress;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private final android.view.atImplBase mListener;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;

    private void cancel()
    {
        try
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
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    private void cancelTaps()
    {
        try
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
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
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
            try
            {
                throw new IllegalArgumentException(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        try
        {
            if (mListener == null)
            {
                throw new IllegalArgumentException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        mIsLongpressEnabled = true;
        context = ViewConfiguration.get(context);
        int i = context.getScaledTouchSlop();
        int j = context.getScaledDoubleTapSlop();
        mMinimumFlingVelocity = context.getScaledMinimumFlingVelocity();
        mMaximumFlingVelocity = context.getScaledMaximumFlingVelocity();
        mTouchSlopSquare = i * i;
        mDoubleTapSlopSquare = j * j;
    }

    private boolean isConsideredDoubleTap(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
    {
        boolean flag;
        try
        {
            flag = mAlwaysInBiggerTapRegion;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (flag)
        {
            int i;
            long l1;
            long l2;
            try
            {
                l1 = motionevent2.getEventTime();
                l2 = motionevent1.getEventTime();
                i = DOUBLE_TAP_TIMEOUT;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            if (l1 - l2 <= (long)i)
            {
                int j = (int)motionevent.getX() - (int)motionevent2.getX();
                int k = (int)motionevent.getY() - (int)motionevent2.getY();
                int l;
                try
                {
                    l = mDoubleTapSlopSquare;
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
                if (j * j + k * k < l)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int k;
        int l;
        int i1;
        int i2;
        int j2;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag4 = ViewPager.a;
        int j1 = motionevent.getAction();
        int i;
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
        try
        {
            mVelocityTracker.addMovement(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if ((j1 & 0xff) == 6)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            try
            {
                k = MotionEventCompat.getActionIndex(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        } else
        {
            k = -1;
        }
        i1 = MotionEventCompat.getPointerCount(motionevent);
        f = 0.0F;
        f1 = 0.0F;
        l = 0;
        do
        {
            float f2 = f;
            float f4 = f1;
            if (l >= i1)
            {
                break;
            }
            if (k == l)
            {
                f4 = f1;
                f2 = f;
            } else
            {
                f4 = f1 + MotionEventCompat.getX(motionevent, l);
                f2 = f + MotionEventCompat.getY(motionevent, l);
            }
            l++;
            f = f2;
            f1 = f4;
        } while (!flag4);
        if (i != 0)
        {
            i = i1 - 1;
        } else
        {
            i = i1;
        }
        f = f4 / (float)i;
        f1 = f2 / (float)i;
        k = 0;
        l = 0;
        j2 = 0;
        flag1 = false;
        flag2 = false;
        flag3 = false;
        i2 = ((flag3) ? 1 : 0);
        j1 & 0xff;
        JVM INSTR tableswitch 0 6: default 208
    //                   0 407
    //                   1 1003
    //                   2 720
    //                   3 1327
    //                   4 212
    //                   5 266
    //                   6 299;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        i2 = ((flag3) ? 1 : 0);
_L6:
        return i2;
_L7:
        float f3;
        float f5;
        int j;
        float f6;
        Object obj;
        VelocityTracker velocitytracker;
        int k1;
        boolean flag;
        try
        {
            mLastFocusX = f;
            mDownFocusX = f;
            mLastFocusY = f1;
            mDownFocusY = f1;
            cancelTaps();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i2 = ((flag3) ? 1 : 0);
        if (!flag4) goto _L6; else goto _L8
_L8:
        mLastFocusX = f;
        mDownFocusX = f;
        mLastFocusY = f1;
        mDownFocusY = f1;
        mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        k1 = MotionEventCompat.getActionIndex(motionevent);
        j = MotionEventCompat.getPointerId(motionevent, k1);
        f3 = VelocityTrackerCompat.getXVelocity(mVelocityTracker, j);
        f5 = VelocityTrackerCompat.getYVelocity(mVelocityTracker, j);
        j = 0;
_L12:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j != k1) goto _L10; else goto _L9
_L9:
        j++;
        if (!flag4) goto _L12; else goto _L11
_L11:
        i2 = ((flag3) ? 1 : 0);
        if (!flag4) goto _L6; else goto _L2
_L2:
        float f7;
        int l1;
        try
        {
            obj = mDoubleTapListener;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        j = l;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_567;
        }
        i2 = mHandler.hasMessages(3);
        if (i2 != 0)
        {
            try
            {
                mHandler.removeMessages(3);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        obj = mCurrentDownEvent;
        j = k;
        if (obj == null) goto _L14; else goto _L13
_L13:
        obj = mPreviousUpEvent;
        j = k;
        if (obj != null)
        {
            j = k;
            if (i2 != 0)
            {
                try
                {
                    i2 = isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent);
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
                j = k;
                if (i2 != 0)
                {
                    mIsDoubleTapping = true;
                    k = false | mDoubleTapListener.mDoubleTapListener(mCurrentDownEvent) | mDoubleTapListener.(motionevent);
                    j = k;
                    if (!flag4)
                    {
                        break MISSING_BLOCK_LABEL_567;
                    }
                    j = k;
                }
            }
        }
_L14:
        try
        {
            mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
            mLastFocusX = f;
            mDownFocusX = f;
            mLastFocusY = f1;
            mDownFocusY = f1;
            if (mCurrentDownEvent != null)
            {
                mCurrentDownEvent.recycle();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
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
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
        j2 = j | mListener.mListener(motionevent);
        i2 = j2;
        if (!flag4) goto _L6; else goto _L4
_L4:
        try
        {
            i2 = mInLongPress;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (i2 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i2 = j2;
        if (!flag4) goto _L6; else goto _L15
_L15:
        f3 = mLastFocusX - f;
        f5 = mLastFocusY - f1;
        i2 = j2;
        if (!mIsDoubleTapping) goto _L17; else goto _L16
_L16:
        j2 |= mDoubleTapListener.(motionevent);
        i2 = j2;
        if (!flag4) goto _L6; else goto _L18
_L18:
        i2 = j2;
_L17:
        try
        {
            flag1 = mAlwaysInTapRegion;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        j2 = i2;
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = (int)(f - mDownFocusX);
        k = (int)(f1 - mDownFocusY);
        j = j * j + k * k;
        j2 = i2;
        if (j > mTouchSlopSquare)
        {
            j2 = mListener.mListener(mCurrentDownEvent, motionevent, f3, f5);
            mLastFocusX = f;
            mLastFocusY = f1;
            mAlwaysInTapRegion = false;
            mHandler.removeMessages(3);
            mHandler.removeMessages(1);
            mHandler.removeMessages(2);
        }
        try
        {
            if (j > mTouchSlopSquare)
            {
                mAlwaysInBiggerTapRegion = false;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i2 = j2;
        if (!flag4) goto _L6; else goto _L19
_L19:
        try
        {
            if (Math.abs(f3) >= 1.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            f6 = Math.abs(f5);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i2 = j2;
        if (f6 < 1.0F) goto _L6; else goto _L20
_L20:
        flag1 = mListener.mListener(mCurrentDownEvent, motionevent, f3, f5);
        mLastFocusX = f;
        mLastFocusY = f1;
        i2 = ((flag1) ? 1 : 0);
        if (!flag4) goto _L6; else goto _L3
_L3:
        mStillDown = false;
        obj = MotionEvent.obtain(motionevent);
        i2 = ((flag1) ? 1 : 0);
        if (mIsDoubleTapping)
        {
            i2 = flag1 | mDoubleTapListener.(motionevent);
            flag = i2;
            if (!flag4)
            {
                break MISSING_BLOCK_LABEL_1249;
            }
        }
        flag = mInLongPress;
        if (flag)
        {
            try
            {
                mHandler.removeMessages(3);
                mInLongPress = false;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            flag = i2;
            if (!flag4)
            {
                break MISSING_BLOCK_LABEL_1249;
            }
        }
        flag = mAlwaysInTapRegion;
        if (!flag) goto _L22; else goto _L21
_L21:
        i2 = mListener.mListener(motionevent);
        try
        {
            flag1 = mDeferConfirmSingleTap;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
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
        flag = i2;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1249;
        }
        flag = i2;
        if (mDoubleTapListener == null)
        {
            break MISSING_BLOCK_LABEL_1249;
        }
        mDoubleTapListener.rmed(motionevent);
        flag = i2;
        if (!flag4)
        {
            break MISSING_BLOCK_LABEL_1249;
        }
_L22:
        velocitytracker = mVelocityTracker;
        j = MotionEventCompat.getPointerId(motionevent, 0);
        velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        f = VelocityTrackerCompat.getYVelocity(velocitytracker, j);
        f1 = VelocityTrackerCompat.getXVelocity(velocitytracker, j);
        if (Math.abs(f) > (float)mMinimumFlingVelocity) goto _L24; else goto _L23
_L23:
        f3 = Math.abs(f1);
        j = mMinimumFlingVelocity;
        flag = i2;
        if (f3 <= (float)j)
        {
            break MISSING_BLOCK_LABEL_1249;
        }
_L24:
        flag = mListener.mListener(mCurrentDownEvent, motionevent, f1, f);
        try
        {
            if (mPreviousUpEvent != null)
            {
                mPreviousUpEvent.recycle();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
            mPreviousUpEvent = ((MotionEvent) (obj));
            if (mVelocityTracker != null)
            {
                mVelocityTracker.recycle();
                mVelocityTracker = null;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
            mIsDoubleTapping = false;
            mDeferConfirmSingleTap = false;
            mHandler.removeMessages(1);
            mHandler.removeMessages(2);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i2 = ((flag) ? 1 : 0);
        if (!flag4) goto _L6; else goto _L25
_L25:
        flag2 = flag;
_L5:
        cancel();
        return flag2;
_L10:
        l1 = MotionEventCompat.getPointerId(motionevent, j);
        f7 = VelocityTrackerCompat.getXVelocity(mVelocityTracker, l1);
        if (VelocityTrackerCompat.getYVelocity(mVelocityTracker, l1) * f5 + f7 * f3 >= 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            mVelocityTracker.clear();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag4) goto _L11; else goto _L9
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        throw motionevent;
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
    }

    public void setOnDoubleTapListener(android.view.atImplBase atimplbase)
    {
        mDoubleTapListener = atimplbase;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "XLNzBcW\000cRhW\000`Ho\003Bk\007uVLb";
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
                i = 1;
                obj = "TMgkToVRkkrPTkI~Q\000cRhW\000`Ho\003Bk\007uVLb";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
                TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
                DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 152
    //                   0 173
    //                   1 179
    //                   2 185
    //                   3 191;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_191;
_L3:
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 27;
          goto _L9
_L5:
        byte0 = 35;
          goto _L9
_L6:
        byte0 = 32;
          goto _L9
        byte0 = 14;
          goto _L9
    }







/*
    static boolean access$502(GestureHandler gesturehandler, boolean flag)
    {
        gesturehandler.mDeferConfirmSingleTap = flag;
        return flag;
    }

*/

    public GestureHandler.this._cls0(Context context, android.view.atImplBase atimplbase, Handler handler)
    {
        if (handler == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        class GestureHandler extends Handler
        {

            private static final String z;
            final GestureDetectorCompat.GestureDetectorCompatImplBase this$0;

            public void handleMessage(Message message)
            {
                boolean flag = ViewPager.a;
                int i = message.what;
                i;
                JVM INSTR tableswitch 1 3: default 36
            //                           1 67
            //                           2 91
            //                           3 103;
                   goto _L1 _L2 _L3 _L4
_L1:
                try
                {
                    throw new RuntimeException((new StringBuilder()).append(z).append(message).toString());
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    throw message;
                }
_L2:
                mListener.onShowPress(mCurrentDownEvent);
                if (!flag)
                {
                    break; /* Loop/switch isn't completed */
                }
_L3:
                dispatchLongPress();
                if (!flag)
                {
                    break; /* Loop/switch isn't completed */
                }
_L4:
                android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener = mDoubleTapListener;
                if (ondoubletaplistener == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                boolean flag1 = mStillDown;
                if (flag1)
                {
                    break MISSING_BLOCK_LABEL_154;
                }
                mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
                if (!flag)
                {
                    break; /* Loop/switch isn't completed */
                }
                mDeferConfirmSingleTap = true;
                if (flag) goto _L1; else goto _L5
_L5:
                return;
                message;
                try
                {
                    throw message;
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                try
                {
                    throw message;
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                try
                {
                    throw message;
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                try
                {
                    throw message;
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                try
                {
                    throw message;
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                throw message;
            }

            static 
            {
                char ac[];
                int i;
                int j;
                ac = ">KV}^\034K\035~T\030V\\tTK".toCharArray();
                j = ac.length;
                i = 0;
_L7:
                char c;
                if (j <= i)
                {
                    z = (new String(ac)).intern();
                    return;
                }
                c = ac[i];
                i % 5;
                JVM INSTR tableswitch 0 3: default 68
            //                           0 86
            //                           1 92
            //                           2 98
            //                           3 104;
                   goto _L1 _L2 _L3 _L4 _L5
_L5:
                break MISSING_BLOCK_LABEL_104;
_L2:
                break; /* Loop/switch isn't completed */
_L1:
                byte byte0 = 49;
_L8:
                ac[i] = (char)(byte0 ^ c);
                i++;
                if (true) goto _L7; else goto _L6
_L6:
                byte0 = 107;
                  goto _L8
_L3:
                byte0 = 37;
                  goto _L8
_L4:
                byte0 = 61;
                  goto _L8
                byte0 = 19;
                  goto _L8
            }

            GestureHandler()
            {
                this$0 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
                super();
            }

            GestureHandler(Handler handler)
            {
                this$0 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
                super(handler.getLooper());
            }
        }

        mHandler = new GestureHandler(handler);
        if (!ViewPager.a)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        try
        {
            mListener = atimplbase;
            if (atimplbase instanceof android.view.atImplBase.mListener)
            {
                setOnDoubleTapListener((android.view.atImplBase.setOnDoubleTapListener)atimplbase);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        init(context);
        return;
        context;
        throw context;
    }
}
