// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import android.text.Html;
import android.text.TextUtils;
import com.walmart.android.app.item.HtmlListTagHandler;

// Referenced classes of package com.walmart.android.service.item:
//            DescriptionModel, StringPair

public static class mText
{

    private final CharSequence mText;
    private final CharSequence mTitle;

    public CharSequence getText()
    {
        return mText;
    }

    public CharSequence getTitle()
    {
        return mTitle;
    }

    public boolean hasText()
    {
        return !TextUtils.isEmpty(mText);
    }

    public (StringPair stringpair, boolean flag, boolean flag1)
    {
        Object obj;
        if (flag)
        {
            obj = Html.fromHtml(stringpair.name, null, new HtmlListTagHandler());
        } else
        {
            obj = stringpair.name;
        }
        if (flag1)
        {
            stringpair = Html.fromHtml(stringpair.value, null, new HtmlListTagHandler());
        } else
        {
            stringpair = stringpair.value;
        }
        this(((CharSequence) (obj)), ((CharSequence) (stringpair)));
    }

    public <init>(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null)
        {
            charsequence = "";
        }
        mTitle = charsequence;
        if (charsequence1 == null)
        {
            charsequence1 = "";
        }
        mText = charsequence1;
    }
}
