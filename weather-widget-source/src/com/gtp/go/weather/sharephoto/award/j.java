// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.b.a;
import com.gtp.go.weather.sharephoto.b.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            i, c, h

class j
    implements android.view.View.OnClickListener
{

    final i a;
    private View b;
    private TextView c;
    private CheckBox d;
    private ImageView e;
    private h f;

    j(i k)
    {
        a = k;
        super();
        b = com.gtp.go.weather.sharephoto.award.c.b(k.a).getLayoutInflater().inflate(0x7f0300f9, null);
        c = (TextView)b.findViewById(0x7f0904e4);
        d = (CheckBox)b.findViewById(0x7f090264);
        e = (ImageView)b.findViewById(0x7f0904e5);
        b.setOnClickListener(this);
    }

    static View a(j j1)
    {
        return j1.b;
    }

    private void a()
    {
        b b1 = f.b;
        if (b1.c() != 1) goto _L2; else goto _L1
_L1:
        a a1;
        a1 = b1.d();
        c.setText(a1.d());
        com.gtp.a.a.b.c.a("AwardListDialog", (new StringBuilder()).append("mApkName: ").append(a1.d()).append(", picPath").append(a1.b()).toString());
        if (!TextUtils.isEmpty(a1.b())) goto _L4; else goto _L3
_L3:
        com.gtp.go.weather.sharephoto.award.c.a(a.a, b1);
_L2:
        d.setChecked(f.a);
        return;
_L4:
        android.graphics.Bitmap bitmap = com.gtp.go.weather.sharephoto.award.c.a(a.a, a1.b());
        if (bitmap != null)
        {
            e.setImageBitmap(bitmap);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void a(int k)
    {
        f = (h)com.gtp.go.weather.sharephoto.award.c.a(a.a).get(k);
        a();
    }

    public void onClick(View view)
    {
        com.gtp.go.weather.sharephoto.award.c.c(a.a).setBackgroundResource(0x7f020641);
        com.gtp.go.weather.sharephoto.award.c.c(a.a).setEnabled(true);
        view = com.gtp.go.weather.sharephoto.award.c.a(a.a).iterator();
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            h h1 = (h)view.next();
            if (!h1.a)
            {
                continue;
            }
            h1.a = false;
            break;
        } while (true);
        f.a = true;
        com.gtp.go.weather.sharephoto.award.c.a(a.a, f);
        com.gtp.go.weather.sharephoto.award.c.d(a.a).notifyDataSetChanged();
    }
}
