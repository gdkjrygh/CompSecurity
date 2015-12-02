// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.whatsapp:
//            RegisterName

class ff
    implements android.view.View.OnClickListener
{

    final RegisterName a;

    ff(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void onClick(View view)
    {
        ((CheckBox)a.findViewById(0x7f0b027b)).toggle();
    }
}
