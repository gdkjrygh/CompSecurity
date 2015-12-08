// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;


// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterActivity

class this._cls0
    implements nFilterAppliedListener
{

    final ShopFilterActivity this$0;

    public void onFilterApplied()
    {
        setResult(-1);
        ShopFilterManager _tmp = ShopFilterActivity.access$002(ShopFilterActivity.access$100(ShopFilterActivity.this));
        finish();
    }

    nFilterAppliedListener()
    {
        this$0 = ShopFilterActivity.this;
        super();
    }
}
