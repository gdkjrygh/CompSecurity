// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry
{

    public static final String TYPE = "ovc1";
    private byte vc1Content[];

    public Ovc1VisualSampleEntryImpl()
    {
        super("ovc1");
        vc1Content = new byte[0];
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writablebytechannel.write(ByteBuffer.wrap(vc1Content));
    }

    public long getSize()
    {
        int i;
        long l;
        if (largeBox || (long)(vc1Content.length + 16) >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        l = i;
        return (long)vc1Content.length + l + 8L;
    }

    public byte[] getVc1Content()
    {
        return vc1Content;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        bytebuffer = ByteBuffer.allocate(CastUtils.l2i(l));
        filechannel.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        vc1Content = new byte[bytebuffer.remaining()];
        bytebuffer.get(vc1Content);
    }

    public void setVc1Content(byte abyte0[])
    {
        vc1Content = abyte0;
    }
}
