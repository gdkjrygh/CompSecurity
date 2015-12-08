// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.ui.NoDefaultSpinner;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.view:
//            NumberFormattingTextWatcher, CompositeFocusChangeListener

public class CreditCardView extends LinearLayout
{
    private class CreditCardTypeWatcher
        implements TextWatcher
    {

        final CreditCardView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            updateCardTypeView(String.valueOf(charsequence), mCardType);
        }

        private CreditCardTypeWatcher()
        {
            this$0 = CreditCardView.this;
            super();
        }

    }

    private static class DateFormattingFocusChangeListener
        implements android.view.View.OnFocusChangeListener
    {

        public void onFocusChange(View view, boolean flag)
        {
            if (view instanceof EditText)
            {
                view = (EditText)view;
                String s = view.getText().toString();
                if (s.length() == 3)
                {
                    view.setText((new StringBuilder()).append('0').append(s.charAt(0)).append("/").append(s.substring(1, 3)));
                }
            }
        }

        private DateFormattingFocusChangeListener()
        {
        }

    }

    private static class DateFormattingTextWatcher
        implements TextWatcher
    {

        public void afterTextChanged(Editable editable)
        {
            if (editable.length() == 4 && !editable.toString().contains("/"))
            {
                editable.insert(2, "/");
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private DateFormattingTextWatcher()
        {
        }

    }


    private EditText mAddress1;
    private FloatLabel mAddress1Label;
    private EditText mAddress2;
    private View mBillingAddressFooter;
    private ListRecyclerView mBillingAddressList;
    private View mBillingAddressListContainer;
    private View mBillingAddressSelectContainer;
    private ImageView mCardType;
    private String mCardTypeValue;
    private EditText mCity;
    private FloatLabel mCityLabel;
    private EditText mCode;
    private FloatLabel mCodeLabel;
    private final Context mContext;
    private Button mDeleteButton;
    private EditText mExpiryDate;
    private FloatLabel mExpiryDateLabel;
    private EditText mFirstName;
    private FloatLabel mFirstNameLabel;
    private boolean mHasExistingCard;
    private View mInfoButton;
    private EditText mLastName;
    private FloatLabel mLastNameLabel;
    private LinearLayout mLoadedCardContainer;
    private TextView mLoadedCardNumber;
    private ImageView mLoadedCardTypeImage;
    private View mNewAddressView;
    private LinearLayout mNewCardContainer;
    private EditText mNumber;
    private FloatLabel mNumberLabel;
    private EditText mPhone;
    private FloatLabel mPhoneLabel;
    private Button mSaveButton;
    private NoDefaultSpinner mState;
    private com.walmartlabs.ui.NoDefaultSpinner.Adapter mStateAdapter;
    private FloatLabel mStateLabel;
    private String mStatesList[];
    private EditText mZipCode;
    private FloatLabel mZipCodeLabel;

    public CreditCardView(Context context)
    {
        this(context, null);
    }

    public CreditCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CreditCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mHasExistingCard = false;
        mContext = context;
    }

    private String detectCreditCardType(String s)
    {
        s = s.replaceAll(" ", "");
        if (s.matches("^4[0-9]{0,12}(?:[0-9]{0,3})?$"))
        {
            return "VISA";
        }
        if (s.matches("^523914[0-9]{0,10}$"))
        {
            return "WMMASTERCARD";
        }
        if (s.matches("^5[1-5][0-9]{0,14}$"))
        {
            return "MASTERCARD";
        }
        if (s.matches("^3[47][0-9]{0,13}$"))
        {
            return "AMEX";
        }
        if (s.matches("^6(?:011|5[0-9]{0,2})[0-9]{0,12}$"))
        {
            return "DISCOVER";
        }
        if (s.matches("^6032((20[1,3,7])(([0-9]{0,9})|[0-9]{0,11})|((202[0,5]0)|(202[4,5]9))(([0-9]{0,7})|([0-9]{0,9})))$"))
        {
            return "WMUSGESTORECARD";
        } else
        {
            return "UNKNOWN";
        }
    }

    private void init()
    {
        View.inflate(mContext, com.walmartlabs.android.payment.R.layout.pm_add_credit_card, this);
        mFirstNameLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_first_name_label);
        mFirstName = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_first_name);
        mLastNameLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_last_name_label);
        mLastName = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_last_name);
        mNumberLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_card_number_label);
        mNumber = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_card_number);
        mCardType = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_card_type);
        mExpiryDateLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_expiry_label);
        mExpiryDate = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_expiry);
        mCodeLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_code_label);
        mCode = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_code);
        mInfoButton = ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_gc_code_info_button);
        mPhoneLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_phone_label);
        mPhone = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_phone);
        mAddress1Label = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_address1_label);
        mAddress1 = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_address1);
        FloatLabel floatlabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_address2_label);
        mAddress2 = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_address2);
        mCityLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_city_label);
        mCity = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_city);
        mStateLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_state_label);
        mState = (NoDefaultSpinner)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_state);
        mZipCodeLabel = (FloatLabel)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_zip_label);
        mZipCode = (EditText)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_zip);
        mSaveButton = (Button)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.payment_save_btn);
        mDeleteButton = (Button)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.payment_delete_btn);
        mNewCardContainer = (LinearLayout)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_container);
        mLoadedCardContainer = (LinearLayout)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_edit_cc_container);
        mLoadedCardTypeImage = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_edit_cc_card_type);
        mLoadedCardNumber = (TextView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_edit_cc_card_number);
        mNewAddressView = ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_billing_addr_container);
        mBillingAddressList = (ListRecyclerView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_existing_address_list);
        mBillingAddressSelectContainer = ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_add_cc_address_existing_layout);
        mBillingAddressListContainer = ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_billing_address_list_container);
        mBillingAddressFooter = ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_list_item_address_footer);
        mFirstNameLabel.attach(mFirstName);
        mLastNameLabel.attach(mLastName);
        mNumberLabel.attach(mNumber);
        mExpiryDateLabel.attach(mExpiryDate);
        mCodeLabel.attach(mCode);
        mPhoneLabel.attach(mPhone);
        mAddress1Label.attach(mAddress1);
        floatlabel.attach(mAddress2);
        mCityLabel.attach(mCity);
        mStateLabel.attach(mState);
        mZipCodeLabel.attach(mZipCode);
        mCode.setOnFocusChangeListener((new CompositeFocusChangeListener.Builder()).addListener(mCode.getOnFocusChangeListener()).build());
        mCode.setTransformationMethod(new PasswordTransformationMethod());
        mStatesList = mContext.getResources().getStringArray(com.walmartlabs.android.payment.R.array.pm_states_list);
        mStateAdapter = new com.walmartlabs.ui.NoDefaultSpinner.Adapter(mContext, mContext.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_credit_card_hint_state), mStatesList);
        mStateAdapter.setDropDownViewResource(0x1090009);
        mState.setAdapter(mStateAdapter);
        mExpiryDate.setOnFocusChangeListener((new CompositeFocusChangeListener.Builder()).addListener(mExpiryDate.getOnFocusChangeListener()).addListener(new DateFormattingFocusChangeListener()).build());
        mExpiryDate.addTextChangedListener(new DateFormattingTextWatcher());
        mNumber.setRawInputType(2);
        mNumber.addTextChangedListener(new NumberFormattingTextWatcher());
        mNumber.addTextChangedListener(new CreditCardTypeWatcher());
        mPhone.setRawInputType(3);
        mPhone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        mPhone.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CreditCardView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    ViewUtil.hideKeyboard(mPhone);
                }
                return false;
            }

            
            {
                this$0 = CreditCardView.this;
                super();
            }
        });
        mInfoButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CreditCardView this$0;

            public void onClick(View view)
            {
                mInfoButton.setEnabled(false);
                (new com.walmart.android.ui.CustomAlertDialog.Builder(mContext)).setTitle(com.walmartlabs.android.payment.R.string.pm_add_credit_card_cvv_title).setView(View.inflate(mContext, com.walmartlabs.android.payment.R.layout.pm_cc_security_modal, null)).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final _cls2 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                }).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                    final _cls2 this$1;

                    public void onDismiss(DialogInterface dialoginterface)
                    {
                        mInfoButton.setEnabled(true);
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                }).show();
            }

            
            {
                this$0 = CreditCardView.this;
                super();
            }
        });
    }

    private void setCardTypeImage(String s, ImageView imageview)
    {
        if (imageview == null) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 68
    //                   -1553624974: 129
    //                   2012639: 143
    //                   2634817: 115
    //                   160335816: 185
    //                   1055811561: 157
    //                   1469170623: 171;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        byte0;
        JVM INSTR tableswitch 0 5: default 108
    //                   0 199
    //                   1 219
    //                   2 239
    //                   3 259
    //                   4 279
    //                   5 299;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L11:
        break; /* Loop/switch isn't completed */
_L10:
        imageview.setVisibility(8);
_L2:
        return;
_L6:
        if (s.equals("VISA"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.equals("MASTERCARD"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s.equals("AMEX"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (s.equals("DISCOVER"))
        {
            byte0 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (s.equals("WMUSGESTORECARD"))
        {
            byte0 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (s.equals("WMMASTERCARD"))
        {
            byte0 = 5;
        }
        if (true) goto _L3; else goto _L17
_L17:
        imageview.setVisibility(0);
        imageview.setImageDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_visa));
        return;
_L12:
        imageview.setVisibility(0);
        imageview.setImageDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_mastercard));
        return;
_L13:
        imageview.setVisibility(0);
        imageview.setImageDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_amex));
        return;
_L14:
        imageview.setVisibility(0);
        imageview.setImageDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_discover));
        return;
_L15:
        imageview.setVisibility(0);
        imageview.setImageDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_walmart));
        return;
_L16:
        imageview.setVisibility(0);
        imageview.setImageDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.credit_card_walmart));
        return;
    }

    private void updateCardTypeView(String s, ImageView imageview)
    {
        s = detectCreditCardType(s);
        if (s != mCardTypeValue)
        {
            mCardTypeValue = s;
            setCardTypeImage(mCardTypeValue, imageview);
            boolean flag;
            if (!mCardTypeValue.equals("WMUSGESTORECARD"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mExpiryDate.setEnabled(flag);
            mExpiryDate.setFocusable(flag);
        }
    }

    public View getAddExistingAddressView()
    {
        return mBillingAddressSelectContainer;
    }

    public String getAddress1()
    {
        return mAddress1.getText().toString();
    }

    public FloatLabel getAddress1Label()
    {
        return mAddress1Label;
    }

    public EditText getAddress1View()
    {
        return mAddress1;
    }

    public String getAddress2()
    {
        return mAddress2.getText().toString();
    }

    public View getBillingAddressFooter()
    {
        return mBillingAddressFooter;
    }

    public ListRecyclerView getBillingAddressList()
    {
        return mBillingAddressList;
    }

    public String getCardNumber()
    {
        return mNumber.getText().toString();
    }

    public FloatLabel getCardNumberLabel()
    {
        return mNumberLabel;
    }

    public EditText getCardNumberView()
    {
        return mNumber;
    }

    public String getCardType()
    {
        if (mCardTypeValue != null)
        {
            return mCardTypeValue;
        } else
        {
            return "";
        }
    }

    public String getCity()
    {
        return mCity.getText().toString();
    }

    public FloatLabel getCityLabel()
    {
        return mCityLabel;
    }

    public EditText getCityView()
    {
        return mCity;
    }

    public String getCvv()
    {
        return mCode.getText().toString();
    }

    public FloatLabel getCvvLabel()
    {
        return mCodeLabel;
    }

    public EditText getCvvView()
    {
        return mCode;
    }

    public FloatLabel getExpiryDateLabel()
    {
        return mExpiryDateLabel;
    }

    public EditText getExpiryDateView()
    {
        return mExpiryDate;
    }

    public int getExpiryMonth()
    {
        if (mExpiryDate.getText() != null && mExpiryDate.getText().toString().length() >= 2)
        {
            return Integer.parseInt(mExpiryDate.getText().toString().substring(0, 2));
        } else
        {
            return -1;
        }
    }

    public int getExpiryYear()
    {
        if (mExpiryDate.getText() == null || mExpiryDate.getText().toString().length() < 4)
        {
            return -1;
        } else
        {
            int i = Calendar.getInstance().get(1);
            return Integer.parseInt((new StringBuilder()).append(String.valueOf(i).substring(0, 2)).append(mExpiryDate.getText().toString().substring(3, 5)).toString());
        }
    }

    public String getFirstName()
    {
        return mFirstName.getText().toString();
    }

    public FloatLabel getFirstNameLabel()
    {
        return mFirstNameLabel;
    }

    public EditText getFirstNameView()
    {
        return mFirstName;
    }

    public String getLastName()
    {
        return mLastName.getText().toString();
    }

    public FloatLabel getLastNameLabel()
    {
        return mLastNameLabel;
    }

    public EditText getLastNameView()
    {
        return mLastName;
    }

    public FloatLabel getPhoneLabel()
    {
        return mPhoneLabel;
    }

    public String getPhoneNumber()
    {
        return mPhone.getText().toString();
    }

    public EditText getPhoneView()
    {
        return mPhone;
    }

    public String getState()
    {
        if (mState.getSelectedItemPosition() != -1)
        {
            return (String)mStateAdapter.getItem(mState.getSelectedItemPosition());
        } else
        {
            return null;
        }
    }

    public FloatLabel getStateLabel()
    {
        return mStateLabel;
    }

    public NoDefaultSpinner getStateView()
    {
        return mState;
    }

    public String getZipCode()
    {
        return mZipCode.getText().toString();
    }

    public FloatLabel getZipCodeLabel()
    {
        return mZipCodeLabel;
    }

    public EditText getZipCodeView()
    {
        return mZipCode;
    }

    public boolean hasExistingCard()
    {
        return mHasExistingCard;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        init();
    }

    public void populate(CreditCard creditcard)
    {
        mHasExistingCard = true;
        mNewCardContainer.setVisibility(8);
        mLoadedCardContainer.setVisibility(0);
        mDeleteButton.setVisibility(0);
        mNewAddressView.setVisibility(0);
        mBillingAddressListContainer.setVisibility(8);
        if (creditcard != null)
        {
            mFirstName.setText(creditcard.getFirstName());
            mLastName.setText(creditcard.getLastName());
            mCode.setText(mContext.getResources().getString(com.walmartlabs.android.payment.R.string.pm_edit_credit_card_cvv_masked));
            setCardTypeImage(creditcard.getCardType(), mLoadedCardTypeImage);
            mLoadedCardNumber.setText(String.format(mContext.getString(com.walmartlabs.android.payment.R.string.pm_bullets_and_lastfour), new Object[] {
                creditcard.getLastFour()
            }));
            mPhone.setText(creditcard.getPhone());
            mAddress1.setText(creditcard.getAddressLineOne());
            mAddress2.setText(creditcard.getAddressLineTwo());
            mCity.setText(creditcard.getCity());
            mZipCode.setText(creditcard.getPostalCode());
            String s = CreditCardsModel.createExpiryDate(creditcard);
            if (!TextUtils.isEmpty(s))
            {
                mExpiryDate.setText(s);
            }
            mState.setSelection(Arrays.asList(mStatesList).indexOf(creditcard.getState()));
            mCardTypeValue = creditcard.getCardType();
        }
    }

    public void setDeleteListener(android.view.View.OnClickListener onclicklistener)
    {
        mDeleteButton.setOnClickListener(onclicklistener);
    }

    public void setSaveListener(android.view.View.OnClickListener onclicklistener)
    {
        mSaveButton.setOnClickListener(onclicklistener);
    }

    public void setSecurityCodeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        if (mCode.getOnFocusChangeListener() instanceof CompositeFocusChangeListener)
        {
            ((CompositeFocusChangeListener)mCode.getOnFocusChangeListener()).addListener(onfocuschangelistener);
            return;
        } else
        {
            mCode.setOnFocusChangeListener(onfocuschangelistener);
            return;
        }
    }

    public void showAddressFields(boolean flag)
    {
        if (flag)
        {
            mBillingAddressListContainer.setVisibility(8);
            mNewAddressView.setVisibility(0);
            mBillingAddressSelectContainer.setVisibility(0);
            return;
        } else
        {
            mBillingAddressListContainer.setVisibility(0);
            mNewAddressView.setVisibility(8);
            mBillingAddressSelectContainer.setVisibility(8);
            return;
        }
    }

    public String validateCreditCardType(String s)
    {
        s = s.replaceAll(" ", "");
        if (s.matches("^4[0-9]{12}(?:[0-9]{3})?$"))
        {
            return "VISA";
        }
        if (s.matches("^523914[0-9]{10}$"))
        {
            return "WMMASTERCARD";
        }
        if (s.matches("^5[1-5][0-9]{14}$"))
        {
            return "MASTERCARD";
        }
        if (s.matches("^3[47][0-9]{13}$"))
        {
            return "AMEX";
        }
        if (s.matches("^6(?:011|5[0-9]{2})[0-9]{12}$"))
        {
            return "DISCOVER";
        }
        if (s.matches("^6032((20[1,3,7])(([0-9]{9})|[0-9]{11})|((202[0,5]0)|(202[4,5]9))(([0-9]{7})|([0-9]{9})))$"))
        {
            return "WMUSGESTORECARD";
        } else
        {
            return "UNKNOWN";
        }
    }





}
