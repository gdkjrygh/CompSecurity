// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;


// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnPrimaryTemplate

public final class SrnStandardTemplate extends SrnPrimaryTemplate
{
    public static final class HeaderSizeType extends Enum
    {

        private static final HeaderSizeType ENUM$VALUES[];
        public static final HeaderSizeType FULL_SCREEN;
        public static final HeaderSizeType MEDIUM;
        public static final HeaderSizeType SMALL;
        private final String mTemplateName;

        private String getTemplateName()
        {
            return mTemplateName;
        }

        public static HeaderSizeType valueOf(String s)
        {
            return (HeaderSizeType)Enum.valueOf(com/samsung/android/sdk/richnotification/templates/SrnStandardTemplate$HeaderSizeType, s);
        }

        public static HeaderSizeType[] values()
        {
            HeaderSizeType aheadersizetype[] = ENUM$VALUES;
            int i = aheadersizetype.length;
            HeaderSizeType aheadersizetype1[] = new HeaderSizeType[i];
            System.arraycopy(aheadersizetype, 0, aheadersizetype1, 0, i);
            return aheadersizetype1;
        }

        static 
        {
            FULL_SCREEN = new HeaderSizeType("FULL_SCREEN", 0, "full_screen_template");
            MEDIUM = new HeaderSizeType("MEDIUM", 1, "medium_header_template");
            SMALL = new HeaderSizeType("SMALL", 2, "small_header_template");
            ENUM$VALUES = (new HeaderSizeType[] {
                FULL_SCREEN, MEDIUM, SMALL
            });
        }


        private HeaderSizeType(String s, int i, String s1)
        {
            super(s, i);
            mTemplateName = s1;
        }
    }


    private static final String FULL_TEMPLATE_NAME = "full_screen_template";
    private static final String MEIDUM_TEMPLATE_NAME = "medium_header_template";
    private static final String SMALL_TEMPLATE_NAME = "small_header_template";
    private String mBody;
    private String mSubHeader;

    public SrnStandardTemplate()
    {
        this(HeaderSizeType.SMALL);
    }

    public SrnStandardTemplate(HeaderSizeType headersizetype)
    {
        super(headersizetype.getTemplateName(), "default");
    }

    private SrnStandardTemplate(SrnStandardTemplate srnstandardtemplate)
    {
        super(srnstandardtemplate);
        mSubHeader = srnstandardtemplate.mSubHeader;
        mBody = srnstandardtemplate.mBody;
    }

    protected Object cloneSelf()
    {
        return new SrnStandardTemplate(this);
    }

    public void setBody(String s)
    {
        mBody = s;
    }

    public void setHeaderSize(HeaderSizeType headersizetype)
    {
        setName(headersizetype.getTemplateName());
    }

    public void setSubHeader(String s)
    {
        mSubHeader = s;
    }
}
