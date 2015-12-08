// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.ui:
//            h, d, PageIndicator, e, 
//            a, b, f, c

public class InfoCardGalleryDialogFragment extends DialogFragment
    implements h
{

    private InfoCardCollection Y;
    private c Z;
    private int aa;
    private Resources ab;
    private ViewPager ac;
    private d ad;
    private SparseArray ae;

    public InfoCardGalleryDialogFragment()
    {
    }

    private boolean E()
    {
        return Z != null;
    }

    public static InfoCardGalleryDialogFragment a(InfoCardCollection infocardcollection, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("infoCardCollection", infocardcollection);
        bundle.putInt("selectedCardIndex", i);
        infocardcollection = new InfoCardGalleryDialogFragment();
        infocardcollection.g(bundle);
        return infocardcollection;
    }

    static c a(InfoCardGalleryDialogFragment infocardgallerydialogfragment)
    {
        return infocardgallerydialogfragment.Z;
    }

    static ViewPager b(InfoCardGalleryDialogFragment infocardgallerydialogfragment)
    {
        return infocardgallerydialogfragment.ac;
    }

    private void b(boolean flag)
    {
        int i = ab.getDimensionPixelSize(g.N);
        ad.a(flag);
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)ac.getLayoutParams();
        if (!flag)
        {
            i *= 2;
        }
        layoutparams.height = i;
        ac.setLayoutParams(layoutparams);
        q().invalidate();
        q().requestLayout();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        if (!E())
        {
            return null;
        }
        int i = ab.getDimensionPixelSize(g.O);
        layoutinflater = layoutinflater.inflate(l.ae, viewgroup, false);
        viewgroup = (PageIndicator)layoutinflater.findViewById(j.dd);
        viewgroup.setPageCount(Y.getInfoCards().size());
        viewgroup.setCurrentPage(0);
        ac = (ViewPager)layoutinflater.findViewById(j.gg);
        ac.setPageMargin(-i);
        ac.setOnPageChangeListener(new e(this, viewgroup));
        ad = new d(this, Y.getInfoCards());
        ac.setAdapter(ad);
        ac.setCurrentItem(aa, false);
        layoutinflater.findViewById(j.aw).setOnClickListener(new a(this));
        layoutinflater.findViewById(j.au).setOnClickListener(new b(this));
        if (ae != null)
        {
            for (int k = 0; k < ae.size(); k++)
            {
                ad.a(ae.keyAt(k), (Bitmap)ae.valueAt(k));
            }

            ae = null;
        }
        return layoutinflater;
    }

    public final void a(int i, Bitmap bitmap)
    {
        if (q() != null)
        {
            ad.a(i, bitmap);
            return;
        }
        if (ae == null)
        {
            ae = new SparseArray();
        }
        ae.put(i, bitmap);
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        ab = activity.getResources();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(2, 0x1030010);
        Y = (InfoCardCollection)h().getParcelable("infoCardCollection");
        aa = h().getInt("selectedCardIndex");
    }

    public final void a(c c1)
    {
        Z = c1;
    }

    public final void a(f f1)
    {
        if (Z != null)
        {
            Z.b(f1.b());
        }
    }

    public final void d()
    {
        super.d();
        if (E())
        {
            boolean flag;
            if (ab.getConfiguration().orientation == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b(flag);
        }
    }

    public final void e()
    {
        super.e();
        if (Z != null)
        {
            Z.a();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (q() != null)
        {
            boolean flag;
            if (configuration.orientation == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b(flag);
        }
    }

    public final void r()
    {
        super.r();
        if (!E())
        {
            a();
        }
    }
}
