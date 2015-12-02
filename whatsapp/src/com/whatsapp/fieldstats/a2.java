// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class a2 extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;

    public a2()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.PROFILE_PIC_UPLOAD.getCode()));
        z.a(context, ag.PROFILE_PIC_UPLOAD_RESULT, a);
        z.a(context, ag.RETRY_COUNT, c);
        if (d != null)
        {
            z.a(context, j.PROFILE_PIC_SIZE, d);
        }
        if (b != null)
        {
            z.a(context, j.PROFILE_PIC_UPLOAD_T, b);
        }
        z.a(context, ag.EVENT);
    }
}
