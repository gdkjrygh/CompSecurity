// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            SetStatus, u1

class jr
    implements android.content.DialogInterface.OnClickListener
{

    final SetStatus a;

    jr(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(3);
        SetStatus.l.clear();
        SetStatus.c(a);
        a.o.notifyDataSetChanged();
    }
}
