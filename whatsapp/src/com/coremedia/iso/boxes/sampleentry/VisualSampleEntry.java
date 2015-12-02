// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.Container;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public final class VisualSampleEntry extends AbstractSampleEntry
    implements Container
{

    static final boolean $assertionsDisabled;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "drmi";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long predefined[];
    private double vertresolution;
    private int width;

    public VisualSampleEntry()
    {
        super("avc1");
        horizresolution = 72D;
        vertresolution = 72D;
        frameCount = 1;
        compressorname = "";
        depth = 24;
        predefined = new long[3];
    }

    public VisualSampleEntry(String s)
    {
        super(s);
        horizresolution = 72D;
        vertresolution = 72D;
        frameCount = 1;
        compressorname = "";
        depth = 24;
        predefined = new long[3];
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(78);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        IsoTypeWriter.writeUInt32(bytebuffer, predefined[0]);
        IsoTypeWriter.writeUInt32(bytebuffer, predefined[1]);
        IsoTypeWriter.writeUInt32(bytebuffer, predefined[2]);
        IsoTypeWriter.writeUInt16(bytebuffer, getWidth());
        IsoTypeWriter.writeUInt16(bytebuffer, getHeight());
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, getHorizresolution());
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, getVertresolution());
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt16(bytebuffer, getFrameCount());
        IsoTypeWriter.writeUInt8(bytebuffer, Utf8.utf8StringLengthInBytes(getCompressorname()));
        bytebuffer.put(Utf8.convert(getCompressorname()));
        int i = Utf8.utf8StringLengthInBytes(getCompressorname());
        do
        {
            if (i >= 31)
            {
                IsoTypeWriter.writeUInt16(bytebuffer, getDepth());
                IsoTypeWriter.writeUInt16(bytebuffer, 65535);
                writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
                writeContainer(writablebytechannel);
                return;
            }
            i++;
            bytebuffer.put((byte)0);
        } while (true);
    }

    public String getCompressorname()
    {
        return compressorname;
    }

    public int getDepth()
    {
        return depth;
    }

    public int getFrameCount()
    {
        return frameCount;
    }

    public int getHeight()
    {
        return height;
    }

    public double getHorizresolution()
    {
        return horizresolution;
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 78L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 78L);
    }

    public double getVertresolution()
    {
        return vertresolution;
    }

    public int getWidth()
    {
        return width;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        bytebuffer = ByteBuffer.allocate(78);
        filechannel.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        long l1 = IsoTypeReader.readUInt16(bytebuffer);
        if (!$assertionsDisabled && 0L != l1)
        {
            throw new AssertionError("reserved byte not 0");
        }
        l1 = IsoTypeReader.readUInt16(bytebuffer);
        if (!$assertionsDisabled && 0L != l1)
        {
            throw new AssertionError("reserved byte not 0");
        }
        predefined[0] = IsoTypeReader.readUInt32(bytebuffer);
        predefined[1] = IsoTypeReader.readUInt32(bytebuffer);
        predefined[2] = IsoTypeReader.readUInt32(bytebuffer);
        width = IsoTypeReader.readUInt16(bytebuffer);
        height = IsoTypeReader.readUInt16(bytebuffer);
        horizresolution = IsoTypeReader.readFixedPoint1616(bytebuffer);
        vertresolution = IsoTypeReader.readFixedPoint1616(bytebuffer);
        l1 = IsoTypeReader.readUInt32(bytebuffer);
        if (!$assertionsDisabled && 0L != l1)
        {
            throw new AssertionError("reserved byte not 0");
        }
        frameCount = IsoTypeReader.readUInt16(bytebuffer);
        int j = IsoTypeReader.readUInt8(bytebuffer);
        int i = j;
        if (j > 31)
        {
            System.out.println((new StringBuilder("invalid compressor name displayable data: ")).append(j).toString());
            i = 31;
        }
        byte abyte0[] = new byte[i];
        bytebuffer.get(abyte0);
        compressorname = Utf8.convert(abyte0);
        if (i < 31)
        {
            bytebuffer.get(new byte[31 - i]);
        }
        depth = IsoTypeReader.readUInt16(bytebuffer);
        l1 = IsoTypeReader.readUInt16(bytebuffer);
        if (!$assertionsDisabled && 65535L != l1)
        {
            throw new AssertionError();
        } else
        {
            parseContainer(filechannel, l - 78L, boxparser);
            return;
        }
    }

    public void setCompressorname(String s)
    {
        compressorname = s;
    }

    public void setDepth(int i)
    {
        depth = i;
    }

    public void setFrameCount(int i)
    {
        frameCount = i;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setHorizresolution(double d)
    {
        horizresolution = d;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setVertresolution(double d)
    {
        vertresolution = d;
    }

    public void setWidth(int i)
    {
        width = i;
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/sampleentry/VisualSampleEntry.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
