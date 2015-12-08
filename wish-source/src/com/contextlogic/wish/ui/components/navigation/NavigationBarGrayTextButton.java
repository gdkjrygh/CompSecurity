// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class NavigationBarGrayTextButton extends FrameLayout
{

    private List languagesNeedingMoreSpace;
    private TextView textView;

    public NavigationBarGrayTextButton(Context context)
    {
        this(context, null);
    }

    public NavigationBarGrayTextButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationBarGrayTextButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        languagesNeedingMoreSpace = Arrays.asList(new String[] {
            "ja", "fr"
        });
        init();
    }

    private void init()
    {
        boolean flag1 = true;
        Object obj = (LayoutInflater)getContext().getSystemService("layout_inflater");
        Locale locale = Locale.getDefault();
        boolean flag;
        if (locale != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (locale.getLanguage() == null)
        {
            flag1 = false;
        }
        if (flag & flag1 && languagesNeedingMoreSpace.contains(locale.getLanguage()))
        {
            obj = ((LayoutInflater) (obj)).inflate(0x7f0300d0, this);
        } else
        {
            obj = ((LayoutInflater) (obj)).inflate(0x7f0300cf, this);
        }
        textView = (TextView)((View) (obj)).findViewById(0x7f0d042d);
    }

    public void setText(String s)
    {
        textView.setText(s);
    }
}
