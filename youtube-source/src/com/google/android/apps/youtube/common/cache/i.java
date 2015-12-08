// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            c

public final class i extends c
{

    public i(String s)
    {
        super(s);
    }

    private Serializable b(BufferedInputStream bufferedinputstream)
    {
        Object obj = new ObjectInputStream(bufferedinputstream);
        bufferedinputstream = ((BufferedInputStream) (obj));
        Serializable serializable = (Serializable)((ObjectInputStream) (obj)).readObject();
        a(((java.io.InputStream) (obj)));
        return serializable;
        Object obj1;
        obj1;
        bufferedinputstream = null;
_L4:
        throw new IOException("Couldn't read object", ((Throwable) (obj1)));
        obj1;
        obj = bufferedinputstream;
        bufferedinputstream = ((BufferedInputStream) (obj1));
_L2:
        a(((java.io.InputStream) (obj)));
        throw bufferedinputstream;
        bufferedinputstream;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        bufferedinputstream = ((BufferedInputStream) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final Object a(BufferedInputStream bufferedinputstream)
    {
        return b(bufferedinputstream);
    }

    protected final void a(Object obj, BufferedOutputStream bufferedoutputstream)
    {
        obj = (Serializable)obj;
        bufferedoutputstream = new ObjectOutputStream(bufferedoutputstream);
        bufferedoutputstream.writeObject(obj);
        a(((java.io.OutputStream) (bufferedoutputstream)));
        return;
        obj;
        bufferedoutputstream = null;
_L2:
        a(((java.io.OutputStream) (bufferedoutputstream)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
