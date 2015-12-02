// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            dw, AccountInfoActivity, RegisterName

class abc
    implements android.view.View.OnClickListener
{

    final dw a;

    abc(dw dw1)
    {
        a = dw1;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(a.d, com/whatsapp/AccountInfoActivity);
        a.d.startActivity(view);
        a.d.finish();
        RegisterName.a(null);
        a.d.removeDialog(0);
    }
}
