// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.os.AsyncTask;
import com.amazon.device.home.GroupedListHeroWidget;
import com.amazon.device.home.HomeManager;
import java.text.BreakIterator;

// Referenced classes of package com.whatsapp:
//            ag, asw, DialogToastActivity

public class zo
{

    public static boolean d;
    private HomeManager a;
    private GroupedListHeroWidget b;
    private Context c;
    private AsyncTask e;

    public zo(Context context)
    {
        c = context;
        a = HomeManager.getInstance(context);
    }

    static Context a(zo zo1)
    {
        return zo1.c;
    }

    static GroupedListHeroWidget a(zo zo1, GroupedListHeroWidget groupedlistherowidget)
    {
        zo1.b = groupedlistherowidget;
        return groupedlistherowidget;
    }

    private static String[] a(String s, int i)
    {
label0:
        {
            String as[] = new String[2];
            if (s.length() <= i)
            {
                as[0] = s;
                as[1] = "";
                if (!d)
                {
                    break label0;
                }
            }
            BreakIterator breakiterator = BreakIterator.getWordInstance();
            breakiterator.setText(s);
            int j = breakiterator.preceding(i);
            if (j != 0)
            {
                i = j;
            }
            as[0] = s.substring(0, i);
            as[1] = s.substring(i);
        }
        return as;
    }

    static GroupedListHeroWidget b(zo zo1)
    {
        return zo1.b;
    }

    static String[] b(String s, int i)
    {
        return a(s, i);
    }

    static HomeManager c(zo zo1)
    {
        return zo1.a;
    }

    public void a()
    {
        boolean flag = false;
        boolean flag1 = d;
        if (e != null)
        {
            e.cancel(true);
        }
        e = new ag(this);
        asw.a(e, new Void[0]);
        if (DialogToastActivity.g != 0)
        {
            if (!flag1)
            {
                flag = true;
            }
            d = flag;
        }
    }
}
