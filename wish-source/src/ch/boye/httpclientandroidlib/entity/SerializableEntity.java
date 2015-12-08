// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

// Referenced classes of package ch.boye.httpclientandroidlib.entity:
//            AbstractHttpEntity

public class SerializableEntity extends AbstractHttpEntity
{

    private Serializable objRef;
    private byte objSer[];

    public SerializableEntity(Serializable serializable, boolean flag)
        throws IOException
    {
        if (serializable == null)
        {
            throw new IllegalArgumentException("Source object may not be null");
        }
        if (flag)
        {
            createBytes(serializable);
            return;
        } else
        {
            objRef = serializable;
            return;
        }
    }

    private void createBytes(Serializable serializable)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(serializable);
        objectoutputstream.flush();
        objSer = bytearrayoutputstream.toByteArray();
    }

    public InputStream getContent()
        throws IOException, IllegalStateException
    {
        if (objSer == null)
        {
            createBytes(objRef);
        }
        return new ByteArrayInputStream(objSer);
    }

    public long getContentLength()
    {
        if (objSer == null)
        {
            return -1L;
        } else
        {
            return (long)objSer.length;
        }
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return objSer == null;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        if (objSer == null)
        {
            outputstream = new ObjectOutputStream(outputstream);
            outputstream.writeObject(objRef);
            outputstream.flush();
            return;
        } else
        {
            outputstream.write(objSer);
            outputstream.flush();
            return;
        }
    }
}
