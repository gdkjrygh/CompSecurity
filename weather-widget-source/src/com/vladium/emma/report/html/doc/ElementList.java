// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vladium.emma.report.html.doc:
//            IElementList, IContent, HTMLWriter

public final class ElementList
    implements IElementList
{

    private final List m_contents = new ArrayList();

    public ElementList()
    {
    }

    public IElementList add(int i, IContent icontent)
    {
        if (icontent != null)
        {
            m_contents.add(i, icontent);
        }
        return this;
    }

    public IElementList add(IContent icontent)
    {
        if (icontent != null)
        {
            m_contents.add(icontent);
        }
        return this;
    }

    public void emit(HTMLWriter htmlwriter)
    {
        for (Iterator iterator = m_contents.iterator(); iterator.hasNext(); ((IContent)iterator.next()).emit(htmlwriter)) { }
    }

    public int size()
    {
        return m_contents.size();
    }
}
