// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.database.MatrixCursor;
import com.walmart.android.app.shop.search.ShopSearchData;
import java.util.List;

// Referenced classes of package com.walmart.android.app.main:
//            SearchContentProvider

public static class ON extends MatrixCursor
{

    public (List list)
    {
        super(SearchContentProvider.access$000(), list.size());
        for (int i = 0; i < list.size(); i++)
        {
            addRow(new Object[] {
                Integer.valueOf(i), SearchContentProvider.access$200(), String.valueOf(0x7f0202bc), null, String.valueOf(com.walmart.android.search.TION), ((ShopSearchData)list.get(i)).getSearchText(), ((ShopSearchData)list.get(i)).getSearchText(), ((ShopSearchData)list.get(i)).getDepartment()
            });
        }

    }
}
