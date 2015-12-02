// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class a6 extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;

    public a6()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.MESSAGE_RECEIVE.getCode()));
        z.a(context, ag.MESSAGE_IS_INTERNATIONAL, e);
        z.a(context, ag.MESSAGE_IS_OFFLINE, b);
        z.a(context, ag.MESSAGE_MEDIA_TYPE, g);
        z.a(context, ag.MESSAGE_TYPE, c);
        z.a(context, ag.NUM_OF_WEB_URLS_IN_TEXT_MESSAGE, a);
        if (d != null)
        {
            z.a(context, j.MESSAGE_RECEIVE_T0, d);
        }
        if (f != null)
        {
            z.a(context, j.MESSAGE_RECEIVE_T1, f);
        }
        z.a(context, ag.EVENT);
    }
}
