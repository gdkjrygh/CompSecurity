// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class MediaDataBox
    implements Box
{

    private static Logger LOG = Logger.getLogger(com/coremedia/iso/boxes/mdat/MediaDataBox.getName());
    public static final String TYPE = "mdat";
    private FileChannel fileChannel;
    boolean largeBox;
    private long offset;
    Container parent;
    private long size;

    public MediaDataBox()
    {
        largeBox = false;
    }

    private static void transfer(FileChannel filechannel, long l, long l1, WritableByteChannel writablebytechannel)
        throws IOException
    {
        long l2 = 0L;
        do
        {
            if (l2 >= l1)
            {
                return;
            }
            l2 += filechannel.transferTo(l + l2, Math.min(0x3ff8000L, l1 - l2), writablebytechannel);
        } while (true);
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        transfer(fileChannel, offset, size, writablebytechannel);
    }

    public long getOffset()
    {
        return offset;
    }

    public Container getParent()
    {
        return parent;
    }

    public long getSize()
    {
        return size;
    }

    public String getType()
    {
        return "mdat";
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        offset = filechannel.position() - (long)bytebuffer.remaining();
        fileChannel = filechannel;
        size = (long)bytebuffer.remaining() + l;
        filechannel.position(filechannel.position() + l);
    }

    public void setParent(Container container)
    {
        parent = container;
    }

    public String toString()
    {
        return (new StringBuilder("MediaDataBox{size=")).append(size).append('}').toString();
    }

}
