// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import com.samsung.android.sdk.richnotification.SrnImageAsset;

// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnSecondaryTemplate

public final class SrnStandardSecondaryTemplate extends SrnSecondaryTemplate
{

    private static final String TEMPLATE_NAME = "template_secondary";
    private String mBody;
    private SrnImageAsset mImage;
    private SrnImageAsset mSmallIcon;
    private SrnImageAsset mSmallIcon2;
    private String mSmallIconTitle;
    private String mSmallIconTitle2;
    private String mSubHeader;
    private String mTitle;

    public SrnStandardSecondaryTemplate()
    {
        super("template_secondary", "default");
    }

    SrnStandardSecondaryTemplate(SrnStandardSecondaryTemplate srnstandardsecondarytemplate)
    {
        super(srnstandardsecondarytemplate);
        mImage = srnstandardsecondarytemplate.mImage;
        mTitle = srnstandardsecondarytemplate.mTitle;
        mSubHeader = srnstandardsecondarytemplate.mSubHeader;
        mBody = srnstandardsecondarytemplate.mBody;
        mSmallIcon = srnstandardsecondarytemplate.mSmallIcon;
        mSmallIconTitle = srnstandardsecondarytemplate.mSmallIconTitle;
        mSmallIcon2 = srnstandardsecondarytemplate.mSmallIcon2;
        mSmallIconTitle2 = srnstandardsecondarytemplate.mSmallIconTitle2;
    }

    protected Object cloneSelf()
    {
        return new SrnStandardSecondaryTemplate(this);
    }

    public void setBody(String s)
    {
        mBody = s;
    }

    public void setImage(SrnImageAsset srnimageasset)
    {
        mImage = srnimageasset;
    }

    public void setSmallIcon1(SrnImageAsset srnimageasset, String s)
    {
        mSmallIcon = srnimageasset;
        mSmallIconTitle = s;
    }

    public void setSmallIcon2(SrnImageAsset srnimageasset, String s)
    {
        mSmallIcon2 = srnimageasset;
        mSmallIconTitle2 = s;
    }

    public void setSubHeader(String s)
    {
        mSubHeader = s;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }
}
