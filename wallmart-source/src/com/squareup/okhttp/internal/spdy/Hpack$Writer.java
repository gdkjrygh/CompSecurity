// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Hpack, Header

static final class out
{

    private final Buffer out;

    void writeByteString(ByteString bytestring)
        throws IOException
    {
        writeInt(bytestring.size(), 127, 0);
        out.write(bytestring);
    }

    void writeHeaders(List list)
        throws IOException
    {
        int i = 0;
        int j = list.size();
        while (i < j) 
        {
            ByteString bytestring = ((Header)list.get(i)).name.toAsciiLowercase();
            Integer integer = (Integer)Hpack.access$200().get(bytestring);
            if (integer != null)
            {
                writeInt(integer.intValue() + 1, 15, 0);
                writeByteString(((Header)list.get(i)).value);
            } else
            {
                out.writeByte(0);
                writeByteString(bytestring);
                writeByteString(((Header)list.get(i)).value);
            }
            i++;
        }
    }

    void writeInt(int i, int j, int k)
        throws IOException
    {
        if (i < j)
        {
            out.writeByte(k | i);
            return;
        }
        out.writeByte(k | j);
        for (i -= j; i >= 128; i >>>= 7)
        {
            out.writeByte(i & 0x7f | 0x80);
        }

        out.writeByte(i);
    }

    (Buffer buffer)
    {
        out = buffer;
    }
}
