// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, ag, bu, z, 
//            j

public final class am extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;

    public am()
    {
    }

    void updateFields(Context context)
    {
        z.a(context, ag.EVENT, Integer.valueOf(bu.LOCATION_PICKER.getCode()));
        z.a(context, ag.LOCATION_PICKER_FULL_SCREEN, f);
        z.a(context, ag.LOCATION_PICKER_OUT_OF_QUOTA, h);
        z.a(context, ag.LOCATION_PICKER_PLACES_RESPONSE, d);
        z.a(context, ag.LOCATION_PICKER_PLACES_SOURCE, e);
        z.a(context, ag.LOCATION_PICKER_RESULT_TYPE, a);
        if (b != null)
        {
            z.a(context, j.LOCATION_PICKER_PLACES_COUNT, b);
        }
        if (c != null)
        {
            z.a(context, j.LOCATION_PICKER_SELECTED_PLACE_INDEX, c);
        }
        if (g != null)
        {
            z.a(context, j.LOCATION_PICKER_SPEND_T, g);
        }
        z.a(context, ag.EVENT);
    }
}
