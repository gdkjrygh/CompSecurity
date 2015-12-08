// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MenuItemCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.BuyFromFullSiteTapEvent;
import com.walmart.android.analytics.events.CustomizeBundleTapEvent;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.analytics.events.ProductViewSource;
import com.walmart.android.analytics.events.Source;
import com.walmart.android.app.cart.CartUtils;
import com.walmart.android.app.item.view.InStoreView;
import com.walmart.android.app.item.view.OnlineView;
import com.walmart.android.app.item.view.RecommendedItemsView;
import com.walmart.android.app.item.view.SellersView;
import com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.ItemPagerAdapter;
import com.walmart.android.app.shop.map.ItemSourceDataMapper;
import com.walmart.android.app.shop.map.MappedSections;
import com.walmart.android.app.shop.map.SourceDataMapper;
import com.walmart.android.app.ui.ImagePagerController;
import com.walmart.android.app.wishlist.ListCreatorActivity;
import com.walmart.android.data.ItemRecommendationResult;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.events.AppIndexEvent;
import com.walmart.android.events.ShippingPassStatusEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.cart.ListInfo;
import com.walmart.android.service.irs.ItemRecommendationService;
import com.walmart.android.service.item.BundleModel;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.DescriptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.item.ItemService;
import com.walmart.android.service.item.ReviewData;
import com.walmart.android.service.item.VariantsModel;
import com.walmart.android.service.wishlist.AddBundle;
import com.walmart.android.service.wishlist.AddItemOfferId;
import com.walmart.android.service.wishlist.AddItemUsItemId;
import com.walmart.android.shop.ImageUrlAdapter;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.ShippingPassUtil;
import com.walmart.android.util.WalmartPrice;
import com.walmart.android.utils.CrossfadeAnimationHandler;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.CartManager;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.ItemImageDownloaderFactory;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmui.PercentageView;
import com.walmart.android.wmui.WalmartShareActionProvider;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.walmart.android.app.item:
//            ItemState, ItemLogic, BundleConfiguration, VariantController, 
//            ItemReviewsPresenter, AdditionalSellersActivity, ProductImagePresenter, ReturnPolicyActivity, 
//            AboutItemPresenter, BundleSummaryPresenter, StoreAvailabilityListPresenter

public class ItemDetailsPresenter extends Presenter
    implements ItemState.ItemStateChangeListener
{
    private static class ItemDetailsPageViewEventController
    {

        private String mAisleMapped;
        private List mAisleNotMapped;
        private com.walmartlabs.anivia.AniviaEventAsJson.Builder mBuilder;
        private boolean mGotAisles;
        private boolean mGotAvailabilityData;
        private boolean mGotProductType;
        private boolean mGotRecommendationModule;
        private boolean mGotStoreId;
        private boolean mHasRecommendationModule;
        private final String mItemId;
        private Boolean mOnlineAvailability;
        private String mProductName;
        private String mProductType;
        private final Resources mResources;
        private String mStoreAvailability;
        private String mStoreId;
        private String mUpc;

        private void createEvent()
        {
            mBuilder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "product detail").putString("section", "shop").putString("itemId", mItemId);
        }

        private boolean isComplete()
        {
            return mGotRecommendationModule && mGotAvailabilityData && mGotProductType && mGotStoreId && mGotAisles;
        }

        private void sendEvent()
        {
            if (!TextUtils.isEmpty(mUpc))
            {
                mBuilder.putString("upc", mUpc);
            }
            if (!TextUtils.isEmpty(mProductName))
            {
                mBuilder.putString("productName", mProductName);
            }
            if (mOnlineAvailability != null)
            {
                com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = mBuilder;
                String s;
                if (mOnlineAvailability.booleanValue())
                {
                    s = mResources.getString(0x7f09056c);
                } else
                {
                    s = mResources.getString(0x7f09056e);
                }
                builder.putString("onlineAvailability", s);
            }
            if (mGotRecommendationModule)
            {
                mBuilder.putBoolean("recModule", mHasRecommendationModule);
            }
            if (!TextUtils.isEmpty(mStoreId))
            {
                mBuilder.putString("storeId", mStoreId);
            }
            if (!TextUtils.isEmpty(mStoreAvailability) && !TextUtils.isEmpty(mStoreId))
            {
                mBuilder.putString("storeAvailability", mStoreAvailability);
            }
            if (!TextUtils.isEmpty(mProductType))
            {
                mBuilder.putString("prodType", mProductType);
            }
            if (!TextUtils.isEmpty(mAisleMapped))
            {
                mBuilder.putString("aisleMapped", String.valueOf(mAisleMapped));
            }
            if (mAisleNotMapped != null && !mAisleNotMapped.isEmpty())
            {
                mBuilder.putString("aisleNotMapped", StringUtils.join(mAisleNotMapped.toArray(new String[mAisleNotMapped.size()]), ','));
            }
            MessageBus.getBus().post(mBuilder);
        }

        private void sendIfComplete()
        {
            if (isComplete())
            {
                sendEvent();
            }
        }

        public void pageClosed()
        {
            if (!isComplete())
            {
                sendEvent();
            }
        }

        public void pageViewed()
        {
            createEvent();
            sendIfComplete();
        }

        public void setAisles(String s, List list)
        {
            mAisleMapped = s;
            mAisleNotMapped = list;
            mGotAisles = true;
            sendIfComplete();
        }

        public void setHasRecommendationModule(boolean flag)
        {
            mHasRecommendationModule = flag;
            mGotRecommendationModule = true;
            sendIfComplete();
        }

        public void setItemModel(ItemModel itemmodel, ItemState itemstate)
        {
            mUpc = itemmodel.getUpc();
            mProductName = itemmodel.getProductName();
            itemmodel = itemstate.getSelectedBuyingOption();
            if (itemmodel != null)
            {
                itemmodel = Boolean.valueOf(itemmodel.isAvailable());
            } else
            {
                itemmodel = null;
            }
            mOnlineAvailability = itemmodel;
            sendIfComplete();
        }

        public void setProductType(ProductType producttype)
        {
            if (producttype != null)
            {
                mProductType = producttype.toString();
            }
            mGotProductType = true;
            sendIfComplete();
        }

        public void setStoreAvailability(StoreAvailabilityData storeavailabilitydata, String s)
        {
            if (storeavailabilitydata != null)
            {
                setStoreId(storeavailabilitydata.storeId);
                mStoreAvailability = storeavailabilitydata.stockStatus;
            } else
            {
                mStoreAvailability = s;
            }
            mGotAvailabilityData = true;
            sendIfComplete();
        }

        public void setStoreId(String s)
        {
            mStoreId = s;
            mGotStoreId = true;
            sendIfComplete();
        }

        public ItemDetailsPageViewEventController(Resources resources, String s)
        {
            mResources = resources;
            mItemId = s;
        }
    }

    private class MapLoadingCallbacks
        implements com.walmart.android.app.shop.map.InStoreMapController.LoadingCallbacks
    {

        final ItemDetailsPresenter this$0;

        private void updateAnalyticsEvent()
        {
            if (mStoreMapSectionController.getSourceDataMapper().hasAllData() && mStoreMapSectionController.isMapLoaded())
            {
                Object obj = mStoreMapSectionController.getSourceDataMapper().getMappedSections().getAnalyticsMappedLocations();
                ItemDetailsPageViewEventController itemdetailspagevieweventcontroller = mPageEvent;
                if (!((List) (obj)).isEmpty())
                {
                    obj = (String)((List) (obj)).get(0);
                } else
                {
                    obj = null;
                }
                itemdetailspagevieweventcontroller.setAisles(((String) (obj)), mStoreMapSectionController.getSourceDataMapper().getMappedSections().getAnalyticsMissingLocations());
            }
        }

        public void onAislesLoaded()
        {
            updateAnalyticsEvent();
        }

        public void onMapFail()
        {
            mPageEvent.setAisles(null, null);
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
            this$0 = ItemDetailsPresenter.this;
            super();
        }

    }


    private static final int DIALOG_REMOVE_FROM_BUNDLE = 1;
    private static final int DIALOG_REPLACE_IN_BUNDLE = 2;
    private static final int DIALOG_SELECT_VARIANT_ADD = 3;
    private static final String FULL_SITE_PRODUCT_URL = "http://www.walmart.com/msharbor%s?adid=1500000000000033643520&veh=mappa";
    private static final int INCOMPLETE_VARIANT_SELECTION_ERROR = -1001;
    private static final int INVALID_STOCK_STATUS = -1002;
    private static final int NO_AVAILABILITY_ERROR = -1;
    private static final int REQUEST_CODE_ADDITIONAL_SELLER = 1;
    private static final String TAG = com/walmart/android/app/item/ItemDetailsPresenter.getSimpleName();
    private Activity mActivity;
    ImageUrlAdapter mAdapter;
    private boolean mAddingToCart;
    private StoreAvailabilityData mAvailabilityData;
    private BundleConfiguration.BundleGroupConfiguration mBundleGroupConfiguration;
    private int mDialogConfig;
    private final Handler mHandler;
    private boolean mHasLoadedItemData;
    private boolean mHasPopulatedItemDetails;
    private View mHeaderView;
    ImageDownloader mImageDownloader;
    ImagePagerController mImagePagerController;
    private InStoreView mInStoreView;
    private boolean mIsPushed;
    private boolean mIsRecommendedItem;
    private String mItemId;
    private Map mItemIdAvailabilityLookup;
    private ItemLogic mItemLogic;
    private ItemModel mItemModel;
    private final ItemState mItemState;
    private ListInfo mListInfo;
    private Request mOngoingVariantBuyingOptionRequest;
    private OnlineView mOnlineView;
    private ItemDetailsPageViewEventController mPageEvent;
    private boolean mPreselectVariant;
    private RecommendedItemsView mRecommendedItemsView;
    private final List mRequestsInFlight;
    private ViewGroup mRootView;
    private SellersView mSellersView;
    private MenuItem mShareMenuItem;
    private InStoreMapSectionController mStoreMapSectionController;
    private VariantController mVariantController;

    public ItemDetailsPresenter(Activity activity, ItemModel itemmodel)
    {
        mHandler = new Handler();
        mRequestsInFlight = new ArrayList();
        mItemIdAvailabilityLookup = new HashMap();
        mDialogConfig = 0;
        mItemState = new ItemState();
        mHasLoadedItemData = true;
        init(activity, itemmodel.getItemId());
        setItemModel(itemmodel);
    }

    public ItemDetailsPresenter(Activity activity, String s)
    {
        mHandler = new Handler();
        mRequestsInFlight = new ArrayList();
        mItemIdAvailabilityLookup = new HashMap();
        mDialogConfig = 0;
        mItemState = new ItemState();
        init(activity, s);
        setItemModel((new com.walmart.android.service.item.ItemModel.Builder()).build());
    }

    private void addBundleToCart(String s, List list)
    {
        final String itemId = mItemLogic.getSelectedItemId();
        if (mItemLogic.isPickupOnly())
        {
            WalmartStore walmartstore = AvailabilityUtils.getPreferredOrDummyStore(mActivity);
            Services.get().getCartManager().addGrouping(s, list, 1, mListInfo, walmartstore.getIntegerStoreId(), WalmartStore.getLocation(walmartstore), new CallbackSameThread() {

                final ItemDetailsPresenter this$0;
                final String val$itemId;

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                    handleAddToCartResult(request, result, itemId);
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                itemId = s;
                super();
            }
            });
        } else
        {
            Services.get().getCartManager().addGrouping(s, list, 1, mListInfo, new CallbackSameThread() {

                final ItemDetailsPresenter this$0;
                final String val$itemId;

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                    handleAddToCartResult(request, result, itemId);
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                itemId = s;
                super();
            }
            });
        }
        mOnlineView.updateAddToCart(0x7f09006e, false);
        s = mItemLogic.getOnlinePrice().getPriceString();
        list = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("addToCart")).putString("itemId", itemId);
        if (s != null)
        {
            s = CartUtils.formatPriceForAnalytics(s);
        } else
        {
            s = "";
        }
        s = list.putString("itemPrice", s).putString("prodType", getProductType().toString()).putString("unitCount", "1");
        MessageBus.getBus().post(s);
        mAddingToCart = true;
    }

    private void addDescription(com.walmart.android.service.item.DescriptionModel.Description description)
    {
        if (description == null || !description.hasText())
        {
            return;
        } else
        {
            ((ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001a8)).addView((new com.walmart.android.app.item.view.ModuleView.Builder(mActivity)).setTitle(description.getTitle()).setContent(description.getText()).build());
            return;
        }
    }

    private void addToCart()
    {
        final String itemId = mItemLogic.getSelectedItemId();
        CartManager cartmanager = Services.get().getCartManager();
        CallbackSameThread callbacksamethread = new CallbackSameThread() {

            final ItemDetailsPresenter this$0;
            final String val$itemId;

            public void onResultSameThread(Request request, Result result)
            {
                super.onResultSameThread(request, result);
                handleAddToCartResult(request, result, itemId);
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                itemId = s;
                super();
            }
        };
        Object obj;
        if (mItemState.getSelectedBuyingOption() != null)
        {
            obj = mItemState.getSelectedBuyingOption().getOfferId();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            if (mItemLogic.isPickupOnly())
            {
                WalmartStore walmartstore = AvailabilityUtils.getPreferredOrDummyStore(mActivity);
                cartmanager.addItem(((String) (obj)), 1, mListInfo, walmartstore.getIntegerStoreId(), WalmartStore.getLocation(walmartstore), callbacksamethread);
            } else
            {
                cartmanager.addItem(((String) (obj)), 1, mListInfo, callbacksamethread);
            }
        }
        mOnlineView.updateAddToCart(0x7f09006e, false);
        obj = mItemLogic.getOnlinePrice().getPriceString();
        itemId = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("addToCart")).putString("itemId", itemId);
        if (obj != null)
        {
            obj = CartUtils.formatPriceForAnalytics(((String) (obj)));
        } else
        {
            obj = "";
        }
        obj = itemId.putString("itemPrice", ((String) (obj))).putString("prodType", getProductType().toString()).putString("unitCount", "1");
        MessageBus.getBus().post(obj);
        mAddingToCart = true;
    }

    private void cancelRequestsInFlight()
    {
        for (Iterator iterator = mRequestsInFlight.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mRequestsInFlight.clear();
        if (mOngoingVariantBuyingOptionRequest != null)
        {
            mOngoingVariantBuyingOptionRequest.cancel();
        }
    }

    static TextView createFlag(int i, int j, int k, String s, Context context)
    {
        TextView textview = new TextView(context);
        textview.setBackgroundResource(i);
        textview.setGravity(17);
        textview.setTextAppearance(context, 0x7f0b0049);
        textview.setTextColor(-1);
        textview.setPadding(j, k, j, k);
        textview.setText(s);
        return textview;
    }

    private void createImageController()
    {
        View view = mRootView.findViewById(0x7f1001b8);
        mImagePagerController = new ImagePagerController(mActivity, view, 1.0F);
        mImagePagerController.setOnImageClickListener(new com.walmart.android.app.ui.ImagePagerController.OnImageClickedListener() {

            final ItemDetailsPresenter this$0;

            public void OnImageClickListener(String s)
            {
                s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("enlargePic")).putString("itemId", mItemId);
                MessageBus.getBus().post(s);
                s = new ProductImagePresenter(mActivity, mItemLogic.getProductImageUrls());
                pushPresenter(s);
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
        });
        mAdapter.setImageUrls(mItemLogic.getProductImageUrls(), 0);
        mImagePagerController.init(mAdapter);
        mImagePagerController.setWidthParam(ViewUtil.getScreenMinDimension(mActivity));
    }

    private void fetchAndUpdateVariantBuyingOption(com.walmart.android.service.item.VariantsModel.VariantItem variantitem)
    {
        if (mOngoingVariantBuyingOptionRequest != null)
        {
            mOngoingVariantBuyingOptionRequest.cancel();
        }
        mItemState.setIsFetchingBuyingOption(true);
        variantitem = variantitem.getItemId();
        mOngoingVariantBuyingOptionRequest = Services.get().getItemService().getBuyingOption(variantitem, new String[] {
            AvailabilityUtils.getPreferredStore(mActivity)
        }).addCallback(new CallbackSameThread(variantitem) {

            final ItemDetailsPresenter this$0;
            final String val$variantId;

            public void onResultSameThread(Request request, Result result)
            {
                Object obj1 = null;
                mOngoingVariantBuyingOptionRequest = null;
                mItemState.setIsFetchingBuyingOption(false);
                Object obj = null;
                request = obj;
                if (result.successful())
                {
                    request = obj;
                    if (result.hasData())
                    {
                        request = (BuyingOptionModel)result.getData();
                        mItemModel.getVariantsModel().updateVariantBuyingOption(variantId, request);
                        mItemState.setSelectedBuyingOption(request);
                        result = obj1;
                        if (request != null)
                        {
                            result = request.getStoreItemModel(AvailabilityUtils.getPreferredStore(mActivity));
                        }
                        request = obj;
                        if (result != null)
                        {
                            request = new StoreAvailabilityData(result);
                            mItemIdAvailabilityLookup.put(variantId, request);
                        }
                    }
                }
                updatePrice();
                mOnlineView.setAddToCartEnabled(true);
                populateAvailability(request, Integer.valueOf(ItemDetailsPresenter.validateStockStatus(request)));
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                variantId = s;
                super(final_context);
            }
        });
    }

    private String getLowestNonSelectedPrice(List list)
    {
        BuyingOptionModel buyingoptionmodel = mItemState.getSelectedBuyingOption();
        if (buyingoptionmodel == null || buyingoptionmodel.getPrice() == null || buyingoptionmodel.getPrice().getPriceString() == null)
        {
            return "";
        }
        list = new ArrayList(list);
        Collections.sort(list, new com.walmart.android.service.item.BuyingOptionModel.BuyingOptionPriceComparator());
        if (buyingoptionmodel.getPrice().getPriceInCents() == ((BuyingOptionModel)list.get(0)).getPrice().getPriceInCents())
        {
            return ((BuyingOptionModel)list.get(1)).getPrice().getPriceString();
        } else
        {
            return ((BuyingOptionModel)list.get(0)).getPrice().getPriceString();
        }
    }

    private List getOfferConfigurations()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = (new BundleConfiguration(mItemModel.getBundleModel())).getStandardGroupConfigurations().iterator(); iterator.hasNext();)
        {
            BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration = (BundleConfiguration.BundleGroupConfiguration)iterator.next();
            Iterator iterator1 = bundlegroupconfiguration.getSelectedOptions().iterator();
            while (iterator1.hasNext()) 
            {
                com.walmart.android.service.item.BundleModel.GroupOption groupoption = (com.walmart.android.service.item.BundleModel.GroupOption)iterator1.next();
                arraylist.add(new com.walmart.android.service.cart.CartService.OfferConfiguration(bundlegroupconfiguration.getOfferId(groupoption), groupoption.getQuantity()));
            }
        }

        return arraylist;
    }

    private ProductType getProductType()
    {
        ProductType producttype = ProductType.REGULAR;
        if (mItemModel.isGrouping())
        {
            producttype = ProductType.BUNDLE;
        } else
        {
            if (mItemModel.isElectronicGiftCard())
            {
                return ProductType.EGIFTCARD;
            }
            if (mItemModel.isPhysicalGiftCard())
            {
                return ProductType.GIFTCARD;
            }
            if (mItemLogic.isPreorder())
            {
                return ProductType.PREORDER;
            }
            if (mItemModel.isMarketPlaceOnlyItem())
            {
                return ProductType.MARKETPLACE;
            }
        }
        return producttype;
    }

    private Intent getShareIntent()
    {
        Intent intent = null;
        String s = mItemLogic.getItemWwwUrl();
        if (!TextUtils.isEmpty(s))
        {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "View this Walmart product");
            intent.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(mItemModel.getProductName()).append("\n\n").append(s).toString());
            intent.putExtra("walmart_extra_itemid", mItemId);
        }
        return intent;
    }

    private void handleAddToCartResult(Request request, Result result, String s)
    {
        if (!result.successful() || !result.hasData()) goto _L2; else goto _L1
_L1:
        trackAddItem("Item Page Add to Cart", s);
        if (!isPopped()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        mItemState.setAddedToCart();
        onItemAdded();
        return;
_L2:
        if (!isPopped())
        {
            char c;
            if (result.hasError() && result.getError().connectionError())
            {
                c = '\u0258';
            } else
            {
                c = '\u0384';
            }
            DialogFactory.showDialog(c, mActivity);
            resetAddToCartButton();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void hideReviewSection()
    {
        ViewUtil.findViewById(mRootView, 0x7f1001e0).setVisibility(8);
        ViewUtil.findViewById(mRootView, 0x7f1001e1).setVisibility(0);
        ViewUtil.findViewById(mRootView, 0x7f1001de).setVisibility(8);
        ViewUtil.findViewById(mRootView, 0x7f1001e3).setVisibility(8);
    }

    private void init(Activity activity, String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("init(): itemId = ").append(s).toString());
        mActivity = activity;
        mItemId = s;
        mItemState.setItemStateChangeListener(this);
        setTitleText(mActivity.getString(0x7f0901ca));
        mImageDownloader = ItemImageDownloaderFactory.createImageDownloader(mActivity);
        mAdapter = new ImageUrlAdapter(mActivity, mImageDownloader);
        mVariantController = new VariantController(mActivity);
        mPageEvent = new ItemDetailsPageViewEventController(mActivity.getResources(), mItemId);
        mStoreMapSectionController = new InStoreMapSectionController(activity, new ItemSourceDataMapper(), new MapLoadingCallbacks());
    }

    private boolean isSelectedInBundle()
    {
label0:
        {
label1:
            {
                boolean flag = false;
                com.walmart.android.service.item.BundleModel.GroupOption groupoption = mItemState.getBundleOption();
                if (mBundleGroupConfiguration.isSelected(groupoption))
                {
                    if (!groupoption.isVariant())
                    {
                        break label0;
                    }
                    if (!mItemState.hasSelectedVariant() || !mBundleGroupConfiguration.isVariantSelected(groupoption, mItemState.getSelectedItemId()))
                    {
                        break label1;
                    }
                    flag = true;
                }
                return flag;
            }
            return false;
        }
        return true;
    }

    private com.walmart.android.app.item.view.OnlineView.AddToButtonState isVariantsSelected()
    {
        com.walmart.android.app.item.view.OnlineView.AddToButtonState addtobuttonstate1 = com.walmart.android.app.item.view.OnlineView.AddToButtonState.ENABLED;
        com.walmart.android.app.item.view.OnlineView.AddToButtonState addtobuttonstate = addtobuttonstate1;
        if (mItemModel.hasVariants())
        {
            addtobuttonstate = addtobuttonstate1;
            if (!mItemState.hasSelectedVariant())
            {
                addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.DISABLED;
            }
        }
        return addtobuttonstate;
    }

    private void loadItemDetails()
    {
        if (!mHasLoadedItemData)
        {
            Request request = Services.get().getItemService().getItem(mItemId, new String[] {
                AvailabilityUtils.getPreferredStore(mActivity)
            }).addCallback(new CallbackSameThread(mActivity) {

                final ItemDetailsPresenter this$0;

                private ItemModel validateAndGetModel(Result result)
                {
                    Object obj = null;
                    ItemModel itemmodel = obj;
                    if (result.successful())
                    {
                        itemmodel = obj;
                        if (result.hasData())
                        {
                            itemmodel = obj;
                            if (((ItemModel)result.getData()).getItemId() != null)
                            {
                                itemmodel = (ItemModel)result.getData();
                            }
                        }
                    }
                    return itemmodel;
                }

                public void onResultSameThread(Request request1, Result result)
                {
                    super.onResultSameThread(request1, result);
                    mHasLoadedItemData = true;
                    mRequestsInFlight.remove(request1);
                    request1 = validateAndGetModel(result);
                    if (request1 != null)
                    {
                        setItemModel(request1);
                        sendAppIndexEvent();
                        if (mIsPushed)
                        {
                            populateItem();
                        }
                        return;
                    }
                    pop();
                    if (result.hasError() && result.getError().equals(com.walmartlabs.kangaroo.Result.Error.ERROR_NOT_CONNECTED))
                    {
                        DialogFactory.showDialog(600, mActivity);
                        return;
                    } else
                    {
                        DialogFactory.showDialog(2, mActivity);
                        return;
                    }
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(context);
            }
            });
            mRequestsInFlight.add(request);
        }
    }

    private void loadRecommendedItems()
    {
        Request request = Services.get().getItemRecommendationService().getRecommendations(mItemId).addCallback(new CallbackSameThread(mActivity) {

            final ItemDetailsPresenter this$0;

            private com.walmart.android.data.ItemRecommendationResult.Module validateAndGetModule(Result result)
            {
                Object obj = null;
                Result result1 = obj;
                if (result.successful())
                {
                    result1 = obj;
                    if (result.hasData())
                    {
                        result = (ItemRecommendationResult)result.getData();
                        result1 = obj;
                        if (((ItemRecommendationResult) (result)).result != null)
                        {
                            result1 = obj;
                            if (((ItemRecommendationResult) (result)).result.modules != null)
                            {
                                result = ((ItemRecommendationResult) (result)).result.modules[0];
                                result1 = obj;
                                if (result != null)
                                {
                                    result1 = obj;
                                    if (!TextUtils.isEmpty(((com.walmart.android.data.ItemRecommendationResult.Module) (result)).moduleTitle))
                                    {
                                        result1 = obj;
                                        if (((com.walmart.android.data.ItemRecommendationResult.Module) (result)).recommendedItems != null)
                                        {
                                            result1 = obj;
                                            if (((com.walmart.android.data.ItemRecommendationResult.Module) (result)).recommendedItems.length > 0)
                                            {
                                                result1 = result;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return result1;
            }

            public void onResultSameThread(Request request1, Result result)
            {
                mRequestsInFlight.remove(request1);
                if (isPopped())
                {
                    return;
                }
                request1 = validateAndGetModule(result);
                if (request1 != null)
                {
                    populateAndShowRecommendedItems(request1);
                }
                result = mPageEvent;
                boolean flag;
                if (request1 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                result.setHasRecommendationModule(flag);
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(context);
            }
        });
        mRequestsInFlight.add(request);
    }

    private void loadReturnPolicy()
    {
        Services.get().getItemService().getReturnPolicy(mItemModel.getPrimarySellerId()).addCallback(new CallbackSameThread() {

            final ItemDetailsPresenter this$0;

            public void onResultSameThread(Request request, Result result)
            {
                if (result.successful() && result.hasData())
                {
                    mOnlineView.showReturnPolicy();
                    mOnlineView.setReturnPolicyListener(result. new android.view.View.OnClickListener() {

                        final _cls10 this$1;
                        final Result val$result;

                        public void onClick(View view)
                        {
                            mActivity.startActivity(ReturnPolicyActivity.makeIntent(mActivity, (String)result.getData()));
                        }

            
            {
                this$1 = final__pcls10;
                result = Result.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
        });
    }

    private void onPageClosed()
    {
        mPageEvent.pageClosed();
    }

    private void populateAndShowRecommendedItems(com.walmart.android.data.ItemRecommendationResult.Module module)
    {
        mRecommendedItemsView.setTitle(module.moduleTitle);
        mRecommendedItemsView.clearRecommendedItems();
        com.walmart.android.data.ItemRecommendationResult.RecommendedItem arecommendeditem[] = module.recommendedItems;
        int i = 0;
        while (i < arecommendeditem.length) 
        {
            com.walmart.android.data.ItemRecommendationResult.RecommendedItem recommendeditem = arecommendeditem[i];
            module = recommendeditem.itemId;
            if (!mItemId.equals(module))
            {
                if (!TextUtils.isEmpty(recommendeditem.submapType))
                {
                    module = mActivity.getString(0x7f0901c3);
                } else
                {
                    module = WalmartPrice.fromString(recommendeditem.currentPrice).toString();
                }
                mRecommendedItemsView.addRecommendedItem(recommendeditem.productName, UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_100, recommendeditem.httpImageLink), module, recommendeditem.rating, new OnSingleClickListener(recommendeditem) {

                    final ItemDetailsPresenter this$0;
                    final com.walmart.android.data.ItemRecommendationResult.RecommendedItem val$item;

                    public void onSingleClick(View view)
                    {
                        MessageBus.getBus().post(new ProductViewSource(Source.RECOMMENDED_ITEM));
                        view = item.itemId;
                        ItemDetailsPresenter itemdetailspresenter = new ItemDetailsPresenter(mActivity, view);
                        itemdetailspresenter.setIsRecommendedItem(true);
                        pushPresenter(itemdetailspresenter);
                        GoogleAnalytics.trackEvent("Recommendations", "Item Page Tap", view);
                        view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("recProdView")).putString("itemId", mItemId).putString("recItemId", view);
                        MessageBus.getBus().post(view);
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                item = recommendeditem;
                super(final_presenter);
            }
                });
            }
            i++;
        }
        mRootView.findViewById(0x7f1001ed).setVisibility(0);
    }

    private void populateAvailability(StoreAvailabilityData storeavailabilitydata, Integer integer)
    {
        if (isPopped())
        {
            return;
        }
        if (storeavailabilitydata != null)
        {
            WLog.d(TAG, (new StringBuilder()).append("populateAvailability(): Populating store availability for itemId = ").append(storeavailabilitydata.wwwItemId).append(", upc = ").append(storeavailabilitydata.upc).append(" (").append(storeavailabilitydata.name).append(" / ").append(storeavailabilitydata.price).append(")").toString());
        } else
        {
            WLog.d(TAG, "populateAvailability(): availabilityData == null");
        }
        mItemState.setStoreAvailability(storeavailabilitydata);
        if (integer.intValue() == -1)
        {
            if (storeavailabilitydata != null)
            {
                mPageEvent.setStoreAvailability(storeavailabilitydata, null);
                setupInStoreView(storeavailabilitydata);
            } else
            {
                mPageEvent.setStoreAvailability(null, "not carried");
                setupInStoreViewForNotCarried();
            }
        } else
        if (integer.intValue() == -1001)
        {
            WLog.i(TAG, "populateAvailability(): Incomplete variant selection");
            setupInStoreViewForIncompleteSelectionError();
        } else
        {
            WLog.i(TAG, (new StringBuilder()).append("Availability response error: ").append(integer).toString());
            mPageEvent.setStoreAvailability(null, "availability unknown");
            setupInStoreViewForAvailabilityError();
        }
        mInStoreView.setLoading(false);
    }

    private void populateDescriptions()
    {
        DescriptionModel descriptionmodel = mItemModel.getDescriptionModel();
        View view = ViewUtil.findViewById(mRootView, 0x7f1001b2);
        CharSequence charsequence = mItemLogic.getDetailedProductDescription();
        CharSequence charsequence1 = mItemLogic.getShortProductDescription();
        if (!TextUtils.isEmpty(charsequence1))
        {
            ViewUtil.setText(0x7f1001b4, view, charsequence1);
            if (charsequence != null)
            {
                view.setOnClickListener(new OnSingleClickListener(descriptionmodel) {

                    final ItemDetailsPresenter this$0;
                    final DescriptionModel val$dm;

                    public void onSingleClick(View view1)
                    {
                        pushPresenter(new AboutItemPresenter(mActivity, mItemId, mItemModel.getProductName(), getProductType().toString(), dm));
                        GoogleAnalytics.trackEvent("Item Details", "More Item Description", "");
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                dm = descriptionmodel;
                super(final_presenter);
            }
                });
            }
        } else
        {
            view.setVisibility(8);
        }
        descriptionmodel = mItemModel.getDescriptionModel();
        addDescription(descriptionmodel.getPricingPolicy());
        addDescription(descriptionmodel.getManufacturerInformation());
        addDescription(descriptionmodel.getDisclaimer());
    }

    private void populateItem()
    {
        mHasPopulatedItemDetails = true;
        ViewUtil.setText(0x7f1001a2, mRootView, mItemModel.getProductName());
        createImageController();
        setStarRating(mRootView, mItemModel.getReviewData().getAverageOverallRating());
        updateShippingPassLogo();
        setupExtraInformation();
        setupVariants();
        updateFlags();
        updateOnlineSection();
        updateSellersSection();
        updateStoreAvailability();
        populateDescriptions();
        populateReviewData();
        loadRecommendedItems();
        updateRegistryAndListButtons();
        updateAddToCartButton();
        updateOptionsMenu();
        showItem();
        loadReturnPolicy();
    }

    private void populateRatingDistributionView(Map map, int i)
    {
        if (map == null)
        {
            ViewUtil.findViewById(mRootView, 0x7f1001de).setVisibility(8);
        } else
        {
            Object obj = (TextView)ViewUtil.findViewById(mRootView, 0x7f1001e0);
            ((TextView) (obj)).setText(mActivity.getString(0x7f090196, new Object[] {
                Integer.valueOf(i)
            }));
            ((TextView) (obj)).setVisibility(0);
            ViewUtil.findViewById(mRootView, 0x7f1001de).setOnClickListener(new OnSingleClickListener(this) {

                final ItemDetailsPresenter this$0;

                public void onSingleClick(View view)
                {
                    showItemReviewsPresenter();
                    GoogleAnalytics.trackEvent("Item Details", "Reviews", "Section");
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
            });
            obj = (TableLayout)ViewUtil.findViewById(mRootView, 0x7f1001e2);
            LayoutInflater layoutinflater = mActivity.getLayoutInflater();
            int j = 5;
            while (j > 0) 
            {
                setRatingEntry(layoutinflater, ((TableLayout) (obj)), j, ((Integer)map.get(Integer.valueOf(j))).intValue(), i);
                j--;
            }
        }
    }

    private void populateRecommendedView(int i, int j)
    {
        if (i < 0)
        {
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1001e3).setVisibility(0);
            ((PercentageView)ViewUtil.findViewById(mRootView, 0x7f1001e4)).setPercentage(i);
            ((TextView)ViewUtil.findViewById(mRootView, 0x7f1001e5)).setText(String.format(mActivity.getResources().getString(0x7f0901a1), new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            }));
            return;
        }
    }

    private void populateReviewData()
    {
        if (!TextUtils.isDigitsOnly(mItemId) || !mItemModel.hasReviewData())
        {
            hideReviewSection();
            return;
        } else
        {
            TextView textview = (TextView)ViewUtil.findViewById(mRootView, 0x7f1001e7);
            textview.setText(mActivity.getResources().getQuantityString(0x7f110005, mItemModel.getReviewData().getTotalReviewCount(), new Object[] {
                Integer.valueOf(mItemModel.getReviewData().getTotalReviewCount())
            }));
            textview.setVisibility(0);
            textview.setOnClickListener(new android.view.View.OnClickListener() {

                final ItemDetailsPresenter this$0;

                public void onClick(View view)
                {
                    showItemReviewsPresenter();
                    GoogleAnalytics.trackEvent("Item Details", "Reviews", "Header");
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            });
            populateRatingDistributionView(mItemModel.getReviewData().getRatingDistribution(), mItemModel.getReviewData().getTotalReviewCount());
            populateRecommendedView(mItemModel.getReviewData().getRecommendedPercentage(), mItemModel.getReviewData().getTotalReviewCount());
            return;
        }
    }

    private void removeListeners()
    {
        View view = ViewUtil.findViewById(mRootView, 0x7f1001e7);
        if (view != null)
        {
            view.setOnClickListener(null);
        }
        view = ViewUtil.findViewById(mRootView, 0x7f1001de);
        if (view != null)
        {
            view.setOnClickListener(null);
        }
        if (mInStoreView != null)
        {
            mInStoreView.setOtherStoresAvailabilityClickListener(null);
        }
        view = ViewUtil.findViewById(mRootView, 0x7f1001b2);
        if (view != null)
        {
            view.setOnClickListener(null);
        }
        if (mOnlineView != null)
        {
            mOnlineView.setAddToCartListener(null);
        }
        if (mSellersView != null)
        {
            mSellersView.setOnClickListener(null);
        }
    }

    private void resetAddToCartButton()
    {
        if (!isPopped() && mAddingToCart)
        {
            OnlineView onlineview = mOnlineView;
            int i;
            if (mItemLogic.isPreorder())
            {
                i = 0x7f090467;
            } else
            {
                i = 0x7f09006a;
            }
            onlineview.updateAddToCart(i, true);
            updatePrice();
            mAddingToCart = false;
        }
    }

    private void sendAppIndexEvent()
    {
        if (!TextUtils.isEmpty(mItemModel.getProductName()) && mItemLogic.getItemAppUrl() != null)
        {
            Object obj = mItemLogic.getItemWwwUrl();
            Uri uri = null;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                uri = Uri.parse(((String) (obj)));
            }
            obj = Uri.parse(mItemLogic.getItemAppUrl());
            MessageBus.getBus().post(new AppIndexEvent(this, mItemModel.getProductName(), uri, ((Uri) (obj))));
        }
    }

    public static void setAisleFlags(ViewGroup viewgroup, String as[], Context context)
    {
        int j = Math.min(3, as.length);
        int k = ViewUtil.dpToPixels(8, context);
        int l = ViewUtil.dpToPixels(2, context);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.rightMargin = ViewUtil.dpToPixels(5, context);
        for (int i = 0; i < j; i++)
        {
            viewgroup.addView(createFlag(0x7f0201be, k, l, as[i], context), layoutparams);
        }

    }

    private void setItemModel(ItemModel itemmodel)
    {
        mItemModel = itemmodel;
        mItemState.setSelectedBuyingOption(itemmodel.getPrimaryBuyingOption());
        mItemLogic = new ItemLogic(mItemModel, mItemState);
        mPageEvent.setItemModel(mItemModel, mItemState);
        mPageEvent.setProductType(getProductType());
    }

    private void setRatingEntry(LayoutInflater layoutinflater, TableLayout tablelayout, int i, int j, int k)
    {
        layoutinflater = layoutinflater.inflate(0x7f040085, null);
        ((StarsView)layoutinflater.findViewById(0x7f1001da)).setValue(i);
        tablelayout.addView(layoutinflater);
        ((TextView)layoutinflater.findViewById(0x7f1001dd)).setText(String.valueOf(j));
        if (k > 0)
        {
            int l = ViewUtil.dpToPixels(10, mActivity);
            float f = (float)j / (float)k;
            i = 0x7f020056;
            if (j == k)
            {
                i = 0x7f020057;
            }
            tablelayout = layoutinflater.findViewById(0x7f1001db);
            tablelayout.setBackgroundResource(i);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)tablelayout.getLayoutParams();
            layoutparams.height = l;
            layoutparams.width = 0;
            layoutparams.weight = f;
            tablelayout.setLayoutParams(layoutparams);
            layoutinflater = layoutinflater.findViewById(0x7f1001dc);
            tablelayout = (android.widget.LinearLayout.LayoutParams)layoutinflater.getLayoutParams();
            tablelayout.height = l;
            tablelayout.width = 0;
            tablelayout.weight = 1.0F - f;
            layoutinflater.setLayoutParams(tablelayout);
        }
    }

    private void setStarRating(ViewGroup viewgroup, float f)
    {
        viewgroup = (StarsView)ViewUtil.findViewById(viewgroup, 0x7f1001e6);
        if (f > 0.0F)
        {
            viewgroup.setVisibility(0);
            viewgroup.setValue(f);
            return;
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    private void setupExtraInformation()
    {
        Object obj = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001a3);
        TextView textview1 = (TextView)ViewUtil.findViewById(((View) (obj)), 0x7f1001b5);
        TextView textview = (TextView)ViewUtil.findViewById(((View) (obj)), 0x7f1001b6);
        if (mItemModel.isElectronicGiftCard())
        {
            ((ViewGroup) (obj)).setVisibility(0);
            textview1.setText(0x7f09017a);
            textview.setText(mActivity.getString(0x7f090179));
        } else
        if (mItemModel.isConfigurableBundle())
        {
            ((ViewGroup) (obj)).setVisibility(0);
            obj = mItemModel.getBundleModel();
            Object obj1 = new ArrayList(((BundleModel) (obj)).getStandardGroups());
            ((List) (obj1)).addAll(((BundleModel) (obj)).getRequiredGroups());
            obj = new StringBuilder();
            com.walmart.android.service.item.BundleModel.BundleGroup bundlegroup;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((StringBuilder) (obj)).append(mActivity.getString(0x7f090093)).append(" ").append(bundlegroup.getTitle()))
            {
                bundlegroup = (com.walmart.android.service.item.BundleModel.BundleGroup)((Iterator) (obj1)).next();
                if (((StringBuilder) (obj)).length() > 0)
                {
                    ((StringBuilder) (obj)).append("\n");
                }
            }

            textview.setText(((StringBuilder) (obj)).toString());
            return;
        }
    }

    private void setupInStoreView(StoreAvailabilityData storeavailabilitydata)
    {
        String s = storeavailabilitydata.storeAddress;
        Object obj = s;
        if (!TextUtils.isEmpty(s))
        {
            obj = mActivity.getString(0x7f090193, new Object[] {
                s
            });
        }
        mInStoreView.setStoreDetails(((String) (obj)));
        obj = AvailabilityUtils.getStockString(mActivity, storeavailabilitydata.stockStatus);
        mInStoreView.setAvailability(((CharSequence) (obj)));
        mInStoreView.setAisleLocationsForDepartment(storeavailabilitydata.aisleLocations, storeavailabilitydata.department);
        obj = mItemLogic.getInStorePrice();
        mInStoreView.setPrice(((ItemPrice) (obj)).getPriceString());
        s = storeavailabilitydata.priceUnitString;
        InStoreView instoreview = mInStoreView;
        if (!TextUtils.isEmpty(s))
        {
            obj = s;
        } else
        {
            obj = null;
        }
        instoreview.setPriceUnit(((String) (obj)));
        obj = storeavailabilitydata.ppuDisplayString;
        if (TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            mInStoreView.setPricePerUnit(((String) (obj)));
        }
        mInStoreView.showOtherStoresAvailability();
        if (storeavailabilitydata.hasStoreLocationData)
        {
            mStoreMapSectionController.setStoreDataSource(storeavailabilitydata.storeId, storeavailabilitydata);
            return;
        } else
        {
            mStoreMapSectionController.setStoreDataSource(null, null);
            return;
        }
    }

    private void setupInStoreViewForAvailabilityError()
    {
        mInStoreView.setAvailability(mActivity.getString(0x7f090190));
        mInStoreView.setPrice(null);
        mInStoreView.hideOtherStoresAvailability();
        mInStoreView.setStoreDetails(null);
        mStoreMapSectionController.setStoreDataSource(null, null);
    }

    private void setupInStoreViewForIncompleteSelectionError()
    {
        mInStoreView.setAvailability(mActivity.getString(0x7f090194));
        mInStoreView.setPrice(null);
        mInStoreView.hideOtherStoresAvailability();
        mInStoreView.setStoreDetails(null);
        mStoreMapSectionController.setStoreDataSource(null, null);
    }

    private void setupInStoreViewForNotCarried()
    {
        String s = "";
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(mActivity);
        if (storeinfo != null)
        {
            s = storeinfo.addressLine1;
        } else
        {
            List list = StoreLocationManager.getInstance(mActivity).getNearbyByStores();
            if (!list.isEmpty())
            {
                s = ((WalmartStore)list.get(0)).getAddress().getStreet1();
            }
        }
        if (!TextUtils.isEmpty(s))
        {
            mInStoreView.setAvailability(mActivity.getString(0x7f090192));
            s = mActivity.getString(0x7f090193, new Object[] {
                s
            });
        } else
        {
            s = mActivity.getString(0x7f090191);
        }
        mInStoreView.setStoreDetails(s);
        mInStoreView.setPrice(null);
        mInStoreView.showOtherStoresAvailability();
        mStoreMapSectionController.setStoreDataSource(null, null);
    }

    private void setupVariants()
    {
        Object obj2 = mItemModel.getVariantsModel();
        mVariantController.setModel(((VariantsModel) (obj2)));
        boolean flag1 = false;
        Object obj = null;
        Object obj1 = obj;
        if (mPreselectVariant)
        {
            obj1 = obj;
            if (((VariantsModel) (obj2)).hasVariantItems())
            {
                obj1 = mItemModel.getProductId();
            }
        }
        boolean flag = flag1;
        obj = obj1;
        if (mItemState.isBundleItem())
        {
            flag = flag1;
            obj = obj1;
            if (mItemModel.hasVariants())
            {
                flag = flag1;
                obj = obj1;
                if (mBundleGroupConfiguration.getSelectedVariantItem(mItemState.getBundleOption()) != null)
                {
                    obj = mBundleGroupConfiguration.getSelectedVariantItem(mItemState.getBundleOption()).getItemId();
                    flag = true;
                }
            }
        }
        flag1 = flag;
        obj1 = obj;
        if (mAvailabilityData != null)
        {
            obj1 = ((VariantsModel) (obj2)).getVariantItemWithId(mAvailabilityData.productId);
            if (obj1 != null)
            {
                obj1 = ((com.walmart.android.service.item.VariantsModel.VariantItem) (obj1)).getItemId();
                flag1 = true;
            } else
            {
                WLog.w(TAG, (new StringBuilder()).append("setupVariants(): The provided itemId ").append(mAvailabilityData.wwwItemId).append(" did not ").append("correspond to an item variant").toString());
                ViewUtil.findViewById(mRootView, 0x7f1001e9).setVisibility(8);
                flag1 = flag;
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (((VariantsModel) (obj2)).hasVariantItems())
            {
                obj = ((VariantsModel) (obj2)).getPrimaryVariantItem().getItemId();
            }
        }
        obj1 = new VariantController.VariantSelectionChangedListener() {

            final ItemDetailsPresenter this$0;

            public void onVariantSelectionChanged(com.walmart.android.service.item.VariantsModel.VariantItem variantitem)
            {
                mItemState.setSelectedVariantItem(variantitem);
                if (variantitem != null)
                {
                    List list = mItemLogic.getProductImageUrls();
                    if (!Arrays.equals(mAdapter.getImageUrls(), list.toArray(new String[list.size()])))
                    {
                        mImagePagerController.cleanUp();
                        mAdapter.cleanUp();
                        mImageDownloader = ItemImageDownloaderFactory.createImageDownloader(mActivity);
                        mAdapter = new ImageUrlAdapter(mActivity, mImageDownloader);
                        createImageController();
                    }
                    if (!variantitem.hasBuyingOption())
                    {
                        fetchAndUpdateVariantBuyingOption(variantitem);
                        mInStoreView.setLoading(true);
                    } else
                    {
                        mItemState.setSelectedBuyingOption(variantitem.getBuyingOptionModel());
                        StoreAvailabilityData storeavailabilitydata = (StoreAvailabilityData)mItemIdAvailabilityLookup.get(variantitem.getItemId());
                        if (storeavailabilitydata != null)
                        {
                            WLog.d(ItemDetailsPresenter.TAG, (new StringBuilder()).append("onVariantChanged(): Found cached availability data for ").append(storeavailabilitydata.wwwItemId).append(": ").append(storeavailabilitydata.price).append(" / ").append(storeavailabilitydata.stockStatus).toString());
                        } else
                        {
                            WLog.d(ItemDetailsPresenter.TAG, (new StringBuilder()).append("onVariantChanged(): No availability data available for ").append(variantitem.getItemId()).append(", but we have fetched data -> Not carried").toString());
                        }
                        populateAvailability(storeavailabilitydata, Integer.valueOf(ItemDetailsPresenter.validateStockStatus(storeavailabilitydata)));
                    }
                } else
                {
                    populateAvailability(null, Integer.valueOf(-1001));
                    updateAddToCartButton();
                    updateRegistryAndListButtons();
                }
                updatePrice();
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
        };
        mVariantController.setListener(((VariantController.VariantSelectionChangedListener) (obj1)));
        obj2 = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001a4);
        mVariantController.populateView(((ViewGroup) (obj2)), ((String) (obj)), flag1);
        if (mVariantController.getSelectedVariant() != null)
        {
            ((VariantController.VariantSelectionChangedListener) (obj1)).onVariantSelectionChanged(mVariantController.getSelectedVariant());
        }
    }

    private void showItem()
    {
        (new CrossfadeAnimationHandler(ViewUtil.findViewById(mRootView, 0x7f100074), 0x7f05000f, ViewUtil.findViewById(mRootView, 0x7f100083), 0x7f050011, mActivity)).start();
    }

    private void showItemReviewsPresenter()
    {
        pushPresenter(new ItemReviewsPresenter(mActivity, mItemId, getProductType().toString(), mItemModel.getReviewData().getTotalReviewCount(), mItemModel.getReviewData().getAverageOverallRating(), mItemModel.getProductName()));
    }

    private void trackAddItem(String s, String s1)
    {
        String s2;
        if (mItemModel.hasVariants())
        {
            s2 = "variant";
        } else
        if (mItemLogic.isPreorder())
        {
            s2 = "preorder";
        } else
        {
            s2 = "regular";
        }
        GoogleAnalytics.trackEvent("Cart", String.format(Locale.US, "Add to Cart %s", new Object[] {
            s2
        }), s1);
        if (mIsRecommendedItem)
        {
            GoogleAnalytics.trackEvent("Recommendations", s, s1);
        }
    }

    private void updateAddToCartButton()
    {
        if (mOnlineView != null)
        {
            if (!mItemLogic.isAvailableForCart())
            {
                mOnlineView.hideAddToCart();
                return;
            }
            mOnlineView.showAddToCart();
            int i = 0x7f09006a;
            boolean flag1 = true;
            boolean flag = true;
            Object obj = null;
            if (mItemModel.isConfigurableBundle())
            {
                i = 0x7f0900c4;
                obj = new OnSingleClickListener(this) {

                    final ItemDetailsPresenter this$0;

                    public void onSingleClick(View view)
                    {
                        view = new BundleSummaryPresenter(mActivity, mItemModel, mListInfo);
                        view.setIsRecommendedItem(mIsRecommendedItem);
                        pushPresenter(view);
                        MessageBus.getBus().post(new CustomizeBundleTapEvent(mItemId));
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
                };
            } else
            if (mItemModel.isNonConfigurableBundle())
            {
                if (mItemLogic.isPreorder())
                {
                    i = 0x7f090467;
                } else
                {
                    i = 0x7f09006a;
                }
                obj = new OnSingleClickListener(this) {

                    final ItemDetailsPresenter this$0;

                    public void onSingleClick(View view)
                    {
                        addBundleToCart(mItemModel.getBundleModel().getGroupingId(), getOfferConfigurations());
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
                };
            } else
            if (mItemState.isBundleItem())
            {
                if (com.walmart.android.service.item.BundleModel.GroupType.OPTIONAL.equals(mBundleGroupConfiguration.getBundleGroup().getGroupType()))
                {
                    i = 0x7f09006a;
                    obj = new OnSingleClickListener(this) {

                        final ItemDetailsPresenter this$0;

                        public void onSingleClick(View view)
                        {
                            if (mItemModel.hasVariants() && !mItemState.hasSelectedVariant())
                            {
                                showDialog(3);
                                return;
                            } else
                            {
                                addToCart();
                                return;
                            }
                        }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
                    };
                } else
                if (!com.walmart.android.service.item.BundleModel.GroupType.STANDARD.equals(mBundleGroupConfiguration.getBundleGroup().getGroupType()))
                {
                    if (mItemModel.hasVariants() && mItemState.hasSelectedVariant())
                    {
                        obj = mItemState.getSelectedItemId();
                    } else
                    {
                        obj = null;
                    }
                    if (isSelectedInBundle())
                    {
                        i = 0x7f0901a4;
                    } else
                    {
                        i = 0x7f090168;
                    }
                    flag = flag1;
                    if (mItemModel.hasVariants())
                    {
                        flag = flag1;
                        if (obj == null)
                        {
                            flag = false;
                        }
                    }
                    obj = new OnSingleClickListener(this) {

                        final ItemDetailsPresenter this$0;

                        public void onSingleClick(View view)
                        {
                            view = mItemModel.getVariantsModel();
                            if (mBundleGroupConfiguration.isSelected(mItemState.getBundleOption()))
                            {
                                if (mItemModel.hasVariants())
                                {
                                    if (mBundleGroupConfiguration.isVariantSelected(mItemState.getBundleOption(), mItemLogic.getSelectedItemId()))
                                    {
                                        mBundleGroupConfiguration.deselect(mItemState.getBundleOption());
                                        pop();
                                        return;
                                    } else
                                    {
                                        mBundleGroupConfiguration.select(mItemState.getBundleOption(), view.getVariantTypes(), mVariantController.getSelectedVariant());
                                        pop();
                                        return;
                                    }
                                } else
                                {
                                    mBundleGroupConfiguration.deselect(mItemState.getBundleOption());
                                    pop();
                                    return;
                                }
                            }
                            if (mBundleGroupConfiguration.canMakeAdditionalSelections())
                            {
                                if (mItemModel.hasVariants())
                                {
                                    mBundleGroupConfiguration.select(mItemState.getBundleOption(), view.getVariantTypes(), mVariantController.getSelectedVariant());
                                } else
                                {
                                    mBundleGroupConfiguration.select(mItemState.getBundleOption());
                                }
                                pop();
                                return;
                            }
                            if (mBundleGroupConfiguration.canSelectionBeReplaced())
                            {
                                showDialog(2);
                                return;
                            } else
                            {
                                showDialog(1);
                                return;
                            }
                        }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
                    };
                } else
                {
                    mOnlineView.hideAddToCart();
                }
            } else
            if (mItemState.getSelectedBuyingOption() != null && mItemModel.isInflexibleKit())
            {
                if (mItemLogic.isPreorder())
                {
                    i = 0x7f090467;
                } else
                {
                    i = 0x7f09006a;
                }
                obj = new OnSingleClickListener(mItemState.getSelectedBuyingOption().getInflexibleKitConfiguration()) {

                    final ItemDetailsPresenter this$0;
                    final List val$configuredComponents;

                    public void onSingleClick(View view)
                    {
                        addBundleToCart(mItemState.getSelectedBuyingOption().getInflexibleKitId(), configuredComponents);
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                configuredComponents = list;
                super(final_presenter);
            }
                };
            } else
            if (mItemLogic.isEligibleForCart())
            {
                if (mItemLogic.isPreorder())
                {
                    i = 0x7f090467;
                } else
                {
                    i = 0x7f09006a;
                }
                obj = new OnSingleClickListener(this) {

                    final ItemDetailsPresenter this$0;

                    public void onSingleClick(View view)
                    {
                        if (mItemModel.hasVariants() && !mItemState.hasSelectedVariant())
                        {
                            showDialog(3);
                            return;
                        } else
                        {
                            addToCart();
                            return;
                        }
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
                };
            } else
            if (mItemModel.isEligibleToBuyOnline() && !TextUtils.isEmpty(mItemModel.getUrlPath()))
            {
                i = 0x7f090177;
                obj = new OnSingleClickListener(this) {

                    final ItemDetailsPresenter this$0;

                    public void onSingleClick(View view)
                    {
                        Uri uri = Uri.parse(String.format(Locale.US, "http://www.walmart.com/msharbor%s?adid=1500000000000033643520&veh=mappa", new Object[] {
                            mItemModel.getUrlPath()
                        }));
                        view = uri;
                        if (mListInfo != null)
                        {
                            view = uri.buildUpon();
                            view.appendQueryParameter("registryId", mListInfo.registryId);
                            view.appendQueryParameter("listId", mListInfo.id);
                            view.appendQueryParameter("listType", mListInfo.type);
                            view.appendQueryParameter("listItemId", mListInfo.itemId);
                            view = view.build();
                        }
                        view = new Intent("android.intent.action.VIEW", view);
                        if (view.resolveActivity(mActivity.getPackageManager()) != null)
                        {
                            mActivity.startActivity(view);
                            MessageBus.getBus().post(new BuyFromFullSiteTapEvent(mItemId));
                        }
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
                };
            } else
            {
                mOnlineView.hideAddToCart();
            }
            mOnlineView.updateAddToCart(i, flag);
            mOnlineView.setAddToCartListener(((android.view.View.OnClickListener) (obj)));
            if (mItemState.isFetchingBuyingOption())
            {
                mOnlineView.setAddToCartEnabled(false);
                return;
            }
        }
    }

    private void updateFlags()
    {
        if (mRootView != null)
        {
            ViewGroup viewgroup = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001ba);
            BuyingOptionModel buyingoptionmodel = mItemState.getSelectedBuyingOption();
            if (buyingoptionmodel != null && buyingoptionmodel.getCatalogSellerId() != null && buyingoptionmodel.getCatalogSellerId().equals(mItemModel.getPrimarySellerId()))
            {
                viewgroup.setVisibility(0);
                Object obj = mItemModel.getOnlinePriceFlags();
                if (!((List) (obj)).isEmpty())
                {
                    int i = ViewUtil.dpToPixels(8, mRootView.getContext().getResources().getDisplayMetrics());
                    android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutparams.setMargins(0, 0, 0, ViewUtil.dpToPixels(5, mActivity));
                    viewgroup.removeAllViews();
                    obj = ((List) (obj)).iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        Object obj1 = (com.walmart.android.service.item.ItemModel.PriceFlags)((Iterator) (obj)).next();
                        obj1 = mItemLogic.getResourceIdForFlag(((com.walmart.android.service.item.ItemModel.PriceFlags) (obj1)));
                        if (obj1 != null)
                        {
                            viewgroup.addView(createFlag(((ItemLogic.FlagValue) (obj1)).getDrawableId(), i, i / 2, mActivity.getString(((ItemLogic.FlagValue) (obj1)).getStringId()), mActivity), layoutparams);
                        }
                    } while (true);
                }
            } else
            {
                viewgroup.setVisibility(4);
            }
        }
    }

    private void updateHeaderView()
    {
        ViewGroup viewgroup;
label0:
        {
            if (mRootView != null)
            {
                viewgroup = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001a1);
                if (mHeaderView == null)
                {
                    break label0;
                }
                viewgroup.addView(mHeaderView);
                viewgroup.setVisibility(0);
            }
            return;
        }
        viewgroup.setVisibility(8);
    }

    private void updateOnlineSection()
    {
        Object obj1;
        boolean flag;
label0:
        {
            obj1 = null;
            flag = true;
            if (mOnlineView != null)
            {
                if (!mItemLogic.shouldHideOnlineSection())
                {
                    break label0;
                }
                mOnlineView.setVisibility(8);
            }
            return;
        }
        mOnlineView.setVisibility(0);
        if (mItemModel.isConfigurableBundle())
        {
            mOnlineView.setTitle(0x7f090173);
        }
        updatePrice();
        BuyingOptionModel buyingoptionmodel = mItemState.getSelectedBuyingOption();
        Object obj2 = null;
        Object obj = obj2;
        if (buyingoptionmodel != null)
        {
            obj = obj2;
            if (buyingoptionmodel.isPreorder())
            {
                obj = buyingoptionmodel.getDisplayPreorderStreetDate();
                OnlineView onlineview;
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj = mActivity.getString(0x7f09019c, new Object[] {
                        obj
                    });
                } else
                {
                    obj = mActivity.getString(0x7f09019b);
                }
            }
        }
        mOnlineView.setPreorderMessage(((CharSequence) (obj)));
        if (mItemState.getSelectedBuyingOption() == null || !mItemState.getSelectedBuyingOption().isShippingPassEligible() || !ShippingPassUtil.isEligibleNonMember())
        {
            flag = false;
        }
        mOnlineView.setShippingPassPromotionEnabled(flag);
        onlineview = mOnlineView;
        if (flag)
        {
            obj = new OnSingleClickListener(this) {

                final ItemDetailsPresenter this$0;

                public void onSingleClick(View view)
                {
                    ShippingPassUtil.launchShippingPassSignup(mActivity);
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
            };
        } else
        {
            obj = null;
        }
        onlineview.setShippingPassPromotionListener(((android.view.View.OnClickListener) (obj)));
        mOnlineView.setAvailability(mItemLogic.getOnlineAvailabilityText(mActivity.getResources()));
        onlineview = mOnlineView;
        obj = obj1;
        if (buyingoptionmodel != null)
        {
            obj = buyingoptionmodel.getSellerName();
        }
        onlineview.setSoldBy(((String) (obj)));
    }

    private void updateOptionsMenu()
    {
        if (mShareMenuItem != null)
        {
            Intent intent = getShareIntent();
            MenuItem menuitem = mShareMenuItem;
            boolean flag;
            if (intent != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuitem.setVisible(flag);
            ((WalmartShareActionProvider)MenuItemCompat.getActionProvider(mShareMenuItem)).setShareIntent(intent);
        }
    }

    private void updatePrice()
    {
        if (!mItemState.isFetchingBuyingOption())
        {
            ItemPrice itemprice = mItemLogic.getOnlinePrice();
            Object obj = null;
            OnlineView onlineview;
            if (mItemState.isBundleItem())
            {
                if (isSelectedInBundle())
                {
                    obj = mActivity.getString(0x7f090169);
                } else
                {
                    obj = mActivity.getString(0x7f09016c);
                }
            }
            mOnlineView.setPricePrefix(((String) (obj)));
            mOnlineView.setListPrice(itemprice.getListPrice());
            mOnlineView.setPricePerUnit(itemprice.getPricePerUnit());
            onlineview = mOnlineView;
            if (itemprice.isSubmap() && mItemLogic.isAvailableOnline())
            {
                obj = mActivity.getString(0x7f0901c3);
            } else
            {
                obj = null;
            }
            onlineview.setSeeOurPrice(((String) (obj)));
            if (mItemState.isBundleItem())
            {
                mOnlineView.setPriceAndHideRowIfEmpty(itemprice.getPriceString());
            } else
            {
                mOnlineView.setPriceAnimated(itemprice.getPriceString(), AnimationUtils.loadAnimation(mActivity, 0x7f050011), AnimationUtils.loadAnimation(mActivity, 0x7f05000f));
            }
            obj = mItemLogic.getInStorePrice();
            if (!((ItemPrice) (obj)).isSubmap())
            {
                mInStoreView.setPriceAnimated(((ItemPrice) (obj)).getPriceString(), AnimationUtils.loadAnimation(mActivity, 0x7f05000f));
            }
            return;
        } else
        {
            mOnlineView.showPriceProgress();
            return;
        }
    }

    private void updatePutMessagingVisibility(BuyingOptionModel buyingoptionmodel)
    {
        if (buyingoptionmodel != null && buyingoptionmodel.isWalmart())
        {
            mOnlineView.showPutMessagingIfAvailable();
            return;
        } else
        {
            mOnlineView.hidePutMessaging();
            return;
        }
    }

    private void updateRegistryAndListButtons()
    {
        if (mOnlineView == null)
        {
            return;
        }
        com.walmart.android.app.item.view.OnlineView.AddToButtonState addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.DISABLED;
        com.walmart.android.app.item.view.OnlineView.AddToButtonState addtobuttonstate1;
        View view1;
        boolean flag;
        if (mItemLogic.isValidForRegistry(mActivity))
        {
            addtobuttonstate1 = isVariantsSelected();
        } else
        {
            addtobuttonstate1 = com.walmart.android.app.item.view.OnlineView.AddToButtonState.GONE;
        }
        addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.DISABLED;
        if (mItemLogic.isValidForRegistry(mActivity))
        {
            addtobuttonstate = isVariantsSelected();
        } else
        if (mItemModel.isNonConfigurableBundle())
        {
            addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.ENABLED;
        } else
        if (mItemState.getSelectedBuyingOption() != null && mItemModel.isInflexibleKit())
        {
            addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.ENABLED;
        } else
        if (mItemModel.isConfigurableBundle())
        {
            addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.GONE;
        } else
        if (mItemState.isBundleItem())
        {
            addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.GONE;
        } else
        if (mItemLogic.isEligibleForCart())
        {
            addtobuttonstate = isVariantsSelected();
        } else
        if (mItemModel.isEligibleToBuyOnline() && !TextUtils.isEmpty(mItemModel.getUrlPath()))
        {
            addtobuttonstate = isVariantsSelected();
        } else
        {
            addtobuttonstate = com.walmart.android.app.item.view.OnlineView.AddToButtonState.GONE;
        }
        view1 = mRootView.findViewById(0x7f1001a6);
        if (!mItemLogic.shouldHideOnlineSection())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mOnlineView.updateAddToRegistryState(addtobuttonstate1);
            mOnlineView.updateAddToListState(addtobuttonstate);
            view1.setVisibility(8);
            return;
        }
        if (addtobuttonstate1 == com.walmart.android.app.item.view.OnlineView.AddToButtonState.GONE && addtobuttonstate == com.walmart.android.app.item.view.OnlineView.AddToButtonState.GONE)
        {
            view1.setVisibility(8);
            return;
        } else
        {
            view1.setVisibility(0);
            View view = view1.findViewById(0x7f1001a9);
            view1 = view1.findViewById(0x7f1000b1);
            view.setEnabled(addtobuttonstate1.equals(com.walmart.android.app.item.view.OnlineView.AddToButtonState.ENABLED));
            view1.setEnabled(addtobuttonstate.equals(com.walmart.android.app.item.view.OnlineView.AddToButtonState.ENABLED));
            return;
        }
    }

    private void updateSellersSection()
    {
label0:
        {
            if (mSellersView != null)
            {
                final List buyingOptionModels = mItemModel.getBuyingOptions();
                int i = buyingOptionModels.size();
                if (i <= 1 || mItemState.isBundleItem())
                {
                    break label0;
                }
                mSellersView.setVisibility(0);
                mSellersView.setAdditionalSellersCount(i - 1);
                String s = getLowestNonSelectedPrice(buyingOptionModels);
                if (!TextUtils.isEmpty(s))
                {
                    mSellersView.setStartingPrice(s);
                }
                mSellersView.setOnClickListener(new android.view.View.OnClickListener() {

                    final ItemDetailsPresenter this$0;
                    final List val$buyingOptionModels;

                    public void onClick(View view)
                    {
                        view = mItemState.getSelectedBuyingOption();
                        AdditionalSellersActivity.launch(mActivity, 1, buyingOptionModels, view);
                    }

            
            {
                this$0 = ItemDetailsPresenter.this;
                buyingOptionModels = list;
                super();
            }
                });
            }
            return;
        }
        mSellersView.setVisibility(8);
    }

    private void updateShippingPassLogo()
    {
        ImageView imageview;
label0:
        {
            if (mRootView != null)
            {
                imageview = (ImageView)ViewUtil.findViewById(mRootView, 0x7f1001e8);
                if (!Services.get().getAuthentication().isShippingPassEligibleOrMember() || mItemState.getSelectedBuyingOption() == null || !mItemState.getSelectedBuyingOption().isShippingPassEligible())
                {
                    break label0;
                }
                imageview.setVisibility(0);
            }
            return;
        }
        imageview.setVisibility(8);
    }

    private void updateStoreAvailability()
    {
        boolean flag1 = false;
        if (mOnlineView == null) goto _L2; else goto _L1
_L1:
        BuyingOptionModel buyingoptionmodel;
        mOnlineView.setPutMessaging("");
        buyingoptionmodel = mItemState.getSelectedBuyingOption();
        if (!mItemState.isBundleItem()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        Object obj = mOnlineView;
        OnlineView onlineview;
        boolean flag2;
        boolean flag3;
        if (!flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((OnlineView) (obj)).setShippingOptionsMessagingEnabled(flag2);
        if (mItemLogic.shouldShowStoreSection())
        {
            if (mAvailabilityData == null)
            {
                obj = AvailabilityUtils.getPreferredStore(mActivity);
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    mPageEvent.setStoreId(((String) (obj)));
                    obj = mItemLogic.getStoreItemModelForStore(((String) (obj)));
                    if (obj != null)
                    {
                        mAvailabilityData = new StoreAvailabilityData(((com.walmart.android.service.item.StoreItemModel) (obj)));
                        if (mItemModel.hasVariants())
                        {
                            mItemIdAvailabilityLookup.put(mItemLogic.getSelectedItemId(), mAvailabilityData);
                        }
                    }
                }
            }
            mStoreMapSectionController.setMapVisibilityCallback(new com.walmart.android.app.shop.map.InStoreMapController.MapVisibilityCallback() {

                final ItemDetailsPresenter this$0;

                public void onMapVisibilityChanged(boolean flag4)
                {
                    mInStoreView.showInStoreMap(flag4);
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            });
            populateAvailability(mAvailabilityData, Integer.valueOf(validateStockStatus(mAvailabilityData)));
            mInStoreView.setOtherStoresAvailabilityClickListener(new android.view.View.OnClickListener() {

                final ItemDetailsPresenter this$0;

                public void onClick(View view)
                {
                    view = mItemId;
                    Object obj1 = mVariantController.getSelectedVariant();
                    boolean flag4;
                    if (obj1 != null)
                    {
                        view = null;
                        if (mAvailabilityData != null)
                        {
                            view = mAvailabilityData;
                        } else
                        if (mItemIdAvailabilityLookup != null)
                        {
                            view = (StoreAvailabilityData)mItemIdAvailabilityLookup.get(((com.walmart.android.service.item.VariantsModel.VariantItem) (obj1)).getItemId());
                        }
                        if (view != null && (!TextUtils.isEmpty(((StoreAvailabilityData) (view)).upc) || !TextUtils.isEmpty(((StoreAvailabilityData) (view)).wwwItemId)))
                        {
                            String s;
                            if (!TextUtils.isEmpty(((StoreAvailabilityData) (view)).upc))
                            {
                                obj1 = (new StringBuilder()).append(((StoreAvailabilityData) (view)).upc).append("0").toString();
                            } else
                            {
                                obj1 = ((StoreAvailabilityData) (view)).upc;
                            }
                            view = ((StoreAvailabilityData) (view)).wwwItemId;
                            WLog.d(ItemDetailsPresenter.TAG, (new StringBuilder()).append("Using variant values: UPC = ").append(((String) (obj1))).append(", itemId = ").append(view).toString());
                        } else
                        {
                            view = ((com.walmart.android.service.item.VariantsModel.VariantItem) (obj1)).getItemId();
                            WLog.d(ItemDetailsPresenter.TAG, (new StringBuilder()).append("Using variant itemId = ").append(view).toString());
                        }
                    }
                    obj1 = mActivity;
                    s = getProductType().toString();
                    if (!mItemLogic.getOnlinePrice().isSubmap())
                    {
                        flag4 = true;
                    } else
                    {
                        flag4 = false;
                    }
                    view = new StoreAvailabilityListPresenter(((Activity) (obj1)), view, s, flag4);
                    pushPresenter(view);
                    GoogleAnalytics.trackEvent("Item Details", "More Store Availability", "");
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            });
            mInStoreView.setInStoreMapClickListener(new OnSingleClickListener(this) {

                final ItemDetailsPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (mItemState.getStoreAvailabilityData() != null)
                    {
                        view = new ItemPagerAdapter();
                        view.setItemData(mItemModel, mItemLogic);
                        pushPresenter(new InStoreMapFullScreenPresenter(mActivity, getTitleText(), mStoreMapSectionController.getSourceDataMapper(), view, null));
                    }
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f1001e9).setVisibility(0);
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1001e9).setVisibility(8);
        }
        updatePutMessagingVisibility(buyingoptionmodel);
_L2:
        return;
_L4:
        if (mItemLogic.isShippable())
        {
            obj = mItemLogic.getShippingMessage(mActivity);
        } else
        {
            obj = null;
            flag1 = true;
        }
        mOnlineView.setShippingMessaging(((CharSequence) (obj)));
        flag2 = mItemModel.canPickupToday();
        flag3 = mItemModel.isShipToStoreEligible();
        flag = flag1;
        if (!mItemLogic.isAvailableOnline()) goto _L6; else goto _L5
_L5:
        if (flag3) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (!flag2) goto _L6; else goto _L8
_L8:
        flag = flag1;
        if (buyingoptionmodel != null)
        {
            flag = flag1;
            if (buyingoptionmodel.isWalmart())
            {
                flag = flag1;
                if (!mItemModel.isGrouping())
                {
                    onlineview = mOnlineView;
                    if (flag2)
                    {
                        obj = mActivity.getString(0x7f09019f);
                    } else
                    {
                        obj = mActivity.getString(0x7f090571);
                    }
                    onlineview.setPutMessaging(((String) (obj)));
                    flag = flag1;
                    if (flag1)
                    {
                        flag = false;
                    }
                }
            }
        }
          goto _L6
    }

    private static int validateStockStatus(StoreAvailabilityData storeavailabilitydata)
    {
        return storeavailabilitydata == null || storeavailabilitydata.stockStatus != null ? -1 : -1002;
    }

    private void wireAddToListButton()
    {
        OnSingleClickListener onsingleclicklistener = new OnSingleClickListener(this) {

            final ItemDetailsPresenter this$0;

            private String getPriceString()
            {
                String s = "0";
                WalmartPrice walmartprice = WalmartPrice.fromString(mItemLogic.getOnlinePrice().getPriceString());
                if (walmartprice.isValid())
                {
                    s = String.format(Locale.US, "%d.%02d", new Object[] {
                        Integer.valueOf(walmartprice.getLowerBound().integerPart), Integer.valueOf(walmartprice.getLowerBound().decimalPart)
                    });
                }
                return s;
            }

            public void onSingleClick(View view)
            {
                if (mItemModel.isNonConfigurableBundle())
                {
                    view = new AddBundle(mItemModel.getBundleModel().getGroupingId(), 1, AddBundle.convertItems(getOfferConfigurations()));
                    ListCreatorActivity.launch(mActivity, view);
                } else
                if (mItemState.getSelectedBuyingOption() != null && mItemModel.isInflexibleKit())
                {
                    view = new AddBundle(mItemState.getSelectedBuyingOption().getInflexibleKitId(), 1, AddBundle.convertItems(mItemState.getSelectedBuyingOption().getInflexibleKitConfiguration()));
                    ListCreatorActivity.launch(mActivity, view);
                } else
                {
                    view = mItemState.getSelectedBuyingOption();
                    if (view != null && !TextUtils.isEmpty(view.getOfferId()))
                    {
                        view = new AddItemOfferId(1, getPriceString(), view.getOfferId());
                    } else
                    {
                        view = mItemModel.getItemId();
                        String s = mItemModel.getPrimarySellerId();
                        String s1 = mItemModel.getProductName();
                        view = new AddItemUsItemId(1, getPriceString(), view, s, s1);
                    }
                    ListCreatorActivity.launch(mActivity, view);
                }
                view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("AddToListTap")).putString("itemId", mItemModel.getItemId()).putString("tapLocation", "item page");
                MessageBus.getBus().post(view);
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
        };
        mOnlineView.setAddToWishListListener(onsingleclicklistener);
        mRootView.findViewById(0x7f1001a6).findViewById(0x7f1000b1).setOnClickListener(onsingleclicklistener);
    }

    private void wireAddToRegistryButton()
    {
        OnSingleClickListener onsingleclicklistener = new OnSingleClickListener(this) {

            final ItemDetailsPresenter this$0;

            public void onSingleClick(View view)
            {
                Bundle bundle = new Bundle();
                String s1 = mItemModel.getUpc();
                String s = mItemLogic.getSelectedItemId();
                view = s;
                if (mItemModel.hasVariants())
                {
                    view = mItemModel.getVariantsModel().getVariantItemWithId(s);
                    String s2;
                    String s3;
                    WalmartPrice walmartprice;
                    if (view != null)
                    {
                        view = view.getBuyingOptionModel();
                    } else
                    {
                        view = null;
                    }
                    if (view != null)
                    {
                        view = view.getUsItemId();
                    } else
                    {
                        view = "";
                    }
                }
                s2 = mItemModel.getPrimarySellerId();
                s3 = mItemModel.getProductName();
                s = "";
                walmartprice = WalmartPrice.fromString(mItemLogic.getOnlinePrice().getPriceString());
                if (walmartprice.isValid())
                {
                    s = String.format(Locale.US, "%d.%02d", new Object[] {
                        Integer.valueOf(walmartprice.getLowerBound().integerPart), Integer.valueOf(walmartprice.getLowerBound().decimalPart)
                    });
                }
                bundle.putString("registry_add_path", String.format(Locale.US, "/lists/registry-homepage?upc=%s&USItemId=%s&USSellerId=%s&productName=%s&quantity=1&price=%s&action=add-to-registry", new Object[] {
                    s1, view, s2, s3, s
                }));
                bundle.putBoolean("reload", true);
                MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.REGISTRY, bundle, true));
            }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super(presenter);
            }
        };
        mOnlineView.setAddToRegistryListener(onsingleclicklistener);
        mRootView.findViewById(0x7f1001a6).findViewById(0x7f1001a9).setOnClickListener(onsingleclicklistener);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == -1)
            {
                intent = AdditionalSellersActivity.getSelectedSeller(intent, mItemModel.getBuyingOptions());
                if (intent != null)
                {
                    mItemState.setSelectedBuyingOption(intent);
                }
            }
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
        MessageBus.getBus().unregister(this);
        onPageClosed();
        cancelRequestsInFlight();
        if (mImagePagerController != null)
        {
            mImagePagerController.cleanUp();
        }
        mImageDownloader.cancelAllDownloads();
        mStoreMapSectionController.stop();
        mStoreMapSectionController.destroy();
        removeListeners();
        mRootView.removeAllViews();
        mRootView = null;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mStoreMapSectionController.start();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
        loadItemDetails();
        mStoreMapSectionController.start();
    }

    public void onBuyingOptionModelChanged()
    {
        updateShippingPassLogo();
        updateFlags();
        updateOnlineSection();
        updateSellersSection();
        updateRegistryAndListButtons();
        updateStoreAvailability();
        updateAddToCartButton();
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(0x7f0901a3).setMessage(0x7f090174).setCancelable(true).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

                final ItemDetailsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            }).setIcon(null).create();

        case 2: // '\002'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(0x7f0901a5).setMessage(0x7f090175).setCancelable(true).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

                final ItemDetailsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    if (mItemModel.hasVariants())
                    {
                        mBundleGroupConfiguration.replace(mItemState.getBundleOption(), mItemModel.getVariantsModel().getVariantTypes(), mVariantController.getSelectedVariant());
                    } else
                    {
                        mBundleGroupConfiguration.replace(mItemState.getBundleOption());
                    }
                    pop();
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            }).setNegativeButton(0x1040009, new android.content.DialogInterface.OnClickListener() {

                final ItemDetailsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            }).setIcon(null).create();

        case 3: // '\003'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setMessage(0x7f0901c5).setPositiveButton(0x7f090292, null).create();
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        mShareMenuItem = menu.findItem(0x7f100692);
        if (mShareMenuItem != null)
        {
            mShareMenuItem.setVisible(true);
        }
        updateOptionsMenu();
        return false;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040076, viewgroup);
            mOnlineView = (OnlineView)ViewUtil.findViewById(mRootView, 0x7f1001a5);
            mInStoreView = (InStoreView)ViewUtil.findViewById(mRootView, 0x7f1001e9);
            mRecommendedItemsView = (RecommendedItemsView)ViewUtil.findViewById(mRootView, 0x7f1001ed);
            mSellersView = (SellersView)ViewUtil.findViewById(mRootView, 0x7f1001a7);
            viewgroup = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f100183);
            mStoreMapSectionController.setContainerView(viewgroup);
            updateHeaderView();
            wireAddToRegistryButton();
            wireAddToListButton();
        }
    }

    public void onItemAdded()
    {
        if (!isPopped() && mAddingToCart)
        {
            mOnlineView.updateAddToCart(0x7f090195, false);
            mHandler.postDelayed(new Runnable() {

                final ItemDetailsPresenter this$0;

                public void run()
                {
                    if (!isPopped())
                    {
                        resetAddToCartButton();
                    }
                }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
            }, 1500L);
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        mStoreMapSectionController.stop();
        onPageClosed();
    }

    protected void onPageView()
    {
        super.onPageView();
        mPageEvent.pageViewed();
        sendAppIndexEvent();
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        mStoreMapSectionController.stop();
    }

    public void onPushed()
    {
        super.onPushed();
        mIsPushed = true;
        if (mHasLoadedItemData)
        {
            populateItem();
        }
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mStoreMapSectionController.start();
    }

    public void onShippingPassStatusEvent(ShippingPassStatusEvent shippingpassstatusevent)
    {
        WLog.d(TAG, "onShippingPassStatusEvent(): Refresing ShippingPass visuals");
        updateOnlineSection();
        updateStoreAvailability();
        updateShippingPassLogo();
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        onPageClosed();
    }

    public void preselectVariant()
    {
        mPreselectVariant = true;
    }

    public void setAvailabilityData(StoreAvailabilityData storeavailabilitydata)
    {
        if (!mHasPopulatedItemDetails)
        {
            mAvailabilityData = storeavailabilitydata;
            return;
        } else
        {
            populateAvailability(storeavailabilitydata, Integer.valueOf(-1));
            return;
        }
    }

    public void setBundleGroupConfiguration(BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration, com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        mBundleGroupConfiguration = bundlegroupconfiguration;
        mItemState.setBundleOption(groupoption);
    }

    public void setHeaderView(View view)
    {
        mHeaderView = view;
        if (mRootView != null)
        {
            ((ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001a1)).removeAllViews();
            updateHeaderView();
        }
    }

    public void setIsRecommendedItem(boolean flag)
    {
        mIsRecommendedItem = flag;
    }

    public void setListInfo(ListInfo listinfo)
    {
        mListInfo = listinfo;
        preselectVariant();
    }



























/*
    static Request access$3102(ItemDetailsPresenter itemdetailspresenter, Request request)
    {
        itemdetailspresenter.mOngoingVariantBuyingOptionRequest = request;
        return request;
    }

*/






















/*
    static boolean access$502(ItemDetailsPresenter itemdetailspresenter, boolean flag)
    {
        itemdetailspresenter.mHasLoadedItemData = flag;
        return flag;
    }

*/








}
