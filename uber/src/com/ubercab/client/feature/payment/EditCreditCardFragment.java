// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.Switch;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.ui.MonthEditText;
import com.ubercab.client.core.ui.YearEditText;
import com.ubercab.client.feature.payment.legacy.CreditCardEditText;
import com.ubercab.client.feature.payment.legacy.SecurityCodeEditText;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import com.ubercab.ui.deprecated.view.ZipEditText;
import cwz;
import czb;
import czj;
import dal;
import dar;
import dbf;
import dfp;
import djb;
import dkn;
import dlp;
import dmy;
import dnr;
import dpg;
import dsp;
import dti;
import dui;
import duo;
import eok;
import eol;
import eoy;
import epa;
import epb;
import epc;
import epd;
import epi;
import eql;
import eqm;
import eri;
import esj;
import esv;
import eyy;
import gke;
import gmg;
import goq;
import hkj;
import hkm;
import hkr;
import hku;
import hro;
import ica;
import icl;
import ico;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment:
//            EditPaymentProfileActivity

public class EditCreditCardFragment extends czb
    implements android.view.View.OnClickListener, dsp, dti, esv, goq, hro
{

    private Boolean A;
    public chp c;
    public eqm d;
    public cev e;
    public hkr f;
    public hku g;
    public eoy h;
    public gmg i;
    public hkj j;
    public dpg k;
    public dkn l;
    public eyy m;
    CountryButton mButtonCountry;
    Button mButtonDelete;
    Button mButtonEnrollMe;
    Button mButtonSetAsPayment;
    SecurityCodeEditText mEditTextCreditCardCode;
    CreditCardEditText mEditTextCreditCardNumber;
    MonthEditText mEditTextExpirationMonth;
    YearEditText mEditTextExpirationYear;
    ZipEditText mEditTextZip;
    Spinner mSpinnerUseCase;
    Switch mSwitchUsePoints;
    TextView mTextViewRewardLink;
    TextView mTextViewRewardRestrictions;
    TextView mTextViewRewardsStatus;
    TextView mTextViewUsePoints;
    ViewGroup mViewGroupRewardRestrictions;
    ViewGroup mViewGroupUsePoints;
    public hkm n;
    public dal o;
    private ActionViewHolder p;
    private eql q;
    private String r;
    private icl s;
    private boolean t;
    private boolean u;
    private boolean v;
    private epa w;
    private MenuItem x;
    private String y;
    private icl z;

    public EditCreditCardFragment()
    {
        v = false;
    }

    public static EditCreditCardFragment a(String s1, boolean flag, boolean flag1)
    {
        s1 = d(s1);
        Bundle bundle = s1.getArguments();
        bundle.putBoolean("is_verify_mode", flag);
        bundle.putBoolean("is_selected", flag1);
        s1.setArguments(bundle);
        return s1;
    }

    public static String a(EditCreditCardFragment editcreditcardfragment)
    {
        return editcreditcardfragment.y;
    }

    public static void a(EditCreditCardFragment editcreditcardfragment, PaymentProfile paymentprofile)
    {
        editcreditcardfragment.a(paymentprofile);
    }

    public static void a(EditCreditCardFragment editcreditcardfragment, String s1)
    {
        editcreditcardfragment.e(s1);
    }

    private void a(PaymentProfile paymentprofile)
    {
        String s2 = paymentprofile.getCardType();
        String s1 = paymentprofile.getUseCase();
        String s3 = paymentprofile.getCardNumber();
        Object obj = paymentprofile.getBillingZip();
        f(paymentprofile.getBillingCountryIso2());
        mEditTextExpirationMonth.setText(paymentprofile.getExpirationMonthFormatted());
        mEditTextExpirationYear.setText(paymentprofile.getExpirationYearFormatted());
        mEditTextExpirationYear.a(this);
        mEditTextExpirationMonth.a(this);
        mEditTextZip.setText(((CharSequence) (obj)));
        mEditTextZip.a(this);
        obj = esj.a(getActivity(), s2);
        mEditTextCreditCardNumber.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (obj)), null, null, null);
        s2 = esj.d(s2, s3);
        mEditTextCreditCardNumber.setText(s2);
        mEditTextCreditCardCode.a(paymentprofile.getCardType());
        mEditTextCreditCardCode.a(this);
        mSpinnerUseCase.setSelection(eql.a.indexOf(s1));
        paymentprofile = paymentprofile.getRewardInfo();
        if (paymentprofile == null)
        {
            mViewGroupRewardRestrictions.setVisibility(8);
            return;
        }
        if (!paymentprofile.isEnrolled()) goto _L2; else goto _L1
_L1:
        if (!paymentprofile.isEarnOnly()) goto _L4; else goto _L3
_L3:
        mTextViewRewardsStatus.setText(getString(0x7f070215));
        mViewGroupUsePoints.setVisibility(8);
_L5:
        mTextViewRewardsStatus.setVisibility(0);
        mButtonEnrollMe.setVisibility(8);
        j();
        return;
_L4:
        mTextViewRewardsStatus.setText(getString(0x7f070216));
        mTextViewUsePoints.setText(getString(0x7f070431));
        mViewGroupUsePoints.setVisibility(0);
        if (A == null)
        {
            mSwitchUsePoints.setChecked(paymentprofile.isEnabled());
            A = Boolean.valueOf(paymentprofile.isEnabled());
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (paymentprofile.isEligible())
        {
            if (paymentprofile.isEarnOnly())
            {
                mTextViewRewardsStatus.setText(getString(0x7f0701fd));
            } else
            {
                mTextViewRewardsStatus.setText(getString(0x7f0701fe));
            }
            mTextViewRewardsStatus.setVisibility(0);
            mButtonEnrollMe.setText(getString(0x7f07020e));
            mButtonEnrollMe.setVisibility(0);
            j();
            return;
        } else
        {
            mViewGroupRewardRestrictions.setVisibility(8);
            mTextViewRewardsStatus.setVisibility(8);
            mButtonEnrollMe.setVisibility(8);
            return;
        }
    }

    private void a(epd epd1)
    {
        epd1.a(this);
    }

    private boolean a(List list)
    {
        List list1 = list;
        if (!m.f()) goto _L2; else goto _L1
_L1:
        if (list != null) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        list1 = dui.a(list);
_L2:
        if (list1 != null && list1.size() > 1)
        {
            return true;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static void b(EditCreditCardFragment editcreditcardfragment)
    {
        editcreditcardfragment.g();
    }

    private void c(boolean flag)
    {
        byte byte0 = 8;
        t = flag;
        Object obj = f.c();
        if (obj == null)
        {
            return;
        }
        Object obj2 = ((Client) (obj)).findPaymentProfileByUuid(y);
        if (obj2 == null)
        {
            e.c(new eri());
            return;
        }
        RiderActivity rideractivity = d();
        Object obj1 = rideractivity.b();
        if (flag)
        {
            obj2 = LayoutInflater.from(rideractivity).inflate(0x7f0300ee, null);
            p = new ActionViewHolder(((View) (obj2)), (byte)0);
            p.textViewConfirm.setText(getString(0x7f0703ca));
            p.textViewCancel.setText(getString(0x7f07007b));
            p.actionButtonConfirm.setOnClickListener(this);
            p.actionButtonCancel.setOnClickListener(this);
            ((ActionBar) (obj1)).a(16, 26);
            ((ActionBar) (obj1)).a(((View) (obj2)), new android.support.v7.app.ActionBar.LayoutParams(-1, -1));
            ((ActionBar) (obj1)).b(false);
        } else
        {
            if (p != null)
            {
                p.actionButtonConfirm.setOnClickListener(null);
                p.actionButtonCancel.setOnClickListener(null);
                p = null;
            }
            ((ActionBar) (obj1)).d(false);
            ((ActionBar) (obj1)).c(true);
            ((ActionBar) (obj1)).b(true);
            ((ActionBar) (obj1)).a(true);
            ((ActionBar) (obj1)).a(getString(0x7f070328));
            mEditTextCreditCardCode.setText(null);
            a(((PaymentProfile) (obj2)));
        }
        obj1 = gke.a(mSpinnerUseCase, mEditTextZip, mEditTextExpirationYear, mEditTextExpirationMonth, mButtonCountry).a();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            obj2 = (View)((Iterator) (obj1)).next();
            ((View) (obj2)).setEnabled(flag);
            if (!flag && (obj2 instanceof android.widget.TextView))
            {
                ((android.widget.TextView)obj2).setError(null);
            }
        } while (true);
        obj1 = mEditTextCreditCardCode;
        int i1;
        boolean flag1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((SecurityCodeEditText) (obj1)).setVisibility(i1);
        flag1 = a(((Client) (obj)).getPaymentProfiles());
        obj = mButtonDelete;
        if (flag && flag1)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((Button) (obj)).setVisibility(i1);
        if (i.a(dbf.bZ) && o.k())
        {
            Button button = mButtonSetAsPayment;
            if (flag)
            {
                i1 = byte0;
            } else
            {
                i1 = 0;
            }
            button.setVisibility(i1);
        }
        getActivity().invalidateOptionsMenu();
    }

    public static boolean c(EditCreditCardFragment editcreditcardfragment)
    {
        return editcreditcardfragment.t;
    }

    private static EditCreditCardFragment d(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("payment_profile_uuid", s1);
        s1 = new EditCreditCardFragment();
        s1.setArguments(bundle);
        return s1;
    }

    public static epa d(EditCreditCardFragment editcreditcardfragment)
    {
        return editcreditcardfragment.w;
    }

    private void e(String s1)
    {
        e();
        c(s1);
    }

    private void f(String s1)
    {
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        }
        r = s2;
        mEditTextZip.a(s2);
        mButtonCountry.a(s2);
    }

    private void g()
    {
        e();
        if (k.n())
        {
            n.a().b(duo.a());
        }
        c.a(l.ec);
    }

    private void h()
    {
        b(getString(0x7f0701d3));
        if (k.h())
        {
            s = j.a(y).a(ico.a()).a(new epc(this, (byte)0));
            return;
        } else
        {
            l.a(y);
            return;
        }
    }

    private void i()
    {
        cwz.b(getActivity(), getActivity().getCurrentFocus());
        b(getString(0x7f07063b));
        String s1 = d.a(mEditTextExpirationMonth.getText().toString());
        String s2 = d.a(mEditTextExpirationYear.getText().toString());
        String s3 = d.a(mEditTextCreditCardCode.getText().toString());
        String s4 = mEditTextZip.getText().toString();
        String s5 = q.a(mSpinnerUseCase.getSelectedItemPosition());
        l.a(y, s1, s2, s3, r, s4, s5);
    }

    private void j()
    {
        mTextViewRewardRestrictions.setText(getString(0x7f0703a8));
        mTextViewRewardLink.setText(getString(0x7f0706ac));
        mViewGroupRewardRestrictions.setVisibility(0);
    }

    private void k()
    {
        boolean flag;
        if (mEditTextExpirationYear.B_() && mEditTextExpirationMonth.B_())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (p != null)
        {
            p.actionButtonConfirm.setEnabled(flag);
        }
    }

    private epd l()
    {
        return eok.a().a(new djb(this)).a((epi)((EditPaymentProfileActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return l();
    }

    public final void a()
    {
        k();
    }

    final void a(int i1, int j1)
    {
        if (i1 == 1 && j1 == -1)
        {
            h();
        }
    }

    public final volatile void a(czj czj)
    {
        a((epd)czj);
    }

    public final void a(String s1)
    {
        f(s1);
    }

    public final void a(boolean flag)
    {
        k();
    }

    public final void b(boolean flag)
    {
        k();
    }

    public final boolean b()
    {
        boolean flag = false;
        if (t)
        {
            c(false);
            c.a(n.cr);
            flag = true;
        }
        return flag;
    }

    public final void d(boolean flag)
    {
        k();
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClick(View view)
    {
        if (view != p.actionButtonConfirm) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(mEditTextCreditCardCode.getText())) goto _L4; else goto _L3
_L3:
        mEditTextCreditCardCode.setError(getString(0x7f0701bf));
        mEditTextCreditCardCode.requestFocus();
_L6:
        return;
_L4:
        mEditTextCreditCardCode.setError(null);
        i();
        return;
_L2:
        if (view == p.actionButtonCancel)
        {
            if (v)
            {
                d().finish();
                return;
            } else
            {
                c.a(n.cr);
                c(false);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onClickButtonDelete()
    {
        c.a(l.dZ);
        eoy.a(d());
    }

    public void onClickEnrollMe()
    {
        b(getString(0x7f070211));
        l.a(y, Boolean.valueOf(true), null);
    }

    public void onClickSetAsPayment()
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", y);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public void onClickTerms()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f0706ab))));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            y = bundle1.getString("payment_profile_uuid");
            v = bundle1.getBoolean("is_verify_mode", false);
            u = bundle1.getBoolean("is_selected", false);
        }
        if (bundle != null)
        {
            t = bundle.getBoolean("is_edit_mode", false);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f10000b, menu);
        x = menu.findItem(0x7f0e06b4);
        x.setTitle(getString(0x7f0701f4));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030113, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDeletePaymentProfileResponseEvent(dlp dlp1)
    {
        e();
        if (!dlp1.e())
        {
            e(dlp1.f());
            return;
        } else
        {
            g();
            return;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06b4)
        {
            c(true);
            c.a(n.ct);
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        w = null;
        z.b();
        if (s != null)
        {
            s.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!k.n())
        {
            dar1 = dar1.a().getClient().findPaymentProfileByUuid(y);
            if (dar1 == null)
            {
                e.c(new eri());
                return;
            }
            if (!t)
            {
                a(dar1);
                return;
            }
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        menu = x;
        boolean flag;
        if (!t)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setVisible(flag);
    }

    public void onResume()
    {
        super.onResume();
        w = (epa)getActivity();
        z = g.d().c(new epb(this, (byte)0));
        c(t);
        if (v)
        {
            t = true;
            c(t);
        }
    }

    public void onRewardsProgramUpdateResponse(dmy dmy1)
    {
        e();
        if (!dmy1.e())
        {
            c(dmy1.a(getActivity()));
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_edit_mode", t);
        bundle.putString("com.ubercab.client.feature.payment.COUNTRY_ISO2", r);
    }

    public void onUpdatePaymentProfileResponseEvent(dnr dnr1)
    {
        e();
        if (!dnr1.e())
        {
            c(dnr1.a(getActivity()));
        } else
        {
            c(getString(0x7f07044d));
            c(false);
            c.a(n.cs);
            if (v)
            {
                startActivity(TripActivity.a(d()));
                return;
            }
        }
    }

    void onUsePointsToggled(boolean flag)
    {
        if (A != null && A.booleanValue() != flag)
        {
            A = Boolean.valueOf(flag);
            l.a(y, null, Boolean.valueOf(flag));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            f(bundle.getString("com.ubercab.client.feature.payment.COUNTRY_ISO2"));
        }
        mButtonDelete.setText(getString(0x7f0701cf));
        q = new eql(getActivity());
        mSpinnerUseCase.setAdapter(q);
        mEditTextZip.setHint(getString(0x7f070680));
        mButtonCountry.a(this);
        if (i.a(dbf.bZ) && o.k())
        {
            mButtonSetAsPayment.setVisibility(0);
            view = mButtonSetAsPayment;
            if (!u)
            {
                flag = true;
            }
            view.setEnabled(flag);
        }
    }

    private class ActionViewHolder
    {

        View actionButtonCancel;
        View actionButtonConfirm;
        TextView textViewCancel;
        TextView textViewConfirm;

        private ActionViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }

        ActionViewHolder(View view, byte byte0)
        {
            this(view);
        }
    }

}
