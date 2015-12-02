// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Filter;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            CountryPicker, iz, tq

class la
    implements TextWatcher
{

    final CountryPicker a;

    la(CountryPicker countrypicker)
    {
        a = countrypicker;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(CountryPicker.a(a), charsequence);
        ImageButton imagebutton = CountryPicker.b(a);
        if (TextUtils.isEmpty(charsequence))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        imagebutton.setVisibility(i);
        CountryPicker.c(a).getFilter().filter(charsequence);
    }
}
