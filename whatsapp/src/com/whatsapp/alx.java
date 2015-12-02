// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            ft, App, MultipleContactPicker

class alx
    implements android.view.View.OnClickListener
{

    final MultipleContactPicker a;

    alx(MultipleContactPicker multiplecontactpicker)
    {
        a = multiplecontactpicker;
        super();
    }

    public void onClick(View view)
    {
        ft.a(o.TELL_A_FRIEND, l.EMPTY_CONTACTS);
        App.c(a);
    }
}
