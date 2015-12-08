// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            bc, ba, az

public final class bb
{

    private final az a;

    public bb(az az1)
    {
        a = az1;
    }

    public final void a(int ai[], int i)
        throws bc
    {
        Object aobj[];
        boolean flag;
        boolean flag1;
        ba ba1 = new ba(a, ai);
        aobj = new int[i];
        flag1 = a.equals(az.f);
        flag = true;
        int j = 0;
        while (j < i) 
        {
            az az1 = a;
            int i2;
            if (flag1)
            {
                i2 = j + 1;
            } else
            {
                i2 = j;
            }
            i2 = ba1.b(az1.a(i2));
            aobj[aobj.length - 1 - j] = i2;
            if (i2 != 0)
            {
                flag = false;
            }
            j++;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1 = new ba(a, ((int []) (aobj)));
        Object obj2 = a.a(i, 1);
        Object obj;
        Object obj3;
        ba ba2;
        ba ba3;
        ba ba4;
        ba ba5;
        int k2;
        int l2;
        if (((ba) (obj2)).a() < ((ba) (obj1)).a())
        {
            obj = obj1;
            obj1 = obj2;
        } else
        {
            obj = obj2;
        }
        ba3 = a.b();
        ba5 = a.a();
        ba2 = a.a();
        ba4 = a.b();
        obj2 = obj;
        obj3 = obj1;
        obj = ba5;
        obj1 = ba4;
        Object obj4;
        for (; ((ba) (obj3)).a() >= i / 2; obj3 = obj4)
        {
            if (((ba) (obj3)).b())
            {
                throw new bc("r_{i-1} was zero");
            }
            obj4 = a.a();
            int k = ((ba) (obj3)).a(((ba) (obj3)).a());
            k = a.c(k);
            int j1;
            int j2;
            for (; ((ba) (obj2)).a() >= ((ba) (obj3)).a() && !((ba) (obj2)).b(); obj2 = ((ba) (obj2)).a(((ba) (obj3)).a(j1, j2)))
            {
                j1 = ((ba) (obj2)).a() - ((ba) (obj3)).a();
                j2 = a.c(((ba) (obj2)).a(((ba) (obj2)).a()), k);
                obj4 = ((ba) (obj4)).a(a.a(j1, j2));
            }

            ba ba6 = ((ba) (obj4)).b(((ba) (obj))).a(ba3);
            ba3 = ((ba) (obj4)).b(((ba) (obj1))).a(ba2);
            ba2 = ((ba) (obj1));
            obj1 = ba3;
            ba3 = ((ba) (obj));
            obj = ba6;
            obj4 = obj2;
            obj2 = obj3;
        }

        i = ((ba) (obj1)).a(0);
        if (i == 0)
        {
            throw new bc("sigmaTilde(0) was zero");
        }
        i = a.c(i);
        obj = ((ba) (obj1)).c(i);
        obj2 = ((ba) (obj3)).c(i);
        obj1 = new ba[2];
        obj1[0] = ((ba) (obj));
        obj1[1] = ((ba) (obj2));
        obj2 = obj1[0];
        obj1 = obj1[1];
        k2 = ((ba) (obj2)).a();
        if (k2 == 1)
        {
            obj = new int[1];
            obj[0] = ((ba) (obj2)).a(1);
        } else
        {
            obj = new int[k2];
            l = 0;
            int l1;
            for (i = 1; i < a.c() && l < k2; l = l1)
            {
                l1 = l;
                if (((ba) (obj2)).b(i) == 0)
                {
                    obj[l] = a.c(i);
                    l1 = l + 1;
                }
                i++;
            }

            if (l != k2)
            {
                throw new bc("Error locator degree does not match number of roots");
            }
        }
        l2 = obj.length;
        obj2 = new int[l2];
        for (int l = 0; l < l2; l++)
        {
            int i3 = a.c(obj[l]);
            i = 1;
            int k1 = 0;
            while (k1 < l2) 
            {
                if (l != k1)
                {
                    k2 = a.c(obj[k1], i3);
                    if ((k2 & 1) == 0)
                    {
                        k2 |= 1;
                    } else
                    {
                        k2 &= -2;
                    }
                    i = a.c(i, k2);
                }
                k1++;
            }
            obj2[l] = a.c(((ba) (obj1)).b(i3), a.c(i));
            if (flag1)
            {
                obj2[l] = a.c(obj2[l], i3);
            }
        }

        i = 0;
        while (i < obj.length) 
        {
            int i1 = ai.length - 1 - a.b(obj[i]);
            if (i1 < 0)
            {
                throw new bc("Bad error location");
            }
            ai[i1] = az.b(ai[i1], obj2[i]);
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
