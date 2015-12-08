// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import com.walmart.android.search.RecentSearchDataProvider;

public class BasicRecentSearchProvider extends RecentSearchDataProvider
{

    private static final String DATABASE_NAME = "recent_stores.db";
    private static final String TAG = com/walmartlabs/storelocator/BasicRecentSearchProvider.getSimpleName();
    private static BasicRecentSearchProvider sInstance = null;

    private BasicRecentSearchProvider(Context context)
    {
        super(context, "recent_stores.db");
    }

    public static BasicRecentSearchProvider getInstance(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new BasicRecentSearchProvider(context.getApplicationContext());
        }
        return sInstance;
    }

}
