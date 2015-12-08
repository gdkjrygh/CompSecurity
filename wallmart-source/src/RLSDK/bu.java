// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            z, y, aj, aa, 
//            s, u, ac, ab, 
//            ad, t, v

public abstract class bu
    implements z
{

    public bu()
    {
    }

    protected static int a(int ai[], int ai1[], int i)
    {
        int j;
        int i1;
        int k1;
        k1 = ai.length;
        int k = 0;
        i1 = 0;
        j = 0;
        for (; k < k1; k++)
        {
            j += ai[k];
            i1 += ai1[k];
        }

        if (j >= i1) goto _L2; else goto _L1
_L1:
        return 0x7fffffff;
_L2:
        int l1 = (j << 8) / i1;
        int l = 0;
        i1 = 0;
        do
        {
label0:
            {
                if (l >= k1)
                {
                    break label0;
                }
                int j1 = ai[l] << 8;
                int i2 = ai1[l] * l1;
                if (j1 > i2)
                {
                    j1 -= i2;
                } else
                {
                    j1 = i2 - j1;
                }
                if (j1 > i * l1 >> 8)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 += j1;
                l++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return i1 / j;
    }

    protected static void a(aj aj1, int i, int ai[])
        throws y
    {
        int k;
        int l;
        int j1;
        int k1;
        j1 = ai.length;
        for (int j = 0; j < j1; j++)
        {
            ai[j] = 0;
        }

        k1 = aj1.b;
        if (i >= k1)
        {
            throw y.a();
        }
        boolean flag;
        if (!aj1.a(i))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        flag = false;
        l = i;
        i = ((flag) ? 1 : 0);
_L6:
        if (l >= k1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (!(aj1.a(l) ^ k))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ai[i] + 1;
_L4:
        l++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_58;
_L1:
        int i1 = i + 1;
        i = i1;
        if (i1 == j1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        ai[i1] = 1;
        if (k == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = i;
        i = i1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        if (i != j1 && (i != j1 - 1 || l != k1))
        {
            throw y.a();
        } else
        {
            return;
        }
    }

    private ab b(s s1, Hashtable hashtable)
        throws y
    {
        Object obj;
        Object obj1;
        Object obj2;
        int j;
        int k;
        int i1;
        int j1;
        j1 = s1.a();
        int l = s1.b();
        obj = new aj(j1);
        Object obj3;
        int i;
        int k1;
        if (hashtable != null && hashtable.containsKey(u.d))
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
        k1 = Math.max(1, l >> j);
        if (i != 0)
        {
            i = l;
        } else
        {
            i = 15;
        }
        j = 0;
_L5:
        if (j >= i) goto _L2; else goto _L1
_L1:
        i1 = j + 1 >> 1;
        if ((j & 1) == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            k = i1;
        } else
        {
            k = -i1;
        }
        i1 = (l >> 1) + k * k1;
        if (i1 < 0 || i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = s1.a(i1, ((aj) (obj)));
        obj = obj1;
        k = 0;
_L4:
        obj2 = obj;
        obj1 = hashtable;
        if (k >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = hashtable;
        if (k == 1)
        {
            ((aj) (obj)).a();
            obj1 = hashtable;
            if (hashtable != null)
            {
                obj1 = hashtable;
                if (hashtable.containsKey(u.h))
                {
                    obj1 = new Hashtable();
                    obj2 = hashtable.keys();
                    do
                    {
                        if (!((Enumeration) (obj2)).hasMoreElements())
                        {
                            break;
                        }
                        obj3 = ((Enumeration) (obj2)).nextElement();
                        if (!obj3.equals(u.h))
                        {
                            ((Hashtable) (obj1)).put(obj3, hashtable.get(obj3));
                        }
                    } while (true);
                }
            }
        }
        hashtable = a(i1, ((aj) (obj)), ((Hashtable) (obj1)));
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        hashtable.a(ac.b, new Integer(180));
        obj2 = hashtable.b();
        obj2[0] = new ad((float)j1 - obj2[0].a() - 1.0F, obj2[0].b());
        obj2[1] = new ad((float)j1 - obj2[1].a() - 1.0F, obj2[1].b());
        return hashtable;
        hashtable;
        k++;
        hashtable = ((Hashtable) (obj1));
        if (true) goto _L4; else goto _L3
        obj1;
        obj1 = hashtable;
        obj2 = obj;
_L3:
        j++;
        obj = obj2;
        hashtable = ((Hashtable) (obj1));
          goto _L5
_L2:
        throw y.a();
    }

    protected static void b(aj aj1, int i, int ai[])
        throws y
    {
        int j = ai.length;
        boolean flag = aj1.a(i);
        do
        {
            if (i <= 0 || j < 0)
            {
                break;
            }
            int k = i - 1;
            i = k;
            if (aj1.a(k) != flag)
            {
                j--;
                if (!flag)
                {
                    flag = true;
                    i = k;
                } else
                {
                    flag = false;
                    i = k;
                }
            }
        } while (true);
        if (j >= 0)
        {
            throw y.a();
        } else
        {
            a(aj1, i + 1, ai);
            return;
        }
    }

    public abstract ab a(int i, aj aj1, Hashtable hashtable)
        throws y, t, v;

    public ab a(s s1, Hashtable hashtable)
        throws y, v
    {
        ab ab1;
        try
        {
            ab1 = b(s1, hashtable);
        }
        catch (y y1)
        {
            boolean flag;
            if (hashtable != null && hashtable.containsKey(u.d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                s1.d();
            }
            throw y1;
        }
        return ab1;
    }

    public void a()
    {
    }
}
