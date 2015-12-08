// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.widget.CompoundButton;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter

class this._cls0
    implements android.widget.edChangeListener
{

    final ShopFilterPresenter this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            if (ShopFilterPresenter.access$000(ShopFilterPresenter.this) == null)
            {
                ShopFilterPresenter.access$100(ShopFilterPresenter.this);
            } else
            {
                setInStoreActive(true);
            }
        } else
        {
            setInStoreActive(false);
        }
        ShopFilterPresenter.access$200(ShopFilterPresenter.this);
        reloadData();
    }

    er()
    {
        this$0 = ShopFilterPresenter.this;
        super();
    }
}
