// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoPatterns

public final class VideoValidation
{

    private VideoValidation()
    {
    }

    public static String validateCollectionId(String s, String s1)
        throws ValidationException
    {
        Validation.validateLength(1, 100, s, s1);
        if (!VideoPatterns.COLLECTION_ID_PATTERN.matcher(s1).matches())
        {
            throw new ValidationException(String.format("invalid collection id. fieldName=%s, collectionId=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static String validateDma(String s, String s1)
        throws ValidationException
    {
        Validation.validateNotNull(s, s1);
        if (!VideoPatterns.DMA.matcher(s1).matches())
        {
            throw new ValidationException(String.format("invalid dma. fieldName=%s, dma=%s", new Object[] {
                s, s1
            }));
        } else
        {
            return s1;
        }
    }

    public static String validatePlaylistId(String s, String s1)
        throws ValidationException
    {
        return Validation.validateGoodIri(s, Validation.validateLength(2, 100, s, s1));
    }

    public static String validatePlaylistOrCollectionId(String s, String s1)
        throws ValidationException
    {
        String s2;
        try
        {
            s2 = validatePlaylistId(s, Validation.validateLength(2, 100, s, s1));
        }
        catch (ValidationException validationexception)
        {
            return validateCollectionId(s, Validation.validateLength(2, 100, s, s1));
        }
        return s2;
    }
}
