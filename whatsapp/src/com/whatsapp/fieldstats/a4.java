// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class a4 extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;

    public a4()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.MEDIA_DOWNLOAD.getCode()));
        z.a(context, ag.MEDIA_DOWNLOAD_RESULT, d);
        z.a(context, ag.MEDIA_TYPE, b);
        z.a(context, ag.RETRY_COUNT, a);
        if (e != null)
        {
            z.a(context, j.MEDIA_DOWNLOAD_T, e);
        }
        if (c != null)
        {
            z.a(context, j.MEDIA_SIZE, c);
        }
        z.a(context, ag.EVENT);
    }
}
