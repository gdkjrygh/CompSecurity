// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.ui.StoreAddressView;
import com.walmartlabs.storelocator.StoreData;
import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyUtils, PharmacyManager, PrescriptionPresenter

public abstract class OrderConfirmationBasePresenter extends Presenter
    implements com.walmartlabs.android.pharmacy.ui.StoreAddressView.OnShowStoreDetailsListener
{

    protected static final SimpleDateFormat sDateFormat;
    protected static final SimpleDateFormat sTimeFormat;
    protected Activity mActivity;
    protected long mPickupDate;
    protected StoreData mPickupStore;
    protected ViewGroup mRootView;
    protected StoreAddressView mStoreAddress;

    public OrderConfirmationBasePresenter(Activity activity, String s, String s1, StoreData storedata)
    {
        mActivity = activity;
        mPickupDate = PharmacyUtils.pickupDateToMillisecondsSinceEpoch(s, s1);
        mPickupStore = storedata;
    }

    private void updateLoadingVisibility(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        mRootView.findViewById(R.id.loading_view).setVisibility(byte0);
    }

    protected abstract Presenter getCreateAppAccountPresenter(PharmacyManager.OnFlowCompleted onflowcompleted);

    protected abstract Presenter getLinkAccountPresenter(PharmacyManager.OnFlowCompleted onflowcompleted);

    public String getTitleText()
    {
        return mActivity.getString(R.string.pharmacy_order_confirmation_title);
    }

    public View getView()
    {
        return mRootView;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_order_confirmation, viewgroup);
            mStoreAddress = (StoreAddressView)ViewUtil.findViewById(mRootView, R.id.pharmacy_order_confirmation_store_address);
            mStoreAddress.setOnShowStoreDetailsListener(this);
            populateView(mRootView);
            populateStoreAddress();
            setUpCalendarButton();
        }
    }

    public void onPushed()
    {
        super.onPushed();
        retrieveAccountStatus();
    }

    public void onShowStoreDetails(StoreData storedata)
    {
        pushPresenter(PharmacyManager.get().getStoreDetailPresenter(mActivity, storedata));
    }

    protected void populateAccountSections(boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        populateCreateAccountSection(flag1, flag);
    }

    protected void populateCreateAccountSection(boolean flag, boolean flag1)
    {
        Object obj = ViewUtil.findViewById(mRootView, R.id.pharmacy_order_confirmation_create_account);
        if (flag)
        {
            ((View) (obj)).setVisibility(0);
            obj = new PharmacyManager.OnFlowCompleted() {

                final OrderConfirmationBasePresenter this$0;

                public void onFlowCompleted()
                {
                    PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity);
                    pushPresenter(prescriptionpresenter);
                }

            
            {
                this$0 = OrderConfirmationBasePresenter.this;
                super();
            }
            };
            TextView textview = (TextView)ViewUtil.findViewById(mRootView, R.id.pharmacy_order_confirmation_create_account_infotext);
            Button button = (Button)ViewUtil.findViewById(mRootView, R.id.access_pharmacy_account_bt);
            if (flag1)
            {
                textview.setText(R.string.pharmacy_order_confirmation_get_started_info_text);
                button.setText(R.string.pharmacy_order_confirmation_get_started);
                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pharmacy_getstarted_icn_selector, 0, 0, 0);
                button.setOnClickListener(new OnSingleClickListener(((PharmacyManager.OnFlowCompleted) (obj))) {

                    final OrderConfirmationBasePresenter this$0;
                    final PharmacyManager.OnFlowCompleted val$callback;

                    public void onSingleClick(View view)
                    {
                        view = getLinkAccountPresenter(callback);
                        if (view != null)
                        {
                            getPresenterStack().popToRoot();
                            pushPresenter(view, true);
                        }
                    }

            
            {
                this$0 = OrderConfirmationBasePresenter.this;
                callback = onflowcompleted;
                super(final_presenter);
            }
                });
            } else
            {
                textview.setText(R.string.pharmacy_order_confirmation_create_account_info_text);
                button.setText(R.string.pharmacy_order_confirmation_signup_pharmacy_account);
                button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pharmacy_create_account_selector, 0, 0, 0);
                button.setOnClickListener(new OnSingleClickListener(((PharmacyManager.OnFlowCompleted) (obj))) {

                    final OrderConfirmationBasePresenter this$0;
                    final PharmacyManager.OnFlowCompleted val$callback;

                    public void onSingleClick(View view)
                    {
                        view = getCreateAppAccountPresenter(callback);
                        if (view != null)
                        {
                            getPresenterStack().popToRoot();
                            pushPresenter(view, true);
                        }
                    }

            
            {
                this$0 = OrderConfirmationBasePresenter.this;
                callback = onflowcompleted;
                super(final_presenter);
            }
                });
            }
        } else
        {
            ((View) (obj)).setVisibility(8);
        }
        updateLoadingVisibility(true);
    }

    protected void populateStoreAddress()
    {
        if (mPickupStore != null)
        {
            mStoreAddress.setStore(mPickupStore);
        }
    }

    protected abstract void populateView(View view);

    protected void retrieveAccountStatus()
    {
        PharmacyManager.VerifySessionCallback verifysessioncallback = new PharmacyManager.VerifySessionCallback() {

            final OrderConfirmationBasePresenter this$0;
            final PharmacyManager.HasRxEnabledAccountCallback val$hasRxEnabledAccountCallback;

            public void onSessionAvailable()
            {
                PharmacyManager.get().hasRxEnabledAccount(hasRxEnabledAccountCallback);
            }

            public void onSessionUnavailable()
            {
                populateAccountSections(false, false);
            }

            
            {
                this$0 = OrderConfirmationBasePresenter.this;
                hasRxEnabledAccountCallback = hasrxenabledaccountcallback;
                super();
            }
        };
        PharmacyManager.get().verifySession(verifysessioncallback);
    }

    protected void setUpCalendarButton()
    {
        Button button = (Button)ViewUtil.findViewById(mRootView, R.id.calendar_button);
        if (mPickupDate > 0L && mPickupStore != null)
        {
            final Intent intent = mActivity.getString(R.string.pharmacy_order_confirmation_calendar_reminder_title);
            intent = PharmacyUtils.createCalendarReminderIntent(mPickupDate, intent, mPickupStore.getDescription(), mPickupStore.getAddressStreetLine(), mPickupStore.getCityStateZip());
            if (intent.resolveActivity(mActivity.getPackageManager()) != null)
            {
                button.setOnClickListener(new android.view.View.OnClickListener() {

                    final OrderConfirmationBasePresenter this$0;
                    final Intent val$intent;

                    public void onClick(View view)
                    {
                        mActivity.startActivity(intent);
                        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:AddToCalendar"));
                    }

            
            {
                this$0 = OrderConfirmationBasePresenter.this;
                intent = intent1;
                super();
            }
                });
                return;
            } else
            {
                button.setVisibility(8);
                return;
            }
        } else
        {
            button.setVisibility(8);
            return;
        }
    }

    static 
    {
        sTimeFormat = new SimpleDateFormat("hh:mma", Locale.US);
        sDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
    }




    // Unreferenced inner class com/walmartlabs/android/pharmacy/OrderConfirmationBasePresenter$2

/* anonymous class */
    class _cls2
        implements PharmacyManager.HasRxEnabledAccountCallback
    {

        final OrderConfirmationBasePresenter this$0;

        public void onResult(PharmacyManager.HasRxEnabledAccountResult hasrxenabledaccountresult)
        {
            OrderConfirmationBasePresenter orderconfirmationbasepresenter = OrderConfirmationBasePresenter.this;
            boolean flag;
            if (hasrxenabledaccountresult == PharmacyManager.HasRxEnabledAccountResult.YES)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            orderconfirmationbasepresenter.populateAccountSections(true, flag);
        }

            
            {
                this$0 = OrderConfirmationBasePresenter.this;
                super();
            }
    }

}
