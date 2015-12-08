// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyUtils, AddRefillToCartHelper, ReviewOrderPresenter

public class EnterNumbersPresenter extends Presenter
{
    public static interface OnNumbersEnteredListener
    {

        public abstract void onNumbersEntered(int i, int j);
    }


    private static final int DIALOG_PHARMACY_INVALID_RX_STORE = 0;
    public static final String TAG = com/walmartlabs/android/pharmacy/EnterNumbersPresenter.getSimpleName();
    protected final Activity mActivity;
    private AddRefillToCartHelper mAddRefillToCartHelper;
    private EditText mPrescriptionEditText;
    private FloatLabel mPrescriptionLabel;
    private final OrderConfirmationRefillPresenter.RefillListener mRefillListener;
    private View mRootView;
    private EditText mStoreEditText;
    private FloatLabel mStoreNumberLabel;
    private final int mTextFieldErrorBg;
    private final int mTextFieldNormalBg;

    public EnterNumbersPresenter(Activity activity, OrderConfirmationRefillPresenter.RefillListener refilllistener)
    {
        mActivity = activity;
        mTextFieldNormalBg = R.drawable.edit_text_regular;
        mTextFieldErrorBg = R.drawable.edit_text_error;
        setTitleText(mActivity.getString(R.string.pharmacy_scan_to_refill_enter_numbers_title));
        mRefillListener = refilllistener;
    }

    private void clearErrors()
    {
        mPrescriptionEditText.setBackgroundResource(mTextFieldNormalBg);
        mStoreEditText.setBackgroundResource(mTextFieldNormalBg);
        mPrescriptionLabel.clearError();
        mStoreNumberLabel.clearError();
    }

    private boolean isInputValid()
    {
        boolean flag;
label0:
        {
            clearErrors();
            flag = true;
            boolean flag1 = true;
            String s = mPrescriptionEditText.getText().toString();
            String s1 = mStoreEditText.getText().toString();
            boolean flag2 = TextUtils.isEmpty(s);
            boolean flag3 = TextUtils.isEmpty(s1);
            boolean flag4 = PharmacyUtils.isValidPrescriptionNumber(s);
            boolean flag5 = PharmacyUtils.isValidStoreNumber(s1);
            if (flag2)
            {
                mPrescriptionEditText.setBackgroundResource(mTextFieldErrorBg);
                flag = flag1;
                if (true)
                {
                    scrollAndFocus(mPrescriptionEditText);
                    flag = false;
                }
                mPrescriptionLabel.setError(R.string.pharmacy_enter_numbers_missing_rx_number);
            }
            flag1 = flag;
            if (flag3)
            {
                mStoreEditText.setBackgroundResource(mTextFieldErrorBg);
                flag1 = flag;
                if (flag)
                {
                    scrollAndFocus(mStoreEditText);
                    flag1 = false;
                }
                mStoreNumberLabel.setError(R.string.pharmacy_enter_numbers_missing_store_number);
            }
            flag = flag1;
            if (flag2)
            {
                break label0;
            }
            flag = flag1;
            if (flag3)
            {
                break label0;
            }
            if (flag4)
            {
                flag = flag1;
                if (flag5)
                {
                    break label0;
                }
            }
            flag = false;
            showDialog(0);
        }
        return flag;
    }

    private void scrollAndFocus(View view)
    {
        PharmacyUtils.scrollAndFocus(mActivity, mRootView, view);
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.prescription_number);
    }

    private void submit()
    {
        EditText edittext = (EditText)ViewUtil.findViewById(mRootView, R.id.store_number);
        EditText edittext1 = (EditText)ViewUtil.findViewById(mRootView, R.id.prescription_number);
        try
        {
            int i = Integer.parseInt(edittext1.getText().toString());
            int j = Integer.parseInt(edittext.getText().toString());
            AddRefillToCartHelper.AddRefillToCartCallback addrefilltocartcallback = new AddRefillToCartHelper.AddRefillToCartCallback() {

                final EnterNumbersPresenter this$0;

                public void onCancel()
                {
                }

                public void onCoolDown()
                {
                    popToRoot();
                }

                public void onRefillAdded(Cart cart)
                {
                    cart = new ReviewOrderPresenter(mActivity, cart, mRefillListener);
                    pushAndReplacePresenter(cart);
                }

            
            {
                this$0 = EnterNumbersPresenter.this;
                super();
            }
            };
            mAddRefillToCartHelper = new AddRefillToCartHelper(mActivity, this, i, j, addrefilltocartcallback);
            mAddRefillToCartHelper.addRefillToCart();
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyEasyRefillEntryMethod")).putString("entryMethod", "type"));
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.w(TAG, (new StringBuilder()).append("Issue parsing rx: ").append(edittext1.getText()).append(", store: ").append(edittext.getText()).toString());
        }
        ViewUtil.hideKeyboard(mRootView);
    }

    public String getScreenName()
    {
        return "Rx:EnterNumbers";
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean interceptBack()
    {
        MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmAbortManualEntry"));
        return super.interceptBack();
    }

    protected Dialog onCreateDialog(int i)
    {
        Dialog dialog = null;
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 39;
           goto _L1 _L2
_L1:
        Dialog dialog1 = dialog;
        if (dialog == null)
        {
            dialog1 = DialogFactory.onCreateDialog(0x10004, mActivity);
        }
        return dialog1;
_L2:
        dialog = DialogFactory.onCreateDialog(0x10003, mActivity);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, R.layout.pharmacy_enter_number, viewgroup, false);
            ViewUtil.findViewById(mRootView, R.id.button_continue).setOnClickListener(new android.view.View.OnClickListener() {

                final EnterNumbersPresenter this$0;

                public void onClick(View view)
                {
                    if (isInputValid())
                    {
                        submit();
                    }
                }

            
            {
                this$0 = EnterNumbersPresenter.this;
                super();
            }
            });
            mPrescriptionEditText = (EditText)ViewUtil.findViewById(mRootView, R.id.prescription_number);
            mPrescriptionLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.prescription_number_label);
            mPrescriptionLabel.attach(mPrescriptionEditText);
            mStoreEditText = (EditText)ViewUtil.findViewById(mRootView, R.id.store_number);
            mStoreEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final EnterNumbersPresenter this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    if (isInputValid())
                    {
                        submit();
                    }
                    return false;
                }

            
            {
                this$0 = EnterNumbersPresenter.this;
                super();
            }
            });
            mStoreNumberLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.store_number_label);
            mStoreNumberLabel.attach(mStoreEditText);
            setupTestFairy();
        }
    }

    public void onPop()
    {
        super.onPop();
        if (mAddRefillToCartHelper != null)
        {
            mAddRefillToCartHelper.dimissAllNonTransientDialogs();
        }
    }

    public void onPushed()
    {
        super.onPushed();
        ViewUtil.showKeyboard(mRootView.findViewById(R.id.prescription_number));
    }






}
