// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.InputLimit;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            HeapResource, IOUtils

public class HeapResourceFactory
    implements ResourceFactory
{

    public HeapResourceFactory()
    {
    }

    public Resource copy(String s, Resource resource)
        throws IOException
    {
        if (resource instanceof HeapResource)
        {
            s = ((HeapResource)resource).getByteArray();
        } else
        {
            s = new ByteArrayOutputStream();
            IOUtils.copyAndClose(resource.getInputStream(), s);
            s = s.toByteArray();
        }
        return new HeapResource(s);
    }

    public Resource generate(String s, InputStream inputstream, InputLimit inputlimit)
        throws IOException
    {
        s = new ByteArrayOutputStream();
        byte abyte0[] = new byte[2048];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                break;
            }
            s.write(abyte0, 0, i);
            long l1 = l + (long)i;
            l = l1;
            if (inputlimit == null)
            {
                continue;
            }
            l = l1;
            if (l1 <= inputlimit.getValue())
            {
                continue;
            }
            inputlimit.reached();
            break;
        } while (true);
        return new HeapResource(s.toByteArray());
    }
}
