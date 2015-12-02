// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.SpannableStringBuilder;
import android.text.TextUtils;

public final class dtt
{

    public static CharSequence a(CharSequence charsequence)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        for (int i = 0; i < charsequence.length(); i++)
        {
            char c = charsequence.charAt(i);
            if (Character.isLowerCase(c))
            {
                spannablestringbuilder.replace(i, i + 1, String.valueOf(Character.toUpperCase(c)));
            }
        }

        return spannablestringbuilder;
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return s;
        }
        if (s.length() == 1)
        {
            return s.toUpperCase();
        } else
        {
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }
}
