// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.view.ViewTreeObserver;
import android.widget.ListView;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase, BreadcrumbTaxonomyListAdapter

class this._cls1
    implements android.view.TaxonomyForwardHandler._cls2
{

    final this._cls1 this$1;

    public boolean onPreDraw()
    {
        BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getViewTreeObserver().removeOnPreDrawListener(this);
        if (BreadcrumbTaxonomyPresenterBase.access$000(_fld0).getCount() > cess._mth2200(this._cls1.this))
        {
            cess._mth2300(this._cls1.this);
        }
        cess._mth2400(this._cls1.this);
        cess._mth2500(this._cls1.this);
        return true;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
