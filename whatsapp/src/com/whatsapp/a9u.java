// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            Advanced

class a9u
    implements android.view.View.OnClickListener
{

    final Advanced a;

    a9u(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        a.showDialog(1);
    }
}
