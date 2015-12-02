// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ScrollView;
import chp;
import cix;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.rds.core.model.SupportFormComponent;
import com.ubercab.rds.core.model.SupportImageUploadRequest;
import com.ubercab.rds.core.model.SupportImageUploadResponse;
import com.ubercab.rds.core.model.SupportNode;
import com.ubercab.rds.core.model.SupportTicketRequest;
import com.ubercab.rds.core.model.SupportTicketResponse;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.rds.feature.help.HelpActivity;
import com.ubercab.rds.feature.trip.TripHistoryActivity;
import com.ubercab.rds.feature.trip.TripProblemActivity;
import cwm;
import cwt;
import gkq;
import h;
import hbk;
import hbm;
import hbn;
import hbo;
import hbt;
import hch;
import hck;
import hfd;
import hfe;
import hfr;
import hft;
import hfu;
import hfv;
import hfx;
import hfz;
import hiv;
import i;
import ijg;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportFormView, SupportHomeActivity, SupportPhotoActivity

public class SupportFormActivity extends RdsActivity
    implements hfu, hfx, hfz
{

    public chp c;
    public cix d;
    public hch e;
    public hck f;
    public SupportApi g;
    int h;
    String i;
    Map j;
    Map k;
    SupportFormView l;
    private boolean m;
    private boolean n;
    private String o;
    private ScrollView p;
    private SupportNode q;
    private TripReceipt r;

    public SupportFormActivity()
    {
        j = new HashMap();
        k = new HashMap();
    }

    public static Intent a(Context context, String s, String s1, String s2, TripReceipt tripreceipt)
    {
        return (new Intent(context, com/ubercab/rds/feature/support/SupportFormActivity)).putExtra("com.ubercab.rds.EXTRA_SUPPORT_NODE_TYPE", s).putExtra("com.ubercab.rds.EXTRA_SUPPORT_NODE_UUID", s1).putExtra("com.ubercab.rds.EXTRA_TRIP_UUID", s2).putExtra("com.ubercab.rds.EXTRA_TRIP_RECEIPT", tripreceipt);
    }

    static SupportNode a(SupportFormActivity supportformactivity, SupportNode supportnode)
    {
        supportformactivity.q = supportnode;
        return supportnode;
    }

    static String a(SupportFormActivity supportformactivity, String s)
    {
        supportformactivity.o = s;
        return s;
    }

    private void a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        List list = (List)k.get(i);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj = new ArrayList();
        if (h < ((List) (obj)).size())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        ((List) (obj)).add(uri);
_L1:
        k.put(i, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        ((List) (obj)).set(h, uri);
          goto _L1
        uri;
        throw uri;
    }

    static void a(SupportFormActivity supportformactivity)
    {
        supportformactivity.t();
    }

    static void a(SupportFormActivity supportformactivity, String s, byte abyte0[])
    {
        supportformactivity.a(s, abyte0);
    }

    private void a(hfr hfr1)
    {
        hfr1.a(this);
    }

    private void a(String s, Uri uri)
    {
        (new AsyncTask(uri, s) {

            final Uri a;
            final String b;
            final SupportFormActivity c;

            private void a(byte abyte0[])
            {
                super.onPostExecute(abyte0);
                if (abyte0 != null)
                {
                    SupportFormActivity.a(c, b, abyte0);
                    return;
                }
                c.d(b, null);
                if (c.h() == c.i())
                {
                    SupportFormActivity.j(c);
                }
                cwm.a(c, c.getString(hbo.ub__rds__image_failure));
                ijg.d("Failed to upload image for support form.", new Object[] {
                    SupportFormActivity.b(c).getId()
                });
            }

            private transient byte[] a()
            {
                byte abyte0[];
                try
                {
                    abyte0 = gkq.b(new FileInputStream(a.getPath()));
                }
                catch (Exception exception)
                {
                    ijg.d("Failed to decode image from path.", new Object[] {
                        exception
                    });
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
                c = SupportFormActivity.this;
                a = uri;
                b = s;
                super();
            }
        }).execute(new Void[0]);
    }

    private void a(String s, Uri uri, int i1)
    {
        l.a(s, uri, i1);
    }

    private void a(String s, byte abyte0[])
    {
        abyte0 = SupportImageUploadRequest.create().setFile(Base64.encodeToString(abyte0, 0)).setLabel("image.jpg").setRequesterId(f.z());
        g.imageUpload(abyte0, new Callback(s) {

            final String a;
            final SupportFormActivity b;

            private void a(SupportImageUploadResponse supportimageuploadresponse)
            {
                supportimageuploadresponse = supportimageuploadresponse.getToken();
                b.d(a, supportimageuploadresponse);
                SupportFormActivity.i(b);
            }

            public final void failure(RetrofitError retrofiterror)
            {
                b.d(a, null);
                SupportFormActivity.i(b);
            }

            public final void success(Object obj, Response response)
            {
                a((SupportImageUploadResponse)obj);
            }

            
            {
                b = SupportFormActivity.this;
                a = s;
                super();
            }
        });
    }

    static SupportNode b(SupportFormActivity supportformactivity)
    {
        return supportformactivity.q;
    }

    static void c(SupportFormActivity supportformactivity)
    {
        supportformactivity.d();
    }

    static boolean d(SupportFormActivity supportformactivity)
    {
        supportformactivity.m = true;
        return true;
    }

    private String e(String s)
    {
        byte byte0;
        if (s == null)
        {
            return getString(hbo.ub__rds__how_can_we_help);
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 44
    //                   101142: 76
    //                   3148996: 90;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_90;
_L4:
        switch (byte0)
        {
        default:
            return getString(hbo.ub__rds__how_can_we_help);

        case 0: // '\0'
            return getString(hbo.ub__rds__learn_more);

        case 1: // '\001'
            return getString(hbo.ub__rds__tell_us_more);
        }
_L2:
        if (s.equals("faq"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("form"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    private void e(String s, String s1)
    {
        Iterator iterator = q.getComponents().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SupportFormComponent supportformcomponent = (SupportFormComponent)iterator.next();
            if (s.equals(supportformcomponent.getId()))
            {
                supportformcomponent.setValue(s1);
            }
        } while (true);
    }

    static boolean e(SupportFormActivity supportformactivity)
    {
        supportformactivity.n = false;
        return false;
    }

    static boolean f(SupportFormActivity supportformactivity)
    {
        return supportformactivity.a;
    }

    static void g(SupportFormActivity supportformactivity)
    {
        supportformactivity.o();
    }

    static void h(SupportFormActivity supportformactivity)
    {
        supportformactivity.u();
    }

    static void i(SupportFormActivity supportformactivity)
    {
        supportformactivity.k();
    }

    private hfr j()
    {
        return hfd.a().a(new hbt(getApplication())).a();
    }

    static void j(SupportFormActivity supportformactivity)
    {
        supportformactivity.p();
    }

    private void k()
    {
        if (h() == i())
        {
            p();
        }
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((List)iterator.next()).iterator();
            while (iterator1.hasNext()) 
            {
                (new File(((Uri)iterator1.next()).getPath())).delete();
            }
        }

        break MISSING_BLOCK_LABEL_81;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = k.keySet().iterator();
_L4:
        String s;
        List list;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        list = (List)k.get(s);
        int i1 = 0;
_L2:
        if (i1 >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        a(s, (Uri)list.get(i1), i1);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void n()
    {
        String s;
        s = e.c();
        e.b("");
        s.hashCode();
        JVM INSTR lookupswitch 4: default 64
    //                   -959338677: 136
    //                   -769349536: 121
    //                   1790271794: 106
    //                   2099152214: 151;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte byte0 = -1;
          goto _L6
_L4:
        if (!s.equals("com.ubercab.rds.RETURN_HELP")) goto _L1; else goto _L7
_L7:
        byte0 = 0;
          goto _L6
_L3:
        if (!s.equals("com.ubercab.rds.RETURN_SUPPORT_HOME")) goto _L1; else goto _L8
_L8:
        byte0 = 1;
          goto _L6
_L2:
        if (!s.equals("com.ubercab.rds.RETURN_TRIP_HISTORY")) goto _L1; else goto _L9
_L9:
        byte0 = 2;
          goto _L6
_L5:
        if (!s.equals("com.ubercab.rds.RETURN_TRIP_PROBLEM")) goto _L1; else goto _L10
_L10:
        byte0 = 3;
_L6:
        switch (byte0)
        {
        default:
            setResult(-1);
            finish();
            return;

        case 0: // '\0'
            HelpActivity.b(this);
            return;

        case 1: // '\001'
            SupportHomeActivity.a(this);
            return;

        case 2: // '\002'
            TripHistoryActivity.a(this);
            return;

        case 3: // '\003'
            TripProblemActivity.a(this);
            break;
        }
        return;
    }

    private void o()
    {
        l();
        u();
        hfv.a(this, o).a(this);
    }

    private void p()
    {
        double d1;
        Object obj;
        d1 = 0.0D;
        obj = d.c();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((UberLocation) (obj)).g();
        if (obj == null) goto _L2; else goto _L3
_L3:
        double d2;
        d2 = ((UberLatLng) (obj)).a();
        d1 = ((UberLatLng) (obj)).b();
_L5:
        SupportTicketRequest supportticketrequest = SupportTicketRequest.create().setComponents(l.a()).setImageTokens(j).setLatitude(d2).setLocale(cwt.a()).setLongitude(d1).setProblemId(q.getId()).setToken(f.x()).setTripId(getIntent().getStringExtra("com.ubercab.rds.EXTRA_TRIP_UUID")).setUserType(f.y()).setUuid(f.z());
        g.submitTicket(supportticketrequest, new Callback() {

            final SupportFormActivity a;

            private void a(SupportTicketResponse supportticketresponse)
            {
                SupportFormActivity.d(a);
                SupportFormActivity.e(a);
                SupportFormActivity.a(a, supportticketresponse.getMessage());
                if (!a.isFinishing() && SupportFormActivity.f(a))
                {
                    SupportFormActivity.g(a);
                }
            }

            public final void failure(RetrofitError retrofiterror)
            {
                SupportFormActivity.e(a);
                cwm.a(a, a.getString(hbo.ub__rds__error));
                SupportFormActivity.h(a);
                a.l.b();
            }

            public final void success(Object obj1, Response response)
            {
                a((SupportTicketResponse)obj1);
            }

            
            {
                a = SupportFormActivity.this;
                super();
            }
        });
        return;
_L2:
        d2 = 0.0D;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final volatile void a(Object obj)
    {
        a((hfr)obj);
    }

    public final void a(String s, String s1)
    {
        e(s, s1);
        l.c(s, s1);
    }

    public final void a(String s, String s1, int i1)
    {
        i = s;
        h = i1;
        c.a(i.p);
        startActivityForResult(SupportPhotoActivity.a(this, s1), 100);
    }

    public final void b(String s, String s1)
    {
        e(s, s1);
    }

    protected final Object c()
    {
        return j();
    }

    public final void c(String s, String s1)
    {
        e(s, s1);
    }

    public final void d(String s)
    {
        if ((hft)a(hft) == null)
        {
            (new hft(s)).show(getSupportFragmentManager(), hft.getName());
        }
        c.a(i.o);
    }

    final void d(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (!j.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = (List)j.get(s);
_L1:
        ((List) (obj)).add(s1);
        j.put(s, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new ArrayList();
          goto _L1
        s;
        throw s;
    }

    public final void f()
    {
        n = true;
        c(getString(hbo.ub__rds__submitting));
        if (i() > 0)
        {
            for (Iterator iterator = k.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                Iterator iterator1 = ((List)k.get(s)).iterator();
                while (iterator1.hasNext()) 
                {
                    a(s, (Uri)iterator1.next());
                }
            }

        } else
        {
            p();
        }
        c.a(i.r);
    }

    public final void g()
    {
        n();
    }

    final int h()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = j.values().iterator();
        int i1 = 0;
_L2:
        int j1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ((List)iterator.next()).size();
        i1 = j1 + i1;
        if (true) goto _L2; else goto _L1
_L1:
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    final int i()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = k.values().iterator();
        int i1 = 0;
_L2:
        int j1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ((List)iterator.next()).size();
        i1 = j1 + i1;
        if (true) goto _L2; else goto _L1
_L1:
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1 && i1 == 100)
        {
            intent = intent.getData();
            a(intent);
            a(i, intent, h);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__support_activity_form);
        a(e(getIntent().getStringExtra("com.ubercab.rds.EXTRA_SUPPORT_NODE_TYPE")));
        b(getString(hbo.ub__rds__problem_loading_form));
        e();
        p = (ScrollView)findViewById(hbk.ub__support_form_scroll_view);
        l = (SupportFormView)findViewById(hbk.ub__support_form_view);
        l.a(this);
        r = (TripReceipt)getIntent().getParcelableExtra("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
        if (bundle != null)
        {
            q = (SupportNode)bundle.getParcelable("com.ubercab.rds.EXTRA_SUPPORT_NODE");
            i = bundle.getString("com.ubercab.rds.EXTRA_ACTIVE_PHOTO_FIELD_ID");
            h = bundle.getInt("com.ubercab.rds.EXTRA_ACTIVE_PHOTO_POSITION");
            n = bundle.getBoolean("com.ubercab.rds.EXTRA_SUBMITTING_FORM");
            k = (HashMap)bundle.getSerializable("com.ubercab.rds.EXTRA_IMAGE_FIELD_URI_MAP");
            p.setScrollY(bundle.getInt("com.ubercab.rds.EXTRA_SCROLL_VIEW_POSITION"));
            l.a(q);
            m();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if ("client".equals(f.y()) && r != null)
        {
            getMenuInflater().inflate(hbn.ub__trip_problem_receipt_menu, menu);
        }
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        l.b(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == hbk.ub__trip_problem_receipt)
        {
            c.a(i.q);
            hiv.a(this, r);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        u();
    }

    public void onResume()
    {
        super.onResume();
        if (q == null)
        {
            s();
            c.a(h.f);
            g.supportNode(getIntent().getStringExtra("com.ubercab.rds.EXTRA_SUPPORT_NODE_UUID"), cwt.a(), new Callback() {

                final SupportFormActivity a;

                private void a(SupportNode supportnode)
                {
                    SupportFormActivity.a(a);
                    SupportFormActivity.a(a, supportnode);
                    a.l.a(SupportFormActivity.b(a));
                }

                public final void failure(RetrofitError retrofiterror)
                {
                    SupportFormActivity.c(a);
                }

                public final void success(Object obj, Response response)
                {
                    a((SupportNode)obj);
                }

            
            {
                a = SupportFormActivity.this;
                super();
            }
            });
        } else
        if (n)
        {
            cwm.a(this, getString(hbo.ub__rds__please_retry_form));
            l.b();
            return;
        }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (m && !TextUtils.isEmpty(o))
        {
            o();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.ubercab.rds.EXTRA_SUPPORT_NODE", q);
        bundle.putString("com.ubercab.rds.EXTRA_ACTIVE_PHOTO_FIELD_ID", i);
        bundle.putInt("com.ubercab.rds.EXTRA_ACTIVE_PHOTO_POSITION", h);
        bundle.putBoolean("com.ubercab.rds.EXTRA_SUBMITTING_FORM", n);
        bundle.putSerializable("com.ubercab.rds.EXTRA_IMAGE_FIELD_URI_MAP", (HashMap)k);
        bundle.putInt("com.ubercab.rds.EXTRA_SCROLL_VIEW_POSITION", p.getScrollY());
    }
}
