// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class previousWrite extends previousWrite
{

    writeTime nextWrite;
    writeTime previousWrite;
    volatile long writeTime;

    public previousWrite getNextInWriteQueue()
    {
        return nextWrite;
    }

    public nextWrite getPreviousInWriteQueue()
    {
        return previousWrite;
    }

    public long getWriteTime()
    {
        return writeTime;
    }

    public void setNextInWriteQueue(writeTime writetime)
    {
        nextWrite = writetime;
    }

    public void setPreviousInWriteQueue(nextWrite nextwrite)
    {
        previousWrite = nextwrite;
    }

    public void setWriteTime(long l)
    {
        writeTime = l;
    }

    _cls9(Object obj, int i, _cls9 _pcls9)
    {
        super(obj, i, _pcls9);
        writeTime = 0x7fffffffffffffffL;
        nextWrite = LocalCache.nullEntry();
        previousWrite = LocalCache.nullEntry();
    }
}
