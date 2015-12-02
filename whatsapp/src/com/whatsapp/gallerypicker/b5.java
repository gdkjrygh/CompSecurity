// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ai, ImagePreview, an, bo, 
//            aw, t

public class b5
    implements ai
{

    private static final String z[];
    private long a[];
    private final PriorityQueue b;
    private int c;
    private final ai d[];
    private int e;
    private int f[];

    public b5(ai aai[], int i)
    {
        int j = ImagePreview.B;
        super();
        d = (ai[])aai.clone();
        int k;
        if (i == 1)
        {
            aai = new an(null);
        } else
        {
            aai = new aw(null);
        }
        b = new PriorityQueue(4, aai);
        a = new long[16];
        e = 0;
        f = new int[d.length];
        c = -1;
        b.clear();
        k = d.length;
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            aai = new bo(d[i], i);
            try
            {
                if (aai.a())
                {
                    b.add(aai);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ai aai[])
            {
                throw aai;
            }
            i++;
        } while (j == 0);
    }

    private bo a()
    {
        bo bo1 = (bo)b.poll();
        if (bo1 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((bo) (obj));
_L2:
        if (bo1.b != c)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = e - 1;
        long al[];
        int j;
        try
        {
            obj = a;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            throw indexoutofboundsexception;
        }
        obj[i] = obj[i] + 1L;
        obj = bo1;
        if (ImagePreview.B == 0) goto _L4; else goto _L3
_L3:
        c = bo1.b;
        i = a.length;
        j = e;
        if (i == j)
        {
            al = new long[e * 2];
            System.arraycopy(a, 0, al, 0, e);
            a = al;
        }
        al = a;
        i = e;
        e = i + 1;
        al[i] = (long)c << 32 | 1L;
        return bo1;
    }

    public t a(int i)
    {
        int j;
        int i1;
        j = 0;
        i1 = ImagePreview.B;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (i <= d())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        throw new IndexOutOfBoundsException((new StringBuilder()).append(z[1]).append(i).append(z[0]).append(d()).toString());
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        throw indexoutofboundsexception;
        int l;
        int j1;
        Arrays.fill(f, 0);
        j1 = e;
        l = 0;
_L4:
        int k;
        int k1;
        int l1;
        k = j;
        if (l >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        long l2 = a[l];
        l1 = (int)(-1L & l2);
        k1 = (int)(l2 >> 32);
        if (j + l1 <= i) goto _L2; else goto _L1
_L1:
        Object obj;
        k = f[k1];
        obj = d[k1].a((i - j) + k);
_L6:
        return ((t) (obj));
_L2:
        k = j + l1;
        obj = f;
        obj[k1] = l1 + obj[k1];
        l++;
        j = k;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        t t;
        bo bo1;
        bo1 = a();
        if (bo1 == null)
        {
            return null;
        }
        if (k != i)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        t = bo1.a;
        obj = t;
        if (!bo1.a()) goto _L6; else goto _L5
_L5:
        b.add(bo1);
        return t;
        obj;
        throw obj;
        try
        {
            if (bo1.a())
            {
                b.add(bo1);
            }
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception1)
        {
            throw indexoutofboundsexception1;
        }
        k++;
          goto _L3
    }

    public void a()
    {
        int j = ImagePreview.B;
        ai aai[] = d;
        int k = aai.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            aai[i].a();
            i++;
        } while (j == 0);
    }

    public void a(ContentObserver contentobserver)
    {
        int j = ImagePreview.B;
        ai aai[] = d;
        int k = aai.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            aai[i].a(contentobserver);
            i++;
        } while (j == 0);
    }

    public void b()
    {
        int j = ImagePreview.B;
        int i = 0;
        int k = d.length;
        do
        {
            if (i >= k)
            {
                break;
            }
            d[i].b();
            i++;
        } while (j == 0);
    }

    public void b(ContentObserver contentobserver)
    {
        int j = ImagePreview.B;
        ai aai[] = d;
        int k = aai.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            aai[i].b(contentobserver);
            i++;
        } while (j == 0);
    }

    public HashMap c()
    {
        int j = ImagePreview.B;
        HashMap hashmap = new HashMap();
        ai aai[] = d;
        int k = aai.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            hashmap.putAll(aai[i].c());
            i++;
        } while (j == 0);
        return hashmap;
    }

    public int d()
    {
        int i = 0;
        int l = ImagePreview.B;
        ai aai[] = d;
        int i1 = aai.length;
        int j = 0;
        int k;
        do
        {
            k = i;
            if (j >= i1)
            {
                break;
            }
            k = i + aai[j].d();
            j++;
            i = k;
        } while (l == 0);
        return k;
    }

    public boolean e()
    {
        int j = ImagePreview.B;
        ai aai[] = d;
        int k = aai.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            ai ai1 = aai[i];
            boolean flag;
            try
            {
                flag = ai1.e();
            }
            catch (IndexOutOfBoundsException indexoutofboundsexception)
            {
                throw indexoutofboundsexception;
            }
            if (!flag)
            {
                return false;
            }
            i++;
        } while (j == 0);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "W\001Zm1\030\b\017kp\031\tJ9|\026\026\017pbW";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\036\000K|iW";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 17;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 119;
          goto _L9
_L5:
        byte0 = 110;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 25;
          goto _L9
    }
}
