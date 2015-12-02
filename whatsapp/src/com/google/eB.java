// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google:
//            eH, T, S, en, 
//            eW, eZ, ea, er, 
//            eU, eD, eq, gh, 
//            gV, cB, bQ, c6

public final class eB extends eH
{

    private final eH b[];

    public eB(Map map)
    {
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(T.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(T.ASSUME_CODE_39_CHECK_DIGIT) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(S.EAN_13) || collection.contains(S.UPC_A) || collection.contains(S.EAN_8) || collection.contains(S.UPC_E))
            {
                arraylist.add(new en(map));
            }
            if (collection.contains(S.CODE_39))
            {
                arraylist.add(new eW(flag));
            }
            if (collection.contains(S.CODE_93))
            {
                arraylist.add(new eZ());
            }
            if (collection.contains(S.CODE_128))
            {
                arraylist.add(new ea());
            }
            if (collection.contains(S.ITF))
            {
                arraylist.add(new er());
            }
            if (collection.contains(S.CODABAR))
            {
                arraylist.add(new eU());
            }
            if (collection.contains(S.RSS_14))
            {
                arraylist.add(new eD());
            }
            if (collection.contains(S.RSS_EXPANDED))
            {
                arraylist.add(new eq());
            }
        }
        if (arraylist.isEmpty())
        {
            arraylist.add(new en(map));
            arraylist.add(new eW());
            arraylist.add(new eU());
            arraylist.add(new eZ());
            arraylist.add(new ea());
            arraylist.add(new er());
            arraylist.add(new eD());
            arraylist.add(new eq());
        }
        b = (eH[])arraylist.toArray(new eH[arraylist.size()]);
    }

    public c6 a(int i, bQ bq, Map map)
    {
        eH aeh[];
        int j;
        int k;
        aeh = b;
        k = aeh.length;
        j = 0;
_L2:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aeh[j];
        obj = ((eH) (obj)).a(i, bq, map);
        return ((c6) (obj));
        gh gh1;
        gh1;
        j++;
        if (!eH.a) goto _L2; else goto _L1
_L1:
        throw gV.a();
    }

    public void a()
    {
        boolean flag = eH.a;
        eH aeh[] = b;
        int j = aeh.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            aeh[i].a();
            i++;
        } while (!flag);
    }
}
