// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class s extends DefaultHandler
{

    private ArrayList a;
    private HashMap b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;

    public s()
    {
    }

    public ArrayList a()
    {
        return a;
    }

    public void characters(char ac[], int i, int j)
    {
        if (e || f)
        {
            d = (new StringBuilder()).append(d).append(new String(ac, i, j)).toString();
        }
    }

    public void endDocument()
    {
    }

    public void endElement(String s1, String s2, String s3)
    {
        if (!s2.equals("dict")) goto _L2; else goto _L1
_L1:
        a.add(b);
_L4:
        e = false;
        f = false;
        return;
_L2:
        if (e)
        {
            d = d.replaceAll("(\\r|\\n)", "").trim();
            c = d;
        } else
        if (f)
        {
            d = d.replaceAll("(\\r|\\n)", "").trim();
            b.put(c, d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void startDocument()
    {
        a = new ArrayList();
        e = false;
        f = false;
    }

    public void startElement(String s1, String s2, String s3, Attributes attributes)
    {
        if (s2.equals("dict"))
        {
            b = new HashMap();
        } else
        {
            if (s2.equals("key"))
            {
                e = true;
                d = "";
                return;
            }
            if (s2.equals("string") || s2.equals("integer"))
            {
                f = true;
                d = "";
                return;
            }
        }
    }
}
