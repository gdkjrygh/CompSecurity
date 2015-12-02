// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            F, G, I, J, 
//            K, L, M, N, 
//            c2, d6, ch

abstract class E
{

    private static final E a[] = {
        new F(null), new G(null), new I(null), new J(null), new K(null), new L(null), new M(null), new N(null)
    };

    private E()
    {
    }

    E(ch ch)
    {
        this();
    }

    static E a(int i)
    {
        if (i < 0 || i > 7)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return a[i];
        }
    }

    final void a(d6 d6_1, int i)
    {
        boolean flag = c2.g;
        int j = 0;
        do
        {
label0:
            {
                if (j < i)
                {
                    int k = 0;
                    do
                    {
                        if (k >= i)
                        {
                            break;
                        }
                        try
                        {
                            if (a(j, k))
                            {
                                d6_1.a(k, j);
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (d6 d6_1)
                        {
                            throw d6_1;
                        }
                        k++;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            j++;
        } while (true);
    }

    abstract boolean a(int i, int j);

}
