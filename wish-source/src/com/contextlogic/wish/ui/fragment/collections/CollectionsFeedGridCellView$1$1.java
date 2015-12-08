// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.collections;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.contextlogic.wish.api.data.Collection;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;

// Referenced classes of package com.contextlogic.wish.ui.fragment.collections:
//            CollectionsFeedGridCellView

class val.fragment
    implements Runnable
{

    final val.fragment this$1;
    final FilterFeedFragment val$fragment;

    public void run()
    {
        RootActivity rootactivity = (RootActivity)getContext();
        rootactivity.setTitle(CollectionsFeedGridCellView.access$100(_fld0).getText());
        rootactivity.setContentFragment(val$fragment, false);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$fragment = FilterFeedFragment.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/collections/CollectionsFeedGridCellView$1

/* anonymous class */
    class CollectionsFeedGridCellView._cls1
        implements android.view.View.OnClickListener
    {

        final CollectionsFeedGridCellView this$0;

        public void onClick(View view)
        {
            view = new Bundle();
            view.putBoolean("ArgPlaceholderMode", false);
            view.putString("ArgInitialCategory", CollectionsFeedGridCellView.access$000(CollectionsFeedGridCellView.this).getInitialCategory());
            view.putSerializable("ArgCategories", CollectionsFeedGridCellView.access$000(CollectionsFeedGridCellView.this).getCategories());
            view.putBoolean("ArgNotTopLevelMenuItem", true);
            view.putString("ArgTitle", CollectionsFeedGridCellView.access$000(CollectionsFeedGridCellView.this).getTitle());
            view.putBoolean("ArgFeaturedProductCollection", true);
            FilterFeedFragment filterfeedfragment = new FilterFeedFragment();
            filterfeedfragment.setArguments(view);
            CollectionsFeedGridCellView.access$200(CollectionsFeedGridCellView.this).post(filterfeedfragment. new CollectionsFeedGridCellView._cls1._cls1());
        }

            
            {
                this$0 = CollectionsFeedGridCellView.this;
                super();
            }
    }

}
