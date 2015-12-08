// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.StoreSearchResultEvent;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.main.MiscActivity;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.InStoreSearchPagerAdapter;
import com.walmart.android.app.shop.map.MappedSections;
import com.walmart.android.app.shop.map.SearchResultSourceDataMapper;
import com.walmart.android.app.shop.map.SourceDataMapper;
import com.walmart.android.app.storelocator.WalmartStoreModeManager;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmui.ScrollDirectionListener;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreSearchAdapter, SimpleItemDetailsPresenter

public class InStoreListPresenter extends Presenter
{
    private class InStoreItemLoaderListener
        implements InStoreSearchAdapter.LoaderListener
    {

        final InStoreListPresenter this$0;

        public void onFirstBatchLoaded()
        {
            mLoadingView.setVisibility(8);
            int i = mInStoreSearchAdapter.getDataItemCount();
            if (i == 0)
            {
                String s = mActivity.getResources().getString(0x7f09056f, new Object[] {
                    mQuery
                });
                showMessageText(s);
            } else
            {
                mListView.setVisibility(0);
            }
            if (!mHasLoaded)
            {
                mHasLoaded = true;
                if (i > 0)
                {
                    mStoreSearchAnalyticsEvent.resultNumber = i;
                }
                sendPendingPageViewEvents();
            }
        }

        public void onLoadingFailed(Integer integer)
        {
            WLog.e(InStoreListPresenter.TAG, (new StringBuilder()).append("getInStoreSearchResults failed with error ").append(integer).toString());
            if (!isPopped())
            {
                DialogFactory.showErrorDialog(mActivity, integer.intValue());
            }
        }

        private InStoreItemLoaderListener()
        {
            this$0 = InStoreListPresenter.this;
            super();
        }

    }

    private class MapLoadingCallbacks
        implements com.walmart.android.app.shop.map.InStoreMapController.LoadingCallbacks
    {

        final InStoreListPresenter this$0;

        private void updateAnalyticsEvent()
        {
            if (mStoreMapSectionController.getSourceDataMapper().hasAllData() && mStoreMapSectionController.isMapLoaded())
            {
                mStoreSearchAnalyticsEvent.numberOfItemsMapped = String.valueOf(mStoreMapSectionController.getSourceDataMapper().getMappedSections().getDataCount());
                mStoreSearchAnalyticsEvent.numberOfAislesMapped = String.valueOf(mStoreMapSectionController.getSourceDataMapper().getMappedSections().getAisleCount());
                mHasLoadedMap = true;
            }
            sendPendingPageViewEvents();
        }

        public void onAislesLoaded()
        {
            updateAnalyticsEvent();
        }

        public void onMapFail()
        {
            mHasLoadedMap = true;
            updateAnalyticsEvent();
        }

        public void onMapLoaded()
        {
            updateAnalyticsEvent();
        }

        public void onStoreDataSourceChanged()
        {
            updateAnalyticsEvent();
        }

        private MapLoadingCallbacks()
        {
            this$0 = InStoreListPresenter.this;
            super();
        }

    }


    private static final String TAG = com/walmart/android/app/shop/InStoreListPresenter.getSimpleName();
    private final Activity mActivity;
    private View mChangeStoreFooter;
    private boolean mHasLoaded;
    private boolean mHasLoadedMap;
    private View mHeaderView;
    private int mHeaderViewId;
    private InStoreSearchAdapter mInStoreSearchAdapter;
    private ListRecyclerView mListView;
    private View mLoadingView;
    private View mMessageView;
    private final String mQuery;
    private ViewGroup mRootContainer;
    private ScrollDirectionListener mScrollDirectionListener;
    private com.walmart.android.search.SearchData.SearchType mSearchType;
    private View mSetStoreView;
    private String mStoreAddress;
    private String mStoreId;
    private final InStoreMapSectionController mStoreMapSectionController;
    private final StoreSearchResultEvent mStoreSearchAnalyticsEvent = new StoreSearchResultEvent();

    public InStoreListPresenter(Activity activity, String s)
    {
        mHeaderViewId = -1;
        mActivity = activity;
        mQuery = s;
        mStoreMapSectionController = new InStoreMapSectionController(activity, new SearchResultSourceDataMapper(), new MapLoadingCallbacks());
    }

    private void handleStoreChangeClick()
    {
        Intent intent = new Intent(mActivity, com/walmart/android/app/main/MiscActivity);
        intent.putExtra("show", 4).putExtra("EXTRA_STORE_PICKER_OPENED_FROM", "storeSearchResults");
        mActivity.startActivity(intent);
    }

    private void hideAllViews()
    {
        mMessageView.setVisibility(8);
        mLoadingView.setVisibility(8);
        mSetStoreView.setVisibility(8);
        mListView.setVisibility(8);
    }

    private void loadData()
    {
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(mActivity);
        StoreModeEvent storemodeevent = WalmartStoreModeManager.create(mActivity).getStoreModeEvent();
        Object obj = StoreLocationManager.getInstance(mActivity).getNearbyByStores();
        boolean flag = true;
        if (storemodeevent != null && storemodeevent.isInStore() && storemodeevent.getStoreData() != null)
        {
            mChangeStoreFooter.setVisibility(8);
            obj = storemodeevent.getStoreId();
            mStoreAddress = storemodeevent.getStoreData().getAddressStreetLine();
            mStoreSearchAnalyticsEvent.mode = "inStore";
        } else
        if (storeinfo != null)
        {
            mChangeStoreFooter.setVisibility(0);
            ViewUtil.setText(0x7f100104, mChangeStoreFooter, storeinfo.addressLine1);
            ViewUtil.setText(0x7f100105, mChangeStoreFooter, storeinfo.addressLine2);
            obj = storeinfo.storeID;
            mStoreAddress = storeinfo.addressLine1;
            mStoreSearchAnalyticsEvent.mode = "setStore";
        } else
        if (!((List) (obj)).isEmpty())
        {
            StoreData storedata = (StoreData)((List) (obj)).get(0);
            mChangeStoreFooter.setVisibility(0);
            ViewUtil.setText(0x7f100104, mChangeStoreFooter, storedata.getAddressStreetLine());
            ViewUtil.setText(0x7f100105, mChangeStoreFooter, storedata.getCityStateZip());
            obj = storedata.getId();
            mStoreAddress = storedata.getAddressStreetLine();
            mStoreSearchAnalyticsEvent.mode = "nearbyStore";
        } else
        {
            hideAllViews();
            mChangeStoreFooter.setVisibility(8);
            mSetStoreView.setVisibility(0);
            flag = false;
            obj = null;
            mStoreAddress = null;
            mStoreSearchAnalyticsEvent.mode = "";
        }
        mStoreSearchAnalyticsEvent.inDepartment = "null";
        mStoreSearchAnalyticsEvent.categoryId = "null";
        mStoreSearchAnalyticsEvent.searchTerm = mQuery;
        mStoreSearchAnalyticsEvent.searchType = StoreSearchResultEvent.toSearchTypeString(mSearchType);
        mStoreSearchAnalyticsEvent.storeId = ((String) (obj));
        mStoreSearchAnalyticsEvent.section = "store search";
        if (flag && obj != null && !((String) (obj)).equals(mStoreId))
        {
            mStoreId = ((String) (obj));
            hideAllViews();
            mLoadingView.setVisibility(0);
            if (mInStoreSearchAdapter != null)
            {
                mInStoreSearchAdapter.cleanup();
            }
            mInStoreSearchAdapter = new InStoreSearchAdapter(mActivity, mQuery, mStoreId, mStoreSearchAnalyticsEvent.mode, mStoreSearchAnalyticsEvent.searchType);
            mInStoreSearchAdapter.setInStoreListener(new InStoreItemLoaderListener());
            mListView.setAdapter(mInStoreSearchAdapter);
            mInStoreSearchAdapter.initLoader();
            mStoreMapSectionController.setStoreDataSource(mStoreId, mInStoreSearchAdapter);
            wireListeners();
        }
        setupFooterHideOnScroll();
    }

    private void openItem(int i)
    {
        if (mInStoreSearchAdapter != null)
        {
            Object obj = (com.walmart.android.data.InStoreSearchResult.Result)mInStoreSearchAdapter.getItem(i);
            if (obj != null)
            {
                Object obj1 = new StoreAvailabilityData(((com.walmart.android.data.InStoreSearchResult.Result) (obj)));
                String s = ((com.walmart.android.data.InStoreSearchResult.Result) (obj)).getWWWItemId();
                if (((com.walmart.android.data.InStoreSearchResult.Result) (obj)).isWWWItem && !TextUtils.isEmpty(s))
                {
                    obj = new ItemDetailsPresenter(mActivity, s);
                    obj1.storeAddress = mStoreAddress;
                    if (((StoreAvailabilityData) (obj1)).storeId == null)
                    {
                        obj1.storeId = mStoreId;
                    }
                    ((ItemDetailsPresenter) (obj)).setAvailabilityData(((StoreAvailabilityData) (obj1)));
                    pushPresenter(((Presenter) (obj)));
                } else
                if (!((com.walmart.android.data.InStoreSearchResult.Result) (obj)).isWWWItem)
                {
                    SimpleItemDetailsPresenter simpleitemdetailspresenter = new SimpleItemDetailsPresenter(mActivity);
                    simpleitemdetailspresenter.setAvailabilityData(((StoreAvailabilityData) (obj1)), mStoreAddress, mStoreId);
                    obj1 = ((com.walmart.android.data.InStoreSearchResult.Result) (obj)).getPriceString();
                    simpleitemdetailspresenter.init(((com.walmart.android.data.InStoreSearchResult.Result) (obj)).name, ((com.walmart.android.data.InStoreSearchResult.Result) (obj)).getUpc(), ((com.walmart.android.data.InStoreSearchResult.Result) (obj)).getLargeImageUrl(), ((String) (obj1)), null, "", "");
                    simpleitemdetailspresenter.setUnitInformation(((com.walmart.android.data.InStoreSearchResult.Result) (obj)).getPriceUnit(), ((com.walmart.android.data.InStoreSearchResult.Result) (obj)).getFormattedPricePerUnit());
                    simpleitemdetailspresenter.setDefaultImage(BitmapFactory.decodeResource(mActivity.getResources(), 0x7f020342));
                    pushPresenter(simpleitemdetailspresenter);
                    return;
                }
            }
        }
    }

    private void sendPendingPageViewEvents()
    {
        if (mHasLoaded && mHasLoadedMap)
        {
            MessageBus.getBus().post(mStoreSearchAnalyticsEvent);
        }
    }

    private void setupFooterHideOnScroll()
    {
        int i = mChangeStoreFooter.getLayoutParams().height;
        mListView.addOnItemTouchListener(new ScrollDirectionListener(i) {

            final InStoreListPresenter this$0;
            final int val$offset;

            public void onScrollDirectionChanged(int j)
            {
                if (hasScrollableContent()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                switch (j)
                {
                default:
                    break;

                case 1: // '\001'
                    break; /* Loop/switch isn't completed */

                case 0: // '\0'
                    break;
                }
                break MISSING_BLOCK_LABEL_93;
_L4:
                if (mScrollDirectionListener != null)
                {
                    mScrollDirectionListener.onScrollDirectionChanged(j);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                float f = mRootContainer.getHeight() - offset;
                mChangeStoreFooter.animate().y(f);
                  goto _L4
                float f1 = mRootContainer.getHeight();
                mChangeStoreFooter.animate().y(f1);
                  goto _L4
            }

            
            {
                this$0 = InStoreListPresenter.this;
                offset = i;
                super(final_context);
            }
        });
    }

    private void showMessageText(String s)
    {
        mMessageView.setVisibility(0);
        ViewUtil.setText(0x7f10020e, mMessageView, s);
    }

    public View getView()
    {
        return mRootContainer;
    }

    public boolean hasScrollableContent()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mListView != null)
        {
            flag = flag1;
            if (mInStoreSearchAdapter != null)
            {
                int j = mInStoreSearchAdapter.getItemCount() * ViewUtil.dpToPixels(98, mActivity);
                int i = j;
                if (mHeaderView != null)
                {
                    i = j + mHeaderView.getHeight();
                }
                int k = mListView.getHeight();
                j = k;
                if (mChangeStoreFooter != null)
                {
                    j = k - mChangeStoreFooter.getHeight();
                }
                flag = flag1;
                if (i > j)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mStoreMapSectionController.stop();
        mStoreMapSectionController.destroy();
        if (mInStoreSearchAdapter != null)
        {
            mInStoreSearchAdapter.cleanup();
        }
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mStoreMapSectionController.start();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mStoreMapSectionController.start();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootContainer == null)
        {
            mRootContainer = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f04017e, viewgroup, false);
            mRootContainer.findViewById(0x7f10052c).setOnClickListener(new OnSingleClickListener(this) {

                final InStoreListPresenter this$0;

                public void onSingleClick(View view1)
                {
                    handleStoreChangeClick();
                }

            
            {
                this$0 = InStoreListPresenter.this;
                super(presenter);
            }
            });
            mRootContainer.findViewById(0x7f1005ca).setOnClickListener(new OnSingleClickListener(this) {

                final InStoreListPresenter this$0;

                public void onSingleClick(View view1)
                {
                    handleStoreChangeClick();
                }

            
            {
                this$0 = InStoreListPresenter.this;
                super(presenter);
            }
            });
            mListView = (ListRecyclerView)ViewUtil.findViewById(mRootContainer, 0x7f10052b);
            mListView.setVerticalScrollBarEnabled(false);
            if (mHeaderViewId != -1)
            {
                setHeaderView(mHeaderViewId);
            }
            mLoadingView = mRootContainer.findViewById(0x7f100083);
            mMessageView = mRootContainer.findViewById(0x7f10052d);
            mSetStoreView = mRootContainer.findViewById(0x7f10052e);
            mChangeStoreFooter = mRootContainer.findViewById(0x7f10052c);
            viewgroup = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040070, mListView, false);
            mListView.addHeaderView(viewgroup);
            mStoreMapSectionController.setContainerView(viewgroup);
            viewgroup.setOnClickListener(new OnSingleClickListener(this) {

                final InStoreListPresenter this$0;

                public void onSingleClick(View view1)
                {
                    view1 = new InStoreSearchPagerAdapter();
                    pushPresenter(new InStoreMapFullScreenPresenter(mActivity, getPresenterStack().peek().getTitleText(), mStoreMapSectionController.getSourceDataMapper(), view1, new com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter.ActionCallbacks() {

                        final _cls3 this$1;

                        public void onItemSelected(int i)
                        {
                            openItem(i);
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    }));
                }

            
            {
                this$0 = InStoreListPresenter.this;
                super(presenter);
            }
            });
            viewgroup = AppConfigManager.get().getAppConfig();
            if (viewgroup != null && ((AppConfig) (viewgroup)).storeSearchBanner != null)
            {
                Object obj = ((AppConfig) (viewgroup)).storeSearchBanner.message;
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    String s = ((AppConfig) (viewgroup)).storeSearchBanner.action;
                    View view;
                    String s1;
                    int i;
                    if (!TextUtils.isEmpty(s))
                    {
                        viewgroup = WalmartUri.parse(s);
                    } else
                    {
                        viewgroup = null;
                    }
                    view = LayoutInflater.from(mActivity).inflate(0x7f0401ae, mListView, false);
                    s1 = mActivity.getString(0x7f090092);
                    i = ((String) (obj)).indexOf(s1);
                    if (i >= 0)
                    {
                        obj = new SpannableString(((CharSequence) (obj)));
                        ((Spannable) (obj)).setSpan(new StyleSpan(1), i, s1.length() + i, 0);
                        ((TextView)view.findViewById(0x7f100089)).setText(((CharSequence) (obj)));
                    } else
                    {
                        ((TextView)view.findViewById(0x7f100089)).setText(((CharSequence) (obj)));
                    }
                    if (viewgroup != null)
                    {
                        view.setOnClickListener(new OnSingleClickListener(s) {

                            final InStoreListPresenter this$0;
                            final String val$action;

                            public void onSingleClick(View view1)
                            {
                                NavigationItemUtils.launchFromUri(mActivity, action, true);
                            }

            
            {
                this$0 = InStoreListPresenter.this;
                action = s;
                super(final_presenter);
            }
                        });
                    }
                    mListView.addHeaderView(view);
                }
            }
            loadData();
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        mStoreMapSectionController.stop();
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        mStoreMapSectionController.stop();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mStoreMapSectionController.start();
        loadData();
    }

    public void setHeaderView(int i)
    {
        mHeaderViewId = i;
        if (mListView != null)
        {
            mHeaderView = LayoutInflater.from(mActivity).inflate(mHeaderViewId, mListView, false);
            mListView.addHeaderView(mHeaderView);
        }
    }

    public void setScrollDirectionListener(ScrollDirectionListener scrolldirectionlistener)
    {
        mScrollDirectionListener = scrolldirectionlistener;
    }

    public void setSearchType(com.walmart.android.search.SearchData.SearchType searchtype)
    {
        mSearchType = searchtype;
    }

    protected void wireListeners()
    {
        mListView.setOnItemClickListener(new RecyclerItemSingleClickListener(this) {

            final InStoreListPresenter this$0;

            public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
            {
                openItem(i);
            }

            
            {
                this$0 = InStoreListPresenter.this;
                super(presenter);
            }
        });
    }










/*
    static boolean access$1502(InStoreListPresenter instorelistpresenter, boolean flag)
    {
        instorelistpresenter.mHasLoaded = flag;
        return flag;
    }

*/





/*
    static boolean access$1902(InStoreListPresenter instorelistpresenter, boolean flag)
    {
        instorelistpresenter.mHasLoadedMap = flag;
        return flag;
    }

*/







}
