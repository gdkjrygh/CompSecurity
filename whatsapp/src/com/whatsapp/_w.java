// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            d9, App, iz

class _w
    implements TextWatcher
{

    final d9 a;
    private int b;

    _w(d9 d9_1)
    {
        a = d9_1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
label0:
        {
            String s = editable.toString();
            c.a(editable, d9.h(a));
            if (d9.a(a) <= 0)
            {
                break label0;
            }
            int i = s.codePointCount(0, s.length());
            d9.g(a).setText(Integer.toString(d9.a(a) - i));
            if (i >= d9.a(a) && b == 0)
            {
                b = d9.e(a).getInputType();
                if (b == 0)
                {
                    break label0;
                }
                d9.e(a).setInputType(b | 0x80000);
                d9.e(a).setText(s);
                d9.e(a).setSelection(s.length());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (b != 0)
            {
                d9.e(a).setInputType(b);
                b = 0;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(d9.e(a), charsequence);
    }
}
