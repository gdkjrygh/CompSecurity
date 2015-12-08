// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSource;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameReader, Spdy3, NameValueBlockReader, ErrorCode, 
//            HeadersMode, Settings

static final class client
    implements FrameReader
{

    private final boolean client;
    private final NameValueBlockReader headerBlockReader;
    private final BufferedSource source;

    private static transient IOException ioException(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    private void readGoAway(andler andler, int i, int j)
        throws IOException
    {
        if (j != 8)
        {
            throw ioException("TYPE_GOAWAY length: %d != 8", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = source.readInt();
        j = source.readInt();
        ErrorCode errorcode = ErrorCode.fromSpdyGoAway(j);
        if (errorcode == null)
        {
            throw ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            andler.goAway(i & 0x7fffffff, errorcode, ByteString.EMPTY);
            return;
        }
    }

    private void readHeaders(andler andler, int i, int j)
        throws IOException
    {
        andler.headers(false, false, source.readInt() & 0x7fffffff, -1, headerBlockReader.readNameValueBlock(j - 4), HeadersMode.SPDY_HEADERS);
    }

    private void readPing(andler andler, int i, int j)
        throws IOException
    {
        boolean flag1 = true;
        if (j != 4)
        {
            throw ioException("TYPE_PING length: %d != 4", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = source.readInt();
        boolean flag2 = client;
        boolean flag;
        if ((i & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag2 == flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        andler.ping(flag, i, 0);
    }

    private void readRstStream(andler andler, int i, int j)
        throws IOException
    {
        if (j != 8)
        {
            throw ioException("TYPE_RST_STREAM length: %d != 8", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = source.readInt();
        j = source.readInt();
        ErrorCode errorcode = ErrorCode.fromSpdy3Rst(j);
        if (errorcode == null)
        {
            throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            andler.rstStream(i & 0x7fffffff, errorcode);
            return;
        }
    }

    private void readSettings(andler andler, int i, int j)
        throws IOException
    {
        boolean flag = true;
        int k = source.readInt();
        if (j != k * 8 + 4)
        {
            throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
        }
        Settings settings = new Settings();
        for (j = 0; j < k; j++)
        {
            int l = source.readInt();
            settings.set(l & 0xffffff, (0xff000000 & l) >>> 24, source.readInt());
        }

        if ((i & 1) == 0)
        {
            flag = false;
        }
        andler.settings(flag, settings);
    }

    private void readSynReply(andler andler, int i, int j)
        throws IOException
    {
        int k = source.readInt();
        java.util.List list = headerBlockReader.readNameValueBlock(j - 4);
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        andler.headers(false, flag, k & 0x7fffffff, -1, list, HeadersMode.SPDY_REPLY);
    }

    private void readSynStream(andler andler, int i, int j)
        throws IOException
    {
        boolean flag1 = true;
        int k = source.readInt();
        int l = source.readInt();
        source.readShort();
        java.util.List list = headerBlockReader.readNameValueBlock(j - 10);
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 2) == 0)
        {
            flag1 = false;
        }
        andler.headers(flag1, flag, k & 0x7fffffff, l & 0x7fffffff, list, HeadersMode.SPDY_SYN_STREAM);
    }

    private void readWindowUpdate(andler andler, int i, int j)
        throws IOException
    {
        if (j != 8)
        {
            throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = source.readInt();
        long l = source.readInt() & 0x7fffffff;
        if (l == 0L)
        {
            throw ioException("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l)
            });
        } else
        {
            andler.windowUpdate(i & 0x7fffffff, l);
            return;
        }
    }

    public void close()
        throws IOException
    {
        headerBlockReader.close();
    }

    public boolean nextFrame(andler andler)
        throws IOException
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        int l;
        try
        {
            j = source.readInt();
            k = source.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (andler andler)
        {
            return false;
        }
        if ((0x80000000 & j) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = (0xff000000 & k) >>> 24;
        k &= 0xffffff;
        if (i != 0)
        {
            i = (0x7fff0000 & j) >>> 16;
            if (i != 3)
            {
                throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
            }
            switch (j & 0xffff)
            {
            case 5: // '\005'
            default:
                source.skip(k);
                return true;

            case 1: // '\001'
                readSynStream(andler, l, k);
                return true;

            case 2: // '\002'
                readSynReply(andler, l, k);
                return true;

            case 3: // '\003'
                readRstStream(andler, l, k);
                return true;

            case 4: // '\004'
                readSettings(andler, l, k);
                return true;

            case 6: // '\006'
                readPing(andler, l, k);
                return true;

            case 7: // '\007'
                readGoAway(andler, l, k);
                return true;

            case 8: // '\b'
                readHeaders(andler, l, k);
                return true;

            case 9: // '\t'
                readWindowUpdate(andler, l, k);
                break;
            }
            return true;
        }
        if ((l & 1) != 0)
        {
            flag = true;
        }
        andler.data(flag, j & 0x7fffffff, source, k);
        return true;
    }

    public void readConnectionPreface()
    {
    }

    andler(BufferedSource bufferedsource, boolean flag)
    {
        source = bufferedsource;
        headerBlockReader = new NameValueBlockReader(source);
        client = flag;
    }
}
