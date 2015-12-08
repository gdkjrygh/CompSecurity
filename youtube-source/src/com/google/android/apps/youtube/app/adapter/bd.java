// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.b;
import com.google.android.apps.youtube.core.a.e;
import com.google.android.apps.youtube.core.a.g;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            be, bf

public final class bd extends b
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.view.View.OnTouchListener
{

    private final LayoutInflater c;
    private final int d;
    private be e;
    private bf f;
    private final int g;
    private final int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public bd(e e1, LayoutInflater layoutinflater, g g1, int i1, int j1)
    {
        this(e1, layoutinflater, g1, i1, j1, 0);
    }

    private bd(e e1, LayoutInflater layoutinflater, g g1, int i1, int j1, int k1)
    {
        super(e1, g1, i1);
        c = (LayoutInflater)com.google.android.apps.youtube.common.fromguava.c.a(layoutinflater);
        h = 0;
        d = j1;
        g = i1;
    }

    public final View a(int i1, View view, ViewGroup viewgroup)
    {
        View aview[];
        int k1;
        int l1;
        if (view != null)
        {
            view = (LinearLayout)view;
        } else
        {
            view = (LinearLayout)c.inflate(l.bz, viewgroup, false);
        }
        view.setWeightSum(a());
        aview = (View[])view.getTag(j.gc);
        viewgroup = aview;
        if (aview == null)
        {
            viewgroup = new View[a()];
            view.setTag(j.gc, viewgroup);
        }
        view.removeAllViews();
        k1 = c(i1);
        l1 = d(i1);
        i1 = 0;
        while (i1 < l1 - k1) 
        {
            View view1 = b.a(k1 + i1, viewgroup[i1], view);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutparams.weight = 1.0F;
            int j1;
            if (i1 == 0)
            {
                j1 = i;
            } else
            {
                j1 = d;
            }
            layoutparams.leftMargin = j1;
            layoutparams.topMargin = j;
            if (i1 == g - 1)
            {
                j1 = k;
            } else
            {
                j1 = 0;
            }
            layoutparams.rightMargin = j1;
            layoutparams.bottomMargin = l;
            view1.setLayoutParams(layoutparams);
            view1.setTag(j.gb, Integer.valueOf(k1 + i1 + h));
            view1.setOnTouchListener(this);
            view1.setOnClickListener(this);
            if (f != null)
            {
                view1.setOnLongClickListener(this);
            }
            view1.setFocusable(true);
            viewgroup[i1] = view1;
            view.addView(view1);
            i1++;
        }
        return view;
    }

    public final Object a(int i1)
    {
        return b.a(i1);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        i = i1;
        j = 0;
        k = k1;
        l = l1;
    }

    public final void onClick(View view)
    {
label0:
        {
            Object obj1 = view.getTag(j.gd);
            Object obj = obj1;
            if (obj1 == null)
            {
                if (view.isInTouchMode() && !PackageUtil.e(view.getContext()))
                {
                    break label0;
                }
                obj = view.getTag(j.gb);
            }
            view.setTag(j.gd, null);
            if (e != null)
            {
                view = e;
                ((Integer)obj).intValue();
            }
        }
    }

    public final boolean onLongClick(View view)
    {
        Object obj = view.getTag(j.gd);
        if (obj != null)
        {
            view.setTag(j.gd, null);
            if (f != null)
            {
                view = f;
                ((Integer)obj).intValue();
                return true;
            }
        }
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 36
    //                   2 36
    //                   3 55;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        return false;
_L2:
        view.setTag(j.gd, view.getTag(j.gb));
        continue; /* Loop/switch isn't completed */
_L3:
        view.setTag(j.gd, null);
        if (true) goto _L1; else goto _L4
_L4:
    }
}
