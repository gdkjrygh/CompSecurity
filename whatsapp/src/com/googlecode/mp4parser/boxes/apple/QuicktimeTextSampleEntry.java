// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public class QuicktimeTextSampleEntry extends AbstractSampleEntry
{

    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry()
    {
        super("text");
        foregroundR = 65535;
        foregroundG = 65535;
        foregroundB = 65535;
        fontName = "";
    }

    public void addBox(Box box)
    {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public int getBackgroundB()
    {
        return backgroundB;
    }

    public int getBackgroundG()
    {
        return backgroundG;
    }

    public int getBackgroundR()
    {
        return backgroundR;
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer;
        int i;
        if (fontName != null)
        {
            i = fontName.length();
        } else
        {
            i = 0;
        }
        bytebuffer = ByteBuffer.allocate(i + 52);
        bytebuffer.position(6);
        IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
        bytebuffer.putInt(displayFlags);
        bytebuffer.putInt(textJustification);
        IsoTypeWriter.writeUInt16(bytebuffer, backgroundR);
        IsoTypeWriter.writeUInt16(bytebuffer, backgroundG);
        IsoTypeWriter.writeUInt16(bytebuffer, backgroundB);
        IsoTypeWriter.writeUInt64(bytebuffer, defaultTextBox);
        IsoTypeWriter.writeUInt64(bytebuffer, reserved1);
        bytebuffer.putShort(fontNumber);
        bytebuffer.putShort(fontFace);
        bytebuffer.put(reserved2);
        bytebuffer.putShort(reserved3);
        IsoTypeWriter.writeUInt16(bytebuffer, foregroundR);
        IsoTypeWriter.writeUInt16(bytebuffer, foregroundG);
        IsoTypeWriter.writeUInt16(bytebuffer, foregroundB);
        if (fontName != null)
        {
            IsoTypeWriter.writeUInt8(bytebuffer, fontName.length());
            bytebuffer.put(fontName.getBytes());
        }
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
    }

    public long getDefaultTextBox()
    {
        return defaultTextBox;
    }

    public int getDisplayFlags()
    {
        return displayFlags;
    }

    public short getFontFace()
    {
        return fontFace;
    }

    public String getFontName()
    {
        return fontName;
    }

    public short getFontNumber()
    {
        return fontNumber;
    }

    public int getForegroundB()
    {
        return foregroundB;
    }

    public int getForegroundG()
    {
        return foregroundG;
    }

    public int getForegroundR()
    {
        return foregroundR;
    }

    public long getReserved1()
    {
        return reserved1;
    }

    public byte getReserved2()
    {
        return reserved2;
    }

    public short getReserved3()
    {
        return reserved3;
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (fontName != null)
        {
            i = fontName.length();
        } else
        {
            i = 0;
        }
        l = 52L + l + (long)i;
        if (largeBox || 8L + l >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return l + (long)i;
    }

    public int getTextJustification()
    {
        return textJustification;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        bytebuffer = ByteBuffer.allocate(CastUtils.l2i(l));
        filechannel.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
        displayFlags = bytebuffer.getInt();
        textJustification = bytebuffer.getInt();
        backgroundR = IsoTypeReader.readUInt16(bytebuffer);
        backgroundG = IsoTypeReader.readUInt16(bytebuffer);
        backgroundB = IsoTypeReader.readUInt16(bytebuffer);
        defaultTextBox = IsoTypeReader.readUInt64(bytebuffer);
        reserved1 = IsoTypeReader.readUInt64(bytebuffer);
        fontNumber = bytebuffer.getShort();
        fontFace = bytebuffer.getShort();
        reserved2 = bytebuffer.get();
        reserved3 = bytebuffer.getShort();
        foregroundR = IsoTypeReader.readUInt16(bytebuffer);
        foregroundG = IsoTypeReader.readUInt16(bytebuffer);
        foregroundB = IsoTypeReader.readUInt16(bytebuffer);
        if (bytebuffer.remaining() > 0)
        {
            filechannel = new byte[IsoTypeReader.readUInt8(bytebuffer)];
            bytebuffer.get(filechannel);
            fontName = new String(filechannel);
            return;
        } else
        {
            fontName = null;
            return;
        }
    }

    public void setBackgroundB(int i)
    {
        backgroundB = i;
    }

    public void setBackgroundG(int i)
    {
        backgroundG = i;
    }

    public void setBackgroundR(int i)
    {
        backgroundR = i;
    }

    public void setBoxes(List list)
    {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void setDefaultTextBox(long l)
    {
        defaultTextBox = l;
    }

    public void setDisplayFlags(int i)
    {
        displayFlags = i;
    }

    public void setFontFace(short word0)
    {
        fontFace = word0;
    }

    public void setFontName(String s)
    {
        fontName = s;
    }

    public void setFontNumber(short word0)
    {
        fontNumber = word0;
    }

    public void setForegroundB(int i)
    {
        foregroundB = i;
    }

    public void setForegroundG(int i)
    {
        foregroundG = i;
    }

    public void setForegroundR(int i)
    {
        foregroundR = i;
    }

    public void setReserved1(long l)
    {
        reserved1 = l;
    }

    public void setReserved2(byte byte0)
    {
        reserved2 = byte0;
    }

    public void setReserved3(short word0)
    {
        reserved3 = word0;
    }

    public void setTextJustification(int i)
    {
        textJustification = i;
    }
}
