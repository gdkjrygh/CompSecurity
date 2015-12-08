// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import android.graphics.Color;
import com.samsung.android.sdk.richnotification.SrnTemplate;

public abstract class SrnSecondaryTemplate extends SrnTemplate
{

    private String mBackgroundColor;

    SrnSecondaryTemplate(SrnSecondaryTemplate srnsecondarytemplate)
    {
        super(srnsecondarytemplate);
        mBackgroundColor = srnsecondarytemplate.mBackgroundColor;
    }

    SrnSecondaryTemplate(String s, String s1)
    {
        super(com.samsung.android.sdk.richnotification.SrnTemplate.Priority.SECONDARY, s, s1);
    }

    public void setBackgroundColor(int i)
    {
        mBackgroundColor = String.format("%2X,%2X,%2X", new Object[] {
            Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i))
        });
    }
}
