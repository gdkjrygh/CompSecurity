// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            FullBox, SchemeInformationBox

public class ItemProtectionBox extends AbstractContainerBox
    implements FullBox
{

    public static final String TYPE = "ipro";
    private int flags;
    private int version;

    public ItemProtectionBox()
    {
        super("ipro");
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(6);
        IsoTypeWriter.writeUInt8(bytebuffer, version);
        IsoTypeWriter.writeUInt24(bytebuffer, flags);
        IsoTypeWriter.writeUInt16(bytebuffer, getBoxes().size());
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public int getFlags()
    {
        return flags;
    }

    public SchemeInformationBox getItemProtectionScheme()
    {
        if (!getBoxes(com/coremedia/iso/boxes/SchemeInformationBox).isEmpty())
        {
            return (SchemeInformationBox)getBoxes(com/coremedia/iso/boxes/SchemeInformationBox).get(0);
        } else
        {
            return null;
        }
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 6L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 6L);
    }

    public int getVersion()
    {
        return version;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        bytebuffer = ByteBuffer.allocate(6);
        filechannel.read(bytebuffer);
        bytebuffer.rewind();
        version = IsoTypeReader.readUInt8(bytebuffer);
        flags = IsoTypeReader.readUInt24(bytebuffer);
        parseContainer(filechannel, l, boxparser);
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
