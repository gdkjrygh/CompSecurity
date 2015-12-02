// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            FullBox

public class SampleDescriptionBox extends AbstractContainerBox
    implements FullBox
{

    public static final String TYPE = "stsd";
    private int flags;
    private int version;

    public SampleDescriptionBox()
    {
        super("stsd");
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt8(bytebuffer, version);
        IsoTypeWriter.writeUInt24(bytebuffer, flags);
        IsoTypeWriter.writeUInt32(bytebuffer, getBoxes().size());
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public int getFlags()
    {
        return flags;
    }

    public AbstractSampleEntry getSampleEntry()
    {
        Iterator iterator = getBoxes(com/coremedia/iso/boxes/sampleentry/AbstractSampleEntry).iterator();
        if (iterator.hasNext())
        {
            return (AbstractSampleEntry)iterator.next();
        } else
        {
            return null;
        }
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 8L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 8L);
    }

    public int getVersion()
    {
        return version;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        bytebuffer = ByteBuffer.allocate(8);
        filechannel.read(bytebuffer);
        bytebuffer.rewind();
        version = IsoTypeReader.readUInt8(bytebuffer);
        flags = IsoTypeReader.readUInt24(bytebuffer);
        parseContainer(filechannel, l - 8L, boxparser);
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setVersion(int i)
    {
        version = i;
    }
}
