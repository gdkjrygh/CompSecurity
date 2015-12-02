// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class ai extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;

    public ai()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.ADDRESSBOOK_SYNC.getCode()));
        z.a(context, ag.ADDRESSBOOK_SYNC_ERROR_CODE, c);
        z.a(context, ag.ADDRESSBOOK_SYNC_IS_REG, a);
        z.a(context, ag.ADDRESSBOOK_SYNC_RESULT_TYPE, d);
        if (b != null)
        {
            z.a(context, j.ADDRESSBOOK_SYNC_T, b);
        }
        z.a(context, ag.EVENT);
    }
}
