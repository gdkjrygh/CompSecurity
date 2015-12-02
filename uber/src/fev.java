// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;

public final class fev
{

    public static SpannableStringBuilder a(Context context, String s, String s1)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        spannablestringbuilder.append(s);
        spannablestringbuilder.setSpan(new TextAppearanceSpan(context, 0x7f0901ed), 0, spannablestringbuilder.length(), 33);
        spannablestringbuilder.append(" ");
        int i = spannablestringbuilder.length();
        spannablestringbuilder.append(s1);
        spannablestringbuilder.setSpan(new TextAppearanceSpan(context, 0x7f0900e4), i, spannablestringbuilder.length(), 33);
        spannablestringbuilder.setSpan(new URLSpan(s1), i, spannablestringbuilder.length(), 33);
        return spannablestringbuilder;
    }
}
