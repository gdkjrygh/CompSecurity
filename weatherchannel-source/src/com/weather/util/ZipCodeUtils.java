// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.google.common.base.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ZipCodeUtils
{

    public static final Pattern UK_ZIP = Pattern.compile("(?i)[A-Z]{1,2}[0-9][A-Z0-9]? ?[0-9][A-Z]{2}");
    public static final Pattern UK_ZIP_PARTIAL = Pattern.compile("(?i)[A-Z]{1,2}[0-9][A-Z0-9]? ?[0-9][A-Z]{0,2}");
    public static final Pattern US_ZIP = Pattern.compile("[0-9]{5}(-[0-9]{4})?");

    private ZipCodeUtils()
    {
    }

    public static boolean isZipCode(CharSequence charsequence)
    {
        while (charsequence == null || !isZipCodeUkPartial(charsequence) && !isZipCodeUs(charsequence)) 
        {
            return false;
        }
        return true;
    }

    public static boolean isZipCodeUk(CharSequence charsequence)
    {
        return UK_ZIP.matcher((CharSequence)Preconditions.checkNotNull(charsequence)).matches();
    }

    public static boolean isZipCodeUkPartial(CharSequence charsequence)
    {
        return UK_ZIP_PARTIAL.matcher((CharSequence)Preconditions.checkNotNull(charsequence)).matches();
    }

    public static boolean isZipCodeUs(CharSequence charsequence)
    {
        return US_ZIP.matcher((CharSequence)Preconditions.checkNotNull(charsequence)).matches();
    }

}
