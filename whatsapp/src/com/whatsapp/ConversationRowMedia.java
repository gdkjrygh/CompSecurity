// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRow, at_, att, atd, 
//            atu

public abstract class ConversationRowMedia extends ConversationRow
{

    protected bv J;
    protected bv K;
    protected bv L;
    protected bv M;

    public ConversationRowMedia(Context context, c4 c4)
    {
        super(context, c4);
        L = new at_(this);
        M = new att(this);
        K = new atd(this);
        J = new atu(this);
    }

    protected abstract void b(c4 c4);

    protected int n()
    {
        return 0x7f030049;
    }

    protected int q()
    {
        return 0x7f03004a;
    }
}
