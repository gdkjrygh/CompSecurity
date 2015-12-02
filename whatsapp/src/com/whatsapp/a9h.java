// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, c9

class a9h
    implements android.content.DialogInterface.OnClickListener
{

    final DialogToastListActivity a;

    a9h(DialogToastListActivity dialogtoastlistactivity)
    {
        a = dialogtoastlistactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(500);
        if (DialogToastListActivity.a(a) != null)
        {
            DialogToastListActivity.a(a).a();
        }
    }
}
