// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;


// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnPrimaryTemplate

final class SrnEventTemplate extends SrnPrimaryTemplate
{

    private static final String TEMPLATE_NAME = "event_template";
    private String mLargeString;
    private String mSubHeader;
    private String mSubscriptString;

    public SrnEventTemplate()
    {
        super("event_template", "additional_template");
    }

    private SrnEventTemplate(SrnEventTemplate srneventtemplate)
    {
        super(srneventtemplate);
        mLargeString = srneventtemplate.mLargeString;
        mSubscriptString = srneventtemplate.mSubscriptString;
        mSubHeader = srneventtemplate.mSubHeader;
    }

    protected Object cloneSelf()
    {
        return new SrnEventTemplate(this);
    }

    public void setLargeString(String s)
    {
        mLargeString = s;
    }

    public void setSubHeader(String s)
    {
        mSubHeader = s;
    }

    public void setSubscriptString(String s)
    {
        mSubscriptString = s;
    }
}
