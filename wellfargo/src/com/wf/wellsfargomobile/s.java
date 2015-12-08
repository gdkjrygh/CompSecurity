// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ToggleButton;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp, LogonFragment

class s
    implements TextWatcher
{

    final LogonFragment a;

    s(LogonFragment logonfragment)
    {
        a = logonfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        if (WFApp.G())
        {
            editable = LogonFragment.a(a).getText().toString();
            if (editable.length() > 0 && !editable.equals(WFApp.M()))
            {
                WFApp.O();
                LogonFragment.b(a).setChecked(false);
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
