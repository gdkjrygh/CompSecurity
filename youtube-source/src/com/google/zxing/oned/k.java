// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.b;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class k
    implements e
{

    public k()
    {
    }

    protected static int a(int ai[], int ai1[], int i)
    {
        int j;
        int j1;
        int l1;
        l1 = ai.length;
        int l = 0;
        j1 = 0;
        j = 0;
        for (; l < l1; l++)
        {
            j += ai[l];
            j1 += ai1[l];
        }

        if (j >= j1) goto _L2; else goto _L1
_L1:
        return 0x7fffffff;
_L2:
        int i2 = (j << 8) / j1;
        int i1 = 0;
        j1 = 0;
        do
        {
label0:
            {
                if (i1 >= l1)
                {
                    break label0;
                }
                int k1 = ai[i1] << 8;
                int j2 = ai1[i1] * i2;
                if (k1 > j2)
                {
                    k1 -= j2;
                } else
                {
                    k1 = j2 - k1;
                }
                if (k1 > i * i2 >> 8)
                {
                    continue; /* Loop/switch isn't completed */
                }
                j1 += k1;
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return j1 / j;
    }

    protected static void a(a a1, int i, int ai[])
    {
        int j;
        int l;
        int j1;
        int k1;
        j1 = ai.length;
        Arrays.fill(ai, 0, j1, 0);
        k1 = a1.a();
        if (i >= k1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean flag;
        if (!a1.a(i))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag = false;
        l = i;
        i = ((flag) ? 1 : 0);
_L6:
        if (l >= k1)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (!(a1.a(l) ^ j))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ai[i] + 1;
_L4:
        l++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_47;
_L1:
        int i1 = i + 1;
        i = i1;
        if (i1 == j1)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        ai[i1] = 1;
        if (j == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = i;
        i = i1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        if (i != j1 && (i != j1 - 1 || l != k1))
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
    }

    private f b(b b1, Map map)
    {
        Object obj;
        Object obj1;
        Object obj2;
        int j;
        int l;
        int k1 = b1.a();
        int i1 = b1.b();
        obj = new a(k1);
        int i;
        int l1;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = 8;
        } else
        {
            j = 5;
        }
        l1 = Math.max(1, i1 >> j);
        if (i != 0)
        {
            i = i1;
        } else
        {
            i = 15;
        }
        j = 0;
_L5:
        if (j >= i) goto _L2; else goto _L1
_L1:
        int j1 = j + 1 >> 1;
        if ((j & 1) == 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            l = j1;
        } else
        {
            l = -j1;
        }
        j1 = (i1 >> 1) + l * l1;
        if (j1 < 0 || j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = b1.a(j1, ((a) (obj)));
        obj = obj1;
        l = 0;
_L4:
        obj2 = obj;
        obj1 = map;
        if (l >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l == 1)
        {
            ((a) (obj)).d();
            if (map != null && map.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK))
            {
                obj1 = new EnumMap(com/google/zxing/DecodeHintType);
                ((Map) (obj1)).putAll(map);
                ((Map) (obj1)).remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                map = ((Map) (obj1));
            }
        }
        obj1 = a(j1, ((a) (obj)), map);
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        ((f) (obj1)).a(ResultMetadataType.ORIENTATION, Integer.valueOf(180));
        obj2 = ((f) (obj1)).c();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj2[0] = new g((float)k1 - obj2[0].a() - 1.0F, obj2[0].b());
        obj2[1] = new g((float)k1 - obj2[1].a() - 1.0F, obj2[1].b());
        return ((f) (obj1));
        obj1;
        l++;
        if (true) goto _L4; else goto _L3
        obj1;
        obj1 = map;
        obj2 = obj;
_L3:
        j++;
        obj = obj2;
        map = ((Map) (obj1));
          goto _L5
_L2:
        throw NotFoundException.getNotFoundInstance();
    }

    protected static void b(a a1, int i, int ai[])
    {
        int j = ai.length;
        boolean flag = a1.a(i);
        do
        {
            if (i <= 0 || j < 0)
            {
                break;
            }
            int l = i - 1;
            i = l;
            if (a1.a(l) != flag)
            {
                j--;
                if (!flag)
                {
                    flag = true;
                    i = l;
                } else
                {
                    flag = false;
                    i = l;
                }
            }
        } while (true);
        if (j >= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            a(a1, i + 1, ai);
            return;
        }
    }

    public abstract f a(int i, a a1, Map map);

    public f a(b b1, Map map)
    {
        f f1;
        try
        {
            f1 = b(b1, map);
        }
        catch (Object obj)
        {
            int i;
            if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && b1.d())
            {
                b1 = b1.e();
                map = b(b1, map);
                obj = map.e();
                char c = '\u010E';
                i = c;
                if (obj != null)
                {
                    i = c;
                    if (((Map) (obj)).containsKey(ResultMetadataType.ORIENTATION))
                    {
                        i = (((Integer)((Map) (obj)).get(ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
                    }
                }
                map.a(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
                obj = map.c();
                if (obj != null)
                {
                    int j = b1.b();
                    for (i = 0; i < obj.length; i++)
                    {
                        obj[i] = new g((float)j - obj[i].b() - 1.0F, obj[i].a());
                    }

                }
                return map;
            } else
            {
                throw obj;
            }
        }
        return f1;
    }

    public void a()
    {
    }
}
