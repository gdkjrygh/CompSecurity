// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class a0 extends aq
{

    public Double a;
    public Double b;
    public Double c;

    public a0()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.LOGIN.getCode()));
        z.a(context, ag.LOGIN_RESULT, c);
        z.a(context, ag.RETRY_COUNT, b);
        if (a != null)
        {
            z.a(context, j.LOGIN_T, a);
        }
        z.a(context, ag.EVENT);
    }
}
