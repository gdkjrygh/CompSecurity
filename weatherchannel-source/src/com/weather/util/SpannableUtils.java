// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.google.common.base.Preconditions;

public class SpannableUtils
{
    public static final class StringWithSingleSpan
    {

        public final int spanEnd;
        public final int spanStart;
        public final SpannableString theString;

        public StringWithSingleSpan(SpannableString spannablestring, int i, int j)
        {
            theString = spannablestring;
            spanStart = i;
            spanEnd = j;
        }
    }


    private SpannableUtils()
    {
    }

    public static Spanned convertHtmlToSpanned(String s)
    {
        int i = 0;
        Spanned spanned = Html.fromHtml(s);
        s = new SpannableStringBuilder(spanned, 0, spanned.length());
        URLSpan aurlspan[] = (URLSpan[])s.getSpans(0, spanned.length(), android/text/style/URLSpan);
        for (int j = aurlspan.length; i < j; i++)
        {
            s.removeSpan(aurlspan[i]);
        }

        return s;
    }

    public static StringWithSingleSpan insertSingleSpannedString(String s, String s1)
    {
        s = (String)Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        int j = s.indexOf('|');
        int i;
        if (j == -1)
        {
            j = 0;
            i = 0;
        } else
        {
            i = s.indexOf('|', j + 1);
            if (i == -1)
            {
                j = 0;
                i = 0;
            } else
            {
                i += s1.length() - 5;
                s = s.replace("|", "");
            }
        }
        return new StringWithSingleSpan(new SpannableString(String.format(s, new Object[] {
            s1
        })), j, i);
    }
}
