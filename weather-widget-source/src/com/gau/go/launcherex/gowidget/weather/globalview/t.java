// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            f, x, a, w, 
//            v

public class t extends f
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private TextView b;
    private TextView c;
    private ListView d;
    private final ArrayList e = new ArrayList();
    private x f;
    private int g;
    private int h;
    private int i;
    private w j;
    private boolean k;
    private LinearLayout l;

    public t(Activity activity)
    {
        super(activity);
        setCanceledOnTouchOutside(true);
        setContentView(0x7f030063);
        b = (TextView)findViewById(0x7f090061);
        c = (TextView)findViewById(0x7f090268);
        l = (LinearLayout)findViewById(0x7f090276);
        c.setOnClickListener(this);
        d = (ListView)findViewById(0x7f090271);
        f = new x(this, null);
        d.setAdapter(f);
        d.setOnItemClickListener(this);
        activity = a.getResources().getDisplayMetrics();
        g = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        h = a.getResources().getDimensionPixelSize(0x7f0c01f5);
        setOnDismissListener(this);
        b(0);
        a(findViewById(0x7f0900ae), 2, true);
        a(b, 4, true);
    }

    static ArrayList a(t t1)
    {
        return t1.e;
    }

    static boolean a(t t1, boolean flag)
    {
        t1.k = flag;
        return flag;
    }

    static x b(t t1)
    {
        return t1.f;
    }

    private boolean b(ArrayList arraylist)
    {
        boolean flag1 = false;
        arraylist = arraylist.iterator();
        int i1 = 0;
        boolean flag;
        do
        {
            flag = flag1;
            if (!arraylist.hasNext())
            {
                break;
            }
            if (!((a)arraylist.next()).b)
            {
                continue;
            }
            int j1 = i1 + 1;
            i1 = j1;
            if (j1 <= 1)
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    private String c(int i1)
    {
        return a.getString(i1);
    }

    public void a()
    {
        k = false;
        a(17, 0, 0, g, -2);
    }

    public void a(int i1)
    {
        a(((CharSequence) (c(i1))));
    }

    public void a(w w1)
    {
        j = w1;
    }

    public void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public void a(ArrayList arraylist)
    {
        e.clear();
        if (arraylist != null)
        {
            if (b(arraylist))
            {
                throw new IllegalArgumentException("choiceItemDatas have more than one be set to check!");
            }
            e.addAll(arraylist);
        }
        f.notifyDataSetChanged();
    }

    public void b(int i1)
    {
        i = i1;
        android.view.ViewGroup.LayoutParams layoutparams = d.getLayoutParams();
        if (i > 0)
        {
            i1 = h * i;
        } else
        {
            i1 = -2;
        }
        if (layoutparams == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, i1);
        } else
        {
            layoutparams.height = i1;
        }
        d.setLayoutParams(layoutparams);
        d.requestLayout();
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            k = false;
            dismiss();
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (j == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = e.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        dialoginterface = (a)iterator.next();
        if (!((a) (dialoginterface)).b) goto _L6; else goto _L5
_L5:
        j.a(this, k, dialoginterface);
_L2:
        return;
_L4:
        dialoginterface = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        ((v)view.getTag()).a();
    }
}
