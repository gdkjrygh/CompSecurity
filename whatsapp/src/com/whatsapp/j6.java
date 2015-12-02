// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            vj

class j6
    implements android.content.DialogInterface.OnClickListener
{

    final vj a;

    j6(vj vj1)
    {
        a = vj1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        vj.a(a).removeDialog(103);
        vj.a(a).showDialog(106);
    }
}
