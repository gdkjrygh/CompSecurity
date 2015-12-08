// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class this._cls0
    implements android.support.v4.view.ter._cls1
{

    final SaverReceiptDetailsPresenter this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (SaverReceiptDetailsPresenter.access$000(SaverReceiptDetailsPresenter.this) != i)
        {
            SaverReceiptDetailsPresenter.access$100(SaverReceiptDetailsPresenter.this, i);
            SaverReceiptDetailsPresenter.access$200(SaverReceiptDetailsPresenter.this, i);
            SaverReceiptDetailsPresenter.access$002(SaverReceiptDetailsPresenter.this, i);
            SaverReceiptDetailsPresenter.access$300(SaverReceiptDetailsPresenter.this);
            SaverReceiptDetailsPresenter.access$400(SaverReceiptDetailsPresenter.this).moveTo(i);
            onPageView();
        }
    }

    tionCallbacks()
    {
        this$0 = SaverReceiptDetailsPresenter.this;
        super();
    }
}
