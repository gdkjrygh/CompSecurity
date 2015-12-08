// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Handler;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsPageView;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import com.walmartlabs.android.pharmacy.service.PickupTime;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.ui.FloatLabel;
import java.text.SimpleDateFormat;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyUtils, PharmacyManager, PharmacyResponse, OrderConfirmationTransferPresenter

public class TransferRxPrescriptionInfoPresenter extends Presenter
{
    private static class CompetitorRxAllowedCharsFilter
        implements InputFilter
    {

        private boolean isAsciiDigit(char c)
        {
            return c >= '0' && c <= '9';
        }

        private boolean isAsciiLetter(char c)
        {
            return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
        }

        private boolean isRxAllowedChar(char c)
        {
            return isAsciiLetter(c) || isAsciiDigit(c) || c == '-' || c == '.' || c == ':';
        }

        public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
        {
            for (k = i; k < j; k++)
            {
                if (!isRxAllowedChar(charsequence.charAt(k)))
                {
                    spanned = new StringBuilder(j - i);
                    for (; i < j; i++)
                    {
                        char c = charsequence.charAt(i);
                        if (isRxAllowedChar(c))
                        {
                            spanned.append(c);
                        }
                    }

                    return spanned.toString();
                }
            }

            return null;
        }

        private CompetitorRxAllowedCharsFilter()
        {
        }

    }


    private static final int DIALOG_CANNOT_TRANSFER_TO_PHARMACY = 3;
    private static final int DIALOG_ERROR = 2;
    private static final int DIALOG_PROGRESS = 1;
    private Activity mActivity;
    private EditText mDoctorFirstName;
    private FloatLabel mDoctorFirstNameLabel;
    private EditText mDoctorLastName;
    private FloatLabel mDoctorLastNameLabel;
    private EditText mDoctorPhoneNumber;
    private FloatLabel mDoctorPhoneNumberLabel;
    private final int mDropDownPadding;
    private EditText mDrugName;
    private FloatLabel mDrugNameLabel;
    private final String mOtherString;
    private FloatLabel mPharmacyNameLabel;
    private EditText mPharmacyPhone;
    private FloatLabel mPharmacyPhoneLabel;
    private Spinner mPharmacySpinner;
    private EditText mPharmacyText;
    private Button mPlaceOrderButton;
    private View mRootView;
    private EditText mRxNumber;
    private FloatLabel mRxNumberLabel;
    private TransferRxData mTransferRxData;

    public TransferRxPrescriptionInfoPresenter(Activity activity)
    {
        mActivity = activity;
        mOtherString = mActivity.getString(R.string.pharmacy_transfer_rx_pharmacies_other);
        mDropDownPadding = mActivity.getResources().getDimensionPixelSize(R.dimen.textfield_padding_left);
    }

    private boolean areFieldsValid()
    {
        clearErrors();
        boolean flag1 = true;
        if (mPharmacySpinner.getSelectedItemPosition() == -1)
        {
            mPharmacyNameLabel.setError(R.string.pharmacy_transfer_rx_missing_pharmacy);
            mPharmacySpinner.setBackgroundResource(R.drawable.spinner_background_holo_light_error);
            PharmacyUtils.restoreLeftPaddingDropDown(mPharmacySpinner, mDropDownPadding);
            scrollAndFocus(mPharmacySpinner);
            flag1 = false;
        }
        boolean flag = flag1;
        if (mPharmacyText.isShown())
        {
            flag = flag1;
            if (TextUtils.isEmpty(mPharmacyText.getText()))
            {
                mPharmacyNameLabel.setError(R.string.pharmacy_transfer_rx_missing_pharmacy);
                highlightError(mPharmacyText);
                flag = flag1;
                if (flag1)
                {
                    scrollAndFocus(mPharmacyText);
                    flag = false;
                }
            }
        }
        flag1 = flag;
        if (!PharmacyUtils.isValidUSPhoneNumber(mPharmacyPhone.getText().toString()))
        {
            mPharmacyPhoneLabel.setError(R.string.pharmacy_transfer_rx_invalid_pharmacy_phone);
            highlightError(mPharmacyPhone);
            flag1 = flag;
            if (flag)
            {
                scrollAndFocus(mPharmacyPhone);
                flag1 = false;
            }
        }
        flag = flag1;
        if (!isValidCompetitorRxNumber(mRxNumber.getText()))
        {
            FloatLabel floatlabel = mRxNumberLabel;
            int i;
            if (TextUtils.isEmpty(mRxNumber.getText()))
            {
                i = R.string.pharmacy_transfer_rx_missing_rxnumber;
            } else
            {
                i = R.string.pharmacy_transfer_rx_invalid_rxnumber;
            }
            floatlabel.setError(i);
            highlightError(mRxNumber);
            flag = flag1;
            if (flag1)
            {
                scrollAndFocus(mRxNumber);
                flag = false;
            }
        }
        flag1 = flag;
        if (TextUtils.isEmpty(mDrugName.getText()))
        {
            mDrugNameLabel.setError(R.string.pharmacy_transfer_rx_missing_drugname);
            highlightError(mDrugName);
            flag1 = flag;
            if (flag)
            {
                scrollAndFocus(mDrugName);
                flag1 = false;
            }
        }
        flag = flag1;
        if (TextUtils.isEmpty(mDoctorFirstName.getText()))
        {
            mDoctorFirstNameLabel.setError(R.string.pharmacy_transfer_rx_missing_md_firstname);
            highlightError(mDoctorFirstName);
            flag = flag1;
            if (flag1)
            {
                scrollAndFocus(mDoctorFirstName);
                flag = false;
            }
        }
        flag1 = flag;
        if (TextUtils.isEmpty(mDoctorLastName.getText()))
        {
            mDoctorLastNameLabel.setError(R.string.pharmacy_transfer_rx_missing_md_lastname);
            highlightError(mDoctorLastName);
            flag1 = flag;
            if (flag)
            {
                scrollAndFocus(mDoctorLastName);
                flag1 = false;
            }
        }
        flag = flag1;
        if (!PharmacyUtils.isValidUSPhoneNumber(mDoctorPhoneNumber.getText().toString()))
        {
            mDoctorPhoneNumberLabel.setError(R.string.pharmacy_transfer_rx_missing_md_phone);
            highlightError(mDoctorPhoneNumber);
            flag = flag1;
            if (flag1)
            {
                scrollAndFocus(mDoctorPhoneNumber);
                flag = false;
            }
        }
        return flag;
    }

    private boolean arrayNotEmpty(Object aobj[])
    {
        return aobj != null && aobj.length > 0;
    }

    private void clearErrors()
    {
        mPharmacySpinner.setBackgroundResource(R.drawable.spinner_background_holo_light);
        PharmacyUtils.restoreLeftPaddingDropDown(mPharmacySpinner, mDropDownPadding);
        mPharmacyText.setBackgroundResource(R.drawable.edit_text_regular);
        mPharmacyPhone.setBackgroundResource(R.drawable.edit_text_regular);
        mRxNumber.setBackgroundResource(R.drawable.edit_text_regular);
        mDrugName.setBackgroundResource(R.drawable.edit_text_regular);
        mDoctorFirstName.setBackgroundResource(R.drawable.edit_text_regular);
        mDoctorLastName.setBackgroundResource(R.drawable.edit_text_regular);
        mDoctorPhoneNumber.setBackgroundResource(R.drawable.edit_text_regular);
        mPharmacyNameLabel.clearError();
        mPharmacyPhoneLabel.clearError();
        mRxNumberLabel.clearError();
        mDrugNameLabel.clearError();
        mDoctorFirstNameLabel.clearError();
        mDoctorLastNameLabel.clearError();
        mDoctorPhoneNumberLabel.clearError();
    }

    private void getInputData()
    {
        int i = mPharmacySpinner.getSelectedItemPosition();
        if (i != -1)
        {
            String s = (String)mPharmacySpinner.getAdapter().getItem(i);
            if (s.equals(mOtherString))
            {
                mTransferRxData.rxInfo[0].pharmacyName = mPharmacyText.getText().toString().trim();
            } else
            {
                mTransferRxData.rxInfo[0].pharmacyName = s;
            }
        }
        mTransferRxData.rxInfo[0].pharmacyPhone = PharmacyUtils.extractRawUSPhoneNumber(mPharmacyPhone.getText().toString());
        mTransferRxData.rxInfo[0].rxNumber = mRxNumber.getText().toString().trim();
        mTransferRxData.rxInfo[0].drugName = mDrugName.getText().toString().trim();
        mTransferRxData.rxInfo[0].prescriberFirstName = mDoctorFirstName.getText().toString().trim();
        mTransferRxData.rxInfo[0].prescriberLastName = mDoctorLastName.getText().toString().trim();
        mTransferRxData.rxInfo[0].prescriberPhone = PharmacyUtils.extractRawUSPhoneNumber(mDoctorPhoneNumber.getText().toString());
    }

    private void handlePrePopulate()
    {
        if (mTransferRxData == null) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(mTransferRxData.rxInfo[0].pharmacyName)) goto _L4; else goto _L3
_L3:
        SpinnerAdapter spinneradapter;
        int i;
        boolean flag1;
        int j;
        flag1 = false;
        spinneradapter = mPharmacySpinner.getAdapter();
        j = spinneradapter.getCount();
        i = 0;
_L10:
        boolean flag = flag1;
        if (i >= j) goto _L6; else goto _L5
_L5:
        if (!((String)spinneradapter.getItem(i)).equals(mTransferRxData.rxInfo[0].pharmacyName)) goto _L8; else goto _L7
_L7:
        flag = true;
        mPharmacySpinner.setSelection(i);
_L6:
        if (!flag)
        {
            mPharmacySpinner.setSelection(j - 1);
            mPharmacyText.setVisibility(0);
            mPharmacyText.setText(mTransferRxData.rxInfo[0].pharmacyName);
        }
_L4:
        mPharmacyPhone.setText(mTransferRxData.rxInfo[0].pharmacyPhone);
        mRxNumber.setText(mTransferRxData.rxInfo[0].rxNumber);
        mDrugName.setText(mTransferRxData.rxInfo[0].drugName);
        mDoctorFirstName.setText(mTransferRxData.rxInfo[0].prescriberFirstName);
        mDoctorLastName.setText(mTransferRxData.rxInfo[0].prescriberLastName);
        mDoctorPhoneNumber.setText(mTransferRxData.rxInfo[0].prescriberPhone);
_L2:
        return;
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void highlightError(EditText edittext)
    {
        edittext.setBackgroundResource(R.drawable.edit_text_error);
    }

    private boolean isValidCompetitorRxNumber(CharSequence charsequence)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        flag = flag1;
        if (i >= charsequence.length()) goto _L2; else goto _L3
_L3:
        if (!Character.isDigit(charsequence.charAt(i))) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void scrollAndFocus(View view)
    {
        PharmacyUtils.scrollAndFocus(mActivity, mRootView, view);
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_rx_number);
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_drug_name);
    }

    private void trackPageView()
    {
        MessageBus.getBus().post(new AnalyticsPageView("/pharmacy/rx_info"));
    }

    private void wireListeners()
    {
        mPharmacySpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final TransferRxPrescriptionInfoPresenter this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                boolean flag = ((String)adapterview.getAdapter().getItem(i)).equals(mOtherString);
                adapterview = mPharmacyText;
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                adapterview.setVisibility(i);
                if (flag)
                {
                    mPharmacyText.requestFocus();
                }
                mPharmacyNameLabel.show();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = TransferRxPrescriptionInfoPresenter.this;
                super();
            }
        });
        mPlaceOrderButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TransferRxPrescriptionInfoPresenter this$0;

            public void onClick(View view)
            {
                if (areFieldsValid())
                {
                    getInputData();
                    view = new AsyncCallbackOnThread(new Handler()) {

                        final _cls2 this$1;

                        private void handleServerResponse(PharmacyResponse pharmacyresponse)
                        {
                            dismissDialog(1);
                            if (pharmacyresponse != null)
                            {
                                switch (pharmacyresponse.status)
                                {
                                default:
                                    showDialog(2);
                                    return;

                                case 1: // '\001'
                                    pharmacyresponse = new OrderConfirmationTransferPresenter(mActivity, mTransferRxData);
                                    getPresenterStack().popToRoot();
                                    pushPresenter(pharmacyresponse);
                                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyTransferOrderConfirmation"));
                                    return;

                                case 1008: 
                                    pop();
                                    break;
                                }
                                showDialog(3);
                                return;
                            } else
                            {
                                showDialog(2);
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
                this$1 = _cls2.this;
                super(handler);
            }
                    };
                    view = (new Handler()). new AsyncCallbackOnThread(view) {

                        final _cls2 this$1;
                        final AsyncCallbackOnThread val$transferCallback;

                        public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
                        {
                            dismissDialog(1);
                            showDialog(2);
                        }

                        public volatile void onFailureSameThread(Object obj, Object obj1)
                        {
                            onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
                        }

                        public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
                        {
                            if (pharmacyresponse.status == 1)
                            {
                                if (pharmacyresponse.data != null && arrayNotEmpty(((PickupTime)pharmacyresponse.data).day) && arrayNotEmpty(((PickupTime)pharmacyresponse.data).day[0].timeList))
                                {
                                    long l = PharmacyUtils.pickupDateToMillisecondsSinceEpoch(((PickupTime)pharmacyresponse.data).day[0].dateFormatted, ((PickupTime)pharmacyresponse.data).day[0].timeList[0]);
                                    if (l > 0L)
                                    {
                                        mTransferRxData.pickupDate = PharmacyUtils.sPickupDateFormat.format(Long.valueOf(l));
                                        mTransferRxData.pickupTime = PharmacyUtils.sPickupTimeFormat.format(Long.valueOf(l));
                                        PharmacyManager.get().transferRxExternal(mTransferRxData, transferCallback);
                                        return;
                                    } else
                                    {
                                        dismissDialog(1);
                                        showDialog(2);
                                        return;
                                    }
                                } else
                                {
                                    dismissDialog(1);
                                    showDialog(2);
                                    return;
                                }
                            } else
                            {
                                dismissDialog(1);
                                showDialog(2);
                                return;
                            }
                        }

                        public volatile void onSuccessSameThread(Object obj)
                        {
                            onSuccessSameThread((PharmacyResponse)obj);
                        }

            
            {
                this$1 = final__pcls2;
                transferCallback = asynccallbackonthread;
                super(Handler.this);
            }
                    };
                    PharmacyManager.get().getPickupTimes(mTransferRxData.pickupStore, view);
                    showDialog(1);
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyTransferPlaceOrder")).putString("pharmTransferOriginalChain", mTransferRxData.rxInfo[0].pharmacyName));
                }
            }

            
            {
                this$0 = TransferRxPrescriptionInfoPresenter.this;
                super();
            }
        });
    }

    public String getScreenName()
    {
        return "Rx:TransferPrescription2";
    }

    public String getTitleText()
    {
        return mActivity.getString(R.string.pharmacy_transfer_rx_transfer_rx);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        getInputData();
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
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setCancelable(false);
            progressdialog.setIndeterminate(true);
            progressdialog.setMessage(mActivity.getString(R.string.pharmacy_transfer_rx_one_moment_please));
            return progressdialog;

        case 2: // '\002'
            return DialogFactory.createAlertDialog(mActivity.getString(R.string.pharmacy_system_error_message), mActivity);

        case 3: // '\003'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_cannot_transfer_selected_pharmacy_dialog).setCancelable(true).setPositiveButton(R.string.ok, null).create();
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, R.layout.pharmacy_transfer_rx_info, viewgroup);
            mPharmacySpinner = (Spinner)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_pharmacy_name_spinner);
            mPharmacySpinner.setAdapter(new com.walmartlabs.ui.NoDefaultSpinner.Adapter(mActivity, R.string.pharmacy_transfer_rx_pharmacy_name, R.array.pharmacy_transfer_rx_pharmacies));
            mPharmacyNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_pharmacy_name_label);
            mPharmacyNameLabel.attach(mPharmacySpinner);
            mPharmacyText = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_pharmacy_name_text);
            mPharmacyPhone = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_pharmacy_phone);
            mPharmacyPhoneLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_pharmacy_phone_label);
            mPharmacyPhoneLabel.attach(mPharmacyPhone);
            mRxNumber = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_rx_number);
            mRxNumberLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_rx_number_label);
            mRxNumberLabel.attach(mRxNumber);
            int i = mActivity.getResources().getInteger(R.integer.competitive_prescription_max_length);
            mRxNumber.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(i), new CompetitorRxAllowedCharsFilter()
            });
            mDrugName = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_drug_name);
            mDrugNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_drug_name_label);
            mDrugNameLabel.attach(mDrugName);
            mDoctorFirstName = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_doctor_first_name);
            mDoctorFirstNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_doctor_first_name_label);
            mDoctorFirstNameLabel.attach(mDoctorFirstName);
            mDoctorLastName = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_doctor_last_name);
            mDoctorLastNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_doctor_last_name_label);
            mDoctorLastNameLabel.attach(mDoctorLastName);
            mDoctorPhoneNumber = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_doctor_phone_number);
            mDoctorPhoneNumberLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_doctor_phone_number_label);
            mDoctorPhoneNumberLabel.attach(mDoctorPhoneNumber);
            mPlaceOrderButton = (Button)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_place_order_button);
            handlePrePopulate();
            wireListeners();
            setupTestFairy();
        }
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }

    public void setTransferRxData(TransferRxData transferrxdata)
    {
        mTransferRxData = transferrxdata;
    }























}
