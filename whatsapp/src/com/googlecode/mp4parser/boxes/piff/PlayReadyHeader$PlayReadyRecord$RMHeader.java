// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.piff:
//            PlayReadyHeader

public static class  extends 
{

    String header;

    public String getHeader()
    {
        return header;
    }

    public ByteBuffer getValue()
    {
        byte abyte0[];
        try
        {
            abyte0 = header.getBytes("UTF-16LE");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException(unsupportedencodingexception);
        }
        return ByteBuffer.wrap(abyte0);
    }

    public void parse(ByteBuffer bytebuffer)
    {
        try
        {
            byte abyte0[] = new byte[bytebuffer.slice().limit()];
            bytebuffer.get(abyte0);
            header = new String(abyte0, "UTF-16LE");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new RuntimeException(bytebuffer);
        }
    }

    public void setHeader(String s)
    {
        header = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("RMHeader");
        stringbuilder.append("{length=").append(getValue().limit());
        stringbuilder.append(", header='").append(header).append('\'');
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public ()
    {
        super(1);
    }
}
