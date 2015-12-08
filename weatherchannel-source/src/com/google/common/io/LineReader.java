// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.google.common.io:
//            LineBuffer

public final class LineReader
{

    private final char buf[] = new char[4096];
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf = new LineBuffer() {

        final LineReader this$0;

        protected void handleLine(String s, String s1)
        {
            lines.add(s);
        }

            
            {
                this$0 = LineReader.this;
                super();
            }
    };
    private final Queue lines = new LinkedList();
    private final Readable readable;
    private final Reader reader;

    public LineReader(Readable readable1)
    {
        cbuf = CharBuffer.wrap(buf);
        readable = (Readable)Preconditions.checkNotNull(readable1);
        if (readable1 instanceof Reader)
        {
            readable1 = (Reader)readable1;
        } else
        {
            readable1 = null;
        }
        reader = readable1;
    }

    public String readLine()
        throws IOException
    {
        do
        {
            int i;
label0:
            {
                if (lines.peek() == null)
                {
                    cbuf.clear();
                    if (reader != null)
                    {
                        i = reader.read(buf, 0, buf.length);
                    } else
                    {
                        i = readable.read(cbuf);
                    }
                    if (i != -1)
                    {
                        break label0;
                    }
                    lineBuf.finish();
                }
                return (String)lines.poll();
            }
            lineBuf.add(buf, 0, i);
        } while (true);
    }

}
