// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.wf.wellsfargomobile.b:
//            e, f

public class c
{

    private static final String a[] = {
        "native://mba/", "/nonce/", "/callback/", "/data/"
    };

    public c()
    {
    }

    public ArrayList a(String s)
    {
        ArrayList arraylist = new ArrayList();
        String as[] = a;
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s1 = as[i];
            int l = s.indexOf(s1);
            if (l != -1)
            {
                arraylist.add(new e(this, s1, l));
            }
        }

        Collections.sort(arraylist, new f(this, null));
        int j = 0;
        while (j < arraylist.size()) 
        {
            e e1 = (e)arraylist.get(j);
            Object obj;
            if (j < arraylist.size() - 1)
            {
                obj = (e)arraylist.get(j + 1);
                obj = s.substring(e1.b() + e.a(e1).length(), e.b(((e) (obj))));
            } else
            {
                obj = s.substring(e1.b() + e.a(e1).length());
            }
            e1.a(((String) (obj)));
            j++;
        }
        for (s = arraylist.iterator(); s.hasNext(); ((e)s.next()).d()) { }
        return arraylist;
    }

}
