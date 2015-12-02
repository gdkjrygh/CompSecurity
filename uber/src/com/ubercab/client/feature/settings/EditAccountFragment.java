// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cgh;
import cgt;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.locale.name.NameInput;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.ui.CircleImageView;
import com.ubercab.ui.FloatingLabelEditText;
import cwm;
import czb;
import czj;
import dal;
import dbf;
import dce;
import dfp;
import djb;
import djx;
import dnq;
import dnu;
import dri;
import duj;
import fgl;
import fgo;
import fgp;
import fgw;
import gjd;
import gkq;
import gmg;
import gow;
import goz;
import gpn;
import gpp;
import hoi;
import hrs;
import hrw;
import hrx;
import hsj;
import hsq;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.settings:
//            AccountPictureActivity, SettingsActivity

public class EditAccountFragment extends czb
{

    private static final hrs k;
    private static final hrx l;
    private static final hrw m = new hrw(new hrs(0x7f070287));
    private static final goz n;
    private static final gpn o;
    public djx c;
    public chp d;
    public gmg e;
    public hsq f;
    public cgh g;
    public dce h;
    public dal i;
    public dri j;
    FloatingLabelEditText mEditTextEmail;
    CircleImageView mImageViewPicture;
    NameInput mNameInput;
    PhoneNumberView mPhoneNumberView;
    private byte p[];
    private Uri q;
    private boolean r;
    private boolean s;

    public EditAccountFragment()
    {
        r = true;
    }

    static RiderActivity a(EditAccountFragment editaccountfragment)
    {
        return editaccountfragment.d();
    }

    static EditAccountFragment a(RiderAccount rideraccount)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("rider_account", rideraccount);
        rideraccount = new EditAccountFragment();
        rideraccount.setArguments(bundle);
        return rideraccount;
    }

    private void a()
    {
        d.a(n.Z);
        startActivityForResult(AccountPictureActivity.a(d()), 101);
    }

    private static void a(Menu menu, int i1, int j1)
    {
        menu = menu.findItem(i1);
        if (menu != null)
        {
            menu.setTitle(j1);
        }
    }

    private void a(fgw fgw1)
    {
        fgw1.a(this);
    }

    private void a(boolean flag)
    {
        r = flag;
        mNameInput.setEnabled(flag);
        mEditTextEmail.setEnabled(flag);
        mPhoneNumberView.setEnabled(flag);
        mImageViewPicture.setClickable(flag);
        d().invalidateOptionsMenu();
    }

    static byte[] a(EditAccountFragment editaccountfragment, byte abyte0[])
    {
        editaccountfragment.p = abyte0;
        return abyte0;
    }

    private fgw b(dfp dfp)
    {
        return fgo.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        if (e.a(dbf.ab) && g())
        {
            j.a("com.uber.SMS_RECEIVER", gjd.a);
        }
        s = true;
        a(false);
        b(getString(0x7f07063b));
        if (p != null)
        {
            c.a(p);
            return;
        } else
        {
            h();
            return;
        }
    }

    private void b(RiderAccount rideraccount)
    {
        rideraccount = SettingsActivity.a(getActivity(), rideraccount);
        rideraccount.addFlags(0x4000000);
        startActivity(rideraccount);
    }

    static void b(EditAccountFragment editaccountfragment)
    {
        editaccountfragment.a(true);
    }

    private boolean g()
    {
        Object obj = (RiderAccount)getArguments().getParcelable("rider_account");
        obj = duj.c(((RiderAccount) (obj)).getCurrentMobile(), ((RiderAccount) (obj)).getMobileCountryIso2());
        String s1 = duj.c(mPhoneNumberView.g(), mPhoneNumberView.d());
        return obj == null || !((String) (obj)).equals(s1);
    }

    private void h()
    {
        String s2 = mEditTextEmail.i().toString();
        RiderAccount rideraccount = (RiderAccount)getArguments().getParcelable("rider_account");
        String s1 = s2;
        if (RiderAccount.isFakedEmail(rideraccount.getEmail()))
        {
            s1 = s2;
            if (s2.isEmpty())
            {
                s1 = rideraccount.getEmail();
            }
        }
        c.a(i.z(), mNameInput.c(), mNameInput.d(), s1, mPhoneNumberView.d(), mPhoneNumberView.h());
    }

    private void i()
    {
        d.a(n.aa);
        hsj hsj1 = (new hsj()).a(mNameInput, n).a(mPhoneNumberView, o);
        if (!RiderAccount.isFakedEmail(((RiderAccount)getArguments().getParcelable("rider_account")).getEmail()))
        {
            hsj1.a(mEditTextEmail, l);
        } else
        {
            hsj1.a(mEditTextEmail, m);
        }
        if (hsj1.a().isEmpty())
        {
            b();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fgw)czj);
    }

    public final cic f()
    {
        return l.ft;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Object obj = (RiderAccount)getArguments().getParcelable("rider_account");
        mNameInput.a(((RiderAccount) (obj)).getFirstName());
        mNameInput.b(((RiderAccount) (obj)).getLastName());
        FloatingLabelEditText floatinglabeledittext = mEditTextEmail;
        if (RiderAccount.isFakedEmail(((RiderAccount) (obj)).getEmail()))
        {
            bundle = "";
        } else
        {
            bundle = ((RiderAccount) (obj)).getEmail();
        }
        floatinglabeledittext.d(bundle);
        mPhoneNumberView.a(((RiderAccount) (obj)).getCurrentMobile(), ((RiderAccount) (obj)).getMobileCountryIso2());
        bundle = ((RiderAccount) (obj)).getPictureUrl();
        if (!TextUtils.isEmpty(bundle))
        {
            obj = fgl.a(getResources());
            g.a(bundle).a(((android.graphics.drawable.Drawable) (obj))).b(0x7f02006f).a(mImageViewPicture);
        } else
        {
            mImageViewPicture.setImageResource(0x7f02006f);
        }
        mImageViewPicture.setClickable(true);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1 && i1 == 101)
        {
            a(false);
            intent = intent.getData();
            q = intent;
            (new AsyncTask(intent) {

                final Uri a;
                final EditAccountFragment b;

                private void a(byte abyte0[])
                {
                    super.onPostExecute(abyte0);
                    if (abyte0 != null)
                    {
                        EditAccountFragment.a(b, abyte0);
                        b.mImageViewPicture.setImageURI(a);
                    } else
                    {
                        cwm.a(EditAccountFragment.a(b), b.getString(0x7f07021f));
                    }
                    EditAccountFragment.b(b);
                }

                private transient byte[] a()
                {
                    byte abyte0[];
                    try
                    {
                        FileInputStream fileinputstream = new FileInputStream(a.getPath());
                        abyte0 = gkq.b(fileinputstream);
                        fileinputstream.close();
                    }
                    catch (Exception exception)
                    {
                        return null;
                    }
                    return abyte0;
                }

                protected final Object doInBackground(Object aobj[])
                {
                    return a();
                }

                protected final void onPostExecute(Object obj)
                {
                    a((byte[])obj);
                }

            
            {
                b = EditAccountFragment.this;
                a = uri;
                super();
            }
            }).execute(new Void[0]);
        }
    }

    void onClickAccountPicture()
    {
        a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030055, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06bf)
        {
            a();
            return true;
        }
        if (menuitem.getItemId() == 0x7f0e06c0)
        {
            i();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f0e06c2).setVisible(false);
        menu.setGroupVisible(0x7f0e06be, true);
        menu.setGroupEnabled(0x7f0e06be, r);
        if (e.a(dbf.aK))
        {
            a(menu, 0x7f0e06bf, 0x7f0703dd);
            a(menu, 0x7f0e06c0, 0x7f070633);
        }
    }

    public void onResume()
    {
        super.onResume();
        e();
        if (s)
        {
            b(((RiderAccount) (null)));
        }
    }

    public void onUpdateAccountResponseEvent(dnq dnq1)
    {
        e();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (dnq1.i())
        {
            dnq1 = (RiderAccount)dnq1.g();
            ((hoi)f.a()).a("com.ubercab.client.RIDER_ACCOUNT", dnq1);
            int i1;
            if (e.a(dbf.aK))
            {
                i1 = 0x7f0701f6;
            } else
            {
                i1 = 0x7f0701fc;
            }
            cwm.a(fragmentactivity, getString(i1));
            b(dnq1);
            return;
        }
        int j1;
        if (e.a(dbf.aK))
        {
            j1 = 0x7f07021c;
        } else
        {
            j1 = 0x7f070222;
        }
        cwm.a(fragmentactivity, getString(j1));
        a(true);
    }

    public void onUploadAccountPictureResponseEvent(dnu dnu1)
    {
        if (dnu1.i())
        {
            if (q != null && q.getPath() != null)
            {
                (new File(q.getPath())).delete();
            }
            h();
            return;
        }
        e();
        dnu1 = getActivity();
        int i1;
        if (e.a(dbf.aK))
        {
            i1 = 0x7f07021d;
        } else
        {
            i1 = 0x7f070223;
        }
        cwm.a(dnu1, getString(i1));
        a(true);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = mNameInput;
        int i1;
        if ("CHINA".equals(h.a()) && gpp.a(Locale.getDefault()))
        {
            i1 = gow.b;
        } else
        {
            i1 = gow.a;
        }
        view.a(i1);
    }

    static 
    {
        k = new hrs(0x7f07039f);
        l = new hrx(k, new hrs(0x7f070287));
        n = new goz(k, k);
        o = new gpn(k);
    }
}
