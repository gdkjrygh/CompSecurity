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
//            NewGroup, au2, App, iz

class adg
    implements TextWatcher
{

    private int a;
    final NewGroup b;

    adg(NewGroup newgroup)
    {
        b = newgroup;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
label0:
        {
            String s = editable.toString();
            c.a(editable, b);
            int i = s.codePointCount(0, s.length());
            com.whatsapp.NewGroup.c(b).setText(Integer.toString(au2.m - i));
            if (i >= au2.m && a == 0)
            {
                a = NewGroup.d(b).getInputType();
                if (a == 0)
                {
                    break label0;
                }
                NewGroup.d(b).setInputType(a | 0x80000);
                NewGroup.d(b).setText(s);
                NewGroup.d(b).setSelection(s.length());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (a != 0)
            {
                NewGroup.d(b).setInputType(a);
                a = 0;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(NewGroup.d(b), charsequence);
    }
}
