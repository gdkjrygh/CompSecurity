// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.whatsapp:
//            ContactPickerHelp

class by
    implements android.view.View.OnClickListener
{

    final ContactPickerHelp a;

    by(ContactPickerHelp contactpickerhelp)
    {
        a = contactpickerhelp;
        super();
    }

    public void onClick(View view)
    {
        view = a.i;
        boolean flag;
        if (!a.i.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }
}
