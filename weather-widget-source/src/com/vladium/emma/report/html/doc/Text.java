// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;

import com.vladium.util.Strings;

// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent, HTMLWriter

public final class Text
    implements IContent
{

    private final boolean m_nbsp;
    private final String m_text;

    public Text(String s, boolean flag)
    {
        m_text = s;
        m_nbsp = flag;
    }

    public void emit(HTMLWriter htmlwriter)
    {
label0:
        {
            if (m_text != null)
            {
                if (!m_nbsp)
                {
                    break label0;
                }
                htmlwriter.write(Strings.HTMLEscapeSP(m_text));
            }
            return;
        }
        htmlwriter.write(Strings.HTMLEscape(m_text));
    }
}
