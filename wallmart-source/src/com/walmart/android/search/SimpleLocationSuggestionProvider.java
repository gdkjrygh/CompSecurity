// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.content.Context;

// Referenced classes of package com.walmart.android.search:
//            LocationSuggestionProvider, SearchData

public class SimpleLocationSuggestionProvider extends LocationSuggestionProvider
{

    public SimpleLocationSuggestionProvider(Context context, String s)
    {
        super(context, s);
    }

    public SearchData createSearchData(String s)
    {
        return new SearchData(s, SearchData.SearchType.SEARCH_TYPE_SUGGESTION);
    }
}
