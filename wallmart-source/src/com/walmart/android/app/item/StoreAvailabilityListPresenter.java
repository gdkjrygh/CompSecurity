// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.location.Address;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.search.SearchData;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.storelocator.StoreSearchManager;
import com.walmartlabs.ui.SearchBarLayout;
import com.walmartlabs.utils.LocationUtils;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListAdapter

public class StoreAvailabilityListPresenter extends Presenter
{

    private static final int DIALOG_NO_STORES_NEARBY_FOUND = 1;
    private static final int DIALOG_NO_STORES_NEAR_LOCATION_FOUND = 2;
    private static final int REQUEST_CODE_LOCATION_RESOLUTION = 1;
    private static final String TAG = com/walmart/android/app/item/StoreAvailabilityListPresenter.getSimpleName();
    private final Activity mActivity;
    private final StoreAvailabilityListAdapter mAdapter;
    private boolean mIsVisible;
    private String mItemId;
    private View mLoadingView;
    private LatLng mLocation;
    private String mProdType;
    private boolean mReloadOnRestart;
    private String mSearchTerm;
    private ViewGroup mStoreAvailabilityView;
    private StoreSearchManager mStoreSearchManager;
    private String mUpc;

    public StoreAvailabilityListPresenter(Activity activity, String s, String s1, String s2, boolean flag, boolean flag1)
    {
        mActivity = activity;
        mItemId = s1;
        mUpc = s;
        mProdType = s2;
        mAdapter = new StoreAvailabilityListAdapter(mActivity, s, s1, flag, flag1);
    }

    public StoreAvailabilityListPresenter(Activity activity, String s, String s1, boolean flag)
    {
        this(activity, null, s, s1, true, flag);
    }

    public StoreAvailabilityListPresenter(Activity activity, String s, boolean flag)
    {
        this(activity, s, null, null, flag, true);
    }

    private void executeLocationSearch(String s)
    {
        (new AsyncTask() {

            final StoreAvailabilityListPresenter this$0;

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
                if (addresssearchresult.hasAddress())
                {
                    addresssearchresult = addresssearchresult.getAddress();
                    addresssearchresult = new LatLng(addresssearchresult.getLatitude(), addresssearchresult.getLongitude());
                    setLocation(addresssearchresult);
                    return;
                }
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

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((com.walmartlabs.utils.LocationUtils.AddressSearchResult)obj);
            }

            protected void onPreExecute()
            {
                mAdapter.reset();
            }

            
            {
                this$0 = StoreAvailabilityListPresenter.this;
                super();
            }
        }).execute(new String[] {
            s
        });
    }

    private void initView()
    {
        ListView listview = (ListView)ViewUtil.findViewById(mStoreAvailabilityView, 0x7f1001a0);
        listview.setVerticalFadingEdgeEnabled(true);
        listview.setCacheColorHint(0);
        listview.setAdapter(mAdapter);
        mAdapter.setStoreAvailabilityListener(new StoreAvailabilityListAdapter.StoreAvailabilityListener() {

            final StoreAvailabilityListPresenter this$0;

            public void onEmptyStoreAvailabilityResponse()
            {
                if (!isPopped())
                {
                    showDialog(2);
                }
            }

            public void onErrorLoadingStoreAvailability(int i)
            {
                while (isPopped() || mAdapter.getStoreCount() > 0) 
                {
                    return;
                }
                if (i == 0x15f92)
                {
                    showDialog(600);
                    return;
                }
                if (i == 10000)
                {
                    if (mLocation != null)
                    {
                        showDialog(1);
                        return;
                    } else
                    {
                        showDialog(2);
                        return;
                    }
                } else
                {
                    showDialog(900);
                    return;
                }
            }

            public void onErrorLoadingStores(int i)
            {
label0:
                {
                    if (!isPopped())
                    {
                        if (i != 0x15f92)
                        {
                            break label0;
                        }
                        showDialog(600);
                    }
                    return;
                }
                showDialog(900);
            }

            public void onErrorRequestingLocation(int i)
            {
                if (!isPopped())
                {
                    if (i == 3 || i == 1)
                    {
                        showDialog(102);
                    } else
                    if (i == 2)
                    {
                        mReloadOnRestart = true;
                        return;
                    }
                }
            }

            public void onErrorRequestingLocation(ConnectionResult connectionresult)
            {
                if (isPopped())
                {
                    break MISSING_BLOCK_LABEL_29;
                }
                if (!connectionresult.hasResolution())
                {
                    break MISSING_BLOCK_LABEL_36;
                }
                connectionresult.startResolutionForResult(mActivity, 1);
_L1:
                return;
                connectionresult;
                connectionresult.printStackTrace();
                return;
                connectionresult = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), mActivity, 1);
                if (connectionresult != null)
                {
                    connectionresult.show();
                    return;
                }
                  goto _L1
            }

            public void onLoadCompleted(boolean flag)
            {
                if (flag)
                {
                    mLoadingView.setVisibility(8);
                } else
                if (mIsVisible && mSearchTerm != null)
                {
                    onPageView();
                    return;
                }
            }

            
            {
                this$0 = StoreAvailabilityListPresenter.this;
                super();
            }
        });
        listview.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final StoreAvailabilityListPresenter this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                mAdapter.handleOnScroll(abslistview, i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = StoreAvailabilityListPresenter.this;
                super();
            }
        });
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final StoreAvailabilityListPresenter this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (WalmartStore)mAdapter.getItem(i);
                if (adapterview != null)
                {
                    adapterview = new StoreDetailPresenter(mActivity, adapterview);
                    pushPresenter(adapterview);
                }
            }

            
            {
                this$0 = StoreAvailabilityListPresenter.this;
                super();
            }
        });
    }

    private void setLocation(LatLng latlng)
    {
        mLocation = latlng;
        mAdapter.setLocation(latlng);
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f09058e);
    }

    public View getView()
    {
        return mStoreAvailabilityView;
    }

    public boolean interceptBack()
    {
        return mStoreSearchManager != null && mStoreSearchManager.onBackPressed();
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (j != -1) goto _L2; else goto _L1
_L1:
        mAdapter.reload();
_L4:
        return;
_L2:
        i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mActivity);
        if (i == 0)
        {
            mAdapter.reload();
            return;
        }
        intent = GooglePlayServicesUtil.getErrorDialog(i, mActivity, 1);
        if (intent == null) goto _L4; else goto _L3
_L3:
        intent.show();
        return;
        super.onActivityResultAsTop(i, j, intent);
        return;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mIsVisible = true;
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return DialogFactory.onCreateDialog(i, mActivity);

        case 1: // '\001'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090587).setPositiveButton(0x7f090292, null).create();

        case 2: // '\002'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090588).setPositiveButton(0x7f090292, null).create();
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mStoreAvailabilityView == null)
        {
            mStoreAvailabilityView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040075);
            mLoadingView = mStoreAvailabilityView.findViewById(0x7f100083);
            initView();
            mStoreSearchManager = new StoreSearchManager(mActivity, mStoreAvailabilityView, WalmartStoreConfigurator.createLayoutConfig());
            viewgroup = new WalmartStoreConfigurator(mActivity);
            mStoreSearchManager.init(0x7f10019e, viewgroup.getCountryRestriction(), viewgroup.getReferrer());
            ((SearchBarLayout)mStoreSearchManager.getSearchBarView()).setExpanded();
            mStoreSearchManager.setOnSuggestionSelectedListener(new com.walmart.android.search.SearchManager.OnSearchExecutedListener() {

                final StoreAvailabilityListPresenter this$0;

                public void onSearchExecuted(SearchData searchdata)
                {
                    mSearchTerm = searchdata.getSearchText().toString();
                    executeLocationSearch(mSearchTerm);
                }

                public volatile void onSearchExecuted(Object obj)
                {
                    onSearchExecuted((SearchData)obj);
                }

            
            {
                this$0 = StoreAvailabilityListPresenter.this;
                super();
            }
            });
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        mIsVisible = false;
    }

    protected void onPageView()
    {
        super.onPageView();
        GoogleAnalytics.trackPageView("In-Store Availability");
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "product detail:find nearby").putString("section", "shop");
        if (!TextUtils.isEmpty(mItemId))
        {
            builder.putString("itemId", mItemId);
        }
        if (!TextUtils.isEmpty(mUpc))
        {
            builder.putString("upc", mUpc);
        }
        if (!TextUtils.isEmpty(mSearchTerm))
        {
            builder.putString("searchTerm", mSearchTerm);
        }
        String s;
        if (TextUtils.isEmpty(mProdType))
        {
            s = ProductType.EXTENDED_ITEM_NO_RESPONSE.toString();
        } else
        {
            s = mProdType;
        }
        builder.putString("prodType", s);
        MessageBus.getBus().post(builder);
    }

    public void onPop()
    {
        super.onPop();
        mIsVisible = false;
    }

    public void onPushed()
    {
        super.onPushed();
        mIsVisible = true;
        mAdapter.loadInitialAvailabilityData();
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        if (mReloadOnRestart)
        {
            mAdapter.reload();
        }
        mReloadOnRestart = false;
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mIsVisible = true;
    }

    public boolean onSearchRequested()
    {
        return mStoreSearchManager != null && mStoreSearchManager.onSearchRequested();
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        mIsVisible = false;
    }




/*
    static String access$002(StoreAvailabilityListPresenter storeavailabilitylistpresenter, String s)
    {
        storeavailabilitylistpresenter.mSearchTerm = s;
        return s;
    }

*/





/*
    static boolean access$1202(StoreAvailabilityListPresenter storeavailabilitylistpresenter, boolean flag)
    {
        storeavailabilitylistpresenter.mReloadOnRestart = flag;
        return flag;
    }

*/
















}
