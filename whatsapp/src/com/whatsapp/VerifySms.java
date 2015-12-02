// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.NotificationManagerCompat;
import android.telephony.ServiceState;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.m;
import com.whatsapp.util.q;
import de.greenrobot.event.g;
import java.util.Random;

// Referenced classes of package com.whatsapp:
//            VerifyNumber, App, afk, RegisterPhone, 
//            ChangeNumber, alw, o4, pe, 
//            bj, asw, aoz, Main, 
//            RegisterName, o0, iz, a_t, 
//            m9, akb, a9i, a1j, 
//            a85, nl, wb, all, 
//            xz, km, v3, a3t, 
//            bl, z6, af5, ad2, 
//            hg, il, ye, alg, 
//            uf, _z, asr, au

public class VerifySms extends VerifyNumber
{

    private static short A;
    private static CountDownTimer B;
    private static boolean C;
    private static int F;
    private static long I;
    private static String L;
    private static String M;
    private static final int Q;
    private static String R;
    private static int X;
    private static BroadcastReceiver Z;
    private static BroadcastReceiver ac;
    private static String ae;
    private static final String bb[];
    private static int v;
    private static int w;
    private static long x;
    private String D;
    BroadcastReceiver E;
    private boolean G;
    private CountDownTimer H;
    boolean J;
    BroadcastReceiver K;
    private String N;
    private BroadcastReceiver O;
    private long P;
    private boolean S;
    private TextView T;
    private long U;
    private String V;
    private View W;
    private int Y;
    private int aa;
    private EditText ab;
    ProgressDialog ad;
    private long af;
    private CountDownTimer ag;
    private View ah;
    private TextView ai;
    private boolean aj;
    private String r;
    private long s;
    private ProgressBar t;
    private final afk u = new afk(this, null);
    BroadcastReceiver y;
    private Button z;

    public VerifySms()
    {
        r = bb[66];
        S = false;
        U = 0L;
        ag = null;
        J = false;
        y = new _cls1();
        E = new _cls2();
        K = new _cls3();
        aa = -2;
    }

    static int A()
    {
        return w;
    }

    static void A(VerifySms verifysms)
    {
        verifysms.f();
    }

    static String B()
    {
        return ae;
    }

    static void B(VerifySms verifysms)
    {
        verifysms.o();
    }

    private void C()
    {
        try
        {
            if (O != null)
            {
                unregisterReceiver(O);
                O = null;
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    private void D()
    {
        Intent intent;
label0:
        {
            X = 0;
            F();
            r = bb[49];
            u.removeMessages(1);
            if (!m)
            {
                App.d(this, 1);
                intent = new Intent(this, com/whatsapp/RegisterPhone);
                intent.putExtra(bb[50], true);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.d(this, 3);
            ChangeNumber.a(this);
            intent = new Intent(this, com/whatsapp/ChangeNumber);
        }
        startActivity(intent);
        finish();
    }

    private void E()
    {
        boolean flag;
        try
        {
            flag = S;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        super.b(bb[25]);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        super.b(r);
        return;
    }

    private void F()
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putInt(bb[100], X);
            if (!editor.commit())
            {
                Log.w(bb[99]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    private void G()
    {
        String s1 = a(N, V);
        String s2 = getString(0x7f0e046c);
        String s3 = getString(0x7f0e046b, new Object[] {
            getString(0x7f0e0469), Integer.valueOf(w)
        });
        ((TextView)findViewById(0x7f0b02b2)).setText(s2);
        ((TextView)findViewById(0x7f0b02b3)).setText(s1);
        ((TextView)findViewById(0x7f0b02b5)).setText(s3);
        z.setVisibility(0);
        findViewById(0x7f0b02ae).setVisibility(0);
        findViewById(0x7f0b02b1).setVisibility(0);
        findViewById(0x7f0b02a7).setVisibility(8);
        findViewById(0x7f0b02b0).setVisibility(0);
        findViewById(0x7f0b02b6).setVisibility(0);
        K();
    }

    private int H()
    {
        return getPreferences(0).getInt(bb[53], -1);
    }

    private void I()
    {
        String s1 = App.z.getNetworkOperator();
        boolean flag;
        try
        {
            flag = bb[98].equals(s1);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        A = (short)((new Random()).nextInt(100) + 16000);
_L3:
        return;
_L2:
        int i1;
        try
        {
            A = 0;
            i1 = App.am;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (i1 == 0) goto _L3; else goto _L1
    }

    private void J()
    {
        Object obj = alw.a();
        String s1 = alw.b();
        String s2 = bb[1];
        obj = Uri.parse((new StringBuilder(bb[3])).append('?').append(bb[4]).append(s2).append('&').append(bb[6]).append(s1).append('&').append(bb[5]).append(((String) (obj))).toString());
        obj = new Intent(bb[2], ((Uri) (obj)));
        try
        {
            startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            App.b(this, 0x7f0e0022, 0);
        }
    }

    private void K()
    {
        int i1 = App.am;
        int j1 = X;
        j1;
        JVM INSTR tableswitch 3 13: default 68
    //                   3 161
    //                   4 68
    //                   5 68
    //                   6 68
    //                   7 68
    //                   8 68
    //                   9 68
    //                   10 96
    //                   11 191
    //                   12 230
    //                   13 132;
           goto _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L1 _L3 _L4 _L5 _L6
_L1:
        ActivityNotFoundException activitynotfoundexception;
        try
        {
            Log.e((new StringBuilder()).append(bb[36]).append(X).toString());
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
_L3:
        findViewById(0x7f0b02b6).setVisibility(0);
        z.setText(getString(0x7f0e0469));
        r = bb[37];
_L7:
        return;
_L6:
        findViewById(0x7f0b02b6).setVisibility(0);
        z.setText(getString(0x7f0e0469));
        if (i1 == 0) goto _L7; else goto _L2
_L2:
        findViewById(0x7f0b02b6).setVisibility(8);
        z.setText(getString(0x7f0e0469));
        if (i1 == 0) goto _L7; else goto _L4
_L4:
        findViewById(0x7f0b02b6).setVisibility(0);
        z.setText(getString(0x7f0e0361));
        r = bb[35];
        if (i1 == 0) goto _L7; else goto _L5
_L5:
        findViewById(0x7f0b02b6).setVisibility(8);
        z.setVisibility(8);
        if (i1 == 0) goto _L7; else goto _L1
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    private void L()
    {
        try
        {
            if (ac != null)
            {
                unregisterReceiver(ac);
                ac = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            C();
            if (Z != null)
            {
                unregisterReceiver(Z);
                Z = null;
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
    }

    static int M()
    {
        int i1 = v - 1;
        v = i1;
        return i1;
    }

    static int a(int i1)
    {
        w = i1;
        return i1;
    }

    static long a(VerifySms verifysms, long l1)
    {
        verifysms.U = l1;
        return l1;
    }

    private String a(Intent intent)
    {
        Object obj = null;
        String s1 = obj;
        if (bb[22].equals(intent.getScheme()))
        {
            intent = intent.getData();
            s1 = obj;
            if (intent != null)
            {
                boolean flag;
                try
                {
                    flag = "r".equals(intent.getHost());
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    throw intent;
                }
                s1 = obj;
                if (flag)
                {
                    s1 = intent.getQueryParameter("c");
                    Log.i((new StringBuilder()).append(bb[21]).append(s1).toString());
                }
            }
        }
        return s1;
    }

    static String a(VerifySms verifysms)
    {
        return verifysms.N;
    }

    static String a(VerifySms verifysms, String s1)
    {
        verifysms.r = s1;
        return s1;
    }

    private void a()
    {
        Object obj;
        Object obj1;
        int i1;
        i1 = App.am;
        obj = (InputMethodManager)getSystemService(bb[61]);
        int j1;
        boolean flag;
        try
        {
            ((InputMethodManager) (obj)).toggleSoftInput(0, 0);
            obj1 = (new StringBuilder()).append(bb[57]);
            flag = o4.j();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (!o4.F()) goto _L3; else goto _L2
_L2:
        obj = R;
_L11:
        obj = ((StringBuilder) (obj1)).append(((String) (obj))).append(bb[60]).toString();
        obj1 = SmsManager.getDefault();
        ae = b(N, V);
        Log.i((new StringBuilder()).append(bb[59]).append(ae).toString());
        j1 = X;
        j1;
        JVM INSTR lookupswitch 2: default 160
    //                   0: 202
    //                   5: 308;
           goto _L4 _L5 _L6
_L4:
        Log.e((new StringBuilder()).append(bb[62]).append(X).toString());
_L8:
        return;
_L3:
        obj = L;
        continue; /* Loop/switch isn't completed */
_L5:
        boolean flag1;
        P = 0L;
        s = 0L;
        flag1 = c();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = M;
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        af = Q * 2;
        a(((SmsManager) (obj1)), ((String) (obj)));
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        flag1 = g();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        ai.setText("");
        af = Q;
        l();
        if (i1 == 0) goto _L8; else goto _L9
_L9:
        Log.e(bb[58]);
        D();
        if (i1 == 0) goto _L8; else goto _L6
_L6:
        ai.setText("");
        af = Q;
        l();
        if (i1 == 0) goto _L8; else goto _L4
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        try
        {
            throw activitynotfoundexception;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            try
            {
                throw activitynotfoundexception1;
            }
            catch (ActivityNotFoundException activitynotfoundexception2)
            {
                try
                {
                    throw activitynotfoundexception2;
                }
                catch (ActivityNotFoundException activitynotfoundexception3)
                {
                    try
                    {
                        throw activitynotfoundexception3;
                    }
                    catch (ActivityNotFoundException activitynotfoundexception4)
                    {
                        try
                        {
                            throw activitynotfoundexception4;
                        }
                        catch (ActivityNotFoundException activitynotfoundexception5)
                        {
                            try
                            {
                                throw activitynotfoundexception5;
                            }
                            catch (ActivityNotFoundException activitynotfoundexception6)
                            {
                                try
                                {
                                    throw activitynotfoundexception6;
                                }
                                catch (ActivityNotFoundException activitynotfoundexception7)
                                {
                                    throw activitynotfoundexception7;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void a(long l1)
    {
        View view;
        ProgressBar progressbar;
        try
        {
            if (ag != null)
            {
                ag.cancel();
                ag = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        ab.setEnabled(false);
        view = findViewById(0x7f0b02b9);
        view.setVisibility(0);
        progressbar = (ProgressBar)findViewById(0x7f0b02ba);
        progressbar.setVisibility(0);
        ag = (new pe(this, l1, 1000L, progressbar, l1, view)).start();
    }

    private void a(SmsManager smsmanager, String s1)
    {
        ai.setText((new StringBuilder()).append(getString(0x7f0e0468, new Object[] {
            Integer.valueOf(1), Integer.valueOf(2)
        })).append(" ").toString());
        X = 1;
        y();
        PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(bb[47]), 0);
        try
        {
            smsmanager.sendDataMessage(ae, null, A, s1.getBytes(), pendingintent, null);
            Log.i((new StringBuilder()).append(bb[48]).append(System.currentTimeMillis()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SmsManager smsmanager)
        {
            Log.i(bb[46]);
        }
        g(bb[45]);
        g();
    }

    static void a(VerifySms verifysms, int i1)
    {
        verifysms.g(i1);
    }

    static void a(VerifySms verifysms, boolean flag)
    {
        verifysms.a(flag);
    }

    private void a(String s1)
    {
        int i1 = App.am;
        X;
        JVM INSTR tableswitch 1 13: default 290
    //                   1 215
    //                   2 72
    //                   3 138
    //                   4 290
    //                   5 72
    //                   6 290
    //                   7 290
    //                   8 290
    //                   9 290
    //                   10 138
    //                   11 138
    //                   12 290
    //                   13 138;
           goto _L1 _L2 _L3 _L4 _L1 _L3 _L1 _L1 _L1 _L1 _L4 _L4 _L1 _L4
_L2:
        break MISSING_BLOCK_LABEL_215;
_L1:
        break MISSING_BLOCK_LABEL_290;
_L3:
        Log.i((new StringBuilder()).append(bb[43]).append(X).toString());
        h(s1);
        asw.a(new bj(this), new String[] {
            s1, bb[39]
        });
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_290;
        }
_L4:
        View view = findViewById(0x7f0b02b9);
        int j1 = view.getVisibility();
        if (j1 == 0) goto _L6; else goto _L5
_L5:
        Log.i((new StringBuilder()).append(bb[40]).append(X).toString());
        ab.setText(s1);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_290;
        }
_L6:
        try
        {
            Log.i(bb[41]);
            c(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        Log.i((new StringBuilder()).append(bb[42]).append(X).toString());
        h(s1);
        asw.a(new bj(this), new String[] {
            s1, bb[38]
        });
        return;
        s1;
        throw s1;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
    }

    private void a(boolean flag)
    {
        boolean flag1 = true;
        int i1 = App.am;
        App.a(this, N, V);
        X = 0;
        F();
        if (!m)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        Log.i(bb[96]);
        Object obj = com.whatsapp.App.q(this);
        String s1;
        try
        {
            obj.jabber_id = App.b(App.au);
            s1 = ((App.Me) (obj)).jabber_id;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (s1 == null)
        {
            flag1 = false;
        }
        try
        {
            Log.b(flag1);
            if (!App.a(((App.Me) (obj))))
            {
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        App.Z = ((App.Me) (obj));
        flag1 = App.ah.y();
        if (!flag1)
        {
            try
            {
                if (App.ah.i())
                {
                    Log.i(bb[97]);
                    App.ah.u();
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
        }
        try
        {
            com.whatsapp.App.m(getApplication());
            com.whatsapp.App.q();
            MessageService.b(App.au);
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        App.aw();
        App.au.aK();
        App.d(this, 3);
        ChangeNumber.a(this);
        u.removeMessages(1);
        z();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        flag = j;
        if (flag)
        {
            ActivityNotFoundException activitynotfoundexception2;
            try
            {
                e();
            }
            catch (ActivityNotFoundException activitynotfoundexception3)
            {
                throw activitynotfoundexception3;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_269;
            }
        }
        flag = m;
        if (flag)
        {
            App.s();
            o4.N();
            obj = new Intent(this, com/whatsapp/Main);
            try
            {
                startActivity(((Intent) (obj)));
            }
            catch (ActivityNotFoundException activitynotfoundexception4)
            {
                throw activitynotfoundexception4;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_269;
            }
        }
        App.d(this, 2);
        startActivity(new Intent(this, com/whatsapp/RegisterName));
        finish();
        return;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
    }

    static int b(int i1)
    {
        F = i1;
        return i1;
    }

    static long b(VerifySms verifysms, long l1)
    {
        verifysms.af = l1;
        return l1;
    }

    static String b(VerifySms verifysms)
    {
        return verifysms.n();
    }

    private void b()
    {
        if (O == null)
        {
            IntentFilter intentfilter = new IntentFilter(bb[51]);
            intentfilter.setPriority(0x7fffffff);
            registerReceiver(E, intentfilter);
            O = E;
        }
    }

    private void b(long l1)
    {
        try
        {
            if (H != null)
            {
                H.cancel();
                H = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        z.setEnabled(false);
        H = (new o0(this, l1, 1000L)).start();
    }

    static boolean b(VerifySms verifysms, String s1)
    {
        return verifysms.b(s1);
    }

    static boolean b(VerifySms verifysms, boolean flag)
    {
        verifysms.aj = flag;
        return flag;
    }

    private boolean b(String s1)
    {
        int j1 = App.am;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i1;
        int k1;
        try
        {
            i1 = s1.length();
            k1 = w;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 != k1) goto _L2; else goto _L3
_L3:
        i1 = 0;
_L6:
        if (i1 >= s1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = Character.isDigit(s1.charAt(i1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (flag) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        i1++;
        if (j1 == 0) goto _L6; else goto _L5
_L5:
        return true;
    }

    static boolean b(boolean flag)
    {
        C = flag;
        return flag;
    }

    static int c(int i1)
    {
        X = i1;
        return i1;
    }

    static long c(long l1)
    {
        I = l1;
        return l1;
    }

    static long c(VerifySms verifysms, long l1)
    {
        verifysms.P = l1;
        return l1;
    }

    static ProgressBar c(VerifySms verifysms)
    {
        return verifysms.t;
    }

    static String c(VerifySms verifysms, String s1)
    {
        verifysms.V = s1;
        return s1;
    }

    private void c(String s1)
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putString(bb[67], s1);
            editor.putString(bb[69], N);
            editor.putString(bb[70], V);
            if (!editor.commit())
            {
                Log.w(bb[68]);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
    }

    static long d(long l1)
    {
        x = l1;
        return l1;
    }

    static long d(VerifySms verifysms)
    {
        return verifysms.U;
    }

    static void d(VerifySms verifysms, long l1)
    {
        verifysms.b(l1);
    }

    static void d(VerifySms verifysms, String s1)
    {
        verifysms.h(s1);
    }

    private void e(long l1)
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putLong(bb[23], System.currentTimeMillis());
            if (!editor.commit())
            {
                Log.w(bb[24]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void e(VerifySms verifysms)
    {
        verifysms.D();
    }

    static void e(VerifySms verifysms, long l1)
    {
        verifysms.a(l1);
    }

    static int f(VerifySms verifysms)
    {
        return verifysms.t();
    }

    private void f()
    {
        S = true;
        String s1 = iz.a(a(N, V));
        String s2 = getString(0x7f0e0343);
        String s3 = getString(0x7f0e0342);
        ((TextView)findViewById(0x7f0b02b2)).setText(s2);
        ((TextView)findViewById(0x7f0b02b3)).setText(s1);
        ((TextView)findViewById(0x7f0b02b5)).setText(s3);
        z.setVisibility(8);
        findViewById(0x7f0b02ae).setVisibility(0);
        findViewById(0x7f0b02a7).setVisibility(8);
        findViewById(0x7f0b02b0).setVisibility(0);
        findViewById(0x7f0b02b1).setVisibility(8);
        findViewById(0x7f0b02b6).setVisibility(8);
    }

    private void f(long l1)
    {
        long l2;
        if (l1 == 0L)
        {
            l2 = 0L;
        } else
        {
            l2 = System.currentTimeMillis() - l1;
        }
        l2 = I - l2;
        if (B != null)
        {
            l2 = x;
            B.cancel();
            B = null;
        }
        try
        {
            B = (new a_t(this, l2, 1000L)).start();
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        e(System.currentTimeMillis());
    }

    private void g()
    {
        o();
        s = Q;
        ai.setText((new StringBuilder()).append(getString(0x7f0e0468, new Object[] {
            Integer.valueOf(2), Integer.valueOf(2)
        })).append(" ").toString());
        l();
    }

    private void g(int i1)
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putInt(bb[63], i1);
            if (!editor.commit())
            {
                Log.w(bb[64]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void g(VerifySms verifysms)
    {
        verifysms.u();
    }

    static long h(VerifySms verifysms)
    {
        return verifysms.s;
    }

    private void h()
    {
        String s1 = a(N, V);
        ((TextView)findViewById(0x7f0b02a9)).setText(s1);
        z.setVisibility(8);
        findViewById(0x7f0b02ae).setVisibility(8);
        findViewById(0x7f0b02b0).setVisibility(8);
        findViewById(0x7f0b02a7).setVisibility(0);
    }

    private void h(String s1)
    {
        c(s1);
        v();
    }

    private void i()
    {
        if (c())
        {
            registerReceiver(y, new IntentFilter(bb[13]));
            ac = y;
            IntentFilter intentfilter = new IntentFilter(bb[14]);
            intentfilter.addDataScheme(bb[15]);
            intentfilter.addDataAuthority("*", Short.toString(A));
            registerReceiver(K, intentfilter);
            Z = K;
        }
    }

    static void i(VerifySms verifysms)
    {
        verifysms.C();
    }

    static long j()
    {
        return I;
    }

    static void j(VerifySms verifysms)
    {
        verifysms.g();
    }

    private void k()
    {
        try
        {
            if (ac != null)
            {
                unregisterReceiver(ac);
                ac = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            if (Z != null)
            {
                unregisterReceiver(Z);
                Z = null;
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
    }

    static void k(VerifySms verifysms)
    {
        verifysms.y();
    }

    private void l()
    {
        Log.i(bb[65]);
        k();
        M = null;
        App.b(App.au, c(M));
        asw.a(new m9(this), new String[0]);
    }

    static void l(VerifySms verifysms)
    {
        verifysms.z();
    }

    static String m(VerifySms verifysms)
    {
        return verifysms.V;
    }

    private void m()
    {
        e(0L);
    }

    private String n()
    {
label0:
        {
            Object obj = null;
            SharedPreferences sharedpreferences = getPreferences(0);
            String s2 = sharedpreferences.getString(bb[18], null);
            String s3 = sharedpreferences.getString(bb[16], null);
            String s1 = obj;
            boolean flag;
            try
            {
                if (!N.equals(s2))
                {
                    break label0;
                }
                flag = V.equals(s3);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                throw activitynotfoundexception;
            }
            s1 = obj;
            if (flag)
            {
                s1 = sharedpreferences.getString(bb[17], null);
            }
        }
        return s1;
    }

    static void n(VerifySms verifysms)
    {
        verifysms.b();
    }

    static Button o(VerifySms verifysms)
    {
        return verifysms.z;
    }

    private void o()
    {
        try
        {
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static EditText p(VerifySms verifysms)
    {
        return verifysms.ab;
    }

    private void p()
    {
        int i1;
        Object obj = ((ConnectivityManager)getSystemService(bb[7])).getActiveNetworkInfo();
        int j1;
        try
        {
            Log.i((new StringBuilder()).append(bb[10]).append(obj).toString());
            App.F();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj == null)
        {
            i1 = -1;
        } else
        {
            i1 = ((NetworkInfo) (obj)).getType();
        }
        try
        {
            j1 = aa;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Log.i((new StringBuilder()).append(bb[8]).append(aa).append(bb[9]).append(i1).toString());
        aa = i1;
        if (aa == -1) goto _L1; else goto _L3
_L3:
        boolean flag = u.hasMessages(1);
        if (!flag) goto _L1; else goto _L4
_L4:
        Object obj1;
        Log.i(bb[11]);
        u.removeMessages(1);
        v();
        obj1 = n();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = u.obtainMessage(1, obj1);
        u.sendMessage(((android.os.Message) (obj1)));
        if (App.am == 0) goto _L1; else goto _L5
_L5:
        Log.e(bb[12]);
        return;
        ActivityNotFoundException activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
        activitynotfoundexception1;
        throw activitynotfoundexception1;
    }

    private long q()
    {
        return getPreferences(0).getLong(bb[52], 0L);
    }

    static afk q(VerifySms verifysms)
    {
        return verifysms.u;
    }

    static String r()
    {
        return L;
    }

    static void r(VerifySms verifysms)
    {
        verifysms.v();
    }

    static int s()
    {
        return X;
    }

    static void s(VerifySms verifysms)
    {
        verifysms.G();
    }

    private int t()
    {
        double d1 = Math.random();
        int i1 = Y;
        Y = i1 + 1;
        return (int)(d1 * ((Math.pow(2D, i1) - 1.0D) * 4000D));
    }

    static void t(VerifySms verifysms)
    {
        verifysms.F();
    }

    private void u()
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.remove(bb[19]);
            if (!editor.commit())
            {
                Log.w(bb[20]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void u(VerifySms verifysms)
    {
        verifysms.K();
    }

    static long v(VerifySms verifysms)
    {
        return verifysms.P;
    }

    private void v()
    {
        Y = 0;
    }

    static TextView w(VerifySms verifysms)
    {
        return verifysms.T;
    }

    private void w()
    {
        try
        {
            o();
            X = 13;
            F();
            m();
            if ("".equals(k))
            {
                g(bb[34]);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        G();
    }

    static int x()
    {
        return v;
    }

    static void x(VerifySms verifysms)
    {
        verifysms.w();
    }

    static long y(VerifySms verifysms)
    {
        return verifysms.af;
    }

    private void y()
    {
        f(0L);
    }

    private void z()
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.remove(bb[33]);
            editor.remove(bb[32]);
            editor.remove(bb[30]);
            if (!editor.commit())
            {
                Log.w(bb[31]);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
    }

    static void z(VerifySms verifysms)
    {
        verifysms.J();
    }

    protected void a(ServiceState servicestate)
    {
        int i1;
        boolean flag;
        try
        {
            servicestate = findViewById(0x7f0b02a8);
            flag = n;
        }
        // Misplaced declaration of an exception variable
        catch (ServiceState servicestate)
        {
            throw servicestate;
        }
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        servicestate.setVisibility(i1);
    }

    public void onBackPressed()
    {
    }

    public void onCreate(Bundle bundle)
    {
        int i1;
        int j1;
        i1 = 0;
        j1 = App.am;
        Log.i(bb[89]);
        super.onCreate(bundle);
        de.greenrobot.event.g.a().c(this);
        setContentView(0x7f0300ab);
        bundle = getIntent();
        if (!bb[88].equals(bundle.getScheme())) goto _L2; else goto _L1
_L1:
        if (App.f(this) != 1) goto _L4; else goto _L3
_L3:
        bundle = new Intent(this, com/whatsapp/RegisterPhone);
        bundle.putExtra(bb[86], true);
        startActivity(bundle);
        finish();
_L7:
        return;
_L4:
        try
        {
            D = a(bundle);
            Log.i((new StringBuilder()).append(bb[81]).append(D).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (j1 == 0) goto _L5; else goto _L2
_L2:
        D = null;
_L5:
        int k1 = App.f(this);
        if (k1 != 4)
        {
            Log.e((new StringBuilder()).append(bb[87]).append(k1).toString());
            startActivity(new Intent(this, com/whatsapp/Main));
            finish();
            return;
        }
        boolean flag;
        try
        {
            S = false;
            I();
            bundle = getIntent().getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        flag = getIntent().getBooleanExtra(bb[91], n);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        if (!n)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        Log.i(bb[90]);
        findViewById(0x7f0b02a8).setVisibility(0);
        try
        {
            if (getIntent().getBooleanExtra(bb[92], false))
            {
                m = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (getIntent().getBooleanExtra(bb[82], false))
            {
                Log.i(bb[93]);
                X = 5;
                F();
                setIntent(new Intent(this, com/whatsapp/VerifySms));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle = getSharedPreferences(bb[83], 0);
        try
        {
            N = bundle.getString(bb[95], null);
            V = bundle.getString(bb[85], null);
            bundle = N;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        if (V != null)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        Log.w(bb[79]);
        D();
        return;
label0:
        {
            int l1;
            try
            {
                if (!c())
                {
                    break label0;
                }
                l1 = L.length();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (l1 == 0)
            {
                bundle = bb[94];
                int i2 = bundle.length();
                Random random = new Random();
                do
                {
                    if (i1 >= 32)
                    {
                        break;
                    }
                    L = (new StringBuilder()).append(L).append(bundle.charAt(random.nextInt(i2))).toString();
                    R = (new StringBuilder()).append(R).append(bundle.charAt(random.nextInt(i2))).toString();
                    i1++;
                } while (j1 == 0);
            }
        }
        App.z.listen(l, 1535);
        t = (ProgressBar)findViewById(0x7f0b0088);
        ai = (TextView)findViewById(0x7f0b02ab);
        T = (TextView)findViewById(0x7f0b02ac);
        ab = (EditText)findViewById(0x7f0b02b8);
        ab.addTextChangedListener(new akb(this));
        ab.setText("");
        z = (Button)findViewById(0x7f0b0284);
        z.setOnClickListener(new a9i(this));
        ah = findViewById(0x7f0b02aa);
        W = findViewById(0x7f0b02b4);
        bundle = new a1j(this);
        ah.setOnClickListener(bundle);
        W.setOnClickListener(bundle);
        ((ImageView)findViewById(0x7f0b02bb)).setImageDrawable(new m(getResources().getDrawable(0x7f02061f)));
        h();
        i();
        p();
        bundle = n();
        if (bundle != null)
        {
            try
            {
                Log.i((new StringBuilder()).append(bb[84]).append(bundle).toString());
                asw.a(new bj(this), new String[] {
                    bundle, bb[80]
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected Dialog onCreateDialog(int i1)
    {
        i1;
        JVM INSTR lookupswitch 19: default 164
    //                   4: 315
    //                   7: 172
    //                   9: 353
    //                   21: 215
    //                   23: 297
    //                   24: 390
    //                   25: 427
    //                   26: 464
    //                   27: 464
    //                   28: 464
    //                   29: 512
    //                   30: 512
    //                   31: 631
    //                   32: 750
    //                   33: 867
    //                   34: 265
    //                   35: 564
    //                   36: 683
    //                   500: 916;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L9 _L9 _L10 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        Object obj = super.onCreateDialog(i1);
_L19:
        return ((Dialog) (obj));
_L3:
        try
        {
            obj = (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(0x7f0e0337).setNeutralButton(0x7f0e02ba, new a85(this)).create();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((Dialog) (obj));
_L5:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0317, new Object[] {
            getString(0x7f0e00c6)
        })).setNeutralButton(0x7f0e02ba, new nl(this)).create();
_L14:
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0344).setNeutralButton(0x7f0e02ba, new wb(this)).create();
_L6:
        X = 0;
        F();
        App.d(this, 1);
        return all.b(this);
_L2:
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e0033).setMessage(0x7f0e0331).setNeutralButton(0x7f0e02ba, new xz(this)).create();
_L4:
        obj = new ProgressDialog(this);
        ((ProgressDialog) (obj)).setMessage(getString(0x7f0e031a));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(false);
        ad = ((ProgressDialog) (obj));
        return ((Dialog) (obj));
_L7:
        obj = new ProgressDialog(this);
        ((ProgressDialog) (obj)).setMessage(getString(0x7f0e0352));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(false);
        ad = ((ProgressDialog) (obj));
        return ((Dialog) (obj));
_L8:
        obj = new ProgressDialog(this);
        ((ProgressDialog) (obj)).setMessage(getString(0x7f0e0351));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(false);
        ad = ((ProgressDialog) (obj));
        return ((Dialog) (obj));
_L9:
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0340).setPositiveButton(0x7f0e031b, new km(this, i1)).setNeutralButton(0x7f0e007b, new v3(this, i1)).create();
_L10:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e032d)).setPositiveButton(0x7f0e031b, new a3t(this, i1)).setNeutralButton(0x7f0e007b, new bl(this, i1)).create();
_L15:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0350, new Object[] {
            com.whatsapp.util.q.i(this, U)
        })).setPositiveButton(0x7f0e0321, new z6(this, i1)).setNeutralButton(0x7f0e007b, new af5(this, i1)).create();
_L11:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0346)).setPositiveButton(0x7f0e031b, new ad2(this, i1)).setNeutralButton(0x7f0e007b, new hg(this, i1)).create();
_L16:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0347, new Object[] {
            com.whatsapp.util.q.i(this, U)
        })).setPositiveButton(0x7f0e0321, new il(this, i1)).setNeutralButton(0x7f0e007b, new ye(this, i1)).create();
_L12:
        obj = new EditText(this);
        android.text.InputFilter.LengthFilter lengthfilter = new android.text.InputFilter.LengthFilter(w);
        ((EditText) (obj)).setInputType(2);
        ((EditText) (obj)).setFilters(new InputFilter[] {
            lengthfilter
        });
        ((EditText) (obj)).setGravity(17);
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e034b).setMessage(getString(0x7f0e034a, new Object[] {
            Integer.valueOf(w)
        })).setView(((View) (obj))).setPositiveButton(0x7f0e02ba, new alg(this, ((EditText) (obj)))).setNegativeButton(0x7f0e007b, new uf(this)).create();
_L13:
        return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0345, new Object[] {
            Integer.valueOf(w)
        })).setNeutralButton(0x7f0e02ba, new _z(this)).create();
_L17:
        Dialog dialog;
        dialog = super.onCreateDialog(i1);
        obj = dialog;
        if (dialog == null) goto _L19; else goto _L18
_L18:
        obj = dialog;
        if (!aj) goto _L19; else goto _L20
_L20:
        dialog.setCancelable(false);
        dialog.setOnDismissListener(new asr(this));
        return dialog;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        throw activitynotfoundexception;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, 0x7f0e031b).setIcon(0x7f020542);
        if (App.l == 3)
        {
            menu.add(0, 2, 0, bb[0]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        try
        {
            Log.i(bb[44]);
            App.z.listen(l, 0);
            J = true;
            L();
            if (B != null)
            {
                B.cancel();
                B = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        try
        {
            if (ag != null)
            {
                ag.cancel();
                ag = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception1)
        {
            throw activitynotfoundexception1;
        }
        try
        {
            if (H != null)
            {
                H.cancel();
                H = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception2)
        {
            throw activitynotfoundexception2;
        }
        de.greenrobot.event.g.a().e(this);
        super.onDestroy();
    }

    public void onEvent(au au)
    {
        p();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        int j1 = App.u;
        if (j1 == 3 && i1 == 84)
        {
            try
            {
                a5.a(this, false);
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
        keyevent;
        throw keyevent;
    }

    protected void onNewIntent(Intent intent)
    {
        String s1;
        int i1;
        i1 = App.am;
        Log.i(bb[27]);
        super.onNewIntent(intent);
        s1 = a(intent);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = G;
        if (!flag) goto _L4; else goto _L3
_L3:
        try
        {
            a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        Log.i((new StringBuilder()).append(bb[26]).append(s1).toString());
        D = s1;
        return;
        intent;
        throw intent;
_L2:
        int j1 = intent.getIntExtra(bb[29], 0);
        j1;
        JVM INSTR lookupswitch 4: default 144
    //                   4: 185
    //                   7: 175
    //                   21: 194
    //                   23: 204;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        try
        {
            Log.i((new StringBuilder()).append(bb[28]).append(j1).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
_L8:
        showDialog(7);
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        showDialog(4);
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L9:
        showDialog(21);
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        showDialog(23);
        if (i1 == 0) goto _L5; else goto _L6
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
_L5:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 0 2: default 59
    //                   0 32
    //                   1 41
    //                   2 49;
           goto _L1 _L2 _L3 _L4
_L2:
        E();
        return true;
        menuitem;
        throw menuitem;
_L3:
        showDialog(32);
        return true;
_L4:
        com.whatsapp.App.g(this);
        finish();
        return true;
_L1:
        return false;
    }

    public void onPause()
    {
        super.onPause();
        Log.i((new StringBuilder()).append(bb[54]).append(X).toString());
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        try
        {
            editor.putInt(bb[56], X);
            if (!editor.commit())
            {
                Log.w(bb[55]);
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            throw activitynotfoundexception;
        }
        App.b(App.au, c(M));
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
label0:
        {
            MenuItem menuitem;
            try
            {
                if (!C)
                {
                    break label0;
                }
                menuitem = menu.findItem(1);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            if (menuitem == null)
            {
                menu.add(0, 1, 0, 0x7f0e046d).setIcon(0x7f02058f);
            }
        }
        return true;
    }

    public void onResume()
    {
        int i1;
        i1 = App.am;
        super.onResume();
        Object obj = getPreferences(0);
        try
        {
            X = ((SharedPreferences) (obj)).getInt(bb[77], 0);
            M = a(App.i(App.au));
            F = App.w(this);
            w = App.d(this);
            obj = N;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            try
            {
                throw activitynotfoundexception;
            }
            catch (ActivityNotFoundException activitynotfoundexception1)
            {
                throw activitynotfoundexception1;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (V != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        Log.w(bb[76]);
        D();
        return;
        boolean flag;
        App.d(this, 4);
        flag = g();
        ActivityNotFoundException activitynotfoundexception2;
        int j1;
        if (!flag)
        {
            try
            {
                if (X == 0)
                {
                    Log.i(bb[75]);
                    X = 3;
                    F();
                }
            }
            catch (ActivityNotFoundException activitynotfoundexception3)
            {
                throw activitynotfoundexception3;
            }
        }
        CountDownTimer countdowntimer;
        long l1;
        long l2;
        long l3;
        try
        {
            Log.i((new StringBuilder()).append(bb[74]).append(X).toString());
            j1 = X;
        }
        catch (ActivityNotFoundException activitynotfoundexception4)
        {
            try
            {
                throw activitynotfoundexception4;
            }
            catch (ActivityNotFoundException activitynotfoundexception5)
            {
                throw activitynotfoundexception5;
            }
        }
        j1;
        JVM INSTR tableswitch 0 13: default 236
    //                   0 328
    //                   1 314
    //                   2 348
    //                   3 340
    //                   4 495
    //                   5 328
    //                   6 486
    //                   7 476
    //                   8 505
    //                   9 236
    //                   10 340
    //                   11 340
    //                   12 515
    //                   13 340;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L2 _L7 _L8 _L9 _L1 _L5 _L5 _L10 _L5
_L1:
        ActivityNotFoundException activitynotfoundexception11;
        try
        {
            Log.w(bb[72]);
        }
        catch (ActivityNotFoundException activitynotfoundexception12)
        {
            throw activitynotfoundexception12;
        }
_L12:
        try
        {
            NotificationManagerCompat.from(this).cancel(1);
            if (D != null)
            {
                Log.i((new StringBuilder()).append(bb[78]).append(D).toString());
                a(D);
                D = null;
            }
        }
        catch (ActivityNotFoundException activitynotfoundexception13)
        {
            throw activitynotfoundexception13;
        }
        G = true;
        return;
        activitynotfoundexception2;
        throw activitynotfoundexception2;
_L3:
        if (B != null) goto _L12; else goto _L11
_L11:
        X = 5;
        F();
_L2:
        h();
        a();
        if (i1 == 0) goto _L12; else goto _L5
_L5:
        try
        {
            G();
        }
        catch (ActivityNotFoundException activitynotfoundexception7)
        {
            throw activitynotfoundexception7;
        }
        if (i1 == 0) goto _L12; else goto _L4
_L4:
        countdowntimer = B;
        if (countdowntimer != null) goto _L12; else goto _L13
_L13:
        l1 = q();
        l2 = System.currentTimeMillis();
        j1 = H();
        if (j1 > 0)
        {
            ActivityNotFoundException activitynotfoundexception6;
            try
            {
                I = Math.min(Q, (long)j1 * 1000L);
            }
            catch (ActivityNotFoundException activitynotfoundexception8)
            {
                throw activitynotfoundexception8;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_403;
            }
        }
        I = Q;
        af = I;
        l3 = I;
        if (l3 - (l2 - l1) >= 3000L)
        {
            ActivityNotFoundException activitynotfoundexception9;
            try
            {
                Log.i(bb[71]);
                ai.setText("");
                f(l1);
            }
            catch (ActivityNotFoundException activitynotfoundexception10)
            {
                throw activitynotfoundexception10;
            }
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        Log.i(bb[73]);
        w();
        if (i1 == 0) goto _L12; else goto _L8
_L8:
        showDialog(7);
        if (i1 == 0) goto _L12; else goto _L7
_L7:
        showDialog(4);
        if (i1 == 0) goto _L12; else goto _L6
_L6:
        showDialog(21);
        if (i1 == 0) goto _L12; else goto _L9
_L9:
        showDialog(23);
        if (i1 == 0) goto _L12; else goto _L10
_L10:
        f();
        if (i1 == 0) goto _L12; else goto _L1
        activitynotfoundexception6;
        throw activitynotfoundexception6;
        activitynotfoundexception9;
        throw activitynotfoundexception9;
        activitynotfoundexception11;
        throw activitynotfoundexception11;
        activitynotfoundexception11;
        throw activitynotfoundexception11;
        activitynotfoundexception11;
        throw activitynotfoundexception11;
        activitynotfoundexception11;
        throw activitynotfoundexception11;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j1;
        as = new String[101];
        obj = "H*\025m\005";
        byte0 = -1;
        j1 = 0;
_L2:
        String as1[];
        int k1;
        int l1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        k1 = 0;
_L8:
label0:
        {
            if (l1 > k1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j1] = ((String) (obj));
                j1 = 1;
                obj = "{!\002z\036s+";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j1] = ((String) (obj));
                j1 = 2;
                obj = "{!\002z\036s+Ha\037n*\b|_{,\022a\036ta0A4M";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j1] = ((String) (obj));
                obj = "r;\022x\002 `I\177\006ma\021`\020n<\007x\0014,\te^|.\027'\035s!\r'\007\177=\017n\030y.\022a\036ta\026`\001";
                byte0 = 2;
                j1 = 3;
                break;

            case 2: // '\002'
                as1[j1] = ((String) (obj));
                j1 = 4;
                obj = "j#\007|\027u=\0135";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j1] = ((String) (obj));
                j1 = 5;
                obj = "v([";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j1] = ((String) (obj));
                obj = "v,[";
                byte0 = 5;
                j1 = 6;
                break;

            case 5: // '\005'
                as1[j1] = ((String) (obj));
                j1 = 7;
                obj = "y \bf\024y;\017~\030n6";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j1] = ((String) (obj));
                obj = "l*\024a\027c<\013{^t*\022\177\036h$I{\006s;\005`Qu#\0025";
                byte0 = 7;
                j1 = 8;
                break;

            case 7: // '\007'
                as1[j1] = ((String) (obj));
                j1 = 9;
                obj = ":!\003\177L";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j1] = ((String) (obj));
                j1 = 10;
                obj = "l*\024a\027c<\013{^t*\022\177\036h$Ii\022n&\020mQ";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j1] = ((String) (obj));
                j1 = 11;
                obj = "l*\024a\027c<\013{^t*\022\177\036h$I{\006s;\005`^r.\025%\003\177;\024q\\j*\bl\030t(";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j1] = ((String) (obj));
                j1 = 12;
                obj = "l*\024a\027c<\013{^t*\022\177\036h$I{\006s;\005`^t K{\020l*\002%\022u+\003";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j1] = ((String) (obj));
                j1 = 13;
                obj = "y \013&\006r.\022{\020j?H[<I\0205M?N";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j1] = ((String) (obj));
                j1 = 14;
                obj = "{!\002z\036s+Ha\037n*\b|_{,\022a\036ta\"I%[\0205E\"E\035#K4S\031#L";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j1] = ((String) (obj));
                j1 = 15;
                obj = "i\"\025";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[j1] = ((String) (obj));
                j1 = 16;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\026`\036t*9f\004w-\003z";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[j1] = ((String) (obj));
                j1 = 17;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\005g\025\177";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[j1] = ((String) (obj));
                j1 = 18;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\005k";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[j1] = ((String) (obj));
                j1 = 19;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\024m\005h69i\027n*\024";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[j1] = ((String) (obj));
                j1 = 20;
                obj = "l*\024a\027c<\013{^y#\003i\003i.\020m\003\177;\024q\020|;\003z^y \013e\030no\000i\030v*\002";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[j1] = ((String) (obj));
                j1 = 21;
                obj = "l*\024a\027c<\013{^y \002m\027h \013~\024h&\000a\022{;\017g\037v&\bc^y \002m^";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[j1] = ((String) (obj));
                j1 = 22;
                obj = "m'\007|\002{?\026";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[j1] = ((String) (obj));
                j1 = 23;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\025|\020h;9|\030w*";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[j1] = ((String) (obj));
                j1 = 24;
                obj = "l*\024a\027c<\013{^y \023f\005~ \021f\005s\"\003z^y \013e\030no\000i\030v*\002";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[j1] = ((String) (obj));
                j1 = 25;
                obj = "l*\024a\027cb\020g\030y*R";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[j1] = ((String) (obj));
                j1 = 26;
                obj = "l*\024a\027c<\013{^s!\022m\037n`\002m\027\177=Kk\036~*I";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[j1] = ((String) (obj));
                j1 = 27;
                obj = "l*\024a\027c<\013{^s!\022m\037n";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[j1] = ((String) (obj));
                j1 = 28;
                obj = "l*\024a\027c<\013{^s!\022m\037n`\023f\032t \021fQ";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[j1] = ((String) (obj));
                j1 = 29;
                obj = "y \013&\006r.\022{\020j?H~\024h&\000q\037o\"\004m\0034+\017i\035u(";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[j1] = ((String) (obj));
                j1 = 30;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\026`\036t*9f\004w-\003z";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[j1] = ((String) (obj));
                j1 = 31;
                obj = "l*\024a\027c<\013{^i.\020m\025y \002m^y#\003i\0035,\te\034s;Fn\020s#\003l";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[j1] = ((String) (obj));
                j1 = 32;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\005k";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[j1] = ((String) (obj));
                j1 = 33;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\005g\025\177";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[j1] = ((String) (obj));
                j1 = 34;
                obj = "i*\024~\024hb\025m\037~b\022a\034\177 \023|";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[j1] = ((String) (obj));
                j1 = 35;
                obj = "l*\024a\027cb\020g\030y*";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[j1] = ((String) (obj));
                j1 = 36;
                obj = "l*\024a\027c9\ta\022\177`\023f\032t \021f\\i;\007|\024:";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[j1] = ((String) (obj));
                j1 = 37;
                obj = "l*\024a\027cb\020g\030y*";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[j1] = ((String) (obj));
                j1 = 38;
                obj = "n.\026x\024~";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[j1] = ((String) (obj));
                j1 = 39;
                obj = "n.\026x\024~";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[j1] = ((String) (obj));
                j1 = 40;
                obj = "l*\024a\027c<\013{^l*\024a\027s,\007|\030u!\na\037q`\020g\030y*I{\005{;\003(";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[j1] = ((String) (obj));
                j1 = 41;
                obj = "l*\024a\027c<\013{^l*\024a\027s,\007|\030u!\na\037q`\020g\030y*Ik\036~*Km\037n=\037%\023v \005c\024~b\024m\005h6Kd\020n*\024";
                byte0 = 40;
                break;

            case 40: // '('
                as1[j1] = ((String) (obj));
                j1 = 42;
                obj = "l*\024a\027c<\013{^l*\024a\027s,\007|\030u!\na\037q`\025m\035|`\025|\020n*F";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[j1] = ((String) (obj));
                j1 = 43;
                obj = "l*\024a\027c<\013{^l*\024a\027s,\007|\030u!\na\037q`\025e\0025<\022i\005\177o";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[j1] = ((String) (obj));
                j1 = 44;
                obj = "l*\024a\027c<\013{^~*\025|\003u6";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[j1] = ((String) (obj));
                j1 = 45;
                obj = "i*\nn\\i*\bl\\i*\bl\\|.\017d\004h*";
                byte0 = 44;
                break;

            case 44: // ','
                as1[j1] = ((String) (obj));
                j1 = 46;
                obj = "l*\024a\027c<\013{^y'\007d\035\177!\001m^|.\017d\024~b\001g\\n Kf\024b;";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[j1] = ((String) (obj));
                j1 = 47;
                obj = "y \013&\006r.\022{\020j?H[<I\0205M?N";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[j1] = ((String) (obj));
                j1 = 48;
                obj = "l*\024a\027c<\013{^y'\007d\035\177!\001m^i*\b|Q";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[j1] = ((String) (obj));
                j1 = 49;
                obj = "l*\024a\027cb\025e\002";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[j1] = ((String) (obj));
                j1 = 50;
                obj = "y \013&\006r.\022{\020j?HZ\024}&\025|\024h\037\016g\037\177a\005d\024{=9x\031u!\003W\037o\"\004m\003";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[j1] = ((String) (obj));
                j1 = 51;
                obj = "{!\002z\036s+Hx\003u9\017l\024ha2m\035\177?\016g\037ca5E\"E\035#K4S\031#L";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[j1] = ((String) (obj));
                j1 = 52;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\025|\020h;9|\030w*";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[j1] = ((String) (obj));
                j1 = 53;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\024m\005h69i\027n*\024";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[j1] = ((String) (obj));
                j1 = 54;
                obj = "l*\024a\027c<\013{^j.\023{\024:";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[j1] = ((String) (obj));
                j1 = 55;
                obj = "l*\024a\027c<\013{^j.\023{\0245,\te\034s;Fn\020s#\003l";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[j1] = ((String) (obj));
                j1 = 56;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H~\024h&\000a\022{;\017g\037E<\022i\005\177";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[j1] = ((String) (obj));
                j1 = 57;
                obj = "M'\007|\002[?\026(";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[j1] = ((String) (obj));
                j1 = 58;
                obj = "l*\024a\027c<\013{^t:\013j\024h`\017f\\m=\tf\0267<\022i\005\177o\004g\004t,\003(\005uo\024m\026j'\tf\024";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[j1] = ((String) (obj));
                j1 = 59;
                obj = "l*\024a\027c<\013{^i*\bl^";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[j1] = ((String) (obj));
                j1 = 60;
                obj = ":\030\016i\005i\016\026xQs!\022m\003t.\n(\004i*F%Qi.\000mQn Fl\030i,\007z\025";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[j1] = ((String) (obj));
                j1 = 61;
                obj = "s!\026}\005E\"\003|\031u+";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[j1] = ((String) (obj));
                j1 = 62;
                obj = "l*\024a\027c<\013{^o!\rf\036m!K{\005{;\003(";
                byte0 = 61;
                break;

            case 61: // '='
                as1[j1] = ((String) (obj));
                j1 = 63;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\024m\005h69i\027n*\024";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[j1] = ((String) (obj));
                j1 = 64;
                obj = "l*\024a\027c<\013{^i.\020m\003\177;\024q\020|;\003z^y \013e\030no\000i\030v*\002";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[j1] = ((String) (obj));
                j1 = 65;
                obj = "l*\024a\027c<\013{^h*\027}\024i;K{\034i";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[j1] = ((String) (obj));
                j1 = 66;
                obj = "l*\024a\027cb\025e\002";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[j1] = ((String) (obj));
                j1 = 67;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\005g\025\177";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[j1] = ((String) (obj));
                j1 = 68;
                obj = "l*\024a\027c<\013{^i.\020m\025y \002m^i.\020m^y \013e\030no\000i\030v*\002";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[j1] = ((String) (obj));
                j1 = 69;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\005k";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[j1] = ((String) (obj));
                j1 = 70;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\034i\020\026`\036t*9f\004w-\003z";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[j1] = ((String) (obj));
                j1 = 71;
                obj = "l*\024a\027c<\013{^h*\025}\034\177`\021i\030n&\bo^i*\024~\024h`\024m\002o\"\003";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[j1] = ((String) (obj));
                j1 = 72;
                obj = "l*\024a\027c<\013{^h*\025}\034\177`\023f\032t \021f\\i;\007|\024";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[j1] = ((String) (obj));
                j1 = 73;
                obj = "l*\024a\027c<\013{^h*\025}\034\177`\021i\030n&\bo^i*\024~\024h`\022a\034\177+Kg\004nb\007d\003\177.\002q";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[j1] = ((String) (obj));
                j1 = 74;
                obj = "l*\024a\027c<\013{^h*\025}\034\177o";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[j1] = ((String) (obj));
                j1 = 75;
                obj = "l*\024a\027c<\013{^y.\bf\036nb\025e\0027(\t%\007u&\005m";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[j1] = ((String) (obj));
                j1 = 76;
                obj = "l*\024a\027c<\013{^h*\025}\034\177`\005kQu=Ff\004wo\017{Qw&\025{\030t(J(\023u:\bk\024:;\t(\003\177(\026`\036t*";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[j1] = ((String) (obj));
                j1 = 77;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H~\024h&\000a\022{;\017g\037E<\022i\005\177";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[j1] = ((String) (obj));
                j1 = 78;
                obj = "l*\024a\027c<\013{^h*\025}\034\177`\025k\031\177\"\003'\022u+\003(";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[j1] = ((String) (obj));
                j1 = 79;
                obj = "l*\024a\027c<\013{^y=\003i\005\177`\005kQu=Ff\004wo\017{Qw&\025{\030t(J(\023u:\bk\024:;\t(\003\177(\026`\036t*";
                byte0 = 78;
                break;

            case 78: // 'N'
                as1[j1] = ((String) (obj));
                j1 = 80;
                obj = "h*\022z\030\177+";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[j1] = ((String) (obj));
                j1 = 81;
                obj = "l*\024a\027c<\013{^y=\003i\005\177`\005g\025\177o";
                byte0 = 80;
                break;

            case 80: // 'P'
                as1[j1] = ((String) (obj));
                j1 = 82;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H{\024h9\003z\002\177!\002";
                byte0 = 81;
                break;

            case 81: // 'Q'
                as1[j1] = ((String) (obj));
                j1 = 83;
                obj = "y \013&\006r.\022{\020j?9x\003\177)\003z\024t,\003{";
                byte0 = 82;
                break;

            case 82: // 'R'
                as1[j1] = ((String) (obj));
                j1 = 84;
                obj = "l*\024a\027c<\013{^y=\003i\005\177`\025i\007\177+\005g\025\177o";
                byte0 = 83;
                break;

            case 83: // 'S'
                as1[j1] = ((String) (obj));
                j1 = 85;
                obj = "j'";
                byte0 = 84;
                break;

            case 84: // 'T'
                as1[j1] = ((String) (obj));
                j1 = 86;
                obj = "y \013&\006r.\022{\020j?HZ\024}&\025|\024h\037\016g\037\177a\022i\001j*\002W\002w<9d\030t$";
                byte0 = 85;
                break;

            case 85: // 'U'
                as1[j1] = ((String) (obj));
                j1 = 87;
                obj = "l*\024a\027c<\013{^m=\tf\0267<\022i\005\177o\004g\004t,\003(\005uo\013i\030to";
                byte0 = 86;
                break;

            case 86: // 'V'
                as1[j1] = ((String) (obj));
                j1 = 88;
                obj = "m'\007|\002{?\026";
                byte0 = 87;
                break;

            case 87: // 'W'
                as1[j1] = ((String) (obj));
                j1 = 89;
                obj = "l*\024a\027c<\013{^y=\003i\005\177";
                byte0 = 88;
                break;

            case 88: // 'X'
                as1[j1] = ((String) (obj));
                j1 = 90;
                obj = "l*\024a\027c<\013{^y=\003i\005\177`\002a\002j#\007q\\h \007e\030t(";
                byte0 = 89;
                break;

            case 89: // 'Y'
                as1[j1] = ((String) (obj));
                j1 = 91;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<Hz\036{\"\017f\026";
                byte0 = 90;
                break;

            case 90: // 'Z'
                as1[j1] = ((String) (obj));
                j1 = 92;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<Hk\031{!\001m\037o\"\004m\003";
                byte0 = 91;
                break;

            case 91: // '['
                as1[j1] = ((String) (obj));
                j1 = 93;
                obj = "l*\024a\027c<\013{^y=\003i\005\177`\025{\024t+";
                byte0 = 92;
                break;

            case 92: // '\\'
                as1[j1] = ((String) (obj));
                j1 = 94;
                obj = "*~T;E/yQ0H{-\005l\024|(\016a\033q#\013f\036j>\024{\005o9\021p\b`\016$K5_\t!@8P\004*E?U\0377Z\"N\0320_)C\025";
                byte0 = 93;
                break;

            case 93: // ']'
                as1[j1] = ((String) (obj));
                j1 = 95;
                obj = "y,";
                byte0 = 94;
                break;

            case 94: // '^'
                as1[j1] = ((String) (obj));
                j1 = 96;
                obj = "l*\024a\027c<\013{^l*\024a\027s*\002'\022r.\bo\024t:\013j\024h";
                byte0 = 95;
                break;

            case 95: // '_'
                as1[j1] = ((String) (obj));
                j1 = 97;
                obj = "l*\024a\027c<\013{^l*\024a\027s*\002'\022r.\bo\024t:\013j\024h`\013{\026i;\tz\024~-I`\024{#\022`\b";
                byte0 = 96;
                break;

            case 96: // '`'
                as1[j1] = ((String) (obj));
                j1 = 98;
                obj = "-|R8E";
                byte0 = 97;
                break;

            case 97: // 'a'
                as1[j1] = ((String) (obj));
                j1 = 99;
                obj = "l*\024a\027c<\013{^i.\020m\002n.\022m^y \013e\030no\000i\030v*\002";
                byte0 = 98;
                break;

            case 98: // 'b'
                as1[j1] = ((String) (obj));
                j1 = 100;
                obj = "y \013&\006r.\022{\020j?H^\024h&\000q\"w<H~\024h&\000a\022{;\017g\037E<\022i\005\177";
                byte0 = 99;
                break;

            case 99: // 'c'
                as1[j1] = ((String) (obj));
                bb = as;
                int i1;
                byte byte1;
                char c1;
                try
                {
                    i1 = App.l;
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    throw activitynotfoundexception;
                }
                if (i1 == 3)
                {
                    i1 = 20000;
                } else
                {
                    i1 = 0x493e0;
                }
                Q = i1;
                v = 10;
                X = 0;
                w = 6;
                F = 6;
                B = null;
                I = Q;
                x = 0L;
                ac = null;
                Z = null;
                ae = null;
                L = "";
                R = "";
                M = null;
                C = false;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        c1 = obj[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 2388
    //                   0 2411
    //                   1 2418
    //                   2 2425
    //                   3 2432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2432;
_L3:
        byte1 = 113;
_L9:
        obj[k1] = (char)(byte1 ^ c1);
        k1++;
          goto _L8
_L4:
        byte1 = 26;
          goto _L9
_L5:
        byte1 = 79;
          goto _L9
_L6:
        byte1 = 102;
          goto _L9
        byte1 = 8;
          goto _L9
    }

    private class _cls1 extends BroadcastReceiver
    {

        private static final String z[];
        final VerifySms a;

        public void onReceive(Context context, Intent intent)
        {
            int i1;
            i1 = App.am;
            Log.i(z[13]);
            if (a.J) goto _L2; else goto _L1
_L1:
            int j1;
            j1 = getResultCode();
            Log.i((new StringBuilder()).append(z[6]).append(j1).toString());
            if (j1 == -1) goto _L4; else goto _L3
_L3:
            int k1;
            k1 = intent.getIntExtra(z[11], 0);
            Log.i((new StringBuilder()).append(z[0]).append(k1).toString());
            VerifySms.B(a);
            j1;
            JVM INSTR tableswitch 2 4: default 136
        //                       2 238
        //                       3 136
        //                       4 206;
               goto _L5 _L6 _L5 _L7
_L5:
            k1;
            JVM INSTR lookupswitch 2: default 164
        //                       16: 276
        //                       98: 307;
               goto _L8 _L9 _L10
_L8:
            Log.w(z[2]);
            a.g(z[12]);
            VerifySms.j(a);
_L4:
            if (i1 == 0) goto _L11; else goto _L2
_L2:
            Log.i(z[9]);
_L11:
            return;
_L7:
            Log.i(z[10]);
            a.g(z[4]);
            VerifySms.j(a);
            if (i1 == 0) goto _L4; else goto _L6
_L6:
            Log.i(z[8]);
            VerifySms.c(7);
            VerifySms.t(a);
            a.e(7);
            if (i1 == 0) goto _L4; else goto _L5
_L9:
            Log.i(z[3]);
            a.g(z[1]);
            VerifySms.j(a);
            if (i1 == 0) goto _L4; else goto _L10
_L10:
            if (!VerifySms.B().startsWith(z[5]) || VerifySms.B().startsWith(z[14]))
            {
                break; /* Loop/switch isn't completed */
            }
            Log.i(z[7]);
            VerifySms.c(6);
            VerifySms.t(a);
            a.e(4);
            if (i1 == 0) goto _L4; else goto _L8
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i1;
            as = new String[15];
            obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\034P|G\001Y";
            byte0 = -1;
            i1 = 0;
_L2:
            String as1[];
            int j1;
            int k1;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k1 = obj.length;
            j1 = 0;
_L8:
label0:
            {
                if (k1 > j1)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i1] = ((String) (obj));
                    obj = "QkD\025TQkF\027TM{\\^\026D#K\001\034Fg\\\0";
                    i1 = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    obj = "TkZ\032\037[}E\000VW`[\026\027V";
                    i1 = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i1] = ((String) (obj));
                    obj = "TkZ\032\037[}E\000VM{\\^\026D#K\001\034Fg\\\0";
                    i1 = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i1] = ((String) (obj));
                    obj = "QkD\025TQkF\027TM{\\^\026D#[\026\013TgK\026";
                    i1 = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i1] = ((String) (obj));
                    i1 = 5;
                    obj = "\t;\032";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i1] = ((String) (obj));
                    i1 = 6;
                    obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\013G}]\037\r\002";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i1] = ((String) (obj));
                    i1 = 7;
                    obj = "TkZ\032\037[}E\000VOkP\032\032M";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i1] = ((String) (obj));
                    i1 = 8;
                    obj = "TkZ\032\037[}E\000VPoL\032\026\017aN\025";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i1] = ((String) (obj));
                    i1 = 9;
                    obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\035G}\\\001\026[kL";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i1] = ((String) (obj));
                    i1 = 10;
                    obj = "TkZ\032\037[}E\000VM{\\^\026D#[\026\013TgK\026";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i1] = ((String) (obj));
                    i1 = 11;
                    obj = "G|Z\034\013aaL\026";
                    byte0 = 10;
                    break;

                case 10: // '\n'
                    as1[i1] = ((String) (obj));
                    i1 = 12;
                    obj = "QkD\025TQkF\027TQkF\027TDoA\037\fPk";
                    byte0 = 11;
                    break;

                case 11: // '\013'
                    as1[i1] = ((String) (obj));
                    i1 = 13;
                    obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\020LzM\035\r";
                    byte0 = 12;
                    break;

                case 12: // '\f'
                    as1[i1] = ((String) (obj));
                    i1 = 14;
                    obj = "\t;\032B";
                    byte0 = 13;
                    break;

                case 13: // '\r'
                    as1[i1] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 412
        //                       0 435
        //                       1 442
        //                       2 449
        //                       3 456;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_456;
_L3:
            byte byte1 = 121;
_L9:
            obj[j1] = (char)(byte1 ^ c1);
            j1++;
              goto _L8
_L4:
            byte1 = 34;
              goto _L9
_L5:
            byte1 = 14;
              goto _L9
_L6:
            byte1 = 40;
              goto _L9
            byte1 = 115;
              goto _L9
        }

        _cls1()
        {
            a = VerifySms.this;
            super();
        }
    }


    private class _cls2 extends BroadcastReceiver
    {

        private static final String z[];
        final VerifySms a;
        private boolean b;

        public void onReceive(Context context, Intent intent)
        {
            int k1 = App.am;
            Log.i(z[2]);
            if (!b) goto _L2; else goto _L1
_L1:
            Log.i(z[12]);
_L27:
            return;
            context;
            throw context;
_L2:
            if (a.J)
            {
                break; /* Loop/switch isn't completed */
            }
            context = intent.getExtras();
            if (context == null) goto _L4; else goto _L3
_L3:
            Object aobj[] = (Object[])(Object[])context.get(z[21]);
            if (aobj == null) goto _L6; else goto _L5
_L5:
            int i1;
            Log.i((new StringBuilder()).append(z[4]).append(aobj.length).toString());
            i1 = 0;
_L31:
            if (i1 >= aobj.length) goto _L8; else goto _L7
_L7:
            char c1;
            Object obj;
            Object obj1;
            Context context1;
            int j1;
            try
            {
                intent = SmsMessage.createFromPdu((byte[])(byte[])aobj[i1]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e((new StringBuilder()).append(z[10]).append(context.toString()).toString());
                intent = null;
            }
            if (intent == null) goto _L10; else goto _L9
_L9:
            context = intent.getMessageBody();
            Log.i((new StringBuilder()).append(z[5]).append(context).toString());
            Log.i((new StringBuilder()).append(z[7]).append(intent.getDisplayMessageBody()).toString());
            Log.i((new StringBuilder()).append(z[17]).append(intent.getDisplayOriginatingAddress()).toString());
            Log.i((new StringBuilder()).append(z[19]).append(intent.getEmailBody()).toString());
            Log.i((new StringBuilder()).append(z[3]).append(intent.getEmailFrom()).toString());
            Log.i((new StringBuilder()).append(z[9]).append(intent.getOriginatingAddress()).toString());
            Log.i((new StringBuilder()).append(z[22]).append(intent.getPseudoSubject()).toString());
            Log.i((new StringBuilder()).append(z[18]).append(intent.getServiceCenterAddress()).toString());
            context1 = context;
_L28:
            if (intent == null || context1 == null) goto _L12; else goto _L11
_L11:
            Log.i((new StringBuilder()).append(z[20]).append(context1).toString());
            context = z[0];
            j1 = context1.indexOf(context);
            if (j1 < 0) goto _L14; else goto _L13
_L13:
            intent = "";
            obj = intent;
            j1 = context.length() + j1;
_L32:
            context = intent;
            obj = intent;
            if (j1 >= context1.length()) goto _L16; else goto _L15
_L15:
            obj = intent;
            c1 = context1.charAt(j1);
            obj = intent;
            obj1 = intent;
            if (!Character.isDigit(c1)) goto _L18; else goto _L17
_L17:
            obj = intent;
            obj1 = (new StringBuilder()).append(intent).append(c1).toString();
            context = ((Context) (obj1));
            if (k1 == 0) goto _L19; else goto _L18
_L16:
            obj = context;
            intent = context;
            if (context.length() <= 0) goto _L21; else goto _L20
_L20:
            obj = context;
            j1 = Integer.parseInt(context);
_L29:
            if (j1 != -1)
            {
                try
                {
                    b = true;
                    abortBroadcast();
                    VerifySms.d(a, context);
                    asw.a(new bj(a), new String[] {
                        context, z[11]
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
                if (k1 == 0)
                {
                    break MISSING_BLOCK_LABEL_612;
                }
            }
            Log.w(z[1]);
            a.g(z[15]);
            if (k1 == 0) goto _L22; else goto _L14
_L14:
            try
            {
                Log.w(z[8]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
_L22:
            if (k1 == 0) goto _L23; else goto _L12
_L12:
            try
            {
                Log.i(z[14]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
_L23:
            if (k1 == 0) goto _L24; else goto _L8
_L8:
            if (k1 == 0) goto _L25; else goto _L6
_L6:
            try
            {
                Log.i(z[16]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
_L25:
            if (k1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
_L4:
            try
            {
                Log.i(z[13]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (k1 == 0) goto _L27; else goto _L26
_L26:
            try
            {
                Log.i(z[24]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            obj;
            context = null;
_L30:
            Log.a(z[23], ((Throwable) (obj)));
            context1 = context;
              goto _L28
            context;
            Log.w((new StringBuilder()).append(z[6]).append(context.toString()).toString());
            intent = ((Intent) (obj));
_L21:
            j1 = -1;
            context = intent;
              goto _L29
            obj;
              goto _L30
_L24:
            i1++;
              goto _L31
_L10:
            context1 = null;
              goto _L28
_L18:
            context = ((Context) (obj1));
            if (c1 == '-')
            {
                break; /* Loop/switch isn't completed */
            }
            context = ((Context) (obj1));
            if (k1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            context = ((Context) (obj1));
            break; /* Loop/switch isn't completed */
            if (true) goto _L16; else goto _L19
_L19:
            j1++;
            intent = context;
            if (k1 == 0) goto _L32; else goto _L16
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i1;
            as = new String[25];
            obj = "/W\002s19O\023'!\027[\006'";
            byte0 = -1;
            i1 = 0;
_L2:
            String as1[];
            int j1;
            int k1;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k1 = obj.length;
            j1 = 0;
_L8:
label0:
            {
                if (k1 > j1)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i1] = ((String) (obj));
                    obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021(,\027\022\000h&\035";
                    i1 = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLs'\000KLn,\fZ\rs";
                    i1 = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i1] = ((String) (obj));
                    obj = "\016Z\021n$\001L\016tm\035R\002n.>M\fjb";
                    i1 = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i1] = ((String) (obj));
                    i1 = 4;
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLw&\rLNk'\026X\027om";
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i1] = ((String) (obj));
                    i1 = 5;
                    obj = "\016Z\021n$\001L\016tm\037Z\027J'\013L\002`':P\007~b";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i1] = ((String) (obj));
                    i1 = 6;
                    obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021('\nM\fub";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i1] = ((String) (obj));
                    obj = "\016Z\021n$\001L\016tm\034V\020w.\031F.b1\013^\004b\000\027[\032'";
                    byte0 = 6;
                    i1 = 7;
                    break;

                case 6: // '\006'
                    as1[i1] = ((String) (obj));
                    i1 = 8;
                    obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021(,\027K<t/\013`\025b0\021Y\nd#\fV\fi";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i1] = ((String) (obj));
                    i1 = 9;
                    obj = "\016Z\021n$\001L\016tm\037Z\027H0\021X\ni#\fV\r`\003\034[\021b1\013\037";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i1] = ((String) (obj));
                    i1 = 10;
                    obj = "\016Z\021n$\001L\016tm\fZ\033sm\027J\027*-\036\022\016b/\027M\032'";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i1] = ((String) (obj));
                    i1 = 11;
                    obj = "\031J\027h";
                    byte0 = 10;
                    break;

                case 10: // '\n'
                    as1[i1] = ((String) (obj));
                    i1 = 12;
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLf.\nZ\002c;XM\006d'\021I\006c";
                    byte0 = 11;
                    break;

                case 11: // '\013'
                    as1[i1] = ((String) (obj));
                    i1 = 13;
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLe7\026[\017bo\026J\017k";
                    byte0 = 12;
                    break;

                case 12: // '\f'
                    as1[i1] = ((String) (obj));
                    i1 = 14;
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLj'\013L\002`'UQ\026k.";
                    byte0 = 13;
                    break;

                case 13: // '\r'
                    as1[i1] = ((String) (obj));
                    i1 = 15;
                    obj = "\013Z\021q'\n\022\020b,\034\022\016n1\025^\027d*UZ\016w6\001";
                    byte0 = 14;
                    break;

                case 14: // '\016'
                    as1[i1] = ((String) (obj));
                    i1 = 16;
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLw&\rLNi7\024S";
                    byte0 = 15;
                    break;

                case 15: // '\017'
                    as1[i1] = ((String) (obj));
                    i1 = 17;
                    obj = "\016Z\021n$\001L\016tm\034V\020w.\031F,u+\037V\rf6\021Q\004F&\034M\006t1X";
                    byte0 = 16;
                    break;

                case 16: // '\020'
                    as1[i1] = ((String) (obj));
                    i1 = 18;
                    obj = "\016Z\021n$\001L\016tm\037Z\027T'\nI\nd';Z\rs'\n~\007c0\035L\020'";
                    byte0 = 17;
                    break;

                case 17: // '\021'
                    as1[i1] = ((String) (obj));
                    i1 = 19;
                    obj = "\016Z\021n$\001L\016tm\035R\002n.:P\007~b";
                    byte0 = 18;
                    break;

                case 18: // '\022'
                    as1[i1] = ((String) (obj));
                    i1 = 20;
                    obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021(";
                    byte0 = 19;
                    break;

                case 19: // '\023'
                    as1[i1] = ((String) (obj));
                    i1 = 21;
                    obj = "\b[\026t";
                    byte0 = 20;
                    break;

                case 20: // '\024'
                    as1[i1] = ((String) (obj));
                    i1 = 22;
                    obj = "\016Z\021n$\001L\016tm\037Z\027W1\035J\007h\021\r]\tb!\f\037";
                    byte0 = 21;
                    break;

                case 21: // '\025'
                    as1[i1] = ((String) (obj));
                    i1 = 23;
                    obj = "\016Z\021n$\001L\016t";
                    byte0 = 22;
                    break;

                case 22: // '\026'
                    as1[i1] = ((String) (obj));
                    i1 = 24;
                    obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLc'\013K\021h;\035[";
                    byte0 = 23;
                    break;

                case 23: // '\027'
                    as1[i1] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 632
        //                       0 655
        //                       1 662
        //                       2 669
        //                       3 676;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_676;
_L3:
            byte byte1 = 66;
_L9:
            obj[j1] = (char)(byte1 ^ c1);
            j1++;
              goto _L8
_L4:
            byte1 = 120;
              goto _L9
_L5:
            byte1 = 63;
              goto _L9
_L6:
            byte1 = 99;
              goto _L9
            byte1 = 7;
              goto _L9
        }

        _cls2()
        {
            a = VerifySms.this;
            super();
        }
    }


    private class _cls3 extends BroadcastReceiver
    {

        private static final String z[];
        final VerifySms a;

        public void onReceive(Context context, Intent intent)
        {
            int k1;
            k1 = App.am;
            Log.i(z[27]);
            if (a.J) goto _L2; else goto _L1
_L1:
            context = intent.getExtras();
            if (context == null) goto _L4; else goto _L3
_L3:
            Object obj;
            Object aobj[];
            int i1;
            aobj = (Object[])(Object[])context.get(z[2]);
            Log.i((new StringBuilder()).append(z[26]).append(aobj.length).toString());
            intent = "";
            context = "";
            obj = null;
            i1 = 0;
_L22:
            Object obj1;
            Object obj2;
            Object obj3;
            obj3 = obj;
            obj1 = context;
            obj2 = intent;
            if (i1 >= aobj.length) goto _L6; else goto _L5
_L5:
            obj1 = SmsMessage.createFromPdu((byte[])(byte[])aobj[i1]);
            Object obj5;
            if (i1 == 0)
            {
                obj = obj1;
            }
            obj5 = obj1;
            obj3 = obj;
_L18:
            String s1;
            obj1 = context;
            obj2 = intent;
            if (obj5 == null)
            {
                break MISSING_BLOCK_LABEL_640;
            }
            s1 = "";
            obj1 = context;
            obj2 = intent;
            byte abyte0[] = ((SmsMessage) (obj5)).getUserData();
            Object obj4;
            int j1;
            obj4 = s1;
            obj = intent;
            if (abyte0 == null)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            j1 = 0;
            obj = s1;
_L8:
            obj4 = obj;
            obj1 = context;
            obj2 = intent;
            if (j1 >= abyte0.length)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = context;
            obj2 = intent;
            obj4 = (new StringBuilder()).append(((String) (obj))).append(Character.toString((char)abyte0[j1])).toString();
            j1++;
            obj = obj4;
            if (k1 == 0) goto _L8; else goto _L7
_L7:
            obj1 = context;
            obj2 = intent;
            obj = (new StringBuilder()).append(intent).append(((String) (obj4))).toString();
            obj1 = context;
            obj2 = obj;
            s1 = ((SmsMessage) (obj5)).getDisplayMessageBody();
            intent = context;
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_319;
            }
            obj1 = context;
            obj2 = obj;
            intent = (new StringBuilder()).append(context).append(s1).toString();
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[4]).append(((String) (obj4))).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[6]).append(s1).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[17]).append(((SmsMessage) (obj5)).getDisplayOriginatingAddress()).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[20]).append(((SmsMessage) (obj5)).getEmailBody()).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[5]).append(((SmsMessage) (obj5)).getEmailFrom()).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[7]).append(((SmsMessage) (obj5)).getOriginatingAddress()).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[22]).append(((SmsMessage) (obj5)).getPseudoSubject()).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[18]).append(((SmsMessage) (obj5)).getTimestampMillis()).toString());
            obj1 = intent;
            obj2 = obj;
            Log.i((new StringBuilder()).append(z[1]).append(((SmsMessage) (obj5)).getServiceCenterAddress()).toString());
            obj2 = obj;
            obj1 = intent;
_L19:
            if (k1 == 0) goto _L9; else goto _L6
_L6:
            boolean flag;
            try
            {
                i1 = ((String) (obj2)).length();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                try
                {
                    throw context;
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                try
                {
                    throw context;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
            }
            if (i1 > 0) goto _L11; else goto _L10
_L10:
            i1 = ((String) (obj1)).length();
            if (i1 <= 0) goto _L12; else goto _L11
_L11:
            Log.i((new StringBuilder()).append(z[25]).append(((String) (obj2))).toString());
            Log.i((new StringBuilder()).append(z[15]).append(((String) (obj1))).toString());
            if (((String) (obj2)).contains(VerifySms.r())) goto _L14; else goto _L13
_L13:
            flag = ((String) (obj1)).contains(VerifySms.r());
            if (!flag) goto _L15; else goto _L14
_L14:
            obj = a.b(VerifySms.a(a), com.whatsapp.VerifySms.m(a));
            obj1 = ((SmsMessage) (obj3)).getOriginatingAddress();
            VerifySms.B(a);
            if (obj == null || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_821;
            }
            i1 = ((String) (obj)).length();
            if (i1 < 6)
            {
                break MISSING_BLOCK_LABEL_821;
            }
            i1 = ((String) (obj1)).length();
            if (i1 >= 6)
            {
                break MISSING_BLOCK_LABEL_873;
            }
            try
            {
                Log.i((new StringBuilder()).append(z[28]).append(((String) (obj1))).toString());
                a.g(z[14]);
                VerifySms.j(a);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_1046;
            }
            flag = ((String) (obj)).substring(((String) (obj)).length() - 6, ((String) (obj)).length()).equals(((String) (obj1)).substring(((String) (obj1)).length() - 6, ((String) (obj1)).length()));
            if (flag)
            {
                Log.i(z[29]);
                intent = VerifyNumber.a(App.i(App.au));
                context = intent;
                if (App.l != 3)
                {
                    context = o4.f(intent);
                }
                try
                {
                    asw.a(new bj(a), new String[] {
                        context, z[8]
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
                if (k1 == 0)
                {
                    break MISSING_BLOCK_LABEL_1046;
                }
            }
            Log.i((new StringBuilder()).append(z[30]).append(((String) (obj))).append(z[9]).append(((String) (obj1))).toString());
            a.g(z[21]);
            VerifySms.j(a);
_L20:
            if (k1 == 0) goto _L16; else goto _L4
_L4:
            try
            {
                Log.i(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
_L16:
            if (k1 == 0) goto _L17; else goto _L2
_L2:
            Log.i(z[13]);
_L17:
            return;
            obj1;
            Log.e((new StringBuilder()).append(z[12]).append(((OutOfMemoryError) (obj1)).toString()).toString());
            obj5 = null;
            obj3 = obj;
              goto _L18
            context;
            Log.a(z[16], context);
              goto _L19
            context;
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            throw context;
_L15:
            flag = ((String) (obj2)).contains(z[10]);
            if (flag)
            {
                break MISSING_BLOCK_LABEL_1192;
            }
            flag = ((String) (obj1)).contains(z[24]);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_1253;
            }
            flag = VerifySms.B().startsWith(z[19]);
            if (flag)
            {
                try
                {
                    if (!VerifySms.B().startsWith(z[3]))
                    {
                        VerifySms.B(a);
                        VerifySms.c(6);
                        VerifySms.t(a);
                        a.e(4);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
            }
            try
            {
                Log.i(z[11]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (k1 == 0) goto _L20; else goto _L12
_L12:
            Log.i(z[23]);
              goto _L20
            context;
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            throw context;
            context;
            throw context;
_L9:
            i1++;
            obj = obj3;
            context = ((Context) (obj1));
            intent = ((Intent) (obj2));
            if (true) goto _L22; else goto _L21
_L21:
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i1;
            as = new String[31];
            obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ5A2{\0312\0312j\031;";
            byte0 = -1;
            i1 = 0;
_L2:
            String as1[];
            int j1;
            int k1;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k1 = obj.length;
            j1 = 0;
_L8:
label0:
            {
                if (k1 > j1)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i1] = ((String) (obj));
                    obj = "*z\007>R%l\030$\033;z\001\004Q.i\0344Q\037z\033#Q.^\0213F9l\006w";
                    i1 = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    obj = ",{\000$";
                    i1 = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i1] = ((String) (obj));
                    obj = "w*Gf";
                    i1 = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i1] = ((String) (obj));
                    obj = "*z\007>R%l\030$\033;z\001\032Q/l\0240Q\036p\021.\024";
                    i1 = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i1] = ((String) (obj));
                    i1 = 5;
                    obj = "*z\007>R%l\030$\0339r\024>X\032m\032:\024";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i1] = ((String) (obj));
                    i1 = 6;
                    obj = "*z\007>R%l\030$\0338v\006'X=f82G/~\0222v3{\fw";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i1] = ((String) (obj));
                    i1 = 7;
                    obj = "*z\007>R%l\030$\033;z\001\030F5x\0349U(v\0330u8{\0072G/?";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i1] = ((String) (obj));
                    i1 = 8;
                    obj = "=j\0018";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i1] = ((String) (obj));
                    i1 = 9;
                    obj = "|m\0204Q5i\0203\t";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i1] = ((String) (obj));
                    i1 = 10;
                    obj = "\030z\006#]2pU>Z?p\007%Q?k\032";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i1] = ((String) (obj));
                    i1 = 11;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:]/l\0349Sq|\0356X0z\0330Q";
                    byte0 = 10;
                    break;

                case 10: // '\n'
                    as1[i1] = ((String) (obj));
                    i1 = 12;
                    obj = "*z\007>R%l\030$\0333j\001z[:2\0302Y3m\fw";
                    byte0 = 11;
                    break;

                case 11: // '\013'
                    as1[i1] = ((String) (obj));
                    i1 = 13;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ3Q/k\0078M9{";
                    byte0 = 12;
                    break;

                case 12: // '\f'
                    as1[i1] = ((String) (obj));
                    i1 = 14;
                    obj = "/z\0311\031/z\0333\0311v\006:U(|\035zD4p\0332";
                    byte0 = 13;
                    break;

                case 13: // '\r'
                    as1[i1] = ((String) (obj));
                    i1 = 15;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mU";
                    byte0 = 14;
                    break;

                case 14: // '\016'
                    as1[i1] = ((String) (obj));
                    i1 = 16;
                    obj = "*z\007>R%l\030$";
                    byte0 = 15;
                    break;

                case 15: // '\017'
                    as1[i1] = ((String) (obj));
                    i1 = 17;
                    obj = "*z\007>R%l\030$\0338v\006'X=f:%];v\0336@5q\022\026P8m\020$G|";
                    byte0 = 16;
                    break;

                case 16: // '\020'
                    as1[i1] = ((String) (obj));
                    i1 = 18;
                    obj = "*z\007>R%l\030$\033;z\001\004Q.i\0344Q\037z\033#Q.K\034:Q/k\024:D|";
                    byte0 = 17;
                    break;

                case 17: // '\021'
                    as1[i1] = ((String) (obj));
                    i1 = 19;
                    obj = "w*G";
                    byte0 = 18;
                    break;

                case 18: // '\022'
                    as1[i1] = ((String) (obj));
                    i1 = 20;
                    obj = "*z\007>R%l\030$\0339r\024>X\036p\021.\024";
                    byte0 = 19;
                    break;

                case 19: // '\023'
                    as1[i1] = ((String) (obj));
                    i1 = 21;
                    obj = "/z\0311\031/z\0333\0311v\006:U(|\035zD4p\0332";
                    byte0 = 20;
                    break;

                case 20: // '\024'
                    as1[i1] = ((String) (obj));
                    i1 = 22;
                    obj = "*z\007>R%l\030$\033;z\001\007G9j\0218g)}\0372W(?";
                    byte0 = 21;
                    break;

                case 21: // '\025'
                    as1[i1] = ((String) (obj));
                    i1 = 23;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:Q/l\0240Qqq\000;X";
                    byte0 = 22;
                    break;

                case 22: // '\026'
                    as1[i1] = ((String) (obj));
                    i1 = 24;
                    obj = "\030z\006#]2pU>Z?p\007%Q?k\032";
                    byte0 = 23;
                    break;

                case 23: // '\027'
                    as1[i1] = ((String) (obj));
                    i1 = 25;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mU";
                    byte0 = 24;
                    break;

                case 24: // '\030'
                    as1[i1] = ((String) (obj));
                    i1 = 26;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ'P)lX;Q2x\001?\033";
                    byte0 = 25;
                    break;

                case 25: // '\031'
                    as1[i1] = ((String) (obj));
                    i1 = 27;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ3U(~Z>Z(z\033#";
                    byte0 = 26;
                    break;

                case 26: // '\032'
                    as1[i1] = ((String) (obj));
                    i1 = 28;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:]/r\024#W40\006?[.kU";
                    byte0 = 27;
                    break;

                case 27: // '\033'
                    as1[i1] = ((String) (obj));
                    i1 = 29;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ!Q.v\023>Q8";
                    byte0 = 28;
                    break;

                case 28: // '\034'
                    as1[i1] = ((String) (obj));
                    i1 = 30;
                    obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:]/r\024#W40\0036X)zU9A1}\020%\t";
                    byte0 = 29;
                    break;

                case 29: // '\035'
                    as1[i1] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 764
        //                       0 787
        //                       1 794
        //                       2 801
        //                       3 808;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_808;
_L3:
            byte byte1 = 52;
_L9:
            obj[j1] = (char)(byte1 ^ c1);
            j1++;
              goto _L8
_L4:
            byte1 = 92;
              goto _L9
_L5:
            byte1 = 31;
              goto _L9
_L6:
            byte1 = 117;
              goto _L9
            byte1 = 87;
              goto _L9
        }

        _cls3()
        {
            a = VerifySms.this;
            super();
        }
    }

}
