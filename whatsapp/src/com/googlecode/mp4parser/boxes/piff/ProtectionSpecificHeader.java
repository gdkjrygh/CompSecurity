// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.googlecode.mp4parser.boxes.piff:
//            PlayReadyHeader

public class ProtectionSpecificHeader
{

    protected static Map uuidRegistry;
    ByteBuffer data;

    public ProtectionSpecificHeader()
    {
    }

    public static ProtectionSpecificHeader createFor(UUID uuid, ByteBuffer bytebuffer)
    {
        Class class1 = (Class)uuidRegistry.get(uuid);
        uuid = new ProtectionSpecificHeader();
        if (class1 != null)
        {
            try
            {
                uuid = (ProtectionSpecificHeader)class1.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (UUID uuid)
            {
                throw new RuntimeException(uuid);
            }
            // Misplaced declaration of an exception variable
            catch (UUID uuid)
            {
                throw new RuntimeException(uuid);
            }
        }
        uuid.parse(bytebuffer);
        return uuid;
    }

    public boolean equals(Object obj)
    {
        if ((obj instanceof ProtectionSpecificHeader) && getClass().equals(obj.getClass()))
        {
            return data.equals(((ProtectionSpecificHeader)obj).data);
        } else
        {
            return false;
        }
    }

    public ByteBuffer getData()
    {
        return data;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ProtectionSpecificHeader");
        stringbuilder.append("{data=");
        ByteBuffer bytebuffer = getData().duplicate();
        bytebuffer.rewind();
        byte abyte0[] = new byte[bytebuffer.limit()];
        bytebuffer.get(abyte0);
        stringbuilder.append(Hex.encodeHex(abyte0));
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        uuidRegistry = new HashMap();
        uuidRegistry.put(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"), com/googlecode/mp4parser/boxes/piff/PlayReadyHeader);
    }
}
