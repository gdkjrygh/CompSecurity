// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ScrollView;

// Referenced classes of package com.whatsapp:
//            ContactPickerHelp

class a_u
    implements Runnable
{

    final ContactPickerHelp a;

    a_u(ContactPickerHelp contactpickerhelp)
    {
        a = contactpickerhelp;
        super();
    }

    public void run()
    {
        ((ScrollView)a.findViewById(0x7f0b00fa)).fullScroll(130);
    }
}
