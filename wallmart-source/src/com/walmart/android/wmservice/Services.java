// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieSyncManager;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.otto.Bus;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.walmart.android.app.payment.WalmartIntegrationProvider;
import com.walmart.android.app.pharmacy.WalmartPharmacyAuthenticator;
import com.walmart.android.app.storelocator.WalmartStoreHelper;
import com.walmart.android.config.EReceiptServiceSettings;
import com.walmart.android.config.SaverServiceSettings;
import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.config.WalmartPharmacyServiceSettings;
import com.walmart.android.service.HTTPService;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.browse.BrowseSearchService;
import com.walmart.android.service.browsepersonalization.BrowsePersonalizationService;
import com.walmart.android.service.cart.CartService;
import com.walmart.android.service.irs.ItemRecommendationService;
import com.walmart.android.service.item.ItemService;
import com.walmart.android.service.orderhistory.OrderHistoryService;
import com.walmart.android.service.payment.WalmartPayManager;
import com.walmart.android.service.pharmacylegacy.PharmacyLegacyService;
import com.walmart.android.service.review.ItemReviewService;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverProvider;
import com.walmart.android.service.saver.SaverProviderImpl;
import com.walmart.android.service.saver.SaverService;
import com.walmart.android.service.saver.SaverServiceImpl;
import com.walmart.android.service.shippingpass.ShippingPassManager;
import com.walmart.android.service.shippingpass.ShippingPassService;
import com.walmart.android.service.storelocator.StoreLocatorService;
import com.walmart.android.service.storesearch.InStoreSearchService;
import com.walmart.android.service.taxonomy.TaxonomyService;
import com.walmart.android.service.typeahead.TypeAheadService;
import com.walmart.android.service.weeklyad.WeeklyAdService;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.WishListService;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.android.pharmacy.PharmacyManager;
import com.walmartlabs.android.pharmacy.service.PharmacyService;
import com.walmartlabs.android.pharmacy.service.PharmacyServiceImpl;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.EReceiptProvider;
import com.walmartlabs.ereceipt.service.EReceiptService;
import com.walmartlabs.ereceipt.service.EReceiptServiceImpl;
import com.walmartlabs.ereceipt.service.GcmRegistration;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.payment.integration.IntegrationLoader;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.storelocator.StoreService;
import com.walmartlabs.utils.WLog;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.impl.client.AbstractHttpClient;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.wmservice:
//            Authentication, CartManager, WalmartNetService, Util, 
//            NonUriAssociativeCookieStore, ApacheWrapperCookieStore, WalmartNetServiceImpl

public abstract class Services
{
    private static class ServicesImpl extends Services
    {

        private static final int CONNECTION_TIMEOUT = 30000;
        private static final int ERECEIPT_SYNC_BATCH_SIZE = 25;
        private static final int NUMBER_OF_THREADS = 4;
        private static final int SOCKET_TIMEOUT = 45000;
        private Authentication mAuthentication;
        private BrowsePersonalizationService mBrowsePersonalizationService;
        private BrowseSearchService mBrowseSearchService;
        private CartManager mCartManager;
        private CartService mCartService;
        private Context mContext;
        private EReceiptProvider mEReceiptProvider;
        private EReceiptServiceImpl mEReceiptService;
        private EReceiptServiceSettings mEReceiptServiceSettings;
        private FastPickupManager mFastPickupManager;
        private InStoreSearchService mInStoreSearchService;
        private ItemRecommendationService mItemRecommendationService;
        private ItemReviewService mItemReviewService;
        private ItemService mItemService;
        private OrderHistoryService mOrderHistoryService;
        private WalmartPaymentServices mPaymentServices;
        private PharmacyLegacyService mPharmacyLegacyService;
        private PharmacyService mPharmacyService;
        private SaverService mSaverService;
        private SaverServiceSettings mSaverServiceSettings;
        private ObjectMapper mSharedObjectMapper;
        private ShippingPassManager mShippingPassManager;
        private ShippingPassService mShippingPassService;
        private TaxonomyService mTaxonomyService;
        private TypeAheadService mTypeAheadService;
        private WalmartNetServiceImpl mWalmartNetService;
        private WalmartNetServiceSettings mWalmartNetServiceSettings;
        private WalmartPayManager mWalmartPayManager;
        private WalmartPharmacyServiceSettings mWalmartPharmacyServiceSettings;
        private WeeklyAdService mWeeklyAdService;

        private void createEReceiptManager(EReceiptProvider ereceiptprovider)
        {
            ereceiptprovider = EReceiptManager.create(mContext, ereceiptprovider);
            ereceiptprovider.setEReceiptService(mEReceiptService);
            ereceiptprovider.setStoreItemService(getInStoreSearchService());
            ereceiptprovider.setGcmRegistration(new GcmRegistration() {

                final ServicesImpl this$0;

                public String getGcmRegistrationId()
                {
                    String s;
                    try
                    {
                        s = UAirship.shared().getPushManager().getGcmId();
                    }
                    catch (Exception exception)
                    {
                        WLog.e("ServicesImpl", "Failed to get gcm id", exception);
                        return "";
                    }
                    return s;
                }

            
            {
                this$0 = ServicesImpl.this;
                super();
            }
            });
            ereceiptprovider.setDeviceId(SharedPreferencesUtil.getInstallationId(mContext));
            ereceiptprovider.setSyncBatchSize(25);
        }

        private void createEReceiptService(ExecutorService executorservice, HttpRequestExecutor httprequestexecutor)
        {
            mEReceiptServiceSettings = new EReceiptServiceSettings(mContext);
            mEReceiptService = new EReceiptServiceImpl(mContext, executorservice, httprequestexecutor, mEReceiptServiceSettings.getSecureBaseUrl());
            mEReceiptService.setKey(mEReceiptServiceSettings.getKey());
        }

        private void createFastPickupManager()
        {
            mFastPickupManager = FastPickupManager.create(mContext);
        }

        private void createPaymentServices()
        {
            IntegrationLoader.get().setIntegrationProviderClass(com/walmart/android/app/payment/WalmartIntegrationProvider);
            mPaymentServices = new WalmartPaymentServices(mWalmartNetServiceSettings, mSharedObjectMapper);
            PaymentServices.set(mPaymentServices);
        }

        private void createPharmacyManager()
        {
            PharmacyManager.create(mContext);
            PharmacyManager.get().setPharmacyService(mPharmacyService);
            WalmartPharmacyAuthenticator walmartpharmacyauthenticator = new WalmartPharmacyAuthenticator();
            PharmacyManager.get().setAuthenticator(walmartpharmacyauthenticator);
            PharmacyManager.get().setStoreHelper(new WalmartStoreHelper());
        }

        private void createPharmacyService(ExecutorService executorservice, HttpRequestExecutor httprequestexecutor)
        {
            mWalmartPharmacyServiceSettings = new WalmartPharmacyServiceSettings(mContext);
            mPharmacyService = new PharmacyServiceImpl(mContext, executorservice, httprequestexecutor, mWalmartPharmacyServiceSettings);
        }

        private void createSaverManager(SaverProvider saverprovider)
        {
            SaverManager.create(mContext, mSaverService, saverprovider);
        }

        private void createSaverService(ExecutorService executorservice, HttpRequestExecutor httprequestexecutor)
        {
            mSaverServiceSettings = new SaverServiceSettings(mContext);
            mSaverService = new SaverServiceImpl(mSaverServiceSettings.getSecureBaseUrl(), executorservice, httprequestexecutor);
        }

        private void createShippingPassManager()
        {
            mShippingPassManager = ShippingPassManager.create(mContext);
        }

        private void createStoreLocatorService()
        {
            String s = Uri.parse(mWalmartNetServiceSettings.getBaseUrl()).getHost();
            WalmartLog walmartlog = WalmartLog.create();
            StoreService.initStoreService(new StoreLocatorService(mContext, s, mSharedObjectMapper, walmartlog));
        }

        private void createWalmartPayManager()
        {
            mWalmartPayManager = WalmartPayManager.create(mContext);
        }

        private void createWishListManager()
        {
            String s = mWalmartNetServiceSettings.getWwwHost();
            WalmartLog walmartlog = WalmartLog.create();
            WishListManager.create(new WishListService(s, mSharedObjectMapper, walmartlog));
        }

        private void registerMocks()
        {
        }

        private void syncCartCookies()
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                CookieSyncManager.createInstance(mContext);
            }
            Util.passCookiesToNative(new String[] {
                "ACID", "hasACID", "CRT", "hasCRT"
            });
        }

        protected void destroy()
        {
            if (mAuthentication != null)
            {
                mAuthentication.destroy();
            }
            if (mCartManager != null)
            {
                mCartManager.destroy();
            }
            EReceiptManager.destroy();
            SaverManager.destroy();
            FastPickupManager.destroy();
            ShippingPassManager.destroy();
            if (mWalmartPayManager != null)
            {
                mWalmartPayManager.destroy();
            }
            if (mPaymentServices != null)
            {
                mPaymentServices.destroy();
            }
        }

        public Authentication getAuthentication()
        {
            if (mAuthentication == null)
            {
                mAuthentication = new Authentication(mContext);
                mAuthentication.init(mWalmartNetService);
            }
            return mAuthentication;
        }

        public BrowsePersonalizationService getBrowsePersonalizationService()
        {
            if (mBrowsePersonalizationService == null)
            {
                String s = Uri.parse(mWalmartNetServiceSettings.getBaseUrl()).getHost();
                WalmartLog walmartlog = WalmartLog.create();
                mBrowsePersonalizationService = new BrowsePersonalizationService(s, mSharedObjectMapper, walmartlog);
            }
            return mBrowsePersonalizationService;
        }

        public BrowseSearchService getBrowseSearchService()
        {
            if (mBrowseSearchService == null)
            {
                String s = Uri.parse(mWalmartNetServiceSettings.getBaseUrl()).getHost();
                WalmartLog walmartlog = WalmartLog.create();
                mBrowseSearchService = new BrowseSearchService(s, mSharedObjectMapper, walmartlog);
            }
            return mBrowseSearchService;
        }

        public CartManager getCartManager()
        {
            if (mCartManager == null)
            {
                mCartManager = new CartManager(mContext);
                mCartManager.init();
            }
            return mCartManager;
        }

        public CartService getCartService()
        {
            if (mCartService == null)
            {
                String s = mWalmartNetServiceSettings.getHapiHost();
                WalmartLog walmartlog = WalmartLog.create();
                mCartService = new CartService(s, mSharedObjectMapper, walmartlog);
            }
            return mCartService;
        }

        public EReceiptProvider getEReceiptProvider()
        {
            return mEReceiptProvider;
        }

        public EReceiptService getEReceiptService()
        {
            return mEReceiptService;
        }

        public EReceiptServiceSettings getEReceiptServiceSettings()
        {
            return mEReceiptServiceSettings;
        }

        public FastPickupManager getFastPickupManager()
        {
            return mFastPickupManager;
        }

        public InStoreSearchService getInStoreSearchService()
        {
            if (mInStoreSearchService == null)
            {
                String s = mWalmartNetServiceSettings.getStoreSearchHost();
                WalmartLog walmartlog = WalmartLog.create();
                mInStoreSearchService = new InStoreSearchService(s, mSharedObjectMapper, walmartlog);
            }
            return mInStoreSearchService;
        }

        public ItemRecommendationService getItemRecommendationService()
        {
            if (mItemRecommendationService == null)
            {
                String s = mWalmartNetServiceSettings.getIrsHost();
                WalmartLog walmartlog = WalmartLog.create();
                mItemRecommendationService = new ItemRecommendationService(s, mWalmartNetService, mSharedObjectMapper, walmartlog);
            }
            return mItemRecommendationService;
        }

        public ItemReviewService getItemReviewService()
        {
            if (mItemReviewService == null)
            {
                String s = mWalmartNetServiceSettings.getItemReviewsHost();
                WalmartLog walmartlog = WalmartLog.create();
                mItemReviewService = new ItemReviewService(s, mSharedObjectMapper, walmartlog);
            }
            return mItemReviewService;
        }

        public ItemService getItemService()
        {
            if (mItemService == null)
            {
                String s = mWalmartNetServiceSettings.getWwwHost();
                WalmartLog walmartlog = WalmartLog.create();
                mItemService = new ItemService(s, mSharedObjectMapper, walmartlog);
            }
            return mItemService;
        }

        public OrderHistoryService getOrderHistoryService()
        {
            if (mOrderHistoryService == null)
            {
                String s = Uri.parse(mWalmartNetServiceSettings.getBaseUrl()).getHost();
                WalmartLog walmartlog = WalmartLog.create();
                mOrderHistoryService = new OrderHistoryService(s, mSharedObjectMapper, walmartlog);
            }
            return mOrderHistoryService;
        }

        public PharmacyLegacyService getPharmacyLegacyService()
        {
            if (mPharmacyLegacyService == null)
            {
                String s = Uri.parse(mWalmartNetServiceSettings.getBaseUrl()).getHost();
                WalmartLog walmartlog = WalmartLog.create();
                mPharmacyLegacyService = new PharmacyLegacyService(s, mSharedObjectMapper, walmartlog);
            }
            return mPharmacyLegacyService;
        }

        public PharmacyService getPharmacyService()
        {
            return mPharmacyService;
        }

        public SaverService getSaverService()
        {
            return mSaverService;
        }

        public SaverServiceSettings getSaverServiceSettings()
        {
            return mSaverServiceSettings;
        }

        public ShippingPassService getShippingPassService()
        {
            if (mShippingPassService == null)
            {
                String s = mWalmartNetServiceSettings.getHapiHost();
                WalmartLog walmartlog = WalmartLog.create();
                mShippingPassService = new ShippingPassService(s, mSharedObjectMapper, walmartlog);
            }
            return mShippingPassService;
        }

        public TaxonomyService getTaxonomyService()
        {
            if (mTaxonomyService == null)
            {
                String s = mWalmartNetServiceSettings.getHapiHost();
                WalmartLog walmartlog = WalmartLog.create();
                mTaxonomyService = new TaxonomyService(s, mSharedObjectMapper, walmartlog);
            }
            return mTaxonomyService;
        }

        public TypeAheadService getTypeAheadService()
        {
            if (mTypeAheadService == null)
            {
                String s = mWalmartNetServiceSettings.getHapiHost();
                WalmartLog walmartlog = WalmartLog.create();
                mTypeAheadService = new TypeAheadService(s, mSharedObjectMapper, walmartlog);
            }
            return mTypeAheadService;
        }

        public WalmartPharmacyServiceSettings getWalmartPharmacyServiceSettings()
        {
            return mWalmartPharmacyServiceSettings;
        }

        public WalmartNetService getWalmartService()
        {
            return mWalmartNetService;
        }

        public WalmartNetServiceSettings getWalmartServiceSettings()
        {
            return mWalmartNetServiceSettings;
        }

        public WeeklyAdService getWeeklyAdService()
        {
            if (mWeeklyAdService == null)
            {
                mWeeklyAdService = new WeeklyAdService(mWalmartNetServiceSettings.getWeeklyAdHost(), mSharedObjectMapper, WalmartLog.create());
            }
            return mWeeklyAdService;
        }

        protected void init()
        {
            ExecutorService executorservice = Executors.newFixedThreadPool(4);
            Object obj = HTTPService.createHttpClient(mContext, 30000, 45000);
            Object obj1 = new NonUriAssociativeCookieStore();
            CookieManager cookiemanager = new CookieManager(((CookieStore) (obj1)), CookiePolicy.ACCEPT_ORIGINAL_SERVER);
            SharedHttpClient.get().setCookieHandler(cookiemanager);
            ((AbstractHttpClient)obj).setCookieStore(new ApacheWrapperCookieStore(((CookieStore) (obj1))));
            obj = new HttpRequestExecutor(mContext, ((org.apache.http.client.HttpClient) (obj)));
            ((CookieManager)SharedHttpClient.get().getCookieHandler()).getCookieStore().getCookies();
            mSharedObjectMapper = new ObjectMapper();
            mSharedObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mSharedObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            mWalmartNetServiceSettings = new WalmartNetServiceSettings(mContext);
            mWalmartNetService = new WalmartNetServiceImpl(mContext, executorservice, ((HttpRequestExecutor) (obj)), mWalmartNetServiceSettings);
            obj1 = new SaverProviderImpl(mContext);
            mEReceiptProvider = ((EReceiptProvider) (obj1));
            createEReceiptService(executorservice, ((HttpRequestExecutor) (obj)));
            createEReceiptManager(((EReceiptProvider) (obj1)));
            createSaverService(executorservice, ((HttpRequestExecutor) (obj)));
            createSaverManager(((SaverProvider) (obj1)));
            createPharmacyService(executorservice, ((HttpRequestExecutor) (obj)));
            createPharmacyManager();
            createFastPickupManager();
            createStoreLocatorService();
            createShippingPassManager();
            createPaymentServices();
            createWishListManager();
            createWalmartPayManager();
            syncCartCookies();
            registerMocks();
        }

        ServicesImpl(Context context)
        {
            mContext = context;
        }
    }

    private static class WalmartLog extends Log
    {

        public static WalmartLog create()
        {
            return create(com.walmartlabs.kangaroo.service.Log.Level.EVERYTHING);
        }

        public static WalmartLog create(com.walmartlabs.kangaroo.service.Log.Level level)
        {
            return new WalmartLog(com.walmartlabs.kangaroo.service.Log.Level.BASIC);
        }

        public void exception(String s, String s1, Throwable throwable, boolean flag)
        {
            WLog.e(s, s1, throwable);
        }

        public void print(String s, String s1, boolean flag)
        {
            if (!flag);
            WLog.d(s, s1);
        }

        private WalmartLog(com.walmartlabs.kangaroo.service.Log.Level level)
        {
            super(level);
        }
    }

    private static class WalmartPaymentServices extends PaymentServices
    {

        private CustomerService mCustomerService;
        private final ObjectMapper mSharedObjectMapper;
        private final WalmartNetServiceSettings mWalmartNetServiceSettings;

        public void destroy()
        {
            super.destroy();
            MessageBus.getBus().unregister(this);
        }

        public CustomerService getCustomerService()
        {
            if (mCustomerService == null)
            {
                String s = mWalmartNetServiceSettings.getCustomerHost();
                WalmartLog walmartlog = WalmartLog.create();
                mCustomerService = new CustomerService(s, mSharedObjectMapper, walmartlog);
            }
            return mCustomerService;
        }

        protected void init()
        {
            super.init();
            MessageBus.getBus().register(this);
        }

        private WalmartPaymentServices(WalmartNetServiceSettings walmartnetservicesettings, ObjectMapper objectmapper)
        {
            mWalmartNetServiceSettings = walmartnetservicesettings;
            mSharedObjectMapper = objectmapper;
        }

    }


    private static Services sInstance;

    public Services()
    {
    }

    public static void create(Context context)
    {
        if (sInstance != null)
        {
            sInstance.destroy();
        }
        sInstance = new ServicesImpl(context);
        sInstance.init();
    }

    public static Services get()
    {
        return sInstance;
    }

    protected abstract void destroy();

    public abstract Authentication getAuthentication();

    public abstract BrowsePersonalizationService getBrowsePersonalizationService();

    public abstract BrowseSearchService getBrowseSearchService();

    public abstract CartManager getCartManager();

    public abstract CartService getCartService();

    public abstract EReceiptProvider getEReceiptProvider();

    public abstract EReceiptService getEReceiptService();

    public abstract EReceiptServiceSettings getEReceiptServiceSettings();

    public abstract FastPickupManager getFastPickupManager();

    public abstract InStoreSearchService getInStoreSearchService();

    public abstract ItemRecommendationService getItemRecommendationService();

    public abstract ItemReviewService getItemReviewService();

    public abstract ItemService getItemService();

    public abstract OrderHistoryService getOrderHistoryService();

    public abstract PharmacyLegacyService getPharmacyLegacyService();

    public abstract PharmacyService getPharmacyService();

    public abstract SaverService getSaverService();

    public abstract SaverServiceSettings getSaverServiceSettings();

    public abstract ShippingPassService getShippingPassService();

    public abstract TaxonomyService getTaxonomyService();

    public abstract TypeAheadService getTypeAheadService();

    public abstract WalmartPharmacyServiceSettings getWalmartPharmacyServiceSettings();

    public abstract WalmartNetService getWalmartService();

    public abstract WalmartNetServiceSettings getWalmartServiceSettings();

    public abstract WeeklyAdService getWeeklyAdService();

    protected abstract void init();
}
