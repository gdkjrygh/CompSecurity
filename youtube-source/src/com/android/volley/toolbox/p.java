// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.ParseError;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.o;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.toolbox:
//            q, e

public class p extends q
{

    public p(int i, String s, JSONObject jsonobject, o o, n n)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.toString();
        }
        super(i, s, jsonobject, o, n);
    }

    protected m a(j j1)
    {
        try
        {
            j1 = m.a(new JSONObject(new String(j1.b, e.a(j1.c))), e.a(j1));
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            return m.a(new ParseError(j1));
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            return m.a(new ParseError(j1));
        }
        return j1;
    }
}
