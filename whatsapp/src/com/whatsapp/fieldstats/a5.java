// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z

public final class a5 extends aq
{

    public Double a;
    public Double b;
    public String c;
    public Double d;
    public Double e;

    public a5()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.E2E_MESSAGE_RECV.getCode()));
        z.a(context, ag.E2E_FAILURE_REASON, e);
        z.a(context, ag.E2E_SUCCESSFUL, d);
        z.a(context, ag.MESSAGE_IS_SELF_SEND, b);
        z.a(context, ag.MESSAGE_ORIGINATING_APPLICATION_VERSION, c);
        z.a(context, ag.RETRY_COUNT, a);
        z.a(context, ag.EVENT);
    }
}
