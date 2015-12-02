// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.FullBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser:
//            AbstractContainerBox

public abstract class FullContainerBox extends AbstractContainerBox
    implements FullBox
{

    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/FullContainerBox.getName());
    private int flags;
    private int version;

    public FullContainerBox(String s)
    {
        super(s);
    }

    public List getBoxes(Class class1)
    {
        return getBoxes(class1, false);
    }

    public int getFlags()
    {
        return flags;
    }

    protected ByteBuffer getHeader()
    {
        Object obj;
        if (largeBox || getSize() >= 0x100000000L)
        {
            byte abyte0[] = new byte[20];
            abyte0[3] = 1;
            abyte0[4] = type.getBytes()[0];
            abyte0[5] = type.getBytes()[1];
            abyte0[6] = type.getBytes()[2];
            abyte0[7] = type.getBytes()[3];
            obj = ByteBuffer.wrap(abyte0);
            ((ByteBuffer) (obj)).position(8);
            IsoTypeWriter.writeUInt64(((ByteBuffer) (obj)), getSize());
            writeVersionAndFlags(((ByteBuffer) (obj)));
        } else
        {
            obj = new byte[12];
            obj[4] = type.getBytes()[0];
            obj[5] = type.getBytes()[1];
            obj[6] = type.getBytes()[2];
            obj[7] = type.getBytes()[3];
            obj = ByteBuffer.wrap(((byte []) (obj)));
            IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), getSize());
            ((ByteBuffer) (obj)).position(8);
            writeVersionAndFlags(((ByteBuffer) (obj)));
        }
        ((ByteBuffer) (obj)).rewind();
        return ((ByteBuffer) (obj));
    }

    public int getVersion()
    {
        return version;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(4);
        filechannel.read(bytebuffer1);
        parseVersionAndFlags((ByteBuffer)bytebuffer1.rewind());
        super.parse(filechannel, bytebuffer, l, boxparser);
    }

    protected final long parseVersionAndFlags(ByteBuffer bytebuffer)
    {
        version = IsoTypeReader.readUInt8(bytebuffer);
        flags = IsoTypeReader.readUInt24(bytebuffer);
        return 4L;
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setVersion(int i)
    {
        version = i;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("[childBoxes]").toString();
    }

    protected final void writeVersionAndFlags(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt8(bytebuffer, version);
        IsoTypeWriter.writeUInt24(bytebuffer, flags);
    }

}
