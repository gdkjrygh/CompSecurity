// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

class previousWrite extends enceEntry
{

    y nextWrite;
    y previousWrite;
    final y this$0;

    public y getNextInWriteQueue()
    {
        return nextWrite;
    }

    public y getPreviousInWriteQueue()
    {
        return previousWrite;
    }

    public long getWriteTime()
    {
        return 0x7fffffffffffffffL;
    }

    public void setNextInWriteQueue(y y)
    {
        nextWrite = y;
    }

    public void setPreviousInWriteQueue(y y)
    {
        previousWrite = y;
    }

    public void setWriteTime(long l)
    {
    }

    y()
    {
        this$0 = this._cls0.this;
        super();
        nextWrite = this;
        previousWrite = this;
    }
}
