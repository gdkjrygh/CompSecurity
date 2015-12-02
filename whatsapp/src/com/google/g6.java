// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google:
//            cB, gh, fw, gV, 
//            T, S, eB, aW, 
//            cE, ba, cv, bO, 
//            by, c6

public final class g6
    implements cB
{

    private Map a;
    private cB b[];

    public g6()
    {
    }

    private c6 b(by by)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        cB acb[];
        int i;
        int j;
        acb = b;
        j = acb.length;
        i = 0;
_L3:
        Object obj;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = acb[i];
        obj = ((cB) (obj)).a(by, a);
        return ((c6) (obj));
        gh gh1;
        gh1;
        i++;
        if (!fw.b) goto _L3; else goto _L2
_L2:
        throw gV.a();
    }

    public c6 a(by by)
    {
        if (b == null)
        {
            a(((Map) (null)));
        }
        return b(by);
    }

    public c6 a(by by, Map map)
    {
        a(map);
        return b(by);
    }

    public void a()
    {
        boolean flag = fw.b;
        if (b != null)
        {
            cB acb[] = b;
            int j = acb.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                acb[i].a();
                i++;
            } while (!flag);
        }
    }

    public void a(Map map)
    {
        boolean flag2 = fw.b;
        a = map;
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map != null && map.containsKey(T.TRY_HARDER))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(T.POSSIBLE_FORMATS);
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            boolean flag1;
            if (collection.contains(S.UPC_A) || collection.contains(S.UPC_E) || collection.contains(S.EAN_13) || collection.contains(S.EAN_8) || collection.contains(S.CODABAR) || collection.contains(S.CODE_39) || collection.contains(S.CODE_93) || collection.contains(S.CODE_128) || collection.contains(S.ITF) || collection.contains(S.RSS_14) || collection.contains(S.RSS_EXPANDED))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && !flag)
            {
                arraylist.add(new eB(map));
            }
            if (collection.contains(S.QR_CODE))
            {
                arraylist.add(new aW());
            }
            if (collection.contains(S.DATA_MATRIX))
            {
                arraylist.add(new cE());
            }
            if (collection.contains(S.AZTEC))
            {
                arraylist.add(new ba());
            }
            if (collection.contains(S.PDF_417))
            {
                arraylist.add(new cv());
            }
            if (collection.contains(S.MAXICODE))
            {
                arraylist.add(new bO());
            }
            if (flag1 && flag)
            {
                arraylist.add(new eB(map));
            }
        }
        if (arraylist.isEmpty())
        {
            if (!flag)
            {
                arraylist.add(new eB(map));
            }
            arraylist.add(new aW());
            arraylist.add(new cE());
            arraylist.add(new ba());
            arraylist.add(new cv());
            arraylist.add(new bO());
            if (flag)
            {
                arraylist.add(new eB(map));
            }
        }
        b = (cB[])arraylist.toArray(new cB[arraylist.size()]);
        if (gh.a != 0)
        {
            if (flag2)
            {
                flag2 = false;
            } else
            {
                flag2 = true;
            }
            fw.b = flag2;
        }
    }
}
