// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation, ContactPicker

class r9
    implements android.content.DialogInterface.OnClickListener
{

    final ContactPicker a;

    r9(ContactPicker contactpicker)
    {
        a = contactpicker;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Conversation.ae = true;
        a.startActivity(ContactPicker.s(a));
        a.removeDialog(1);
        a.finish();
    }
}
