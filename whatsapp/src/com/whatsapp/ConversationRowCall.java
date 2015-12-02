// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            ConversationRow

public class ConversationRowCall extends ConversationRow
{

    public ConversationRowCall(Context context, c4 c4)
    {
        super(context, c4);
    }

    private void b(c4 c4)
    {
    }

    public void a(c4 c4, boolean flag)
    {
        if (C != c4 || flag)
        {
            b(c4);
        }
        super.a(c4, flag);
    }

    protected int n()
    {
        return 0x7f030048;
    }

    protected int q()
    {
        return 0x7f03004b;
    }
}
