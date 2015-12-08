// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

public class NumberFormattingTextWatcher
    implements TextWatcher
{

    private final int mModulo;
    private int mRememberedPosition;
    private boolean mSelfChange;

    public NumberFormattingTextWatcher()
    {
        this(4);
    }

    public NumberFormattingTextWatcher(int i)
    {
        mSelfChange = false;
        mModulo = i + 1;
    }

    private String getFormattedNumber(StringBuilder stringbuilder, char c, boolean flag)
    {
        if ((stringbuilder.length() + 1) % mModulo == 0)
        {
            stringbuilder.append(' ');
        }
        stringbuilder.append(c);
        if (flag)
        {
            mRememberedPosition = stringbuilder.length();
        }
        return stringbuilder.toString();
    }

    private String reformat(CharSequence charsequence, int i)
    {
        String s = "";
        mRememberedPosition = 0;
        StringBuilder stringbuilder = new StringBuilder();
        char c = '\0';
        boolean flag = false;
        int k = charsequence.length();
        for (int j = 0; j < k;)
        {
            char c2 = charsequence.charAt(j);
            String s1 = s;
            boolean flag1 = flag;
            char c1 = c;
            if (Character.isDigit(c2))
            {
                flag1 = flag;
                if (c != 0)
                {
                    s = getFormattedNumber(stringbuilder, c, flag);
                    flag1 = false;
                }
                c1 = c2;
                s1 = s;
            }
            flag = flag1;
            if (j == i - 1)
            {
                flag = true;
            }
            j++;
            s = s1;
            c = c1;
        }

        if (c != 0)
        {
            s = getFormattedNumber(stringbuilder, c, flag);
        }
        return s;
    }

    public void afterTextChanged(Editable editable)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mSelfChange;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s = reformat(editable, Selection.getSelectionEnd(editable));
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mSelfChange = true;
        editable.replace(0, editable.length(), s, 0, s.length());
        if (s.equals(editable.toString()))
        {
            Selection.setSelection(editable, mRememberedPosition);
        }
        mSelfChange = false;
        if (true) goto _L1; else goto _L3
_L3:
        editable;
        throw editable;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
