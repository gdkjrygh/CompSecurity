// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;

public final class dux
{

    public static CharSequence a(String s, int i)
    {
        int j;
        int k;
        if (!TextUtils.isEmpty(s))
        {
            if ((j = s.indexOf("**")) >= 0 && (k = s.indexOf("**", j + 2)) >= 0)
            {
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
                spannablestringbuilder.append(s, 0, j);
                spannablestringbuilder.append(s, j + 2, k);
                spannablestringbuilder.append(s, k + 2, s.length());
                spannablestringbuilder.setSpan(new ForegroundColorSpan(i), j, k - 2, 18);
                return spannablestringbuilder;
            }
        }
        return s;
    }
}
