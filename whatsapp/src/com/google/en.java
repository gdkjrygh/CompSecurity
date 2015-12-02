// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google:
//            eH, S, es, e7, 
//            e8, eA, e9, T, 
//            gh, c6, gV, cB, 
//            bQ

public final class en extends eH
{

    private final e9 b[];

    public en(Map map)
    {
label0:
        {
label1:
            {
                super();
                ArrayList arraylist;
                if (map == null)
                {
                    map = null;
                } else
                {
                    map = (Collection)map.get(T.POSSIBLE_FORMATS);
                }
                arraylist = new ArrayList();
                if (map == null)
                {
                    break label0;
                }
                if (map.contains(S.EAN_13))
                {
                    arraylist.add(new es());
                    if (!eH.a)
                    {
                        break label1;
                    }
                }
                if (map.contains(S.UPC_A))
                {
                    arraylist.add(new e7());
                }
            }
            if (map.contains(S.EAN_8))
            {
                arraylist.add(new e8());
            }
            if (map.contains(S.UPC_E))
            {
                arraylist.add(new eA());
            }
        }
        if (arraylist.isEmpty())
        {
            arraylist.add(new es());
            arraylist.add(new e8());
            arraylist.add(new eA());
        }
        b = (e9[])arraylist.toArray(new e9[arraylist.size()]);
    }

    public c6 a(int i, bQ bq, Map map)
    {
        int ai[];
        e9 ae9[];
        int j;
        boolean flag;
        int k;
        flag = false;
        ai = e9.a(bq);
        ae9 = b;
        k = ae9.length;
        j = 0;
_L3:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ae9[j];
        obj = ((e9) (obj)).a(i, bq, ai, map);
        S s;
        bq = ((c6) (obj)).d();
        s = S.EAN_13;
        if (bq != s)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        boolean flag1;
        try
        {
            i = ((c6) (obj)).e().charAt(0);
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            throw bq;
        }
        if (i != 48)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        i = 1;
_L1:
label0:
        {
            if (map == null)
            {
                bq = null;
            } else
            {
                bq = (Collection)map.get(T.POSSIBLE_FORMATS);
            }
            if (bq != null)
            {
                try
                {
                    flag1 = bq.contains(S.UPC_A);
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    throw bq;
                }
                j = ((flag) ? 1 : 0);
                if (!flag1)
                {
                    break label0;
                }
            }
            j = 1;
        }
        if (i != 0 && j != 0)
        {
            bq = new c6(((c6) (obj)).e().substring(1), ((c6) (obj)).c(), ((c6) (obj)).a(), S.UPC_A);
            bq.a(((c6) (obj)).b());
            return bq;
        } else
        {
            return ((c6) (obj));
        }
        bq;
        throw bq;
        i = 0;
          goto _L1
        gh gh1;
        gh1;
        j++;
        if (!eH.a) goto _L3; else goto _L2
_L2:
        throw gV.a();
    }

    public void a()
    {
        boolean flag = eH.a;
        e9 ae9[] = b;
        int j = ae9.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            ae9[i].a();
            i++;
        } while (!flag);
    }
}
