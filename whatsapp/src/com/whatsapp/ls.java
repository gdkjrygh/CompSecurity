// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            RegisterName

class ls
    implements android.content.DialogInterface.OnClickListener
{

    final RegisterName a;

    ls(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        RegisterName.b(a);
        a.removeDialog(1);
    }
}
