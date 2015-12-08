// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.text.TextUtils;
import com.google.a.a.a.a.rv;
import com.google.a.a.a.a.rx;
import com.google.a.a.a.a.xg;
import com.google.a.a.a.a.xh;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            al

public final class bb
{

    private xg a;
    private CharSequence b;
    private CharSequence c;
    private List d;

    public bb(xg xg1)
    {
        a = (xg)com.google.android.apps.youtube.common.fromguava.c.a(xg1);
    }

    public final CharSequence a()
    {
        if (b == null && a.b != null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
        }
        return b;
    }

    public final CharSequence b()
    {
        if (c == null && a.e != null)
        {
            com.google.a.a.a.a.fk afk[] = a.e;
            int j = afk.length;
            int i = 0;
            while (i < j) 
            {
                android.text.Spanned spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(afk[i]);
                if (TextUtils.isEmpty(c))
                {
                    c = spanned;
                } else
                {
                    c = TextUtils.concat(new CharSequence[] {
                        c, System.getProperty("line.separator"), spanned
                    });
                }
                i++;
            }
        }
        return c;
    }

    public final List c()
    {
        if (d == null && a.c != null)
        {
            if (a.c.d != null)
            {
                rv rv1 = a.c.d;
                if (rv1.b != null)
                {
                    d = new ArrayList(rv1.b.length);
                    rx arx[] = rv1.b;
                    int j = arx.length;
                    for (int i = 0; i < j; i++)
                    {
                        rx rx1 = arx[i];
                        if (rx1.b != null)
                        {
                            d.add(new al(rx1.b));
                        }
                    }

                }
            }
            if (d == null)
            {
                d = Collections.emptyList();
            }
        }
        return d;
    }
}
