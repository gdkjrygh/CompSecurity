// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Sample

public class SampleImpl
    implements Sample
{

    private final ByteBuffer data[];

    public SampleImpl(ByteBuffer bytebuffer)
    {
        data = (new ByteBuffer[] {
            bytebuffer
        });
    }

    public SampleImpl(ByteBuffer abytebuffer[])
    {
        data = abytebuffer;
    }

    public ByteBuffer asByteBuffer()
    {
        ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[(int)remaining()]);
        ByteBuffer abytebuffer[] = data;
        int j = abytebuffer.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return bytebuffer;
            }
            bytebuffer.put(abytebuffer[i].duplicate());
            i++;
        } while (true);
    }

    public long remaining()
    {
        long l = 0L;
        ByteBuffer abytebuffer[] = data;
        int j = abytebuffer.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += abytebuffer[i].remaining();
            i++;
        } while (true);
    }

    public void writeTo(WritableByteChannel writablebytechannel)
        throws IOException
    {
        ByteBuffer abytebuffer[] = data;
        int j = abytebuffer.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            writablebytechannel.write(abytebuffer[i]);
            i++;
        } while (true);
    }
}
