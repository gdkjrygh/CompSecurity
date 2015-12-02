// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public interface d
    extends ListAdapter
{

    public abstract int a();

    public abstract int a(int i);

    public abstract View a(int i, View view, ViewGroup viewgroup);
}
