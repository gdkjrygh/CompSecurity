// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.text.Editable;
import org.xml.sax.XMLReader;

public class HtmlListTagHandler
    implements android.text.Html.TagHandler
{

    private static final String LIST_ITEM = "li";
    private static final String ORDERED_LIST = "ol";
    private static final String UNORDERED_LIST = "ul";
    private int mListIndex;
    private String mParent;

    public HtmlListTagHandler()
    {
        mParent = null;
        mListIndex = 1;
    }

    public void handleTag(boolean flag, String s, Editable editable, XMLReader xmlreader)
    {
        if (s.equals("ul") || s.equals("ol"))
        {
            mParent = s;
        }
        if (s.equals("li") && mParent != null && flag)
        {
            editable.append("\n ");
            if (mParent.equals("ul"))
            {
                editable.append("\u2022  ");
            } else
            {
                editable.append(Integer.toString(mListIndex)).append(".  ");
            }
            mListIndex = mListIndex + 1;
        }
    }
}
