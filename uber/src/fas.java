// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.promo.v2.BasePromoFragment;
import java.util.Map;

public class fas extends BasePromoFragment
{

    private fau h;
    private icl i;

    public fas()
    {
    }

    public static fas a()
    {
        return new fas();
    }

    static void a(fas fas1, String s)
    {
        fas1.d(s);
    }

    private void d(String s)
    {
        h();
        g();
        j().a(l.ey);
        String s1 = s;
        if (s == null)
        {
            s1 = getResources().getString(0x7f070386);
        }
        h.a(s1);
    }

    public final void a(int j, int k)
    {
label0:
        {
            if (j == 1321)
            {
                if (k != -1)
                {
                    break label0;
                }
                j().a(n.cT);
                b(true);
            }
            return;
        }
        j().a(n.cS);
    }

    protected final void a(String s, boolean flag)
    {
        if (e.c())
        {
            i = g.a(s, flag).a(ico.a()).a(new fat(this, (byte)0));
            return;
        } else
        {
            f.a(s, flag);
            return;
        }
    }

    protected final String b()
    {
        return "apply_promo";
    }

    public void onApplyPromoResponse(dlg dlg1)
    {
        a(false);
        if (dlg1.i())
        {
            a(getString(0x7f070436));
            return;
        }
        if (dlg1.a())
        {
            j().a(l.ew);
            dtj.a((RiderActivity)getActivity(), 1321, null, dlg1.b(), dlg1.c(), dlg1.d());
            return;
        }
        if (!TextUtils.isEmpty(dlg1.f()))
        {
            j().a(l.ex);
            a(dlg1.f());
            return;
        }
        dlg1 = ((Ping)dlg1.g()).getApiResponse().getData();
        if (dlg1 != null)
        {
            dlg1 = (String)dlg1.get("description");
        } else
        {
            dlg1 = null;
        }
        d(dlg1);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        h = (fau)activity;
    }

    public void onClickApply()
    {
        super.onClickApply();
        a(true);
    }

    public void onDetach()
    {
        super.onDetach();
        h = null;
        if (i != null)
        {
            i.b();
        }
    }
}
