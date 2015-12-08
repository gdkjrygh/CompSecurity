// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            y, ay, ad, au, 
//            ak, an, ar, ao

public final class bj
{
    private static final class a
    {

        private final ad a;
        private final ad b;
        private final int c;

        public final ad a()
        {
            return a;
        }

        public final ad b()
        {
            return b;
        }

        public final int c()
        {
            return c;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(a).append("/").append(b).append('/').append(c).toString();
        }

        private a(ad ad1, ad ad2, int i)
        {
            a = ad1;
            b = ad2;
            c = i;
        }

        a(ad ad1, ad ad2, int i, byte byte0)
        {
            this(ad1, ad2, i);
        }
    }

    private static final class b
        implements ao
    {

        public final int a(Object obj, Object obj1)
        {
            return ((a)obj).c() - ((a)obj1).c();
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final Integer a[] = {
        new Integer(0), new Integer(1), new Integer(2), new Integer(3), new Integer(4)
    };
    private final ak b;
    private final ay c;

    public bj(ak ak1)
        throws y
    {
        b = ak1;
        c = new ay(ak1);
    }

    private static int a(ad ad1, ad ad2)
    {
        return (int)((float)Math.sqrt((ad1.a() - ad2.a()) * (ad1.a() - ad2.a()) + (ad1.b() - ad2.b()) * (ad1.b() - ad2.b())) + 0.5F);
    }

    private static ak a(ak ak1, ad ad1, ad ad2, ad ad3, ad ad4, int i, int j)
        throws y
    {
        return au.a().a(ak1, i, j, 0.5F, 0.5F, (float)i - 0.5F, 0.5F, (float)i - 0.5F, (float)j - 0.5F, 0.5F, (float)j - 0.5F, ad1.a(), ad1.b(), ad4.a(), ad4.b(), ad3.a(), ad3.b(), ad2.a(), ad2.b());
    }

    private static void a(Hashtable hashtable, ad ad1)
    {
        Integer integer = (Integer)hashtable.get(ad1);
        if (integer == null)
        {
            integer = a[1];
        } else
        {
            integer = a[integer.intValue() + 1];
        }
        hashtable.put(ad1, integer);
    }

    private boolean a(ad ad1)
    {
        return ad1.a() >= 0.0F && ad1.a() < (float)b.a && ad1.b() > 0.0F && ad1.b() < (float)b.b;
    }

    private a b(ad ad1, ad ad2)
    {
        int j = (int)ad1.a();
        int i = (int)ad1.b();
        int k1 = (int)ad2.a();
        int l1 = (int)ad2.b();
        ak ak1;
        int k;
        int i1;
        boolean flag;
        int i2;
        int j2;
        int k2;
        int l2;
        int j3;
        int k3;
        boolean flag1;
        if (Math.abs(l1 - i) > Math.abs(k1 - j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            int l = k1;
            k1 = l1;
            int j1 = j;
            l1 = l;
            j = i;
            i = j1;
        }
        j3 = Math.abs(l1 - i);
        k3 = Math.abs(k1 - j);
        k2 = -j3;
        if (j < k1)
        {
            i2 = 1;
        } else
        {
            i2 = -1;
        }
        if (i < l1)
        {
            j2 = 1;
        } else
        {
            j2 = -1;
        }
        l2 = 0;
        ak1 = b;
        if (flag)
        {
            k = j;
        } else
        {
            k = i;
        }
        if (flag)
        {
            i1 = i;
        } else
        {
            i1 = j;
        }
        flag1 = ak1.a(k, i1);
        k2 >>= 1;
        k = l2;
        do
        {
            l2 = k;
            if (i == l1)
            {
                break;
            }
            ak ak2 = b;
            int i3;
            boolean flag2;
            boolean flag3;
            if (flag)
            {
                i1 = j;
            } else
            {
                i1 = i;
            }
            if (flag)
            {
                l2 = i;
            } else
            {
                l2 = j;
            }
            flag3 = ak2.a(i1, l2);
            i1 = k;
            flag2 = flag1;
            if (flag3 != flag1)
            {
                i1 = k + 1;
                flag2 = flag3;
            }
            i3 = k2 + k3;
            k = i3;
            k2 = j;
            if (i3 > 0)
            {
                l2 = i1;
                if (j == k1)
                {
                    break;
                }
                k2 = j + i2;
                k = i3 - j3;
            }
            i += j2;
            l2 = k;
            j = k2;
            k = i1;
            flag1 = flag2;
            k2 = l2;
        } while (true);
        return new a(ad1, ad2, l2, (byte)0);
    }

    public final ar a()
        throws y
    {
        ad aad[] = c.a();
        ad ad2 = aad[0];
        ad ad3 = aad[1];
        ad ad4 = aad[2];
        ad ad5 = aad[3];
        Object obj1 = new Vector(4);
        ((Vector) (obj1)).addElement(b(ad2, ad3));
        ((Vector) (obj1)).addElement(b(ad2, ad4));
        ((Vector) (obj1)).addElement(b(ad3, ad5));
        ((Vector) (obj1)).addElement(b(ad4, ad5));
        an.a(((Vector) (obj1)), new b((byte)0));
        Object obj = (a)((Vector) (obj1)).elementAt(0);
        obj1 = (a)((Vector) (obj1)).elementAt(1);
        Hashtable hashtable = new Hashtable();
        a(hashtable, ((a) (obj)).a());
        a(hashtable, ((a) (obj)).b());
        a(hashtable, ((a) (obj1)).a());
        a(hashtable, ((a) (obj1)).b());
        Object obj3 = hashtable.keys();
        Object obj2 = null;
        obj1 = null;
        ad ad1 = null;
        while (((Enumeration) (obj3)).hasMoreElements()) 
        {
            obj = (ad)((Enumeration) (obj3)).nextElement();
            if (((Integer)hashtable.get(obj)).intValue() == 2)
            {
                obj2 = obj;
            } else
            if (obj1 == null)
            {
                obj1 = obj;
            } else
            {
                ad1 = ((ad) (obj));
            }
        }
        if (obj1 == null || obj2 == null || ad1 == null)
        {
            throw y.a();
        }
        obj = new ad[3];
        obj[0] = ((ad) (obj1));
        obj[1] = ((ad) (obj2));
        obj[2] = ad1;
        ad.a(((ad []) (obj)));
        obj3 = obj[0];
        ad ad6 = obj[1];
        ad ad7 = obj[2];
        float f;
        float f1;
        float f2;
        int i;
        int j;
        int k;
        if (!hashtable.containsKey(ad2))
        {
            obj = ad2;
        } else
        if (!hashtable.containsKey(ad3))
        {
            obj = ad3;
        } else
        if (!hashtable.containsKey(ad4))
        {
            obj = ad4;
        } else
        {
            obj = ad5;
        }
        k = b(ad7, ((ad) (obj))).c();
        j = b(((ad) (obj3)), ((ad) (obj))).c();
        i = k;
        if ((k & 1) == 1)
        {
            i = k + 1;
        }
        k = i + 2;
        i = j;
        if ((j & 1) == 1)
        {
            i = j + 1;
        }
        i += 2;
        if (k * 4 < i * 7 && i * 4 < k * 7) goto _L2; else goto _L1
_L1:
        f = (float)a(ad6, ((ad) (obj3))) / (float)k;
        j = a(ad7, ((ad) (obj)));
        f1 = (((ad) (obj)).a() - ad7.a()) / (float)j;
        f2 = (((ad) (obj)).b() - ad7.b()) / (float)j;
        obj2 = new ad(f1 * f + ((ad) (obj)).a(), f * f2 + ((ad) (obj)).b());
        f = (float)a(ad6, ad7) / (float)i;
        j = a(((ad) (obj3)), ((ad) (obj)));
        f1 = (((ad) (obj)).a() - ((ad) (obj3)).a()) / (float)j;
        f2 = (((ad) (obj)).b() - ((ad) (obj3)).b()) / (float)j;
        ad1 = new ad(f1 * f + ((ad) (obj)).a(), f * f2 + ((ad) (obj)).b());
        if (a(((ad) (obj2)))) goto _L4; else goto _L3
_L3:
        if (a(ad1)) goto _L6; else goto _L5
_L5:
        obj1 = null;
_L8:
        obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = obj;
        }
        j = b(ad7, ((ad) (obj2))).c();
        k = b(((ad) (obj3)), ((ad) (obj2))).c();
        i = j;
        if ((j & 1) == 1)
        {
            i = j + 1;
        }
        j = k;
        if ((k & 1) == 1)
        {
            j = k + 1;
        }
        obj = a(b, ad7, ad6, ((ad) (obj3)), ((ad) (obj2)), i, j);
_L13:
        return new ar(((ak) (obj)), new ad[] {
            ad7, ad6, obj3, obj2
        });
_L4:
        obj1 = obj2;
        if (!a(ad1)) goto _L8; else goto _L7
_L7:
        obj1 = obj2;
        if (Math.abs(k - b(ad7, ((ad) (obj2))).c()) + Math.abs(i - b(((ad) (obj3)), ((ad) (obj2))).c()) <= Math.abs(k - b(ad7, ad1).c()) + Math.abs(i - b(((ad) (obj3)), ad1).c())) goto _L8; else goto _L6
_L6:
        obj1 = ad1;
          goto _L8
_L2:
        i = Math.min(i, k);
        f = (float)a(ad6, ((ad) (obj3))) / (float)i;
        j = a(ad7, ((ad) (obj)));
        f1 = (((ad) (obj)).a() - ad7.a()) / (float)j;
        f2 = (((ad) (obj)).b() - ad7.b()) / (float)j;
        obj2 = new ad(f1 * f + ((ad) (obj)).a(), f * f2 + ((ad) (obj)).b());
        f = (float)a(ad6, ((ad) (obj3))) / (float)i;
        i = a(((ad) (obj3)), ((ad) (obj)));
        f1 = (((ad) (obj)).a() - ((ad) (obj3)).a()) / (float)i;
        f2 = (((ad) (obj)).b() - ((ad) (obj3)).b()) / (float)i;
        ad1 = new ad(f1 * f + ((ad) (obj)).a(), f * f2 + ((ad) (obj)).b());
        if (a(((ad) (obj2)))) goto _L10; else goto _L9
_L9:
        if (a(ad1)) goto _L12; else goto _L11
_L11:
        obj1 = null;
_L15:
        obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = obj;
        }
        j = Math.max(b(ad7, ((ad) (obj2))).c(), b(((ad) (obj3)), ((ad) (obj2))).c()) + 1;
        i = j;
        if ((j & 1) == 1)
        {
            i = j + 1;
        }
        obj = a(b, ad7, ad6, ((ad) (obj3)), ((ad) (obj2)), i, i);
          goto _L13
_L10:
        obj1 = obj2;
        if (!a(ad1)) goto _L15; else goto _L14
_L14:
        obj1 = obj2;
        if (Math.abs(b(ad7, ((ad) (obj2))).c() - b(((ad) (obj3)), ((ad) (obj2))).c()) <= Math.abs(b(ad7, ad1).c() - b(((ad) (obj3)), ad1).c())) goto _L15; else goto _L12
_L12:
        obj1 = ad1;
          goto _L15
    }

}
