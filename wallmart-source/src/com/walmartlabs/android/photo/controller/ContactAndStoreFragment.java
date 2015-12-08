// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.DomainMapper;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.store.StoreStatus;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.model.user.Store;
import com.walmartlabs.android.photo.model.user.UserPreferences;
import com.walmartlabs.android.photo.model.wire.WireStoreStatus;
import com.walmartlabs.android.photo.net.PhotoClient;
import com.walmartlabs.android.photo.net.PhotoResponse;
import com.walmartlabs.android.photo.service.order.OrderService;
import com.walmartlabs.android.photo.util.OrderUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import com.walmartlabs.android.photo.util.RefreshTimer;
import com.walmartlabs.android.photo.util.analytics.AnalyticsHelper;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettingsUtils;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;
import com.walmartlabs.android.photo.view.PhotoBaseView;
import com.walmartlabs.android.photo.view.PhotoDialogFactory;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationSummaryView;
import java.io.IOException;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderAwareFragment, OrderActivity, EnterPhoneDialogFragment

public class ContactAndStoreFragment extends OrderAwareFragment
{
    private class VerifyConnectivityAndSendOrderToServiceTask extends AsyncTask
    {

        private final String TAG;
        private boolean mAlreadyProcessingOrder;
        private boolean mAuthVerificationNeeded;
        private boolean mAuthenticated;
        private boolean mInternetAvailable;
        private Dialog mProgressDialog;
        private boolean mServersReachable;
        private boolean mServiceUnavailable;
        private boolean mStoreOnline;
        final ContactAndStoreFragment this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient Void doInBackground(String as[])
        {
            Object obj;
            obj = PhotoClient.get(getActivity());
            mInternetAvailable = ((PhotoClient) (obj)).checkConnectivity();
            mServersReachable = ((PhotoClient) (obj)).checkBlixtConnectivity();
            mAlreadyProcessingOrder = OrderService.isProcessingOrder();
            PhotoResponse photoresponse = ((PhotoClient) (obj)).verifyAuthentication();
            boolean flag;
            if (photoresponse.getStatus() == 200)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mAuthenticated = flag;
            if (photoresponse.getStatus() == 503)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                mServiceUnavailable = flag;
            }
            catch (IOException ioexception)
            {
                PhotoLogger.get().d(TAG, (new StringBuilder()).append("IOException: ").append(ioexception).toString());
                mInternetAvailable = false;
            }
            if (as == null || as.length != 1) goto _L2; else goto _L1
_L1:
            obj = ((PhotoClient) (obj)).getStoreAvailability(as[0]);
            if (((PhotoResponse) (obj)).getStatus() != 200 || ((PhotoResponse) (obj)).getEntity() == null)
            {
                break MISSING_BLOCK_LABEL_219;
            }
            as = DomainMapper.get(getActivity()).mapStoreStatusFromWireStoreStatus((WireStoreStatus)PhotoObjectMapper.get().readFromString(((PhotoResponse) (obj)).getEntity(), com/walmartlabs/android/photo/model/wire/WireStoreStatus));
            if (as == null) goto _L4; else goto _L3
_L3:
            if (!as.isOnline()) goto _L4; else goto _L5
_L5:
            flag = true;
_L6:
            try
            {
                mStoreOnline = flag;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                PhotoLogger.get().d(TAG, (new StringBuilder()).append("IOException: ").append(as).toString());
                mInternetAvailable = false;
            }
_L2:
            return null;
_L4:
            flag = false;
              goto _L6
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Store seems to be offline: ").append(as[0]).toString());
              goto _L2
        }

        protected void onCancelled()
        {
            PhotoLogger.get().d(TAG, "Task cancelled, will not proceed with order");
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            long l = AppIntegrationFactory.create(getActivity()).getLastLoginTime();
            boolean flag;
            if (System.currentTimeMillis() - l > 0x1b7740L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mAuthVerificationNeeded = flag;
            if (!mInternetAvailable || !mServersReachable || mAlreadyProcessingOrder || !mAuthenticated || mServiceUnavailable || !mStoreOnline || mAuthVerificationNeeded) goto _L2; else goto _L1
_L1:
            proceed();
_L4:
            if (mProgressDialog != null && mProgressDialog.isShowing())
            {
                mProgressDialog.dismiss();
            }
            return;
_L2:
            if (!mInternetAvailable)
            {
                displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_no_connection_title), getString(com.walmartlabs.android.photo.R.string.photo_no_connection));
            } else
            if (!mServersReachable)
            {
                displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_no_server_title), getString(com.walmartlabs.android.photo.R.string.photo_no_server));
            } else
            if (mServiceUnavailable)
            {
                displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_service_unavailable_title), getString(com.walmartlabs.android.photo.R.string.photo_service_unavailable_message));
            } else
            if (!mStoreOnline)
            {
                displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_store_offline_title), getString(com.walmartlabs.android.photo.R.string.photo_store_offline));
            } else
            if (mAlreadyProcessingOrder)
            {
                displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_order_being_processed_title), getString(com.walmartlabs.android.photo.R.string.photo_order_being_processed));
            } else
            if (!mAuthenticated)
            {
                launchLogin(6002);
            } else
            if (mAuthVerificationNeeded)
            {
                launchLogin(6002);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected void onPreExecute()
        {
            mProgressDialog = PhotoDialogFactory.createProgressOnlyDialog(getActivity());
            mProgressDialog.show();
        }

        private VerifyConnectivityAndSendOrderToServiceTask()
        {
            this$0 = ContactAndStoreFragment.this;
            super();
            TAG = com/walmartlabs/android/photo/controller/ContactAndStoreFragment$VerifyConnectivityAndSendOrderToServiceTask.getSimpleName();
        }

    }


    private static final int REQUEST_CODE_LOGIN = 6001;
    private static final int REQUEST_CODE_LOGIN_VERIFY = 6002;
    private static final String TAG = com/walmartlabs/android/photo/controller/ContactAndStoreFragment.getSimpleName();
    private static final long VERIFY_TIMEOUT = 0x1b7740L;
    private PhotoBaseView mBaseView;
    private boolean mIsLaunchingExternal;
    private boolean mLaunchedLogin;
    private VerifyConnectivityAndSendOrderToServiceTask mOrderTask;

    public ContactAndStoreFragment()
    {
    }

    private void displayMessage(String s, String s1)
    {
        DialogFactory.createAlertDialog(s, s1, getActivity()).show();
    }

    private void doRefresh()
    {
        (new RefreshTimer(500L) {

            final ContactAndStoreFragment this$0;

            public void onRefresh()
            {
                if (isAdded())
                {
                    refresh();
                }
            }

            
            {
                this$0 = ContactAndStoreFragment.this;
                super(l);
            }
        }).start();
    }

    private void launchLogin(int i)
    {
        Intent intent = AppIntegrationFactory.create(getActivity()).getLoginActivityIntent(getActivity());
        mIsLaunchingExternal = true;
        mLaunchedLogin = true;
        startActivityForResult(intent, i);
    }

    public static ContactAndStoreFragment newInstance(PendingOrder pendingorder)
    {
        ContactAndStoreFragment contactandstorefragment = new ContactAndStoreFragment();
        contactandstorefragment.setOrder(pendingorder);
        return contactandstorefragment;
    }

    private void proceed()
    {
        AnalyticsHelper.post(AnalyticsHelper.preparePlacedOrderEvent());
        Intent intent = new Intent(getActivity(), com/walmartlabs/android/photo/service/order/OrderService);
        intent.putExtra("order", getOrder());
        OrderService.start(getActivity(), intent);
        startActivity(new Intent(getActivity().getApplicationContext(), com/walmartlabs/android/photo/controller/OrderActivity));
        getActivity().finish();
        getActivity().overridePendingTransition(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left);
    }

    private void refresh()
    {
        PendingOrder pendingorder = getOrder();
        mBaseView.getSummaryView().setModel(OrderUtils.printsCount(pendingorder), OrderUtils.totalDue(pendingorder));
        updateContact();
        updateStore();
    }

    private void updateContact()
    {
        Button button = (Button)getView().findViewById(com.walmartlabs.android.photo.R.id.no_contact_button);
        TextView textview = (TextView)getView().findViewById(com.walmartlabs.android.photo.R.id.contact_name);
        TextView textview1 = (TextView)getView().findViewById(com.walmartlabs.android.photo.R.id.contact_email);
        TextView textview2 = (TextView)getView().findViewById(com.walmartlabs.android.photo.R.id.enter_phone);
        Contact contact = UserPreferences.get(getActivity()).getContact();
        if (contact.hasNameAddressEmail())
        {
            if (mLaunchedLogin)
            {
                mLaunchedLogin = false;
                AnalyticsHelper.post(AnalyticsHelper.prepareLoginSuccessEvent());
            }
            button.setVisibility(8);
            textview.setVisibility(0);
            textview1.setVisibility(0);
            textview.setText((new StringBuilder()).append(contact.getFirstName()).append(" ").append(contact.getLastName()).toString());
            textview1.setText(contact.getEmail());
        } else
        {
            if (mLaunchedLogin)
            {
                mLaunchedLogin = false;
                AnalyticsHelper.post(AnalyticsHelper.prepareLoginFailureEvent());
                AnalyticsHelper.post(AnalyticsHelper.prepareLoginFailureReasonEvent("Login failed"));
            }
            button.setVisibility(0);
            textview.setVisibility(8);
            textview1.setVisibility(8);
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final ContactAndStoreFragment this$0;

            public void onClick(View view)
            {
                launchLogin(6001);
            }

            
            {
                this$0 = ContactAndStoreFragment.this;
                super();
            }
        });
        if (!TextUtils.isEmpty(contact.getPhone()))
        {
            getView().findViewById(com.walmartlabs.android.photo.R.id.phone_description).setVisibility(0);
            textview2.setText(PhoneNumberUtils.formatNumber(contact.getPhone()));
            textview2.setBackgroundResource(com.walmartlabs.android.photo.R.drawable.photo_phone_field_disabled);
        } else
        {
            getView().findViewById(com.walmartlabs.android.photo.R.id.phone_description).setVisibility(8);
            textview2.setText("");
            textview2.setBackgroundResource(com.walmartlabs.android.photo.R.drawable.photo_phone_field_enabled);
        }
        textview2.setOnClickListener(new android.view.View.OnClickListener() {

            final ContactAndStoreFragment this$0;

            public void onClick(View view)
            {
                view = EnterPhoneDialogFragment.newInstance(UserPreferences.get(getActivity()).getContact().getPhone());
                view.setTargetFragment(ContactAndStoreFragment.this, 0);
                view.show(getFragmentManager(), "enter_phone_dialog");
            }

            
            {
                this$0 = ContactAndStoreFragment.this;
                super();
            }
        });
    }

    private void updateStore()
    {
        Button button = (Button)getView().findViewById(com.walmartlabs.android.photo.R.id.store_button);
        Button button1 = (Button)getView().findViewById(com.walmartlabs.android.photo.R.id.no_store_button);
        if (UserPreferences.get(getActivity()).getStore().isComplete())
        {
            getView().findViewById(com.walmartlabs.android.photo.R.id.store_layout).setVisibility(0);
            getView().findViewById(com.walmartlabs.android.photo.R.id.no_store_button).setVisibility(8);
            ((TextView)getView().findViewById(com.walmartlabs.android.photo.R.id.store_name)).setText(UserPreferences.get(getActivity()).getStore().getName());
            ((TextView)getView().findViewById(com.walmartlabs.android.photo.R.id.store_info)).setText(UserPreferences.get(getActivity()).getStore().getAddressAndPhone());
            button.setText(com.walmartlabs.android.photo.R.string.photo_change);
        } else
        {
            getView().findViewById(com.walmartlabs.android.photo.R.id.store_layout).setVisibility(8);
            getView().findViewById(com.walmartlabs.android.photo.R.id.no_store_button).setVisibility(0);
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final ContactAndStoreFragment this$0;

            public void onClick(View view)
            {
                view = AppIntegrationFactory.create(getActivity()).getStoreSelectionActivityIntent(getActivity());
                mIsLaunchingExternal = true;
                startActivity(view);
            }

            
            {
                this$0 = ContactAndStoreFragment.this;
                super();
            }
        });
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            final ContactAndStoreFragment this$0;

            public void onClick(View view)
            {
                view = AppIntegrationFactory.create(getActivity()).getStoreSelectionActivityIntent(getActivity());
                mIsLaunchingExternal = true;
                startActivity(view);
            }

            
            {
                this$0 = ContactAndStoreFragment.this;
                super();
            }
        });
    }

    public void notifyPhoneUpdated(String s)
    {
        UserPreferences.get(getActivity()).setPhone(s);
        refresh();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("onActivityResult(").append(i).append(", ").append(j).append(", ").append(intent).append(")").toString());
        if (i == 6002 && j == 1)
        {
            proceed();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_place_order));
        mBaseView = (PhotoBaseView)layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_fragment_base, viewgroup, false);
        mBaseView.setPrimaryButtonVisible(true);
        mBaseView.setPrimaryButtonText(getString(com.walmartlabs.android.photo.R.string.photo_place_order));
        mBaseView.setButtonListener(new com.walmartlabs.android.photo.view.PhotoBaseView.ButtonListener() {

            final ContactAndStoreFragment this$0;

            public void onPrimaryClicked()
            {
                PendingOrder pendingorder = getOrder();
                pendingorder.setContact(UserPreferences.get(getActivity()).getContact());
                pendingorder.setStore(UserPreferences.get(getActivity()).getStore());
                pendingorder.setCloudId(AppIntegrationFactory.create(getActivity()).getCloudId());
                if (pendingorder.isComplete())
                {
                    mOrderTask = new VerifyConnectivityAndSendOrderToServiceTask();
                    mOrderTask.execute(new String[] {
                        pendingorder.getStore().getId()
                    });
                    return;
                }
                if (!pendingorder.hasQuantity())
                {
                    displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_order_no_quantity_title), getString(com.walmartlabs.android.photo.R.string.photo_order_no_quantity));
                    return;
                }
                if (!pendingorder.hasContact())
                {
                    displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_order_no_contact_title), getString(com.walmartlabs.android.photo.R.string.photo_order_no_contact));
                    return;
                }
                if (!pendingorder.hasStore())
                {
                    displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_order_no_store_title), getString(com.walmartlabs.android.photo.R.string.photo_order_no_store));
                    return;
                }
                if (!pendingorder.hasPhone())
                {
                    displayMessage(getString(com.walmartlabs.android.photo.R.string.photo_order_no_phone_title), getString(com.walmartlabs.android.photo.R.string.photo_order_no_phone));
                    return;
                } else
                {
                    Toast.makeText(getActivity(), com.walmartlabs.android.photo.R.string.photo_order_incomplete, 0).show();
                    return;
                }
            }

            
            {
                this$0 = ContactAndStoreFragment.this;
                super();
            }
        });
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_contact_store_main, null);
        mBaseView.setMainContent(layoutinflater);
        if (PhotoDebugSettingsUtils.isDebugMode(getActivity()))
        {
            layoutinflater = PhotoDebugSettingsUtils.getDebugServerTypeString(getActivity());
            if (!TextUtils.isEmpty(layoutinflater))
            {
                mBaseView.setPrimaryButtonText((new StringBuilder()).append(getString(com.walmartlabs.android.photo.R.string.photo_place_order)).append(" (").append(layoutinflater).append(")").toString());
            }
        }
        return mBaseView;
    }

    public void onPause()
    {
label0:
        {
            super.onPause();
            if (mIsLaunchingExternal)
            {
                mIsLaunchingExternal = false;
                if (!mLaunchedLogin)
                {
                    break label0;
                }
                getActivity().overridePendingTransition(com.walmartlabs.android.photo.R.anim.photo_slide_in_up, com.walmartlabs.android.photo.R.anim.photo_stay);
            }
            return;
        }
        getActivity().overridePendingTransition(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left);
    }

    public void onResume()
    {
        super.onResume();
        doRefresh();
    }




/*
    static VerifyConnectivityAndSendOrderToServiceTask access$002(ContactAndStoreFragment contactandstorefragment, VerifyConnectivityAndSendOrderToServiceTask verifyconnectivityandsendordertoservicetask)
    {
        contactandstorefragment.mOrderTask = verifyconnectivityandsendordertoservicetask;
        return verifyconnectivityandsendordertoservicetask;
    }

*/





/*
    static boolean access$502(ContactAndStoreFragment contactandstorefragment, boolean flag)
    {
        contactandstorefragment.mIsLaunchingExternal = flag;
        return flag;
    }

*/

}
