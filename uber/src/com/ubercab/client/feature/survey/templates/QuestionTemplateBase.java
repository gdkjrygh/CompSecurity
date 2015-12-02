// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.templates;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ubercab.client.feature.survey.model.Answer;
import com.ubercab.client.feature.survey.model.Question;
import fpr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class QuestionTemplateBase extends LinearLayout
{

    private final List a;

    public QuestionTemplateBase(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public QuestionTemplateBase(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
    }

    public void a(Bundle bundle)
    {
    }

    public abstract void a(Question question);

    protected final void a(Question question, Answer answer)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fpr)iterator.next()).a(question, answer)) { }
    }

    public final void a(fpr fpr1)
    {
        a.add(fpr1);
    }

    public final void b(fpr fpr1)
    {
        a.remove(fpr1);
    }
}
