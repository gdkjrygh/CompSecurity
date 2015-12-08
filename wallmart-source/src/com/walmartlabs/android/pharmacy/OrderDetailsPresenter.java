// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.service.Refill;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.android.pharmacy.ui.StoreAddressView;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PlaceHolderStoreData, PharmacyResponse, PharmacyUtils

public class OrderDetailsPresenter extends Presenter
    implements com.walmartlabs.android.pharmacy.ui.StoreAddressView.OnShowStoreDetailsListener
{

    private static final String TAG = com/walmartlabs/android/pharmacy/OrderDetailsPresenter.getSimpleName();
    private static final SimpleDateFormat sFormattedDate;
    private static final SimpleDateFormat sRefillFormat;
    private final Activity mActivity;
    private boolean mLoading;
    private com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill mPrescription;
    private ViewGroup mRootView;
    private StoreAddressView mStoreAddress;
    private StoreData mStoreInfo;

    public OrderDetailsPresenter(Activity activity, com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill rxfill)
    {
        mActivity = activity;
        mPrescription = rxfill;
        setTitleText(mActivity.getString(R.string.pharmacy_order_details_title));
    }

    private void getStoreInfo(final int storeNumber)
    {
        com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

            final OrderDetailsPresenter this$0;
            final int val$storeNumber;

            private void handleServerResponse(StoreData astoredata[])
            {
                if (isPopped())
                {
                    return;
                }
                if (astoredata != null && astoredata.length > 0)
                {
                    mStoreInfo = astoredata[0];
                } else
                {
                    mStoreInfo = new PlaceHolderStoreData(mActivity, storeNumber);
                }
                populateStoreInfo();
            }

            public void onFailure(int i)
            {
                handleServerResponse(null);
            }

            public void onStoresReceived(StoreData astoredata[])
            {
                handleServerResponse(astoredata);
            }

            
            {
                this$0 = OrderDetailsPresenter.this;
                storeNumber = i;
                super();
            }
        };
        StoreService.getStoreService().getStore(storeNumber, getstorescallback);
    }

    private void loadOrderDetails()
    {
        if (mLoading)
        {
            return;
        }
        mLoading = true;
        if (!mPrescription.isShip())
        {
            getStoreInfo(mPrescription.storeNumber);
        }
        PharmacyManager.get().loadOrderDetails(mPrescription.fillId, mPrescription.storeNumber, new AsyncCallbackOnThread(new Handler()) {

            final OrderDetailsPresenter this$0;

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                if (isPopped())
                {
                    return;
                } else
                {
                    mLoading = false;
                    showDialog(0x10004);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                Object obj1;
                Refill refill;
                if (isPopped())
                {
                    return;
                }
                mLoading = false;
                if (pharmacyresponse == null || pharmacyresponse.data == null)
                {
                    break MISSING_BLOCK_LABEL_653;
                }
                refill = (Refill)pharmacyresponse.data;
                obj1 = null;
                pharmacyresponse = null;
                Object obj = OrderDetailsPresenter.sRefillFormat.parse(refill.fillDate);
                pharmacyresponse = ((PharmacyResponse) (obj));
                java.util.Date date = OrderDetailsPresenter.sRefillFormat.parse(mPrescription.rxExpDate);
                obj1 = date;
                pharmacyresponse = ((PharmacyResponse) (obj));
                obj = obj1;
_L1:
                if (!TextUtils.isEmpty(mPrescription.fillStatus))
                {
                    int i = PharmacyUtils.mapFillStatusToFlagResId(mPrescription);
                    int j = PharmacyUtils.mapFillStatusToStringResId(mPrescription);
                    ParseException parseexception;
                    if (i != 0 && j != 0)
                    {
                        obj1 = (TextView)ViewUtil.findViewById(mRootView, R.id.order_details_status);
                        ((TextView) (obj1)).setBackgroundResource(i);
                        ((TextView) (obj1)).setText(j);
                    } else
                    {
                        ViewUtil.findViewById(mRootView, R.id.refill_status_content).setVisibility(8);
                    }
                } else
                {
                    ViewUtil.findViewById(mRootView, R.id.refill_status_content).setVisibility(8);
                }
                ViewUtil.setText(R.id.drug_name, mRootView, WordUtils.capitalizeFully(refill.dispensedDrugName));
                if (mPrescription.fillQuantity > 0)
                {
                    obj1 = (TextView)ViewUtil.findViewById(mRootView, R.id.fill_quantity);
                    ((TextView) (obj1)).setVisibility(0);
                    ((TextView) (obj1)).setText(mActivity.getString(R.string.pharmacy_order_details_quantity, new Object[] {
                        Integer.valueOf(mPrescription.fillQuantity)
                    }));
                }
                ViewUtil.setText(R.id.rx_number, mRootView, mActivity.getString(R.string.pharmacy_rx_number, new Object[] {
                    Integer.valueOf(mPrescription.rxNumber)
                }));
                if (!TextUtils.isEmpty(mPrescription.prescriber))
                {
                    ViewUtil.setText(R.id.prescriber, mRootView, WordUtils.capitalizeFully(mPrescription.prescriber));
                }
                if (obj != null)
                {
                    obj1 = (TextView)ViewUtil.findViewById(mRootView, R.id.refill_expiration_date);
                    ((TextView) (obj1)).setVisibility(0);
                    ((TextView) (obj1)).setText(mActivity.getString(R.string.pharmacy_refills_expires_title, new Object[] {
                        OrderDetailsPresenter.sFormattedDate.format(((java.util.Date) (obj)))
                    }));
                }
                if (pharmacyresponse != null)
                {
                    ViewUtil.findViewById(mRootView, R.id.refill_date_content).setVisibility(0);
                    ViewUtil.setText(R.id.refill_date, mRootView, mActivity.getString(R.string.pharmacy_ordered_date, new Object[] {
                        OrderDetailsPresenter.sFormattedDate.format(pharmacyresponse)
                    }));
                }
                if (refill.fillCost > 0.0F)
                {
                    ViewUtil.setText(R.id.price, mRootView, mActivity.getString(R.string.pharmacy_order_details_price, new Object[] {
                        Float.valueOf(refill.fillCost)
                    }));
                }
                if (mPrescription.isShip() && refill.shippingAddress != null)
                {
                    ViewUtil.setText(R.id.ship_to_name, mRootView, WordUtils.capitalizeFully(refill.shippingName));
                    ViewUtil.setText(R.id.ship_to_address, mRootView, refill.shippingAddress.getAddress());
                    ViewUtil.findViewById(mRootView, R.id.shipping_information_container).setVisibility(0);
                }
                updateLoadingVisibility(true);
                return;
                parseexception;
                parseexception.printStackTrace();
                parseexception = ((ParseException) (obj1));
                  goto _L1
                showDialog(0x10004);
                return;
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = OrderDetailsPresenter.this;
                super(handler);
            }
        });
    }

    private void populateStoreInfo()
    {
        if (mRootView != null)
        {
            mStoreAddress.setStore(mStoreInfo);
            ViewUtil.findViewById(mRootView, R.id.store_loading_view).setVisibility(8);
        }
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.rx_number);
        TestFairyUtils.hideView(R.id.drug_name);
        TestFairyUtils.hideView(R.id.ship_to_name);
        TestFairyUtils.hideView(R.id.ship_to_address);
    }

    private void updateLoadingVisibility(boolean flag)
    {
        byte byte0 = 0;
        if (flag)
        {
            byte0 = 8;
        }
        mRootView.findViewById(R.id.loading_view).setVisibility(byte0);
    }

    public String getScreenName()
    {
        return "Rx:OrderDetail";
    }

    public View getView()
    {
        return mRootView;
    }

    protected Dialog onCreateDialog(int i)
    {
        return DialogFactory.onCreateDialog(i, mActivity, new com.walmartlabs.android.pharmacy.ui.DialogFactory.DialogListener() {

            final OrderDetailsPresenter this$0;

            public void onClicked(int j, int k, Object aobj[])
            {
                pop();
            }

            
            {
                this$0 = OrderDetailsPresenter.this;
                super();
            }
        });
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_order_details, viewgroup);
            mStoreAddress = (StoreAddressView)ViewUtil.findViewById(mRootView, R.id.order_details_store_info);
            mStoreAddress.setOnShowStoreDetailsListener(this);
            if (!mPrescription.isShip())
            {
                ViewUtil.findViewById(mRootView, R.id.pickup_location_container).setVisibility(0);
            }
            setupTestFairy();
        }
    }

    public void onPushed()
    {
        super.onPushed();
        loadOrderDetails();
        Bus bus = MessageBus.getBus();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmOrderDetailType");
        String s;
        if (mPrescription.isActive())
        {
            s = "active";
        } else
        {
            s = "past";
        }
        bus.post(builder.putString("pharmOrderHistoryDetailType", s));
    }

    public void onShowStoreDetails(StoreData storedata)
    {
        pushPresenter(PharmacyManager.get().getStoreDetailPresenter(mActivity, storedata));
    }

    static 
    {
        sRefillFormat = new SimpleDateFormat("MMddyyyy", Locale.US);
        sFormattedDate = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
    }


/*
    static StoreData access$002(OrderDetailsPresenter orderdetailspresenter, StoreData storedata)
    {
        orderdetailspresenter.mStoreInfo = storedata;
        return storedata;
    }

*/






/*
    static boolean access$302(OrderDetailsPresenter orderdetailspresenter, boolean flag)
    {
        orderdetailspresenter.mLoading = flag;
        return flag;
    }

*/






}
