// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui.signup.social;

import android.widget.CheckBox;
import android.widget.EditText;
import com.weather.commons.validation.AcceptedTermsOfUseValidator;
import com.weather.commons.validation.EmailAddressValidator;
import com.weather.commons.validation.FieldValidationException;
import com.weather.commons.validation.FullNameValidator;
import com.weather.util.ObjectUtils;

public class SocialSingUpFieldsValidator
{

    private CheckBox acceptedTermsOfUseField;
    private final AcceptedTermsOfUseValidator acceptedTermsOfUseValidator = new AcceptedTermsOfUseValidator();
    private EditText emailAddressField;
    private final EmailAddressValidator emailAddressValidator = new EmailAddressValidator();
    private EditText fullNameField;
    private final FullNameValidator fullNameValidator = new FullNameValidator();
    private boolean invalidFieldsFound;

    public SocialSingUpFieldsValidator()
    {
    }

    private void checkForNullReferences()
    {
        if (ObjectUtils.isAnyNull(emailAddressField, new Object[] {
    fullNameField, acceptedTermsOfUseField
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
            acceptedTermsOfUseField.setError(fieldvalidationexception.getMessage());
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

    private void validateFullName()
    {
        try
        {
            String s = fullNameField.getText().toString();
            fullNameValidator.validate(s);
            return;
        }
        catch (FieldValidationException fieldvalidationexception)
        {
            invalidFieldsFound = true;
            fullNameField.setError(fieldvalidationexception.getMessage());
            return;
        }
    }

    private void validateValues()
        throws FieldValidationException
    {
        invalidFieldsFound = false;
        validateEmailAddress();
        validateFullName();
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

    public SocialSingUpFieldsValidator setAcceptedTermsOfUseField(CheckBox checkbox)
    {
        acceptedTermsOfUseField = checkbox;
        return this;
    }

    public SocialSingUpFieldsValidator setEmailAddressField(EditText edittext)
    {
        emailAddressField = edittext;
        return this;
    }

    public SocialSingUpFieldsValidator setFullNameField(EditText edittext)
    {
        fullNameField = edittext;
        return this;
    }

    public void validate()
        throws FieldValidationException
    {
        checkForNullReferences();
        validateValues();
    }
}
