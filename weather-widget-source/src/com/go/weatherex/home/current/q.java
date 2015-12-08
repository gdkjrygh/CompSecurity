// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.text.TextPaint;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.home.current:
//            p

class q
    implements Runnable
{

    final String a;
    final p b;

    q(p p1, String s)
    {
        b = p1;
        a = s;
        super();
    }

    public void run()
    {
        int j = p.a(b).getMeasuredWidth();
        if (j > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 40;
        do
        {
            p.a(b).setTextSize(1, i);
            if (p.a(b).getPaint().measureText(a) < (float)j || i <= 10)
            {
                continue;
            }
            i--;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
