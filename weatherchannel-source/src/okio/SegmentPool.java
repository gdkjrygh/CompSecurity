// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


// Referenced classes of package okio:
//            Segment

final class SegmentPool
{

    static final SegmentPool INSTANCE = new SegmentPool();
    static final long MAX_SIZE = 0x10000L;
    long byteCount;
    private Segment next;

    private SegmentPool()
    {
    }

    void recycle(Segment segment)
    {
        if (segment.next != null || segment.prev != null)
        {
            throw new IllegalArgumentException();
        }
        this;
        JVM INSTR monitorenter ;
        if (byteCount + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        byteCount = byteCount + 2048L;
        segment.next = next;
        segment.limit = 0;
        segment.pos = 0;
        next = segment;
        this;
        JVM INSTR monitorexit ;
        return;
        segment;
        this;
        JVM INSTR monitorexit ;
        throw segment;
    }

    Segment take()
    {
        this;
        JVM INSTR monitorenter ;
        Segment segment;
        if (next == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        segment = next;
        next = segment.next;
        segment.next = null;
        byteCount = byteCount - 2048L;
        return segment;
        this;
        JVM INSTR monitorexit ;
        return new Segment();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
