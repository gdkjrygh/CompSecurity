// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.validation;


// Referenced classes of package com.weather.commons.validation:
//            IFieldValidator, FieldValidationException

public class AcceptedTermsOfUseValidator
    implements IFieldValidator
{

    public AcceptedTermsOfUseValidator()
    {
    }

    public void validate(Object obj)
        throws FieldValidationException
    {
        if (!((Boolean)obj).booleanValue())
        {
            throw new FieldValidationException("To signup please agree the terms of use.");
        } else
        {
            return;
        }
    }
}
