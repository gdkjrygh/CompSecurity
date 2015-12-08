// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.go.weatherex.weatheralert:
//            d

class e
    implements Comparator
{

    final SimpleDateFormat a;
    final d b;

    e(d d, SimpleDateFormat simpledateformat)
    {
        b = d;
        a = simpledateformat;
        super();
    }

    public int a(c c1, c c2)
    {
        c1 = c1.c();
        c2 = c2.c();
        if (TextUtils.isEmpty(c1) || TextUtils.isEmpty(c2))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        int i = a.parse(c1).compareTo(a.parse(c2));
        return -i;
        c1;
        c1.printStackTrace();
        return 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c)obj, (c)obj1);
    }
}
