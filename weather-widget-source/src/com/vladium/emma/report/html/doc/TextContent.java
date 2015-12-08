// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent, HTMLWriter

public final class TextContent
    implements IContent
{

    private final String m_text;

    public TextContent(String s)
    {
        m_text = s;
    }

    public void emit(HTMLWriter htmlwriter)
    {
        if (m_text != null)
        {
            htmlwriter.write(m_text);
        }
    }
}
