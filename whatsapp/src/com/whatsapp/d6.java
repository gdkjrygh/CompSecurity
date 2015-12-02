// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            qz, SetStatus

class d6
    implements android.view.View.OnClickListener
{

    final qz a;

    d6(qz qz1)
    {
        a = qz1;
        super();
    }

    public void onClick(View view)
    {
        a.a.showDialog(50);
    }
}
