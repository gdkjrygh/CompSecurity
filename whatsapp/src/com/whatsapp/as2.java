// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            vj

class as2
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final vj b;

    as2(vj vj1, int i)
    {
        b = vj1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        vj.a(b).removeDialog(a);
        vj.a(b).showDialog(106);
    }
}
