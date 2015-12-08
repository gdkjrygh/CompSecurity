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
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            f, l, a, m, 
//            k

public class i extends f
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private TextView b;
    private TextView c;
    private TextView d;
    private ListView e;
    private final ArrayList f = new ArrayList();
    private l g;
    private int h;
    private int i;
    private int j;
    private m k;
    private boolean l;

    public i(Activity activity)
    {
        super(activity);
        setCanceledOnTouchOutside(true);
        setContentView(0x7f03005e);
        b = (TextView)findViewById(0x7f090061);
        c = (TextView)findViewById(0x7f090269);
        c.setOnClickListener(this);
        d = (TextView)findViewById(0x7f090268);
        d.setOnClickListener(this);
        e = (ListView)findViewById(0x7f090271);
        g = new l(this, null);
        e.setAdapter(g);
        e.setOnItemClickListener(this);
        activity = a.getResources().getDisplayMetrics();
        h = (int)((float)Math.min(((DisplayMetrics) (activity)).widthPixels, ((DisplayMetrics) (activity)).heightPixels) - ((DisplayMetrics) (activity)).density * 40F);
        i = a.getResources().getDimensionPixelSize(0x7f0c01f5);
        setOnDismissListener(this);
        b(0);
        a(findViewById(0x7f0900ae), 2, true);
        a(b, 4, true);
    }

    static ArrayList a(i i1)
    {
        return i1.f;
    }

    private String c(int i1)
    {
        return a.getString(i1);
    }

    public void a()
    {
        l = false;
        a(17, 0, 0, h, -2);
    }

    public void a(int i1)
    {
        a(((CharSequence) (c(i1))));
    }

    public void a(m m1)
    {
        k = m1;
    }

    public void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public void a(ArrayList arraylist)
    {
        f.clear();
        if (arraylist != null)
        {
            f.addAll(arraylist);
        }
        g.notifyDataSetChanged();
    }

    public void b(int i1)
    {
        j = i1;
        android.view.ViewGroup.LayoutParams layoutparams = e.getLayoutParams();
        if (j > 0)
        {
            i1 = i * j;
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
        e.setLayoutParams(layoutparams);
        e.requestLayout();
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            l = true;
            dismiss();
        } else
        if (view.equals(d))
        {
            l = false;
            dismiss();
            return;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (k != null)
        {
            dialoginterface = new ArrayList();
            Iterator iterator = f.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1.b)
                {
                    dialoginterface.add(a1);
                }
            } while (true);
            k.a(this, l, dialoginterface);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        ((k)view.getTag()).a();
    }
}
