// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public abstract class GroupEntry
{

    public GroupEntry()
    {
    }

    public abstract ByteBuffer get();

    public abstract void parse(ByteBuffer bytebuffer);

    public int size()
    {
        return get().limit();
    }
}
