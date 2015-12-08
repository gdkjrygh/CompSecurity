// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
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
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.commons.ups.ui.signup.social.SocialSingUpFieldsValidator;
import com.weather.commons.validation.FieldValidationException;
import com.weather.dal2.ups.Demographics;
import com.weather.dal2.ups.UserDetails;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountCreator

public class SocialSignUpFragment extends Fragment
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final String ACCOUNT = "account";
    private static final String EMAIL = "email_key";
    private static final String FIRST_NAME = "first_name";
    private static final String LAST_NAME = "last_name";
    private CheckBox acceptedTermsOfUseField;
    private DsxAccount dsxAccount;
    private EditText emailAddressField;
    private View fragmentView;
    private EditText fullNameField;
    private Button signUpButton;
    private SocialSingUpFieldsValidator socialSingUpFieldsValidator;
    private TextView termsOfUseText;

    public SocialSignUpFragment()
    {
    }

    private void findViews()
    {
        fullNameField = (EditText)fragmentView.findViewById(com.weather.commons.R.id.ups_username);
        emailAddressField = (EditText)fragmentView.findViewById(com.weather.commons.R.id.ups_email);
        acceptedTermsOfUseField = (CheckBox)fragmentView.findViewById(com.weather.commons.R.id.ups_terms);
        signUpButton = (Button)fragmentView.findViewById(com.weather.commons.R.id.ups_sign_up_button);
        termsOfUseText = (TextView)fragmentView.findViewById(com.weather.commons.R.id.ups_terms_text);
    }

    public static void newInstance(FragmentManager fragmentmanager, DsxAccount dsxaccount, UserDetails userdetails)
    {
        Bundle bundle = new Bundle();
        bundle.putString("first_name", userdetails.getFirstName());
        bundle.putString("last_name", userdetails.getLastName());
        bundle.putString("email_key", userdetails.getEmail());
        if (dsxaccount != null)
        {
            bundle.putSerializable("account", dsxaccount);
        }
        dsxaccount = new SocialSignUpFragment();
        dsxaccount.setArguments(bundle);
        fragmentmanager.beginTransaction().replace(0x1020002, dsxaccount).addToBackStack(dsxaccount.getClass().getName()).commitAllowingStateLoss();
    }

    private void recreateState(Bundle bundle)
    {
        bundle = getArguments().getString("first_name");
        String s = getArguments().getString("last_name");
        String s1 = getArguments().getString("email_key");
        dsxAccount = (DsxAccount)getArguments().get("account");
        fullNameField.setText((new StringBuilder()).append(bundle).append(' ').append(s).toString());
        emailAddressField.setText(s1);
        acceptedTermsOfUseField.setChecked(false);
    }

    private void setViewEventListeners()
    {
        signUpButton.setOnClickListener(this);
        acceptedTermsOfUseField.setOnCheckedChangeListener(this);
    }

    private void setViewsInitialState()
    {
        signUpButton.setEnabled(false);
        termsOfUseText.setMovementMethod(LinkMovementMethod.getInstance());
        termsOfUseText.setClickable(true);
    }

    private void singUp()
    {
        Object obj1 = fullNameField.getText().toString().trim();
        Object obj = obj1;
        String s = "";
        obj1 = Pattern.compile("^\\s*([\\S]*)\\s+(.*)$").matcher(((CharSequence) (obj1)));
        if (((Matcher) (obj1)).matches())
        {
            obj = ((Matcher) (obj1)).group(1);
            s = ((Matcher) (obj1)).group(2);
        }
        String s1 = emailAddressField.getText().toString();
        obj1 = new Demographics();
        ((Demographics) (obj1)).setFirstName(((String) (obj)));
        ((Demographics) (obj1)).setLastName(s);
        ((Demographics) (obj1)).setTwcAccountEmail(s1);
        obj = new ProgressDialog(getActivity());
        (new AccountCreator(getActivity(), ((ProgressDialog) (obj)), dsxAccount, ((Demographics) (obj1)))).linkDsxAccount();
    }

    private void tryToSingUp()
    {
        validateFields();
        if (socialSingUpFieldsValidator.allFieldsAreValid())
        {
            singUp();
        }
    }

    private void validateFields()
    {
        socialSingUpFieldsValidator = new SocialSingUpFieldsValidator();
        try
        {
            socialSingUpFieldsValidator.setAcceptedTermsOfUseField(acceptedTermsOfUseField).setFullNameField(fullNameField).setEmailAddressField(emailAddressField).validate();
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
        tryToSingUp();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (viewgroup == null)
        {
            return null;
        } else
        {
            super.onCreateView(layoutinflater, viewgroup, bundle);
            fragmentView = layoutinflater.inflate(com.weather.commons.R.layout.social_sign_up_fragment, viewgroup, false);
            findViews();
            setViewsInitialState();
            recreateState(bundle);
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
            actionbar.setTitle(getString(com.weather.commons.R.string.ups_profile_completion_page_title));
        }
    }
}
