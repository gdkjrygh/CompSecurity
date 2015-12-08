// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


// Referenced classes of package okio:
//            SegmentPool

final class Segment
{

    static final int SIZE = 2048;
    final byte data[] = new byte[2048];
    int limit;
    Segment next;
    int pos;
    Segment prev;

    Segment()
    {
    }

    public void compact()
    {
        if (prev == this)
        {
            throw new IllegalStateException();
        }
        if ((prev.limit - prev.pos) + (limit - pos) > 2048)
        {
            return;
        } else
        {
            writeTo(prev, limit - pos);
            pop();
            SegmentPool.INSTANCE.recycle(this);
            return;
        }
    }

    public Segment pop()
    {
        Segment segment;
        if (next != this)
        {
            segment = next;
        } else
        {
            segment = null;
        }
        prev.next = next;
        next.prev = prev;
        next = null;
        prev = null;
        return segment;
    }

    public Segment push(Segment segment)
    {
        segment.prev = this;
        segment.next = next;
        next.prev = segment;
        next = segment;
        return segment;
    }

    public Segment split(int i)
    {
        int j = limit - pos - i;
        if (i <= 0 || j <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i < j)
        {
            Segment segment = SegmentPool.INSTANCE.take();
            System.arraycopy(data, pos, segment.data, segment.pos, i);
            pos = pos + i;
            segment.limit = segment.limit + i;
            prev.push(segment);
            return segment;
        } else
        {
            Segment segment1 = SegmentPool.INSTANCE.take();
            System.arraycopy(data, pos + i, segment1.data, segment1.pos, j);
            limit = limit - j;
            segment1.limit = segment1.limit + j;
            push(segment1);
            return this;
        }
    }

    public void writeTo(Segment segment, int i)
    {
        if ((segment.limit - segment.pos) + i > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (segment.limit + i > 2048)
        {
            System.arraycopy(segment.data, segment.pos, segment.data, 0, segment.limit - segment.pos);
            segment.limit = segment.limit - segment.pos;
            segment.pos = 0;
        }
        System.arraycopy(data, pos, segment.data, segment.limit, i);
        segment.limit = segment.limit + i;
        pos = pos + i;
    }
}
