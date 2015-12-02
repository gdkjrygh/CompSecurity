// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            SmsDefaultAppWarning

class a8n
    implements android.content.DialogInterface.OnClickListener
{

    final SmsDefaultAppWarning a;

    a8n(SmsDefaultAppWarning smsdefaultappwarning)
    {
        a = smsdefaultappwarning;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(1);
        SmsDefaultAppWarning.a(a);
        a.finish();
    }
}
