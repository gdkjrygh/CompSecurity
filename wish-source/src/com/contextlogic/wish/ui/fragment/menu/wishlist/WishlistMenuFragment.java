// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.base.BaseMenuFragment;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlist:
//            WishlistMenuAdapter

public class WishlistMenuFragment extends BaseMenuFragment
    implements ApiDataChangeNotificationListener
{

    private View emptyView;
    private ListView listView;
    private ArrayList productBuckets;
    private WishlistMenuAdapter wishlistAdapter;

    public WishlistMenuFragment()
    {
    }

    private void extractProductBuckets()
    {
        productBuckets.clear();
        if (LoggedInUser.getInstance().getCurrentUser() == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = LoggedInUser.getInstance().getCurrentUser().getProductBuckets().iterator(); iterator.hasNext();)
        {
            WishUserProductBucket wishuserproductbucket = (WishUserProductBucket)iterator.next();
            if (wishuserproductbucket.getBucketId().equalsIgnoreCase("holiday_wishlist") || wishuserproductbucket.getBucketId().equalsIgnoreCase("birthday_wishlist"))
            {
                productBuckets.add(wishuserproductbucket);
            } else
            {
                arraylist.add(wishuserproductbucket);
            }
        }

        Collections.sort(arraylist, new Comparator() {

            final WishlistMenuFragment this$0;

            public int compare(WishUserProductBucket wishuserproductbucket1, WishUserProductBucket wishuserproductbucket2)
            {
                return wishuserproductbucket1.getName().compareToIgnoreCase(wishuserproductbucket2.getName());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((WishUserProductBucket)obj, (WishUserProductBucket)obj1);
            }

            
            {
                this$0 = WishlistMenuFragment.this;
                super();
            }
        });
        productBuckets.addAll(arraylist);
    }

    private void handleBucketClick(WishUserProductBucket wishuserproductbucket)
    {
        if (!wishuserproductbucket.isModifiable() && wishuserproductbucket.getProductCount() == 0)
        {
            return;
        } else
        {
            ProductFeedFragment productfeedfragment = new ProductFeedFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ArgDataValue", wishuserproductbucket.getSetId());
            bundle.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Set.ordinal());
            bundle.putString("ArgDataTitle", wishuserproductbucket.getName());
            bundle.putSerializable("ArgBucket", wishuserproductbucket);
            productfeedfragment.setArguments(bundle);
            wishuserproductbucket = (RootActivity)getActivity();
            wishuserproductbucket.setContentFragment(productfeedfragment, false);
            wishuserproductbucket.closeMenus();
            return;
        }
    }

    private void refreshViewState()
    {
        if (productBuckets == null || productBuckets.size() == 0)
        {
            emptyView.setVisibility(0);
            listView.setVisibility(8);
            return;
        } else
        {
            emptyView.setVisibility(8);
            listView.setVisibility(0);
            wishlistAdapter.notifyDataSetChanged();
            return;
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.WishlistMenu;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f0300bb;
    }

    public void handleResume()
    {
        super.handleResume();
        refreshViewState();
    }

    protected void initializeUi(View view)
    {
        emptyView = view.findViewById(0x7f0d03fa);
        listView = (ListView)view.findViewById(0x7f0d03f9);
        wishlistAdapter = new WishlistMenuAdapter(getActivity(), productBuckets, listView);
        listView.setAdapter(wishlistAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final WishlistMenuFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                handleBucketClick((WishUserProductBucket)productBuckets.get(i));
            }

            
            {
                this$0 = WishlistMenuFragment.this;
                super();
            }
        });
        listView.setFadingEdgeLength(0);
    }

    public boolean onBackPressed()
    {
        ((RootActivity)getActivity()).closeMenus();
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        productBuckets = new ArrayList();
        extractProductBuckets();
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketDelete, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUpdated, this);
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        extractProductBuckets();
        refreshViewState();
    }

    protected void releaseImages()
    {
        if (wishlistAdapter != null)
        {
            wishlistAdapter.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (wishlistAdapter != null)
        {
            wishlistAdapter.restoreImages();
        }
    }

    protected boolean shouldTrackImpression()
    {
        return false;
    }


}
