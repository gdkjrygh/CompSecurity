// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text.standalonecreditcard;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.contextlogic.wish.ui.components.text.UnifiedFontEditText;

public abstract class StandaloneCreditCardBaseEditText extends UnifiedFontEditText
    implements TextWatcher, android.view.View.OnClickListener
{

    private boolean valid;

    public StandaloneCreditCardBaseEditText(Context context)
    {
        super(context);
        valid = false;
        init();
    }

    public StandaloneCreditCardBaseEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        valid = false;
        init();
    }

    public StandaloneCreditCardBaseEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        valid = false;
        init();
    }

    public void init()
    {
        setImeOptions(0x10000000);
        setBackgroundColor(getResources().getColor(0x7f0c00e4));
        setHintTextColor(getResources().getColor(0x7f0c00e1));
        setTextColor(getResources().getColor(0x7f0c00b7));
        setInputType(2);
        addTextChangedListener(this);
        setOnClickListener(this);
    }

    public boolean isValid()
    {
        return valid;
    }

    public void onClick(View view)
    {
        setFocusableInTouchMode(true);
        requestFocus();
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 1);
        setSelection(getText().toString().length());
        setFocusableInTouchMode(false);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void setValid(boolean flag)
    {
        valid = flag;
    }
}
