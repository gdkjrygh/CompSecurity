// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.wishes;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.wishes:
//            ProfileWishesAdapter

public class ProfileWishesFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener
{

    public static final String ARG_SET_ID = "ArgSetId";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private String bucketToShow;
    private ArrayList buckets;
    private String dataStateStoreKey;
    private ProfileWishesAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private TextView noItemsText;
    private View noItemsView;
    private WishUser user;

    public ProfileWishesFragment()
    {
    }

    private void extractBuckets()
    {
        buckets.clear();
        buckets.addAll(user.getProductBuckets());
    }

    private void hideAllUiElements()
    {
        listView.setVisibility(8);
        noItemsView.setVisibility(8);
    }

    private void refreshBuckets()
    {
        extractBuckets();
        listAdapter.notifyDataSetChanged();
        refreshViewState();
    }

    private void refreshViewState()
    {
label0:
        {
label1:
            {
                hideAllUiElements();
                if (loadingComplete)
                {
                    if (buckets.size() != 0)
                    {
                        break label0;
                    }
                    noItemsView.setVisibility(0);
                    if (!user.isLoggedInUser())
                    {
                        break label1;
                    }
                    noItemsText.setText(getActivity().getString(0x7f0601b5));
                }
                return;
            }
            noItemsText.setText(String.format(getActivity().getString(0x7f0601b4), new Object[] {
                user.getShortName()
            }));
            return;
        }
        listView.setVisibility(0);
    }

    private void showWishlistWithSetId(String s)
    {
        if (s != null && buckets != null && buckets.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i;
        obj = null;
        i = 0;
_L4:
        WishUserProductBucket wishuserproductbucket;
        wishuserproductbucket = obj;
        if (i >= buckets.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        wishuserproductbucket = (WishUserProductBucket)buckets.get(i);
        if (wishuserproductbucket.getSetId() == null || !wishuserproductbucket.getSetId().equals(s))
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (wishuserproductbucket == null || !wishuserproductbucket.isModifiable() && wishuserproductbucket.getProductCount() == 0) goto _L1; else goto _L3
_L3:
        s = new ProductFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgDataValue", wishuserproductbucket.getSetId());
        bundle.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Set.ordinal());
        bundle.putString("ArgDataTitle", wishuserproductbucket.getName());
        bundle.putSerializable("ArgBucket", wishuserproductbucket);
        s.setArguments(bundle);
        ((RootActivity)getActivity()).setContentFragment(s, false);
        return;
        i++;
          goto _L4
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.ProfileWishes;
    }

    public int getLayoutResourceId()
    {
        return 0x7f030092;
    }

    public void handleBucketClick(WishUserProductBucket wishuserproductbucket)
    {
        if (!wishuserproductbucket.isModifiable() && wishuserproductbucket.getProductCount() == 0)
        {
            return;
        } else
        {
            (new LogService()).requestService("1383", null, null, null);
            ProductFeedFragment productfeedfragment = new ProductFeedFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ArgDataValue", wishuserproductbucket.getSetId());
            bundle.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Set.ordinal());
            bundle.putString("ArgDataTitle", wishuserproductbucket.getName());
            bundle.putSerializable("ArgBucket", wishuserproductbucket);
            productfeedfragment.setArguments(bundle);
            ((RootActivity)getActivity()).setContentFragment(productfeedfragment, false);
            return;
        }
    }

    public void handleResume()
    {
        super.handleResume();
        if (user != null && user.isLoggedInUser())
        {
            WishUser wishuser = LoggedInUser.getInstance().getCurrentUser();
            if (wishuser != null && wishuser.getFetchTime().after(user.getFetchTime()))
            {
                user = wishuser;
                refreshBuckets();
            }
        }
        refreshViewState();
        if (listAdapter != null)
        {
            listAdapter.resumeCacheWarming();
        }
    }

    public void initializeUi(View view)
    {
        hideNavigationBar();
        noItemsView = view.findViewById(0x7f0d02cb);
        noItemsText = (TextView)view.findViewById(0x7f0d02cc);
        listView = (ListView)view.findViewById(0x7f0d02ca);
        view = new LinearLayout(getActivity());
        view.setOrientation(0);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics())));
        listView.addHeaderView(view);
        listAdapter = new ProfileWishesAdapter(getActivity(), buckets, listView, this);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
        listView.setFadingEdgeLength(0);
        hideAllUiElements();
    }

    public void loadingComplete(WishUser wishuser)
    {
        if (loadingComplete)
        {
            return;
        }
        loadingComplete = true;
        user = wishuser;
        if (user.isLoggedInUser())
        {
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketDelete, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUpdated, this);
        }
        extractBuckets();
        if (bucketToShow != null)
        {
            showWishlistWithSetId(bucketToShow);
            bucketToShow = null;
        }
        listAdapter.notifyDataSetChanged();
        refreshViewState();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bucketToShow = getArguments().getString("ArgSetId");
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (user != null && bundle.getString("UserId").equals(user.getUserId()))
        {
            postDelayed(new Runnable() {

                final ProfileWishesFragment this$0;

                public void run()
                {
                    queueVisibleTask(new Runnable() {

                        final _cls1 this$1;

                        public void run()
                        {
                            refreshBuckets();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }

            
            {
                this$0 = ProfileWishesFragment.this;
                super();
            }
            }, 0L);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (listAdapter != null)
        {
            listAdapter.pauseCacheWarming();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(user, dataStateStoreKey);
            bundle.putString("StoredStateData", dataStateStoreKey);
        }
    }

    public void refresh()
    {
        loadingComplete = false;
        user = null;
        buckets.clear();
    }

    protected void releaseImages()
    {
        if (listAdapter != null)
        {
            listAdapter.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (listAdapter != null)
        {
            listAdapter.restoreImages();
        }
    }

    public void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            user = (WishUser)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            boolean flag;
            if (user != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loadingComplete = flag;
        }
        if (!loadingComplete)
        {
            buckets = new ArrayList();
            loadingComplete = false;
            return;
        }
        if (user.isLoggedInUser())
        {
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketDelete, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUpdated, this);
        }
        buckets = new ArrayList();
        extractBuckets();
    }

    public boolean useCanvasBackground()
    {
        return true;
    }

}
