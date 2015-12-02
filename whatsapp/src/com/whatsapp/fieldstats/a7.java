// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class a7 extends aq
{

    public Double a;
    public Double b;

    public a7()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.PUSH_RECEIVE.getCode()));
        z.a(context, ag.PUSH_RECEIVE_WHILE_OFFLINE, b);
        if (a != null)
        {
            z.a(context, j.PUSH_RECEIVE_DELAY_T, a);
        }
        z.a(context, ag.EVENT);
    }
}
