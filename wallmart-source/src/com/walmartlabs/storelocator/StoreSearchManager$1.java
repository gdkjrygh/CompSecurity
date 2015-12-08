// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.search.RecentSearchProvider;
import com.walmart.android.search.SearchData;
import com.walmart.android.search.SearchResultAdapter;
import com.walmart.android.search.SuggestionProvider;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreSearchManager, LayoutConfig

class it> extends SearchResultAdapter
{

    final StoreSearchManager this$0;

    public View createView(int i, ViewGroup viewgroup)
    {
        return LayoutInflater.from(StoreSearchManager.access$100(StoreSearchManager.this)).inflate(StoreSearchManager.access$000(StoreSearchManager.this).getIdForLayoutEnum(um.SEARCH_SUGGESTION_ITEM), null);
    }

    public Object getItem(int i)
    {
        return null;
    }

    public int getItemClickId(int i)
    {
        return StoreSearchManager.access$000(StoreSearchManager.this).getIdForViewEnum(.SEARCH_ITEM_ENTRY);
    }

    public int getItemEditId(int i)
    {
        return StoreSearchManager.access$000(StoreSearchManager.this).getIdForViewEnum(.SEARCH_ITEM_ARROW);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public void populateView(View view, int i)
    {
        SearchData searchdata = getSearchData(i);
        ViewUtil.setText(StoreSearchManager.access$000(StoreSearchManager.this).getIdForViewEnum(.SEARCH_ITEM_TEXT), view, searchdata.getSearchText());
        ViewUtil.setTextHideIfEmpty(StoreSearchManager.access$000(StoreSearchManager.this).getIdForViewEnum(.SEARCH_ITEM_NOTE), view, "");
    }

    (Context context, SuggestionProvider suggestionprovider, RecentSearchProvider recentsearchprovider)
    {
        this$0 = StoreSearchManager.this;
        super(context, suggestionprovider, recentsearchprovider);
    }
}
