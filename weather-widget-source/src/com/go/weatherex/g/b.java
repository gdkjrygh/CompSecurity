// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.go.weatherex.g:
//            a, l

class b
    implements TextWatcher
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        if (editable.length() > 0)
        {
            com.go.weatherex.g.a.a(a).setVisibility(0);
            editable = com.go.weatherex.g.a.b(a).getText().toString().trim();
            com.go.weatherex.g.a.c(a).b(editable);
            return;
        } else
        {
            com.go.weatherex.g.a.a(a).setVisibility(8);
            a.a(1);
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
