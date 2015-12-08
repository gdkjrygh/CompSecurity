// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.view.ViewTreeObserver;
import android.widget.ListView;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase

class this._cls1
    implements android.view.se.TaxonomyBackHandler._cls4
{

    final this._cls1 this$1;

    public boolean onPreDraw()
    {
        BreadcrumbTaxonomyPresenterBase.access$200(_fld0).getViewTreeObserver().removeOnPreDrawListener(this);
        cess._mth1700(this._cls1.this);
        cess._mth1800(this._cls1.this);
        cess._mth1900(this._cls1.this);
        cess._mth2000(this._cls1.this);
        return true;
    }

    a()
    {
        this$1 = this._cls1.this;
        super();
    }
}
