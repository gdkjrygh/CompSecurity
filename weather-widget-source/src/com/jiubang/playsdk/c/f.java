// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ListView;

// Referenced classes of package com.jiubang.playsdk.c:
//            b

public class f extends ListView
{

    private b a;

    public f(Context context)
    {
        super(context);
    }

    public void a(b b1)
    {
        a = b1;
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && a.b())
        {
            a.a();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            if (motionevent.getX() > (float)getLeft() && motionevent.getX() < (float)getRight() && motionevent.getY() > (float)getTop() && motionevent.getY() < (float)getBottom())
            {
                return super.onTouchEvent(motionevent);
            }
            if (motionevent.getAction() == 1 && a != null && a.b())
            {
                a.a();
            }
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }
}
