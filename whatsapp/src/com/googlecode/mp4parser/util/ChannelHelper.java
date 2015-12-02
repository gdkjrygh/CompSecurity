// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.util:
//            ByteBufferByteChannel, CastUtils

public class ChannelHelper
{

    static final boolean $assertionsDisabled;
    private static ByteBuffer empty = ByteBuffer.allocate(0).asReadOnlyBuffer();

    public ChannelHelper()
    {
    }

    public static void close(SelectionKey selectionkey)
    {
        try
        {
            selectionkey.channel().close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SelectionKey selectionkey)
        {
            return;
        }
    }

    public static int readFully(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer, int i)
        throws IOException
    {
        int j = 0;
_L4:
        int l = readablebytechannel.read(bytebuffer);
        if (-1 != l) goto _L2; else goto _L1
_L1:
        int k;
        if (l == -1)
        {
            throw new EOFException("End of file. No more boxes.");
        } else
        {
            return j;
        }
_L2:
        k = j + l;
        j = k;
        if (k != i) goto _L4; else goto _L3
_L3:
        j = k;
          goto _L1
    }

    public static ByteBuffer readFully(ReadableByteChannel readablebytechannel, long l)
        throws IOException
    {
        if (l == 0L)
        {
            return empty;
        }
        if (readablebytechannel instanceof ByteBufferByteChannel)
        {
            if ((long)((ByteBufferByteChannel)readablebytechannel).byteBuffer.remaining() < l)
            {
                throw new IOException("Trying to read more data than available. The file might be corrupt");
            } else
            {
                ByteBuffer bytebuffer = (ByteBuffer)((ByteBufferByteChannel)readablebytechannel).byteBuffer.slice().limit((int)l);
                ((ByteBufferByteChannel)readablebytechannel).byteBuffer.position((int)((long)((ByteBufferByteChannel)readablebytechannel).byteBuffer.position() + l));
                return bytebuffer;
            }
        }
        if ((readablebytechannel instanceof FileChannel) && l > 0x100000L)
        {
            java.nio.MappedByteBuffer mappedbytebuffer = ((FileChannel)readablebytechannel).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, ((FileChannel)readablebytechannel).position(), l);
            ((FileChannel)readablebytechannel).position(((FileChannel)readablebytechannel).position() + l);
            return mappedbytebuffer;
        }
        ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(CastUtils.l2i(l));
        readFully(readablebytechannel, bytebuffer1, bytebuffer1.limit());
        bytebuffer1.rewind();
        if (!$assertionsDisabled && (long)bytebuffer1.limit() != l)
        {
            throw new AssertionError();
        } else
        {
            return bytebuffer1;
        }
    }

    public static void readFully(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer)
        throws IOException
    {
        readFully(readablebytechannel, bytebuffer, bytebuffer.remaining());
    }

    public static void writeFully(WritableByteChannel writablebytechannel, ByteBuffer bytebuffer)
        throws IOException
    {
        do
        {
            if (writablebytechannel.write(bytebuffer) < 0)
            {
                throw new EOFException();
            }
        } while (bytebuffer.hasRemaining());
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/util/ChannelHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
