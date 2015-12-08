// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

// Referenced classes of package com.walmart.android.utils:
//            Rotate3dAnimation

public class RotationAnimationHandler
{
    private final class DisplayNextView
        implements android.view.animation.Animation.AnimationListener
    {

        private final int mPosition;
        final RotationAnimationHandler this$0;

        public void onAnimationEnd(Animation animation)
        {
            mContainer.post(new SwapViews(mPosition));
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        private DisplayNextView(int i)
        {
            this$0 = RotationAnimationHandler.this;
            super();
            mPosition = i;
        }

    }

    public static interface Listener
    {

        public abstract void onAnimationDone(View view);
    }

    private final class SwapViews
        implements Runnable
    {

        private final int mPosition;
        final RotationAnimationHandler this$0;

        public void run()
        {
            float f = (float)mContainer.getWidth() / 2.0F;
            float f1 = (float)mContainer.getHeight() / 2.0F;
            Rotate3dAnimation rotate3danimation;
            if (mPosition > -1)
            {
                mViewA.setVisibility(8);
                mViewB.setVisibility(0);
                mViewB.requestFocus();
                rotate3danimation = new Rotate3dAnimation(-90F, 0.0F, f, f1, 310F, false);
                rotate3danimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final SwapViews this$1;

                    public void onAnimationEnd(Animation animation)
                    {
                        if (mListener != null)
                        {
                            mListener.onAnimationDone(mViewB);
                        }
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$1 = SwapViews.this;
                super();
            }
                });
            } else
            {
                mViewB.setVisibility(8);
                mViewA.setVisibility(0);
                mViewA.requestFocus();
                rotate3danimation = new Rotate3dAnimation(90F, 0.0F, f, f1, 310F, false);
                rotate3danimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final SwapViews this$1;

                    public void onAnimationEnd(Animation animation)
                    {
                        if (mListener != null)
                        {
                            mListener.onAnimationDone(mViewA);
                        }
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$1 = SwapViews.this;
                super();
            }
                });
            }
            rotate3danimation.setDuration(300L);
            rotate3danimation.setFillAfter(true);
            rotate3danimation.setInterpolator(new DecelerateInterpolator());
            mContainer.startAnimation(rotate3danimation);
        }

        public SwapViews(int i)
        {
            this$0 = RotationAnimationHandler.this;
            super();
            mPosition = i;
        }
    }


    private ViewGroup mContainer;
    private Listener mListener;
    private View mViewA;
    private View mViewB;

    public RotationAnimationHandler(ViewGroup viewgroup, View view, View view1)
    {
        mContainer = viewgroup;
        mViewA = view;
        mViewB = view1;
    }

    public void applyRotation(int i, float f, float f1)
    {
        Rotate3dAnimation rotate3danimation = new Rotate3dAnimation(f, f1, (float)mContainer.getWidth() / 2.0F, (float)mContainer.getHeight() / 2.0F, 310F, true);
        rotate3danimation.setDuration(200L);
        rotate3danimation.setFillAfter(true);
        rotate3danimation.setInterpolator(new AccelerateInterpolator());
        rotate3danimation.setAnimationListener(new DisplayNextView(i));
        mContainer.startAnimation(rotate3danimation);
    }

    public void flipViews(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (mViewB.getVisibility() != 8) goto _L4; else goto _L3
_L3:
        applyRotation(1, 0.0F, 90F);
_L6:
        return;
_L4:
        applyRotation(-1, 0.0F, -90F);
        return;
_L2:
        View view;
        if (mViewB.getVisibility() == 8)
        {
            mViewA.setVisibility(8);
            mViewB.setVisibility(0);
            view = mViewB;
        } else
        {
            mViewB.setVisibility(8);
            mViewA.setVisibility(0);
            view = mViewA;
        }
        if (mListener != null)
        {
            mListener.onAnimationDone(view);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }




}
