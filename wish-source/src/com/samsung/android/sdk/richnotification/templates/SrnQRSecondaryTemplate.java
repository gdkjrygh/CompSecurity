// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import com.samsung.android.sdk.richnotification.SrnImageAsset;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnSecondaryTemplate

public final class SrnQRSecondaryTemplate extends SrnSecondaryTemplate
{
    private static class BodyItem
    {

        private final String mValue;

        private BodyItem(String s)
        {
            mValue = s;
        }

        BodyItem(String s, BodyItem bodyitem)
        {
            this(s);
        }
    }

    private static class TitleItem
    {

        private final String mValue;

        private TitleItem(String s)
        {
            mValue = s;
        }

        TitleItem(String s, TitleItem titleitem)
        {
            this(s);
        }
    }


    private static final String TEMPLATE_NAME = "qr_secondary_template";
    private SrnImageAsset mImage;
    private List mListBody;
    private List mListTitle;
    private SrnImageAsset mSmallIcon;
    private SrnImageAsset mSmallIcon2;
    private String mSmallIconTitle;
    private String mSmallIconTitle2;

    public SrnQRSecondaryTemplate()
    {
        super("qr_secondary_template", "additional_template");
    }

    private SrnQRSecondaryTemplate(SrnQRSecondaryTemplate srnqrsecondarytemplate)
    {
        super(srnqrsecondarytemplate);
        mImage = srnqrsecondarytemplate.mImage;
        if (srnqrsecondarytemplate.mListTitle != null)
        {
            mListTitle = new ArrayList(srnqrsecondarytemplate.mListTitle);
        }
        if (srnqrsecondarytemplate.mListBody != null)
        {
            mListBody = new ArrayList(srnqrsecondarytemplate.mListBody);
        }
        mSmallIcon = srnqrsecondarytemplate.mSmallIcon;
        mSmallIconTitle = srnqrsecondarytemplate.mSmallIconTitle;
        mSmallIcon2 = srnqrsecondarytemplate.mSmallIcon2;
        mSmallIconTitle2 = srnqrsecondarytemplate.mSmallIconTitle2;
    }

    public void addListItem(String s, String s1)
    {
        if (mListTitle == null || mListBody == null)
        {
            mListTitle = new ArrayList();
            mListBody = new ArrayList();
        }
        mListTitle.add(new TitleItem(s, null));
        mListBody.add(new BodyItem(s1, null));
    }

    protected Object cloneSelf()
    {
        return new SrnQRSecondaryTemplate(this);
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
}
