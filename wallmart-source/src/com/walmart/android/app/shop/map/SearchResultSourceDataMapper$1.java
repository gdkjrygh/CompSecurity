// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;


// Referenced classes of package com.walmart.android.app.shop.map:
//            SearchResultSourceDataMapper

class > extends android.support.v7.widget.r
{

    final SearchResultSourceDataMapper this$0;

    public void onChanged()
    {
        update();
    }

    public void onItemRangeChanged(int i, int j)
    {
        update();
    }

    public void onItemRangeInserted(int i, int j)
    {
        update();
    }

    public void onItemRangeMoved(int i, int j, int k)
    {
        update();
    }

    public void onItemRangeRemoved(int i, int j)
    {
        update();
    }

    ()
    {
        this$0 = SearchResultSourceDataMapper.this;
        super();
    }
}
