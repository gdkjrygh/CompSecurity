// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface Container
{

    public abstract List getBoxes();

    public abstract List getBoxes(Class class1);

    public abstract List getBoxes(Class class1, boolean flag);

    public abstract ByteBuffer getByteBuffer(long l, long l1)
        throws IOException;

    public abstract void setBoxes(List list);

    public abstract void writeContainer(WritableByteChannel writablebytechannel)
        throws IOException;
}
