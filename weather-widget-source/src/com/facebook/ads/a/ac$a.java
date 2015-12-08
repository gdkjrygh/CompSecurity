// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.ads.a:
//            ac, aa

class <init>
    implements android.view.OnClickListener, android.view.OnTouchListener
{

    final ac a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    private int h;
    private int i;
    private boolean j;

    public Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clickX", Integer.valueOf(b));
        hashmap.put("clickY", Integer.valueOf(c));
        hashmap.put("width", Integer.valueOf(d));
        hashmap.put("height", Integer.valueOf(e));
        hashmap.put("adPositionX", Float.valueOf(f));
        hashmap.put("adPositionY", Float.valueOf(g));
        hashmap.put("visibleWidth", Integer.valueOf(i));
        hashmap.put("visibleHeight", Integer.valueOf(h));
        return hashmap;
    }

    public void onClick(View view)
    {
        if (ac.access$000(a) != null)
        {
            ac.access$000(a).onAdClicked(a);
        }
        if (!j)
        {
            Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
        }
        ac.access$200(a).a(ac.access$800(a), a(), false);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = false;
        if (motionevent.getAction() == 0 && ac.access$900(a) != null)
        {
            d = ac.access$900(a).getWidth();
            e = ac.access$900(a).getHeight();
            int ai[] = new int[2];
            ac.access$900(a).getLocationInWindow(ai);
            f = ai[0];
            g = ai[1];
            Rect rect = new Rect();
            ac.access$900(a).getGlobalVisibleRect(rect);
            i = rect.width();
            h = rect.height();
            int ai1[] = new int[2];
            view.getLocationInWindow(ai1);
            b = ((int)motionevent.getX() + ai1[0]) - ai[0];
            int k = (int)motionevent.getY();
            c = (ai1[1] + k) - ai[1];
            j = true;
        }
        if (ac.access$1000(a) != null)
        {
            flag = ac.access$1000(a).onTouch(view, motionevent);
        }
        return flag;
    }

    private (ac ac1)
    {
        a = ac1;
        super();
    }

    a(ac ac1, a a1)
    {
        this(ac1);
    }
}
