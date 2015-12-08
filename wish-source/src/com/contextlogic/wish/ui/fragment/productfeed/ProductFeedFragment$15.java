// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.DialogInterface;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.index
    implements android.content.Listener
{

    final ProductFeedFragment this$0;
    final StaggeredGridCellView val$cell;
    final int val$index;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            ProductFeedFragment.access$1100(ProductFeedFragment.this, val$cell.getContentView(), val$index);
        }
    }

    ()
    {
        this$0 = final_productfeedfragment;
        val$cell = staggeredgridcellview;
        val$index = I.this;
        super();
    }
}
