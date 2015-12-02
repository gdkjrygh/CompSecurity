// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            SettingsChat, Conversation, og

class nn
    implements android.content.DialogInterface.OnClickListener
{

    final SettingsChat a;
    final og b;

    nn(SettingsChat settingschat, og og)
    {
        a = settingschat;
        b = og;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(19);
        Conversation.a(a, a, b, false);
    }
}
