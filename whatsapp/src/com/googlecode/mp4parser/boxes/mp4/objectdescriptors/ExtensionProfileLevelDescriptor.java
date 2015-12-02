// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor

public class ExtensionProfileLevelDescriptor extends BaseDescriptor
{

    byte bytes[];

    public ExtensionProfileLevelDescriptor()
    {
    }

    public void parseDetail(ByteBuffer bytebuffer)
        throws IOException
    {
        if (getSize() > 0)
        {
            bytes = new byte[getSize()];
            bytebuffer.get(bytes);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ExtensionDescriptor");
        StringBuilder stringbuilder1 = stringbuilder.append("{bytes=");
        String s;
        if (bytes == null)
        {
            s = "null";
        } else
        {
            s = Hex.encodeHex(bytes);
        }
        stringbuilder1.append(s);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
