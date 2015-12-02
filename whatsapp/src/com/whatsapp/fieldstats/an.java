// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class an extends aq
{

    public Double a;
    public Double b;

    public an()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.PTT.getCode()));
        z.a(context, ag.PTT_RESULT, a);
        if (b != null)
        {
            z.a(context, j.PTT_SIZE, b);
        }
        z.a(context, ag.EVENT);
    }
}
