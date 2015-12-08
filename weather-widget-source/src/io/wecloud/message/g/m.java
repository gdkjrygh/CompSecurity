// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import io.wecloud.message.e.c;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

// Referenced classes of package io.wecloud.message.g:
//            k, a, l

public class m
    implements k
{

    private l a;
    private String b;
    private int c;
    private Socket d;
    private BufferedOutputStream e;
    private InputStreamReader f;

    public m(String s, int i, l l1)
    {
        a = l1;
        b = s;
        c = i;
    }

    private static byte[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length + 1024];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        return abyte1;
    }

    public void a()
    {
        d = new Socket(InetAddress.getByName(b), c);
        if (d.isConnected())
        {
            io.wecloud.message.e.c.b("SocketConnect", "socket is connected");
            e = new BufferedOutputStream(d.getOutputStream());
            f = new InputStreamReader(d.getInputStream());
            return;
        } else
        {
            io.wecloud.message.e.c.b("SocketConnect", "socket is disconnected");
            return;
        }
    }

    public void a(a a1)
    {
        e.write(a1.b(), 0, a1.d());
        e.write("\r\n".getBytes("UTF-8"));
        e.flush();
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("send --- ")).append(a1).toString());
    }

    public void b()
    {
        byte abyte0[] = new byte[1024];
        byte abyte1[] = new byte[1];
        io.wecloud.message.e.c.b("receiveMessage", "Running.......");
        int i = 0;
        do
        {
            if (d.getInputStream().read(abyte1) == -1)
            {
                a.h();
                return;
            }
            byte byte0 = abyte1[0];
            if (byte0 == 13)
            {
                d.getInputStream().read(abyte1);
                if (abyte1[0] == 10)
                {
                    abyte0 = new a(abyte0, i);
                    io.wecloud.message.e.c.b("CSH", (new StringBuilder("receive --- ")).append(abyte0.toString()).toString());
                    a.a(abyte0);
                    abyte0 = new byte[1024];
                    i = 0;
                }
            } else
            {
                if (i == abyte0.length)
                {
                    abyte0 = a(abyte0);
                }
                if (byte0 != -1)
                {
                    abyte0[i] = byte0;
                    i++;
                }
            }
        } while (true);
    }

    public void c()
    {
        if (d == null)
        {
            return;
        }
        try
        {
            if (!d.isInputShutdown())
            {
                d.shutdownInput();
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        try
        {
            if (!d.isOutputShutdown())
            {
                d.shutdownOutput();
            }
        }
        catch (Exception exception1)
        {
            exception1.printStackTrace();
        }
        if (e != null)
        {
            e.flush();
            e.close();
        }
        e = null;
_L4:
        if (f != null)
        {
            f.close();
        }
        f = null;
_L2:
        d.close();
        d = null;
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        e = null;
        continue; /* Loop/switch isn't completed */
        obj;
        e = null;
        throw obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        f = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        f = null;
        throw obj;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
