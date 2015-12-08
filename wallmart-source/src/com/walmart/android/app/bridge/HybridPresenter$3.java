// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.util.SparseArray;
import android.view.MenuItem;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.bridge:
//            HybridPresenter, BridgeController

class this._cls0
    implements android.view.mClickListener
{

    final HybridPresenter this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        WLog.d(HybridPresenter.access$900(), (new StringBuilder()).append(menuitem.getTitle()).append(" button clicked.").toString());
        int i = menuitem.getItemId();
        menuitem = (String)HybridPresenter.access$1000(HybridPresenter.this).get(i);
        return HybridPresenter.access$1100(HybridPresenter.this).onButtonClicked(menuitem);
    }

    ()
    {
        this$0 = HybridPresenter.this;
        super();
    }
}
