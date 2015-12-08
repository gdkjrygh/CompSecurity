// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.k;
import android.util.AttributeSet;

public class a extends android.view.arams
{

    public int a;

    public (int i)
    {
        this(-2, -1, 19);
    }

    private <init>(int i, int j, int l)
    {
        super(-2, -1);
        a = -1;
        a = l;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        context = context.obtainStyledAttributes(attributeset, k.b);
        a = context.getInt(0, -1);
        context.recycle();
    }
}
