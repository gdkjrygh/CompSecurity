// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.whatsapp:
//            MediaGallery

class bt extends GregorianCalendar
{

    private int a;
    final MediaGallery b;

    public bt(MediaGallery mediagallery, int i, Calendar calendar)
    {
        b = mediagallery;
        super();
        a = i;
        setTime(calendar.getTime());
    }

    public String toString()
    {
        switch (a)
        {
        default:
            return Integer.toString(get(1));

        case 1: // '\001'
            return b.getString(0x7f0e0303);

        case 2: // '\002'
            return b.getString(0x7f0e04a8);

        case 3: // '\003'
            return b.getString(0x7f0e0262);

        case 4: // '\004'
            return MediaGallery.f().format(getTime());
        }
    }
}
