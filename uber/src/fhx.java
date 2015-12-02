// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.contacts.SelectContactsFragment;
import com.ubercab.client.core.model.Invite;
import com.ubercab.client.core.ui.ChipEditText;
import com.ubercab.client.feature.share.ProgressView;
import com.ubercab.ui.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class fhx extends SelectContactsFragment
{

    chp f;
    dkc g;
    cgh h;
    private ProgressView i;
    private boolean j;

    public fhx()
    {
    }

    static ChipEditText a(fhx fhx1)
    {
        return fhx1.mInviteesEditText;
    }

    public static fhx a(String s, String s1, List list)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.ubercab.SUBJECT", s);
        bundle.putString("com.ubercab.BODY", s1);
        if (list != null)
        {
            bundle.putStringArrayList("com.ubercab.EXCLUDE_IDS", new ArrayList(list));
        }
        s = new fhx();
        s.setArguments(bundle);
        return s;
    }

    private void a(fhy fhy1)
    {
        fhy1.a(this);
    }

    static dsi b(fhx fhx1)
    {
        return fhx1.e;
    }

    private fhy b(dfp dfp)
    {
        return fhm.a().a(new djb(this)).a(dfp).a();
    }

    static void c(fhx fhx1)
    {
        fhx1.i();
    }

    private void h()
    {
        if (i.getParent() == null)
        {
            mLinearLayoutContainer.addView(i, new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F));
            mListViewContacts.setVisibility(8);
        }
    }

    private void i()
    {
        h();
        i.e();
    }

    private void j()
    {
        i.f();
    }

    private void k()
    {
        i.postDelayed(new Runnable() {

            final fhx a;

            public final void run()
            {
                a.getActivity().finish();
            }

            
            {
                a = fhx.this;
                super();
            }
        }, 1000L);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    protected final dad a(Context context)
    {
        return new daf(context, h);
    }

    public final void a(int i1, int j1)
    {
        if (i1 == 1 && j1 == -1)
        {
            getActivity().finish();
        }
    }

    public final volatile void a(czj czj)
    {
        a((fhy)czj);
    }

    protected final void b()
    {
        j = true;
        c.setEnabled(false);
        mInviteesEditText.setEnabled(false);
        mInviteesEditText.a(new dsd() {

            final fhx a;

            public final void a()
            {
                Object obj = new ArrayList();
                Iterator iterator = fhx.a(a).b().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj1 = (com.ubercab.client.core.ui.ChipEditText.Chip)iterator.next();
                    obj1 = fhx.b(a).a(((com.ubercab.client.core.ui.ChipEditText.Chip) (obj1)));
                    if (obj1 != null)
                    {
                        ((List) (obj)).add(new Invite(((Contact) (obj1)).a(), null, null, ((Contact) (obj1)).d()));
                    }
                } while (true);
                fhx.c(a);
                a.g.a(((List) (obj)));
                obj = AnalyticsEvent.create("impression").setName(n.fs).setValue(Integer.valueOf(((List) (obj)).size()));
                a.f.a(((AnalyticsEvent) (obj)));
            }

            
            {
                a = fhx.this;
                super();
            }
        });
    }

    public final cic f()
    {
        return l.gH;
    }

    public final boolean g()
    {
        if (mInviteesEditText.b().size() == 0)
        {
            return false;
        } else
        {
            dtj.a(d(), 1, null, getString(0x7f0703ff), getString(0x7f070674), getString(0x7f0702cd));
            return true;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i = (ProgressView)layoutinflater.inflate(0x7f030158, null);
        i.a();
        i.c();
        i.b();
        i.d();
        i.setWeightSum(1.0F);
        if (bundle != null)
        {
            j = bundle.getBoolean("DONE", false);
        }
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        dtx.a(d.getCursor());
        super.onDestroy();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        if (j)
        {
            c.setEnabled(false);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (j)
        {
            j();
            k();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("DONE", j);
        super.onSaveInstanceState(bundle);
    }

    public void onSentError(dma dma1)
    {
        i.g();
        mInviteesEditText.setVisibility(8);
        mTextViewHeader.setVisibility(0);
        mTextViewHeader.setText(dma1.l());
        k();
    }

    public void onSentSuccess(dln dln)
    {
        j();
        k();
    }

    public void onStop()
    {
        super.onStop();
        i.h();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        if (j)
        {
            h();
        }
        super.onViewCreated(view, bundle);
    }
}
