// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

final class iee extends AtomicLong
    implements ich
{

    private static final long serialVersionUID = 0x86d71ea7ae145b26L;
    private final ick a;
    private final Iterator b;

    private iee(ick ick1, Iterator iterator)
    {
        a = ick1;
        b = iterator;
    }

    iee(ick ick1, Iterator iterator, byte byte0)
    {
        this(ick1, iterator);
    }

    private void a()
    {
        ick ick1;
        Iterator iterator;
        ick1 = a;
        iterator = b;
_L5:
        if (!ick1.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        ick1.a(iterator.next());
        continue; /* Loop/switch isn't completed */
        if (ick1.c()) goto _L1; else goto _L3
_L3:
        ick1.a();
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void b(long l)
    {
        ick ick1;
        Iterator iterator;
        ick1 = a;
        iterator = b;
_L6:
        long l1 = l;
_L3:
        if (!ick1.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        l1--;
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        ick1.a(iterator.next());
          goto _L3
        if (ick1.c()) goto _L1; else goto _L4
_L4:
        ick1.a();
        return;
        long l2 = addAndGet(-l);
        l = l2;
        if (l2 == 0L)
        {
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(long l)
    {
        if (get() != 0x7fffffffffffffffL)
        {
            if (l == 0x7fffffffffffffffL && compareAndSet(0L, 0x7fffffffffffffffL))
            {
                a();
                return;
            }
            if (l > 0L && idq.a(this, l) == 0L)
            {
                b(l);
                return;
            }
        }
    }
}
