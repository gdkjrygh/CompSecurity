// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter, SaverReceiptFilteredListAdapter

class this._cls0
    implements hangeListener
{

    final SaverReceiptListPresenter this$0;

    public void onFilterChange(CharSequence charsequence)
    {
        SaverReceiptListPresenter.access$802(SaverReceiptListPresenter.this, charsequence.toString());
        SaverReceiptListPresenter.access$600(SaverReceiptListPresenter.this).cancelSetData();
        SaverReceiptListPresenter.access$900(SaverReceiptListPresenter.this);
    }

    ter()
    {
        this$0 = SaverReceiptListPresenter.this;
        super();
    }
}
