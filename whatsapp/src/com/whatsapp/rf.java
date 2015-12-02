// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            RegisterName, qk

class rf
    implements android.view.View.OnClickListener
{

    final RegisterName a;

    rf(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void onClick(View view)
    {
        qk.a(RegisterName.j(a), a, 12);
    }
}
