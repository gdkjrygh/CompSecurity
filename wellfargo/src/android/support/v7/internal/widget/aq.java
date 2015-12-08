// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.d;
import android.support.v7.widget.z;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ar, an, ao

class aq
    implements android.view.View.OnClickListener
{

    final an a;

    private aq(an an1)
    {
        a = an1;
        super();
    }

    aq(an an1, ao ao)
    {
        this(an1);
    }

    public void onClick(View view)
    {
        ((ar)view).b().d();
        int j = an.a(a).getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = an.a(a).getChildAt(i);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            i++;
        }
    }
}
