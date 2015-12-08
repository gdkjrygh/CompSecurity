// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v4.animation.AnimatorCompatHelper;
import android.support.v4.animation.AnimatorListenerCompat;
import android.support.v4.animation.AnimatorUpdateListenerCompat;
import android.support.v4.animation.ValueAnimatorCompat;
import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

private class setFraction
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
    final android.support.v7.widget.eAnimator mViewHolder;
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
        mViewHolder.clable(false);
        mValueAnimator.start();
    }

    public void update()
    {
        if (mStartDx == mTargetX)
        {
            mX = ViewCompat.getTranslationX(mViewHolder.mViewHolder);
        } else
        {
            mX = mStartDx + mFraction * (mTargetX - mStartDx);
        }
        if (mStartDy == mTargetY)
        {
            mY = ViewCompat.getTranslationY(mViewHolder.mViewHolder);
            return;
        } else
        {
            mY = mStartDy + mFraction * (mTargetY - mStartDy);
            return;
        }
    }



    public _cls1.val.this._cls0(android.support.v7.widget.mation mation, int i, int j, float f, float f1, float f2, 
            float f3)
    {
        this.this$0 = ItemTouchHelper.this;
        super();
        mOverridden = false;
        mEnded = false;
        mActionState = j;
        mAnimationType = i;
        mViewHolder = mation;
        mStartDx = f;
        mStartDy = f1;
        mTargetX = f2;
        mTargetY = f3;
        mValueAnimator.addUpdateListener(new AnimatorUpdateListenerCompat() {

            final ItemTouchHelper.RecoverAnimation this$1;
            final ItemTouchHelper val$this$0;

            public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
            {
                setFraction(valueanimatorcompat.getAnimatedFraction());
            }

            
            {
                this$1 = ItemTouchHelper.RecoverAnimation.this;
                this$0 = itemtouchhelper;
                super();
            }
        });
        mValueAnimator.setTarget(mation.mValueAnimator);
        mValueAnimator.addListener(this);
        setFraction(0.0F);
    }
}
