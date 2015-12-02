// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, QuickContactActivity, og, GroupChatInfo, 
//            ListChatInfo, ContactInfo

class akf
    implements android.view.View.OnClickListener
{

    final QuickContactActivity a;

    akf(QuickContactActivity quickcontactactivity)
    {
        a = quickcontactactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            if (QuickContactActivity.b(a).k())
            {
                GroupChatInfo.a(QuickContactActivity.b(a), a);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (QuickContactActivity.b(a).d())
            {
                ListChatInfo.a(QuickContactActivity.b(a), a);
                if (i == 0)
                {
                    break label0;
                }
            }
            ContactInfo.a(QuickContactActivity.b(a), a);
        }
        QuickContactActivity.a(a, false);
    }
}
