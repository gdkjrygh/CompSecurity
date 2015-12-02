// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.ChannelHelper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, Container

public class FreeBox
    implements Box
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List replacers;

    public FreeBox()
    {
        replacers = new LinkedList();
    }

    public FreeBox(int i)
    {
        replacers = new LinkedList();
        data = ByteBuffer.allocate(i);
    }

    public void addAndReplace(Box box)
    {
        data.position(CastUtils.l2i(box.getSize()));
        data = data.slice();
        replacers.add(box);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FreeBox)obj;
            if (data == null ? ((FreeBox) (obj)).data != null : !data.equals(((FreeBox) (obj)).data))
            {
                return false;
            }
        }
        return true;
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        Object obj = replacers.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                obj = ByteBuffer.allocate(8);
                IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), data.limit() + 8);
                ((ByteBuffer) (obj)).put("free".getBytes());
                ((ByteBuffer) (obj)).rewind();
                writablebytechannel.write(((ByteBuffer) (obj)));
                ((ByteBuffer) (obj)).rewind();
                data.rewind();
                writablebytechannel.write(data);
                data.rewind();
                return;
            }
            ((Box)((Iterator) (obj)).next()).getBox(writablebytechannel);
        } while (true);
    }

    public ByteBuffer getData()
    {
        return data;
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
        long l = 8L;
        Iterator iterator = replacers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l + (long)data.limit();
            }
            l += ((Box)iterator.next()).getSize();
        } while (true);
    }

    public String getType()
    {
        return "free";
    }

    public int hashCode()
    {
        if (data != null)
        {
            return data.hashCode();
        } else
        {
            return 0;
        }
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        offset = filechannel.position() - (long)bytebuffer.remaining();
        if (l > 0x100000L)
        {
            data = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, filechannel.position(), l);
            filechannel.position(filechannel.position() + l);
            return;
        }
        if (!$assertionsDisabled && l >= 0x7fffffffL)
        {
            throw new AssertionError();
        } else
        {
            data = ChannelHelper.readFully(filechannel, l);
            return;
        }
    }

    public void setData(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
    }

    public void setParent(Container container)
    {
        parent = container;
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/FreeBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
