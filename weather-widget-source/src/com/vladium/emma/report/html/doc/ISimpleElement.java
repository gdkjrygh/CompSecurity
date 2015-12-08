// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent, AttributeSet, Tag, HTMLWriter, 
//            Attribute

public interface ISimpleElement
    extends IContent
{
    public static abstract class Factory
    {

        public static ISimpleElement create(Tag tag)
        {
            return new SimpleElementImpl(tag, AttributeSet.create());
        }

        public static ISimpleElement create(Tag tag, AttributeSet attributeset)
        {
            return new SimpleElementImpl(tag, attributeset);
        }

        public Factory()
        {
        }
    }

    static class Factory.SimpleElementImpl
        implements ISimpleElement
    {

        protected final AttributeSet m_attrs;
        protected final Tag m_tag;

        public void emit(HTMLWriter htmlwriter)
        {
            htmlwriter.write('<');
            htmlwriter.write(m_tag.getName());
            if (!m_attrs.isEmpty())
            {
                htmlwriter.write(' ');
                m_attrs.emit(htmlwriter);
            }
            htmlwriter.write("/>");
        }

        public AttributeSet getAttributes()
        {
            return m_attrs;
        }

        public Tag getTag()
        {
            return m_tag;
        }

        public ISimpleElement setClass(String s)
        {
            if (s != null && s.length() > 0)
            {
                getAttributes().set(Attribute.CLASS, s);
            }
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("<").append(m_tag.getName()).append("/>").toString();
        }

        Factory.SimpleElementImpl(Tag tag, AttributeSet attributeset)
        {
            m_tag = tag;
            m_attrs = attributeset;
        }
    }


    public abstract AttributeSet getAttributes();

    public abstract Tag getTag();

    public abstract ISimpleElement setClass(String s);
}
