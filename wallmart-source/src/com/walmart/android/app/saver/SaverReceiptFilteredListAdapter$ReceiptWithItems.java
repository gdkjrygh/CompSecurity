// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import com.walmartlabs.ereceipt.service.EReceipt;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFilteredListAdapter, SaverReceiptItemListAdapter

private static class <init>
{

    private final SaverReceiptItemListAdapter mAdapter;
    private final EReceipt mReceipt;
    private String mSectionHeader;

    private void setItems(List list)
    {
        mAdapter.setItems(list);
    }




/*
    static String access$102( , String s)
    {
        .mSectionHeader = s;
        return s;
    }

*/



    private mSectionHeader(Activity activity, EReceipt ereceipt)
    {
        mReceipt = ereceipt;
        mAdapter = new SaverReceiptItemListAdapter(activity);
    }

    mAdapter(Activity activity, EReceipt ereceipt, mAdapter madapter)
    {
        this(activity, ereceipt);
    }
}
