// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.validation;

import com.weather.util.StringUtils;

// Referenced classes of package com.weather.commons.validation:
//            IFieldValidator, FieldValidationException

public class PasswordValidator
    implements IFieldValidator
{

    public PasswordValidator()
    {
    }

    public void validate(Object obj)
        throws FieldValidationException
    {
        obj = (String)obj;
        if (StringUtils.isBlank(((String) (obj))))
        {
            throw new FieldValidationException("Please provide a password");
        }
        boolean flag;
        if (((String) (obj)).length() < 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            throw new FieldValidationException("Password be a least 6 characters long");
        } else
        {
            return;
        }
    }
}
