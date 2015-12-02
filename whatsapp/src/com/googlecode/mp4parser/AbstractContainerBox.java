// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser:
//            BasicContainer

public class AbstractContainerBox extends BasicContainer
    implements Box
{

    ByteBuffer header;
    protected boolean largeBox;
    private long offset;
    Container parent;
    protected String type;

    public AbstractContainerBox(String s)
    {
        type = s;
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        writeContainer(writablebytechannel);
    }

    protected ByteBuffer getHeader()
    {
        Object obj;
        if (largeBox || getSize() >= 0x100000000L)
        {
            byte abyte0[] = new byte[16];
            abyte0[3] = 1;
            abyte0[4] = type.getBytes()[0];
            abyte0[5] = type.getBytes()[1];
            abyte0[6] = type.getBytes()[2];
            abyte0[7] = type.getBytes()[3];
            obj = ByteBuffer.wrap(abyte0);
            ((ByteBuffer) (obj)).position(8);
            IsoTypeWriter.writeUInt64(((ByteBuffer) (obj)), getSize());
        } else
        {
            obj = new byte[8];
            obj[4] = type.getBytes()[0];
            obj[5] = type.getBytes()[1];
            obj[6] = type.getBytes()[2];
            obj[7] = type.getBytes()[3];
            obj = ByteBuffer.wrap(((byte []) (obj)));
            IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), getSize());
        }
        ((ByteBuffer) (obj)).rewind();
        return ((ByteBuffer) (obj));
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
        long l = getContainerSize();
        int i;
        if (largeBox || 8L + l >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + l;
    }

    public String getType()
    {
        return type;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        offset = filechannel.position() - (long)bytebuffer.remaining();
        boolean flag;
        if (bytebuffer.remaining() == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        largeBox = flag;
        parseContainer(filechannel, l, boxparser);
    }

    public void setParent(Container container)
    {
        parent = container;
    }
}
