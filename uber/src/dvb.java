// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class dvb
{

    public static String a(long l)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTimeInMillis(l);
        return calendar.getDisplayName(7, 1, Locale.getDefault());
    }

    private static String a(Context context, int i)
    {
        switch (i)
        {
        default:
            return "";

        case 0: // '\0'
            return context.getString(0x7f0701c0);

        case 1: // '\001'
            return context.getString(0x7f070273);

        case 2: // '\002'
            return context.getString(0x7f0702b3);
        }
    }

    public static String a(Context context, long l, String s)
    {
        long al[] = new long[3];
        long[] _tmp = al;
        al[0] = 0x5265c00L;
        al[1] = 0x36ee80L;
        al[2] = 60000L;
        if (l < 60000L)
        {
            return String.format(Locale.getDefault(), "%d %s", new Object[] {
                Integer.valueOf(0), context.getString(0x7f0702b8)
            });
        }
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < 3) 
        {
            if (l > al[i])
            {
                long l1 = l / al[i];
                String s1;
                if (l1 > 1L)
                {
                    s1 = b(context, i);
                } else
                {
                    s1 = a(context, i);
                }
                arraylist.add((new StringBuilder()).append(l1).append(" ").append(s1).toString());
                l -= al[i] * l1;
            }
            i++;
        }
        return gjw.a((new StringBuilder()).append(s).append(" ").toString()).a(arraylist);
    }

    public static String b(long l)
    {
        Date date = new Date();
        date.setTime(l);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("h:mma", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getDefault());
        return simpledateformat.format(date);
    }

    private static String b(Context context, int i)
    {
        switch (i)
        {
        default:
            return "";

        case 0: // '\0'
            return context.getString(0x7f0701c1);

        case 1: // '\001'
            return context.getString(0x7f070274);

        case 2: // '\002'
            return context.getString(0x7f0702b8);
        }
    }
}
