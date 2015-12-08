// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCrossPromoBanner;
import com.contextlogic.wish.api.service.CrossPromoLogService;
import com.contextlogic.wish.api.service.GetAppListService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.apps:
//            AppListAdapter

public class AppListFragment extends BaseContentFragment
{

    private static final String STORED_STATE_DATA = "StoredStateData";
    private ArrayList apps;
    private String dataStateStoreKey;
    private View errorView;
    private GetAppListService getAppListService;
    private AppListAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private View loadingView;
    private View noItemsView;

    public AppListFragment()
    {
    }

    private void handleItemClick(int i)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            WishCrossPromoBanner wishcrosspromobanner = (WishCrossPromoBanner)apps.get(i);
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_APP_LIST_ITEM);
            CrossPromoLogService crosspromologservice = new CrossPromoLogService();
            showFragmentLoadingSpinner();
            final ApplicationDeepLinkConfig deepLinkConfig = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(wishcrosspromobanner.getAction()));
            crosspromologservice.requestService(wishcrosspromobanner.getPromoId(), null, "app_list", new com.contextlogic.wish.api.service.CrossPromoLogService.SuccessCallback() {

                final AppListFragment this$0;
                final ApplicationDeepLinkConfig val$deepLinkConfig;

                public void onServiceSucceeded()
                {
                    hideFragmentLoadingSpinner();
                    if (deepLinkConfig != null)
                    {
                        RootActivity rootactivity = (RootActivity)getActivity();
                        if (rootactivity != null)
                        {
                            rootactivity.processDeepLink(deepLinkConfig, false);
                        }
                    }
                }

            
            {
                this$0 = AppListFragment.this;
                deepLinkConfig = applicationdeeplinkconfig;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final AppListFragment this$0;
                final ApplicationDeepLinkConfig val$deepLinkConfig;

                public void onServiceFailed()
                {
                    hideFragmentLoadingSpinner();
                    if (deepLinkConfig != null)
                    {
                        RootActivity rootactivity = (RootActivity)getActivity();
                        if (rootactivity != null)
                        {
                            rootactivity.processDeepLink(deepLinkConfig, false);
                        }
                    }
                }

            
            {
                this$0 = AppListFragment.this;
                deepLinkConfig = applicationdeeplinkconfig;
                super();
            }
            });
            return;
        }
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f060171));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist)
    {
        loadingComplete = true;
        WishCrossPromoBanner wishcrosspromobanner;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); apps.add(wishcrosspromobanner))
        {
            wishcrosspromobanner = (WishCrossPromoBanner)arraylist.next();
        }

        listAdapter.notifyDataSetChanged();
        refreshViewState();
    }

    private void hideAllUiElements()
    {
        listView.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadApps()
    {
        loadingErrored = false;
        getAppListService.requestService(new com.contextlogic.wish.api.service.GetAppListService.SuccessCallback() {

            final AppListFragment this$0;

            public void onServiceSucceeded(ArrayList arraylist)
            {
                postDelayed(arraylist. new Runnable() {

                    final _cls2 this$1;
                    final ArrayList val$apps;

                    public void run()
                    {
                        handleLoadingSuccess(apps);
                    }

            
            {
                this$1 = final__pcls2;
                apps = ArrayList.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = AppListFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final AppListFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls3 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = AppListFragment.this;
                super();
            }
        });
        refreshViewState();
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (loadingErrored)
        {
            errorView.setVisibility(0);
        } else
        {
            if (loadingComplete && apps.size() == 0)
            {
                noItemsView.setVisibility(0);
                return;
            }
            if (loadingComplete)
            {
                listView.setVisibility(0);
                return;
            }
            if (getAppListService.isPending())
            {
                loadingView.setVisibility(0);
                return;
            }
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.AppList;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03003d;
    }

    public void handleResume()
    {
        super.handleResume();
        if (!loadingComplete)
        {
            loadApps();
        }
        refreshViewState();
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f0603da));
        listView = (ListView)view.findViewById(0x7f0d0163);
        loadingView = view.findViewById(0x7f0d0164);
        noItemsView = view.findViewById(0x7f0d0165);
        errorView = view.findViewById(0x7f0d0166);
        listAdapter = new AppListAdapter(getActivity(), apps, listView);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AppListFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                handleItemClick(i);
            }

            
            {
                this$0 = AppListFragment.this;
                super();
            }
        });
        listAdapter.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getAppListService = new GetAppListService();
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public void onPause()
    {
        super.onPause();
        getAppListService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && apps.size() > 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(apps, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
        }
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            apps = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            boolean flag;
            if (apps != null)
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
            apps = new ArrayList();
            loadingComplete = false;
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }



}
