// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso:
//            IsoTypeWriter

public final class IsoTypeWriterVariable
{

    public IsoTypeWriterVariable()
    {
    }

    public static void write(long l, ByteBuffer bytebuffer, int i)
    {
        switch (i)
        {
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            throw new RuntimeException((new StringBuilder("I don't know how to read ")).append(i).append(" bytes").toString());

        case 1: // '\001'
            IsoTypeWriter.writeUInt8(bytebuffer, (int)(255L & l));
            return;

        case 2: // '\002'
            IsoTypeWriter.writeUInt16(bytebuffer, (int)(65535L & l));
            return;

        case 3: // '\003'
            IsoTypeWriter.writeUInt24(bytebuffer, (int)(0xffffffL & l));
            return;

        case 4: // '\004'
            IsoTypeWriter.writeUInt32(bytebuffer, l);
            return;

        case 8: // '\b'
            IsoTypeWriter.writeUInt64(bytebuffer, l);
            break;
        }
    }
}
