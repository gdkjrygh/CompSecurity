// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;

// Referenced classes of package com.coremedia.iso:
//            BoxParser, IsoTypeReader

public abstract class AbstractBoxParser
    implements BoxParser
{

    private static Logger LOG = Logger.getLogger(com/coremedia/iso/AbstractBoxParser.getName());
    ThreadLocal header;

    public AbstractBoxParser()
    {
        header = new ThreadLocal() {

            final AbstractBoxParser this$0;

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            protected ByteBuffer initialValue()
            {
                return ByteBuffer.allocate(32);
            }

            
            {
                this$0 = AbstractBoxParser.this;
                super();
            }
        };
    }

    public abstract Box createBox(String s, byte abyte0[], String s1);

    public Box parseBox(FileChannel filechannel, Container container)
        throws IOException
    {
        Object obj;
        int i;
        ((ByteBuffer)header.get()).rewind().limit(8);
        i = 0;
        long l;
        do
        {
            int j = i + filechannel.read((ByteBuffer)header.get());
            if (j == 8)
            {
                ((ByteBuffer)header.get()).rewind();
                l = IsoTypeReader.readUInt32((ByteBuffer)header.get());
                if (l < 8L && l > 1L)
                {
                    LOG.severe((new StringBuilder("Plausibility check failed: size < 8 (size = ")).append(l).append("). Stop parsing!").toString());
                    return null;
                }
                break;
            }
            i = j;
            if (j < 0)
            {
                throw new EOFException();
            }
        } while (true);
        String s1 = IsoTypeReader.read4cc((ByteBuffer)header.get());
        obj = (byte[])null;
        long l1;
        if (l == 1L)
        {
            ((ByteBuffer)header.get()).limit(16);
            filechannel.read((ByteBuffer)header.get());
            ((ByteBuffer)header.get()).position(8);
            l = IsoTypeReader.readUInt64((ByteBuffer)header.get()) - 16L;
        } else
        {
            if (l == 0L)
            {
                filechannel.size();
                filechannel.position();
                obj = (new StringBuilder("'")).append(s1).append("' with '");
                if (container instanceof Box)
                {
                    filechannel = ((Box)container).getType();
                } else
                {
                    filechannel = "IsoFile";
                }
                throw new RuntimeException(((StringBuilder) (obj)).append(filechannel).append("' as parent has length == 0. That's not supported").toString());
            }
            l -= 8L;
        }
        l1 = l;
        if (!"uuid".equals(s1)) goto _L2; else goto _L1
_L1:
        ((ByteBuffer)header.get()).limit(((ByteBuffer)header.get()).limit() + 16);
        filechannel.read((ByteBuffer)header.get());
        obj = new byte[16];
        i = ((ByteBuffer)header.get()).position() - 16;
_L6:
        if (i < ((ByteBuffer)header.get()).position()) goto _L4; else goto _L3
_L3:
        l1 = l - 16L;
_L2:
        String s;
        if (container instanceof Box)
        {
            s = ((Box)container).getType();
        } else
        {
            s = "";
        }
        obj = createBox(s1, ((byte []) (obj)), s);
        ((Box) (obj)).setParent(container);
        ((ByteBuffer)header.get()).rewind();
        ((Box) (obj)).parse(filechannel, (ByteBuffer)header.get(), l1, this);
        return ((Box) (obj));
_L4:
        obj[i - (((ByteBuffer)header.get()).position() - 16)] = ((ByteBuffer)header.get()).get(i);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
