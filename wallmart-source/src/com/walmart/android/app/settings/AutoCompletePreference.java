// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.settings;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.walmart.android.app.moremenu.UrlSettingsManager;
import java.util.Set;

public class AutoCompletePreference extends EditTextPreference
{

    private static AutoCompleteTextView mEditText = null;

    public AutoCompletePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mEditText = new AutoCompleteTextView(context, attributeset);
        mEditText.setThreshold(0);
    }

    protected void onBindDialogView(View view)
    {
        Object obj1 = UrlSettingsManager.getUrlSet(getKey());
        String as[] = new String[0];
        if (obj1 != null)
        {
            as = (String[])((Set) (obj1)).toArray(new String[0]);
        }
        Object obj = new ArrayAdapter(getContext(), 0x109000a, as);
        mEditText.setAdapter(((android.widget.ListAdapter) (obj)));
        obj = mEditText;
        ((AutoCompleteTextView) (obj)).setText(getText());
        obj1 = ((AutoCompleteTextView) (obj)).getParent();
        if (obj1 != view)
        {
            if (obj1 != null)
            {
                ((ViewGroup)obj1).removeView(((View) (obj)));
            }
            onAddEditTextToDialogView(view, ((android.widget.EditText) (obj)));
        }
    }

    protected void onDialogClosed(boolean flag)
    {
        if (flag)
        {
            String s = mEditText.getText().toString();
            if (callChangeListener(s))
            {
                setText(s);
            }
        }
    }

}
