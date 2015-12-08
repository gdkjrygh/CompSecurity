// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.webkit.WebView;

// Referenced classes of package com.walmart.android.app.item:
//            ProductImagePresenter

class val.position
    implements Runnable
{

    final ProductImagePresenter this$0;
    final int val$position;

    public void run()
    {
        ProductImagePresenter.access$400(ProductImagePresenter.this).loadData(ProductImagePresenter.access$300(ProductImagePresenter.this, val$position), "text/html", "UTF-8");
    }

    ()
    {
        this$0 = final_productimagepresenter;
        val$position = I.this;
        super();
    }
}
