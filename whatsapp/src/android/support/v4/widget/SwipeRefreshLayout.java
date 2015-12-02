// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout, CircleImageView, MaterialProgressDrawable

public class SwipeRefreshLayout extends ViewGroup
{

    private static final int LAYOUT_ATTRS[];
    private static final String LOG_TAG;
    private static final String z[];
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private int mCircleHeight;
    private CircleImageView mCircleView;
    private int mCircleViewIndex;
    private int mCircleWidth;
    private int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    private MaterialProgressDrawable mProgress;
    private android.view.animation.Animation.AnimationListener mRefreshListener;
    private boolean mRefreshing;
    private boolean mReturningToStart;
    private boolean mScale;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    private float mSpinnerFinalOffset;
    private float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private int mTouchSlop;
    private boolean mUsingCustomStart;

    public SwipeRefreshLayout(Context context)
    {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        int i = SlidingPaneLayout.a;
        super(context, attributeset);
        mRefreshing = false;
        mTotalDragDistance = -1F;
        mOriginalOffsetCalculated = false;
        mActivePointerId = -1;
        mCircleViewIndex = -1;
        mRefreshListener = new _cls1();
        mAnimateToCorrectPosition = new _cls6();
        mAnimateToStartPosition = new _cls7();
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        mMediumAnimationDuration = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
        context = context.obtainStyledAttributes(attributeset, LAYOUT_ATTRS);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        mCircleWidth = (int)(((DisplayMetrics) (context)).density * 40F);
        mCircleHeight = (int)(((DisplayMetrics) (context)).density * 40F);
        createProgressView();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        mSpinnerFinalOffset = ((DisplayMetrics) (context)).density * 64F;
        mTotalDragDistance = mSpinnerFinalOffset;
        if (Fragment.a != 0)
        {
            SlidingPaneLayout.a = i + 1;
        }
    }

    private void animateOffsetToCorrectPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
        mFrom = i;
        mAnimateToCorrectPosition.reset();
        mAnimateToCorrectPosition.setDuration(200L);
        mAnimateToCorrectPosition.setInterpolator(mDecelerateInterpolator);
        if (animationlistener != null)
        {
            mCircleView.setAnimationListener(animationlistener);
        }
        mCircleView.clearAnimation();
        mCircleView.startAnimation(mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
label0:
        {
            if (mScale)
            {
                startScaleDownReturnToStartAnimation(i, animationlistener);
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            mFrom = i;
            mAnimateToStartPosition.reset();
            mAnimateToStartPosition.setDuration(200L);
            mAnimateToStartPosition.setInterpolator(mDecelerateInterpolator);
            if (animationlistener != null)
            {
                mCircleView.setAnimationListener(animationlistener);
            }
            mCircleView.clearAnimation();
            mCircleView.startAnimation(mAnimateToStartPosition);
        }
    }

    private void createProgressView()
    {
        mCircleView = new CircleImageView(getContext(), 0xfffafafa, 20F);
        mProgress = new MaterialProgressDrawable(getContext(), this);
        mProgress.setBackgroundColor(0xfffafafa);
        mCircleView.setImageDrawable(mProgress);
        mCircleView.setVisibility(8);
        addView(mCircleView);
    }

    private void ensureTarget()
    {
        int j = SlidingPaneLayout.a;
        if (mTarget == null)
        {
            int i = 0;
            do
            {
                if (i >= getChildCount())
                {
                    break;
                }
                View view = getChildAt(i);
                if (!view.equals(mCircleView))
                {
                    mTarget = view;
                    if (j == 0)
                    {
                        break;
                    }
                }
                i++;
            } while (j == 0);
        }
    }

    private float getMotionEventY(MotionEvent motionevent, int i)
    {
        i = MotionEventCompat.findPointerIndex(motionevent, i);
        if (i < 0)
        {
            return -1F;
        } else
        {
            return MotionEventCompat.getY(motionevent, i);
        }
    }

    private boolean isAlphaUsedForScale()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    private boolean isAnimationRunning(Animation animation)
    {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void moveToStart(float f)
    {
        setTargetOffsetTopAndBottom((mFrom + (int)((float)(mOriginalOffsetTop - mFrom) * f)) - mCircleView.getTop(), false);
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        }
    }

    private void setAnimationProgress(float f)
    {
label0:
        {
            if (isAlphaUsedForScale())
            {
                setColorViewAlpha((int)(255F * f));
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            ViewCompat.setScaleX(mCircleView, f);
            ViewCompat.setScaleY(mCircleView, f);
        }
    }

    private void setColorViewAlpha(int i)
    {
        mCircleView.getBackground().setAlpha(i);
        mProgress.setAlpha(i);
    }

    private void setRefreshing(boolean flag, boolean flag1)
    {
label0:
        {
            if (mRefreshing == flag)
            {
                break label0;
            }
            mNotify = flag1;
            ensureTarget();
            mRefreshing = flag;
            if (mRefreshing)
            {
                animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            startScaleDownAnimation(mRefreshListener);
        }
    }

    private void setTargetOffsetTopAndBottom(int i, boolean flag)
    {
        mCircleView.bringToFront();
        mCircleView.offsetTopAndBottom(i);
        mCurrentTargetOffsetTop = mCircleView.getTop();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    private Animation startAlphaAnimation(final int startingAlpha, final int endingAlpha)
    {
        if (mScale && isAlphaUsedForScale())
        {
            return null;
        } else
        {
            _cls4 _lcls4 = new _cls4();
            _lcls4.setDuration(300L);
            mCircleView.setAnimationListener(null);
            mCircleView.clearAnimation();
            mCircleView.startAnimation(_lcls4);
            return _lcls4;
        }
    }

    private void startProgressAlphaMaxAnimation()
    {
        mAlphaMaxAnimation = startAlphaAnimation(mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation()
    {
        mAlphaStartAnimation = startAlphaAnimation(mProgress.getAlpha(), 76);
    }

    private void startScaleDownAnimation(android.view.animation.Animation.AnimationListener animationlistener)
    {
        mScaleDownAnimation = new _cls3();
        mScaleDownAnimation.setDuration(150L);
        mCircleView.setAnimationListener(animationlistener);
        mCircleView.clearAnimation();
        mCircleView.startAnimation(mScaleDownAnimation);
    }

    private void startScaleDownReturnToStartAnimation(int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
label0:
        {
            mFrom = i;
            if (isAlphaUsedForScale())
            {
                mStartingScale = mProgress.getAlpha();
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            mStartingScale = ViewCompat.getScaleX(mCircleView);
        }
        mScaleDownToStartAnimation = new _cls8();
        mScaleDownToStartAnimation.setDuration(150L);
        if (animationlistener != null)
        {
            mCircleView.setAnimationListener(animationlistener);
        }
        mCircleView.clearAnimation();
        mCircleView.startAnimation(mScaleDownToStartAnimation);
    }

    public boolean canChildScrollUp()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (mTarget instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)mTarget;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            if (mTarget.getScrollY() <= 0)
            {
                flag = false;
            }
            return flag;
        } else
        {
            return ViewCompat.canScrollVertically(mTarget, -1);
        }
    }

    protected int getChildDrawingOrder(int i, int j)
    {
        if (mCircleViewIndex >= 0)
        {
            if (j == i - 1)
            {
                return mCircleViewIndex;
            }
            if (j >= mCircleViewIndex)
            {
                return j + 1;
            }
        }
        return j;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        i = SlidingPaneLayout.a;
        ensureTarget();
        j = MotionEventCompat.getActionMasked(motionevent);
        if (mReturningToStart && j == 0)
        {
            mReturningToStart = false;
        }
        if (isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        j;
        JVM INSTR tableswitch 0 6: default 104
    //                   0 109
    //                   1 250
    //                   2 162
    //                   3 250
    //                   4 104
    //                   5 104
    //                   6 241;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        return mIsBeingDragged;
_L4:
        float f;
        setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop(), true);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsBeingDragged = false;
        f = getMotionEventY(motionevent, mActivePointerId);
        if (f == -1F) goto _L1; else goto _L8
_L8:
        mInitialMotionY = f;
_L6:
        if (mActivePointerId == -1)
        {
            Log.e(LOG_TAG, z[0]);
            return false;
        }
        f = getMotionEventY(motionevent, mActivePointerId);
        if (f == -1F) goto _L1; else goto _L9
_L9:
        if (f - mInitialMotionY <= (float)mTouchSlop || mIsBeingDragged) goto _L3; else goto _L10
_L10:
        mIsBeingDragged = true;
        mProgress.setAlpha(76);
        if (i == 0) goto _L3; else goto _L7
_L7:
        onSecondaryPointerUp(motionevent);
        if (i == 0) goto _L3; else goto _L5
_L5:
        mIsBeingDragged = false;
        mActivePointerId = -1;
          goto _L3
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        if (getChildCount() != 0)
        {
            if (mTarget == null)
            {
                ensureTarget();
            }
            if (mTarget != null)
            {
                View view = mTarget;
                k = getPaddingLeft();
                l = getPaddingTop();
                view.layout(k, l, (i - getPaddingLeft() - getPaddingRight()) + k, (j - getPaddingTop() - getPaddingBottom()) + l);
                j = mCircleView.getMeasuredWidth();
                k = mCircleView.getMeasuredHeight();
                mCircleView.layout(i / 2 - j / 2, mCurrentTargetOffsetTop, i / 2 + j / 2, mCurrentTargetOffsetTop + k);
                return;
            }
        }
    }

    public void onMeasure(int i, int j)
    {
        int k;
        k = SlidingPaneLayout.a;
        super.onMeasure(i, j);
        if (mTarget == null)
        {
            ensureTarget();
        }
        if (mTarget != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mTarget.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
        mCircleView.measure(android.view.View.MeasureSpec.makeMeasureSpec(mCircleWidth, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(mCircleHeight, 0x40000000));
        if (!mUsingCustomStart && !mOriginalOffsetCalculated)
        {
            mOriginalOffsetCalculated = true;
            i = -mCircleView.getMeasuredHeight();
            mOriginalOffsetTop = i;
            mCurrentTargetOffsetTop = i;
        }
        mCircleViewIndex = -1;
        i = 0;
_L5:
        if (i >= getChildCount()) goto _L1; else goto _L3
_L3:
        if (getChildAt(i) != mCircleView)
        {
            break; /* Loop/switch isn't completed */
        }
        mCircleViewIndex = i;
        if (k == 0) goto _L1; else goto _L4
_L4:
        i++;
        if (k != 0)
        {
            return;
        }
          goto _L5
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        i = SlidingPaneLayout.a;
        j = MotionEventCompat.getActionMasked(motionevent);
        if (mReturningToStart && j == 0)
        {
            mReturningToStart = false;
        }
        if (!isEnabled() || mReturningToStart || canChildScrollUp())
        {
            return false;
        }
        j;
        JVM INSTR tableswitch 0 6: default 96
    //                   0 98
    //                   1 552
    //                   2 117
    //                   3 552
    //                   4 96
    //                   5 525
    //                   6 542;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsBeingDragged = false;
        if (i == 0) goto _L1; else goto _L4
_L4:
        float f2;
        int k = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (k < 0)
        {
            Log.e(LOG_TAG, z[2]);
            return false;
        }
        f2 = 0.5F * (MotionEventCompat.getY(motionevent, k) - mInitialMotionY);
        if (!mIsBeingDragged) goto _L1; else goto _L7
_L7:
        mProgress.showArrow(true);
        float f = f2 / mTotalDragDistance;
        if (f < 0.0F)
        {
            return false;
        }
        float f3 = Math.min(1.0F, Math.abs(f));
        float f4 = ((float)Math.max((double)f3 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        float f5 = Math.abs(f2);
        float f6 = mTotalDragDistance;
        int l;
        int i1;
        if (mUsingCustomStart)
        {
            f = mSpinnerFinalOffset - (float)mOriginalOffsetTop;
        } else
        {
            f = mSpinnerFinalOffset;
        }
        f5 = Math.max(0.0F, Math.min(f5 - f6, 2.0F * f) / f);
        f5 = (float)((double)(f5 / 4F) - Math.pow(f5 / 4F, 2D)) * 2.0F;
        l = mOriginalOffsetTop;
        i1 = (int)(f * f3 + f * f5 * 2.0F);
        if (mCircleView.getVisibility() != 0)
        {
            mCircleView.setVisibility(0);
        }
        if (!mScale)
        {
            ViewCompat.setScaleX(mCircleView, 1.0F);
            ViewCompat.setScaleY(mCircleView, 1.0F);
        }
        if (f2 >= mTotalDragDistance) goto _L9; else goto _L8
_L8:
        if (mScale)
        {
            setAnimationProgress(f2 / mTotalDragDistance);
        }
        if (mProgress.getAlpha() > 76 && !isAnimationRunning(mAlphaStartAnimation))
        {
            startProgressAlphaStartAnimation();
        }
        mProgress.setStartEndTrim(0.0F, Math.min(0.8F, 0.8F * f4));
        mProgress.setArrowScale(Math.min(1.0F, f4));
        if (i == 0) goto _L10; else goto _L9
_L9:
        if (mProgress.getAlpha() < 255 && !isAnimationRunning(mAlphaMaxAnimation))
        {
            startProgressAlphaMaxAnimation();
        }
_L10:
        mProgress.setProgressRotation((-0.25F + 0.4F * f4 + 2.0F * f5) * 0.5F);
        setTargetOffsetTopAndBottom((i1 + l) - mCurrentTargetOffsetTop, true);
        if (i == 0) goto _L1; else goto _L5
_L5:
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, MotionEventCompat.getActionIndex(motionevent));
        if (i == 0) goto _L1; else goto _L6
_L6:
        onSecondaryPointerUp(motionevent);
        if (i == 0) goto _L1; else goto _L3
_L3:
        float f1;
        if (mActivePointerId == -1)
        {
            if (j == 1)
            {
                Log.e(LOG_TAG, z[1]);
            }
            return false;
        }
        f1 = MotionEventCompat.getY(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        f2 = mInitialMotionY;
        mIsBeingDragged = false;
        if ((f1 - f2) * 0.5F <= mTotalDragDistance) goto _L12; else goto _L11
_L11:
        setRefreshing(true, true);
        if (i == 0) goto _L13; else goto _L12
_L12:
        mRefreshing = false;
        mProgress.setStartEndTrim(0.0F, 0.0F);
        motionevent = null;
        if (!mScale)
        {
            motionevent = new _cls5();
        }
        animateOffsetToStartPosition(mCurrentTargetOffsetTop, motionevent);
        mProgress.showArrow(false);
_L13:
        mActivePointerId = -1;
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "&\"a\003\026\"\031\\l\031>\000Zu\022A(cF9\025mwV#A)zMp\025m}B!\004mtMw\000.aJ!\004meL>\0179pQw\b);";
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
                obj = "&\"a\003\026\"\031\\l\031>\030E\0032\027({Ww\0038a\0033\016#2Ww\t,cFw\000#5B4\025$cFw\021\"|M#\004?5J3O";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "&\"a\003\026\"\031\\l\031>\000Zu\022A(cF9\025mwV#A%tU2A,{\003>\017;tO>\005mt@#\b;p\003'\016${W2\023m|Gy";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                LOG_TAG = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
                LAYOUT_ATTRS = (new int[] {
                    0x101000e
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 87;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 97;
          goto _L9
_L5:
        byte0 = 77;
          goto _L9
_L6:
        byte0 = 21;
          goto _L9
        byte0 = 35;
          goto _L9
    }
















/*
    static int access$802(SwipeRefreshLayout swiperefreshlayout, int i)
    {
        swiperefreshlayout.mCurrentTargetOffsetTop = i;
        return i;
    }

*/


    private class _cls1
        implements android.view.animation.Animation.AnimationListener
    {

        final SwipeRefreshLayout this$0;

        public void onAnimationEnd(Animation animation)
        {
label0:
            {
                int i = SlidingPaneLayout.a;
                if (mRefreshing)
                {
                    mProgress.setAlpha(255);
                    mProgress.start();
                    if (!mNotify || mListener == null)
                    {
                        break label0;
                    }
                    mListener.onRefresh();
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                mProgress.stop();
                mCircleView.setVisibility(8);
                setColorViewAlpha(255);
                if (mScale)
                {
                    setAnimationProgress(0.0F);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop, true);
            }
            mCurrentTargetOffsetTop = mCircleView.getTop();
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls1()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }

        private class OnRefreshListener
        {

            public abstract void onRefresh();
        }

    }


    private class _cls6 extends Animation
    {

        final SwipeRefreshLayout this$0;

        public void applyTransformation(float f, Transformation transformation)
        {
            int i;
label0:
            {
                if (!mUsingCustomStart)
                {
                    i = (int)(mSpinnerFinalOffset - (float)Math.abs(mOriginalOffsetTop));
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                i = (int)mSpinnerFinalOffset;
            }
            int j = mFrom;
            i = (int)((float)(i - mFrom) * f);
            int k = mCircleView.getTop();
            setTargetOffsetTopAndBottom((i + j) - k, false);
        }

        _cls6()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }
    }


    private class _cls7 extends Animation
    {

        final SwipeRefreshLayout this$0;

        public void applyTransformation(float f, Transformation transformation)
        {
            moveToStart(f);
        }

        _cls7()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }
    }


    private class _cls4 extends Animation
    {

        final SwipeRefreshLayout this$0;
        final int val$endingAlpha;
        final int val$startingAlpha;

        public void applyTransformation(float f, Transformation transformation)
        {
            mProgress.setAlpha((int)((float)startingAlpha + (float)(endingAlpha - startingAlpha) * f));
        }

        _cls4()
        {
            this$0 = SwipeRefreshLayout.this;
            startingAlpha = i;
            endingAlpha = j;
            super();
        }
    }


    private class _cls3 extends Animation
    {

        final SwipeRefreshLayout this$0;

        public void applyTransformation(float f, Transformation transformation)
        {
            setAnimationProgress(1.0F - f);
        }

        _cls3()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }
    }


    private class _cls8 extends Animation
    {

        final SwipeRefreshLayout this$0;

        public void applyTransformation(float f, Transformation transformation)
        {
            float f1 = mStartingScale;
            float f2 = -mStartingScale;
            setAnimationProgress(f1 + f2 * f);
            moveToStart(f);
        }

        _cls8()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }
    }


    private class _cls5
        implements android.view.animation.Animation.AnimationListener
    {

        final SwipeRefreshLayout this$0;

        public void onAnimationEnd(Animation animation)
        {
            if (!mScale)
            {
                startScaleDownAnimation(null);
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls5()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }
    }

}
