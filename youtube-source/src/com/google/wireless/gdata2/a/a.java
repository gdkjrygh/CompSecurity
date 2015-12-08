// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2.a;


public final class a
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private com.google.wireless.gdata2.a.a.a n;

    private static void a(StringBuffer stringbuffer, String s, String s1)
    {
        boolean flag;
        if (s1 == null || s1.length() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            stringbuffer.append(s);
            stringbuffer.append(": ");
            stringbuffer.append(s1);
            stringbuffer.append("\n");
        }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        a(stringbuffer, "ID", a);
        a(stringbuffer, "TITLE", b);
        a(stringbuffer, "EDIT URI", c);
        a(stringbuffer, "HTML URI", d);
        a(stringbuffer, "SUMMARY", e);
        a(stringbuffer, "CONTENT", f);
        a(stringbuffer, "AUTHOR", g);
        a(stringbuffer, "CATEGORY", h);
        a(stringbuffer, "CATEGORY SCHEME", i);
        a(stringbuffer, "PUBLICATION DATE", j);
        a(stringbuffer, "UPDATE DATE", k);
        a(stringbuffer, "DELETED", String.valueOf(m));
        a(stringbuffer, "ETAG", String.valueOf(l));
        if (n != null)
        {
            a(stringbuffer, "BATCH", n.toString());
        }
        return stringbuffer.toString();
    }
}
