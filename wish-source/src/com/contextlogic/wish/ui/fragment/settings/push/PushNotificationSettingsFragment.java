// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ListView;
import com.contextlogic.wish.api.data.WishPushPreference;
import com.contextlogic.wish.api.service.GetPushPreferencesService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.push:
//            PushNotificationSettingsAdapter

public class PushNotificationSettingsFragment extends BaseContentFragment
{

    private static final String STORED_STATE_DATA = "StoredStateData";
    private String dataStateStoreKey;
    private View errorView;
    private GetPushPreferencesService getPushPreferencesService;
    private PushNotificationSettingsAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private View loadingView;
    private View noItemsView;
    private ArrayList pushPreferences;

    public PushNotificationSettingsFragment()
    {
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601b8));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist)
    {
        loadingComplete = true;
        WishPushPreference wishpushpreference;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); pushPreferences.add(wishpushpreference))
        {
            wishpushpreference = (WishPushPreference)arraylist.next();
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

    private void loadPreferences()
    {
        loadingErrored = false;
        getPushPreferencesService.requestService(new com.contextlogic.wish.api.service.GetPushPreferencesService.SuccessCallback() {

            final PushNotificationSettingsFragment this$0;

            public void onServiceSucceeded(ArrayList arraylist)
            {
                postDelayed(arraylist. new Runnable() {

                    final _cls1 this$1;
                    final ArrayList val$preferences;

                    public void run()
                    {
                        handleLoadingSuccess(preferences);
                    }

            
            {
                this$1 = final__pcls1;
                preferences = ArrayList.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = PushNotificationSettingsFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final PushNotificationSettingsFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls2 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = PushNotificationSettingsFragment.this;
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
            if (loadingComplete && pushPreferences.size() == 0)
            {
                noItemsView.setVisibility(0);
                return;
            }
            if (loadingComplete)
            {
                listView.setVisibility(0);
                return;
            }
            if (getPushPreferencesService.isPending())
            {
                loadingView.setVisibility(0);
                return;
            }
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.PushNotificationSettings;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030095;
    }

    public void handleResume()
    {
        super.handleResume();
        if (!loadingComplete)
        {
            loadPreferences();
        }
        refreshViewState();
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060356));
        listView = (ListView)view.findViewById(0x7f0d02d7);
        loadingView = view.findViewById(0x7f0d02d8);
        noItemsView = view.findViewById(0x7f0d02d9);
        errorView = view.findViewById(0x7f0d02da);
        listAdapter = new PushNotificationSettingsAdapter(getActivity(), pushPreferences);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPushPreferencesService = new GetPushPreferencesService();
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public void onPause()
    {
        super.onPause();
        getPushPreferencesService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && pushPreferences.size() > 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(pushPreferences, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
        }
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            pushPreferences = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            boolean flag;
            if (pushPreferences != null)
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
            pushPreferences = new ArrayList();
            loadingComplete = false;
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }


}
