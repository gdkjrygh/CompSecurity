// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Address;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.search.SearchData;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsEvent;
import com.walmartlabs.analytics.AnalyticsPageView;
import com.walmartlabs.utils.LocationUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreFinderConfigurator, FilterManager, StoreManager, StoreMapController, 
//            LayoutConfig, StoreLocationManager, StoreListAdapter, StoreListController, 
//            StoreSearchManager, StoreService, StoreData, StorePickerListener

public class StoreViewPresenter extends Presenter
{
    public static interface StoreFilterListener
    {

        public abstract void onFilterDialogDisplayed();
    }


    public static final int ACTIVITY_RESULT_LOCATION_SETTINGS = 10;
    private static final int ANIMATION_DURATION = 200;
    private static final double CENTER_THRESHOLD = 0.5D;
    private static final int COULD_NOT_FIND_STORES_DIALOG = 7;
    public static final int DIALOG_COULD_NOT_FIND_LOCATION = 101;
    public static final int DIALOG_ERROR_NO_NETWORK = 600;
    public static final int DIALOG_LOCATION_FIX_TIMED_OUT_USE_SEARCH = 102;
    public static final int DIALOG_LOCATION_SERVICE_FAILED = 100;
    private static final int FILTER_DIALOG = 1;
    private static final int FILTER_NOT_APPLIED_DIALOG = 4;
    private static final int FINDING_MY_LOCATION_DIALOG = 2;
    private static final int NO_STORES_WITH_SHIPPING_OPTIONS_DIALOG = 11;
    private static final int REQUEST_CODE_LOCATION_RESOLUTION = 1;
    private static final int SEARCHING_DIALOG = 3;
    private static final int SEARCHING_LOCATION_DIALOG = 5;
    public static final String TAG = com/walmartlabs/storelocator/StoreViewPresenter.getSimpleName();
    private static final int UNKNOWN_ERROR_DIALOG = 9;
    private static final int sErrorDialogs[] = {
        9, 100, 101, 102, 600
    };
    private final Activity mActivity;
    private StoreFinderController.ClosestStoreFoundListener mClosestStoreFoundListener;
    private LatLng mCurrentMapCenter;
    private boolean mDestroyed;
    private final FilterManager mFilterManager;
    private Animation mInAnimation;
    private boolean mIsAnimating;
    private boolean mIsPushed;
    private final String mItemRestrictions[];
    private LayoutConfig mLayoutConfig;
    private StoreLocationManager mLocationManager;
    private GoogleMap mMap;
    private MapView mMapView;
    private String mNoStoresText;
    private Animation mOutAnimation;
    private int mPendingDialog;
    private boolean mPickerMode;
    private boolean mRetryOnRestart;
    private StoreSearchManager mSearchManager;
    private String mSearchString;
    private StoreFilterListener mStoreFilterListener;
    private final StoreFinderConfigurator mStoreFinderConfigurator;
    private ListView mStoreList;
    private View mStoreListContainer;
    private StoreListController mStoreListPresenter;
    private StoreManager mStoreManager;
    private StoreMapController mStoreMapController;
    private StorePickerListener mStorePickerListener;
    private View mStoreViewContainer;
    private String mTitle;

    public StoreViewPresenter(Activity activity, FilterManager filtermanager, StoreManager storemanager, String as[], StoreFinderConfigurator storefinderconfigurator)
    {
        mIsAnimating = false;
        mActivity = activity;
        mTitle = "Stores";
        mItemRestrictions = as;
        mFilterManager = filtermanager;
        mStoreManager = storemanager;
        mStoreFinderConfigurator = storefinderconfigurator;
        mLayoutConfig = storefinderconfigurator.getLayoutConfig();
    }

    private Dialog buildFilterDialog()
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
        builder.setTitle(com.walmart.lib.R.string.store_finder_dialog_filter_title);
        builder.setMultiChoiceItems(mFilterManager.getServicesNames(), mFilterManager.getServicesChecks(), new android.content.DialogInterface.OnMultiChoiceClickListener() {

            final StoreViewPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int i, boolean flag)
            {
                mFilterManager.setServiceCheck(i, flag);
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        });
        builder.setPositiveButton(com.walmart.lib.R.string.apply_button, new android.content.DialogInterface.OnClickListener() {

            final StoreViewPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mFilterManager.stopEditingAndSave();
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        }).setNegativeButton(com.walmart.lib.R.string.cancel_button, new android.content.DialogInterface.OnClickListener() {

            final StoreViewPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final StoreViewPresenter this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                mFilterManager.cancelEditing();
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        });
        mFilterManager.startEditing();
        return builder.create();
    }

    private void flip(boolean flag)
    {
        final Animation anim;
        boolean flag1;
label0:
        {
            flag1 = true;
            if (!mIsAnimating)
            {
                if (mStoreListContainer.getVisibility() != 0)
                {
                    anim = mInAnimation;
                    mStoreListContainer.setVisibility(0);
                } else
                {
                    anim = mOutAnimation;
                    mMapView.setVisibility(0);
                }
                if (!flag)
                {
                    break label0;
                }
                mIsAnimating = true;
                anim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final StoreViewPresenter this$0;
                    final Animation val$anim;

                    public void onAnimationEnd(Animation animation)
                    {
                        animation = StoreViewPresenter.this;
                        boolean flag2;
                        if (anim == mInAnimation)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        animation.updateVisibility(flag2);
                        mIsAnimating = false;
                        onPageView();
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$0 = StoreViewPresenter.this;
                anim = animation;
                super();
            }
                });
                mStoreListContainer.startAnimation(anim);
            }
            return;
        }
        if (anim == mInAnimation)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        updateVisibility(flag);
        onPageView();
    }

    private StoreMapController getStoreMapControllerInstance(Class class1, MapView mapview, StoreManager storemanager)
    {
        try
        {
            class1 = (StoreMapController)class1.getConstructor(new Class[] {
                com/google/android/gms/maps/MapView, com/walmartlabs/storelocator/StoreManager, android/app/Activity
            }).newInstance(new Object[] {
                mapview, storemanager, mActivity
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return null;
        }
        return class1;
    }

    private void init(boolean flag)
    {
        mPickerMode = flag;
        Object obj;
        if (mPickerMode)
        {
            mStoreViewContainer = mActivity.getLayoutInflater().inflate(mLayoutConfig.getIdForLayoutEnum(LayoutConfig.LayoutEnum.LIST_ONLY_LAYOUT), null);
        } else
        {
            mStoreViewContainer = mActivity.getLayoutInflater().inflate(mLayoutConfig.getIdForLayoutEnum(LayoutConfig.LayoutEnum.MAP_AND_LIST_LAYOUT), null);
        }
        mLocationManager = StoreLocationManager.getInstance(mActivity);
        mStoreListContainer = mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LIST_VIEW));
        if (mStoreListContainer == null)
        {
            mStoreListContainer = mStoreViewContainer;
        }
        if (mStoreListContainer instanceof ListView)
        {
            obj = mStoreListContainer;
        } else
        {
            obj = mStoreListContainer.findViewWithTag("list");
        }
        mStoreList = (ListView)(ListView)obj;
        mStoreList.setVerticalFadingEdgeEnabled(true);
        mStoreList.setCacheColorHint(0);
        if (mStoreList != mStoreListContainer || mPickerMode)
        {
            int i = mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.EMPTY_LIST_VIEW);
            if (i != -1)
            {
                mStoreList.setEmptyView(ViewUtil.findViewById(mStoreViewContainer, i));
            }
        }
        if (!mPickerMode)
        {
            mMapView = (MapView)mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.MAP_VIEW));
            mStoreMapController = new StoreMapController(mMapView, mStoreManager, mStoreFinderConfigurator, mActivity);
            MapsInitializer.initialize(mActivity);
            initAnimations();
        }
        obj = new StoreListAdapter(mActivity, mStoreFinderConfigurator, mStoreManager, mItemRestrictions);
        ((StoreListAdapter) (obj)).setOnFailedToLoadStoresListener(new StoreListAdapter.OnFailedToLoadStoresListener() {

            final StoreViewPresenter this$0;

            public void onFailed(int j)
            {
                if (0x15f92 == j)
                {
                    showDialog(600);
                    return;
                } else
                {
                    showDialog(9);
                    return;
                }
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        });
        mStoreList.setAdapter(((android.widget.ListAdapter) (obj)));
        mStoreListPresenter = new StoreListController(mStoreList, ((StoreListAdapter) (obj)));
        wireListeners();
        toggleFilterActive(mFilterManager.isFilterActive());
        if (mPickerMode)
        {
            obj = mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.FILTER_BUTTON));
            if (obj != null)
            {
                ((View) (obj)).setVisibility(8);
            }
            mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LIST_BUTTON)).setVisibility(8);
        }
        initSearch();
    }

    private void initAnimations()
    {
        mInAnimation = AnimationUtils.loadAnimation(mActivity, com.walmart.lib.R.anim.slide_in_up);
        mOutAnimation = AnimationUtils.loadAnimation(mActivity, com.walmart.lib.R.anim.slide_out_down);
        mInAnimation.setDuration(200L);
        mOutAnimation.setDuration(200L);
    }

    private void initSearch()
    {
        if (mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_BAR_CONTAINER) >= 0)
        {
            mSearchManager = new StoreSearchManager(mActivity, (ViewGroup)mStoreViewContainer, mLayoutConfig);
            mSearchManager.enableAnimateOnFocus();
            mSearchManager.init(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_BAR_CONTAINER), mStoreFinderConfigurator.getCountryRestriction(), mStoreFinderConfigurator.getReferrer());
            mSearchManager.setOnSuggestionSelectedListener(new com.walmart.android.search.SearchManager.OnSearchExecutedListener() {

                final StoreViewPresenter this$0;

                public void onSearchExecuted(SearchData searchdata)
                {
                    executeLocationSearch(searchdata.getSearchText().toString());
                }

                public volatile void onSearchExecuted(Object obj)
                {
                    onSearchExecuted((SearchData)obj);
                }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
            });
            mStoreFinderConfigurator.onPrepareSearchBar(mSearchManager.getSearchBarView());
        }
    }

    private boolean isErrorDialog(int i)
    {
        boolean flag1 = false;
        int ai[] = sErrorDialogs;
        int k = ai.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    if (ai[j] != i)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private void loadNewStores(final LatLng location, final LatLng newCenter, final boolean moveMapToShowStoresAround, final boolean showClosestStore, boolean flag)
    {
        final boolean hasItemRestrictions;
        if (mItemRestrictions != null && mItemRestrictions.length > 0)
        {
            hasItemRestrictions = true;
        } else
        {
            hasItemRestrictions = false;
        }
        removeDialogs();
        if (mStoreListContainer.getVisibility() != 0)
        {
            if (flag)
            {
                showDialog(3);
            } else
            {
                showSearchStoresSpinner(true);
            }
        } else
        {
            showDialog(3);
            mStoreManager.clear();
        }
        mStoreListPresenter.onMapStoresLoadingStart();
        newCenter = new StoreService.GetStoresCallback() {

            final StoreViewPresenter this$0;
            final boolean val$hasItemRestrictions;
            final LatLng val$location;
            final boolean val$moveMapToShowStoresAround;
            final LatLng val$newCenter;
            final boolean val$showClosestStore;

            public void onFailure(int i)
            {
                if (mDestroyed)
                {
                    return;
                }
                mCurrentMapCenter = null;
                Log.w(StoreViewPresenter.TAG, "failed to load stores!");
                removeDialogs();
                if (i == 0x15f92)
                {
                    showDialog(600);
                    return;
                } else
                {
                    showDialog(9);
                    return;
                }
            }

            public void onStoresReceived(StoreData astoredata[])
            {
                if (mDestroyed)
                {
                    return;
                }
                removeDialogs();
                if (newCenter != null)
                {
                    mCurrentMapCenter = newCenter;
                }
                mStoreManager.setStores(astoredata);
                if (mStoreManager.size() == 0 && astoredata.length > 0)
                {
                    clearFilterAndShowDialog();
                    mStoreManager.setStores(astoredata);
                }
                if (!mPickerMode)
                {
                    mStoreMapController.reloadStoreData();
                    mStoreMapController.setLocation(location, moveMapToShowStoresAround);
                }
                mStoreListPresenter.setLocation(location);
                mStoreListPresenter.onMapStoresLoaded();
                if (mStoreManager.size() <= 0) goto _L2; else goto _L1
_L1:
                if (showClosestStore && !mPickerMode)
                {
                    openFlagForClosestStore();
                }
                astoredata = mStoreManager.getClosestStore();
                if (mClosestStoreFoundListener == null) goto _L4; else goto _L3
_L3:
                if (mSearchString == null) goto _L6; else goto _L5
_L5:
                mClosestStoreFoundListener.onClosestStoreFound(mSearchString, astoredata);
_L4:
                postStoreSearchEvent();
                return;
_L6:
                if (mCurrentMapCenter != null)
                {
                    mClosestStoreFoundListener.onClosestStoreFound(mCurrentMapCenter.latitude, mCurrentMapCenter.longitude, astoredata);
                }
                continue; /* Loop/switch isn't completed */
_L2:
                if (hasItemRestrictions)
                {
                    showDialog(11);
                } else
                {
                    showDialog(7);
                }
                if (true) goto _L4; else goto _L7
_L7:
            }

            
            {
                this$0 = StoreViewPresenter.this;
                newCenter = latlng;
                location = latlng1;
                moveMapToShowStoresAround = flag;
                showClosestStore = flag1;
                hasItemRestrictions = flag2;
                super();
            }
        };
        if (hasItemRestrictions)
        {
            StoreService.getStoreService().getStoresForItems(location.longitude, location.latitude, mItemRestrictions, 0, 50, newCenter);
            return;
        } else
        {
            mLocationManager.loadStores(location, 500, 0, 50, newCenter);
            return;
        }
    }

    private void openFlagForClosestStore()
    {
        StoreData storedata = mStoreManager.getClosestStore();
        if (storedata != null && !mPickerMode)
        {
            mStoreMapController.showFlagForStore(storedata);
        }
    }

    private void postStoreSearchEvent()
    {
        boolean flag;
        if (!mPickerMode)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Object obj = null;
            StoreData storedata = mStoreManager.getClosestStore();
            if (storedata != null)
            {
                obj = String.format("%.2f", new Object[] {
                    Double.valueOf(storedata.distanceFromSource)
                });
            }
            obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("storeLocator")).putString("searchTerm", mSearchString).putString("distanceFromStore", ((String) (obj)));
            MessageBus.getBus().post(obj);
        }
    }

    private void refreshLoadedStoreData()
    {
        if (!mPickerMode)
        {
            mStoreMapController.reloadStoreData();
        }
        mStoreListPresenter.refreshLoadedStoreData();
    }

    private void removeDialogs()
    {
        dismissDialog(2);
        dismissDialog(3);
        showSearchStoresSpinner(false);
        dismissDialog(5);
    }

    private boolean setMapLocation(LatLng latlng, boolean flag, boolean flag1, boolean flag2)
    {
        LatLng latlng1 = LocationUtils.getRoundedCoordinates(latlng, 0.5D, 0.5D);
        if (mCurrentMapCenter == null || !latlng1.equals(mCurrentMapCenter))
        {
            mCurrentMapCenter = latlng1;
            loadNewStores(latlng, latlng1, flag, flag1, flag2);
            return true;
        }
        if (!mPickerMode)
        {
            mStoreMapController.setLocation(latlng, flag);
            if (flag1)
            {
                openFlagForClosestStore();
            }
        }
        postStoreSearchEvent();
        return false;
    }

    private void setMapToUserLocation(LatLng latlng)
    {
        mStoreManager.setUserLocation(latlng);
        if (!mPickerMode)
        {
            mStoreMapController.setUserLocation(latlng);
        }
        if (!setMapLocation(latlng, true, true, true))
        {
            dismissDialog(2);
        }
    }

    private void setupMapIfNeeded()
    {
        if (mMap == null)
        {
            mMap = mMapView.getMap();
            mStoreMapController.init();
        }
    }

    private void showSearchStoresSpinner(boolean flag)
    {
        byte byte0 = 8;
        if (!mPickerMode && !mDestroyed && mMapView != null)
        {
            View view = null;
            int j = mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LOADING_STORES_MAP_SPINNER_VIEW);
            if (j != -1)
            {
                view = mStoreViewContainer.findViewById(j);
            }
            View view2 = view;
            if (view == null)
            {
                view2 = mMapView.findViewWithTag(LayoutConfig.ViewEnum.LOADING_STORES_MAP_SPINNER_VIEW);
            }
            if (view2 != null)
            {
                if (flag)
                {
                    byte0 = 0;
                }
                view2.setVisibility(byte0);
            } else
            if (flag)
            {
                View view1 = mActivity.getLayoutInflater().inflate(com.walmart.lib.R.layout.map_loading_stores, null);
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                int i = ViewUtil.dpToPixels(8, mActivity);
                layoutparams.topMargin = i;
                layoutparams.rightMargin = i;
                layoutparams.gravity = 53;
                view1.setLayoutParams(layoutparams);
                view1.setTag(LayoutConfig.ViewEnum.LOADING_STORES_MAP_SPINNER_VIEW);
                mMapView.addView(view1);
                return;
            }
        }
    }

    private void trackFilter()
    {
        Object obj = mFilterManager.getActiveFilters();
        if (obj != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(":"))
            {
                stringbuilder.append((String)((Iterator) (obj)).next());
            }

            if (stringbuilder.length() > 0)
            {
                stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            } else
            {
                stringbuilder.append("no_filter");
            }
            MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Apply Store Filter", stringbuilder.toString()));
        }
    }

    private void trackSearchError()
    {
        if (!mPickerMode)
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "StoreFinderError");
            MessageBus.getBus().post(builder);
        }
    }

    private void unWireListeners()
    {
        mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LOCATION_BUTTON)).setOnClickListener(null);
        if (!mPickerMode)
        {
            mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LIST_BUTTON)).setOnClickListener(null);
            View view = mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.FILTER_BUTTON));
            if (view != null)
            {
                view.setOnClickListener(null);
            }
        }
        mFilterManager.setListener(null);
    }

    private void updateVisibility(boolean flag)
    {
        View view = ViewUtil.findViewById(mStoreViewContainer, mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LIST_BUTTON));
        if (!flag) goto _L2; else goto _L1
_L1:
        mMapView.setVisibility(8);
        if (!(view instanceof ImageButton)) goto _L4; else goto _L3
_L3:
        ((ImageButton)view).setImageResource(mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.MAP_BUTTON_DRAWABLE));
_L5:
        MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Change Store View", "List View"));
        return;
_L4:
        if (view instanceof TextView)
        {
            ((TextView)view).setCompoundDrawablesWithIntrinsicBounds(mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.MAP_BUTTON_DRAWABLE), 0, 0, 0);
        }
        if (true) goto _L5; else goto _L2
_L2:
        mStoreListContainer.setVisibility(8);
        MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Change Store View", "Map View"));
        if (!(view instanceof ImageButton)) goto _L7; else goto _L6
_L6:
        ((ImageButton)view).setImageResource(mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.LIST_BUTTON_DRAWABLE));
_L9:
        MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Change Store View", "Map View"));
        return;
_L7:
        if (view instanceof TextView)
        {
            ((TextView)view).setCompoundDrawablesWithIntrinsicBounds(mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.LIST_BUTTON_DRAWABLE), 0, 0, 0);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void wireListeners()
    {
        mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LOCATION_BUTTON)).setOnClickListener(new android.view.View.OnClickListener() {

            final StoreViewPresenter this$0;

            public void onClick(View view1)
            {
                initLocation();
                MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Locate Store Method", "GPS"));
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        });
        if (!mPickerMode)
        {
            ViewUtil.findViewById(mStoreViewContainer, mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.LIST_BUTTON)).setOnClickListener(new android.view.View.OnClickListener() {

                final StoreViewPresenter this$0;

                public void onClick(View view1)
                {
                    flip(true);
                }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
            });
        }
        View view = mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.FILTER_BUTTON));
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final StoreViewPresenter this$0;

                public void onClick(View view1)
                {
                    launchFilterDialog();
                }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
            });
        }
        mFilterManager.setListener(new FilterManager.Listener() {

            final StoreViewPresenter this$0;

            public void onFilterSettingsUpdated()
            {
                int i;
                toggleFilterActive(mFilterManager.isFilterActive());
                i = mStoreManager.size();
                mStoreManager.updateFilter();
                if (mStoreManager.size() <= 0) goto _L2; else goto _L1
_L1:
                refreshLoadedStoreData();
                adjustZoomLevelToStores();
_L4:
                trackFilter();
                return;
_L2:
                if (i > 0)
                {
                    clearFilterAndShowDialog();
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        });
    }

    public void adjustZoomLevelToStores()
    {
        mStoreMapController.showLastLocationAndStoresAround();
    }

    void clearFilterAndShowDialog()
    {
        mFilterManager.clearAll();
        mStoreManager.updateFilter();
        toggleFilterActive(mFilterManager.isFilterActive());
        showDialog(4);
        refreshLoadedStoreData();
        MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Apply Store Filter", "Filter Not Applied Error"));
    }

    protected void dismissDialog(int i)
    {
        super.dismissDialog(i);
        mPendingDialog = 0;
    }

    public void executeLocationSearch(String s)
    {
        (new AsyncTask() {

            final StoreViewPresenter this$0;

            protected transient com.walmartlabs.utils.LocationUtils.AddressSearchResult doInBackground(String as[])
            {
                return LocationUtils.getAddress(mActivity, as[0]);
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((String[])aobj);
            }

            protected void onPostExecute(com.walmartlabs.utils.LocationUtils.AddressSearchResult addresssearchresult)
            {
                if (!isPopped())
                {
                    if (addresssearchresult.hasAddress())
                    {
                        addresssearchresult = addresssearchresult.getAddress();
                        addresssearchresult = new LatLng(addresssearchresult.getLatitude(), addresssearchresult.getLongitude());
                        if (!setMapLocation(addresssearchresult, true, false, true))
                        {
                            dismissDialog(2);
                            dismissDialog(5);
                            return;
                        }
                    } else
                    {
                        removeDialogs();
                        switch (addresssearchresult.getError())
                        {
                        default:
                            return;

                        case 1: // '\001'
                            showDialog(600);
                            return;

                        case 3: // '\003'
                            showDialog(101);
                            return;

                        case 2: // '\002'
                            showDialog(100);
                            return;
                        }
                    }
                }
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((com.walmartlabs.utils.LocationUtils.AddressSearchResult)obj);
            }

            protected void onPreExecute()
            {
                showDialog(5);
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        }).execute(new String[] {
            s
        });
        mSearchString = s;
    }

    public String getTitleText()
    {
        return mTitle;
    }

    public View getView()
    {
        return mStoreViewContainer;
    }

    public boolean handleIntent(Intent intent)
    {
        mActivity.setIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction()))
        {
            executeLocationSearch(intent.getStringExtra("query"));
            return true;
        } else
        {
            return false;
        }
    }

    public void initLocation()
    {
        StoreLocationManager.LocationCallback locationcallback = new StoreLocationManager.LocationCallback() {

            final StoreViewPresenter this$0;

            public void onError(int i)
            {
                switch (i)
                {
                default:
                    mStoreListPresenter.hideLoadingIndicator();
                    if (mStorePickerListener != null)
                    {
                        mStorePickerListener.onCancelled();
                    }
                    return;

                case 3: // '\003'
                    removeDialogs();
                    showDialog(102);
                    return;

                case 2: // '\002'
                    mRetryOnRestart = true;
                    return;
                }
            }

            public void onError(ConnectionResult connectionresult)
            {
                if (mDestroyed)
                {
                    break MISSING_BLOCK_LABEL_36;
                }
                removeDialogs();
                if (!connectionresult.hasResolution())
                {
                    break MISSING_BLOCK_LABEL_43;
                }
                connectionresult.startResolutionForResult(mActivity, 1);
_L1:
                return;
                connectionresult;
                connectionresult.printStackTrace();
                return;
                if (!isPopped() && isTop())
                {
                    connectionresult = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), mActivity, 1);
                    if (connectionresult != null)
                    {
                        connectionresult.show();
                    }
                    trackSearchError();
                    return;
                }
                  goto _L1
            }

            public void onFoundLocation(LatLng latlng, Location location)
            {
                if (!mDestroyed)
                {
                    setMapToUserLocation(latlng);
                    if (mSearchManager != null)
                    {
                        mSearchManager.setLocation(latlng);
                    }
                }
            }

            public void onStarted()
            {
                if (!TextUtils.isEmpty(mNoStoresText))
                {
                    ViewUtil.findViewById(mStoreViewContainer, mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.EMPTY_LIST_VIEW)).setVisibility(8);
                }
                showDialog(2);
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        };
        mLocationManager.requestLocationWithDialogs(mActivity, locationcallback);
        mSearchString = null;
    }

    public void initMapMode()
    {
        init(false);
    }

    public void initPickerMode()
    {
        init(true);
    }

    public boolean interceptBack()
    {
        if (mSearchManager != null && mSearchManager.onBackPressed())
        {
            return true;
        }
        if (mStoreListContainer.getVisibility() == 0 && !mPickerMode)
        {
            flip(true);
            return true;
        } else
        {
            return false;
        }
    }

    public void launchFilterDialog()
    {
        if (mStoreFilterListener != null)
        {
            mStoreFilterListener.onFilterDialogDisplayed();
        }
        showDialog(1, null);
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == -1)
            {
                initLocation();
                return;
            }
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mActivity);
            if (i == 0)
            {
                initLocation();
                return;
            }
            intent = GooglePlayServicesUtil.getErrorDialog(i, mActivity, 1);
            if (intent != null)
            {
                intent.show();
            }
            trackSearchError();
            return;
        }
        if (i == 1000)
        {
            mSearchManager.onVoiceSearchResult(j, intent);
            return;
        } else
        {
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mLocationManager.pruneStores();
    }

    public void onCreate(Bundle bundle)
    {
        if (mMapView != null)
        {
            mMapView.onCreate(bundle);
            setupMapIfNeeded();
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = null;
        i;
        JVM INSTR lookupswitch 11: default 100
    //                   1: 182
    //                   2: 147
    //                   3: 190
    //                   4: 227
    //                   5: 280
    //                   7: 315
    //                   11: 361
    //                   100: 407
    //                   101: 442
    //                   102: 477
    //                   600: 519;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        com.walmart.android.ui.dialog.AlertDialog alertdialog = ((com.walmart.android.ui.dialog.AlertDialog) (obj));
        if (obj == null)
        {
            alertdialog = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage("Unknown error. Please try again later").setCancelable(true).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {

                final StoreViewPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
            }).create();
        }
        return alertdialog;
_L3:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(com.walmart.lib.R.string.store_finder_dialog_find_location));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(true);
        continue; /* Loop/switch isn't completed */
_L2:
        obj = buildFilterDialog();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(mLayoutConfig.getIdForStringEnum(LayoutConfig.StringEnum.SEARCHING_PROGRESS)));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
        ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).setMessage(mLayoutConfig.getIdForStringEnum(LayoutConfig.StringEnum.NO_FILTERED_RESULT)).setCancelable(true).setPositiveButton(com.walmart.lib.R.string.ok, new android.content.DialogInterface.OnClickListener() {

            final StoreViewPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
            }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
        });
        obj = ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).create();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(com.walmart.lib.R.string.store_finder_dialog_searching_location));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(true);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
        ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).setMessage(mLayoutConfig.getIdForStringEnum(LayoutConfig.StringEnum.NO_LOCAL_RESULT)).setCancelable(true).setPositiveButton(com.walmart.lib.R.string.ok, null);
        obj = ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).create();
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
        ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).setMessage(mLayoutConfig.getIdForStringEnum(LayoutConfig.StringEnum.NO_CLOSE_SHIPPING_LOCATIONS)).setCancelable(true).setPositiveButton(com.walmart.lib.R.string.ok, null);
        obj = ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).create();
        continue; /* Loop/switch isn't completed */
_L9:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(com.walmart.lib.R.string.store_finder_dialog_location_service_failed).setCancelable(true).setPositiveButton(com.walmart.lib.R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L10:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(com.walmart.lib.R.string.store_finder_dialog_invalid_location).setCancelable(true).setPositiveButton(com.walmart.lib.R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L11:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(mLayoutConfig.getIdForStringEnum(LayoutConfig.StringEnum.NO_LOCATION)).setCancelable(true).setPositiveButton(com.walmart.lib.R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L12:
        obj = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
        ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).setMessage(mActivity.getString(com.walmart.lib.R.string.network_error_message)).setCancelable(true).setPositiveButton("Ok", null);
        obj = ((com.walmart.android.ui.CustomAlertDialog.Builder) (obj)).create();
        if (true) goto _L1; else goto _L13
_L13:
    }

    public void onDestroy()
    {
        unWireListeners();
        if (!mPickerMode)
        {
            mStoreMapController.cleanUp();
            mMapView.onDestroy();
        }
        ((ViewGroup)mStoreViewContainer.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.MAP_VIEW_CONTAINER))).removeAllViews();
        ((ViewGroup)mStoreViewContainer).removeAllViews();
        mStoreListPresenter.cleanUp();
        mStoreManager = null;
        mDestroyed = true;
    }

    protected void onLowMemory()
    {
        if (mMapView != null)
        {
            mMapView.onLowMemory();
        }
    }

    public void onNewIntentAsTop(Intent intent)
    {
        handleIntent(intent);
    }

    protected void onPageView()
    {
        if (!mPickerMode)
        {
            MessageBus.getBus().post(new AnalyticsPageView("Store Finder"));
        }
        Object obj;
        if (mStoreListContainer.getVisibility() == 0)
        {
            obj = "store list";
        } else
        {
            obj = "store map";
        }
        obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", ((String) (obj))).putString("section", "store").putString("subCategory", "store");
        MessageBus.getBus().post(obj);
    }

    protected void onPause()
    {
        if (mMapView != null)
        {
            mMapView.onPause();
            if (mMap != null)
            {
                mMap.setOnCameraChangeListener(null);
            }
        }
    }

    public void onPop()
    {
        super.onPop();
        mIsPushed = false;
    }

    public void onPushed()
    {
        super.onPushed();
        mIsPushed = true;
        if (mPendingDialog != 0)
        {
            showDialog(mPendingDialog);
            mPendingDialog = 0;
        }
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        if (mRetryOnRestart)
        {
            mRetryOnRestart = false;
            initLocation();
        }
    }

    protected void onResume()
    {
        if (mMapView != null)
        {
            mMapView.onResume();
            setupMapIfNeeded();
            if (mMap != null)
            {
                mMap.setOnCameraChangeListener(new com.google.android.gms.maps.GoogleMap.OnCameraChangeListener() {

                    final StoreViewPresenter this$0;

                    public void onCameraChange(CameraPosition cameraposition)
                    {
                        if (!mStoreMapController.isInCircle(cameraposition.target))
                        {
                            setMapLocation(cameraposition.target, false, false, false);
                        }
                    }

            
            {
                this$0 = StoreViewPresenter.this;
                super();
            }
                });
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (mMapView != null)
        {
            mMapView.onSaveInstanceState(bundle);
        }
    }

    public boolean onSearchRequested()
    {
        if (mSearchManager != null)
        {
            return mSearchManager.onSearchRequested();
        } else
        {
            return false;
        }
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        if (mSearchManager != null)
        {
            mSearchManager.finishSearch();
        }
    }

    public void reloadStoreData()
    {
        if (mPickerMode)
        {
            mStoreListPresenter.reloadStoreData();
            return;
        } else
        {
            mStoreMapController.reloadStoreData();
            mStoreListPresenter.reloadStoreData();
            return;
        }
    }

    public void setClosestStoreFoundListener(StoreFinderController.ClosestStoreFoundListener closeststorefoundlistener)
    {
        mClosestStoreFoundListener = closeststorefoundlistener;
    }

    public void setListSelector(int i)
    {
        mStoreList.setSelector(i);
    }

    public void setNoStoresText(String s)
    {
        ((TextView)ViewUtil.findViewById(mStoreViewContainer, mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.EMPTY_LIST_VIEW))).setText(s);
        mNoStoresText = s;
    }

    public void setStoreFilterListener(StoreFilterListener storefilterlistener)
    {
        mStoreFilterListener = storefilterlistener;
    }

    public void setStorePickerListener(StorePickerListener storepickerlistener)
    {
        mStorePickerListener = storepickerlistener;
        mStoreListPresenter.setStorePickerListener(mStorePickerListener);
        if (!mPickerMode)
        {
            mStoreMapController.setStorePickerListener(mStorePickerListener);
        }
    }

    public void setTitleText(String s)
    {
        mTitle = s;
    }

    protected void showDialog(int i)
    {
        if (!mIsPushed) goto _L2; else goto _L1
_L1:
        TextView textview = (TextView)ViewUtil.findViewById(mStoreViewContainer, mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.EMPTY_LIST_VIEW));
        i;
        JVM INSTR lookupswitch 7: default 96
    //                   2: 130
    //                   3: 130
    //                   4: 140
    //                   5: 130
    //                   7: 140
    //                   11: 140
    //                   102: 130;
           goto _L3 _L4 _L4 _L5 _L4 _L5 _L5 _L4
_L3:
        if (!TextUtils.isEmpty(mNoStoresText))
        {
            textview.setVisibility(8);
        }
        super.showDialog(i);
        if (isErrorDialog(i))
        {
            trackSearchError();
        }
        return;
_L4:
        mStoreListPresenter.hideLoadingIndicator();
          goto _L3
_L5:
        if (TextUtils.isEmpty(mNoStoresText)) goto _L3; else goto _L6
_L6:
        textview.setVisibility(0);
        return;
_L2:
        mPendingDialog = i;
        return;
    }

    public void showMapView(boolean flag)
    {
        if (!mPickerMode && mStoreListContainer.getVisibility() == 0)
        {
            flip(flag);
        }
    }

    void toggleFilterActive(boolean flag)
    {
        ImageButton imagebutton;
label0:
        {
            if (!mPickerMode)
            {
                mStoreMapController.clearFlag();
                imagebutton = (ImageButton)ViewUtil.findViewById(mStoreViewContainer, mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.FILTER_BUTTON));
                if (imagebutton != null)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    imagebutton.setImageResource(mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.FILTER_BUTTON_ACTIVE));
                }
            }
            return;
        }
        imagebutton.setImageResource(mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.FILTER_BUTTON));
    }












/*
    static boolean access$1702(StoreViewPresenter storeviewpresenter, boolean flag)
    {
        storeviewpresenter.mRetryOnRestart = flag;
        return flag;
    }

*/





/*
    static boolean access$202(StoreViewPresenter storeviewpresenter, boolean flag)
    {
        storeviewpresenter.mIsAnimating = flag;
        return flag;
    }

*/




/*
    static LatLng access$2202(StoreViewPresenter storeviewpresenter, LatLng latlng)
    {
        storeviewpresenter.mCurrentMapCenter = latlng;
        return latlng;
    }

*/












}
