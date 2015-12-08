// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;


// Referenced classes of package com.google.android.gms.appdatasearch:
//            l, SearchResults

final class m extends l
{

    final SearchResults c;
    private final String d;
    private final String e;

    m(SearchResults searchresults, String s, String s1)
    {
        c = searchresults;
        super(searchresults);
        d = s;
        e = s1;
        a = -1;
        a();
    }

    protected final void a()
    {
        do
        {
            a = a + 1;
            if (a >= c.getNumResults())
            {
                break;
            }
            int i = a;
            String s = c.kR[c.kQ[i]];
            int j = s.indexOf('-');
            boolean flag;
            if (j == d.length() && s.regionMatches(0, d, 0, j))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            flag = i;
            if (i != 0)
            {
                flag = i;
                if (e != null)
                {
                    i = s.length() - j - 1;
                    if (i == e.length() && s.regionMatches(j + 1, e, 0, i))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
        } while (!flag);
    }
}
