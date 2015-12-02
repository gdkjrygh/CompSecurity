// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import gka;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Page, PageItem, TimeWindow

class dow
    implements gka
{

    final Page this$0;
    final TimeWindow val$window;

    public boolean apply(PageItem pageitem)
    {
        return pageitem.isPageItemVisible(val$window);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((PageItem)obj);
    }

    dow()
    {
        this$0 = final_page;
        val$window = TimeWindow.this;
        super();
    }
}
