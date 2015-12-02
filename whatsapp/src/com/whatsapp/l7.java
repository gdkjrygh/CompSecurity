// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.EditText;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            za, d9, fe

class l7
    implements za
{

    final d9 a;

    l7(d9 d9_1)
    {
        a = d9_1;
        super();
    }

    public void a()
    {
    }

    public void a(int i)
    {
        d9.d(a).dismiss();
        int k = d9.e(a).getSelectionStart();
        int l = d9.e(a).getSelectionEnd();
        StringBuilder stringbuilder;
        int j;
        if (k > l)
        {
            j = l;
        } else
        {
            j = k;
            k = l;
        }
        stringbuilder = new StringBuilder(d9.e(a).getText().toString());
        stringbuilder.replace(j, k, c.a(i));
        k = stringbuilder.codePointCount(0, stringbuilder.length());
        if (d9.a(a) <= 0 || k <= d9.a(a))
        {
            d9.e(a).setText(stringbuilder);
            i = c.h(i);
            if (j <= d9.e(a).length() - i)
            {
                d9.e(a).setSelection(i + j);
                return;
            }
        }
    }
}
