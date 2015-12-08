// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.HideProductService;
import com.contextlogic.wish.api.service.MoveToBucketService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.fragment.menu.wishlist.WishlistMenuFragment;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment

class this._cls0
    implements com.contextlogic.wish.ui.fragment.menu.wishlist.ack
{

    final TabbedProductDetailsFragment this$0;

    public void onBucketEditCancelled()
    {
        clearOverlay();
    }

    public void onBucketEdited(ArrayList arraylist, String s, String s1)
    {
        Object obj = (RootActivity)getActivity();
        if (!TabletUtil.isTablet(getActivity()) && ((RootActivity) (obj)).hasRightMenu()) goto _L2; else goto _L1
_L1:
        clearOverlay();
_L4:
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s3 = (String)((Iterator) (obj)).next();
            if (getLoadedProduct() != null && s3.equals(getLoadedProduct().getProductId()) && TabbedProductDetailsFragment.access$1200(TabbedProductDetailsFragment.this) != null && s1 != null && s1.equals(TabbedProductDetailsFragment.access$1200(TabbedProductDetailsFragment.this).getBucketId()))
            {
                (new ArrayList()).add(s3);
                ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(TabbedProductDetailsFragment.access$1200(TabbedProductDetailsFragment.this), arraylist);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (obj != null)
        {
            ((RootActivity) (obj)).closeMenus();
        }
        if (true) goto _L4; else goto _L3
_L3:
        PopupAlertDialog.showSuccess(getActivity(), null, String.format(getActivity().getString(0x7f0602b5), new Object[] {
            s
        }));
        String s2;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); (new MoveToBucketService()).requestService(s2, s, s1, null, null))
        {
            s2 = (String)arraylist.next();
        }

        ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
        return;
    }

    public void onProductsRemoved(ArrayList arraylist)
    {
        Object obj = (RootActivity)getActivity();
        if (TabletUtil.isTablet(getActivity()) || !((RootActivity) (obj)).hasRightMenu())
        {
            clearOverlay();
        } else
        {
            ((RootActivity) (obj)).closeMenus();
        }
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            ApiDataChangeNotificationManager.getInstance().notifyListenersForProductUnwish(s);
            (new HideProductService()).requestService(s, new com.contextlogic.wish.api.service.HideProductService.SuccessCallback() {

                final TabbedProductDetailsFragment._cls13 this$1;

                public void onServiceSucceeded()
                {
                    trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.HideProduct, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
                }

            
            {
                this$1 = TabbedProductDetailsFragment._cls13.this;
                super();
            }
            }, null);
            if (getLoadedProduct() != null && s.equals(getLoadedProduct().getProductId()) && TabbedProductDetailsFragment.access$1200(TabbedProductDetailsFragment.this) != null)
            {
                ArrayList arraylist1 = new ArrayList();
                arraylist1.add(s);
                ApiDataChangeNotificationManager.getInstance().notifyListenersForBucketEdit(TabbedProductDetailsFragment.access$1200(TabbedProductDetailsFragment.this), arraylist1);
            }
        } while (true);
        PopupAlertDialog.showSuccess(getActivity(), null, WishApplication.getAppInstance().getQuantityString(0x7f070006, arraylist.size()));
        ((RootActivity)getActivity()).setRightMenuFragment(new WishlistMenuFragment());
    }

    _cls1.this._cls1()
    {
        this$0 = TabbedProductDetailsFragment.this;
        super();
    }
}
