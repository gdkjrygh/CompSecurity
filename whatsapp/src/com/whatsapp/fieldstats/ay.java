// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class ay extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;

    public ay()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.MESSAGE_SEND.getCode()));
        z.a(context, ag.MEDIA_CAPTION_PRESENT, h);
        z.a(context, ag.MESSAGE_IS_FORWARD, d);
        z.a(context, ag.MESSAGE_IS_INTERNATIONAL, a);
        z.a(context, ag.MESSAGE_MEDIA_TYPE, f);
        z.a(context, ag.MESSAGE_SEND_RESULT, g);
        z.a(context, ag.MESSAGE_TYPE, c);
        z.a(context, ag.RETRY_COUNT, e);
        if (b != null)
        {
            z.a(context, j.MESSAGE_SEND_T, b);
        }
        z.a(context, ag.EVENT);
    }
}
