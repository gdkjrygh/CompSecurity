// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.EditText;
import com.wf.wellsfargomobile.util.n;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp, SignOnFragment

class as
    implements TextWatcher
{

    final SignOnFragment a;

    as(SignOnFragment signonfragment)
    {
        a = signonfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        editable = WFApp.L();
        if (!editable.a())
        {
            String s = SignOnFragment.b(a).getText().toString();
            if (s.length() > 0 && !s.equals(editable.e()))
            {
                editable.c();
                a.a.setChecked(false);
                SignOnFragment.b(a).setText("");
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
