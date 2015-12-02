// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            SettingsChat, Conversation, og

class vc
    implements android.content.DialogInterface.OnClickListener
{

    final og a;
    final SettingsChat b;

    vc(SettingsChat settingschat, og og)
    {
        b = settingschat;
        a = og;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(19);
        Conversation.a(b, b, a, true);
    }
}
