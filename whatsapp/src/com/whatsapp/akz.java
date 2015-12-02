// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.EditText;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            za, NewGroup, fe, au2

class akz
    implements za
{

    final NewGroup a;

    akz(NewGroup newgroup)
    {
        a = newgroup;
        super();
    }

    public void a()
    {
    }

    public void a(int i)
    {
        NewGroup.a(a).dismiss();
        int j = NewGroup.d(a).getSelectionStart();
        int k = NewGroup.d(a).getSelectionEnd();
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
        stringbuilder = new StringBuilder(NewGroup.d(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        if (stringbuilder.codePointCount(0, stringbuilder.length()) <= au2.m)
        {
            NewGroup.d(a).setText(stringbuilder);
            if (l <= NewGroup.d(a).length() - c.h(i))
            {
                NewGroup.d(a).setSelection(l + c.h(i));
                return;
            }
        }
    }
}
