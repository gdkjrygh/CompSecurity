// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net.http;

import com.sessionm.core.h;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class d
{

    private File gl;
    private ByteArrayOutputStream in;
    private byte io[];
    private String ip;

    public d(ByteArrayOutputStream bytearrayoutputstream)
    {
        in = bytearrayoutputstream;
    }

    public void b(File file)
    {
        gl = file;
    }

    public File bC()
    {
        return gl;
    }

    public String bD()
    {
        if (in == null)
        {
            return null;
        }
        if (ip != null)
        {
            return ip;
        } else
        {
            ip = in.toString();
            return ip;
        }
    }

    public byte[] bE()
    {
        if (in == null)
        {
            return null;
        }
        if (io != null)
        {
            return io;
        } else
        {
            io = in.toByteArray();
            return io;
        }
    }

    protected void finalize()
    {
        if (in != null)
        {
            h.a(in);
        }
        try
        {
            super.finalize();
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }
}
