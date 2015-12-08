// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import com.google.android.apps.youtube.common.e.l;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            e, r, n

final class q extends DefaultHandler
{

    public Object a;
    private final e b;
    private final l c = new l();
    private final l d = new l();
    private final l e = new l();
    private final l f = new l();

    public q(e e1)
    {
        b = e1;
        d.offer("");
    }

    public final void characters(char ac[], int i, int j)
    {
        String s = (String)d.peek();
        if (b.a(s) != null)
        {
            ((StringBuilder)f.peek()).append(ac, i, j);
        }
    }

    public final void endElement(String s, String s1, String s2)
    {
        s = (String)d.poll();
        s1 = b.a(s);
        if (s1 != null)
        {
            s2 = (Attributes)e.poll();
            String s3 = ((StringBuilder)f.poll()).toString();
            s = ((String) (c.peek()));
            if (s == null)
            {
                s = ((String) (a));
            }
            a = s;
            s1.a(c, s2, s3);
        }
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
    {
        s = (new StringBuilder()).append((String)d.peek()).append("/").append(s2).toString();
        d.offer(s);
        s1 = b.a(s);
        if (s1 != null)
        {
            s2 = e;
            if (attributes != null)
            {
                s = new AttributesImpl(attributes);
            } else
            {
                s = n.b();
            }
            s2.offer(s);
            f.offer(new StringBuilder());
            s1.a(c, attributes);
        }
    }
}
