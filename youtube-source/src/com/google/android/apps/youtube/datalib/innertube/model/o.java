// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.dp;
import com.google.a.a.a.a.ff;
import com.google.a.a.a.a.fg;
import com.google.a.a.a.a.it;
import com.google.a.a.a.a.iu;
import com.google.a.a.a.a.iv;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            e, f, h, a, 
//            s, g, at, k, 
//            ah, aa, as, r

public final class o
{

    private final it a;
    private List b;
    private dp c;

    public o(it it1)
    {
        a = (it)com.google.android.apps.youtube.common.fromguava.c.a(it1);
    }

    public final List a()
    {
        iv aiv[];
        int i;
        int j;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        b = new ArrayList(a.b.length);
        aiv = a.b;
        j = aiv.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        obj = aiv[i];
        if (((iv) (obj)).m == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.add(new e(((iv) (obj)).m));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (((iv) (obj)).k != null)
        {
            b.add(new f(((iv) (obj)).k));
        } else
        if (((iv) (obj)).i != null)
        {
            b.add(new h(((iv) (obj)).i));
        } else
        if (((iv) (obj)).e != null)
        {
            b.add(new a(((iv) (obj)).e));
        } else
        if (((iv) (obj)).v != null)
        {
            b.add(new s(((iv) (obj)).v));
        } else
        if (((iv) (obj)).y != null)
        {
            b.add(new g(((iv) (obj)).y));
        } else
        if (((iv) (obj)).q != null)
        {
            b.add(new at(((iv) (obj)).q));
        } else
        {
label0:
            {
                if (((iv) (obj)).S == null)
                {
                    break label0;
                }
                if (k.a(((iv) (obj)).S))
                {
                    b.add(new k(((iv) (obj)).S));
                } else
                {
                    b.add(new ah(((iv) (obj)).S));
                }
            }
        }
          goto _L3
label1:
        {
            if (((iv) (obj)).l == null)
            {
                break MISSING_BLOCK_LABEL_424;
            }
            obj = ((iv) (obj)).l;
            com.google.android.apps.youtube.common.fromguava.c.a(obj);
            if (((ff) (obj)).j == null)
            {
                break label1;
            }
            if (((ff) (obj)).j.d != null)
            {
                obj = new aa(((ff) (obj)));
            } else
            {
                if (((ff) (obj)).j.b == null)
                {
                    break label1;
                }
                obj = new as(((ff) (obj)));
            }
        }
_L4:
        if (obj != null)
        {
            b.add(obj);
        }
          goto _L3
        obj = null;
          goto _L4
        if (((iv) (obj)).L != null)
        {
            b.add(new r(((iv) (obj)).L));
        }
          goto _L3
        return b;
    }

    public final dp b()
    {
        if (c == null)
        {
            c = new dp();
            iu aiu[] = a.c;
            int j = aiu.length;
            for (int i = 0; i < j; i++)
            {
                iu iu1 = aiu[i];
                c.c = iu1.b;
            }

        }
        return c;
    }
}
