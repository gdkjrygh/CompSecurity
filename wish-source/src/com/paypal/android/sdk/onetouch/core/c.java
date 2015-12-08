// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            d

public class c
{

    public c()
    {
    }

    public static String a(File file)
    {
        file = new RandomAccessFile(file, "r");
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        file.close();
        return new String(abyte0, "UTF-8");
    }

    public static String a(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return (new StringBuilder("unable_to_encode:")).append(s).toString();
        }
        return s1;
    }

    public static Header a(String s, List list, String s1)
    {
        s = String.format("Trace: [%s] %s, %s", new Object[] {
            s, "\"%08.8x: Operation = %80s Duration: %8.2f Iterations: %+4d\"", "memorySize * 8 + offset"
        });
        ArrayList arraylist = new ArrayList();
        Header header;
        for (list = list.iterator(); list.hasNext(); arraylist.add((new StringBuilder()).append(header.getName()).append(": ").append(header.getValue()).toString()))
        {
            header = (Header)list.next();
        }

        Collections.sort(arraylist);
        list = (new StringBuilder()).append(TextUtils.join(";", arraylist.toArray())).append(s1).toString();
        s1 = Mac.getInstance("HmacSHA1");
        s1.init(new SecretKeySpec(s.getBytes(), "HmacSHA1"));
        s1.update(list.getBytes());
        s = s1.doFinal();
        list = new StringBuilder();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            list.append(String.format("%02x", new Object[] {
                Byte.valueOf(s[i])
            }));
        }

        return new BasicHeader("PayPal-Item-Id", list.toString());
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(File file, String s)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        fileoutputstream.write(s.getBytes("UTF-8"));
        a(((Closeable) (fileoutputstream)));
        return;
        file;
        s = null;
_L2:
        a(((Closeable) (s)));
        throw file;
        file;
        s = fileoutputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(CharSequence charsequence)
    {
        boolean flag1 = false;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        int j = charsequence.length();
        if (j != 0) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        return flag;
_L3:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                flag = flag1;
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public static boolean b(CharSequence charsequence)
    {
        return !a(charsequence);
    }

    public String a()
    {
        return "2.1.1";
    }

    public String b()
    {
        return "PayPalOTC";
    }

    public String c()
    {
        new d();
        String s = com.paypal.android.sdk.onetouch.core.d.b();
        String s1 = com.paypal.android.sdk.onetouch.core.d.a();
        StringBuilder stringbuilder = new StringBuilder();
        if (b(""))
        {
            stringbuilder.append(" ");
        }
        return String.format("PayPalSDK/%s %s (%s; %s; %s)", new Object[] {
            "OneTouchCore-Android", "2.1.1", s, s1, stringbuilder.toString().trim()
        });
    }

    public String d()
    {
        return "dee813cc4115b9db2f6aaa12e59ebfc4fe5dd54c";
    }
}
