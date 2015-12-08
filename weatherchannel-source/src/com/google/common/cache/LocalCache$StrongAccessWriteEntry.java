// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class previousWrite extends previousWrite
{

    volatile long accessTime;
    writeTime nextAccess;
    writeTime nextWrite;
    writeTime previousAccess;
    writeTime previousWrite;
    volatile long writeTime;

    public long getAccessTime()
    {
        return accessTime;
    }

    public accessTime getNextInAccessQueue()
    {
        return nextAccess;
    }

    public nextAccess getNextInWriteQueue()
    {
        return nextWrite;
    }

    public nextWrite getPreviousInAccessQueue()
    {
        return previousAccess;
    }

    public previousAccess getPreviousInWriteQueue()
    {
        return previousWrite;
    }

    public long getWriteTime()
    {
        return writeTime;
    }

    public void setAccessTime(long l)
    {
        accessTime = l;
    }

    public void setNextInAccessQueue(accessTime accesstime)
    {
        nextAccess = accesstime;
    }

    public void setNextInWriteQueue(nextAccess nextaccess)
    {
        nextWrite = nextaccess;
    }

    public void setPreviousInAccessQueue(nextWrite nextwrite)
    {
        previousAccess = nextwrite;
    }

    public void setPreviousInWriteQueue(previousAccess previousaccess)
    {
        previousWrite = previousaccess;
    }

    public void setWriteTime(long l)
    {
        writeTime = l;
    }

    (Object obj, int i,  )
    {
        super(obj, i, );
        accessTime = 0x7fffffffffffffffL;
        nextAccess = LocalCache.nullEntry();
        previousAccess = LocalCache.nullEntry();
        writeTime = 0x7fffffffffffffffL;
        nextWrite = LocalCache.nullEntry();
        previousWrite = LocalCache.nullEntry();
    }
}
