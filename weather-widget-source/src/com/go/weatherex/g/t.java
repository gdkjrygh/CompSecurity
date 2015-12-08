// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.go.weatherex.g:
//            s, l

class t
    implements TextWatcher
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        if (editable.toString().length() > 0)
        {
            s.c(a).setVisibility(0);
            editable = s.d(a).getText().toString().trim();
            s.e(a).b(editable);
            return;
        } else
        {
            s.c(a).setVisibility(8);
            s.a(a, 1);
            return;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
