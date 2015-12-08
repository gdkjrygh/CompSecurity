// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.map;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.go.weatherex.framework.fragment.a;
import uk.co.senab.photoview.PhotoView;

// Referenced classes of package com.go.weatherex.map:
//            d

public class b extends a
{

    private com.go.weatherex.common.view.a a;
    private PhotoView b;
    private uk.co.senab.photoview.b c;
    private final Animation d = new AlphaAnimation(0.0F, 1.0F);
    private d e;

    public b()
    {
    }

    static com.go.weatherex.common.view.a a(b b1)
    {
        return b1.a;
    }

    public static b a(String s)
    {
        b b1 = new b();
        Bundle bundle = new Bundle();
        bundle.putString("radar_map_url", s);
        b1.setArguments(bundle);
        return b1;
    }

    private void a(Bitmap bitmap)
    {
        a.a(8);
        b.setVisibility(0);
        b.setImageBitmap(bitmap);
        b.startAnimation(d);
        c.f();
    }

    static void a(b b1, Bitmap bitmap)
    {
        b1.a(bitmap);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d.setDuration(300L);
        c = new uk.co.senab.photoview.b(b);
        c.a(true);
        c.a(android.widget.ImageView.ScaleType.FIT_CENTER);
        bundle = getArguments().getString("radar_map_url");
        a.a(0);
        b.setVisibility(8);
        e = new d(this, null);
        e.execute(new String[] {
            bundle
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030083, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (e != null)
        {
            e.cancel(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = new com.go.weatherex.common.view.a(c(0x7f0902e8));
        b = (PhotoView)c(0x7f0902e7);
    }
}
