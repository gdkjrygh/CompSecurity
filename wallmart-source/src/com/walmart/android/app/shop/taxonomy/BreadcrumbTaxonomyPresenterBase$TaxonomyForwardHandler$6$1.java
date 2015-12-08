// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase, BreadcrumbTaxonomyListAdapter

class this._cls2 extends AnimatorListenerAdapter
{

    final ._cls0 this$2;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        BreadcrumbTaxonomyPresenterBase.access$000(_fld0).setTaxonomyItems(new TaxonomyItem[0]);
        for (int i = 0; i < BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildCount(); i++)
        {
            BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildAt(i).setAlpha(1.0F);
            BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildAt(i).setTranslationY(0.0F);
        }

    }

    is._cls1()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/shop/taxonomy/BreadcrumbTaxonomyPresenterBase$TaxonomyForwardHandler$6

/* anonymous class */
    class BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler._cls6
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;

        public boolean onPreDraw()
        {
            BreadcrumbTaxonomyPresenterBase.access$200(this$0).getViewTreeObserver().removeOnPreDrawListener(this);
            int j = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getFirstVisiblePosition();
            Object obj = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.access$2200(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this));
            Integer integer = (Integer)BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.access$2900(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this).get(BreadcrumbTaxonomyPresenterBase.access$000(this$0).getItem(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.access$2200(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this) + j));
            if (integer != null)
            {
                obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                    (float)(-(((View) (obj)).getTop() - integer.intValue())), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(300L);
                ((ObjectAnimator) (obj)).addListener(new BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler._cls6._cls1());
                ((ObjectAnimator) (obj)).start();
            }
            for (int i = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.access$2200(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this) + 1; i < BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildCount(); i++)
            {
                View view = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(i);
                view.animate().alpha(0.0F).setDuration(100L).setListener(null).start();
                Integer integer1 = (Integer)BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.access$2900(BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this).get(BreadcrumbTaxonomyPresenterBase.access$000(this$0).getItem(j + i));
                if (integer1 != null)
                {
                    view.setTranslationY(-(view.getTop() - integer1.intValue()));
                }
            }

            return true;
        }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                super();
            }
    }

}
