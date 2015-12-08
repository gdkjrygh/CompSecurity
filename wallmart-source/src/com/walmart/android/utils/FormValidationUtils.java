// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.math.NumberUtils;

public class FormValidationUtils
{

    private static final String TAG = com/walmart/android/utils/FormValidationUtils.getSimpleName();

    public FormValidationUtils()
    {
    }

    public static boolean isValidEmail(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return Patterns.EMAIL_ADDRESS.matcher(s).matches();
        }
    }

    public static boolean isValidUSPhoneNumber(String s)
    {
        while (TextUtils.isEmpty(s) || !NumberUtils.isNumber(s) || !Pattern.compile("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$").matcher(s).matches()) 
        {
            return false;
        }
        return true;
    }

}
