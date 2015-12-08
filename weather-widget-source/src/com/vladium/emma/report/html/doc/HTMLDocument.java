// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;

import com.vladium.util.IConstants;

// Referenced classes of package com.vladium.emma.report.html.doc:
//            Tag, AttributeSet, ISimpleElement, Attribute, 
//            IElement, IContent, IElementList, HTMLWriter

public final class HTMLDocument extends IElement.Factory.ElementImpl
{

    private final IElement m_body;
    private IContent m_footer;
    private final IElement m_head;
    private IContent m_header;
    private final String m_title;

    public HTMLDocument()
    {
        this(null, null);
    }

    public HTMLDocument(String s, String s1)
    {
        super(Tag.HTML, AttributeSet.create());
        IElement ielement = IElement.Factory.create(Tag.HEAD);
        m_head = ielement;
        super.add(ielement);
        ielement = IElement.Factory.create(Tag.BODY);
        m_body = ielement;
        super.add(ielement);
        if (s1 != null && s1.length() != 0)
        {
            ISimpleElement isimpleelement = ISimpleElement.Factory.create(Tag.META);
            isimpleelement.getAttributes().set(Attribute.HTTP_EQUIV, "Content-Type").set(Attribute.CONTENT, (new StringBuilder()).append("text/html; charset=").append(s1).toString());
            m_head.add(isimpleelement);
        }
        if (s != null)
        {
            s1 = IElement.Factory.create(Tag.TITLE).setText(s, false);
            m_head.add(s1);
        }
        m_title = s;
    }

    public volatile IElementList add(int i, IContent icontent)
    {
        return super.add(i, icontent);
    }

    public IElementList add(IContent icontent)
    {
        m_body.add(icontent);
        return this;
    }

    public void addEmptyP()
    {
        add(IElement.Factory.create(Tag.P));
    }

    public void addH(int i, IContent icontent, String s)
    {
        IElement ielement = IElement.Factory.create(Tag.Hs[i]);
        ielement.add(icontent);
        ielement.setClass(s);
        add(ielement);
    }

    public void addH(int i, String s, String s1)
    {
        IElement ielement = IElement.Factory.create(Tag.Hs[i]);
        ielement.setText(s, true);
        ielement.setClass(s1);
        add(ielement);
    }

    public void addHR(int i)
    {
        IElement ielement = IElement.Factory.create(Tag.HR);
        ielement.getAttributes().set(Attribute.SIZE, i);
        add(ielement);
    }

    public void addLINK(String s, String s1)
    {
        ISimpleElement isimpleelement = ISimpleElement.Factory.create(Tag.LINK);
        isimpleelement.getAttributes().set(Attribute.TYPE, s);
        isimpleelement.getAttributes().set(Attribute.HREF, s1);
        isimpleelement.getAttributes().set(Attribute.SRC, s1);
        m_head.add(isimpleelement);
    }

    public void addStyle(String s)
    {
        if (s != null)
        {
            IElement ielement = IElement.Factory.create(Tag.STYLE);
            ielement.getAttributes().set(Attribute.TYPE, "text/css");
            StringBuffer stringbuffer = new StringBuffer("<!--");
            stringbuffer.append(IConstants.EOL);
            ielement.setText(s, false);
            stringbuffer.append(IConstants.EOL);
            stringbuffer.append("-->");
            m_head.add(ielement);
        }
    }

    public void emit(HTMLWriter htmlwriter)
    {
        if (m_header != null)
        {
            m_body.add(0, m_header);
        }
        if (m_footer != null)
        {
            m_body.add(m_body.size(), m_footer);
        }
        super.emit(htmlwriter);
    }

    public volatile AttributeSet getAttributes()
    {
        return super.getAttributes();
    }

    public IElement getBody()
    {
        return m_body;
    }

    public IContent getFooter()
    {
        return m_footer;
    }

    public IElement getHead()
    {
        return m_head;
    }

    public IContent getHeader()
    {
        return m_header;
    }

    public volatile Tag getTag()
    {
        return super.getTag();
    }

    public String getTitle()
    {
        return m_title;
    }

    public volatile ISimpleElement setClass(String s)
    {
        return super.setClass(s);
    }

    public void setFooter(IContent icontent)
    {
        if (icontent != null)
        {
            m_footer = icontent;
        }
    }

    public void setHeader(IContent icontent)
    {
        if (icontent != null)
        {
            m_header = icontent;
        }
    }

    public volatile IElement setText(String s, boolean flag)
    {
        return super.setText(s, flag);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
