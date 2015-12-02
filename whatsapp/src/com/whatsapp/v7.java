// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            MultipleContactPicker

class v7
    implements android.view.View.OnClickListener
{

    final MultipleContactPicker a;

    v7(MultipleContactPicker multiplecontactpicker)
    {
        a = multiplecontactpicker;
        super();
    }

    public void onClick(View view)
    {
        MultipleContactPicker.h(a).setVisibility(8);
        MultipleContactPicker.i(a).setText("");
    }
}
