// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter

class this._cls0
    implements android.content.issListener
{

    final ShopFilterPresenter this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        ShopFilterPresenter.access$600(ShopFilterPresenter.this).setResult(0);
        ShopFilterPresenter.access$600(ShopFilterPresenter.this).finish();
    }

    ()
    {
        this$0 = ShopFilterPresenter.this;
        super();
    }
}
