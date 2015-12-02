// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.boxes.piff:
//            PlayReadyHeader

public static abstract class type
{
    public static class DefaulPlayReadyRecord extends PlayReadyHeader.PlayReadyRecord
    {

        ByteBuffer value;

        public ByteBuffer getValue()
        {
            return value;
        }

        public void parse(ByteBuffer bytebuffer)
        {
            value = bytebuffer.duplicate();
        }

        public DefaulPlayReadyRecord(int i)
        {
            super(i);
        }
    }

    public static class EmeddedLicenseStore extends PlayReadyHeader.PlayReadyRecord
    {

        ByteBuffer value;

        public ByteBuffer getValue()
        {
            return value;
        }

        public void parse(ByteBuffer bytebuffer)
        {
            value = bytebuffer.duplicate();
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("EmeddedLicenseStore");
            stringbuilder.append("{length=").append(getValue().limit());
            stringbuilder.append('}');
            return stringbuilder.toString();
        }

        public EmeddedLicenseStore()
        {
            super(3);
        }
    }

    public static class RMHeader extends PlayReadyHeader.PlayReadyRecord
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

        public RMHeader()
        {
            super(1);
        }
    }


    int type;

    public static List createFor(ByteBuffer bytebuffer, int i)
    {
        ArrayList arraylist;
        int j;
        arraylist = new ArrayList(i);
        j = 0;
_L6:
        int k;
        int l;
        if (j >= i)
        {
            return arraylist;
        }
        k = IsoTypeReader.readUInt16BE(bytebuffer);
        l = IsoTypeReader.readUInt16BE(bytebuffer);
        k;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 115
    //                   2 126
    //                   3 138;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_138;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Object obj = new DefaulPlayReadyRecord(k);
_L7:
        ((DefaulPlayReadyRecord) (obj)).parse((ByteBuffer)bytebuffer.slice().limit(l));
        bytebuffer.position(bytebuffer.position() + l);
        arraylist.add(obj);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        obj = new RMHeader();
          goto _L7
_L3:
        obj = new DefaulPlayReadyRecord(2);
          goto _L7
        obj = new EmeddedLicenseStore();
          goto _L7
    }

    public abstract ByteBuffer getValue();

    public abstract void parse(ByteBuffer bytebuffer);

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayReadyRecord");
        stringbuilder.append("{type=").append(type);
        stringbuilder.append(", length=").append(getValue().limit());
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public <init>(int i)
    {
        type = i;
    }
}
