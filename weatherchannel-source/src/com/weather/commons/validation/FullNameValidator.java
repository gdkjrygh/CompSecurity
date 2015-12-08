// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.validation;

import com.weather.util.StringUtils;

// Referenced classes of package com.weather.commons.validation:
//            IFieldValidator, FieldValidationException

public class FullNameValidator
    implements IFieldValidator
{

    public FullNameValidator()
    {
    }

    public void validate(Object obj)
        throws FieldValidationException
    {
        if (StringUtils.isBlank((String)obj))
        {
            throw new FieldValidationException("Please provide your full name.");
        } else
        {
            return;
        }
    }
}
