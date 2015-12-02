// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class CencSampleEncryptionInformationGroupEntry extends GroupEntry
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "seig";
    private int isEncrypted;
    private byte ivSize;
    private byte kid[];

    public CencSampleEncryptionInformationGroupEntry()
    {
        kid = new byte[16];
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CencSampleEncryptionInformationGroupEntry)obj;
            if (isEncrypted != ((CencSampleEncryptionInformationGroupEntry) (obj)).isEncrypted)
            {
                return false;
            }
            if (ivSize != ((CencSampleEncryptionInformationGroupEntry) (obj)).ivSize)
            {
                return false;
            }
            if (!Arrays.equals(kid, ((CencSampleEncryptionInformationGroupEntry) (obj)).kid))
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt24(bytebuffer, isEncrypted);
        IsoTypeWriter.writeUInt8(bytebuffer, ivSize);
        bytebuffer.put(kid);
        bytebuffer.rewind();
        return bytebuffer;
    }

    public int getEncrypted()
    {
        return isEncrypted;
    }

    public byte getIvSize()
    {
        return ivSize;
    }

    public byte[] getKid()
    {
        return kid;
    }

    public int hashCode()
    {
        int j = isEncrypted;
        byte byte0 = ivSize;
        int i;
        if (kid != null)
        {
            i = Arrays.hashCode(kid);
        } else
        {
            i = 0;
        }
        return (j * 31 + byte0) * 31 + i;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        isEncrypted = IsoTypeReader.readUInt24(bytebuffer);
        ivSize = (byte)IsoTypeReader.readUInt8(bytebuffer);
        kid = new byte[16];
        bytebuffer.get(kid);
    }

    public void setEncrypted(int i)
    {
        isEncrypted = i;
    }

    public void setIvSize(byte byte0)
    {
        ivSize = byte0;
    }

    public void setKid(byte abyte0[])
    {
        if (!$assertionsDisabled && abyte0.length != 16)
        {
            throw new AssertionError();
        } else
        {
            kid = abyte0;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("CencSampleEncryptionInformationGroupEntry{isEncrypted=")).append(isEncrypted).append(", ivSize=").append(ivSize).append(", kid=").append(Hex.encodeHex(kid)).append('}').toString();
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/mp4/samplegrouping/CencSampleEncryptionInformationGroupEntry.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
