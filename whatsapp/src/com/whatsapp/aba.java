// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, EULA, Advanced

class aba
    implements android.view.View.OnClickListener
{

    final Advanced a;

    aba(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        App.d(a, 0);
        view = new Intent(a, com/whatsapp/EULA);
        a.finish();
        a.startActivity(view);
    }
}
