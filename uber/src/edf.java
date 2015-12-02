// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.client.feature.hiring.model.CodingChallenge;
import com.ubercab.client.feature.hiring.model.CodingQuestion;
import java.util.List;

public final class edf
{

    private final cev a;
    private final ede b;
    private CodingChallenge c;
    private CodingQuestion d;
    private int e;
    private boolean f;
    private List g;

    public edf(cev cev1, ede ede1)
    {
        a = cev1;
        b = ede1;
    }

    private void d()
    {
        c = b.a();
        g = c.getQuestions();
    }

    private void e()
    {
        e = e + 1;
        f();
    }

    private void f()
    {
        if (e >= g.size())
        {
            a.c(new edj());
            return;
        } else
        {
            d = (CodingQuestion)g.get(e);
            edk edk1 = new edk(d);
            a.c(edk1);
            return;
        }
    }

    public final void a()
    {
        d();
        f();
    }

    public final void a(Bundle bundle)
    {
        bundle.putInt("com.ubercab.client.feature.hiring.CURRENT_QUESTION_INDEX", e);
    }

    public final void b()
    {
        if (!f)
        {
            a.a(this);
            f = true;
        }
    }

    public final void b(Bundle bundle)
    {
        e = bundle.getInt("com.ubercab.client.feature.hiring.CURRENT_QUESTION_INDEX", 0);
        d();
        f();
    }

    public final void c()
    {
        if (f)
        {
            a.b(this);
            f = false;
        }
    }

    public final void onCodingChallengeAnswerSubmittedEvent(edi edi)
    {
        e();
    }
}
