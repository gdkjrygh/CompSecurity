// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ups.ui.signup;

import android.widget.CheckBox;
import android.widget.EditText;
import com.weather.commons.validation.AcceptedTermsOfUseValidator;
import com.weather.commons.validation.EmailAddressValidator;
import com.weather.commons.validation.FieldValidationException;
import com.weather.commons.validation.PasswordValidator;
import com.weather.util.ObjectUtils;

public class SignUpFieldsValidator
{

    private CheckBox acceptedTermsOfUseField;
    private AcceptedTermsOfUseValidator acceptedTermsOfUseValidator;
    private EditText emailAddressField;
    private EmailAddressValidator emailAddressValidator;
    private boolean invalidFieldsFound;
    private EditText passwordField;
    private PasswordValidator passwordValidator;

    public SignUpFieldsValidator()
    {
        buildValidators();
        invalidFieldsFound = false;
    }

    private void buildValidators()
    {
        emailAddressValidator = new EmailAddressValidator();
        passwordValidator = new PasswordValidator();
        acceptedTermsOfUseValidator = new AcceptedTermsOfUseValidator();
    }

    private void checkForNullReferences()
    {
        if (ObjectUtils.isAnyNull(emailAddressField, new Object[] {
    passwordField, acceptedTermsOfUseField
}))
        {
            throw new IllegalStateException("email address, password o accepted terms of use field view is null.");
        } else
        {
            return;
        }
    }

    private void validateAcceptedTermsOfUse()
    {
        try
        {
            boolean flag = acceptedTermsOfUseField.isChecked();
            acceptedTermsOfUseValidator.validate(Boolean.valueOf(flag));
            return;
        }
        catch (FieldValidationException fieldvalidationexception)
        {
            invalidFieldsFound = true;
            passwordField.setError(fieldvalidationexception.getMessage());
            return;
        }
    }

    private void validateEmailAddress()
    {
        try
        {
            String s = emailAddressField.getText().toString();
            emailAddressValidator.validate(s);
            return;
        }
        catch (FieldValidationException fieldvalidationexception)
        {
            invalidFieldsFound = true;
            emailAddressField.setError(fieldvalidationexception.getMessage());
            return;
        }
    }

    private void validatePassword()
    {
        try
        {
            String s = passwordField.getText().toString();
            passwordValidator.validate(s);
            return;
        }
        catch (FieldValidationException fieldvalidationexception)
        {
            invalidFieldsFound = true;
            passwordField.setError(fieldvalidationexception.getMessage());
            return;
        }
    }

    private void validateValues()
        throws FieldValidationException
    {
        invalidFieldsFound = false;
        validateEmailAddress();
        validatePassword();
        validateAcceptedTermsOfUse();
        if (invalidFieldsFound)
        {
            throw new FieldValidationException("Invalid fields found.");
        } else
        {
            return;
        }
    }

    public boolean allFieldsAreValid()
    {
        return !invalidFieldsFound;
    }

    public SignUpFieldsValidator setAcceptedTermsOfUseField(CheckBox checkbox)
    {
        acceptedTermsOfUseField = checkbox;
        return this;
    }

    public SignUpFieldsValidator setEmailAddressField(EditText edittext)
    {
        emailAddressField = edittext;
        return this;
    }

    public SignUpFieldsValidator setPasswordField(EditText edittext)
    {
        passwordField = edittext;
        return this;
    }

    public void validate()
        throws FieldValidationException
    {
        checkForNullReferences();
        validateValues();
    }
}
