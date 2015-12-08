// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.aztec.b;
import com.google.zxing.oned.i;
import com.google.zxing.qrcode.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            e, ReaderException, NotFoundException, DecodeHintType, 
//            BarcodeFormat, b, f

public final class d
    implements e
{

    private Map a;
    private e b[];

    public d()
    {
    }

    private f b(com.google.zxing.b b1)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        e ae[];
        int j;
        int k;
        ae = b;
        k = ae.length;
        j = 0;
_L3:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ae[j];
        obj = ((e) (obj)).a(b1, a);
        return ((f) (obj));
        ReaderException readerexception;
        readerexception;
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        throw NotFoundException.getNotFoundInstance();
    }

    public final f a(com.google.zxing.b b1)
    {
        if (b == null)
        {
            a(((Map) (null)));
        }
        return b(b1);
    }

    public final f a(com.google.zxing.b b1, Map map)
    {
        a(map);
        return b(b1);
    }

    public final void a()
    {
        if (b != null)
        {
            e ae[] = b;
            int k = ae.length;
            for (int j = 0; j < k; j++)
            {
                ae[j].a();
            }

        }
    }

    public final void a(Map map)
    {
        boolean flag1 = false;
        a = map;
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
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
            collection = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED))
            {
                flag1 = true;
            }
            if (flag1 && !flag)
            {
                arraylist.add(new i(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE))
            {
                arraylist.add(new a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX))
            {
                arraylist.add(new com.google.zxing.datamatrix.a());
            }
            if (collection.contains(BarcodeFormat.AZTEC))
            {
                arraylist.add(new b());
            }
            if (collection.contains(BarcodeFormat.PDF_417))
            {
                arraylist.add(new com.google.zxing.pdf417.b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE))
            {
                arraylist.add(new com.google.zxing.a.a());
            }
            if (flag1 && flag)
            {
                arraylist.add(new i(map));
            }
        }
        if (arraylist.isEmpty())
        {
            if (!flag)
            {
                arraylist.add(new i(map));
            }
            arraylist.add(new a());
            arraylist.add(new com.google.zxing.datamatrix.a());
            arraylist.add(new b());
            arraylist.add(new com.google.zxing.pdf417.b());
            arraylist.add(new com.google.zxing.a.a());
            if (flag)
            {
                arraylist.add(new i(map));
            }
        }
        b = (e[])arraylist.toArray(new e[arraylist.size()]);
    }
}
