// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z

public final class ap extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;

    public ap()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.E2E_MESSAGE_SEND.getCode()));
        z.a(context, ag.E2E_FAILURE_REASON, c);
        z.a(context, ag.E2E_SUCCESSFUL, a);
        z.a(context, ag.MESSAGE_IS_SELF_SEND, d);
        z.a(context, ag.RETRY_COUNT, b);
        z.a(context, ag.EVENT);
    }
}
