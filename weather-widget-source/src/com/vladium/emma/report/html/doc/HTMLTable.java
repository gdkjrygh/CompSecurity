// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            Tag, AttributeSet, Attribute, IElement, 
//            IContent, IElementList, HTMLWriter, ISimpleElement

public final class HTMLTable extends IElement.Factory.ElementImpl
{
    private static class Cell extends IElement.Factory.ElementImpl
        implements ICell
    {

        public ICell setColspan(int i)
        {
            getAttributes().set(Attribute.COLSPAN, i);
            return this;
        }

        Cell(Tag tag)
        {
            super(tag, AttributeSet.create());
        }
    }

    public static interface ICell
        extends IElement
    {

        public abstract ICell setColspan(int i);
    }

    public static interface IRow
        extends IElement
    {

        public abstract ICell newCell();
    }

    private static class Row extends IElement.Factory.ElementImpl
        implements IRow
    {

        private final boolean m_th;

        public ICell newCell()
        {
            Object obj;
            if (m_th)
            {
                obj = Tag.TH;
            } else
            {
                obj = Tag.TD;
            }
            obj = new Cell(((Tag) (obj)));
            add(((IContent) (obj)));
            return ((ICell) (obj));
        }

        Row(boolean flag)
        {
            super(Tag.TR, AttributeSet.create());
            m_th = flag;
        }
    }


    private IElement m_caption;

    public HTMLTable(String s, String s1, String s2, String s3)
    {
        super(Tag.TABLE, AttributeSet.create());
        AttributeSet attributeset = getAttributes();
        if (s != null)
        {
            attributeset.set(Attribute.WIDTH, s);
        }
        if (s1 != null)
        {
            attributeset.set(Attribute.BORDER, s1);
        }
        if (s2 != null)
        {
            attributeset.set(Attribute.CELLPADDING, s2);
        }
        if (s3 != null)
        {
            attributeset.set(Attribute.CELLSPACING, s3);
        }
    }

    public volatile IElementList add(int i, IContent icontent)
    {
        return super.add(i, icontent);
    }

    public volatile IElementList add(IContent icontent)
    {
        return super.add(icontent);
    }

    public void emit(HTMLWriter htmlwriter)
    {
        if (m_caption != null)
        {
            add(0, m_caption);
        }
        super.emit(htmlwriter);
    }

    public volatile AttributeSet getAttributes()
    {
        return super.getAttributes();
    }

    public volatile Tag getTag()
    {
        return super.getTag();
    }

    public IRow newRow()
    {
        Row row = new Row(false);
        add(row);
        return row;
    }

    public IRow newTitleRow()
    {
        Row row = new Row(true);
        add(row);
        return row;
    }

    public void setCaption(String s, String s1, boolean flag)
    {
        m_caption = IElement.Factory.create(Tag.CAPTION);
        m_caption.getAttributes().set(Attribute.ALIGN, s);
        m_caption.setText(s1, flag);
    }

    public volatile ISimpleElement setClass(String s)
    {
        return super.setClass(s);
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
