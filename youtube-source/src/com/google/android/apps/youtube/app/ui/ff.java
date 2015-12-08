// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.text.Editable;
import android.text.TextWatcher;

final class ff
    implements TextWatcher
{

    private ff()
    {
    }

    ff(byte byte0)
    {
        this();
    }

    private static String a(String s)
    {
        int k = s.length();
        if (k <= 3)
        {
            return s;
        }
        int l = k / 3;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < l; i++)
        {
            stringbuilder.append(s, i * 3, i * 3 + 3).append(" ");
        }

        int j = k % 3;
        if (j == 0)
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        } else
        {
            stringbuilder.append(s, k - j, k);
        }
        return stringbuilder.toString();
    }

    public final void afterTextChanged(Editable editable)
    {
        int i = editable.length();
        char ac[] = new char[i];
        editable.getChars(0, i, ac, 0);
        String s = new String(ac);
        String s1 = a(s.replaceAll("\\D", ""));
        if (!s1.equals(s))
        {
            editable.replace(0, i, s1);
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
