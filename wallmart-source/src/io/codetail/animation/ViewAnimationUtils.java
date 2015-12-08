// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.codetail.animation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

// Referenced classes of package io.codetail.animation:
//            RevealAnimator, SupportAnimatorLollipop, SupportAnimatorPreL, SupportAnimator

public class ViewAnimationUtils
{

    private static final boolean LOLLIPOP_PLUS;
    public static final int SCALE_UP_DURATION = 500;

    public ViewAnimationUtils()
    {
    }

    public static SupportAnimator createCircularReveal(View view, int i, int j, float f, float f1)
    {
        if (!(view.getParent() instanceof RevealAnimator))
        {
            throw new IllegalArgumentException("View must be inside RevealFrameLayout or RevealLinearLayout.");
        }
        RevealAnimator revealanimator = (RevealAnimator)view.getParent();
        revealanimator.attachRevealInfo(new RevealAnimator.RevealInfo(i, j, f, f1, new WeakReference(view)));
        if (LOLLIPOP_PLUS)
        {
            return new SupportAnimatorLollipop(android.view.ViewAnimationUtils.createCircularReveal(view, i, j, f, f1), revealanimator);
        } else
        {
            view = ObjectAnimator.ofFloat(revealanimator, RevealAnimator.CLIP_RADIUS, new float[] {
                f, f1
            });
            view.addListener(getRevealFinishListener(revealanimator));
            return new SupportAnimatorPreL(view, revealanimator);
        }
    }

    private static com.nineoldandroids.animation.Animator.AnimatorListener getRevealFinishListener(RevealAnimator revealanimator)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new RevealAnimator.RevealFinishedJellyBeanMr2(revealanimator);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new RevealAnimator.RevealFinishedIceCreamSandwich(revealanimator);
        } else
        {
            return new RevealAnimator.RevealFinishedGingerbread(revealanimator);
        }
    }

    public static void liftingFromBottom(View view, float f, float f1, int i, int j)
    {
        ViewHelper.setRotationX(view, f);
        ViewHelper.setTranslationY(view, f1);
        ViewPropertyAnimator.animate(view).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(i).setStartDelay(j).rotationX(0.0F).translationY(0.0F).start();
    }

    public static void liftingFromBottom(View view, float f, int i)
    {
        ViewHelper.setRotationX(view, f);
        ViewHelper.setTranslationY(view, view.getHeight() / 3);
        ViewPropertyAnimator.animate(view).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(i).rotationX(0.0F).translationY(0.0F).start();
    }

    public static void liftingFromBottom(View view, float f, int i, int j)
    {
        ViewHelper.setRotationX(view, f);
        ViewHelper.setTranslationY(view, view.getHeight() / 3);
        ViewPropertyAnimator.animate(view).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(i).setStartDelay(j).rotationX(0.0F).translationY(0.0F).start();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        LOLLIPOP_PLUS = flag;
    }

    // Unreferenced inner class io/codetail/animation/ViewAnimationUtils$SimpleAnimationListener
    /* block-local class not found */
    class SimpleAnimationListener {}

}
