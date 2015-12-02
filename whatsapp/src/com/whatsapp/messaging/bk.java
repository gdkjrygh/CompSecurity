// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

abstract class bk extends SSLSocketFactory
{

    private static final String z[];
    private SSLSocketFactory a;
    private final SSLContext b;

    protected bk()
    {
        Object obj = a(a(a(null, z[1]), z[0]), z[2]);
        if (obj == null)
        {
            obj = new NoSuchAlgorithmException(z[3]);
            Log.a(((Throwable) (obj)));
            throw new RuntimeException(((Throwable) (obj)));
        } else
        {
            b = ((SSLContext) (obj));
            return;
        }
    }

    private static SSLContext a(SSLContext sslcontext, String s)
    {
        SSLContext sslcontext1 = sslcontext;
        if (sslcontext == null)
        {
            try
            {
                sslcontext1 = SSLContext.getInstance(s);
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                Log.w((new StringBuilder()).append(s).append(z[4]).append(nosuchalgorithmexception).toString());
                return sslcontext;
            }
        }
        return sslcontext1;
    }

    private SSLSocketFactory a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = a(b);
        }
        SSLSocketFactory sslsocketfactory = a;
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected abstract SSLSocketFactory a(SSLContext sslcontext);

    public Socket createSocket()
    {
        return a().createSocket();
    }

    public Socket createSocket(String s, int i)
    {
        return a().createSocket(s, i);
    }

    public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
    {
        return a().createSocket(s, i, inetaddress, j);
    }

    public Socket createSocket(InetAddress inetaddress, int i)
    {
        return a().createSocket(inetaddress, i);
    }

    public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
    {
        return a().createSocket(inetaddress, i, inetaddress1, j);
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return a().createSocket(socket, s, i, flag);
    }

    public String[] getDefaultCipherSuites()
    {
        return a().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites()
    {
        return a().getSupportedCipherSuites();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "G\020\0031h";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "@\017\034";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "G\020\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Z,o,5{4!g:x$ 52`+\"g:b\"&+:v/*g/{c?54b*+\"{G\020\003g({ $\"/g";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "4\"# 4f*;/64- 3{u5..7u!#\"{r,=g\bG\017\f(5`&73a4";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 91;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 20;
          goto _L9
_L5:
        byte1 = 67;
          goto _L9
_L6:
        byte1 = 79;
          goto _L9
        byte1 = 71;
          goto _L9
    }
}
