// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.aztec.a.a;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.common.d;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.h;
import java.util.Map;

// Referenced classes of package com.google.zxing.aztec:
//            a

public final class b
    implements e
{

    public b()
    {
    }

    public final f a(com.google.zxing.b b1, Map map)
    {
        Object obj2;
        a a1;
        obj2 = null;
        a1 = new a(b1.c());
        Object obj;
        obj = a1.a(false);
        b1 = ((com.google.zxing.aztec.a) (obj)).e();
        d d1 = (new Decoder()).a(((com.google.zxing.aztec.a) (obj)));
        Object obj1;
        obj1 = null;
        obj = b1;
        b1 = d1;
        break MISSING_BLOCK_LABEL_49;
        obj1;
        obj = null;
_L3:
        b1 = null;
          goto _L1
        obj1;
        obj = null;
_L2:
        Object obj3 = null;
        b1 = null;
        obj2 = obj1;
        obj1 = obj3;
_L1:
        if (b1 == null)
        {
            try
            {
                b1 = a1.a(true);
                obj = b1.e();
                b1 = (new Decoder()).a(b1);
            }
            // Misplaced declaration of an exception variable
            catch (com.google.zxing.b b1)
            {
                if (obj1 != null)
                {
                    throw obj1;
                }
                if (obj2 != null)
                {
                    throw obj2;
                } else
                {
                    throw b1;
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.google.zxing.b b1)
            {
                if (obj1 != null)
                {
                    throw obj1;
                }
                if (obj2 != null)
                {
                    throw obj2;
                } else
                {
                    throw b1;
                }
            }
        }
        if (map != null)
        {
            map = (h)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (map != null)
            {
                int j = obj.length;
                for (int i = 0; i < j; i++)
                {
                    map.a(obj[i]);
                }

            }
        }
        map = new f(b1.b(), b1.a(), ((com.google.zxing.g []) (obj)), BarcodeFormat.AZTEC);
        obj = b1.c();
        if (obj != null)
        {
            map.a(ResultMetadataType.BYTE_SEGMENTS, obj);
        }
        b1 = b1.d();
        if (b1 != null)
        {
            map.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, b1);
        }
        return map;
        obj1;
        obj = b1;
          goto _L2
        obj1;
        obj = b1;
          goto _L3
    }

    public final void a()
    {
    }
}
