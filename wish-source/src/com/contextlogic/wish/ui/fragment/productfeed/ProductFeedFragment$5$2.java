// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.service.HideProductService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.productIds
    implements android.content.istener
{

    final val.productIds this$1;
    final ArrayList val$productIds;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        trackClick(com.contextlogic.wish.analytics.Product);
        ProductFeedFragment.access$000(_fld0).setEditModeEnabled(false);
        ProductFeedFragment.access$100(_fld0).setVisibility(8);
        ProductFeedFragment.access$200(_fld0).clear();
        String s;
        for (dialoginterface = val$productIds.iterator(); dialoginterface.hasNext(); (new HideProductService()).requestService(s, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

        final ProductFeedFragment._cls5._cls2 this$2;

        public void onServiceSucceeded()
        {
            trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
        }

            
            {
                this$2 = ProductFeedFragment._cls5._cls2.this;
                super();
            }
    }, null))
        {
            s = (String)dialoginterface.next();
            ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
        }

        PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, val$productIds.size()));
        if (ProductFeedFragment.access$400(_fld0) != null)
        {
            ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(ProductFeedFragment.access$400(_fld0), val$productIds);
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$productIds = ArrayList.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$5

/* anonymous class */
    class ProductFeedFragment._cls5
        implements android.view.View.OnClickListener
    {

        final ProductFeedFragment this$0;

        public void onClick(View view)
        {
            view = ProductFeedFragment.access$300(ProductFeedFragment.this);
            if (view.size() > 0)
            {
                AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
                alertdialog.setTitle(getActivity().getString(0x7f060073));
                alertdialog.setMessage(WishApplication.getAppInstance().getQuantityString(0x7f070001, view.size()));
                alertdialog.setButton(getActivity().getString(0x7f0602d8), new ProductFeedFragment._cls5._cls1());
                alertdialog.setButton2(getActivity().getString(0x7f060488), view. new ProductFeedFragment._cls5._cls2());
                alertdialog.show();
            }
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$5$1

/* anonymous class */
        class ProductFeedFragment._cls5._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final ProductFeedFragment._cls5 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

                    
                    {
                        this$1 = ProductFeedFragment._cls5.this;
                        super();
                    }
        }

    }

}
