// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptItemComparisonPresenter

class this._cls0 extends HeaderViewListAdapter
{

    final SaverReceiptItemComparisonPresenter this$0;

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    I(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
    {
        this$0 = SaverReceiptItemComparisonPresenter.this;
        super(arraylist, arraylist1, listadapter);
    }
}
