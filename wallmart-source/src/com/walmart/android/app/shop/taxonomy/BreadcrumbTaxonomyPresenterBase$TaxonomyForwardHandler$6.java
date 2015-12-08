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

class this._cls1
    implements android.view.TaxonomyForwardHandler._cls6
{

    final is._cls0 this$1;

    public boolean onPreDraw()
    {
        BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getViewTreeObserver().removeOnPreDrawListener(this);
        int j = BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getFirstVisiblePosition();
        Object obj = BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildAt(cess._mth2200(this._cls1.this));
        Integer integer = (Integer)cess._mth2900(this._cls1.this).get(BreadcrumbTaxonomyPresenterBase.access$000(_fld0).getItem(cess._mth2200(this._cls1.this) + j));
        if (integer != null)
        {
            obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                (float)(-(((View) (obj)).getTop() - integer.intValue())), 0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler._cls6 this$2;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    BreadcrumbTaxonomyPresenterBase.access$000(this$0).setTaxonomyItems(new TaxonomyItem[0]);
                    for (int k = 0; k < BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildCount(); k++)
                    {
                        BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(k).setAlpha(1.0F);
                        BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(k).setTranslationY(0.0F);
                    }

                }

            
            {
                this$2 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler._cls6.this;
                super();
            }
            });
            ((ObjectAnimator) (obj)).start();
        }
        for (int i = cess._mth2200(this._cls1.this) + 1; i < BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildCount(); i++)
        {
            View view = BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getChildAt(i);
            view.animate().alpha(0.0F).setDuration(100L).setListener(null).start();
            Integer integer1 = (Integer)cess._mth2900(this._cls1.this).get(BreadcrumbTaxonomyPresenterBase.access$000(_fld0).getItem(j + i));
            if (integer1 != null)
            {
                view.setTranslationY(-(view.getTop() - integer1.intValue()));
            }
        }

        return true;
    }

    _cls1.this._cls2()
    {
        this$1 = this._cls1.this;
        super();
    }
}
