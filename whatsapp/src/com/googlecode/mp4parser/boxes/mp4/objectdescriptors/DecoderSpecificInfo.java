// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor

public class DecoderSpecificInfo extends BaseDescriptor
{

    byte bytes[];

    public DecoderSpecificInfo()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DecoderSpecificInfo)obj;
            if (!Arrays.equals(bytes, ((DecoderSpecificInfo) (obj)).bytes))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (bytes != null)
        {
            return Arrays.hashCode(bytes);
        } else
        {
            return 0;
        }
    }

    public void parseDetail(ByteBuffer bytebuffer)
        throws IOException
    {
        if (sizeOfInstance > 0)
        {
            bytes = new byte[sizeOfInstance];
            bytebuffer.get(bytes);
        }
    }

    public ByteBuffer serialize()
    {
        return ByteBuffer.wrap(bytes);
    }

    public int serializedSize()
    {
        return bytes.length;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DecoderSpecificInfo");
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
