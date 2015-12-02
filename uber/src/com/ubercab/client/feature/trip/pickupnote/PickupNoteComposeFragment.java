// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.pickupnote;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.Note;
import czb;
import czj;
import daq;
import dfp;
import djb;
import dtj;
import dtt;
import gct;
import gcu;
import gcx;
import gcy;
import l;
import n;

public class PickupNoteComposeFragment extends czb
{

    public chp c;
    int d;
    int e;
    private RiderLocation f;
    private Note g;
    private gcx h;
    private boolean i;
    private boolean j;
    TextView mCharacterLeftTextView;
    EditText mPickupNoteEditText;
    TextView mPickupNoteLocationTextView;

    public PickupNoteComposeFragment()
    {
    }

    public static PickupNoteComposeFragment a(Note note, RiderLocation riderlocation)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pickupnote", note);
        bundle.putParcelable("pickup_location", riderlocation);
        note = new PickupNoteComposeFragment();
        note.setArguments(bundle);
        return note;
    }

    private void a(RiderLocation riderlocation)
    {
        String s;
        f = riderlocation;
        riderlocation = f.getDisplayAddressWithNickname();
        s = f.getTag();
        if (!LocationSearchResult.isTagHome(s)) goto _L2; else goto _L1
_L1:
        riderlocation = getString(0x7f07026c);
_L4:
        mPickupNoteLocationTextView.setText(dtt.a(riderlocation));
        return;
_L2:
        if (LocationSearchResult.isTagWork(s))
        {
            riderlocation = getString(0x7f070672);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(gcy gcy1)
    {
        gcy1.a(this);
    }

    static boolean a(PickupNoteComposeFragment pickupnotecomposefragment)
    {
        return pickupnotecomposefragment.j;
    }

    private gcy b(dfp dfp)
    {
        return gct.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        if (h != null)
        {
            Note note;
            if (!TextUtils.isEmpty(g.getText()))
            {
                note = g;
            } else
            {
                note = null;
            }
            h.a(note);
        }
    }

    static boolean b(PickupNoteComposeFragment pickupnotecomposefragment)
    {
        pickupnotecomposefragment.j = true;
        return true;
    }

    private void g()
    {
        dtj.a(d(), 6001, null, getString(0x7f07035c), getString(0x7f0701df), getString(0x7f07028e));
        c.a(l.eE);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gcy)czj);
    }

    final void a(gcx gcx1)
    {
        h = gcx1;
    }

    final boolean a()
    {
        c.a(n.cV);
        if (getFragmentManager().findFragmentByTag(dtj.getName()) == null && i)
        {
            g();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(int k, int i1)
    {
        if (k == 6001 && i1 == 0)
        {
            b();
            c.a(n.cX);
            return true;
        } else
        {
            c.a(n.cW);
            return false;
        }
    }

    public final cic f()
    {
        return czb.a;
    }

    void handlePickupNoteTextChanged(CharSequence charsequence, int k, int i1, int j1)
    {
        k = Math.max(d - charsequence.length(), 0);
        mCharacterLeftTextView.setText(String.valueOf(k));
        TextView textview = mCharacterLeftTextView;
        Resources resources = getResources();
        if (k > e)
        {
            k = 0x7f0d0084;
        } else
        {
            k = 0x7f0d006c;
        }
        textview.setTextColor(resources.getColor(k));
        g.setText(charsequence.toString());
        i = true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        getActivity().setTitle(0x7f07035b);
        d = getResources().getInteger(0x7f0b000e);
        e = getResources().getInteger(0x7f0b000f);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = getArguments();
        }
        if (bundle1 != null)
        {
            g = (Note)bundle1.getParcelable("pickupnote");
            f = (RiderLocation)bundle1.getParcelable("pickup_location");
            i = bundle1.getBoolean("pickup_modified");
            j = bundle1.getBoolean("pickupnote_max_length_reached");
        }
        if (g == null)
        {
            g = Note.create().setText("");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f10000f, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030138, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        a(((gcx) (null)));
        super.onDestroy();
    }

    public void onDestroyView()
    {
        mPickupNoteEditText.setOnKeyListener(null);
        ButterKnife.reset(this);
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131625658: 
            b();
            break;
        }
        c.a(AnalyticsEvent.create("tap").setName(n.cY).setValue("button"));
        return true;
    }

    public void onPinLocationEvent(daq daq1)
    {
        a(daq1.a());
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pickupnote", g);
        bundle.putParcelable("pickup_location", f);
        bundle.putBoolean("pickup_modified", i);
        bundle.putBoolean("pickupnote_max_length_reached", j);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = g.getText();
        if (i)
        {
            mPickupNoteEditText.setText(view);
        } else
        {
            mPickupNoteEditText.setText(view);
            i = false;
        }
        mPickupNoteEditText.setSelection(view.length());
        mPickupNoteEditText.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(d) {

                final PickupNoteComposeFragment a;

                public final CharSequence filter(CharSequence charsequence, int k, int i1, Spanned spanned, int j1, int k1)
                {
                    charsequence = super.filter(charsequence, k, i1, spanned, j1, k1);
                    if (charsequence != null && !PickupNoteComposeFragment.a(a))
                    {
                        PickupNoteComposeFragment.b(a);
                        a.c.a(l.eF);
                    }
                    return charsequence;
                }

            
            {
                a = PickupNoteComposeFragment.this;
                super(k);
            }
            }
        });
        a(f);
    }

    public void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
    }
}
