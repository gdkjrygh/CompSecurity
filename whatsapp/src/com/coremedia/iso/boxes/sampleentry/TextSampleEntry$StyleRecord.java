// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            TextSampleEntry

public static class textColor
{

    int endChar;
    int faceStyleFlags;
    int fontId;
    int fontSize;
    int startChar;
    int textColor[] = {
        255, 255, 255, 255
    };

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (textColor)obj;
            if (endChar != ((endChar) (obj)).endChar)
            {
                return false;
            }
            if (faceStyleFlags != ((faceStyleFlags) (obj)).faceStyleFlags)
            {
                return false;
            }
            if (fontId != ((fontId) (obj)).fontId)
            {
                return false;
            }
            if (fontSize != ((fontSize) (obj)).fontSize)
            {
                return false;
            }
            if (startChar != ((startChar) (obj)).startChar)
            {
                return false;
            }
            if (!Arrays.equals(textColor, ((textColor) (obj)).textColor))
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt16(bytebuffer, startChar);
        IsoTypeWriter.writeUInt16(bytebuffer, endChar);
        IsoTypeWriter.writeUInt16(bytebuffer, fontId);
        IsoTypeWriter.writeUInt8(bytebuffer, faceStyleFlags);
        IsoTypeWriter.writeUInt8(bytebuffer, fontSize);
        IsoTypeWriter.writeUInt8(bytebuffer, textColor[0]);
        IsoTypeWriter.writeUInt8(bytebuffer, textColor[1]);
        IsoTypeWriter.writeUInt8(bytebuffer, textColor[2]);
        IsoTypeWriter.writeUInt8(bytebuffer, textColor[3]);
    }

    public int getSize()
    {
        return 12;
    }

    public int hashCode()
    {
        int j = startChar;
        int k = endChar;
        int l = fontId;
        int i1 = faceStyleFlags;
        int j1 = fontSize;
        int i;
        if (textColor != null)
        {
            i = Arrays.hashCode(textColor);
        } else
        {
            i = 0;
        }
        return ((((j * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + i;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        startChar = IsoTypeReader.readUInt16(bytebuffer);
        endChar = IsoTypeReader.readUInt16(bytebuffer);
        fontId = IsoTypeReader.readUInt16(bytebuffer);
        faceStyleFlags = IsoTypeReader.readUInt8(bytebuffer);
        fontSize = IsoTypeReader.readUInt8(bytebuffer);
        textColor = new int[4];
        textColor[0] = IsoTypeReader.readUInt8(bytebuffer);
        textColor[1] = IsoTypeReader.readUInt8(bytebuffer);
        textColor[2] = IsoTypeReader.readUInt8(bytebuffer);
        textColor[3] = IsoTypeReader.readUInt8(bytebuffer);
    }

    public ()
    {
    }

    public (int i, int j, int k, int l, int i1, int ai[])
    {
        startChar = i;
        endChar = j;
        fontId = k;
        faceStyleFlags = l;
        fontSize = i1;
        textColor = ai;
    }
}
