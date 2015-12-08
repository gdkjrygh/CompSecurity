// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfPresenter, BundlesShelfAdapter

class this._cls0
    implements android.widget.istener
{

    final BundlesShelfPresenter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i != 0)
        {
            if ((adapterview = (com.walmart.android.service.item.._cls0)BundlesShelfPresenter.access$500(BundlesShelfPresenter.this).getItem(i - 1)) != null)
            {
                BundlesShelfPresenter.access$600(BundlesShelfPresenter.this, adapterview);
                return;
            }
        }
    }

    ion()
    {
        this$0 = BundlesShelfPresenter.this;
        super();
    }
}
