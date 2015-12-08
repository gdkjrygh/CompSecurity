// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.oned.rss.e;
import com.google.zxing.oned.rss.expanded.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k, j, c, d, 
//            b, h, a

public final class i extends k
{

    private final k a[];

    public i(Map map)
    {
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E))
            {
                arraylist.add(new j(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39))
            {
                arraylist.add(new com.google.zxing.oned.c(flag));
            }
            if (collection.contains(BarcodeFormat.CODE_93))
            {
                arraylist.add(new d());
            }
            if (collection.contains(BarcodeFormat.CODE_128))
            {
                arraylist.add(new b());
            }
            if (collection.contains(BarcodeFormat.ITF))
            {
                arraylist.add(new h());
            }
            if (collection.contains(BarcodeFormat.CODABAR))
            {
                arraylist.add(new com.google.zxing.oned.a());
            }
            if (collection.contains(BarcodeFormat.RSS_14))
            {
                arraylist.add(new e());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED))
            {
                arraylist.add(new c());
            }
        }
        if (arraylist.isEmpty())
        {
            arraylist.add(new j(map));
            arraylist.add(new com.google.zxing.oned.c());
            arraylist.add(new com.google.zxing.oned.a());
            arraylist.add(new d());
            arraylist.add(new b());
            arraylist.add(new h());
            arraylist.add(new e());
            arraylist.add(new c());
        }
        a = (k[])arraylist.toArray(new k[arraylist.size()]);
    }

    public final f a(int l, a a1, Map map)
    {
        k ak[];
        int i1;
        int j1;
        ak = a;
        j1 = ak.length;
        i1 = 0;
_L2:
        Object obj;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ak[i1];
        obj = ((k) (obj)).a(l, a1, map);
        return ((f) (obj));
        ReaderException readerexception;
        readerexception;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        throw NotFoundException.getNotFoundInstance();
    }

    public final void a()
    {
        k ak[] = a;
        int i1 = ak.length;
        for (int l = 0; l < i1; l++)
        {
            ak[l].a();
        }

    }
}
