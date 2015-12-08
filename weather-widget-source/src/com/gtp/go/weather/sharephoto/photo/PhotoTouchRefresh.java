// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            an

public class PhotoTouchRefresh extends FrameLayout
{

    private an a;

    public PhotoTouchRefresh(Context context)
    {
        super(context);
        a();
    }

    public PhotoTouchRefresh(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public PhotoTouchRefresh(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
    }

    protected void a(an an1)
    {
        a = an1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (a != null)
        {
            return a.a(motionevent);
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a != null)
        {
            return a.b(motionevent);
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
