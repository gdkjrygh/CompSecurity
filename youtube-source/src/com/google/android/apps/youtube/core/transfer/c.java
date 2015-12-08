// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import com.google.android.apps.youtube.core.utils.h;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            b, m, d

public final class c extends b
{

    private final Key a;
    private final IvParameterSpec b;

    public c(String s, String s1, long l, m m, boolean flag, boolean flag1, 
            d d, Key key)
    {
        super(s, s1, l, m, true, false, d);
        a = key;
        b = h.a((new File(s1)).getName());
    }

    protected final int a(FileChannel filechannel, ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0);
        try
        {
            h.a(abyte0, 0, abyte0.length, a, b, filechannel.position());
        }
        // Misplaced declaration of an exception variable
        catch (FileChannel filechannel)
        {
            throw new IOException(filechannel.toString());
        }
        return filechannel.write(ByteBuffer.wrap(abyte0));
    }
}
