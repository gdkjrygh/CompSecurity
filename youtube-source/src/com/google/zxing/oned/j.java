// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k, e, f, q, 
//            p, l

public final class j extends k
{

    private final p a[];

    public j(Map map)
    {
        ArrayList arraylist;
        if (map == null)
        {
            map = null;
        } else
        {
            map = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        arraylist = new ArrayList();
        if (map == null) goto _L2; else goto _L1
_L1:
        if (!map.contains(BarcodeFormat.EAN_13)) goto _L4; else goto _L3
_L3:
        arraylist.add(new com.google.zxing.oned.e());
_L6:
        if (map.contains(BarcodeFormat.EAN_8))
        {
            arraylist.add(new com.google.zxing.oned.f());
        }
        if (map.contains(BarcodeFormat.UPC_E))
        {
            arraylist.add(new q());
        }
_L2:
        if (arraylist.isEmpty())
        {
            arraylist.add(new com.google.zxing.oned.e());
            arraylist.add(new com.google.zxing.oned.f());
            arraylist.add(new q());
        }
        a = (p[])arraylist.toArray(new p[arraylist.size()]);
        return;
_L4:
        if (map.contains(BarcodeFormat.UPC_A))
        {
            arraylist.add(new l());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final f a(int i, a a1, Map map)
    {
        int ai[];
        p ap[];
        int i1;
        int j1;
        ai = com.google.zxing.oned.p.a(a1);
        ap = a;
        j1 = ap.length;
        i1 = 0;
_L2:
        Object obj;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ap[i1];
        obj = ((p) (obj)).a(i, a1, ai, map);
        if (((f) (obj)).d() == BarcodeFormat.EAN_13 && ((f) (obj)).a().charAt(0) == '0')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (map == null)
        {
            a1 = null;
        } else
        {
            a1 = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        if (a1 == null || a1.contains(BarcodeFormat.UPC_A))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i != 0 && i1 != 0)
        {
            a1 = new f(((f) (obj)).a().substring(1), ((f) (obj)).b(), ((f) (obj)).c(), BarcodeFormat.UPC_A);
            a1.a(((f) (obj)).e());
            return a1;
        } else
        {
            return ((f) (obj));
        }
        ReaderException readerexception;
        readerexception;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        throw NotFoundException.getNotFoundInstance();
    }

    public final void a()
    {
        p ap[] = a;
        int i1 = ap.length;
        for (int i = 0; i < i1; i++)
        {
            ap[i].a();
        }

    }
}
