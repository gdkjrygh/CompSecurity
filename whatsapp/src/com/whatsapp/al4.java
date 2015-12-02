// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            vj

class al4
    implements android.content.DialogInterface.OnClickListener
{

    final vj a;
    final int b;

    al4(vj vj1, int i)
    {
        a = vj1;
        b = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        vj.a(a).removeDialog(b);
        a.a(true);
    }
}
