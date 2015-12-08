// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.text.UnifiedFontEditText;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.StandaloneCreditCardFieldsDelegate;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.StandaloneCreditCardForm;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.StandaloneExpiryDateEditText;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.StandaloneSecurityCodeEditText;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.GoogleWalletPaymentVaultProcessor;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.AddressUtil;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.StringUtil;
import com.google.android.gms.wallet.MaskedWallet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingHeader

public class CartBillingView extends CartUiView
    implements CartBaseBillingHeader.Callback
{

    private EditText aptSuiteText;
    private EditText boletoEmailText;
    private EditText boletoIdentityNumberText;
    private EditText boletoNameText;
    private View boletoView;
    protected CartDataEntryCallback callback;
    protected TextView cancelButton;
    private EditText cityText;
    private ArrayList countryCodes;
    private ArrayList countryNames;
    private Spinner countrySpinner;
    private EditText cpfText;
    private StandaloneCreditCardForm creditCardForm;
    private View creditCardView;
    private String currentCountryCode;
    private ArrayList currentStates;
    private EditText emailText;
    private StandaloneExpiryDateEditText expiryDateEditText;
    protected TextView floatingBottomNextButton;
    protected View floatingBottomNextButtonLayout;
    private View freeModeText;
    private boolean fromStepper;
    protected View fullAddressArea;
    private View googleWalletContainer;
    private View googleWalletDefaultButton;
    private View googleWalletDefaultText;
    private UnifiedFontTextView googleWalletDetailsTextView;
    private UnifiedFontTextView googleWalletEmailTextView;
    private View googleWalletView;
    private FrameLayout headerContainer;
    private EditText nameOnCardText;
    private EditText nameText;
    private EditText oxxoEmailText;
    private EditText oxxoNameText;
    private View oxxoView;
    private View paypalView;
    private EditText phoneText;
    private StandaloneSecurityCodeEditText securityCodeEditText;
    private UnifiedFontTextView securityCodeHintTextView;
    protected CheckBox shippingCheckmark;
    private View shippingCheckmarkLayout;
    protected TextView shippingCheckmarkText;
    private EditText stateProvinceText;
    private Spinner stateSpinner;
    private EditText streetAddressText;
    protected CartBillingHeader tabHeaderView;
    private UnifiedFontTextView trustedCheckoutTextView;
    private UnifiedFontTextView trustedCheckoutTitleView;
    protected View trustedCheckoutView;
    private View zipCodeArea;
    private UnifiedFontEditText zipCodeEditText;
    private EditText zipPostalText;

    public CartBillingView(CartManager cartmanager, CartDataEntryCallback cartdataentrycallback, boolean flag)
    {
        super(cartmanager);
        fromStepper = flag;
        callback = cartdataentrycallback;
        init();
    }

    private boolean cancel()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
        alertdialog.setTitle(getContext().getString(0x7f060073));
        alertdialog.setMessage(getContext().getString(0x7f06012c));
        alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final CartBillingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                hideKeyboard();
                callback.onCancel();
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final CartBillingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        alertdialog.show();
        return true;
    }

    private void handleBokuAutoNext()
    {
        handleDone();
    }

    private void handleCountrySelected(int i)
    {
        Object obj = (String)countryCodes.get(i);
        if (currentCountryCode != null && ((String) (obj)).equals(currentCountryCode))
        {
            return;
        }
        currentCountryCode = ((String) (obj));
        if (AddressUtil.getStateMapping() != null && AddressUtil.getStates(((String) (obj))) != null)
        {
            stateProvinceText.setVisibility(8);
            stateSpinner.setVisibility(0);
            stateProvinceText.setText("");
            currentStates = new ArrayList(AddressUtil.getStates(((String) (obj))));
            String s = AddressUtil.getSubdivisionNameForCountry(((String) (obj)));
            obj = s;
            if (s == null)
            {
                obj = cartManager.getActivity().getString(0x7f060414);
            }
            currentStates.add(0, (new StringBuilder()).append(((String) (obj))).append("*").toString());
            obj = new ArrayAdapter(cartManager.getActivity(), 0x7f030029, currentStates);
            ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
            stateSpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
            return;
        } else
        {
            stateProvinceText.setVisibility(0);
            stateSpinner.setVisibility(8);
            stateProvinceText.setText("");
            ArrayAdapter arrayadapter = new ArrayAdapter(cartManager.getActivity(), 0x7f030029, new ArrayList());
            arrayadapter.setDropDownViewResource(0x1090009);
            stateSpinner.setAdapter(arrayadapter);
            return;
        }
    }

    private void handlePayPalAutoNext()
    {
        if (CartExperimentManager.canCheckoutWithFuturePayPal(cartManager))
        {
            showPayPalTab();
        }
        handleDone();
    }

    private void init()
    {
        Object obj = AddressUtil.getCountries();
        countryNames = new ArrayList();
        countryCodes = new ArrayList();
        java.util.Map.Entry entry;
        for (obj = ((HashMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); countryCodes.add(entry.getKey()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            countryNames.add(entry.getValue());
        }

        obj = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03001f, this);
        trustedCheckoutTitleView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d00d4);
        trustedCheckoutTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d00d5);
        trustedCheckoutView = ((View) (obj)).findViewById(0x7f0d00d2);
        Object obj1 = UserStatusManager.getInstance().getBillingSecurityTitle();
        String s = UserStatusManager.getInstance().getBillingSecurityText();
        if (obj1 != null && s != null && cartManager.getCart().getTotal().getUsdValue() != 0.0D)
        {
            trustedCheckoutTitleView.setText(((CharSequence) (obj1)));
            trustedCheckoutTextView.setText(s);
        }
        BitmapUtil.safeSetImageResource((ImageView)((View) (obj)).findViewById(0x7f0d00d3), 0x7f02010b);
        floatingBottomNextButtonLayout = ((View) (obj)).findViewById(0x7f0d0097);
        floatingBottomNextButton = (TextView)((View) (obj)).findViewById(0x7f0d00d6);
        floatingBottomNextButton.setText(getNextButtonText());
        floatingBottomNextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingView this$0;

            public void onClick(View view)
            {
                handleDone();
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        cancelButton = (TextView)((View) (obj)).findViewById(0x7f0d009a);
        tabHeaderView = new CartBillingHeader(cartManager.getActivity());
        tabHeaderView.setCartManager(cartManager);
        tabHeaderView.setCallback(this);
        headerContainer = (FrameLayout)((View) (obj)).findViewById(0x7f0d00a7);
        setHeaderViews(((View) (obj)));
        headerContainer.addView(tabHeaderView);
        creditCardView = ((View) (obj)).findViewById(0x7f0d00a8);
        creditCardView.setVisibility(8);
        googleWalletView = ((View) (obj)).findViewById(0x7f0d00c4);
        googleWalletView.setVisibility(8);
        paypalView = ((View) (obj)).findViewById(0x7f0d00ca);
        paypalView.setVisibility(8);
        boletoView = ((View) (obj)).findViewById(0x7f0d00cb);
        boletoView.setVisibility(8);
        oxxoView = ((View) (obj)).findViewById(0x7f0d00cf);
        oxxoView.setVisibility(8);
        freeModeText = ((View) (obj)).findViewById(0x7f0d00aa);
        if (cartManager.getCart().getTotal().getUsdValue() == 0.0D)
        {
            freeModeText.setVisibility(0);
        } else
        {
            freeModeText.setVisibility(8);
        }
        creditCardForm = (StandaloneCreditCardForm)((View) (obj)).findViewById(0x7f0d00ab);
        creditCardForm.setDelegate(new StandaloneCreditCardFieldsDelegate() {

            final CartBillingView this$0;

            public void onCardTypeChanged(com.contextlogic.wish.util.CreditCardUtil.CardType cardtype)
            {
                securityCodeEditText.setCardType(cardtype);
                static class _cls17
                {

                    static final int $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[];
                    static final int $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[];

                    static 
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection = new int[CartBaseBillingHeader.CartBillingSection.values().length];
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.CREDIT_CARD.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror10) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.BOLETO.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.OXXO.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.PAYPAL.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType = new int[com.contextlogic.wish.util.CreditCardUtil.CardType.values().length];
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Amex.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Discover.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.HiperCard.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.MasterCard.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Visa.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.DinersClub.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls17..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()])
                {
                default:
                    securityCodeHintTextView.setText(0x7f0603a0);
                    return;

                case 1: // '\001'
                    securityCodeHintTextView.setText(0x7f0603a1);
                    return;

                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                    securityCodeHintTextView.setText(0x7f0603a2);
                    break;
                }
            }

            public void onEntryComplete()
            {
                if (nameOnCardText.getVisibility() == 0)
                {
                    focusOnField(nameOnCardText);
                    return;
                } else
                {
                    focusOnField(securityCodeEditText);
                    return;
                }
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        expiryDateEditText = (StandaloneExpiryDateEditText)((View) (obj)).findViewById(0x7f0d00af);
        expiryDateEditText.setDelegate(new StandaloneCreditCardFieldsDelegate() {

            final CartBillingView this$0;

            public void onCardTypeChanged(com.contextlogic.wish.util.CreditCardUtil.CardType cardtype)
            {
            }

            public void onEntryComplete()
            {
                if (requiresFullBillingAddress())
                {
                    focusOnField(nameText);
                    return;
                } else
                {
                    focusOnField(zipCodeEditText);
                    return;
                }
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        securityCodeEditText = (StandaloneSecurityCodeEditText)((View) (obj)).findViewById(0x7f0d00ae);
        securityCodeEditText.setDelegate(new StandaloneCreditCardFieldsDelegate() {

            final CartBillingView this$0;

            public void onCardTypeChanged(com.contextlogic.wish.util.CreditCardUtil.CardType cardtype)
            {
            }

            public void onEntryComplete()
            {
                focusOnField(expiryDateEditText);
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        securityCodeHintTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d00ad);
        securityCodeHintTextView.setText(0x7f0603a0);
        zipCodeEditText = (UnifiedFontEditText)((View) (obj)).findViewById(0x7f0d00b1);
        zipCodeEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CartBillingView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    handleDone();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        nameOnCardText = (EditText)((View) (obj)).findViewById(0x7f0d00ac);
        nameText = (EditText)((View) (obj)).findViewById(0x7f0d00b9);
        streetAddressText = (EditText)((View) (obj)).findViewById(0x7f0d00bc);
        aptSuiteText = (EditText)((View) (obj)).findViewById(0x7f0d00bd);
        cityText = (EditText)((View) (obj)).findViewById(0x7f0d00c1);
        stateProvinceText = (EditText)((View) (obj)).findViewById(0x7f0d00c0);
        zipPostalText = (EditText)((View) (obj)).findViewById(0x7f0d00c2);
        phoneText = (EditText)((View) (obj)).findViewById(0x7f0d00c3);
        countrySpinner = (Spinner)((View) (obj)).findViewById(0x7f0d00be);
        stateSpinner = (Spinner)((View) (obj)).findViewById(0x7f0d00bf);
        cpfText = (EditText)((View) (obj)).findViewById(0x7f0d00ba);
        emailText = (EditText)((View) (obj)).findViewById(0x7f0d00bb);
        obj1 = new ArrayAdapter(cartManager.getActivity(), 0x7f030029, countryNames);
        ((ArrayAdapter) (obj1)).setDropDownViewResource(0x1090009);
        countrySpinner.setAdapter(((android.widget.SpinnerAdapter) (obj1)));
        fullAddressArea = ((View) (obj)).findViewById(0x7f0d00b5);
        zipCodeArea = ((View) (obj)).findViewById(0x7f0d00b0);
        if (!requiresFullBillingAddress()) goto _L2; else goto _L1
_L1:
        setupBillingAddressLayout(((View) (obj)));
_L4:
        countrySpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final CartBillingView this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                handleCountrySelected(i);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        boletoNameText = (EditText)((View) (obj)).findViewById(0x7f0d00cc);
        if (cartManager.getShippingInfo() != null && cartManager.getShippingInfo().getName() != null)
        {
            boletoNameText.setText(cartManager.getShippingInfo().getName());
        }
        boletoIdentityNumberText = (EditText)((View) (obj)).findViewById(0x7f0d00cd);
        boletoEmailText = (EditText)((View) (obj)).findViewById(0x7f0d00ce);
        if (LoggedInUser.getInstance().getCurrentUser() != null && LoggedInUser.getInstance().getCurrentUser().getEmail() != null)
        {
            boletoEmailText.setText(LoggedInUser.getInstance().getCurrentUser().getEmail());
        }
        boletoEmailText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CartBillingView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    handleDone();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        oxxoNameText = (EditText)((View) (obj)).findViewById(0x7f0d00d0);
        if (cartManager.getShippingInfo() != null && cartManager.getShippingInfo().getName() != null)
        {
            oxxoNameText.setText(cartManager.getShippingInfo().getName());
        }
        oxxoEmailText = (EditText)((View) (obj)).findViewById(0x7f0d00d1);
        if (LoggedInUser.getInstance().getCurrentUser() != null && LoggedInUser.getInstance().getCurrentUser().getEmail() != null)
        {
            oxxoEmailText.setText(LoggedInUser.getInstance().getCurrentUser().getEmail());
        }
        oxxoEmailText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CartBillingView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    handleDone();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        googleWalletDefaultText = ((View) (obj)).findViewById(0x7f0d00c5);
        googleWalletDefaultButton = ((View) (obj)).findViewById(0x7f0d00c6);
        googleWalletDefaultButton.setOnClickListener(new android.view.View.OnClickListener() );
        googleWalletContainer = ((View) (obj)).findViewById(0x7f0d00c7);
        googleWalletContainer.setOnClickListener(new android.view.View.OnClickListener() );
        googleWalletEmailTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d00c8);
        googleWalletDetailsTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d00c9);
        showPaymentTabs();
        return;
_L2:
        fullAddressArea.setVisibility(8);
        zipCodeArea.setVisibility(0);
        if (cartManager.getCart().getPaymentProcessor() != com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Adyen)
        {
            nameOnCardText.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void onBokuTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        handleBokuAutoNext();
    }

    private void onBoletoTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        showBoletoTab();
    }

    private void onCreditCardTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        showCreditCardTab();
    }

    private void onGoogleWalletTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        showGoogleWalletTab();
    }

    private void onOxxoTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        showOxxoTab();
    }

    private boolean populateBoletoParameters(Bundle bundle)
    {
        ArrayList arraylist = new ArrayList();
        if (StringUtil.extractEditTextValue(boletoNameText) == null)
        {
            arraylist.add("name");
        } else
        {
            bundle.putString("ParamName", StringUtil.extractEditTextValue(boletoNameText));
        }
        if (StringUtil.extractEditTextValue(boletoIdentityNumberText) == null)
        {
            arraylist.add("identity_number");
        } else
        {
            bundle.putString("ParamIdentityNumber", StringUtil.extractEditTextValue(boletoIdentityNumberText));
        }
        if (StringUtil.extractEditTextValue(boletoEmailText) == null)
        {
            arraylist.add("email");
        } else
        {
            bundle.putString("ParamEmail", StringUtil.extractEditTextValue(boletoEmailText));
        }
        if (arraylist.size() > 0)
        {
            bundle = new HashMap();
            bundle.put("affected_fields", StringUtil.joinList(arraylist, ",", false));
            CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.UPDATE_BOLETO_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.MISSING_FIELDS, bundle);
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_BOLETO_FAILURE);
            cartManager.showErrorMessage(cartManager.getActivity().getString(0x7f060377));
            return false;
        } else
        {
            return true;
        }
    }

    private boolean populateCreditCardParameters(Bundle bundle)
    {
        ArrayList arraylist = new ArrayList();
        if (!creditCardForm.isValid())
        {
            arraylist.add("credit_card_number");
        }
        if (!creditCardForm.isValid())
        {
            arraylist.add("credit_card_expiry");
        }
        if (!securityCodeEditText.isValid())
        {
            arraylist.add("credit_card_cvv");
        }
        if (arraylist.size() > 0)
        {
            bundle = new HashMap();
            bundle.put("affected_fields", StringUtil.joinList(arraylist, ",", false));
            CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.INVALID_FIELD_DATA, bundle);
            trackCreditCardErrorInput();
            cartManager.showErrorMessage(cartManager.getActivity().getString(0x7f060106));
            return false;
        }
        bundle.putString("ParamCreditCardNumber", creditCardForm.getText().toString());
        bundle.putString("ParamCreditCardExpiry", expiryDateEditText.getText().toString());
        bundle.putString("ParamCreditCardCvv", securityCodeEditText.getText().toString());
        bundle = populateCreditCardAddressParameters(bundle);
        if (bundle.size() > 0)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("affected_fields", StringUtil.joinList(bundle, ",", false));
            CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.MISSING_FIELDS, hashmap);
            trackCreditCardErrorInput();
            cartManager.showErrorMessage(cartManager.getActivity().getString(0x7f060377));
            return false;
        } else
        {
            return true;
        }
    }

    private boolean populateOxxoParameters(Bundle bundle)
    {
        ArrayList arraylist = new ArrayList();
        if (StringUtil.extractEditTextValue(oxxoNameText) == null)
        {
            arraylist.add("name");
        } else
        {
            bundle.putString("ParamName", StringUtil.extractEditTextValue(oxxoNameText));
        }
        if (StringUtil.extractEditTextValue(oxxoEmailText) == null)
        {
            arraylist.add("email");
        } else
        {
            bundle.putString("ParamEmail", StringUtil.extractEditTextValue(oxxoEmailText));
        }
        if (arraylist.size() > 0)
        {
            bundle = new HashMap();
            bundle.put("affected_fields", StringUtil.joinList(arraylist, ",", false));
            CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.UPDATE_OXXO_BILLING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.MISSING_FIELDS, bundle);
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_OXXO_FAILURE);
            cartManager.showErrorMessage(cartManager.getActivity().getString(0x7f060377));
            return false;
        } else
        {
            return true;
        }
    }

    private void refreshGoogleWalletView()
    {
        if (cartManager.getGoogleWalletMaskedWallet() != null)
        {
            getBottomNextButton().setVisibility(0);
            googleWalletDefaultText.setVisibility(8);
            googleWalletDefaultButton.setVisibility(8);
            googleWalletContainer.setVisibility(0);
            googleWalletEmailTextView.setText(cartManager.getGoogleWalletMaskedWallet().getEmail());
            StringBuilder stringbuilder = new StringBuilder();
            String as[] = cartManager.getGoogleWalletMaskedWallet().getPaymentDescriptions();
            stringbuilder.append(as[0]);
            for (int i = 1; i < as.length; i++)
            {
                stringbuilder.append("\n");
                stringbuilder.append(as[i]);
            }

            googleWalletDetailsTextView.setText(stringbuilder.toString());
            return;
        } else
        {
            getBottomNextButton().setVisibility(8);
            googleWalletContainer.setVisibility(8);
            googleWalletDefaultText.setVisibility(0);
            googleWalletDefaultButton.setVisibility(0);
            return;
        }
    }

    private void resetSelectedViews()
    {
        hideKeyboard();
        trustedCheckoutView.setVisibility(8);
        creditCardView.setVisibility(8);
        googleWalletView.setVisibility(8);
        paypalView.setVisibility(8);
        boletoView.setVisibility(8);
        oxxoView.setVisibility(8);
    }

    private void setAddressCheckbox()
    {
        shippingCheckmark.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() );
    }

    private void showBoletoTab()
    {
        resetSelectedViews();
        boletoView.setVisibility(0);
        getBottomNextButton().setVisibility(0);
        tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.BOLETO, true);
    }

    private void showGoogleWalletTab()
    {
        resetSelectedViews();
        refreshGoogleWalletView();
        googleWalletView.setVisibility(0);
        tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET, true);
    }

    private void showOxxoTab()
    {
        resetSelectedViews();
        oxxoView.setVisibility(0);
        getBottomNextButton().setVisibility(0);
        tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.OXXO, true);
    }

    public void cleanup()
    {
    }

    protected void clearBillingAddress()
    {
        nameText.setText("");
        streetAddressText.setText("");
        aptSuiteText.setText("");
        cityText.setText("");
        countrySpinner.setSelection(0);
        handleCountrySelected(0);
        stateProvinceText.setText("");
        stateSpinner.setSelection(0);
        zipPostalText.setText("");
        phoneText.setText("");
    }

    protected View getBottomNextButton()
    {
        return floatingBottomNextButtonLayout;
    }

    protected String getNextButtonText()
    {
        if (fromStepper)
        {
            return getResources().getString(0x7f0602d3);
        } else
        {
            return getResources().getString(0x7f060393);
        }
    }

    public WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_BILLING;
    }

    protected void handleDone()
    {
        CartPaymentVaultProcessor cartpaymentvaultprocessor;
        Bundle bundle;
        hideKeyboard();
        cartpaymentvaultprocessor = tabHeaderView.getVaultProcessor(cartManager);
        bundle = new Bundle();
        if (!tabHeaderView.isSectionSelected(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD)) goto _L2; else goto _L1
_L1:
        trackCreditCardNextButton();
        if (populateCreditCardParameters(bundle)) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (!tabHeaderView.isSectionSelected(CartBaseBillingHeader.CartBillingSection.BOLETO))
        {
            break; /* Loop/switch isn't completed */
        }
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_BOLETO);
        if (!populateBoletoParameters(bundle))
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (cartpaymentvaultprocessor != null)
        {
            cartpaymentvaultprocessor.save(new com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor.SaveListener() , bundle);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (tabHeaderView.isSectionSelected(CartBaseBillingHeader.CartBillingSection.OXXO))
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_OXXO);
            if (!populateOxxoParameters(bundle))
            {
                return;
            }
        } else
        if (tabHeaderView.isSectionSelected(CartBaseBillingHeader.CartBillingSection.PAYPAL) || !tabHeaderView.isSectionSelected(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET));
          goto _L4
        if (true) goto _L3; else goto _L6
_L6:
    }

    public boolean onBackPressed()
    {
        return cancel();
    }

    public void onCartDataUpdated()
    {
    }

    protected void onPaypalTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        handlePayPalAutoNext();
    }

    public void onSectionSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection, CartBaseBillingHeader.CartBillingSection cartbillingsection1)
    {
        switch (_cls17..SwitchMap.com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection[cartbillingsection.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            onCreditCardTabSelected(cartbillingsection1);
            return;

        case 2: // '\002'
            onGoogleWalletTabSelected(cartbillingsection1);
            return;

        case 3: // '\003'
            onBoletoTabSelected(cartbillingsection1);
            return;

        case 4: // '\004'
            onOxxoTabSelected(cartbillingsection1);
            return;

        case 5: // '\005'
            onPaypalTabSelected(cartbillingsection1);
            break;
        }
    }

    protected ArrayList populateCreditCardAddressParameters(Bundle bundle)
    {
        ArrayList arraylist = new ArrayList();
        if (fullAddressArea.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        if (StringUtil.extractEditTextValue(nameText) == null)
        {
            arraylist.add("name");
        } else
        {
            bundle.putString("ParamName", StringUtil.extractEditTextValue(nameText));
        }
        if (StringUtil.extractEditTextValue(streetAddressText) == null)
        {
            arraylist.add("address_line_1");
        } else
        {
            bundle.putString("paramAddressLineOne", StringUtil.extractEditTextValue(streetAddressText));
        }
        if (StringUtil.extractEditTextValue(aptSuiteText) != null)
        {
            bundle.putString("paramAddressLineTwo", StringUtil.extractEditTextValue(aptSuiteText));
        }
        if (StringUtil.extractEditTextValue(cityText) == null)
        {
            arraylist.add("city");
        } else
        {
            bundle.putString("paramCity", StringUtil.extractEditTextValue(cityText));
        }
        if (StringUtil.extractEditTextValue(zipPostalText) == null)
        {
            arraylist.add("zip");
        } else
        {
            bundle.putString("paramZip", StringUtil.extractEditTextValue(zipPostalText));
        }
        if (StringUtil.extractEditTextValue(phoneText) == null)
        {
            arraylist.add("phone_number");
        } else
        {
            bundle.putString("ParamPhone", StringUtil.extractEditTextValue(phoneText));
        }
        if (stateSpinner.getVisibility() == 0)
        {
            if (stateSpinner.getSelectedItemPosition() == 0)
            {
                arraylist.add("state");
            } else
            {
                bundle.putString("ParamState", (String)currentStates.get(Math.max(0, stateSpinner.getSelectedItemPosition())));
            }
        } else
        if (StringUtil.extractEditTextValue(stateProvinceText) != null)
        {
            bundle.putString("ParamState", StringUtil.extractEditTextValue(stateProvinceText));
        }
        bundle.putString("paramCountry", (String)countryCodes.get(Math.max(0, countrySpinner.getSelectedItemPosition())));
        if (cpfText.getVisibility() == 0)
        {
            if (StringUtil.extractEditTextValue(cpfText) == null)
            {
                arraylist.add("cpf");
            } else
            {
                bundle.putString("ParamIdentityNumber", StringUtil.extractEditTextValue(cpfText));
            }
        }
        if (emailText.getVisibility() != 0) goto _L4; else goto _L3
_L3:
        if (StringUtil.extractEditTextValue(emailText) != null) goto _L6; else goto _L5
_L5:
        arraylist.add("email");
_L4:
        return arraylist;
_L6:
        bundle.putString("ParamEmail", StringUtil.extractEditTextValue(emailText));
        return arraylist;
_L2:
        if (StringUtil.extractEditTextValue(zipCodeEditText) == null)
        {
            arraylist.add("zip");
        } else
        {
            bundle.putString("paramZip", StringUtil.extractEditTextValue(zipCodeEditText));
        }
        if (nameOnCardText.getVisibility() == 0)
        {
            if (StringUtil.extractEditTextValue(nameOnCardText) == null)
            {
                arraylist.add("name");
                return arraylist;
            } else
            {
                bundle.putString("ParamName", StringUtil.extractEditTextValue(nameOnCardText));
                return arraylist;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    protected void prefillBillingAddress()
    {
        WishShippingInfo wishshippinginfo = cartManager.getShippingInfo();
        if (wishshippinginfo != null)
        {
            if (wishshippinginfo.getName() != null)
            {
                nameText.setText(wishshippinginfo.getName());
            }
            if (wishshippinginfo.getStreetAddressLineOne() != null)
            {
                streetAddressText.setText(wishshippinginfo.getStreetAddressLineOne());
            }
            if (wishshippinginfo.getStreetAddressLineTwo() != null)
            {
                aptSuiteText.setText(wishshippinginfo.getStreetAddressLineTwo());
            } else
            {
                aptSuiteText.setText("");
            }
            if (wishshippinginfo.getCity() != null)
            {
                cityText.setText(wishshippinginfo.getCity());
            }
            if (wishshippinginfo.getCountryCode() != null)
            {
                int i = Math.max(0, countryCodes.indexOf(wishshippinginfo.getCountryCode()));
                countrySpinner.setSelection(i);
                handleCountrySelected(i);
            }
            if (wishshippinginfo.getState() != null)
            {
                stateProvinceText.setText(wishshippinginfo.getState());
                if (stateSpinner.getVisibility() == 0 && currentStates != null)
                {
                    int j = currentStates.indexOf(wishshippinginfo.getState());
                    stateSpinner.setSelection(j);
                }
            }
            if (wishshippinginfo.getZipCode() != null)
            {
                zipPostalText.setText(wishshippinginfo.getZipCode());
            }
            if (wishshippinginfo.getPhoneNumber() != null)
            {
                phoneText.setText(wishshippinginfo.getPhoneNumber());
                return;
            }
        }
    }

    protected boolean requiresFullBillingAddress()
    {
        return cartManager.getCart().getRequiresFullBillingAddress();
    }

    protected void setHeaderViews(View view)
    {
        cancelButton.setText(getContext().getString(0x7f0600bc).toLowerCase());
        cancelButton.setPaintFlags(cancelButton.getPaintFlags() | 8);
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingView this$0;

            public void onClick(View view1)
            {
                cancel();
            }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
        });
        getBottomNextButton().setVisibility(0);
    }

    protected void setupBillingAddressLayout(View view)
    {
        fullAddressArea.setVisibility(0);
        nameOnCardText.setVisibility(8);
        zipCodeArea.setVisibility(8);
        if (cartManager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Ebanx)
        {
            cpfText.setVisibility(0);
            emailText.setVisibility(0);
            if (LoggedInUser.getInstance().getCurrentUser() != null && LoggedInUser.getInstance().getCurrentUser().getEmail() != null)
            {
                emailText.setText(LoggedInUser.getInstance().getCurrentUser().getEmail());
            }
        } else
        {
            cpfText.setVisibility(8);
            emailText.setVisibility(8);
        }
        shippingCheckmarkLayout = view.findViewById(0x7f0d00b6);
        if (cartManager.getShippingInfo() != null)
        {
            shippingCheckmarkLayout.setVisibility(0);
            shippingCheckmark = (CheckBox)view.findViewById(0x7f0d00b7);
            shippingCheckmarkText = (TextView)view.findViewById(0x7f0d00b8);
            shippingCheckmarkLayout.setOnClickListener(new android.view.View.OnClickListener() {

                final CartBillingView this$0;

                public void onClick(View view1)
                {
                    shippingCheckmark.toggle();
                }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
            });
            setAddressCheckbox();
        } else
        {
            shippingCheckmarkLayout.setVisibility(8);
        }
        if (LoggedInUser.getInstance().getCurrentUser() != null)
        {
            view = LoggedInUser.getInstance().getCurrentUser().getCountryCode();
            if (view != null)
            {
                int i = Math.max(0, countryCodes.indexOf(view.toUpperCase()));
                countrySpinner.setSelection(i);
                handleCountrySelected(i);
            }
        }
    }

    protected void showCreditCardTab()
    {
        resetSelectedViews();
        creditCardView.setVisibility(0);
        trustedCheckoutView.setVisibility(0);
        getBottomNextButton().setVisibility(0);
        tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD, true);
    }

    protected void showPayPalTab()
    {
        resetSelectedViews();
        paypalView.setVisibility(0);
        getBottomNextButton().setVisibility(0);
        tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.PAYPAL, true);
    }

    protected void showPaymentTabs()
    {
        if (CartExperimentManager.canCheckoutWithCreditCard(cartManager))
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD, true);
        } else
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD, false);
        }
        if (CartExperimentManager.canCheckoutWithGoogleWallet(cartManager))
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET, true);
        } else
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET, false);
        }
        if (CartExperimentManager.canCheckoutWithPayPal(cartManager))
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.PAYPAL, true);
        } else
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.PAYPAL, false);
        }
        if (CartExperimentManager.canCheckoutWithBoleto(cartManager))
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.BOLETO, true);
        } else
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.BOLETO, false);
        }
        if (CartExperimentManager.canCheckoutWithOxxo(cartManager))
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.OXXO, true);
        } else
        {
            tabHeaderView.setSectionVisible(CartBaseBillingHeader.CartBillingSection.OXXO, false);
        }
        if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET) && cartManager.getGoogleWalletMaskedWallet() != null)
        {
            tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET);
        } else
        {
            if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET) && CartExperimentManager.defaultsToGoogleWallet(cartManager))
            {
                showGoogleWalletTab();
                return;
            }
            if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD))
            {
                tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD);
                return;
            }
            if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.PAYPAL))
            {
                showPayPalTab();
                return;
            }
            if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.BOLETO))
            {
                tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.BOLETO);
                return;
            }
            if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.OXXO))
            {
                tabHeaderView.selectSection(CartBaseBillingHeader.CartBillingSection.OXXO);
                return;
            }
            if (tabHeaderView.isSectionVisible(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET))
            {
                showGoogleWalletTab();
                return;
            }
        }
    }

    protected void trackCreditCardErrorInput()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
    }

    protected void trackCreditCardNextButton()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC);
    }





















    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/CartBillingView$10$1

/* anonymous class */
    class _cls1
        implements com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper.ChangeListener
    {

        final _cls10 this$1;

        public void onChangeCancelled()
        {
        }

        public void onChangeComplete()
        {
            refreshGoogleWalletView();
        }

        public void onChangeFailed()
        {
        }

            
            {
                this$1 = _cls10.this;
                super();
            }
    }


    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/CartBillingView$9$1

/* anonymous class */
}
