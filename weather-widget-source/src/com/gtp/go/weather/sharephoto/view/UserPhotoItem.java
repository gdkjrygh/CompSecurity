// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gtp.go.weather.sharephoto.PhotoDetailActivity;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.b.p;
import com.gtp.go.weather.sharephoto.c.d;
import com.gtp.go.weather.sharephoto.c.l;
import com.gtp.go.weather.sharephoto.d.a;
import com.gtp.go.weather.sharephoto.d.c;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.d.j;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            o, AnimDeleteButton, f

public class UserPhotoItem extends FrameLayout
    implements android.view.View.OnClickListener
{

    private p a;
    private TextView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private AnimDeleteButton g;
    private TextView h;
    private View i;
    private f j;
    private View k;
    private Context l;
    private c m;

    public UserPhotoItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = context;
    }

    static ImageView a(UserPhotoItem userphotoitem)
    {
        return userphotoitem.c;
    }

    private void a(int i1)
    {
        Intent intent = new Intent(getContext(), com/gtp/go/weather/sharephoto/PhotoDetailActivity);
        intent.putExtra("extra_photo_id", a.c());
        boolean flag;
        if (!a.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("extra_photo_isuploaded", flag);
        intent.putExtra("extra_enter_type", i1);
        getContext().startActivity(intent);
    }

    private void d()
    {
        if (a.b())
        {
            String s2 = a.f();
            String s3 = a.g();
            String s1 = com.gtp.go.weather.sharephoto.d.h.a(a.c());
            android.graphics.Bitmap bitmap = com.gtp.go.weather.sharephoto.d.a.a(s1);
            Object obj = bitmap;
            if (bitmap == null)
            {
                obj = l.getResources();
                int i1 = (int)((double)((Resources) (obj)).getDisplayMetrics().widthPixels * 0.80000000000000004D);
                int j1 = (int)((Resources) (obj)).getDimension(0x7f0c01fa);
                android.graphics.Bitmap bitmap1 = com.gtp.go.weather.sharephoto.d.h.a(getContext(), i1, j1 * 2, s2, s3, s1);
                obj = bitmap1;
                if (bitmap1 != null)
                {
                    com.gtp.go.weather.sharephoto.d.a.a(s1, bitmap1);
                    obj = bitmap1;
                }
            }
            c.setImageBitmap(((android.graphics.Bitmap) (obj)));
            return;
        }
        String s = a.j();
        android.graphics.Bitmap bitmap2 = com.gtp.go.weather.sharephoto.d.a.a(s);
        if (bitmap2 == null)
        {
            m.a(j.a, s, null, new o(this, s));
            return;
        } else
        {
            c.setImageBitmap(bitmap2);
            return;
        }
    }

    public UserPhotoItem a()
    {
        boolean flag;
label0:
        {
            if (a != null)
            {
                b.setText(a.d());
                String s = a.e();
                if (!TextUtils.isEmpty(s))
                {
                    d.setText(s);
                } else
                {
                    d.setVisibility(8);
                }
                e.setText(String.valueOf(a.m()));
                f.setText(String.valueOf(a.l()));
                if (a.k())
                {
                    f.setCompoundDrawablesWithIntrinsicBounds(0x7f0203c8, 0, 0, 0);
                } else
                {
                    f.setCompoundDrawablesWithIntrinsicBounds(0x7f0203c7, 0, 0, 0);
                }
                c.setOnClickListener(this);
                if (c.getDrawable() == null)
                {
                    d();
                }
                if (a.b())
                {
                    flag = com.gtp.go.weather.sharephoto.c.l.a(Long.valueOf(a.c()));
                    if (!a.h())
                    {
                        break label0;
                    }
                    h.setVisibility(4);
                }
            }
            return this;
        }
        if (flag)
        {
            h.setVisibility(0);
            h.setText(0x7f080460);
            h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            h.setOnClickListener(null);
            return this;
        } else
        {
            h.setVisibility(0);
            h.setText(0x7f08045f);
            h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f0203e7, 0);
            h.setOnClickListener(this);
            return this;
        }
    }

    public UserPhotoItem a(View view)
    {
        k = view;
        return this;
    }

    public UserPhotoItem a(p p1)
    {
        if (p1 != null)
        {
            a = p1;
        }
        return this;
    }

    public UserPhotoItem a(c c1)
    {
        m = c1;
        return this;
    }

    public void a(f f1)
    {
        j = f1;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            i.setVisibility(0);
            return;
        } else
        {
            i.setVisibility(8);
            return;
        }
    }

    public long b()
    {
        if (a != null)
        {
            return a.c();
        } else
        {
            return -1L;
        }
    }

    public String c()
    {
        if (a != null)
        {
            return a.i();
        } else
        {
            return "";
        }
    }

    public void onClick(View view)
    {
        boolean flag = true;
        if (j == null) goto _L2; else goto _L1
_L1:
        if (!view.equals(g)) goto _L4; else goto _L3
_L3:
        if (!g.c()) goto _L6; else goto _L5
_L5:
        j.a(b(), k, this);
_L2:
        return;
_L6:
        view = new com.gau.go.launcherex.gowidget.statistics.a.a(117, "delete_click");
        view.a(String.valueOf(a.c()));
        view.e("2");
        q.a(getContext()).a(view);
        g.a();
        return;
_L4:
        if (g.c())
        {
            g.b();
        }
        if (view.equals(f))
        {
            int i1;
            if (a.k())
            {
                flag = false;
            }
            i1 = a.l();
            view = new g();
            view.a(a.c());
            view.a(flag);
            if (flag)
            {
                i1++;
            } else
            {
                i1--;
            }
            view.a(i1);
            com.gtp.go.weather.sharephoto.c.d.a(getContext()).a(view);
            if (flag)
            {
                view = "exellent_add";
            } else
            {
                view = "exellent_minus";
            }
            view = new com.gau.go.launcherex.gowidget.statistics.a.a(117, view);
            view.a(String.valueOf(a.c()));
            view.e("2");
            q.a(l).a(view);
            j.a(b(), flag, this);
            return;
        }
        if (view.equals(c))
        {
            a(1);
            view = new com.gau.go.launcherex.gowidget.statistics.a.a(117, "click_fs");
            view.a(String.valueOf(a.c()));
            view.e("2");
            q.a(getContext()).a(view);
            return;
        }
        if (view.equals(e))
        {
            a(2);
            view = new com.gau.go.launcherex.gowidget.statistics.a.a(117, "fs_set_background");
            view.a(String.valueOf(a.c()));
            q.a(l).a(view);
            return;
        }
        if (view.equals(h))
        {
            if (com.gau.go.launcherex.gowidget.c.g.a(getContext()))
            {
                h.setOnClickListener(null);
                h.setText(0x7f080460);
                h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                Toast.makeText(getContext(), 0x7f0804ac, 0).show();
                com.gtp.go.weather.sharephoto.c.l.a(getContext(), a.a());
                return;
            } else
            {
                Toast.makeText(getContext(), 0x7f0801d0, 0).show();
                return;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setOnClickListener(this);
        b = (TextView)findViewById(0x7f090231);
        c = (ImageView)findViewById(0x7f090064);
        d = (TextView)findViewById(0x7f09028d);
        e = (TextView)findViewById(0x7f09022b);
        e.setOnClickListener(this);
        f = (TextView)findViewById(0x7f090067);
        f.setOnClickListener(this);
        g = (AnimDeleteButton)findViewById(0x7f09022f);
        g.setOnClickListener(this);
        h = (TextView)findViewById(0x7f0904a8);
        i = findViewById(0x7f0904a7);
    }
}
