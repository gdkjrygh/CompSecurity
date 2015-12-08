// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            InfoCard

public class f
{

    private int a;
    private ArrayList b;
    private ArrayList c;
    private InfoCard.InfoCardApp d;

    public f(int i)
    {
        a = i;
        b = new ArrayList();
        c = new ArrayList();
    }

    public final InfoCard a()
    {
        return new InfoCard(a, b, c, d, null);
    }

    public final f a(InfoCard.InfoCardAction infocardaction)
    {
        b.add(infocardaction);
        return this;
    }

    public final f a(InfoCard.InfoCardApp infocardapp)
    {
        d = infocardapp;
        return this;
    }

    public final f a(InfoCard.InfoCardTrackingEvent infocardtrackingevent)
    {
        c.add(infocardtrackingevent);
        return this;
    }
}
