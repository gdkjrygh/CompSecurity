// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import com.samsung.android.sdk.richnotification.SrnImageAsset;

// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnPrimaryTemplate

public final class SrnQRTemplate extends SrnPrimaryTemplate
{

    private static final String TEMPLATE_NAME = "qr_template";
    private SrnImageAsset mImage;
    private String mSubHeader;

    public SrnQRTemplate()
    {
        super("qr_template", "additional_template");
    }

    private SrnQRTemplate(SrnQRTemplate srnqrtemplate)
    {
        super(srnqrtemplate);
        mSubHeader = srnqrtemplate.mSubHeader;
        mImage = srnqrtemplate.mImage;
    }

    protected Object cloneSelf()
    {
        return new SrnQRTemplate(this);
    }

    public void setImage(SrnImageAsset srnimageasset)
    {
        mImage = srnimageasset;
    }

    public void setSubHeader(String s)
    {
        mSubHeader = s;
    }
}
