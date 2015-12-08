// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b;

import com.gau.a.a.c.b;
import com.gau.a.a.e.a;
import com.jiubang.commerce.utils.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

public class e
    implements b
{

    private boolean a;

    public e()
    {
        a = true;
    }

    public e(boolean flag)
    {
        a = true;
        a = flag;
    }

    public static JSONObject a(InputStream inputstream, boolean flag)
    {
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        Object obj = u.a(inputstream);
_L7:
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONObject(((String) (obj)));
        byte abyte0[];
        int i;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
            }
        }
        return ((JSONObject) (obj));
_L4:
        obj = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L5:
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
          goto _L5
        obj;
        ((IOException) (obj)).printStackTrace();
        if (inputstream == null) goto _L1; else goto _L6
_L6:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        return null;
        obj = new String(((ByteArrayOutputStream) (obj)).toByteArray());
          goto _L7
        if (inputstream == null) goto _L1; else goto _L8
_L8:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        return null;
        Object obj1;
        obj1;
        ((JSONException) (obj1)).printStackTrace();
        if (inputstream == null) goto _L1; else goto _L9
_L9:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        return null;
        obj1;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
            }
        }
        throw obj1;
    }

    public com.gau.a.a.e.b a(com.gau.a.a.d.a a1, HttpResponse httpresponse)
    {
        return new a(4, a(httpresponse.getEntity().getContent(), a));
    }
}
