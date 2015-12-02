// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.template;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import cev;
import com.ubercab.client.feature.hiring.model.CodingQuestion;

public abstract class BaseQuestionTemplate extends LinearLayout
{

    public BaseQuestionTemplate(Context context)
    {
        super(context);
    }

    public BaseQuestionTemplate(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BaseQuestionTemplate(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public abstract void a(cev cev, CodingQuestion codingquestion);
}
