// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.DataSetObserver;

// Referenced classes of package com.walmart.android.app.saver:
//            EReceiptSearchManager

private static class mRecentHistoryAdapter extends DataSetObserver
{

    private final notifyDataSetInvalidated mRecentHistoryAdapter;

    public void onChanged()
    {
        mRecentHistoryAdapter.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        mRecentHistoryAdapter.notifyDataSetInvalidated();
    }

    public ( )
    {
        mRecentHistoryAdapter = ;
    }
}
