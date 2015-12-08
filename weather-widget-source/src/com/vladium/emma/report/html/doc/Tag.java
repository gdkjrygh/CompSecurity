// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent, HTMLWriter

public abstract class Tag
    implements IContent
{
    private static final class TagImpl extends Tag
    {

        private final String m_name;

        public void emit(HTMLWriter htmlwriter)
        {
            htmlwriter.write(m_name);
        }

        public String getName()
        {
            return m_name;
        }

        public String toString()
        {
            return m_name;
        }

        TagImpl(String s)
        {
            m_name = s;
        }
    }


    public static final Tag A = new TagImpl("A");
    public static final Tag BODY = new TagImpl("BODY");
    public static final Tag CAPTION = new TagImpl("CAPTION");
    public static final Tag H1;
    public static final Tag H2;
    public static final Tag H3;
    public static final Tag H4;
    public static final Tag H5 = new TagImpl("H5");
    public static final Tag H6;
    public static final Tag HEAD = new TagImpl("HEAD");
    public static final Tag HR = new TagImpl("HR");
    public static final Tag HTML = new TagImpl("HTML");
    public static final Tag Hs[];
    public static final Tag LINK = new TagImpl("LINK");
    public static final Tag META = new TagImpl("META");
    public static final Tag P = new TagImpl("P");
    public static final Tag SPAN = new TagImpl("SPAN");
    public static final Tag STYLE = new TagImpl("STYLE");
    public static final Tag TABLE = new TagImpl("TABLE");
    public static final Tag TD = new TagImpl("TD");
    public static final Tag TH = new TagImpl("TH");
    public static final Tag TITLE = new TagImpl("TITLE");
    public static final Tag TR = new TagImpl("TR");

    Tag()
    {
    }

    public abstract String getName();

    static 
    {
        H1 = new TagImpl("H1");
        H2 = new TagImpl("H2");
        H3 = new TagImpl("H3");
        H4 = new TagImpl("H4");
        H6 = new TagImpl("H6");
        Hs = (new Tag[] {
            H1, H2, H3, H4, H4, H6
        });
    }
}
