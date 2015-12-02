// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;
import com.whatsapp.protocol.c3;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            wc, zh, GroupChatInfo, md

class x1 extends wc
{

    final GroupChatInfo j;

    x1(GroupChatInfo groupchatinfo, String s, String s1, Vector vector, int i, c3 c3)
    {
        j = groupchatinfo;
        super(s, s1, vector, i, c3);
    }

    public void a(int i)
    {
        j.runOnUiThread(new zh(this, i));
    }

    public void b()
    {
        super.b();
        if (!j.isFinishing())
        {
            GroupChatInfo.o(j).postDelayed(new md(this), 300L);
        }
    }
}
