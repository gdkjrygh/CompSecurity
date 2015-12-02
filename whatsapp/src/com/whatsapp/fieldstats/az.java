// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z

public final class az extends aq
{

    public Double a;
    public Double b;

    public az()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.UI_USAGE.getCode()));
        z.a(context, ag.ENTRY_POINT, a);
        z.a(context, ag.UI_USAGE_TYPE, b);
        z.a(context, ag.EVENT);
    }
}
