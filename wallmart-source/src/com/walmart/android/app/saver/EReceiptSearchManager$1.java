// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.search.RecentSearchProvider;
import com.walmart.android.search.SearchData;
import com.walmart.android.search.SearchResultAdapter;
import com.walmart.android.search.SuggestionProvider;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.storelocator.LayoutConfig;

// Referenced classes of package com.walmart.android.app.saver:
//            EReceiptSearchManager

class val.layoutConfig extends SearchResultAdapter
{

    final EReceiptSearchManager this$0;
    final LayoutConfig val$layoutConfig;

    public View createView(int i, ViewGroup viewgroup)
    {
        return LayoutInflater.from(EReceiptSearchManager.access$000(EReceiptSearchManager.this)).inflate(val$layoutConfig.getIdForLayoutEnum(com.walmartlabs.storelocator.SEARCH_SUGGESTION_ITEM), null);
    }

    public Object getItem(int i)
    {
        return null;
    }

    public int getItemClickId(int i)
    {
        return val$layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.ARCH_ITEM_ENTRY);
    }

    public int getItemEditId(int i)
    {
        return -1;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public void populateView(View view, int i)
    {
        SearchData searchdata = getSearchData(i);
        ViewUtil.setText(val$layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.ARCH_ITEM_TEXT), view, searchdata.getSearchText());
        ViewUtil.setTextHideIfEmpty(val$layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.ARCH_ITEM_NOTE), view, "");
        ViewUtil.findViewById(view, val$layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.ARCH_ITEM_ARROW)).setVisibility(8);
    }

    (SuggestionProvider suggestionprovider, RecentSearchProvider recentsearchprovider, LayoutConfig layoutconfig)
    {
        this$0 = final_ereceiptsearchmanager;
        val$layoutConfig = layoutconfig;
        super(Context.this, suggestionprovider, recentsearchprovider);
    }
}
