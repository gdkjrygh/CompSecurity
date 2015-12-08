// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.n;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class r extends Request
{

    public r(int i, String s1, n n)
    {
        super(i, s1, n);
    }

    public List b(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add("Default response logging.");
        arraylist.add((new StringBuilder("Status: ")).append(j1.a).append("\n").toString());
        String s1;
        for (Iterator iterator = j1.c.keySet().iterator(); iterator.hasNext(); arraylist.add((new StringBuilder("Header:")).append(s1).append(":").append((String)j1.c.get(s1)).append("\n").toString()))
        {
            s1 = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_144;
        j1;
        throw j1;
        if (j1.b != null)
        {
            arraylist.add((new StringBuilder("Actual data length: ")).append(j1.b.length).toString());
            for (j1 = m.a(new String(j1.b), 2048).iterator(); j1.hasNext(); arraylist.add((String)j1.next())) { }
            break MISSING_BLOCK_LABEL_238;
        }
        arraylist.add("Response had no data.");
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public String s()
    {
        Object obj;
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Basic CURL command:");
        try
        {
            Map map = h();
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (!s1.equals("Content-Type"))
                {
                    ((StringBuilder) (obj)).append((new StringBuilder("-H \"")).append(s1).append(":").append((String)map.get(s1)).append("\" ").toString());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.a("Auth failure.", ((Throwable) (obj)));
            return "Received exception while trying to get logs.";
        }
        ((StringBuilder) (obj)).append((new StringBuilder("'")).append(c()).append("'").toString());
        obj = ((StringBuilder) (obj)).toString();
        return ((String) (obj));
    }
}
