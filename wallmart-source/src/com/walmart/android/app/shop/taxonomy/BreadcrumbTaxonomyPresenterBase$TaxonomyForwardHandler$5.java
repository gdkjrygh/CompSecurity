// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ListView;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase

class val.startPos
    implements android.view.TaxonomyForwardHandler._cls5
{

    final is._cls0 this$1;
    final int val$startPos;

    public boolean onPreDraw()
    {
        BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getViewTreeObserver().removeOnPreDrawListener(this);
        AnimatorListenerAdapter animatorlisteneradapter = null;
        for (int i = val$startPos; i < BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildCount();)
        {
            AnimatorListenerAdapter animatorlisteneradapter2 = null;
            View view = BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildAt(i);
            final ViewPropertyAnimator animator = view.animate();
            AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
            if (animatorlisteneradapter == null)
            {
                animatorlisteneradapter1 = new AnimatorListenerAdapter() {

                    final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler._cls5 this$2;
                    final ViewPropertyAnimator val$animator;

                    public void onAnimationEnd(Animator animator1)
                    {
                        animator.setListener(null);
                        BreadcrumbTaxonomyPresenterBase.access$200(this$0).setEnabled(true);
                    }

            
            {
                this$2 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler._cls5.this;
                animator = viewpropertyanimator;
                super();
            }
                };
                animatorlisteneradapter2 = animatorlisteneradapter1;
            }
            view.setAlpha(0.0F);
            animator.alpha(1.0F).setDuration(300L).setListener(animatorlisteneradapter2).start();
            i++;
            animatorlisteneradapter = animatorlisteneradapter1;
        }

        if (animatorlisteneradapter == null)
        {
            BreadcrumbTaxonomyPresenterBase.access$200(_fld0).setEnabled(true);
        }
        return true;
    }

    _cls1.val.animator()
    {
        this$1 = final_animator;
        val$startPos = I.this;
        super();
    }
}
