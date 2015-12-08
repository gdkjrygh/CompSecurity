// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsPageView;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import com.walmartlabs.android.pharmacy.ui.StoreAddressView;
import com.walmartlabs.android.pharmacy.ui.dob.DateEditText;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.storelocator.StorePickerListener;
import com.walmartlabs.ui.FloatLabel;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyUtils, PharmacyManager, TransferRxPrescriptionInfoPresenter

public class TransferRxUserInfoPresenter extends Presenter
    implements com.walmartlabs.android.pharmacy.ui.StoreAddressView.OnShowStoreDetailsListener
{

    private static final String FEMALE = "F";
    private static final String MALE = "M";
    private static final SimpleDateFormat sMonthDayYearFormatter;
    protected Activity mActivity;
    private Button mContinueButton;
    private DateEditText mDateOfBirthText;
    private FloatLabel mDateOfBirthTextLabel;
    private final int mDropDownPadding;
    private ImageView mEditStoreButton;
    private EditText mEmailAddress;
    private FloatLabel mEmailAddressLabel;
    private final String mFemaleString;
    private TextView mFindStoreButton;
    private EditText mFirstName;
    private FloatLabel mFirstNameLabel;
    private Spinner mGender;
    private FloatLabel mGenderLabel;
    private EditText mLastName;
    private FloatLabel mLastNameLabel;
    private final int mPharmacyBlueTitleColor;
    private final int mPharmacyErrorColor;
    private EditText mPhoneNumber;
    private FloatLabel mPhoneNumberLabel;
    private ScrollView mRootView;
    private StoreAddressView mStoreAddress;
    private final TransferRxData mTransferRxData = new TransferRxData();

    public TransferRxUserInfoPresenter(Activity activity)
    {
        mActivity = activity;
        mFemaleString = mActivity.getString(R.string.pharmacy_gender_female);
        mPharmacyBlueTitleColor = mActivity.getResources().getColor(R.color.pharmacy_blue_title);
        mPharmacyErrorColor = mActivity.getResources().getColor(R.color.pharmacy_error);
        mDropDownPadding = mActivity.getResources().getDimensionPixelSize(R.dimen.textfield_padding_left);
    }

    private boolean areFieldsValid()
    {
        clearErrors();
        boolean flag1 = true;
        if (mTransferRxData.pickupStore == -1)
        {
            mFindStoreButton.setTextColor(mPharmacyErrorColor);
            scrollAndFocus(mFindStoreButton);
            flag1 = false;
        }
        boolean flag = flag1;
        if (TextUtils.isEmpty(mFirstName.getText()))
        {
            mFirstNameLabel.setError(R.string.pharmacy_transfer_rx_missing_first_name);
            highlightErrorEditText(mFirstName);
            flag = flag1;
            if (flag1)
            {
                scrollAndFocus(mFirstName);
                flag = false;
            }
        }
        flag1 = flag;
        if (TextUtils.isEmpty(mLastName.getText()))
        {
            mLastNameLabel.setError(R.string.pharmacy_transfer_rx_missing_last_name);
            highlightErrorEditText(mLastName);
            flag1 = flag;
            if (flag)
            {
                scrollAndFocus(mLastName);
                flag1 = false;
            }
        }
        flag = flag1;
        if (!PharmacyUtils.isValidUSPhoneNumber(mPhoneNumber.getText().toString()))
        {
            mPhoneNumberLabel.setError(R.string.pharmacy_transfer_rx_invalid_phone);
            highlightErrorEditText(mPhoneNumber);
            flag = flag1;
            if (flag1)
            {
                scrollAndFocus(mPhoneNumber);
                flag = false;
            }
        }
        Object obj = mEmailAddress.getText().toString().trim();
        flag1 = flag;
        if (!PharmacyUtils.isValidEmailAddress(((CharSequence) (obj))))
        {
            flag1 = TextUtils.isEmpty(((CharSequence) (obj)));
            obj = mEmailAddressLabel;
            int i;
            if (flag1)
            {
                i = R.string.pharmacy_transfer_rx_missing_email;
            } else
            {
                i = R.string.pharmacy_transfer_rx_invalid_email;
            }
            ((FloatLabel) (obj)).setError(i);
            highlightErrorEditText(mEmailAddress);
            flag1 = flag;
            if (flag)
            {
                scrollAndFocus(mEmailAddress);
                flag1 = false;
            }
        }
        flag = flag1;
        if (TextUtils.isEmpty(mDateOfBirthText.getText()))
        {
            mDateOfBirthTextLabel.setError(R.string.pharmacy_transfer_rx_missing_dob);
            mDateOfBirthText.setBackgroundResource(R.drawable.spinner_default_holo_light_error);
            PharmacyUtils.restoreLeftPaddingDropDown(mDateOfBirthText, mDropDownPadding);
            flag = flag1;
            if (flag1)
            {
                scrollAndFocus(mDateOfBirthText);
                flag = false;
            }
        }
        flag1 = flag;
        if (mGender.getSelectedItemPosition() == -1)
        {
            mGenderLabel.setError(R.string.pharmacy_transfer_rx_missing_gender);
            mGender.setBackgroundResource(R.drawable.spinner_default_holo_light_error);
            PharmacyUtils.restoreLeftPaddingDropDown(mGender, mDropDownPadding);
            flag1 = flag;
            if (flag)
            {
                scrollAndFocus(mGender);
                flag1 = false;
            }
        }
        return flag1;
    }

    private void clearErrors()
    {
        mFindStoreButton.setTextColor(mPharmacyBlueTitleColor);
        mFirstName.setBackgroundResource(R.drawable.edit_text_regular);
        mLastName.setBackgroundResource(R.drawable.edit_text_regular);
        mPhoneNumber.setBackgroundResource(R.drawable.edit_text_regular);
        mEmailAddress.setBackgroundResource(R.drawable.edit_text_regular);
        mDateOfBirthText.setBackgroundResource(R.drawable.spinner_background_holo_light);
        PharmacyUtils.restoreLeftPaddingDropDown(mDateOfBirthText, mDropDownPadding);
        mGender.setBackgroundResource(R.drawable.spinner_background_holo_light);
        PharmacyUtils.restoreLeftPaddingDropDown(mGender, mDropDownPadding);
        mFirstNameLabel.clearError();
        mLastNameLabel.clearError();
        mPhoneNumberLabel.clearError();
        mEmailAddressLabel.clearError();
        mDateOfBirthTextLabel.clearError();
        mGenderLabel.clearError();
    }

    private void getInputData()
    {
label0:
        {
            mTransferRxData.patientInfo.firstName = mFirstName.getText().toString().trim();
            mTransferRxData.patientInfo.lastName = mLastName.getText().toString().trim();
            mTransferRxData.patientInfo.phone = PharmacyUtils.extractRawUSPhoneNumber(mPhoneNumber.getText().toString());
            mTransferRxData.patientInfo.emailAddress = mEmailAddress.getText().toString().trim();
            mTransferRxData.patientInfo.dob = mDateOfBirthText.getDate();
            if (mGender.getSelectedItemPosition() != -1)
            {
                if (!((String)mGender.getSelectedItem()).equals(mFemaleString))
                {
                    break label0;
                }
                mTransferRxData.patientInfo.gender = "F";
            }
            return;
        }
        mTransferRxData.patientInfo.gender = "M";
    }

    private void handlePrepopulate()
    {
        mFirstName.setText(mTransferRxData.patientInfo.firstName);
        mLastName.setText(mTransferRxData.patientInfo.lastName);
        mEmailAddress.setText(mTransferRxData.patientInfo.emailAddress);
    }

    private void pickStore()
    {
        StoreFinderController storefindercontroller = new StoreFinderController(mActivity, getPresenterStack(), PharmacyManager.get().getStoreFinderConfigurator());
        storefindercontroller.initFilteredPickerMode(new String[] {
            "Pharmacy"
        });
        storefindercontroller.setStorePickerTitle(mActivity.getString(R.string.store_finder_picker_title));
        storefindercontroller.setStorePickerListener(new StorePickerListener() {

            final TransferRxUserInfoPresenter this$0;

            public void onCancelled()
            {
            }

            public void onStoreClicked(StoreData storedata)
            {
                setStore(storedata);
                getPresenterStack().popPresenter();
            }

            
            {
                this$0 = TransferRxUserInfoPresenter.this;
                super();
            }
        });
        storefindercontroller.show(false);
        storefindercontroller.initLocation();
    }

    private void populateStoreDetails(StoreData storedata)
    {
        mStoreAddress.setStore(storedata);
        ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button).setVisibility(8);
        ViewUtil.findViewById(mRootView, R.id.store_info).setVisibility(0);
    }

    private void scrollAndFocus(View view)
    {
        PharmacyUtils.scrollAndFocus(mActivity, mRootView, view);
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_first_name);
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_last_name);
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_phone_number);
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_email);
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_date_birth);
    }

    private void trackPageView()
    {
        MessageBus.getBus().post(new AnalyticsPageView("/pharmacy/transfer_rx"));
    }

    private void wireListeners()
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final TransferRxUserInfoPresenter this$0;

            public void onClick(View view)
            {
                pickStore();
            }

            
            {
                this$0 = TransferRxUserInfoPresenter.this;
                super();
            }
        };
        mEditStoreButton.setOnClickListener(onclicklistener);
        mFindStoreButton.setOnClickListener(onclicklistener);
        mGender.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final TransferRxUserInfoPresenter this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                mGenderLabel.show();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = TransferRxUserInfoPresenter.this;
                super();
            }
        });
        mContinueButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TransferRxUserInfoPresenter this$0;

            public void onClick(View view)
            {
                if (areFieldsValid())
                {
                    ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(mRootView.getWindowToken(), 0);
                    getInputData();
                    view = new TransferRxPrescriptionInfoPresenter(mActivity);
                    view.setTransferRxData(mTransferRxData);
                    pushPresenter(view);
                }
            }

            
            {
                this$0 = TransferRxUserInfoPresenter.this;
                super();
            }
        });
    }

    protected StoreData getClosestPharmacyStore()
    {
        for (Iterator iterator = StoreLocationManager.getInstance(mActivity).getNearbyByStores().iterator(); iterator.hasNext();)
        {
            StoreData storedata = (StoreData)iterator.next();
            if (storedata.hasService("Pharmacy"))
            {
                return storedata;
            }
        }

        return null;
    }

    public String getScreenName()
    {
        return "Rx:TransferPrescription1";
    }

    public String getTitleText()
    {
        return mActivity.getString(R.string.pharmacy_transfer_rx_transfer_rx);
    }

    public View getView()
    {
        return mRootView;
    }

    public void highlightErrorEditText(EditText edittext)
    {
        edittext.setBackgroundResource(R.drawable.edit_text_error);
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        if (mRootView != null)
        {
            mRootView.scrollTo(0, 0);
        }
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        trackPageView();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ScrollView)ViewUtil.inflate(mActivity, R.layout.pharmacy_transfer_user_info, viewgroup);
            mStoreAddress = (StoreAddressView)ViewUtil.findViewById(mRootView, R.id.pharmacy_store_details);
            mStoreAddress.setOnShowStoreDetailsListener(this);
            mFirstName = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_first_name);
            mFirstNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_first_name_label);
            mFirstNameLabel.attach(mFirstName);
            mLastName = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_last_name);
            mLastNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_last_name_label);
            mLastNameLabel.attach(mLastName);
            mPhoneNumber = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_phone_number);
            mPhoneNumberLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_phone_number_label);
            mPhoneNumberLabel.attach(mPhoneNumber);
            mEmailAddress = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_email);
            mEmailAddressLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_email_label);
            mEmailAddressLabel.attach(mEmailAddress);
            mDateOfBirthText = (DateEditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_date_birth);
            mDateOfBirthText.setPromptDialog(mActivity.getString(R.string.pharmacy_dob_dialog_enter_dob));
            mDateOfBirthTextLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_date_birth_label);
            mDateOfBirthTextLabel.attach(mDateOfBirthText);
            mGender = (Spinner)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_gender);
            mGender.setAdapter(new com.walmartlabs.ui.NoDefaultSpinner.Adapter(mActivity, R.string.pharmacy_transfer_rx_gender, R.array.pharmacy_gender));
            mGenderLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_gender_label);
            mGenderLabel.attach(mGender);
            mContinueButton = (Button)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_continue_button);
            mEditStoreButton = (ImageView)ViewUtil.findViewById(mRootView, R.id.pharmacy_edit_store_button);
            mEditStoreButton.setVisibility(0);
            mFindStoreButton = (TextView)ViewUtil.findViewById(mRootView, R.id.no_pharmacy_selected_find_store_button);
            handlePrepopulate();
            trySetClosestStore();
            wireListeners();
            setupTestFairy();
        }
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }

    public void onShowStoreDetails(StoreData storedata)
    {
        pushPresenter(PharmacyManager.get().getStoreDetailPresenter(mActivity, storedata));
    }

    public void prePopulate(String s, String s1, String s2)
    {
        mTransferRxData.patientInfo.firstName = s;
        mTransferRxData.patientInfo.lastName = s1;
        mTransferRxData.patientInfo.emailAddress = s2;
    }

    protected void setStore(StoreData storedata)
    {
        mTransferRxData.pickupStore = Integer.parseInt(storedata.getId());
        mTransferRxData.pickupStoreData = storedata;
        populateStoreDetails(storedata);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("changeStore")).putString("newStoreId", storedata.getId()).putString("oldStoreId", "none").putString("changeStoreLocation", "transfer"));
    }

    protected boolean trySetClosestStore()
    {
        StoreData storedata = getClosestPharmacyStore();
        if (storedata != null)
        {
            setStore(storedata);
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        sMonthDayYearFormatter = new SimpleDateFormat("MMddyyyy", Locale.US);
    }







}
