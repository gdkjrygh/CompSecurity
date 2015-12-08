// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            LoginResult

public class CreateAccountResult extends LoginResult
{

    public static final String ERROR_EMAILS_DONT_MATCH = "emailsDontMatch";
    public static final String ERROR_EMAIL_BLANK = "missingEmailInReg";
    public static final String ERROR_EMAIL_INVALID = "invalidEmail";
    public static final String ERROR_FIRSTNAME_MAX_LENGTH = "firstName.MaxLength";
    public static final String ERROR_FIRST_NAME_BLANK = "invalidFirstName";
    public static final String ERROR_FIRST_NAME_INVALID = "invalidFirstNameFormat";
    public static final String ERROR_LASTNAME_MAX_LENGTH = "lastname.MaxLength";
    public static final String ERROR_LAST_NAME_BLANK = "invalidLastName";
    public static final String ERROR_LAST_NAME_INVALID = "invalidLastNameFormat";
    public static final String ERROR_PASSWORDS_DONT_MATCH = "passwordsDontMatch";
    public static final String ERROR_PASSWORD_BLANK = "missingPasswordInRegistration";
    public static final String ERROR_PASSWORD_INVALID = "invalidPasswordInReg";
    public static final String ERROR_PASSWORD_INVALID_LENGTH = "invalidPasswordLength";
    public static final String ERROR_USER_ALREADY_EXISTS = "userAlreadyExists";
    public static final String ERROR_ZIP_BLANK = "invalidZip";

    public CreateAccountResult()
    {
    }
}
