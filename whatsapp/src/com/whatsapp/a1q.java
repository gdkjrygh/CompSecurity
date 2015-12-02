// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            qy, SetStatus

class a1q
    implements android.view.View.OnClickListener
{

    final qy a;

    a1q(qy qy1)
    {
        a = qy1;
        super();
    }

    public void onClick(View view)
    {
        a.b.showDialog(50);
    }
}
