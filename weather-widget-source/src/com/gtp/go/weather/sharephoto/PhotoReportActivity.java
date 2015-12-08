// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gtp.go.weather.sharephoto.b.j;
import com.gtp.go.weather.sharephoto.c.d;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            w, v

public class PhotoReportActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private ImageView a;
    private TextView b;
    private TextView c;
    private ListView d;
    private final ArrayList e = new ArrayList();
    private w f;
    private ArrayList g;
    private long h;

    public PhotoReportActivity()
    {
        g = new ArrayList();
        h = -1L;
    }

    static ArrayList a(PhotoReportActivity photoreportactivity)
    {
        return photoreportactivity.e;
    }

    private void a()
    {
        Intent intent = getIntent();
        if (intent == null)
        {
            return;
        } else
        {
            h = intent.getLongExtra("photo_id", -1L);
            return;
        }
    }

    private void a(ArrayList arraylist)
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

    static w b(PhotoReportActivity photoreportactivity)
    {
        return photoreportactivity.f;
    }

    private void b()
    {
        d = (ListView)findViewById(0x7f0904a1);
        f = new w(this, null);
        d.setAdapter(f);
        d.setOnItemClickListener(this);
        a a1 = new a();
        a1.b = true;
        a1.a = getString(0x7f080497);
        a a2 = new a();
        a2.b = false;
        a2.a = getString(0x7f080498);
        a a3 = new a();
        a3.b = false;
        a3.a = getString(0x7f080499);
        a a4 = new a();
        a4.b = false;
        a4.a = getString(0x7f08049a);
        g.add(a1);
        g.add(a2);
        g.add(a3);
        g.add(a4);
        a(g);
    }

    private boolean b(ArrayList arraylist)
    {
        boolean flag1 = false;
        arraylist = arraylist.iterator();
        int i = 0;
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
            int k = i + 1;
            i = k;
            if (k <= 1)
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    private void f()
    {
        if (h == -1L)
        {
            return;
        } else
        {
            j j1 = new j();
            j1.a(h);
            j1.b(h() + 1);
            com.gtp.go.weather.sharephoto.c.d.a(this).a(j1);
            return;
        }
    }

    private void g()
    {
        if (com.gtp.a.a.c.d.b(this))
        {
            Toast.makeText(this, getString(0x7f08049c), 0).show();
            return;
        } else
        {
            Toast.makeText(this, getText(0x7f080375), 0).show();
            return;
        }
    }

    private int h()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.b)
            {
                return e.indexOf(a1);
            }
        }

        return 0;
    }

    public void onClick(View view)
    {
        if (view.equals(a))
        {
            finish();
        } else
        {
            if (view.equals(b))
            {
                f();
                g();
                finish();
                return;
            }
            if (view.equals(c))
            {
                finish();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300e5);
        a();
        a = (ImageView)findViewById(0x7f09049f);
        b = (TextView)findViewById(0x7f0904a3);
        c = (TextView)findViewById(0x7f0904a2);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        b();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((v)view.getTag()).a();
    }
}
