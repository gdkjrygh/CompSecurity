// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class dac
{

    private LayoutInflater a;

    public dac(Context context)
    {
        a = LayoutInflater.from(context);
    }

    public final View a(ViewGroup viewgroup)
    {
        return a.inflate(0x7f030095, viewgroup, false);
    }
}
