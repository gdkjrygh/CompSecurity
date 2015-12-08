// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package android.support.v4.app:
//            Fragment, w, x

public class ListFragment extends Fragment
{

    private final Runnable Y = new w(this);
    private final android.widget.AdapterView.OnItemClickListener Z = new x(this);
    ListAdapter a;
    ListView b;
    View c;
    TextView d;
    View e;
    View f;
    CharSequence g;
    boolean h;
    private final Handler i = new Handler();

    public ListFragment()
    {
    }

    public static void a()
    {
    }

    private void a(boolean flag, boolean flag1)
    {
        b();
        if (e == null)
        {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (h == flag)
        {
            return;
        }
        h = flag;
        if (flag)
        {
            if (flag1)
            {
                e.startAnimation(AnimationUtils.loadAnimation(super.C, 0x10a0001));
                f.startAnimation(AnimationUtils.loadAnimation(super.C, 0x10a0000));
            } else
            {
                e.clearAnimation();
                f.clearAnimation();
            }
            e.setVisibility(8);
            f.setVisibility(0);
            return;
        }
        if (flag1)
        {
            e.startAnimation(AnimationUtils.loadAnimation(super.C, 0x10a0000));
            f.startAnimation(AnimationUtils.loadAnimation(super.C, 0x10a0001));
        } else
        {
            e.clearAnimation();
            f.clearAnimation();
        }
        e.setVisibility(0);
        f.setVisibility(8);
    }

    private void b()
    {
        boolean flag1 = false;
        if (b != null)
        {
            return;
        }
        Object obj = super.R;
        if (obj == null)
        {
            throw new IllegalStateException("Content view not yet created");
        }
        if (obj instanceof ListView)
        {
            b = (ListView)obj;
        } else
        {
            d = (TextView)((View) (obj)).findViewById(0xff0001);
            if (d == null)
            {
                c = ((View) (obj)).findViewById(0x1020004);
            } else
            {
                d.setVisibility(8);
            }
            e = ((View) (obj)).findViewById(0xff0002);
            f = ((View) (obj)).findViewById(0xff0003);
            obj = ((View) (obj)).findViewById(0x102000a);
            if (!(obj instanceof ListView))
            {
                if (obj == null)
                {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                } else
                {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
            }
            b = (ListView)obj;
            if (c != null)
            {
                b.setEmptyView(c);
            } else
            if (g != null)
            {
                d.setText(g);
                b.setEmptyView(d);
            }
        }
        h = true;
        b.setOnItemClickListener(Z);
        if (a != null)
        {
            obj = a;
            a = null;
            boolean flag;
            if (a != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = ((ListAdapter) (obj));
            if (b != null)
            {
                b.setAdapter(((ListAdapter) (obj)));
                if (!h && !flag)
                {
                    if (super.R.getWindowToken() != null)
                    {
                        flag1 = true;
                    }
                    a(true, flag1);
                }
            }
        } else
        if (e != null)
        {
            a(false, false);
        }
        i.post(Y);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.C;
        layoutinflater = new FrameLayout(viewgroup);
        bundle = new LinearLayout(viewgroup);
        bundle.setId(0xff0002);
        bundle.setOrientation(1);
        bundle.setVisibility(8);
        bundle.setGravity(17);
        bundle.addView(new ProgressBar(viewgroup, null, 0x101007a), new android.widget.FrameLayout.LayoutParams(-2, -2));
        layoutinflater.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        viewgroup = new FrameLayout(viewgroup);
        viewgroup.setId(0xff0003);
        bundle = new TextView(super.C);
        bundle.setId(0xff0001);
        bundle.setGravity(17);
        viewgroup.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle = new ListView(super.C);
        bundle.setId(0x102000a);
        bundle.setDrawSelectorOnTop(false);
        viewgroup.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        layoutinflater.addView(viewgroup, new android.widget.FrameLayout.LayoutParams(-1, -1));
        layoutinflater.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return layoutinflater;
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        b();
    }

    public final void f()
    {
        i.removeCallbacks(Y);
        b = null;
        h = false;
        f = null;
        e = null;
        c = null;
        d = null;
        super.f();
    }
}
