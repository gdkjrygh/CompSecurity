// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import android.view.animation.Transformation;
import android.widget.AbsListView;

// Referenced classes of package android.support.v4.widget:
//            CircleImageView, MaterialProgressDrawable

public class SwipeRefreshLayout extends ViewGroup
{
    public static interface OnRefreshListener
    {

        public abstract void onRefresh();
    }


    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    private static final int CIRCLE_BG_LIGHT = 0xfffafafa;
    private static final int CIRCLE_DIAMETER = 40;
    private static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2F;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    private static final float DRAG_RATE = 0.5F;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int LAYOUT_ATTRS[] = {
        0x101000e
    };
    private static final String LOG_TAG = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8F;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
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
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    private MaterialProgressDrawable mProgress;
    private android.view.animation.Animation.AnimationListener mRefreshListener = new android.view.animation.Animation.AnimationListener() {

        final SwipeRefreshLayout this$0;

        public void onAnimationEnd(Animation animation)
        {
            if (mRefreshing)
            {
                mProgress.setAlpha(255);
                mProgress.start();
                if (mNotify && mListener != null)
                {
                    mListener.onRefresh();
                }
            } else
            {
                mProgress.stop();
                mCircleView.setVisibility(8);
                setColorViewAlpha(255);
                if (mScale)
                {
                    setAnimationProgress(0.0F);
                } else
                {
                    setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop, true);
                }
            }
            mCurrentTargetOffsetTop = mCircleView.getTop();
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
    };
    private boolean mRefreshing;
    private boolean mReturningToStart;
    private boolean mScale;
    private Animation mScaleAnimation;
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
        super(context, attributeset);
        mRefreshing = false;
        mTotalDragDistance = -1F;
        mOriginalOffsetCalculated = false;
        mActivePointerId = -1;
        mCircleViewIndex = -1;
        mAnimateToCorrectPosition = new Animation() {

            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation)
            {
                int i;
                int j;
                int k;
                if (!mUsingCustomStart)
                {
                    i = (int)(mSpinnerFinalOffset - (float)Math.abs(mOriginalOffsetTop));
                } else
                {
                    i = (int)mSpinnerFinalOffset;
                }
                j = mFrom;
                i = (int)((float)(i - mFrom) * f);
                k = mCircleView.getTop();
                setTargetOffsetTopAndBottom((j + i) - k, false);
                mProgress.setArrowScale(1.0F - f);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mAnimateToStartPosition = new Animation() {

            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation)
            {
                moveToStart(f);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
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
        mSpinnerFinalOffset = 64F * ((DisplayMetrics) (context)).density;
        mTotalDragDistance = mSpinnerFinalOffset;
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
        if (mScale)
        {
            startScaleDownReturnToStartAnimation(i, animationlistener);
            return;
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
        if (mTarget != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i >= getChildCount()) goto _L2; else goto _L3
_L3:
        View view = getChildAt(i);
        if (view.equals(mCircleView)) goto _L5; else goto _L4
_L4:
        mTarget = view;
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
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
        if (isAlphaUsedForScale())
        {
            setColorViewAlpha((int)(255F * f));
            return;
        } else
        {
            ViewCompat.setScaleX(mCircleView, f);
            ViewCompat.setScaleY(mCircleView, f);
            return;
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
            if (mRefreshing != flag)
            {
                mNotify = flag1;
                ensureTarget();
                mRefreshing = flag;
                if (!mRefreshing)
                {
                    break label0;
                }
                animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
            }
            return;
        }
        startScaleDownAnimation(mRefreshListener);
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
            Animation animation = new Animation() {

                final SwipeRefreshLayout this$0;
                final int val$endingAlpha;
                final int val$startingAlpha;

                public void applyTransformation(float f, Transformation transformation)
                {
                    mProgress.setAlpha((int)((float)startingAlpha + (float)(endingAlpha - startingAlpha) * f));
                }

            
            {
                this$0 = SwipeRefreshLayout.this;
                startingAlpha = i;
                endingAlpha = j;
                super();
            }
            };
            animation.setDuration(300L);
            mCircleView.setAnimationListener(null);
            mCircleView.clearAnimation();
            mCircleView.startAnimation(animation);
            return animation;
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
        mScaleDownAnimation = new Animation() {

            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation)
            {
                setAnimationProgress(1.0F - f);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mScaleDownAnimation.setDuration(150L);
        mCircleView.setAnimationListener(animationlistener);
        mCircleView.clearAnimation();
        mCircleView.startAnimation(mScaleDownAnimation);
    }

    private void startScaleDownReturnToStartAnimation(int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
        mFrom = i;
        if (isAlphaUsedForScale())
        {
            mStartingScale = mProgress.getAlpha();
        } else
        {
            mStartingScale = ViewCompat.getScaleX(mCircleView);
        }
        mScaleDownToStartAnimation = new Animation() {

            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation)
            {
                float f1 = mStartingScale;
                float f2 = -mStartingScale;
                setAnimationProgress(f1 + f2 * f);
                moveToStart(f);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mScaleDownToStartAnimation.setDuration(150L);
        if (animationlistener != null)
        {
            mCircleView.setAnimationListener(animationlistener);
        }
        mCircleView.clearAnimation();
        mCircleView.startAnimation(mScaleDownToStartAnimation);
    }

    private void startScaleUpAnimation(android.view.animation.Animation.AnimationListener animationlistener)
    {
        mCircleView.setVisibility(0);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mProgress.setAlpha(255);
        }
        mScaleAnimation = new Animation() {

            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation)
            {
                setAnimationProgress(f);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mScaleAnimation.setDuration(mMediumAnimationDuration);
        if (animationlistener != null)
        {
            mCircleView.setAnimationListener(animationlistener);
        }
        mCircleView.clearAnimation();
        mCircleView.startAnimation(mScaleAnimation);
    }

    public boolean canChildScrollUp()
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (mTarget instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)mTarget;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            if (ViewCompat.canScrollVertically(mTarget, -1) || mTarget.getScrollY() > 0)
            {
                flag = true;
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

    public int getProgressCircleDiameter()
    {
        if (mCircleView != null)
        {
            return mCircleView.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    public boolean isRefreshing()
    {
        return mRefreshing;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        ensureTarget();
        i = MotionEventCompat.getActionMasked(motionevent);
        if (mReturningToStart && i == 0)
        {
            mReturningToStart = false;
        }
        if (isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i;
        JVM INSTR tableswitch 0 6: default 100
    //                   0 105
    //                   1 259
    //                   2 161
    //                   3 259
    //                   4 100
    //                   5 100
    //                   6 251;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_259;
_L9:
        return mIsBeingDragged;
_L4:
        float f;
        setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop(), true);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsBeingDragged = false;
        f = getMotionEventY(motionevent, mActivePointerId);
        if (f == -1F) goto _L1; else goto _L8
_L8:
        mInitialDownY = f;
          goto _L9
_L6:
        if (mActivePointerId == -1)
        {
            Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        f = getMotionEventY(motionevent, mActivePointerId);
        if (f == -1F) goto _L1; else goto _L10
_L10:
        if (f - mInitialDownY > (float)mTouchSlop && !mIsBeingDragged)
        {
            mInitialMotionY = mInitialDownY + (float)mTouchSlop;
            mIsBeingDragged = true;
            mProgress.setAlpha(76);
        }
          goto _L9
_L7:
        onSecondaryPointerUp(motionevent);
          goto _L9
        mIsBeingDragged = false;
        mActivePointerId = -1;
          goto _L9
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
                view.layout(k, l, k + (i - getPaddingLeft() - getPaddingRight()), l + (j - getPaddingTop() - getPaddingBottom()));
                j = mCircleView.getMeasuredWidth();
                k = mCircleView.getMeasuredHeight();
                mCircleView.layout(i / 2 - j / 2, mCurrentTargetOffsetTop, i / 2 + j / 2, mCurrentTargetOffsetTop + k);
                return;
            }
        }
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (mTarget == null)
        {
            ensureTarget();
        }
        if (mTarget != null)
        {
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
            while (i < getChildCount()) 
            {
                if (getChildAt(i) == mCircleView)
                {
                    mCircleViewIndex = i;
                    return;
                }
                i++;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (mReturningToStart && i == 0)
        {
            mReturningToStart = false;
        }
        if (!isEnabled() || mReturningToStart || canChildScrollUp())
        {
            return false;
        }
        i;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 540
    //                   2 111
    //                   3 540
    //                   4 92
    //                   5 517
    //                   6 532;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsBeingDragged = false;
        continue; /* Loop/switch isn't completed */
_L4:
        i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (i < 0)
        {
            Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f2 = (MotionEventCompat.getY(motionevent, i) - mInitialMotionY) * 0.5F;
        if (!mIsBeingDragged)
        {
            continue; /* Loop/switch isn't completed */
        }
        mProgress.showArrow(true);
        float f = f2 / mTotalDragDistance;
        if (f < 0.0F)
        {
            return false;
        }
        float f4 = Math.min(1.0F, Math.abs(f));
        float f5 = ((float)Math.max((double)f4 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        float f6 = Math.abs(f2);
        float f7 = mTotalDragDistance;
        int j;
        if (mUsingCustomStart)
        {
            f = mSpinnerFinalOffset - (float)mOriginalOffsetTop;
        } else
        {
            f = mSpinnerFinalOffset;
        }
        f6 = Math.max(0.0F, Math.min(f6 - f7, 2.0F * f) / f);
        f6 = (float)((double)(f6 / 4F) - Math.pow(f6 / 4F, 2D)) * 2.0F;
        i = mOriginalOffsetTop;
        j = (int)(f * f4 + f * f6 * 2.0F);
        if (mCircleView.getVisibility() != 0)
        {
            mCircleView.setVisibility(0);
        }
        if (!mScale)
        {
            ViewCompat.setScaleX(mCircleView, 1.0F);
            ViewCompat.setScaleY(mCircleView, 1.0F);
        }
        if (f2 >= mTotalDragDistance) goto _L8; else goto _L7
_L7:
        if (mScale)
        {
            setAnimationProgress(f2 / mTotalDragDistance);
        }
        if (mProgress.getAlpha() > 76 && !isAnimationRunning(mAlphaStartAnimation))
        {
            startProgressAlphaStartAnimation();
        }
        mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f5 * 0.8F));
        mProgress.setArrowScale(Math.min(1.0F, f5));
_L9:
        mProgress.setProgressRotation((-0.25F + 0.4F * f5 + 2.0F * f6) * 0.5F);
        setTargetOffsetTopAndBottom((i + j) - mCurrentTargetOffsetTop, true);
        continue; /* Loop/switch isn't completed */
_L8:
        if (mProgress.getAlpha() < 255 && !isAnimationRunning(mAlphaMaxAnimation))
        {
            startProgressAlphaMaxAnimation();
        }
        if (true) goto _L9; else goto _L5
_L5:
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, MotionEventCompat.getActionIndex(motionevent));
        continue; /* Loop/switch isn't completed */
_L6:
        onSecondaryPointerUp(motionevent);
        if (true) goto _L1; else goto _L3
_L3:
        if (mActivePointerId == -1)
        {
            if (i == 1)
            {
                Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
            }
            return false;
        }
        float f1 = MotionEventCompat.getY(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        float f3 = mInitialMotionY;
        mIsBeingDragged = false;
        if ((f1 - f3) * 0.5F > mTotalDragDistance)
        {
            setRefreshing(true, true);
        } else
        {
            mRefreshing = false;
            mProgress.setStartEndTrim(0.0F, 0.0F);
            motionevent = null;
            if (!mScale)
            {
                motionevent = new android.view.animation.Animation.AnimationListener() {

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

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
                };
            }
            animateOffsetToStartPosition(mCurrentTargetOffsetTop, motionevent);
            mProgress.showArrow(false);
        }
        mActivePointerId = -1;
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public transient void setColorScheme(int ai[])
    {
        setColorSchemeResources(ai);
    }

    public transient void setColorSchemeColors(int ai[])
    {
        ensureTarget();
        mProgress.setColorSchemeColors(ai);
    }

    public transient void setColorSchemeResources(int ai[])
    {
        Resources resources = getResources();
        int ai1[] = new int[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            ai1[i] = resources.getColor(ai[i]);
        }

        setColorSchemeColors(ai1);
    }

    public void setDistanceToTriggerSync(int i)
    {
        mTotalDragDistance = i;
    }

    public void setOnRefreshListener(OnRefreshListener onrefreshlistener)
    {
        mListener = onrefreshlistener;
    }

    public void setProgressBackgroundColor(int i)
    {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i)
    {
        mCircleView.setBackgroundColor(i);
        mProgress.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i)
    {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    public void setProgressViewEndTarget(boolean flag, int i)
    {
        mSpinnerFinalOffset = i;
        mScale = flag;
        mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean flag, int i, int j)
    {
        mScale = flag;
        mCircleView.setVisibility(8);
        mCurrentTargetOffsetTop = i;
        mOriginalOffsetTop = i;
        mSpinnerFinalOffset = j;
        mUsingCustomStart = true;
        mCircleView.invalidate();
    }

    public void setRefreshing(boolean flag)
    {
        if (flag && mRefreshing != flag)
        {
            mRefreshing = flag;
            int i;
            if (!mUsingCustomStart)
            {
                i = (int)(mSpinnerFinalOffset + (float)mOriginalOffsetTop);
            } else
            {
                i = (int)mSpinnerFinalOffset;
            }
            setTargetOffsetTopAndBottom(i - mCurrentTargetOffsetTop, true);
            mNotify = false;
            startScaleUpAnimation(mRefreshListener);
            return;
        } else
        {
            setRefreshing(flag, false);
            return;
        }
    }

    public void setSize(int i)
    {
        if (i != 0 && i != 1)
        {
            return;
        }
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        if (i == 0)
        {
            int j = (int)(56F * displaymetrics.density);
            mCircleWidth = j;
            mCircleHeight = j;
        } else
        {
            int k = (int)(40F * displaymetrics.density);
            mCircleWidth = k;
            mCircleHeight = k;
        }
        mCircleView.setImageDrawable(null);
        mProgress.updateSizes(i);
        mCircleView.setImageDrawable(mProgress);
    }

















/*
    static int access$802(SwipeRefreshLayout swiperefreshlayout, int i)
    {
        swiperefreshlayout.mCurrentTargetOffsetTop = i;
        return i;
    }

*/

}
