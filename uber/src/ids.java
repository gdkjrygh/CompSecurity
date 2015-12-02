// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ids extends igd
    implements icg
{

    static final idu d[] = new idu[0];
    final ica a;
    final ijb b = new ijb();
    volatile idu c[];
    final idv e = idv.a();
    volatile boolean f;
    boolean g;

    public ids(ica ica1)
    {
        a = ica1;
        c = d;
    }

    private void e()
    {
        idu aidu[] = c;
        int j = aidu.length;
        for (int i = 0; i < j; i++)
        {
            aidu[i].a();
        }

    }

    public final void a()
    {
        if (!g)
        {
            g = true;
            b(idv.b());
            b.b();
            e();
        }
    }

    public final void a(idu idu1)
    {
        ijb ijb1 = b;
        ijb1;
        JVM INSTR monitorenter ;
        idu aidu1[];
        int i;
        idu aidu[] = c;
        i = aidu.length;
        aidu1 = new idu[i + 1];
        System.arraycopy(aidu, 0, aidu1, 0, i);
        aidu1[i] = idu1;
        c = aidu1;
        ijb1;
        JVM INSTR monitorexit ;
        return;
        idu1;
        ijb1;
        JVM INSTR monitorexit ;
        throw idu1;
    }

    public final void a(Object obj)
    {
        if (!g)
        {
            b(idv.a(obj));
            e();
        }
    }

    public final void a(Throwable throwable)
    {
        if (!g)
        {
            g = true;
            b(idv.a(throwable));
            b.b();
            e();
        }
    }

    public final void b()
    {
        ick ick = new ick() {

            final ids a;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
                a.a(obj);
            }

            public final void a(Throwable throwable)
            {
                a.a(throwable);
            }

            
            {
                a = ids.this;
                super();
            }
        };
        b.a(ick);
        a.a(ick);
        f = true;
    }

    public final void b(idu idu1)
    {
        int i = 0;
        ijb ijb1 = b;
        ijb1;
        JVM INSTR monitorenter ;
        idu aidu[];
        int j;
        aidu = c;
        j = aidu.length;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (!aidu[i].equals(idu1)) goto _L4; else goto _L3
_L3:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ijb1;
        JVM INSTR monitorexit ;
        return;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        c = d;
        ijb1;
        JVM INSTR monitorexit ;
        return;
        idu1;
        ijb1;
        JVM INSTR monitorexit ;
        throw idu1;
        idu1 = new idu[j - 1];
        System.arraycopy(aidu, 0, idu1, 0, i);
        System.arraycopy(aidu, i + 1, idu1, i, j - i - 1);
        c = idu1;
        ijb1;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = -1;
        if (true) goto _L3; else goto _L4
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
