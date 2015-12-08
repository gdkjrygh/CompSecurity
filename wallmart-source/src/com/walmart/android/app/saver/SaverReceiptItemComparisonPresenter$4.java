// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.Cursor;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptItemComparisonPresenter, SaverReceiptItemComparisonListAdapter

class this._cls0
    implements com.walmart.android.service.saver.._cls0
{

    final SaverReceiptItemComparisonPresenter this$0;

    public void onResult(Cursor cursor)
    {
        SaverReceiptItemComparisonPresenter.access$200(SaverReceiptItemComparisonPresenter.this, cursor.getCount());
        SaverReceiptItemComparisonPresenter.access$300(SaverReceiptItemComparisonPresenter.this).changeCursor(cursor);
    }

    public volatile void onResult(Object obj)
    {
        onResult((Cursor)obj);
    }

    I()
    {
        this$0 = SaverReceiptItemComparisonPresenter.this;
        super();
    }
}
