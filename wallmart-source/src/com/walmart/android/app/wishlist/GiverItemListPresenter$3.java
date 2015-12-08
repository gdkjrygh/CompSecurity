// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;


// Referenced classes of package com.walmart.android.app.wishlist:
//            GiverItemListPresenter

class this._cls0
    implements ateListener
{

    final GiverItemListPresenter this$0;

    public void afterUpdate(boolean flag)
    {
        if (!isPopped())
        {
            if (flag)
            {
                GiverItemListPresenter.access$1100(GiverItemListPresenter.this);
            } else
            if (!GiverItemListPresenter.access$200(GiverItemListPresenter.this))
            {
                GiverItemListPresenter.access$300(GiverItemListPresenter.this, false);
                return;
            }
        }
    }

    public void beforeUpdate()
    {
        if (!isPopped())
        {
            GiverItemListPresenter.access$300(GiverItemListPresenter.this, true);
        }
    }

    public void startReceiptScanner()
    {
        GiverItemListPresenter.access$000(GiverItemListPresenter.this);
    }

    ateListener()
    {
        this$0 = GiverItemListPresenter.this;
        super();
    }
}
