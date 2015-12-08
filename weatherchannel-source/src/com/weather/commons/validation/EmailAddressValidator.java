// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.validation;

import com.weather.util.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.validation:
//            IFieldValidator, FieldValidationException

public class EmailAddressValidator
    implements IFieldValidator
{

    private static final String EMAIL_PATTERN = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,255}[a-zA-Z0-9\\+\\_\\%\\-\\+]\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+";

    public EmailAddressValidator()
    {
    }

    public void validate(Object obj)
        throws FieldValidationException
    {
        obj = (String)obj;
        if (StringUtils.isBlank(((String) (obj))))
        {
            throw new FieldValidationException("Please provide your email");
        }
        boolean flag;
        if (!Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,255}[a-zA-Z0-9\\+\\_\\%\\-\\+]\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+").matcher(((CharSequence) (obj))).matches())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            throw new FieldValidationException("Incomplete or wrong email format.");
        } else
        {
            return;
        }
    }
}
