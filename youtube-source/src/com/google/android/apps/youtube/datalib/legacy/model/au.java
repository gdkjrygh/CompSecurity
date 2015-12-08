// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.a.a.a.c;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            av, SurveyQuestion

public class au
{

    private c a;
    private List b;
    private List c;

    au(c c1)
    {
        try
        {
            a = (c)com.google.protobuf.nano.c.a(new c(), com.google.protobuf.nano.c.a(c1));
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            a = new c();
        }
        b = new ArrayList(Arrays.asList(c1.c));
        c = new ArrayList(Arrays.asList(c1.f));
    }

    public au(SurveyQuestion.Type type, String s)
    {
        a = new c();
        a.d = ((SurveyQuestion.Type)com.google.android.apps.youtube.common.fromguava.c.a(type)).getName();
        a.b = com.google.android.apps.youtube.common.fromguava.c.a(s);
        a.h = 15;
        a.e = 2;
        b = new ArrayList();
        c = new ArrayList();
    }

    public final SurveyQuestion a()
    {
        boolean flag = false;
        a.f = (String[])c.toArray(new String[0]);
        if (a.j.length <= 0)
        {
            av av1 = av.a(a.e, b);
            a.c = new String[b.size()];
            List list = b;
            ArrayList arraylist;
            int i;
            int j;
            boolean flag1;
            if (list.size() == av1.a().size())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.b(flag1);
            arraylist = new ArrayList();
            i = 0;
            do
            {
                j = ((flag) ? 1 : 0);
                if (i >= list.size())
                {
                    break;
                }
                arraylist.add(list.get(((Integer)av1.a().get(i)).intValue()));
                i++;
            } while (true);
            for (; j < arraylist.size(); j++)
            {
                a.c[j] = (String)arraylist.get(j);
            }

            a.j = com.google.android.apps.youtube.common.e.c.b(av1.a());
        }
        SurveyQuestion surveyquestion;
        try
        {
            surveyquestion = new SurveyQuestion((c)com.google.protobuf.nano.c.a(new c(), com.google.protobuf.nano.c.a(a)), null);
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            return null;
        }
        return surveyquestion;
    }

    public final au a(int i)
    {
        a.i = i;
        return this;
    }

    public final au a(Uri uri)
    {
        c.add(uri.toString());
        return this;
    }

    public final au a(SurveyQuestion.RandomizeOptions randomizeoptions)
    {
        a.e = randomizeoptions.getValue();
        return this;
    }

    public final au a(String s)
    {
        if (a.j.length < 0)
        {
            a.j = new int[0];
        }
        b.add(s);
        return this;
    }

    public final au b(int i)
    {
        a.h = i;
        return this;
    }

    public final au b(String s)
    {
        c c1 = a;
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        c1.g = s1;
        return this;
    }
}
