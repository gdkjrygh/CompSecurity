// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;

// Referenced classes of package com.whatsapp:
//            aq, ContactPicker, App

class a8t
    implements aq
{

    final ContactPicker a;

    a8t(ContactPicker contactpicker)
    {
        a = contactpicker;
        super();
    }

    public boolean a(String s)
    {
label0:
        {
            ContactPicker.a(a, s);
            if (!TextUtils.isEmpty(s))
            {
                ContactPicker.b(a, s);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ContactPicker.e(a);
        }
        ContactPicker.b(a);
        return false;
    }
}
