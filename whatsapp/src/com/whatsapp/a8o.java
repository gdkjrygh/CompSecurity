// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.EditText;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            za, RegisterName, fe

class a8o
    implements za
{

    final RegisterName a;

    a8o(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void a()
    {
    }

    public void a(int i)
    {
        RegisterName.k(a).dismiss();
        int j = RegisterName.f(a).getSelectionStart();
        int k = RegisterName.f(a).getSelectionEnd();
        StringBuilder stringbuilder;
        int l;
        if (j > k)
        {
            l = k;
            k = j;
        } else
        {
            l = j;
        }
        stringbuilder = new StringBuilder(RegisterName.f(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        if (stringbuilder.length() <= 25)
        {
            RegisterName.f(a).setText(stringbuilder);
            if (l <= RegisterName.f(a).length() - c.h(i))
            {
                RegisterName.f(a).setSelection(l + c.h(i));
                return;
            }
        }
    }
}
