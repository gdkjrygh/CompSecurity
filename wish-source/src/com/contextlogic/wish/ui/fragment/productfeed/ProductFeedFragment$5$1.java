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

class this._cls1
    implements android.content.istener
{

    final this._cls1 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$5

/* anonymous class */
    class ProductFeedFragment._cls5
        implements android.view.View.OnClickListener
    {

        final ProductFeedFragment this$0;

        public void onClick(final View productIds)
        {
            productIds = ProductFeedFragment.access$300(ProductFeedFragment.this);
            if (productIds.size() > 0)
            {
                AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
                alertdialog.setTitle(getActivity().getString(0x7f060073));
                alertdialog.setMessage(WishApplication.getAppInstance().getQuantityString(0x7f070001, productIds.size()));
                alertdialog.setButton(getActivity().getString(0x7f0602d8), new ProductFeedFragment._cls5._cls1());
                alertdialog.setButton2(getActivity().getString(0x7f060488), new ProductFeedFragment._cls5._cls2());
                alertdialog.show();
            }
        }

            
            {
                this$0 = ProductFeedFragment.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$5$2

/* anonymous class */
        class ProductFeedFragment._cls5._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final ProductFeedFragment._cls5 this$1;
            final ArrayList val$productIds;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct);
                ProductFeedFragment.access$000(this$0).setEditModeEnabled(false);
                ProductFeedFragment.access$100(this$0).setVisibility(8);
                ProductFeedFragment.access$200(this$0).clear();
                String s;
                for (dialoginterface = productIds.iterator(); dialoginterface.hasNext(); (new HideProductService()).requestService(s, new ProductFeedFragment._cls5._cls2._cls1(), null))
                {
                    s = (String)dialoginterface.next();
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
                }

                PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, productIds.size()));
                if (ProductFeedFragment.access$400(this$0) != null)
                {
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(ProductFeedFragment.access$400(this$0), productIds);
                }
            }

                    
                    {
                        this$1 = ProductFeedFragment._cls5.this;
                        productIds = arraylist;
                        super();
                    }
        }


        // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$5$2$1

/* anonymous class */
        class ProductFeedFragment._cls5._cls2._cls1
            implements com.contextlogic.wish.api.service.HideProductService.SuccessCallback
        {

            final ProductFeedFragment._cls5._cls2 this$2;

            public void onServiceSucceeded()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            }

                    
                    {
                        this$2 = ProductFeedFragment._cls5._cls2.this;
                        super();
                    }
        }

    }

}
