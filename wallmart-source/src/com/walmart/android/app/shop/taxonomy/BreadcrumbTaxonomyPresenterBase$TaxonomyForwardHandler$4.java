// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase

class this._cls1 extends AnimatorListenerAdapter
{

    final this._cls1 this$1;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        cess._mth2602(this._cls1.this, true);
        if (cess._mth2700(this._cls1.this) != null)
        {
            cess._mth2800(this._cls1.this);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
