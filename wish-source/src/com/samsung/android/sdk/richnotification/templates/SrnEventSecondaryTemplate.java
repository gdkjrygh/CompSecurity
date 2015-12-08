// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import com.samsung.android.sdk.richnotification.SrnImageAsset;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnSecondaryTemplate

final class SrnEventSecondaryTemplate extends SrnSecondaryTemplate
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


    private static final String TEMPLATE_NAME = "event_template";
    private List mListBody;
    private List mListTitle;
    private SrnImageAsset mSmallIcon;
    private SrnImageAsset mSmallIcon2;
    private String mSmallIconTitle;
    private String mSmallIconTitle2;
    private String mSubHeader;
    private String mTitle;

    public SrnEventSecondaryTemplate()
    {
        super("event_template", "additional_template");
    }

    private SrnEventSecondaryTemplate(SrnEventSecondaryTemplate srneventsecondarytemplate)
    {
        super(srneventsecondarytemplate);
        mTitle = srneventsecondarytemplate.mTitle;
        mSubHeader = srneventsecondarytemplate.mSubHeader;
        if (srneventsecondarytemplate.mListTitle != null)
        {
            mListTitle = new ArrayList(srneventsecondarytemplate.mListTitle);
        }
        if (srneventsecondarytemplate.mListBody != null)
        {
            mListBody = new ArrayList(srneventsecondarytemplate.mListBody);
        }
        mSmallIcon = srneventsecondarytemplate.mSmallIcon;
        mSmallIconTitle = srneventsecondarytemplate.mSmallIconTitle;
        mSmallIcon2 = srneventsecondarytemplate.mSmallIcon2;
        mSmallIconTitle2 = srneventsecondarytemplate.mSmallIconTitle2;
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
        return new SrnEventSecondaryTemplate(this);
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
