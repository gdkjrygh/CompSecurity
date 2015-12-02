// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor

public class SLConfigDescriptor extends BaseDescriptor
{

    int predefined;

    public SLConfigDescriptor()
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
            obj = (SLConfigDescriptor)obj;
            if (predefined != ((SLConfigDescriptor) (obj)).predefined)
            {
                return false;
            }
        }
        return true;
    }

    public int getPredefined()
    {
        return predefined;
    }

    public int hashCode()
    {
        return predefined;
    }

    public void parseDetail(ByteBuffer bytebuffer)
        throws IOException
    {
        predefined = IsoTypeReader.readUInt8(bytebuffer);
    }

    public ByteBuffer serialize()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(3);
        IsoTypeWriter.writeUInt8(bytebuffer, 6);
        IsoTypeWriter.writeUInt8(bytebuffer, 1);
        IsoTypeWriter.writeUInt8(bytebuffer, predefined);
        return bytebuffer;
    }

    public int serializedSize()
    {
        return 3;
    }

    public void setPredefined(int i)
    {
        predefined = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SLConfigDescriptor");
        stringbuilder.append("{predefined=").append(predefined);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
