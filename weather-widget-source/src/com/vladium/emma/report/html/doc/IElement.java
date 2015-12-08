// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vladium.emma.report.html.doc:
//            ISimpleElement, IElementList, AttributeSet, Tag, 
//            HTMLWriter, IContent, Text

public interface IElement
    extends ISimpleElement, IElementList
{
    public static abstract class Factory
    {

        public static IElement create(Tag tag)
        {
            return new ElementImpl(tag, AttributeSet.create());
        }

        public static IElement create(Tag tag, AttributeSet attributeset)
        {
            return new ElementImpl(tag, attributeset);
        }

        public Factory()
        {
        }
    }

    static class Factory.ElementImpl extends ISimpleElement.Factory.SimpleElementImpl
        implements IElement
    {

        private static final boolean DEBUG_HTML = false;
        protected final List m_contents = new ArrayList();

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
            String s = m_tag.getName();
            htmlwriter.write('<');
            htmlwriter.write(s);
            if (!m_attrs.isEmpty())
            {
                htmlwriter.write(' ');
                m_attrs.emit(htmlwriter);
            }
            htmlwriter.write('>');
            for (Iterator iterator = m_contents.iterator(); iterator.hasNext(); ((IContent)iterator.next()).emit(htmlwriter)) { }
            htmlwriter.write("</");
            htmlwriter.write(s);
            htmlwriter.write('>');
        }

        public IElement setText(String s, boolean flag)
        {
            if (s != null)
            {
                m_contents.clear();
                m_contents.add(new Text(s, flag));
            }
            return this;
        }

        public int size()
        {
            return m_contents.size();
        }

        public String toString()
        {
            return (new StringBuilder()).append("<").append(m_tag.getName()).append(">").toString();
        }

        Factory.ElementImpl(Tag tag, AttributeSet attributeset)
        {
            super(tag, attributeset);
        }
    }


    public abstract IElement setText(String s, boolean flag);
}
