// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.entity;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpEntity;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.client.entity:
//            DecompressingEntity

public class DeflateDecompressingEntity extends DecompressingEntity
{

    public DeflateDecompressingEntity(HttpEntity httpentity)
    {
        super(httpentity);
    }

    public volatile InputStream getContent()
        throws IOException
    {
        return super.getContent();
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        return -1L;
    }

    InputStream getDecompressingInputStream(InputStream inputstream)
        throws IOException
    {
        byte abyte0[];
        byte abyte1[];
        Inflater inflater;
        int i;
        abyte0 = new byte[6];
        inputstream = new PushbackInputStream(inputstream, abyte0.length);
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            throw new IOException("Unable to read the response");
        }
        abyte1 = new byte[1];
        inflater = new Inflater();
_L1:
        int j;
        try
        {
            j = inflater.inflate(abyte1);
        }
        catch (DataFormatException dataformatexception)
        {
            inputstream.unread(abyte0, 0, i);
            return new InflaterInputStream(inputstream, new Inflater(true));
        }
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (inflater.finished())
        {
            throw new IOException("Unable to read the response");
        }
        if (!inflater.needsDictionary())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw new IOException("Unable to read the response");
        if (inflater.needsInput())
        {
            inflater.setInput(abyte0);
        }
          goto _L1
        InflaterInputStream inflaterinputstream;
        inputstream.unread(abyte0, 0, i);
        inflaterinputstream = new InflaterInputStream(inputstream);
        return inflaterinputstream;
    }

    public volatile void writeTo(OutputStream outputstream)
        throws IOException
    {
        super.writeTo(outputstream);
    }
}
