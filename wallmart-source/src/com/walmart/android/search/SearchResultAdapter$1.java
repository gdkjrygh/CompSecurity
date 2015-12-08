// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.view.View;

// Referenced classes of package com.walmart.android.search:
//            SearchResultAdapter

class val.position
    implements android.view.sultAdapter._cls1
{

    final SearchResultAdapter this$0;
    final int val$position;

    public void onClick(View view)
    {
        SearchResultAdapter.access$100(SearchResultAdapter.this).onItemSelected(getSearchData(val$position));
    }

    ItemClickListener()
    {
        this$0 = final_searchresultadapter;
        val$position = I.this;
        super();
    }
}
