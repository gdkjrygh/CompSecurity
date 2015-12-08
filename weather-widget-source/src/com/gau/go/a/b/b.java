// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.b;

import android.content.Context;
import com.gau.go.a.a.c;
import com.gau.go.a.f.e;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

// Referenced classes of package com.gau.go.a.b:
//            a

public class b extends a
{

    public b(Context context)
    {
        super(context);
    }

    public void c(c c1)
    {
        Object obj2 = null;
        Object obj1 = null;
        c1.f = 1;
        Object obj;
        Object obj3;
        if (c1 != null)
        {
            obj = b(c1);
        } else
        {
            obj = null;
        }
        if (c1.a == 1030)
        {
            obj = new StringBuilder("");
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj3 = ((StringBuilder) (obj)).toString();
        if ((c1.j & 1) == 0 || (c1.j & 2) == 0) goto _L4; else goto _L3
_L3:
        obj = com.gau.go.a.d.b.a(URLEncoder.encode(e.a(((String) (obj3)).getBytes()), "UTF-8"), "lvsiqiaoil611230");
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj3 = new DataOutputStream(a.getOutputStream());
        ((DataOutputStream) (obj3)).writeBytes(((String) (obj)));
        ((DataOutputStream) (obj3)).flush();
        ((DataOutputStream) (obj3)).close();
        if (a.getResponseCode() != 200) goto _L6; else goto _L5
_L5:
        if (c1.a == 19 || c1.a == 1030)
        {
            c1.f = 3;
            a.disconnect();
            return;
        }
          goto _L7
_L4:
label0:
        {
            if ((c1.j & 1) == 0)
            {
                break label0;
            }
            obj = e.a(((String) (obj3)).getBytes());
        }
          goto _L8
        obj = obj3;
        if ((c1.j & 2) == 0) goto _L8; else goto _L9
_L9:
        obj = com.gau.go.a.d.b.a(URLEncoder.encode(((String) (obj3)), "UTF-8"), "lvsiqiaoil611230");
          goto _L8
_L7:
        obj = new BufferedReader(new InputStreamReader(a.getInputStream()), 5);
        obj1 = ((BufferedReader) (obj)).readLine();
        if (!((String) (obj1)).trim().equalsIgnoreCase("OK")) goto _L11; else goto _L10
_L10:
        e.a((new StringBuilder()).append("Upload static data Ok:").append(((String) (obj1))).append(", current url:").append(a.getURL().toString()).toString());
        c1.f = 3;
_L14:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        ((BufferedReader) (obj)).close();
        a.disconnect();
        return;
        obj;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
_L6:
        c1.f = 2;
        return;
_L11:
        try
        {
            c1.f = 2;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally { }
_L12:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        ((BufferedReader) (obj)).close();
        a.disconnect();
        return;
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L6
        obj1;
        obj = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        ((BufferedReader) (obj)).close();
        a.disconnect();
        throw obj1;
        obj;
        obj = obj1;
          goto _L12
_L2:
        return;
        if (true) goto _L14; else goto _L13
_L13:
    }
}
