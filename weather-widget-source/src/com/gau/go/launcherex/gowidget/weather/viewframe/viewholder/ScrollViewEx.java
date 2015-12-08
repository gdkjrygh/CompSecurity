// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.viewframe.viewholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.viewframe.viewholder:
//            a

public class ScrollViewEx extends ScrollView
{

    private a a;
    private boolean b;
    private ArrayList c;

    public ScrollViewEx(Context context)
    {
        super(context);
        b = false;
        c = new ArrayList();
        a();
    }

    public ScrollViewEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = new ArrayList();
        a();
    }

    public ScrollViewEx(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        c = new ArrayList();
        a();
    }

    private void a()
    {
    }

    private boolean a(MotionEvent motionevent)
    {
        Rect rect = new Rect();
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            ((View)iterator.next()).getGlobalVisibleRect(rect);
            if (rect.contains((int)motionevent.getRawX(), (int)motionevent.getRawY()))
            {
                return true;
            }
        }

        return false;
    }

    public void a(View view)
    {
        if (view != null)
        {
            c.add(view);
        }
    }

    public void b(View view)
    {
        if (view != null)
        {
            c.remove(view);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            a.a(this, canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        while (a(motionevent) || !super.onInterceptTouchEvent(motionevent) || b) 
        {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        while (a(motionevent) || !super.onTouchEvent(motionevent) || b) 
        {
            return false;
        }
        return true;
    }
}
