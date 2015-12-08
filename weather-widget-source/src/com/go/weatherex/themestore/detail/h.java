// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.view.View;
import android.widget.AdapterView;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.e.a;
import com.jiubang.playsdk.main.c;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            f

class h
    implements android.widget.AdapterView.OnItemClickListener
{

    final f a;

    h(f f1)
    {
        a = f1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (e)adapterview.getItemAtPosition(i);
        if (adapterview != null && adapterview.f() != null)
        {
            view = com.jiubang.playsdk.e.a.a(a.a, a.f.a(adapterview.f()));
            com.jiubang.playsdk.e.a.a(a.a, a.g.l(), adapterview.f().b(), a.g.m(), adapterview.f().s(), view);
            view = a.f.a(a.a, adapterview.f());
            if (!a.g.g(a.a, view))
            {
                com.jiubang.playsdk.f.a.a(a.a, adapterview.f());
            }
        }
    }
}
