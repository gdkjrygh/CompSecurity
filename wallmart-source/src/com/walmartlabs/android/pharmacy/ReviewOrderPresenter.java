// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.data.CartCheckoutData;
import com.walmartlabs.android.pharmacy.data.ProfileData;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.android.pharmacy.service.PickupTime;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.android.pharmacy.ui.StoreAddressView;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.storelocator.StorePickerListener;
import com.walmartlabs.storelocator.StoreService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PickupTimesSpinnerAdapter, PharmacyManager, PharmacyUtils, PharmacyResponse, 
//            PlaceHolderStoreData, PharmacySession, OrderConfirmationRefillPresenter

public class ReviewOrderPresenter extends Presenter
    implements com.walmartlabs.android.pharmacy.ui.StoreAddressView.OnShowStoreDetailsListener
{

    private static final int CANNOT_TRANSFER_TO_PHARMACY_DIALOG = 8;
    private static final int CART_LOADED = 2;
    private static final int ERROR_PLACING_ORDER_DIALOG = 3;
    private static final int GENERAL_ERROR_DIALOG = 0;
    private static final int LOADING_DIALOG = 4;
    private static final int NON_TRANSFERABLE_RX_DIALOG = 7;
    private static final int PHONE_EDITOR_DIALOG = 5;
    private static final int PICKUP_TIMES_LOADED = 4;
    private static final int PLACING_ORDER_DIALOG = 2;
    private static final int PLACING_ORDER_INVALID_TIME_DIALOG = 9;
    private static final int PROFILE_LOADED = 8;
    private static final int PROFILE_UPDATE_ERROR_DIALOG = 6;
    private static final int STORE_INFO_LOADED = 1;
    private static final String TAG = com/walmartlabs/android/pharmacy/ReviewOrderPresenter.getSimpleName();
    private static final int UPDATE_PICKUP_TIME_DIALOG = 1;
    private static final SimpleDateFormat sFormattedDate;
    private static final DateFormat sRefillFormat;
    private Activity mActivity;
    private Cart mCart;
    private com.walmartlabs.android.pharmacy.data.ProfileData.Communication mCommunication;
    private int mHomeDeliveryStoreNumber;
    private OrderConfirmationRefillPresenter.RefillListener mListener;
    private int mLoadStatus;
    private com.walmartlabs.android.pharmacy.service.PickupTime.Day mNextValidPickupTime[];
    private String mPhoneNumber;
    private com.walmartlabs.android.pharmacy.service.PickupTime.Day mPickupDatesAndTimes[];
    private int mPreferredPhoneType;
    private com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription mPrescription;
    private com.walmartlabs.android.pharmacy.service.PickupTime.Day mPreviousPickupDatesAndTimes[];
    private int mPreviousSelectedSpinnerPosition;
    private StoreData mPreviousStoreInfo;
    private int mPreviousStoreNumber;
    private com.walmartlabs.android.pharmacy.service.Cart.Refill mRefill;
    private ViewGroup mRootView;
    private int mSelectedSpinnerPosition;
    private Spinner mSpinner;
    private PickupTimesSpinnerAdapter mSpinnerAdapter;
    private StoreAddressView mStoreAddressGroup;
    private StoreData mStoreInfo;
    private int mStoreNumber;

    public ReviewOrderPresenter(Activity activity, OrderConfirmationRefillPresenter.RefillListener refilllistener)
    {
        this(activity, null, null, refilllistener);
    }

    public ReviewOrderPresenter(Activity activity, Cart cart, OrderConfirmationRefillPresenter.RefillListener refilllistener)
    {
        this(activity, cart, null, refilllistener);
    }

    public ReviewOrderPresenter(Activity activity, Cart cart, com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription, OrderConfirmationRefillPresenter.RefillListener refilllistener)
    {
        mSelectedSpinnerPosition = 0;
        mPreferredPhoneType = -1;
        mHomeDeliveryStoreNumber = -1;
        mActivity = activity;
        mCart = cart;
        mPrescription = prescription;
        if (mCart == null) goto _L2; else goto _L1
_L1:
        mRefill = mCart.getRefill();
        mStoreNumber = mCart.getStoreNumber();
_L4:
        mSpinnerAdapter = new PickupTimesSpinnerAdapter(mActivity);
        mListener = refilllistener;
        setTitleText(mActivity.getString(R.string.pharmacy_review_order_title));
        return;
_L2:
        if (mPrescription != null)
        {
            mStoreNumber = prescription.storeNumber;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void cancelOrder()
    {
        showDialog(4);
        int i;
        int j;
        if (mPrescription != null)
        {
            i = mPrescription.rxNumber;
        } else
        if (mRefill != null)
        {
            i = mRefill.rxNumber;
        } else
        {
            i = 0;
        }
        if (mPrescription != null)
        {
            j = mPrescription.storeNumber;
        } else
        if (mRefill != null)
        {
            j = mRefill.storeNumber;
        } else
        {
            j = 0;
        }
        PharmacyManager.get().deleteRefillFromCart(i, j, new AsyncCallbackOnThread(new Handler()) {

            final ReviewOrderPresenter this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(4);
                if (isPopped())
                {
                    return;
                }
                if (pharmacyresponse == null || pharmacyresponse.status != 1)
                {
                    String s = ReviewOrderPresenter.TAG;
                    StringBuilder stringbuilder = (new StringBuilder()).append("Failed to delete refill: ");
                    int k;
                    if (pharmacyresponse != null)
                    {
                        k = pharmacyresponse.status;
                    } else
                    {
                        k = 0;
                    }
                    Log.w(s, stringbuilder.append(k).toString());
                }
                pop();
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super(handler);
            }
        });
    }

    private void getCart()
    {
        if (mRefill != null)
        {
            updateLoadstatus(2);
            populateFromRefill();
            return;
        } else
        {
            PharmacyManager.get().getCart(new AsyncCallbackOnThread(new Handler()) {

                final ReviewOrderPresenter this$0;

                private void handleServerResponse(PharmacyResponse pharmacyresponse)
                {
                    if (isPopped())
                    {
                        return;
                    }
                    if (pharmacyresponse != null && pharmacyresponse.data != null && pharmacyresponse.status == 1)
                    {
                        mCart = (Cart)pharmacyresponse.data;
                        mStoreNumber = mCart.getStoreNumber();
                        if (mCart != null)
                        {
                            mRefill = mCart.getRefill();
                            if (mRefill != null)
                            {
                                populateFromRefill();
                                updateLoadstatus(2);
                                return;
                            } else
                            {
                                showDialog(0);
                                return;
                            }
                        } else
                        {
                            showDialog(0);
                            return;
                        }
                    } else
                    {
                        showDialog(0);
                        return;
                    }
                }

                public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
                {
                    handleServerResponse(pharmacyresponse);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
                }

                public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
                {
                    handleServerResponse(pharmacyresponse);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((PharmacyResponse)obj);
                }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super(handler);
            }
            });
            return;
        }
    }

    private void getPatientInfo()
    {
        if (mPrescription != null || isCustomer())
        {
            PharmacyManager.get().getAccountProfile(new AsyncCallbackOnThread(new Handler()) {

                final ReviewOrderPresenter this$0;

                private void handleServerResponse(PharmacyResponse pharmacyresponse)
                {
                    if (isPopped())
                    {
                        return;
                    }
                    if (pharmacyresponse != null && pharmacyresponse.status == 1 && pharmacyresponse.data != null)
                    {
                        StringBuilder stringbuilder = new StringBuilder();
                        com.walmartlabs.android.pharmacy.data.ProfileData.PatientName patientname = ((ProfileData)pharmacyresponse.data).patientName;
                        if (!TextUtils.isEmpty(patientname.firstName))
                        {
                            stringbuilder.append(WordUtils.capitalizeFully(patientname.firstName)).append(" ");
                        }
                        if (!TextUtils.isEmpty(patientname.middleName))
                        {
                            stringbuilder.append(WordUtils.capitalizeFully(patientname.middleName)).append(" ");
                        }
                        if (!TextUtils.isEmpty(patientname.lastName))
                        {
                            stringbuilder.append(WordUtils.capitalizeFully(patientname.lastName));
                        }
                        if (stringbuilder.length() == 0)
                        {
                            stringbuilder.append(mActivity.getString(R.string.pharmacy_patient_name));
                        }
                        ViewUtil.setText(R.id.patient_name, mRootView, stringbuilder.toString());
                        mCommunication = ((ProfileData)pharmacyresponse.data).communication;
                        mPreferredPhoneType = mCommunication.determinePreferredPhoneType();
                        pharmacyresponse = mCommunication.getPhoneNumber(mPreferredPhoneType);
                        updatePhoneNumber(pharmacyresponse);
                    } else
                    {
                        ViewUtil.findViewById(mRootView, R.id.patient_info).setVisibility(8);
                    }
                    updateLoadstatus(8);
                }

                public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
                {
                    handleServerResponse(pharmacyresponse);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
                }

                public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
                {
                    handleServerResponse(pharmacyresponse);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((PharmacyResponse)obj);
                }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super(handler);
            }
            });
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, R.id.patient_info).setVisibility(8);
            updateLoadstatus(8);
            return;
        }
    }

    private void getPickupTimes()
    {
        if (isAllLoaded())
        {
            showDialog(4);
        }
        PharmacyManager.get().getPickupTimes(mStoreNumber, new AsyncCallbackOnThread(new Handler()) {

            final ReviewOrderPresenter this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                if (isAllLoaded())
                {
                    dismissDialog(4);
                }
                if (isPopped())
                {
                    return;
                }
                if (pharmacyresponse != null && pharmacyresponse.data != null && pharmacyresponse.status == 1)
                {
                    pharmacyresponse = (PickupTime)pharmacyresponse.data;
                    if (((PickupTime) (pharmacyresponse)).day != null && ((PickupTime) (pharmacyresponse)).day.length > 0)
                    {
                        mPreviousPickupDatesAndTimes = mPickupDatesAndTimes;
                        mPickupDatesAndTimes = ((PickupTime) (pharmacyresponse)).day;
                        mPreviousSelectedSpinnerPosition = mSelectedSpinnerPosition;
                        mSelectedSpinnerPosition = 0;
                        mSpinner.setSelection(mSelectedSpinnerPosition);
                        mSpinnerAdapter.setItems(((PickupTime) (pharmacyresponse)).day);
                        pharmacyresponse = null;
                        if (mSpinnerAdapter.getCount() > 0)
                        {
                            pharmacyresponse = (PickupTimesSpinnerAdapter.PickupItem)mSpinnerAdapter.getItem(0);
                        }
                        if (pharmacyresponse != null)
                        {
                            setPickupDetails(pharmacyresponse.getDate(), pharmacyresponse.getTime());
                            ViewUtil.findViewById(mRootView, R.id.pickup_date_group).setVisibility(0);
                            updateLoadstatus(4);
                            return;
                        } else
                        {
                            showDialog(0);
                            return;
                        }
                    } else
                    {
                        showDialog(0);
                        return;
                    }
                } else
                {
                    showDialog(0);
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super(handler);
            }
        });
    }

    private void getStoreInfo()
    {
        com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

            final ReviewOrderPresenter this$0;

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
                    mStoreInfo = new PlaceHolderStoreData(mActivity, mStoreNumber);
                }
                mStoreAddressGroup.setStore(mStoreInfo);
                updateEditStoreButton();
                ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button).setVisibility(8);
                ViewUtil.findViewById(mRootView, R.id.store_info).setVisibility(0);
                updateLoadstatus(1);
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
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        };
        StoreService.getStoreService().getStore(mStoreNumber, getstorescallback);
    }

    private boolean isCustomer()
    {
        if (mCart != null && mCart.customer != null)
        {
            com.walmartlabs.android.pharmacy.service.Cart.Customer customer = mCart.customer;
            if (customer.refills != null && customer.refills.length > 0)
            {
                return true;
            }
        }
        return false;
    }

    private void loadOrder()
    {
        if (mPrescription != null)
        {
            populateWithPrescription();
            return;
        } else
        {
            getCart();
            return;
        }
    }

    private Dialog onCreatePhoneEditorDialog()
    {
        final AlertDialog dialog = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
        ViewGroup viewgroup = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_phone_editor);
        final Spinner typeChooser = (Spinner)ViewUtil.findViewById(viewgroup, R.id.phone_type);
        final EditText editor = (EditText)ViewUtil.findViewById(viewgroup, R.id.phone_edittext);
        dialog.setTitle(R.string.pharmacy_phonenumber_editor_dialog_title);
        dialog.setView(viewgroup);
        dialog.setNegativeButton(R.string.cancel_button, null);
        dialog.setPositiveButton(R.string.pharmacy_phonenumber_editor_save_button, new android.content.DialogInterface.OnClickListener() {

            final ReviewOrderPresenter this$0;
            final EditText val$editor;
            final Spinner val$typeChooser;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                updatePatientPhoneNumber(typeChooser.getSelectedItemPosition(), PharmacyUtils.extractRawUSPhoneNumber(editor.getText().toString()));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                typeChooser = spinner;
                editor = edittext;
                super();
            }
        });
        dialog = dialog.create();
        typeChooser.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ReviewOrderPresenter this$0;
            final EditText val$editor;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = mCommunication.getPhoneNumber(i);
                if (TextUtils.isEmpty(adapterview))
                {
                    editor.setText("");
                    return;
                } else
                {
                    editor.setText(PharmacyUtils.formatUSPhoneNumber(adapterview));
                    editor.setSelection(editor.getText().length());
                    return;
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                editor = edittext;
                super();
            }
        });
        editor.addTextChangedListener(new TextWatcher() {

            final ReviewOrderPresenter this$0;
            final AlertDialog val$dialog;
            final EditText val$editor;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                dialog.getButton(-1).setEnabled(PharmacyUtils.isValidUSPhoneNumber(editor.getText().toString()));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                dialog = alertdialog;
                editor = edittext;
                super();
            }
        });
        dialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final ReviewOrderPresenter this$0;
            final AlertDialog val$dialog;
            final EditText val$editor;
            final Spinner val$typeChooser;

            public void onShow(DialogInterface dialoginterface)
            {
                int i;
                if (mPreferredPhoneType == -1)
                {
                    i = 0;
                } else
                {
                    i = mPreferredPhoneType;
                }
                typeChooser.setSelection(i);
                dialog.getButton(-1).setEnabled(PharmacyUtils.isValidUSPhoneNumber(editor.getText().toString()));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                typeChooser = spinner;
                dialog = alertdialog;
                editor = edittext;
                super();
            }
        });
        return dialog;
    }

    private void pickStore()
    {
        StoreFinderController storefindercontroller = new StoreFinderController(mActivity, getPresenterStack(), PharmacyManager.get().getStoreFinderConfigurator());
        storefindercontroller.initFilteredPickerMode(new String[] {
            "Pharmacy"
        });
        storefindercontroller.setStorePickerTitle(mActivity.getString(R.string.store_finder_picker_title));
        storefindercontroller.setStorePickerListener(new StorePickerListener() {

            final ReviewOrderPresenter this$0;

            public void onCancelled()
            {
            }

            public void onStoreClicked(StoreData storedata)
            {
                com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("changeStore")).putString("oldStoreId", Integer.toString(mStoreNumber)).putString("changeStoreLocation", "refill");
                try
                {
                    int i = Integer.parseInt(storedata.getId());
                    mPreviousStoreNumber = mStoreNumber;
                    mStoreNumber = i;
                    builder.putString("newStoreId", storedata.getId());
                }
                catch (NumberFormatException numberformatexception)
                {
                    Log.w(ReviewOrderPresenter.TAG, "Could not get store number from id");
                    builder.putString("newStoreId", "none");
                }
                getPickupTimes();
                mPreviousStoreInfo = mStoreInfo;
                mStoreInfo = storedata;
                mStoreAddressGroup.setStore(mStoreInfo);
                getPresenterStack().popPresenter();
                ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button).setVisibility(8);
                ViewUtil.findViewById(mRootView, R.id.store_info).setVisibility(0);
                updateEditStoreButton();
                MessageBus.getBus().post(builder);
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        storefindercontroller.show(false);
        storefindercontroller.initLocation();
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:PickupLocation"));
    }

    private void placeOrder()
    {
        showDialog(2);
        CartCheckoutData cartcheckoutdata = null;
        if (!TextUtils.isEmpty(mPhoneNumber))
        {
            cartcheckoutdata = new CartCheckoutData(mPhoneNumber);
        }
        PharmacyManager.get().submitCart(cartcheckoutdata, new AsyncCallbackOnThread(new Handler()) {

            final ReviewOrderPresenter this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(2);
                if (!isPopped()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                boolean flag;
                flag = false;
                if (pharmacyresponse == null)
                {
                    break MISSING_BLOCK_LABEL_209;
                }
                pharmacyresponse.status;
                JVM INSTR lookupswitch 2: default 56
            //                           1: 71
            //                           1066: 159;
                   goto _L3 _L4 _L5
_L4:
                break; /* Loop/switch isn't completed */
_L3:
                flag = true;
_L7:
                if (flag)
                {
                    showDialog(3);
                    return;
                }
                if (true) goto _L1; else goto _L6
_L6:
                if (pharmacyresponse.data != null)
                {
                    PharmacyManager.get().getSession().addPlacedOrder(mRefill.rxNumber, mRefill.storeNumber);
                    pharmacyresponse = new OrderConfirmationRefillPresenter(mActivity, mCart, mStoreInfo, mListener);
                    pushAndReplacePresenter(pharmacyresponse);
                } else
                {
                    flag = true;
                }
                  goto _L7
_L5:
                if (pharmacyresponse.data != null && ((Cart)pharmacyresponse.data).day != null)
                {
                    mNextValidPickupTime = ((Cart)pharmacyresponse.data).day;
                }
                showDialog(9);
                  goto _L7
                flag = true;
                  goto _L7
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super(handler);
            }
        });
    }

    private void populateFromRefill()
    {
        java.util.Date date;
        Object obj1;
        java.util.Date date1;
        Object obj3;
        date1 = null;
        date = null;
        obj3 = null;
        obj1 = date1;
        if (mRefill.lastRefillDate == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj1 = date1;
        date = sRefillFormat.parse(mRefill.lastRefillDate);
        Object obj2;
        date1 = obj3;
        obj2 = date;
        obj1 = date;
        if (mRefill.rxExpDate == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj1 = date;
        date1 = sRefillFormat.parse(mRefill.rxExpDate);
        obj2 = date;
_L1:
        Object obj;
        int i;
        if (obj2 != null)
        {
            ViewUtil.setText(R.id.last_refilled, mRootView, sFormattedDate.format(((java.util.Date) (obj2))));
            ViewUtil.findViewById(mRootView, R.id.last_refilled).setVisibility(0);
            ViewUtil.findViewById(mRootView, R.id.last_refilled_title).setVisibility(0);
        } else
        {
            ViewUtil.findViewById(mRootView, R.id.last_refilled).setVisibility(8);
            ViewUtil.findViewById(mRootView, R.id.last_refilled_title).setVisibility(8);
        }
        ViewUtil.findViewById(mRootView, R.id.refill_auto_refill).setVisibility(4);
        i = R.id.drug;
        obj1 = mRootView;
        if (!TextUtils.isEmpty(mRefill.dispensedDrugName))
        {
            obj = mRefill.dispensedDrugName;
        } else
        {
            obj = mRefill.prescribedDrugName;
        }
        ViewUtil.setText(i, ((View) (obj1)), WordUtils.capitalizeFully(((String) (obj))));
        ViewUtil.setText(R.id.rxnbr, mRootView, mActivity.getString(R.string.pharmacy_rx_number, new Object[] {
            Integer.valueOf(mRefill.rxNumber)
        }));
        ViewUtil.findViewById(mRootView, R.id.refill_prescriber_title).setVisibility(8);
        ViewUtil.findViewById(mRootView, R.id.refill_prescriber).setVisibility(8);
        if (date1 != null)
        {
            obj = (TextView)ViewUtil.findViewById(mRootView, R.id.refill_expiration_date);
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(mActivity.getString(R.string.pharmacy_refills_expires_title, new Object[] {
                sFormattedDate.format(date1)
            }));
        } else
        {
            ViewUtil.findViewById(mRootView, R.id.refill_expiration_date).setVisibility(8);
        }
        ViewUtil.setText(R.id.nbr_of_refills_text, mRootView, Integer.toString(mRefill.numOfRemainingReFills));
        obj = mActivity.getResources();
        ViewUtil.setText(R.id.nbr_of_refills_title, mRootView, ((Resources) (obj)).getQuantityString(R.plurals.pharmacy_my_prescription_refills_remaining, mRefill.numOfRemainingReFills));
        if (mRefill.numOfRemainingReFills == 0)
        {
            showInfoText(R.string.pharmacy_no_refills_left_info_text);
        }
        if (mRefill.wasLastRefilledByHomeDelivery())
        {
            mHomeDeliveryStoreNumber = mRefill.storeNumber;
            showInfoText(R.string.pharmacy_home_delivery_info_text);
        }
        getPatientInfo();
        loadStoreData();
        return;
        obj;
        ((ParseException) (obj)).printStackTrace();
        date1 = obj3;
        obj2 = obj1;
          goto _L1
    }

    private void populateWithPrescription()
    {
        Object obj;
        Object obj2;
        updateLoadstatus(2);
        obj = null;
        obj2 = null;
        Object obj1 = sRefillFormat.parse(mPrescription.lastRefillDate);
        obj = obj1;
        java.util.Date date = sRefillFormat.parse(mPrescription.rxExpDate);
        obj = date;
        obj2 = obj1;
        obj1 = obj;
_L1:
        if (obj2 != null)
        {
            ViewUtil.setText(R.id.last_refilled, mRootView, sFormattedDate.format(((java.util.Date) (obj2))));
            ViewUtil.findViewById(mRootView, R.id.last_refilled).setVisibility(0);
            ViewUtil.findViewById(mRootView, R.id.last_refilled_title).setVisibility(0);
        } else
        {
            ViewUtil.findViewById(mRootView, R.id.last_refilled).setVisibility(8);
            ViewUtil.findViewById(mRootView, R.id.last_refilled_title).setVisibility(8);
        }
        obj = (TextView)ViewUtil.findViewById(mRootView, R.id.refill_auto_refill);
        if (mPrescription.rxAutoRefillable)
        {
            ((TextView) (obj)).setVisibility(0);
            ParseException parseexception;
            int i;
            if (mPrescription.rxAutoRefillOn)
            {
                ((TextView) (obj)).setText(mActivity.getString(R.string.pharmacy_refills_on_auto_refill));
            } else
            {
                ((TextView) (obj)).setVisibility(4);
            }
        } else
        {
            ((TextView) (obj)).setVisibility(4);
        }
        i = R.id.drug;
        obj2 = mRootView;
        if (!TextUtils.isEmpty(mPrescription.dispensedDrugName))
        {
            obj = mPrescription.dispensedDrugName;
        } else
        {
            obj = mPrescription.prescribedDrugName;
        }
        ViewUtil.setText(i, ((View) (obj2)), WordUtils.capitalizeFully(((String) (obj))));
        ViewUtil.setText(R.id.rxnbr, mRootView, mActivity.getString(R.string.pharmacy_rx_number, new Object[] {
            Integer.valueOf(mPrescription.rxNumber)
        }));
        ViewUtil.setText(R.id.refill_prescriber, mRootView, WordUtils.capitalizeFully(mPrescription.prescriber));
        ViewUtil.setText(R.id.refill_expiration_date, mRootView, mActivity.getString(R.string.pharmacy_refills_expires_title, new Object[] {
            sFormattedDate.format(((java.util.Date) (obj1)))
        }));
        ViewUtil.setText(R.id.nbr_of_refills_text, mRootView, Integer.toString(mPrescription.numOfRemainingReFills));
        obj = mActivity.getResources();
        ViewUtil.setText(R.id.nbr_of_refills_title, mRootView, ((Resources) (obj)).getQuantityString(R.plurals.pharmacy_my_prescription_refills_remaining, mPrescription.numOfRemainingReFills));
        if (mPrescription.numOfRemainingReFills == 0)
        {
            showInfoText(R.string.pharmacy_no_refills_left_info_text);
        }
        if (mPrescription.wasLastRefilledByHomeDelivery())
        {
            mHomeDeliveryStoreNumber = mPrescription.storeNumber;
            showInfoText(R.string.pharmacy_home_delivery_info_text);
        }
        getPatientInfo();
        loadStoreData();
        return;
        parseexception;
        parseexception.printStackTrace();
        parseexception = ((ParseException) (obj2));
        obj2 = obj;
          goto _L1
    }

    private void setPickupDetails(String s, String s1)
    {
        showDialog(1);
        PharmacyManager.get().setPickupDetails(mStoreNumber, s, s1, new AsyncCallbackOnThread(new Handler()) {

            final ReviewOrderPresenter this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(1);
                if (!isPopped())
                {
                    if (pharmacyresponse != null && pharmacyresponse.data != null)
                    {
                        switch (pharmacyresponse.status)
                        {
                        default:
                            showDialog(0);
                            return;

                        case 1: // '\001'
                            mCart = (Cart)pharmacyresponse.data;
                            break;
                        }
                        pharmacyresponse = mCart.getRefill();
                        if (pharmacyresponse != null && pharmacyresponse.hasFillStatus())
                        {
                            if (pharmacyresponse.getFirstFillStatus() == 1069)
                            {
                                showDialog(8);
                                restorePreviousPickupDetails();
                                return;
                            } else
                            {
                                showDialog(0);
                                return;
                            }
                        }
                    } else
                    {
                        showDialog(0);
                        return;
                    }
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super(handler);
            }
        });
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.drug);
        TestFairyUtils.hideView(R.id.rxnbr);
        TestFairyUtils.hideView(R.id.patient_name);
        TestFairyUtils.hideView(R.id.patient_phone);
        TestFairyUtils.hideView(R.id.phone_edittext);
    }

    private void showInfoText(int i)
    {
        if (mRootView != null)
        {
            ViewUtil.setText(R.id.refill_infotext, mRootView, i);
            ViewUtil.findViewById(mRootView, R.id.refill_infotext_container).setVisibility(0);
            if (i == R.string.pharmacy_no_refills_left_info_text)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "errMsgNoRefillLeft"));
            } else
            if (i == R.string.pharmacy_home_delivery_info_text)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "errMsgLastRefilledAtHome"));
                return;
            }
        }
    }

    private void updateEditStoreButton()
    {
        boolean flag = false;
        ImageView imageview;
        boolean flag1;
        if (mPrescription != null)
        {
            if (mPrescription.numOfRemainingReFills == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (mRefill != null)
        {
            if (mRefill.numOfRemainingReFills == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (mRefill != null && mRefill.notTransferable)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        imageview = (ImageView)ViewUtil.findViewById(mRootView, R.id.pharmacy_edit_store_button);
        imageview.setVisibility(0);
        if (flag || flag1)
        {
            imageview.setImageResource(R.drawable.icn_infoalert_yellow);
            imageview.setOnClickListener(new android.view.View.OnClickListener() {

                final ReviewOrderPresenter this$0;

                public void onClick(View view)
                {
                    showDialog(7);
                }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
            });
            return;
        } else
        {
            imageview.setOnClickListener(new android.view.View.OnClickListener() {

                final ReviewOrderPresenter this$0;

                public void onClick(View view)
                {
                    pickStore();
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:OrderChangeStore"));
                }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
            });
            return;
        }
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

    private void updateLoadstatus(int i)
    {
        mLoadStatus = mLoadStatus | i;
        updateLoadingVisibility(isAllLoaded());
    }

    private void wireListeners()
    {
        mSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ReviewOrderPresenter this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (mSelectedSpinnerPosition != i)
                {
                    mPreviousSelectedSpinnerPosition = mSelectedSpinnerPosition;
                    mSelectedSpinnerPosition = i;
                    adapterview = (PickupTimesSpinnerAdapter.PickupItem)adapterview.getSelectedItem();
                    setPickupDetails(adapterview.getDate(), adapterview.getTime());
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:OrderChangeTime"));
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:OrderChangeTime"));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        ((Button)ViewUtil.findViewById(mRootView, R.id.cancelButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final ReviewOrderPresenter this$0;

            public void onClick(View view)
            {
                cancelOrder();
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        ((Button)ViewUtil.findViewById(mRootView, R.id.continueButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final ReviewOrderPresenter this$0;

            public void onClick(View view)
            {
                if (mStoreNumber == mHomeDeliveryStoreNumber)
                {
                    view = (TextView)ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button);
                    view.setTextColor(mActivity.getResources().getColor(R.color.pharmacy_error));
                    ScrollView scrollview = (ScrollView)ViewUtil.findViewById(mRootView, R.id.scrollview);
                    PharmacyUtils.scrollAndFocus(mActivity, scrollview, view);
                    return;
                } else
                {
                    placeOrder();
                    return;
                }
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        ViewUtil.findViewById(mRootView, R.id.edit_patient_button).setOnClickListener(new android.view.View.OnClickListener() {

            final ReviewOrderPresenter this$0;

            public void onClick(View view)
            {
                showDialog(5);
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:changePhoneNumberOrderPage"));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button).setOnClickListener(new android.view.View.OnClickListener() {

            final ReviewOrderPresenter this$0;

            public void onClick(View view)
            {
                pickStore();
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
    }

    public String getScreenName()
    {
        return "Rx:ReviewOrder";
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean interceptBack()
    {
        cancelOrder();
        return true;
    }

    public boolean isAllLoaded()
    {
        return mLoadStatus == 15;
    }

    public void loadStoreData()
    {
        if (mStoreNumber != mHomeDeliveryStoreNumber)
        {
            getStoreInfo();
            getPickupTimes();
            return;
        } else
        {
            updateLoadstatus(1);
            updateLoadstatus(4);
            return;
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = null;
        i;
        JVM INSTR tableswitch 0 9: default 56
    //                   0 75
    //                   1 98
    //                   2 133
    //                   3 168
    //                   4 261
    //                   5 296
    //                   6 304
    //                   7 339
    //                   8 374
    //                   9 214;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        Dialog dialog = ((Dialog) (obj));
        if (obj == null)
        {
            dialog = DialogFactory.onCreateDialog(0x10004, mActivity);
        }
        return dialog;
_L2:
        obj = DialogFactory.onCreateDialog(0x10004, mActivity, null, new android.content.DialogInterface.OnDismissListener() {

            final ReviewOrderPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                cancelOrder();
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L3:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(R.string.pharmacy_pickup_time_dialog));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(true);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(R.string.pharmacy_placing_order));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(false);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_placing_order_error_dialog).setCancelable(true).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final ReviewOrderPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "errMsgOrderTimeout"));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        }).setPositiveButton(R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L11:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_placing_order_invalid_time_dialog).setCancelable(false).setPositiveButton(R.string.ok, null).create();
        ((Dialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final ReviewOrderPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (mNextValidPickupTime != null && mNextValidPickupTime.length > 0)
                {
                    mPreviousPickupDatesAndTimes = mPickupDatesAndTimes;
                    mPickupDatesAndTimes = mNextValidPickupTime;
                    mPreviousSelectedSpinnerPosition = mSelectedSpinnerPosition;
                    mSelectedSpinnerPosition = 0;
                    mSpinner.setSelection(mSelectedSpinnerPosition);
                    mSpinnerAdapter.setItems(mNextValidPickupTime);
                    dialoginterface = (PickupTimesSpinnerAdapter.PickupItem)mSpinnerAdapter.getItem(0);
                    if (dialoginterface != null)
                    {
                        setPickupDetails(dialoginterface.getDate(), dialoginterface.getTime());
                    }
                }
                mNextValidPickupTime = null;
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L6:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(R.string.pharmacy_loading_dialog));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(true);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = onCreatePhoneEditorDialog();
        continue; /* Loop/switch isn't completed */
_L8:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_phonenumber_error_dialog).setCancelable(true).setPositiveButton(R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L9:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_non_transferable_rx_dialog_text).setCancelable(true).setPositiveButton(R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L10:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_cannot_transfer_selected_pharmacy_dialog).setCancelable(true).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final ReviewOrderPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("pageView", "errMsgCannotRefillAtPharm"));
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                super();
            }
        }).setPositiveButton(R.string.ok, null).create();
        if (true) goto _L1; else goto _L12
_L12:
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_review_order, viewgroup, false);
            mStoreAddressGroup = (StoreAddressView)ViewUtil.findViewById(mRootView, R.id.pharmacy_store_details);
            mStoreAddressGroup.setOnShowStoreDetailsListener(this);
            mSpinner = (Spinner)ViewUtil.findViewById(mRootView, R.id.spinner);
            mSpinner.setAdapter(mSpinnerAdapter);
            wireListeners();
            setupTestFairy();
        }
    }

    public void onPushed()
    {
        super.onPushed();
        loadOrder();
    }

    public void onShowStoreDetails(StoreData storedata)
    {
        pushPresenter(PharmacyManager.get().getStoreDetailPresenter(mActivity, storedata));
    }

    public void restorePreviousPickupDetails()
    {
        mSelectedSpinnerPosition = mPreviousSelectedSpinnerPosition;
        mStoreNumber = mPreviousStoreNumber;
        mStoreInfo = mPreviousStoreInfo;
        mPickupDatesAndTimes = mPreviousPickupDatesAndTimes;
        if (mStoreNumber == mHomeDeliveryStoreNumber)
        {
            ViewUtil.findViewById(mRootView, R.id.store_info).setVisibility(8);
            ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button).setVisibility(0);
            ViewUtil.findViewById(mRootView, R.id.pickup_date_group).setVisibility(8);
            return;
        } else
        {
            mStoreAddressGroup.setStore(mStoreInfo);
            mSpinnerAdapter.setItems(mPickupDatesAndTimes);
            mSpinner.setSelection(mSelectedSpinnerPosition);
            return;
        }
    }

    public void savePatientPhoneNumber(int i, String s)
    {
        com.walmartlabs.android.pharmacy.data.ProfileData.Communication communication = mCommunication.copy();
        communication.setPhoneNumber(i, s);
        showDialog(4);
        PharmacyManager.get().updateAccountProfile(communication, new AsyncCallbackOnThread(s) {

            final ReviewOrderPresenter this$0;
            final String val$phoneNumber;
            final int val$preferredType;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(4);
                if (pharmacyresponse != null && pharmacyresponse.status == 1)
                {
                    mCommunication.setPhoneNumber(preferredType, phoneNumber);
                    mPreferredPhoneType = preferredType;
                    updatePhoneNumber(phoneNumber);
                    return;
                } else
                {
                    showDialog(6);
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = ReviewOrderPresenter.this;
                preferredType = i;
                phoneNumber = s;
                super(final_handler);
            }
        });
    }

    public void updatePatientPhoneNumber(int i, String s)
    {
        if (s.equals(mCommunication.getPhoneNumber(i)))
        {
            if (i != mPreferredPhoneType)
            {
                mPreferredPhoneType = i;
                updatePhoneNumber(s);
            }
            return;
        } else
        {
            savePatientPhoneNumber(i, s);
            return;
        }
    }

    public void updatePhoneNumber(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            mPhoneNumber = PharmacyUtils.extractRawUSPhoneNumber(s);
            s = String.format(Locale.US, mActivity.getString(R.string.pharmacy_phonenumber_tel), new Object[] {
                PharmacyUtils.formatUSPhoneNumber(s)
            });
        } else
        {
            s = mActivity.getString(R.string.pharmacy_patient_no_phone_number);
        }
        ViewUtil.setText(R.id.patient_phone, mRootView, s);
    }

    static 
    {
        sRefillFormat = new SimpleDateFormat("MMddyyyy", Locale.US);
        sFormattedDate = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
    }



/*
    static int access$002(ReviewOrderPresenter revieworderpresenter, int i)
    {
        revieworderpresenter.mSelectedSpinnerPosition = i;
        return i;
    }

*/



/*
    static int access$102(ReviewOrderPresenter revieworderpresenter, int i)
    {
        revieworderpresenter.mPreviousSelectedSpinnerPosition = i;
        return i;
    }

*/




/*
    static com.walmartlabs.android.pharmacy.service.Cart.Refill access$1202(ReviewOrderPresenter revieworderpresenter, com.walmartlabs.android.pharmacy.service.Cart.Refill refill)
    {
        revieworderpresenter.mRefill = refill;
        return refill;
    }

*/



/*
    static Cart access$1302(ReviewOrderPresenter revieworderpresenter, Cart cart)
    {
        revieworderpresenter.mCart = cart;
        return cart;
    }

*/



/*
    static StoreData access$1402(ReviewOrderPresenter revieworderpresenter, StoreData storedata)
    {
        revieworderpresenter.mStoreInfo = storedata;
        return storedata;
    }

*/





/*
    static com.walmartlabs.android.pharmacy.service.PickupTime.Day[] access$1702(ReviewOrderPresenter revieworderpresenter, com.walmartlabs.android.pharmacy.service.PickupTime.Day aday[])
    {
        revieworderpresenter.mNextValidPickupTime = aday;
        return aday;
    }

*/














/*
    static com.walmartlabs.android.pharmacy.service.PickupTime.Day[] access$2902(ReviewOrderPresenter revieworderpresenter, com.walmartlabs.android.pharmacy.service.PickupTime.Day aday[])
    {
        revieworderpresenter.mPreviousPickupDatesAndTimes = aday;
        return aday;
    }

*/




/*
    static com.walmartlabs.android.pharmacy.service.PickupTime.Day[] access$3002(ReviewOrderPresenter revieworderpresenter, com.walmartlabs.android.pharmacy.service.PickupTime.Day aday[])
    {
        revieworderpresenter.mPickupDatesAndTimes = aday;
        return aday;
    }

*/













/*
    static int access$402(ReviewOrderPresenter revieworderpresenter, int i)
    {
        revieworderpresenter.mStoreNumber = i;
        return i;
    }

*/



/*
    static com.walmartlabs.android.pharmacy.data.ProfileData.Communication access$4102(ReviewOrderPresenter revieworderpresenter, com.walmartlabs.android.pharmacy.data.ProfileData.Communication communication)
    {
        revieworderpresenter.mCommunication = communication;
        return communication;
    }

*/



/*
    static int access$4202(ReviewOrderPresenter revieworderpresenter, int i)
    {
        revieworderpresenter.mPreferredPhoneType = i;
        return i;
    }

*/





/*
    static int access$4602(ReviewOrderPresenter revieworderpresenter, int i)
    {
        revieworderpresenter.mPreviousStoreNumber = i;
        return i;
    }

*/



/*
    static StoreData access$4802(ReviewOrderPresenter revieworderpresenter, StoreData storedata)
    {
        revieworderpresenter.mPreviousStoreInfo = storedata;
        return storedata;
    }

*/







}
