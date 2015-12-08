// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.os.Handler;
import com.walmart.android.service.browsepersonalization.LeafItems;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            TaxonomyNodeLeafItemLoader

public class mPageSize extends mPageSize
{

    private int mPageSize;
    final TaxonomyNodeLeafItemLoader this$0;

    public volatile void onFailed(Integer integer, Object obj)
    {
        onFailed(integer, (LeafItems[])obj);
    }

    public void onFailed(Integer integer, LeafItems aleafitems[])
    {
        WLog.w(TaxonomyNodeLeafItemLoader.access$000(), (new StringBuilder()).append("Failed to load taxonomy node leaf items. ErrorCode: ").append(integer).toString());
        TaxonomyNodeLeafItemLoader taxonomynodeleafitemloader = TaxonomyNodeLeafItemLoader.this;
        if (integer.intValue() == 0x15f92)
        {
            aleafitems = this._fld0;
        } else
        {
            aleafitems = this._fld0;
        }
        taxonomynodeleafitemloader.notifyError(aleafitems, integer.intValue());
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((LeafItems[])obj);
    }

    public void onResponse(LeafItems aleafitems[])
    {
        aleafitems = new com.walmart.android.service.browsepersonalization.(aleafitems);
        ArrayList arraylist = new ArrayList(mPageSize);
        for (; aleafitems.(); arraylist.add(aleafitems.())) { }
        if (arraylist.isEmpty())
        {
            setAllItemsLoaded();
        }
        if (isFirstPage())
        {
            notifyFirstPageLoaded(arraylist, -1);
            return;
        } else
        {
            notifyPageLoaded(arraylist);
            return;
        }
    }

    public i(Handler handler, int i)
    {
        this$0 = TaxonomyNodeLeafItemLoader.this;
        super(TaxonomyNodeLeafItemLoader.this, handler);
        mPageSize = i;
    }
}
