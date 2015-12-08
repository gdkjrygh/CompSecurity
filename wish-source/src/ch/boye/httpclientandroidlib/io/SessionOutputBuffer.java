// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.io;

import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.io:
//            HttpTransportMetrics

public interface SessionOutputBuffer
{

    public abstract void flush()
        throws IOException;

    public abstract HttpTransportMetrics getMetrics();

    public abstract void write(int i)
        throws IOException;

    public abstract void write(byte abyte0[])
        throws IOException;

    public abstract void write(byte abyte0[], int i, int j)
        throws IOException;

    public abstract void writeLine(CharArrayBuffer chararraybuffer)
        throws IOException;

    public abstract void writeLine(String s)
        throws IOException;
}
