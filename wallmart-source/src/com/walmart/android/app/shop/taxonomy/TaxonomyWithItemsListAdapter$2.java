// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.os.Handler;
import android.view.View;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.browsepersonalization.LeafItems;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            TaxonomyWithItemsListAdapter

class val.listEntryView extends AsyncCallbackOnThread
{

    final TaxonomyWithItemsListAdapter this$0;
    final View val$listEntryView;
    final TaxonomyItem val$taxonomyItem;

    public void onFailureSameThread(Integer integer, LeafItems aleafitems[])
    {
        TaxonomyWithItemsListAdapter.access$100(TaxonomyWithItemsListAdapter.this).remove(val$taxonomyItem.id);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (LeafItems[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((LeafItems[])obj);
    }

    public void onSuccessSameThread(LeafItems aleafitems[])
    {
        TaxonomyWithItemsListAdapter.access$100(TaxonomyWithItemsListAdapter.this).remove(val$taxonomyItem.id);
        if (!TaxonomyWithItemsListAdapter.access$200(TaxonomyWithItemsListAdapter.this))
        {
            TaxonomyWithItemsListAdapter.access$300(TaxonomyWithItemsListAdapter.this).put(val$taxonomyItem.id, aleafitems);
            if (val$taxonomyItem.id.equals(val$listEntryView.getTag()))
            {
                val$listEntryView.findViewById(0x7f100096).setVisibility(8);
                val$listEntryView.findViewById(0x7f1005cf).setVisibility(0);
                TaxonomyWithItemsListAdapter.access$400(TaxonomyWithItemsListAdapter.this, val$listEntryView, aleafitems, val$taxonomyItem);
            }
        }
    }

    (View view)
    {
        this$0 = final_taxonomywithitemslistadapter;
        val$taxonomyItem = TaxonomyItem.this;
        val$listEntryView = view;
        super(final_handler);
    }
}
