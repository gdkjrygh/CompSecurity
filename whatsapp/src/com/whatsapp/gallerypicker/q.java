// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImageGallery

class q extends GregorianCalendar
{

    final ImageGallery a;
    private int b;
    int c;

    public q(ImageGallery imagegallery, int i, Calendar calendar)
    {
        a = imagegallery;
        super();
        b = i;
        setTime(calendar.getTime());
    }

    public String toString()
    {
        switch (b)
        {
        default:
            return Integer.toString(get(1));

        case 1: // '\001'
            return a.getString(0x7f0e0303);

        case 2: // '\002'
            return a.getString(0x7f0e04a8);

        case 3: // '\003'
            return a.getString(0x7f0e0262);

        case 4: // '\004'
            return ImageGallery.a().format(getTime());
        }
    }
}
