// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

// Referenced classes of package com.walmart.android.utils:
//            RotationAnimationHandler, Rotate3dAnimation

private final class mPosition
    implements Runnable
{

    private final int mPosition;
    final RotationAnimationHandler this$0;

    public void run()
    {
        float f = (float)RotationAnimationHandler.access$100(RotationAnimationHandler.this).getWidth() / 2.0F;
        float f1 = (float)RotationAnimationHandler.access$100(RotationAnimationHandler.this).getHeight() / 2.0F;
        Rotate3dAnimation rotate3danimation;
        if (mPosition > -1)
        {
            RotationAnimationHandler.access$200(RotationAnimationHandler.this).setVisibility(8);
            RotationAnimationHandler.access$300(RotationAnimationHandler.this).setVisibility(0);
            RotationAnimationHandler.access$300(RotationAnimationHandler.this).requestFocus();
            rotate3danimation = new Rotate3dAnimation(-90F, 0.0F, f, f1, 310F, false);
            rotate3danimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final RotationAnimationHandler.SwapViews this$1;

                public void onAnimationEnd(Animation animation)
                {
                    if (RotationAnimationHandler.access$400(this$0) != null)
                    {
                        RotationAnimationHandler.access$400(this$0).onAnimationDone(RotationAnimationHandler.access$300(this$0));
                    }
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$1 = RotationAnimationHandler.SwapViews.this;
                super();
            }
            });
        } else
        {
            RotationAnimationHandler.access$300(RotationAnimationHandler.this).setVisibility(8);
            RotationAnimationHandler.access$200(RotationAnimationHandler.this).setVisibility(0);
            RotationAnimationHandler.access$200(RotationAnimationHandler.this).requestFocus();
            rotate3danimation = new Rotate3dAnimation(90F, 0.0F, f, f1, 310F, false);
            rotate3danimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final RotationAnimationHandler.SwapViews this$1;

                public void onAnimationEnd(Animation animation)
                {
                    if (RotationAnimationHandler.access$400(this$0) != null)
                    {
                        RotationAnimationHandler.access$400(this$0).onAnimationDone(RotationAnimationHandler.access$200(this$0));
                    }
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$1 = RotationAnimationHandler.SwapViews.this;
                super();
            }
            });
        }
        rotate3danimation.setDuration(300L);
        rotate3danimation.setFillAfter(true);
        rotate3danimation.setInterpolator(new DecelerateInterpolator());
        RotationAnimationHandler.access$100(RotationAnimationHandler.this).startAnimation(rotate3danimation);
    }

    public _cls2.this._cls1(int i)
    {
        this$0 = RotationAnimationHandler.this;
        super();
        mPosition = i;
    }
}
