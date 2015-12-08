// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenPresenter, InStoreMapFullScreenController

class this._cls0
    implements android.view.llScreenPresenter._cls1
{

    final InStoreMapFullScreenPresenter this$0;

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        InStoreMapFullScreenPresenter.access$100(InStoreMapFullScreenPresenter.this).setVisibleRect(new Rect(0, 0, InStoreMapFullScreenPresenter.access$000(InStoreMapFullScreenPresenter.this).getWidth(), j));
    }

    ()
    {
        this$0 = InStoreMapFullScreenPresenter.this;
        super();
    }
}
