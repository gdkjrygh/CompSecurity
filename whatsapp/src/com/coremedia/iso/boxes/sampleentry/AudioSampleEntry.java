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

public final class AudioSampleEntry extends AbstractSampleEntry
{

    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte soundVersion2Data[];

    public AudioSampleEntry(String s)
    {
        super(s);
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        byte byte1 = 0;
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer;
        byte byte0;
        if (soundVersion == 1)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        if (soundVersion == 2)
        {
            byte1 = 36;
        }
        bytebuffer = ByteBuffer.allocate(byte0 + 28 + byte1);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        IsoTypeWriter.writeUInt16(bytebuffer, soundVersion);
        IsoTypeWriter.writeUInt16(bytebuffer, reserved1);
        IsoTypeWriter.writeUInt32(bytebuffer, reserved2);
        IsoTypeWriter.writeUInt16(bytebuffer, channelCount);
        IsoTypeWriter.writeUInt16(bytebuffer, sampleSize);
        IsoTypeWriter.writeUInt16(bytebuffer, compressionId);
        IsoTypeWriter.writeUInt16(bytebuffer, packetSize);
        if (type.equals("mlpa"))
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSampleRate());
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSampleRate() << 16);
        }
        if (soundVersion == 1)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, samplesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerFrame);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerSample);
        }
        if (soundVersion == 2)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, samplesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerPacket);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerFrame);
            IsoTypeWriter.writeUInt32(bytebuffer, bytesPerSample);
            bytebuffer.put(soundVersion2Data);
        }
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public long getBytesPerFrame()
    {
        return bytesPerFrame;
    }

    public long getBytesPerPacket()
    {
        return bytesPerPacket;
    }

    public long getBytesPerSample()
    {
        return bytesPerSample;
    }

    public int getChannelCount()
    {
        return channelCount;
    }

    public int getCompressionId()
    {
        return compressionId;
    }

    public int getPacketSize()
    {
        return packetSize;
    }

    public int getReserved1()
    {
        return reserved1;
    }

    public long getReserved2()
    {
        return reserved2;
    }

    public long getSampleRate()
    {
        return sampleRate;
    }

    public int getSampleSize()
    {
        return sampleSize;
    }

    public long getSamplesPerPacket()
    {
        return samplesPerPacket;
    }

    public long getSize()
    {
        byte byte1 = 16;
        byte byte0 = 0;
        int i;
        long l;
        if (soundVersion == 1)
        {
            i = 16;
        } else
        {
            i = 0;
        }
        if (soundVersion == 2)
        {
            byte0 = 36;
        }
        l = (long)(i + 28 + byte0) + getContainerSize();
        i = byte1;
        if (!largeBox)
        {
            if (8L + l >= 0x100000000L)
            {
                i = byte1;
            } else
            {
                i = 8;
            }
        }
        return l + (long)i;
    }

    public int getSoundVersion()
    {
        return soundVersion;
    }

    public byte[] getSoundVersion2Data()
    {
        return soundVersion2Data;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        bytebuffer = ByteBuffer.allocate(28);
        filechannel.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        soundVersion = IsoTypeReader.readUInt16(bytebuffer);
        reserved1 = IsoTypeReader.readUInt16(bytebuffer);
        reserved2 = IsoTypeReader.readUInt32(bytebuffer);
        channelCount = IsoTypeReader.readUInt16(bytebuffer);
        sampleSize = IsoTypeReader.readUInt16(bytebuffer);
        compressionId = IsoTypeReader.readUInt16(bytebuffer);
        packetSize = IsoTypeReader.readUInt16(bytebuffer);
        sampleRate = IsoTypeReader.readUInt32(bytebuffer);
        if (!type.equals("mlpa"))
        {
            sampleRate = sampleRate >>> 16;
        }
        if (soundVersion == 1)
        {
            bytebuffer = ByteBuffer.allocate(16);
            filechannel.read(bytebuffer);
            bytebuffer.rewind();
            samplesPerPacket = IsoTypeReader.readUInt32(bytebuffer);
            bytesPerPacket = IsoTypeReader.readUInt32(bytebuffer);
            bytesPerFrame = IsoTypeReader.readUInt32(bytebuffer);
            bytesPerSample = IsoTypeReader.readUInt32(bytebuffer);
        }
        if (soundVersion == 2)
        {
            bytebuffer = ByteBuffer.allocate(36);
            filechannel.read(bytebuffer);
            bytebuffer.rewind();
            samplesPerPacket = IsoTypeReader.readUInt32(bytebuffer);
            bytesPerPacket = IsoTypeReader.readUInt32(bytebuffer);
            bytesPerFrame = IsoTypeReader.readUInt32(bytebuffer);
            bytesPerSample = IsoTypeReader.readUInt32(bytebuffer);
            soundVersion2Data = new byte[20];
            bytebuffer.get(soundVersion2Data);
        }
        int i;
        long l1;
        if (soundVersion == 1)
        {
            i = 16;
        } else
        {
            i = 0;
        }
        l1 = i;
        if (soundVersion == 2)
        {
            i = 36;
        } else
        {
            i = 0;
        }
        parseContainer(filechannel, l - 28L - l1 - (long)i, boxparser);
    }

    public void setBytesPerFrame(long l)
    {
        bytesPerFrame = l;
    }

    public void setBytesPerPacket(long l)
    {
        bytesPerPacket = l;
    }

    public void setBytesPerSample(long l)
    {
        bytesPerSample = l;
    }

    public void setChannelCount(int i)
    {
        channelCount = i;
    }

    public void setCompressionId(int i)
    {
        compressionId = i;
    }

    public void setPacketSize(int i)
    {
        packetSize = i;
    }

    public void setReserved1(int i)
    {
        reserved1 = i;
    }

    public void setReserved2(long l)
    {
        reserved2 = l;
    }

    public void setSampleRate(long l)
    {
        sampleRate = l;
    }

    public void setSampleSize(int i)
    {
        sampleSize = i;
    }

    public void setSamplesPerPacket(long l)
    {
        samplesPerPacket = l;
    }

    public void setSoundVersion(int i)
    {
        soundVersion = i;
    }

    public void setSoundVersion2Data(byte abyte0[])
    {
        soundVersion2Data = abyte0;
    }

    public void setType(String s)
    {
        type = s;
    }

    public String toString()
    {
        return (new StringBuilder("AudioSampleEntry{bytesPerSample=")).append(bytesPerSample).append(", bytesPerFrame=").append(bytesPerFrame).append(", bytesPerPacket=").append(bytesPerPacket).append(", samplesPerPacket=").append(samplesPerPacket).append(", packetSize=").append(packetSize).append(", compressionId=").append(compressionId).append(", soundVersion=").append(soundVersion).append(", sampleRate=").append(sampleRate).append(", sampleSize=").append(sampleSize).append(", channelCount=").append(channelCount).append(", boxes=").append(getBoxes()).append('}').toString();
    }
}
