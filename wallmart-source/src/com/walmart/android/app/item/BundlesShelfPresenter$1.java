// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfPresenter

class this._cls0
    implements android.view.helfPresenter._cls1
{

    final BundlesShelfPresenter this$0;

    public void onClick(View view)
    {
        int i = BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).getSelectedOptions().size();
        int j = BundlesShelfPresenter.access$000(BundlesShelfPresenter.this).getBundleGroup().getMinimumSelectionsRequired();
        if (j == 0 || i == j)
        {
            BundlesShelfPresenter.access$100(BundlesShelfPresenter.this);
            return;
        } else
        {
            BundlesShelfPresenter.access$200(BundlesShelfPresenter.this, 2);
            return;
        }
    }

    oup()
    {
        this$0 = BundlesShelfPresenter.this;
        super();
    }
}
