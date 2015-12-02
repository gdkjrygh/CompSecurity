// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class ar extends aq
{

    public Double a;
    public Double b;

    public ar()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.GROUP_MUTE.getCode()));
        z.a(context, ag.GROUP_SIZE, a);
        if (b != null)
        {
            z.a(context, j.GROUP_MUTE_T, b);
        }
        z.a(context, ag.EVENT);
    }
}
