// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.entity.AbstractHttpEntity;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

class CombinedEntity extends AbstractHttpEntity
{
    class ResourceStream extends FilterInputStream
    {

        final CombinedEntity this$0;

        public void close()
            throws IOException
        {
            super.close();
            dispose();
            return;
            Exception exception;
            exception;
            dispose();
            throw exception;
        }

        protected ResourceStream(InputStream inputstream)
        {
            this$0 = CombinedEntity.this;
            super(inputstream);
        }
    }


    private final InputStream combinedStream;
    private final Resource resource;

    CombinedEntity(Resource resource1, InputStream inputstream)
        throws IOException
    {
        resource = resource1;
        combinedStream = new SequenceInputStream(new ResourceStream(resource1.getInputStream()), inputstream);
    }

    private void dispose()
    {
        resource.dispose();
    }

    public InputStream getContent()
        throws IOException, IllegalStateException
    {
        return combinedStream;
    }

    public long getContentLength()
    {
        return -1L;
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public boolean isStreaming()
    {
        return true;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        InputStream inputstream;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        inputstream = getContent();
        byte abyte0[] = new byte[2048];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        inputstream.close();
        throw outputstream;
        inputstream.close();
        return;
    }

}
