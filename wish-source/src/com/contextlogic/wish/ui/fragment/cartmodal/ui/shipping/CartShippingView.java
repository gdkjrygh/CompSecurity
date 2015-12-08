// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCreditCardInfo;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.UpdateShippingInfoService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.AddressUtil;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CartShippingView extends CartUiView
{

    private EditText aptSuiteText;
    private CheckBox billingCheckmark;
    private View billingCheckmarkLayout;
    protected CartDataEntryCallback callback;
    private TextView cancelButton;
    private EditText cityText;
    private ArrayList countryCodes;
    private ArrayList countryNames;
    private Spinner countrySpinner;
    private String currentCountryCode;
    private ArrayList currentStates;
    protected TextView floatingBottomNextButton;
    protected View floatingBottomNextButtonLayout;
    private boolean fromStepper;
    private EditText nameText;
    private EditText phoneText;
    private View shippingWarningContainer;
    private ImageView shippingWarningImage;
    private TextView shippingWarningText;
    private EditText stateProvinceText;
    private Spinner stateSpinner;
    private EditText streetAddressText;
    private UpdateShippingInfoService updateShippingInfoService;
    private EditText zipPostalText;

    public CartShippingView(CartManager cartmanager, CartDataEntryCallback cartdataentrycallback, boolean flag)
    {
        super(cartmanager);
        callback = cartdataentrycallback;
        fromStepper = flag;
        updateShippingInfoService = new UpdateShippingInfoService();
        init();
    }

    private boolean cancel()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
        alertdialog.setTitle(getContext().getString(0x7f060073));
        alertdialog.setMessage(getContext().getString(0x7f06012d));
        alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final CartShippingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                hideKeyboard();
                callback.onCancel();
            }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
        });
        alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final CartShippingView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
        });
        alertdialog.show();
        return true;
    }

    private void handleCountrySelected(int i)
    {
        String s1 = (String)countryCodes.get(i);
        if (currentCountryCode != null && s1.equals(currentCountryCode))
        {
            return;
        }
        currentCountryCode = s1;
        String s = null;
        if (UserStatusManager.getInstance().getShippingWarningMessages() != null)
        {
            s = (String)UserStatusManager.getInstance().getShippingWarningMessages().get(currentCountryCode);
        }
        if (s != null)
        {
            shippingWarningText.setText(s);
            shippingWarningContainer.setVisibility(0);
        } else
        {
            shippingWarningContainer.setVisibility(8);
        }
        if (AddressUtil.getStateMapping() != null && AddressUtil.getStates(s1) != null)
        {
            stateProvinceText.setVisibility(8);
            stateSpinner.setVisibility(0);
            stateProvinceText.setText("");
            currentStates = new ArrayList(AddressUtil.getStates(s1));
            s1 = AddressUtil.getSubdivisionNameForCountry(s1);
            Object obj = s1;
            if (s1 == null)
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

    private void init()
    {
        WishShippingInfo wishshippinginfo = null;
        Object obj = AddressUtil.getCountries();
        countryNames = new ArrayList();
        countryCodes = new ArrayList();
        java.util.Map.Entry entry;
        for (obj = ((HashMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); countryCodes.add(entry.getKey()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            countryNames.add(entry.getValue());
        }

        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030028, this);
        floatingBottomNextButtonLayout = view.findViewById(0x7f0d011b);
        floatingBottomNextButton = (TextView)view.findViewById(0x7f0d0134);
        floatingBottomNextButton.setText(getNextButtonText());
        floatingBottomNextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartShippingView this$0;

            public void onClick(View view1)
            {
                handleDone();
            }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
        });
        shippingWarningImage = (ImageView)view.findViewById(0x7f0d0130);
        BitmapUtil.safeSetImageResource(shippingWarningImage, 0x7f020131);
        shippingWarningContainer = view.findViewById(0x7f0d012f);
        shippingWarningText = (TextView)view.findViewById(0x7f0d0131);
        cancelButton = (TextView)view.findViewById(0x7f0d011d);
        setupHeaderViews(view);
        billingCheckmarkLayout = view.findViewById(0x7f0d011e);
        obj = cartManager.getUserBillingInfo();
        if (obj != null)
        {
            obj = ((WishUserBillingInfo) (obj)).getCreditCardInfo(cartManager.getCart().getPaymentProcessor());
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            wishshippinginfo = ((WishCreditCardInfo) (obj)).getBillingAddress();
        }
        if (cartManager.getCart().getRequiresFullBillingAddress() && wishshippinginfo != null)
        {
            billingCheckmarkLayout.setVisibility(0);
            billingCheckmark = (CheckBox)view.findViewById(0x7f0d011f);
            billingCheckmarkLayout.setOnClickListener(new android.view.View.OnClickListener() {

                final CartShippingView this$0;

                public void onClick(View view1)
                {
                    billingCheckmark.toggle();
                }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
            });
            billingCheckmark.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() );
        } else
        {
            billingCheckmarkLayout.setVisibility(8);
        }
        nameText = (EditText)view.findViewById(0x7f0d0128);
        streetAddressText = (EditText)view.findViewById(0x7f0d0129);
        aptSuiteText = (EditText)view.findViewById(0x7f0d012a);
        cityText = (EditText)view.findViewById(0x7f0d012e);
        stateProvinceText = (EditText)view.findViewById(0x7f0d012d);
        zipPostalText = (EditText)view.findViewById(0x7f0d0132);
        countrySpinner = (Spinner)view.findViewById(0x7f0d012b);
        stateSpinner = (Spinner)view.findViewById(0x7f0d012c);
        phoneText = (EditText)view.findViewById(0x7f0d0133);
        phoneText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CartShippingView this$0;

            public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                if (j == 6)
                {
                    hideKeyboard();
                    handleDone();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
        });
        obj = new ArrayAdapter(cartManager.getActivity(), 0x7f030029, countryNames);
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        countrySpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        if (cartManager.getShippingInfo() == null) goto _L2; else goto _L1
_L1:
        prefillShippingAddress(cartManager.getShippingInfo());
_L4:
        countrySpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final CartShippingView this$0;

            public void onItemSelected(AdapterView adapterview, View view1, int j, long l)
            {
                handleCountrySelected(j);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
        });
        return;
_L2:
        if (LoggedInUser.getInstance().getCurrentUser() != null)
        {
            String s = LoggedInUser.getInstance().getCurrentUser().getCountryCode();
            if (s != null)
            {
                int i = Math.max(0, countryCodes.indexOf(s.toUpperCase()));
                countrySpinner.setSelection(i);
                handleCountrySelected(i);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void prefillShippingAddress(WishShippingInfo wishshippinginfo)
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
        }
    }

    public void cleanup()
    {
        updateShippingInfoService.cancelAllRequests();
    }

    protected View getBottomNextButton()
    {
        return floatingBottomNextButtonLayout;
    }

    protected String getNextButtonText()
    {
        if (fromStepper)
        {
            return getResources().getString(0x7f060130);
        } else
        {
            return getResources().getString(0x7f060395);
        }
    }

    protected WishAnalyticsEvent getWishAnalyticsEventForError()
    {
        return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_SHIPPING_NEXT_FAILURE;
    }

    protected WishAnalyticsEvent getWishAnalyticsEventForNextButton()
    {
        return WishAnalyticsEvent.CLICK_MOBILE_NATIVE_SHIPPING_NEXT;
    }

    public WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_SHIPPING;
    }

    protected void handleDone()
    {
        hideKeyboard();
        trackEvent(getWishAnalyticsEventForNextButton());
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Object obj = null;
        String s4 = null;
        String s5 = null;
        ArrayList arraylist = new ArrayList();
        String s6;
        if (StringUtil.extractEditTextValue(nameText) == null)
        {
            arraylist.add("name");
        } else
        {
            s = StringUtil.extractEditTextValue(nameText);
        }
        if (StringUtil.extractEditTextValue(streetAddressText) == null)
        {
            arraylist.add("address_line_1");
        } else
        {
            s1 = StringUtil.extractEditTextValue(streetAddressText);
        }
        if (StringUtil.extractEditTextValue(aptSuiteText) != null)
        {
            s2 = StringUtil.extractEditTextValue(aptSuiteText);
        }
        if (StringUtil.extractEditTextValue(cityText) == null)
        {
            arraylist.add("city");
        } else
        {
            s3 = StringUtil.extractEditTextValue(cityText);
        }
        if (StringUtil.extractEditTextValue(zipPostalText) == null)
        {
            arraylist.add("zip");
        } else
        {
            s4 = StringUtil.extractEditTextValue(zipPostalText);
        }
        if (StringUtil.extractEditTextValue(phoneText) == null)
        {
            arraylist.add("phone_number");
        } else
        {
            s5 = StringUtil.extractEditTextValue(phoneText);
        }
        if (stateSpinner.getVisibility() == 0)
        {
            if (stateSpinner.getSelectedItemPosition() == 0)
            {
                arraylist.add("state");
            } else
            {
                obj = (String)currentStates.get(Math.max(0, stateSpinner.getSelectedItemPosition()));
            }
        } else
        if (StringUtil.extractEditTextValue(stateProvinceText) != null)
        {
            obj = StringUtil.extractEditTextValue(stateProvinceText);
        }
        s6 = (String)countryCodes.get(Math.max(0, countrySpinner.getSelectedItemPosition()));
        if (arraylist.size() > 0)
        {
            obj = new HashMap();
            ((HashMap) (obj)).put("affected_fields", StringUtil.joinList(arraylist, ",", false));
            CommerceLogger.logError(com.contextlogic.wish.analytics.CommerceLogger.Action.NATIVE_SAVE_SHIPPING_INFO, com.contextlogic.wish.analytics.CommerceLogger.Result.MISSING_FIELDS, ((HashMap) (obj)));
            trackEvent(getWishAnalyticsEventForError());
            cartManager.showErrorMessage(getContext().getString(0x7f060377));
            return;
        } else
        {
            cartManager.showLoadingSpinner();
            updateShippingInfoService.requestService(s, s1, s2, s3, ((String) (obj)), s4, s6, s5, null, null, new com.contextlogic.wish.api.service.UpdateShippingInfoService.SuccessCallback() , new com.contextlogic.wish.api.service.UpdateShippingInfoService.FailureCallback() );
            return;
        }
    }

    public boolean onBackPressed()
    {
        return cancel();
    }

    public void onCartDataUpdated()
    {
    }

    protected void setupHeaderViews(View view)
    {
        cancelButton.setText(getContext().getString(0x7f0600bc).toLowerCase());
        cancelButton.setPaintFlags(cancelButton.getPaintFlags() | 8);
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartShippingView this$0;

            public void onClick(View view1)
            {
                cancel();
            }

            
            {
                this$0 = CartShippingView.this;
                super();
            }
        });
        getBottomNextButton().setVisibility(0);
    }















}
