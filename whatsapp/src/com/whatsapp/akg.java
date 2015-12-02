// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            EULA, o4, App, n1

class akg
    implements android.content.DialogInterface.OnClickListener
{

    final EULA a;

    akg(EULA eula)
    {
        a = eula;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            a.removeDialog(6);
            if (o4.a() != null)
            {
                a.showDialog(8);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            EULA.a(a, n1.AGREE_NONE);
        }
    }
}
