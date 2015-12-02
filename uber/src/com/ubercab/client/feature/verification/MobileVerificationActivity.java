// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.signup.PhoneNumber;
import cys;
import czj;
import czq;
import dal;
import dar;
import dbf;
import dfe;
import dfp;
import djx;
import dkn;
import dmw;
import dpg;
import dri;
import dul;
import duo;
import gif;
import gig;
import gir;
import gis;
import git;
import giz;
import gjd;
import gjp;
import gjq;
import gjs;
import gmg;
import hkm;
import hku;
import hrq;
import ica;
import icl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationWaitFragment, MobileVerificationChangeNumberFragment, MobileVerificationTokenFragment, MobileVerificationSmsFragment

public class MobileVerificationActivity extends RiderActivity
{

    public djx h;
    public chp i;
    public hku j;
    public gmg k;
    public giz l;
    public czq m;
    public dkn n;
    public hkm o;
    public dpg p;
    public dal q;
    public dri r;
    public cys s;
    private String t;
    private icl u;
    private Drawable v;

    public MobileVerificationActivity()
    {
    }

    public static Fragment a(MobileVerificationActivity mobileverificationactivity, Class class1)
    {
        return mobileverificationactivity.a(class1);
    }

    private void a(int i1)
    {
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[git.a().length];
                try
                {
                    a[git.b - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[git.a - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[i1 - 1])
        {
        default:
            return;

        case 1: // '\001'
            b().a(v);
            return;

        case 2: // '\002'
            b().b(0);
            break;
        }
    }

    private void a(gis gis1)
    {
        gis1.a(this);
    }

    private void a(boolean flag)
    {
        a(git.b);
        MobileVerificationWaitFragment mobileverificationwaitfragment;
        if (flag)
        {
            mobileverificationwaitfragment = MobileVerificationWaitFragment.b();
        } else
        {
            mobileverificationwaitfragment = MobileVerificationWaitFragment.a();
        }
        a(0x7f0e02b1, ((Fragment) (mobileverificationwaitfragment)), true);
    }

    private gis b(dfp dfp)
    {
        return gif.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        h.d(q.z());
        a(true);
    }

    private void g()
    {
        r.a("com.uber.SMS_RECEIVER", gjd.a);
        h.c(q.z());
        i();
        a(getString(0x7f0703a7), null);
    }

    private void h()
    {
label0:
        {
            if (a(com/ubercab/client/feature/verification/MobileVerificationChangeNumberFragment) == null)
            {
                PhoneNumber phonenumber = l.g();
                if (phonenumber == null)
                {
                    break label0;
                }
                a(0x7f0e02b1, MobileVerificationChangeNumberFragment.a(phonenumber.a(), phonenumber.b()));
            }
            return;
        }
        a(0x7f0e02b1, MobileVerificationChangeNumberFragment.a(null, null));
    }

    private void i()
    {
        if (a(com/ubercab/client/feature/verification/MobileVerificationTokenFragment) == null)
        {
            a(git.b);
            a(0x7f0e02b1, MobileVerificationTokenFragment.a(), true);
        }
    }

    private boolean j()
    {
        int i1 = k();
        a(git.b);
        boolean flag;
        if (a(com/ubercab/client/feature/verification/MobileVerificationChangeNumberFragment) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && i1 == 1)
        {
            finish();
            return true;
        }
        if (flag)
        {
            getSupportFragmentManager().popBackStack();
            return true;
        } else
        {
            return false;
        }
    }

    private int k()
    {
        Object obj = getSupportFragmentManager().getFragments();
        if (obj == null)
        {
            return 0;
        }
        obj = ((List) (obj)).iterator();
        int i1 = 0;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if ((Fragment)((Iterator) (obj)).next() != null)
            {
                i1++;
            }
        } while (true);
        return i1;
    }

    private void l()
    {
        v = getResources().getDrawable(0x7f0200e4);
        hrq.a(v, getResources().getColor(0x7f0d0071));
    }

    private boolean m()
    {
        return s.a("android.permission.RECEIVE_SMS");
    }

    private void n()
    {
        if (a(com/ubercab/client/feature/verification/MobileVerificationSmsFragment) == null)
        {
            a(0x7f0e02b1, MobileVerificationSmsFragment.a(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        super.a(i1, j1, bundle);
        if (i1 == 1)
        {
            if (j1 == 101)
            {
                i.a(n.jy);
                a(git.a);
                h();
            }
            if (j1 == 102)
            {
                i.a(n.jB);
                g();
            }
            if (j1 == 100)
            {
                i.a(n.jx);
                f();
            }
        }
    }

    public final volatile void a(czj czj)
    {
        a((gis)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030210);
        l();
        a(git.b);
        t = getIntent().getAction();
        if (t == null) goto _L2; else goto _L1
_L1:
        byte byte0;
        bundle = t;
        byte0 = -1;
        bundle.hashCode();
        JVM INSTR lookupswitch 4: default 96
    //                   -1795422630: 144
    //                   -316976305: 174
    //                   -225332742: 129
    //                   1604726996: 159;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        byte0;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 189
    //                   1 194
    //                   2 199
    //                   3 217;
           goto _L2 _L8 _L9 _L10 _L11
_L2:
        return;
_L6:
        if (bundle.equals("com.ubercab.ACTION_MOBILE_VERIFICATION_SMS"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (bundle.equals("com.ubercab.ACTION_MOBILE_VERIFICATION_TOKEN"))
        {
            byte0 = 1;
        }
          goto _L3
_L7:
        if (bundle.equals("com.ubercab.ACTION_MOBILE_VERIFICATION_WAIT"))
        {
            byte0 = 2;
        }
          goto _L3
_L5:
        if (bundle.equals("com.ubercab.ACTION_MOBILE_VERIFICATION_CHANGE"))
        {
            byte0 = 3;
        }
          goto _L3
_L8:
        n();
        return;
_L9:
        i();
        return;
_L10:
        if (m())
        {
            a(false);
            return;
        } else
        {
            i();
            return;
        }
_L11:
        h();
        return;
    }

    protected final Collection e()
    {
        return Collections.singleton(m);
    }

    public void onBackPressed()
    {
        if (j())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            return j();
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        u.b();
        l.b();
    }

    public void onPhoneNumberChangedSuccessEvent(gjp gjp)
    {
        A();
        i();
        if (k.a(dbf.ab) && m())
        {
            a(false);
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!p.n() && a(com/ubercab/client/feature/verification/MobileVerificationWaitFragment) == null)
        {
            dar1 = dar1.a();
            if (dul.a(dar1) && dar1.getClient().getHasConfirmedMobile())
            {
                finish();
                return;
            }
        }
    }

    public void onRequestMobileVerificationResponseEvent(dmw dmw)
    {
        (new Handler()).postDelayed(new Runnable() {

            final MobileVerificationActivity a;

            public final void run()
            {
                a.u();
            }

            
            {
                a = MobileVerificationActivity.this;
                super();
            }
        }, 1000L);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        t = bundle.getString("com.ubercab.ACTION");
    }

    public void onResume()
    {
label0:
        {
            super.onResume();
            u = j.d().c(new gir(this, (byte)0));
            l.a();
            if (k.a(dbf.ab))
            {
                if (!p.n())
                {
                    break label0;
                }
                o.a().b(duo.a());
            }
            return;
        }
        n.b();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.ACTION", t);
    }

    public void onSelectPhoneNumberChangeEvent(gjq gjq)
    {
        a(git.a);
        h();
    }

    public void onVerificationTimeoutEvent(gjs gjs)
    {
        i();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
