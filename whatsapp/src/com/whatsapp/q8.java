// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            MultipleContactPicker, iz, App

class q8
    implements TextWatcher
{

    final MultipleContactPicker a;

    q8(MultipleContactPicker multiplecontactpicker)
    {
        a = multiplecontactpicker;
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
label0:
        {
            iz.a(MultipleContactPicker.i(a), charsequence);
            if (charsequence.length() > 0)
            {
                MultipleContactPicker.a(a, charsequence.toString());
                MultipleContactPicker.h(a).setVisibility(0);
                MultipleContactPicker.a(a, true);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            MultipleContactPicker.h(a).setVisibility(8);
            MultipleContactPicker.g(a);
            MultipleContactPicker.a(a, false);
        }
    }
}
