// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;


// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnPrimaryTemplate

public final class SrnLargeHeaderTemplate extends SrnPrimaryTemplate
{

    private static final String TEMPLATE_NAME = "large_header_template";

    public SrnLargeHeaderTemplate()
    {
        super("large_header_template", "default");
    }

    private SrnLargeHeaderTemplate(SrnLargeHeaderTemplate srnlargeheadertemplate)
    {
        super(srnlargeheadertemplate);
    }

    protected Object cloneSelf()
    {
        return new SrnLargeHeaderTemplate(this);
    }
}
