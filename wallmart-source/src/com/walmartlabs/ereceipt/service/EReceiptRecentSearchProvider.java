// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.content.Context;
import com.walmart.android.search.RecentSearchDataProvider;

public class EReceiptRecentSearchProvider extends RecentSearchDataProvider
{

    private static final String DATABASE_NAME = "recent_ereceipts.db";
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptRecentSearchProvider.getSimpleName();
    private static EReceiptRecentSearchProvider sInstance = null;

    private EReceiptRecentSearchProvider(Context context)
    {
        super(context, "recent_ereceipts.db");
    }

    public static EReceiptRecentSearchProvider getInstance(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new EReceiptRecentSearchProvider(context.getApplicationContext());
        }
        return sInstance;
    }

}
