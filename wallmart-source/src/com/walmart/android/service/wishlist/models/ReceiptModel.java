// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist.models;

import com.walmart.android.service.wishlist.ReceiptResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.wishlist.models:
//            ListItemModel

public class ReceiptModel
{

    private final List mItemModels;
    private final boolean mReceiptFound;

    private ReceiptModel(ReceiptResponse receiptresponse)
    {
        boolean flag = false;
        super();
        mReceiptFound = receiptresponse.receiptFound;
        int i;
        int j;
        if (receiptresponse.items != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = receiptresponse.items.length;
        } else
        {
            j = 0;
        }
        mItemModels = new ArrayList(j);
        if (i != 0)
        {
            receiptresponse = receiptresponse.items;
            j = receiptresponse.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                ListItemModel listitemmodel = new ListItemModel(receiptresponse[i]);
                mItemModels.add(listitemmodel);
            }

        }
    }

    public static ReceiptModel from(ReceiptResponse receiptresponse)
    {
        return new ReceiptModel(receiptresponse);
    }

    public List getMatchedItems()
    {
        return Collections.unmodifiableList(mItemModels);
    }

    public boolean hasMatches()
    {
        return mReceiptFound && !mItemModels.isEmpty();
    }
}
