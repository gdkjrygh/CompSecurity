// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class hi
{

    public hi()
    {
    }

    private static void a(Rect rect)
    {
        rect.set(0, 0, 0, 0);
    }

    public void a(Canvas canvas, RecyclerView recyclerview)
    {
    }

    public void a(Rect rect, View view)
    {
        ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).e();
        a(rect);
    }
}
