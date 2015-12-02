// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ScrollView;

// Referenced classes of package com.whatsapp:
//            a1u, ContactPickerHelp

class atp
    implements Runnable
{

    final a1u a;

    atp(a1u a1u1)
    {
        a = a1u1;
        super();
    }

    public void run()
    {
        View view = a.a.findViewById(0x7f0b012e);
        ((ScrollView)a.a.findViewById(0x7f0b00fa)).smoothScrollTo(0, view.getTop());
    }
}
