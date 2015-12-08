// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.b;

import android.net.Uri;
import java.util.Locale;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class a extends DefaultHandler
{

    private final StringBuilder a = new StringBuilder();
    private Uri b;
    private String c;
    private String d;
    private int e;
    private boolean f;

    public a()
    {
        e = -2;
        b = null;
        f = true;
    }

    public final Uri a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final void characters(char ac[], int i, int j)
    {
        a.append(ac, i, j);
    }

    public final int d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }

    public final void endElement(String s, String s1, String s2)
    {
        if (!"state".equals(s1)) goto _L2; else goto _L1
_L1:
        s = a.toString().toLowerCase(Locale.US);
        if (!s.startsWith("installable")) goto _L4; else goto _L3
_L3:
        e = 0;
        b = Uri.parse(s.replace("installable = ", ""));
_L6:
        return;
_L4:
        if (s.equals("running"))
        {
            e = 1;
            return;
        }
        if (s.equals("stopped"))
        {
            e = 2;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ("screenId".equals(s1))
        {
            d = a.toString();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void startDocument()
    {
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
    {
        a.delete(0, a.length());
        if ("link".equals(s1) && "run".equals(attributes.getValue("", "rel")))
        {
            c = attributes.getValue("", "href");
        }
        if ("options".equals(s1))
        {
            f = Boolean.parseBoolean(attributes.getValue("", "allowStop"));
        }
    }
}
