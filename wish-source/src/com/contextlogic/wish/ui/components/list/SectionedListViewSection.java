// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import java.io.Serializable;

public class SectionedListViewSection
    implements Serializable
{

    private static final long serialVersionUID = 0xe3c8c87fed0f3b48L;
    private int count;
    private String title;

    public SectionedListViewSection(String s, int i)
    {
        title = s;
        count = i;
    }

    public void addCount(int i)
    {
        count = count + i;
    }

    public int getCount()
    {
        return count;
    }

    public String getTitle()
    {
        return title;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
