// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            TextSampleEntry

public static class right
{

    int bottom;
    int left;
    int right;
    int top;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (right)obj;
            if (bottom != ((bottom) (obj)).bottom)
            {
                return false;
            }
            if (left != ((left) (obj)).left)
            {
                return false;
            }
            if (right != ((right) (obj)).right)
            {
                return false;
            }
            if (top != ((top) (obj)).top)
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt16(bytebuffer, top);
        IsoTypeWriter.writeUInt16(bytebuffer, left);
        IsoTypeWriter.writeUInt16(bytebuffer, bottom);
        IsoTypeWriter.writeUInt16(bytebuffer, right);
    }

    public int getSize()
    {
        return 8;
    }

    public int hashCode()
    {
        return ((top * 31 + left) * 31 + bottom) * 31 + right;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        top = IsoTypeReader.readUInt16(bytebuffer);
        left = IsoTypeReader.readUInt16(bytebuffer);
        bottom = IsoTypeReader.readUInt16(bytebuffer);
        right = IsoTypeReader.readUInt16(bytebuffer);
    }

    public ()
    {
    }

    public (int i, int j, int k, int l)
    {
        top = i;
        left = j;
        bottom = k;
        right = l;
    }
}
