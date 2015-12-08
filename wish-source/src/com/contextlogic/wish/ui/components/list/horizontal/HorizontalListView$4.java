// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list.horizontal;


// Referenced classes of package com.contextlogic.wish.ui.components.list.horizontal:
//            HorizontalListView, HorizontalListViewAdapter

class val.position
    implements Runnable
{

    final HorizontalListView this$0;
    final int val$position;

    public void run()
    {
        scrollTo(HorizontalListView.access$300(HorizontalListView.this).getWidthForView() * val$position, 0);
    }

    pter()
    {
        this$0 = final_horizontallistview;
        val$position = I.this;
        super();
    }
}
