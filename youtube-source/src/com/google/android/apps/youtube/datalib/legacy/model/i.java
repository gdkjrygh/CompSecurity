// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public class i
{

    private int a;
    private Uri b;
    private String c;
    private List d;

    public i(int j, Uri uri, String s)
    {
        a = j;
        b = uri;
        c = s;
        d = new ArrayList();
    }

    public final InfoCard.InfoCardAction a()
    {
        return new InfoCard.InfoCardAction(a, b, c, d);
    }

    public final i a(Uri uri)
    {
        d.add(uri);
        return this;
    }
}
