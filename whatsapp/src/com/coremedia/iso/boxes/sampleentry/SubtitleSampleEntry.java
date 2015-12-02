// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public class SubtitleSampleEntry extends AbstractSampleEntry
{

    public static final String TYPE1 = "stpp";
    private String imageMimeType;
    private String namespace;
    private String schemaLocation;

    public SubtitleSampleEntry()
    {
        super("stpp");
        namespace = "";
        schemaLocation = "";
        imageMimeType = "";
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(namespace.length() + 8 + schemaLocation.length() + imageMimeType.length() + 3);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, namespace);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, schemaLocation);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, imageMimeType);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public String getImageMimeType()
    {
        return imageMimeType;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public String getSchemaLocation()
    {
        return schemaLocation;
    }

    public long getSize()
    {
        long l = getContainerSize();
        long l1 = namespace.length() + 8 + schemaLocation.length() + imageMimeType.length() + 3;
        int i;
        if (largeBox || l + l1 + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + l1);
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(8);
        filechannel.read((ByteBuffer)bytebuffer1.rewind());
        bytebuffer1.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer1);
        long l1 = filechannel.position();
        bytebuffer1 = ByteBuffer.allocate(1024);
        filechannel.read((ByteBuffer)bytebuffer1.rewind());
        namespace = IsoTypeReader.readString((ByteBuffer)bytebuffer1.rewind());
        filechannel.position((long)namespace.length() + l1 + 1L);
        filechannel.read((ByteBuffer)bytebuffer1.rewind());
        schemaLocation = IsoTypeReader.readString((ByteBuffer)bytebuffer1.rewind());
        filechannel.position((long)namespace.length() + l1 + (long)schemaLocation.length() + 2L);
        filechannel.read((ByteBuffer)bytebuffer1.rewind());
        imageMimeType = IsoTypeReader.readString((ByteBuffer)bytebuffer1.rewind());
        filechannel.position((long)namespace.length() + l1 + (long)schemaLocation.length() + (long)imageMimeType.length() + 3L);
        parseContainer(filechannel, l - (long)(bytebuffer.remaining() + namespace.length() + schemaLocation.length() + imageMimeType.length() + 3), boxparser);
    }

    public void setImageMimeType(String s)
    {
        imageMimeType = s;
    }

    public void setNamespace(String s)
    {
        namespace = s;
    }

    public void setSchemaLocation(String s)
    {
        schemaLocation = s;
    }
}
