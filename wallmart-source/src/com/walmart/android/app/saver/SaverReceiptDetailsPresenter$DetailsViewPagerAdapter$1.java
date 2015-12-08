// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.DataSetObserver;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class val.this._cls0 extends DataSetObserver
{

    final tifyDataSetChanged this$1;
    final SaverReceiptDetailsPresenter val$this$0;

    public void onChanged()
    {
        tifyDataSetChanged();
    }

    public void onInvalidated()
    {
        tifyDataSetChanged();
    }

    ()
    {
        this$1 = final_;
        val$this$0 = SaverReceiptDetailsPresenter.this;
        super();
    }
}
