// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class aj extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;

    public aj()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.MEDIA_UPLOAD.getCode()));
        z.a(context, ag.MEDIA_TYPE, c);
        z.a(context, ag.MEDIA_UPLOAD_RESULT, e);
        z.a(context, ag.MESSAGE_IS_FORWARD, b);
        z.a(context, ag.RETRY_COUNT, d);
        if (a != null)
        {
            z.a(context, j.MEDIA_SIZE, a);
        }
        if (f != null)
        {
            z.a(context, j.MEDIA_UPLOAD_T, f);
        }
        z.a(context, ag.EVENT);
    }
}
