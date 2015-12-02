// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iht
    implements icg
{

    private final icg a;
    private boolean b;
    private volatile boolean c;
    private ihu d;
    private final idv e = idv.a();

    public iht(icg icg1)
    {
        a = icg1;
    }

    public final void a()
    {
        if (c)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        ihu ihu2;
        c = true;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        ihu2 = d;
        ihu ihu1;
        ihu1 = ihu2;
        if (ihu2 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        ihu1 = new ihu();
        d = ihu1;
        ihu1.a(idv.b());
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        a.a();
        return;
    }

    public final void a(Object obj)
    {
        if (c)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ihu ihu1;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ihu1 = d;
        Object obj1;
        obj1 = ihu1;
        if (ihu1 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj1 = new ihu();
        d = ((ihu) (obj1));
        ((ihu) (obj1)).a(idv.a(obj));
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        int i;
        try
        {
            a.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            c = true;
            icw.a(((Throwable) (obj1)));
            a.a(ida.a(((Throwable) (obj1)), obj));
            return;
        }
_L4:
        i = 0;
_L2:
        if (i >= 1024)
        {
            continue; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        obj1 = d;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        b = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        d = null;
        this;
        JVM INSTR monitorexit ;
        Object aobj[] = ((ihu) (obj1)).a;
        int k = aobj.length;
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            Object obj2 = aobj[j];
            if (obj2 == null)
            {
                break;
            }
            try
            {
                if (idv.a(a, obj2))
                {
                    c = true;
                    return;
                }
            }
            catch (Throwable throwable)
            {
                c = true;
                icw.a(throwable);
                a.a(ida.a(throwable, obj));
                return;
            }
            j++;
        } while (true);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Throwable throwable)
    {
        icw.a(throwable);
        if (c)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
        ihu ihu2;
        c = true;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ihu2 = d;
        ihu ihu1;
        ihu1 = ihu2;
        if (ihu2 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ihu1 = new ihu();
        d = ihu1;
        ihu1.a(idv.a(throwable));
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        a.a(throwable);
        return;
    }
}
