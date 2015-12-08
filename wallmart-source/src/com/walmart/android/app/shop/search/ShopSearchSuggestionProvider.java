// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.search;

import com.walmart.android.search.SuggestionProvider;
import com.walmart.android.service.typeahead.SearchSuggestions;
import com.walmart.android.service.typeahead.TypeAheadService;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.search:
//            ShopSearchData

public class ShopSearchSuggestionProvider
    implements SuggestionProvider
{

    private static final String TAG = com/walmart/android/app/shop/search/ShopSearchSuggestionProvider.getSimpleName();

    public ShopSearchSuggestionProvider()
    {
    }

    public List getSuggestions(String s)
    {
        ArrayList arraylist;
        boolean flag;
        flag = false;
        arraylist = new ArrayList();
        s = Services.get().getTypeAheadService().getSearchSuggestions(s).getResult();
        if (!s.successful() || !s.hasData()) goto _L2; else goto _L1
_L1:
        s = (SearchSuggestions)s.getData();
        if (((SearchSuggestions) (s)).generic == null) goto _L4; else goto _L3
_L3:
        com.walmart.android.service.typeahead.SearchSuggestions.Suggestion asuggestion[];
        int j;
        asuggestion = ((SearchSuggestions) (s)).generic;
        j = asuggestion.length;
        int i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(new ShopSearchData(asuggestion[i].query, com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (((SearchSuggestions) (s)).specific == null) goto _L2; else goto _L6
_L6:
        s = ((SearchSuggestions) (s)).specific;
        j = s.length;
        i = ((flag) ? 1 : 0);
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(new ShopSearchData(((com.walmart.android.service.typeahead.SearchSuggestions.Suggestion) (s[i])).query, com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION));
        i++;
        if (true) goto _L7; else goto _L2
        s;
        WLog.w(TAG, "Request was interrupted");
_L2:
        return arraylist;
    }

}
