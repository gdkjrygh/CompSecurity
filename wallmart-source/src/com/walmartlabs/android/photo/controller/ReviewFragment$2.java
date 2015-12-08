// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.walmartlabs.android.photo.view.order.OrderItemsAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ReviewFragment, EditConfigurationFragment

class this._cls0
    implements com.walmartlabs.ui.recycler..OnItemClickListener
{

    final ReviewFragment this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = EditConfigurationFragment.newInstance(getOrder(), ReviewFragment.access$000(ReviewFragment.this).getItem(i));
        getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.vity_open_enter, com.walmartlabs.android.photo.vity_open_exit, com.walmartlabs.android.photo.vity_close_enter, com.walmartlabs.android.photo.vity_close_exit).replace(com.walmartlabs.android.photo.e, basicviewholder, com/walmartlabs/android/photo/controller/EditConfigurationFragment.getName()).addToBackStack("edit_conf").commit();
    }

    Fragment()
    {
        this$0 = ReviewFragment.this;
        super();
    }
}
