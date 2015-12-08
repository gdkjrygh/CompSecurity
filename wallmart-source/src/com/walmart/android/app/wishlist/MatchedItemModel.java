// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.service.wishlist.models.ListItemModel;

class MatchedItemModel
{

    private final ListItemModel mItem;
    private int mQuantity;
    private boolean mSelected;

    MatchedItemModel(ListItemModel listitemmodel)
    {
        mItem = listitemmodel;
        mSelected = false;
        mQuantity = listitemmodel.getReceiptQuantity();
    }

    ListItemModel getItem()
    {
        return mItem;
    }

    int getQuantity()
    {
        return mQuantity;
    }

    boolean isSelected()
    {
        return mSelected;
    }

    void setQuantity(int i)
    {
        mQuantity = Math.max(1, Math.min(i, mItem.getReceiptQuantity()));
    }

    void setSelected(boolean flag)
    {
        mSelected = flag;
    }
}
