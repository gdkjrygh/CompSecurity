// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            CountryPicker

class e_
    implements android.view.View.OnClickListener
{

    final CountryPicker a;

    e_(CountryPicker countrypicker)
    {
        a = countrypicker;
        super();
    }

    public void onClick(View view)
    {
        CountryPicker.a(a).setText("");
    }
}
