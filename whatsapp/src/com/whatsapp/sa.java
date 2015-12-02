// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp:
//            WebSessionsActivity, cz, fz, App, 
//            ConversationRowLocation

class sa
    implements android.widget.AdapterView.OnItemClickListener
{

    final WebSessionsActivity a;

    sa(WebSessionsActivity websessionsactivity)
    {
        a = websessionsactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = WebSessionsActivity.d(a).a(i - 1);
            if (((fz) (adapterview)).e == 0.0D && ((fz) (adapterview)).d == 0.0D && ((fz) (adapterview)).i == 0.0D)
            {
                App.b(a, 0x7f0e0228, 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ConversationRowLocation.a(a, ((fz) (adapterview)).e, ((fz) (adapterview)).d, null);
        }
    }
}
