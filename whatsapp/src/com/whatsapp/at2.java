// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp:
//            ContactInfo, _y, Conversation

class at2
    implements android.widget.AdapterView.OnItemClickListener
{

    final ContactInfo a;

    at2(ContactInfo contactinfo)
    {
        a = contactinfo;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i--;
        if (i >= 0 && i < ContactInfo.c(a).getCount())
        {
            adapterview = ContactInfo.c(a).a(i);
            a.startActivity(Conversation.a(adapterview));
        }
    }
}
