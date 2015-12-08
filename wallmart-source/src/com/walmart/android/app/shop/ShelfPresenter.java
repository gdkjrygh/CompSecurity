// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.BuyFromFullSiteTapEvent;
import com.walmart.android.analytics.events.ProductViewSource;
import com.walmart.android.analytics.events.SearchResultsEvent;
import com.walmart.android.analytics.events.ShelfRefinementEvent;
import com.walmart.android.analytics.events.ShelfSortEvent;
import com.walmart.android.analytics.events.Source;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.item.ShopSortManager;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.shop.itemloader.ItemLoaderFactory;
import com.walmart.android.app.shop.itemloader.PagingLoader;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ui.recycler.BasicRecyclerView;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterManager, ShopFilterActivity, ShelfAdapter, BarcodeShelfHeaderView, 
//            SimpleItemDetailsPresenter

public abstract class ShelfPresenter extends Presenter
{
    protected class ItemLoaderListener
        implements com.walmart.android.app.shop.itemloader.PagingLoader.LoaderListener
    {

        private final String TAG = com/walmart/android/app/shop/ShelfPresenter$ItemLoaderListener.getSimpleName();
        final ShelfPresenter this$0;

        public void onBatchLoaded()
        {
            WLog.d(TAG, "onBatchLoaded()");
        }

        public void onFirstBatchLoaded(int i)
        {
            WLog.d(TAG, (new StringBuilder()).append("onFirstBatchLoaded(").append(i).append(")").toString());
            if (!isPopped())
            {
                if (mMode == 3)
                {
                    mLoader.setDone();
                }
                if (mMode == 1)
                {
                    checkPharmacyHeader();
                }
                if (mIsPushed)
                {
                    mItemsView.setVisibility(0);
                    mLoadingView.setVisibility(8);
                }
                if (mMode == 1)
                {
                    ArrayList arraylist = new ArrayList();
                    List list = Collections.singletonList(mCategory);
                    ArrayList arraylist1 = new ArrayList();
                    ArrayList arraylist2 = new ArrayList();
                    ArrayList arraylist3 = new ArrayList();
                    int j = 0;
                    while (j < mAdapter.getDataItemCount()) 
                    {
                        com.walmart.android.data.StoreQueryResult.Item item = (com.walmart.android.data.StoreQueryResult.Item)mAdapter.getItem(j);
                        if (!item.isVariantItem())
                        {
                            String s;
                            if (!TextUtils.isEmpty(item.getiD()))
                            {
                                s = item.getiD();
                            } else
                            {
                                s = "null";
                            }
                            arraylist.add(s);
                            if (!TextUtils.isEmpty(item.getItemAvailability()))
                            {
                                s = item.getItemAvailability();
                            } else
                            {
                                s = "null";
                            }
                            arraylist1.add(s);
                            if (!TextUtils.isEmpty(item.getPrice()))
                            {
                                s = item.getPrice().substring(item.getPrice().indexOf("$") + 1, item.getPrice().length());
                            } else
                            {
                                s = "null";
                            }
                            arraylist2.add(s);
                            if (!TextUtils.isEmpty(item.getSellerName()))
                            {
                                s = item.getSellerName();
                            } else
                            {
                                s = "null";
                            }
                            arraylist3.add(s);
                        }
                        j++;
                    }
                    MessageBus.getBus().post(new SearchResultsEvent(mSearchQuery, i, StringUtils.join(mFilterManager.getRefinementIds(), ","), StringUtils.join(arraylist.toArray(), ","), StringUtils.join(list.toArray(), ","), StringUtils.join(arraylist1.toArray(), ","), StringUtils.join(arraylist2.toArray(), ","), StringUtils.join(arraylist3.toArray(), ",")));
                }
            }
        }

        public void onLoadFailed(com.walmart.android.app.shop.itemloader.ItemLoader.PageLoadError pageloaderror, int i)
        {
            WLog.d(TAG, "onLoadFailed()");
            if (!isPopped())
            {
                if (com.walmart.android.app.shop.itemloader.ItemLoader.PageLoadError.NO_RESULTS.equals(pageloaderror))
                {
                    if (mMode == 1)
                    {
                        i = getInterceptSearchType();
                        if (i != 0)
                        {
                            handleInterceptType(i);
                        } else
                        {
                            pageloaderror = mActivity.getResources().getString(0x7f09056f, new Object[] {
                                mSearchQuery
                            });
                            showMessageText(pageloaderror);
                        }
                    } else
                    if (mMode == 3 && getBarcodeHeader() != null)
                    {
                        getBarcodeHeader().setNoProductsFound(true);
                    } else
                    {
                        DialogFactory.showDialog(901, mActivity);
                        pop();
                    }
                } else
                if (mMode == 1 && getInterceptSearchType() != 0)
                {
                    handleInterceptType(getInterceptSearchType());
                } else
                {
                    DialogFactory.showErrorDialog(mActivity, i);
                }
                mLoadingView.setVisibility(8);
            }
        }

        protected ItemLoaderListener()
        {
            this$0 = ShelfPresenter.this;
            super();
        }
    }

    protected class OnFilterChangedListener
        implements ShopFilterManager.OnFilterChangedListener
    {

        final ShelfPresenter this$0;

        public void onFilterChanged()
        {
            reloadData();
            ArrayList arraylist = mFilterManager.getRefinements();
            String s = mFilterManager.getStoreID();
            if (arraylist != null)
            {
                ShelfRefinementEvent shelfrefinementevent = new ShelfRefinementEvent();
                com.walmart.android.data.StoreQueryResult.Refinement refinement;
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); shelfrefinementevent.addRefinement(refinement.getParent(), refinement.getName()))
                {
                    refinement = (com.walmart.android.data.StoreQueryResult.Refinement)iterator.next();
                    GoogleAnalytics.trackEvent("Shelf", "Filter", refinement.getParent());
                }

                MessageBus.getBus().post(shelfrefinementevent.build());
            }
            if (arraylist == null || arraylist.isEmpty() || s == null)
            {
                GoogleAnalytics.trackEvent("Shelf", "Filter", "No Filter");
            }
            if (s != null)
            {
                GoogleAnalytics.trackEvent("Shelf", "Filter", "Store");
            }
        }

        protected OnFilterChangedListener()
        {
            this$0 = ShelfPresenter.this;
            super();
        }
    }


    protected static final int DIALOG_SORT = 1;
    protected static final int DIALOG_UNKNOWN_ERROR = 2;
    protected static final int INTERCEPT_TYPE_PHARMACY = 1;
    public static final int LIST_MODE_BARCODE = 3;
    public static final int LIST_MODE_BROWSE = 0;
    public static final int LIST_MODE_LOCAL_AD = 2;
    public static final int LIST_MODE_MANUAL_SHELF = 4;
    public static final int LIST_MODE_SEARCH = 1;
    protected static final int NO_INTERCEPT_TYPE = 0;
    private static final int PAGE_SIZE = 50;
    protected static final String PHARMACY_SEARCH_INTERCEPT_STRINGS[] = {
        "PHARMACY"
    };
    protected static final int REQUEST_CODE_SHOP_FILTER = 100;
    protected static final String SORT_ITEMS_NAME = "SHOP_SORT_ITEMS";
    protected static final String SORT_ITEMS_PARAM_MAP[] = {
        "RELEVANCE", "PRICE_LOHI", "PRICE_HILO", "NEW", "BESTSELLERS", "TOPRATED"
    };
    private static final String TAG = com/walmart/android/app/shop/ShelfPresenter.getSimpleName();
    private static final String WEBSITE_ALT_MSHARBOR_BASE_URL = "http://www.walmart.com/msharbor%s?adid=1500000000000033643520&veh=mappa";
    private static final String WEBSITE_ALT_PRODUCT_BASE_URL = "http://www.walmart.com";
    protected Activity mActivity;
    protected ShelfAdapter mAdapter;
    private String mBrowseToken;
    private String mCategory;
    protected ShopFilterManager mFilterManager;
    protected boolean mIsPushed;
    protected BasicRecyclerView mItemsView;
    protected ViewGroup mListContainer;
    protected PagingLoader mLoader;
    protected View mLoadingView;
    protected View mMessageView;
    protected int mMode;
    private OnFilterChangedListener mOnFilterChangedListener;
    protected PresenterStack mPresenterStackForPushes;
    protected String mSearchQuery;
    private String mSection;
    protected ShopSortManager mSortManager;
    private String mTitle;

    public ShelfPresenter(Activity activity, String s)
    {
        mMode = 0;
        mBrowseToken = s;
        mFilterManager = new ShopFilterManager();
        initFilterManager(null);
        init(activity);
        mLoader = new PagingLoader(ItemLoaderFactory.createForBrowse(s, mSortManager, mFilterManager, 50));
    }

    public ShelfPresenter(Activity activity, String s, int i)
    {
        mMode = 4;
        init(activity);
        mLoader = new PagingLoader(ItemLoaderFactory.createForShelf(s, i));
        MessageBus.getBus().post(new ProductViewSource(Source.MANUAL_SHELF));
    }

    public ShelfPresenter(Activity activity, String s, String s1)
    {
        mMode = 1;
        mSearchQuery = s;
        mFilterManager = new ShopFilterManager();
        String s2;
        if (s1 == null)
        {
            s2 = "ENTIRESITE";
        } else
        {
            s2 = s1;
        }
        initFilterManager(s2);
        init(activity);
        mLoader = new PagingLoader(ItemLoaderFactory.createForSearch(s, s1, mSortManager, mFilterManager, 50));
        MessageBus.getBus().post(new ProductViewSource(Source.SEARCH));
    }

    public ShelfPresenter(Activity activity, com.walmart.android.data.StoreQueryResult.Item aitem[], String s)
    {
        mMode = 2;
        init(activity);
        mLoader = new PagingLoader(ItemLoaderFactory.createForStaticItems(aitem));
        setTitleText(s);
    }

    public ShelfPresenter(Activity activity, String as[])
    {
        mMode = 3;
        mSearchQuery = as[0];
        mFilterManager = new ShopFilterManager();
        initFilterManager(null);
        init(activity);
    }

    protected void checkPharmacyHeader()
    {
        if (getInterceptSearchType() == 1)
        {
            View view = LayoutInflater.from(mActivity).inflate(0x7f0400f2, mItemsView, false);
            if (view != null)
            {
                view.setOnClickListener(new OnSingleClickListener(this) {

                    final ShelfPresenter this$0;

                    public void onSingleClick(View view1)
                    {
                        handleInterceptType(1);
                    }

            
            {
                this$0 = ShelfPresenter.this;
                super(presenter);
            }
                });
                mItemsView.addHeaderView(view);
            }
        }
    }

    protected OnFilterChangedListener createOnFilterChangedListener()
    {
        return new OnFilterChangedListener();
    }

    public abstract BarcodeShelfHeaderView getBarcodeHeader();

    protected abstract int getContainerLayout();

    protected int getInterceptSearchType()
    {
        return TextUtils.isEmpty(mSearchQuery) || !StringUtils.startsWithAny(mSearchQuery.replaceAll("\\s", "").toUpperCase(), PHARMACY_SEARCH_INTERCEPT_STRINGS) ? 0 : 1;
    }

    public String getTitleText()
    {
        return mTitle;
    }

    public View getView()
    {
        return mListContainer;
    }

    protected void handleInterceptType(int i)
    {
        switch (i)
        {
        default:
            WLog.i(TAG, (new StringBuilder()).append("No intercept action for this type: ").append(i).toString());
            return;

        case 1: // '\001'
            PharmacyActivity.launch(mActivity);
            break;
        }
    }

    protected void init(Activity activity)
    {
        mActivity = activity;
        mListContainer = (ViewGroup)LayoutInflater.from(mActivity).inflate(getContainerLayout(), null);
        mLoadingView = mListContainer.findViewById(0x7f100545);
        mMessageView = mListContainer.findViewById(0x7f100546);
        mItemsView = (BasicRecyclerView)ViewUtil.findViewById(mListContainer, 0x7f100544);
        mItemsView.setVerticalScrollBarEnabled(false);
        initSortManager();
    }

    protected void initFilterManager(String s)
    {
        mFilterManager.reset();
        if (mSearchQuery != null)
        {
            mFilterManager.setSearchQuery(mSearchQuery);
        }
        if (mBrowseToken != null)
        {
            mFilterManager.setBrowseToken(mBrowseToken);
        }
        mOnFilterChangedListener = createOnFilterChangedListener();
        mFilterManager.setDepartment(s);
        mFilterManager.addOnFilterChangedListener(mOnFilterChangedListener);
    }

    protected abstract void initListView();

    protected void initSortManager()
    {
        mSortManager = new ShopSortManager(mActivity);
        mSortManager.addSortGroup(new com.walmart.android.app.item.ShopSortManager.SortGroup(SORT_ITEMS_PARAM_MAP, "SHOP_SORT_ITEMS", new com.walmart.android.app.item.ShopSortManager.OnSortChangedListener() {

            final ShelfPresenter this$0;

            public volatile void onSortChanged(Object obj)
            {
                onSortChanged((String)obj);
            }

            public void onSortChanged(String s)
            {
                TextView textview = (TextView)mListContainer.findViewById(0x7f1002dd);
                if (textview != null)
                {
                    textview.setSelected(true);
                }
                reloadData();
                GoogleAnalytics.trackEvent("Shelf", "Sort", s);
                MessageBus.getBus().post(new ShelfSortEvent(s));
            }

            
            {
                this$0 = ShelfPresenter.this;
                super();
            }
        }));
        mSortManager.setActive("SHOP_SORT_ITEMS");
        mSortManager.reset();
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (i == 100)
        {
            if (j == -1)
            {
                intent = ShopFilterActivity.getFilterReturnValue();
                mFilterManager.setStoreID(intent.getStoreID());
                mFilterManager.setRefinements(intent.getRefinements());
            }
            return;
        } else
        {
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        trackPageView();
        initListView();
        GoogleAnalytics.trackEvent("Shelf", "Views", "");
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            builder.setTitle(0x7f090560).setSingleChoiceItems(0x7f0e000c, mSortManager.getSelectedOption(), new android.content.DialogInterface.OnClickListener() {

                final ShelfPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    mSortManager.setSelectedOption(j);
                    dismissDialog(1);
                }

            
            {
                this$0 = ShelfPresenter.this;
                super();
            }
            }).setCancelable(true).setNegativeButton(0x7f0900a0, new android.content.DialogInterface.OnClickListener() {

                final ShelfPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dismissDialog(1);
                }

            
            {
                this$0 = ShelfPresenter.this;
                super();
            }
            });
            return builder.create();

        case 2: // '\002'
            return DialogFactory.onCreateDialog(0xf4240, mActivity);
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mPresenterStackForPushes == null)
        {
            mPresenterStackForPushes = getPresenterStack();
        }
    }

    protected void onPageView()
    {
        if (!recentlyPushed() && !TextUtils.isEmpty(mSection) && !TextUtils.isEmpty(mCategory))
        {
            AnalyticsHelper.post(AnalyticsHelper.prepareBrowsePageViewEvent(mTitle, mSection, mCategory, mBrowseToken));
        }
    }

    public void onPop()
    {
        super.onPop();
        if (mFilterManager != null)
        {
            mFilterManager.removeOnFilterChangedListener(mOnFilterChangedListener);
        }
    }

    public void reloadData()
    {
        if (mAdapter != null)
        {
            mAdapter.reload();
        }
    }

    public void setPushNewPresentersTo(PresenterStack presenterstack)
    {
        mPresenterStackForPushes = presenterstack;
    }

    public void setSectionAndCategory(String s, String s1)
    {
        mSection = s;
        mCategory = s1;
    }

    public void setTitleText(String s)
    {
        mTitle = s;
        if (mFilterManager != null)
        {
            mFilterManager.setShelfDepartmentTitle(s);
        }
    }

    protected void showMessageText(String s)
    {
        mMessageView.setVisibility(0);
        ((TextView)mMessageView.findViewById(0x7f10020e)).setText(s);
    }

    public void showOnWebsite(final com.walmart.android.data.StoreQueryResult.Item clickedItem)
    {
        DialogFactory.showDialog(7, mActivity, new com.walmart.android.wmservice.DialogFactory.DialogListener() {

            final ShelfPresenter this$0;
            final com.walmart.android.data.StoreQueryResult.Item val$clickedItem;

            public void onClicked(int i, int j, Object aobj[])
            {
                if (clickedItem.hasUrl() && i == 7)
                {
                    aobj = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://www.walmart.com/msharbor%s?adid=1500000000000033643520&veh=mappa", new Object[] {
                        clickedItem.getUrl().replace("http://www.walmart.com", "")
                    })));
                    if (((Intent) (aobj)).resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(((Intent) (aobj)));
                        MessageBus.getBus().post(new BuyFromFullSiteTapEvent(clickedItem.getiD()));
                    }
                }
            }

            
            {
                this$0 = ShelfPresenter.this;
                clickedItem = item;
                super();
            }
        });
    }

    protected void trackPageView()
    {
        GoogleAnalytics.trackPageView("Shelf Page");
    }

    protected void wireListeners()
    {
        mItemsView.setOnItemClickListener(new RecyclerItemSingleClickListener(this) {

            final ShelfPresenter this$0;

            public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
            {
                com.walmart.android.data.StoreQueryResult.Item item = (com.walmart.android.data.StoreQueryResult.Item)mAdapter.getItem(i);
                if (item != null)
                {
                    Object obj1 = null;
                    basicviewholder = item.getiD();
                    if (item.showOnWebsite())
                    {
                        showOnWebsite(item);
                    } else
                    {
                        if (!NumberUtils.isDigits(basicviewholder))
                        {
                            String s = item.getName();
                            basicviewholder = item.getProductImageUrl();
                            Object obj = basicviewholder;
                            if (TextUtils.isEmpty(basicviewholder))
                            {
                                obj = item.getImageThumbnailUrl();
                            }
                            basicviewholder = obj1;
                            if (s != null)
                            {
                                basicviewholder = obj1;
                                if (obj != null)
                                {
                                    basicviewholder = new SimpleItemDetailsPresenter(mActivity);
                                    basicviewholder.init(s, null, ((String) (obj)), item.getPrice(), item.getPriceDisplaySubtext(), item.getDescription(), item.getDealInfo());
                                }
                            }
                        } else
                        {
                            basicviewholder = new ItemDetailsPresenter(mActivity, item.getiD());
                        }
                        if (basicviewholder != null)
                        {
                            mPresenterStackForPushes.pushPresenter(basicviewholder, true);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = ShelfPresenter.this;
                super(presenter);
            }
        });
    }





}
