// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.weather.Weather.ups.ui.signup.SignUpFieldsValidator;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSummaryRecorder;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.commons.ups.ui.AccountCreator;
import com.weather.commons.ups.ui.SignUpActions;
import com.weather.commons.validation.FieldValidationException;
import com.weather.dal2.ups.Demographics;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.Weather.ups.ui:
//            LoginActivity

public class SignUpFragment extends Fragment
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private CheckBox acceptedTermsOfUseField;
    private View amazonSignUpButton;
    private EditText emailAddressField;
    private View facebookSignUpButton;
    private View fragmentView;
    private View googlePlusSignUpButton;
    private TextView loginLink;
    private EditText passwordField;
    private SignUpActions signUpActions;
    private Button signUpButton;
    private SignUpFieldsValidator signUpFieldsValidator;
    private TextView termsOfUseText;

    public SignUpFragment()
    {
    }

    private void alterNativeLogin(View view)
    {
        if (signUpActions == null)
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131559190: 
            signUpActions.signUpWithFacebook();
            return;

        case 2131559192: 
            signUpActions.signUpWithAmazon();
            return;

        case 2131559191: 
            signUpActions.signUpWithGooglePlus();
            return;
        }
    }

    private void dispatchLogInActivity()
    {
        getActivity().startActivity(new Intent(getActivity(), com/weather/Weather/ups/ui/LoginActivity));
        getActivity().finish();
    }

    private void findViews()
    {
        emailAddressField = (EditText)fragmentView.findViewById(0x7f0d027e);
        passwordField = (EditText)fragmentView.findViewById(0x7f0d0315);
        acceptedTermsOfUseField = (CheckBox)fragmentView.findViewById(0x7f0d02b6);
        signUpButton = (Button)fragmentView.findViewById(0x7f0d027f);
        facebookSignUpButton = fragmentView.findViewById(0x7f0d0316);
        googlePlusSignUpButton = fragmentView.findViewById(0x7f0d0317);
        amazonSignUpButton = fragmentView.findViewById(0x7f0d0318);
        loginLink = (TextView)fragmentView.findViewById(0x7f0d02ba);
        termsOfUseText = (TextView)fragmentView.findViewById(0x7f0d02b7);
    }

    private void prepareForAmazonDevice()
    {
        boolean flag;
        if (!UIUtil.isAmazon(getActivity()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        } else
        {
            amazonSignUpButton.setVisibility(0);
            googlePlusSignUpButton.setVisibility(8);
            return;
        }
    }

    private void recreateState(Bundle bundle)
    {
        passwordField.setText("");
        emailAddressField.setText("");
        acceptedTermsOfUseField.setChecked(false);
    }

    private void setViewEventListeners()
    {
        facebookSignUpButton.setOnClickListener(this);
        amazonSignUpButton.setOnClickListener(this);
        googlePlusSignUpButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
        loginLink.setOnClickListener(this);
        acceptedTermsOfUseField.setOnCheckedChangeListener(this);
    }

    private void setViewsInitialState()
    {
        signUpButton.setEnabled(false);
        termsOfUseText.setMovementMethod(LinkMovementMethod.getInstance());
        termsOfUseText.setClickable(true);
    }

    private void signup()
    {
        Object obj = emailAddressField.getText().toString();
        DsxAccount dsxaccount = new DsxAccount(((String) (obj)), passwordField.getText().toString(), com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL);
        Demographics demographics = new Demographics();
        demographics.setUserName(((String) (obj)));
        demographics.setTwcAccountEmail(((String) (obj)));
        obj = new ProgressDialog(getActivity());
        (new AccountCreator(getActivity(), ((ProgressDialog) (obj)), dsxaccount, demographics)).linkDsxAccount();
    }

    private void tryToSingUp()
    {
        validateFields();
        if (signUpFieldsValidator.allFieldsAreValid())
        {
            signup();
        }
    }

    private void validateFields()
    {
        signUpFieldsValidator = new SignUpFieldsValidator();
        try
        {
            signUpFieldsValidator.setAcceptedTermsOfUseField(acceptedTermsOfUseField).setPasswordField(passwordField).setEmailAddressField(emailAddressField).validate();
            return;
        }
        catch (FieldValidationException fieldvalidationexception)
        {
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        signUpButton.setEnabled(flag);
    }

    public void onClick(View view)
    {
        LocalyticsHandler.getInstance().getUpsSignupSummaryRecorder().recordAttemptStarted();
        switch (view.getId())
        {
        default:
            return;

        case 2131559190: 
        case 2131559191: 
        case 2131559192: 
            alterNativeLogin(view);
            return;

        case 2131559039: 
            tryToSingUp();
            return;

        case 2131559098: 
            dispatchLogInActivity();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (viewgroup == null)
        {
            return null;
        } else
        {
            super.onCreateView(layoutinflater, viewgroup, bundle);
            fragmentView = layoutinflater.inflate(0x7f0300ba, viewgroup, false);
            findViews();
            setViewsInitialState();
            recreateState(bundle);
            prepareForAmazonDevice();
            setViewEventListeners();
            return fragmentView;
        }
    }

    public void onStart()
    {
        super.onStart();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(0x7f070319);
        }
    }

    public void setInterface(SignUpActions signupactions)
    {
        signUpActions = signupactions;
    }
}
