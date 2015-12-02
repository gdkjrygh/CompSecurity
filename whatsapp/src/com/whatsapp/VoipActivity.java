// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.notification.l;
import com.whatsapp.util.Log;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, wd, a1f, df, 
//            afe, App, VoiceService, auo, 
//            asw, k, og, Voip, 
//            d8, iz, ati, ei, 
//            afh, vu, e6, v, 
//            auk, fc, AnswerCallView, zl, 
//            _0

public class VoipActivity extends DialogToastFragmentActivity
    implements wd, a1f
{

    private static final String z[];
    private boolean f;
    private TextView g;
    private String h;
    private final Runnable i = new df(this);
    private ServiceConnection j;
    private TextView k;
    private VoiceService l;
    private String m;

    public VoipActivity()
    {
        j = new afe(this);
    }

    static VoiceService a(VoipActivity voipactivity, VoiceService voiceservice)
    {
        voipactivity.l = voiceservice;
        return voiceservice;
    }

    static String a(VoipActivity voipactivity, String s)
    {
        voipactivity.h = s;
        return s;
    }

    static void a(VoipActivity voipactivity)
    {
        voipactivity.g();
    }

    static boolean a(VoipActivity voipactivity, boolean flag)
    {
        voipactivity.f = flag;
        return flag;
    }

    static Runnable b(VoipActivity voipactivity)
    {
        return voipactivity.i;
    }

    private void b(Voip.CallInfo callinfo)
    {
        int i1 = App.am;
        if (g != null) goto _L2; else goto _L1
_L1:
        Log.e(z[23]);
_L4:
        return;
_L2:
        if (callinfo == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (callinfo.getCallState() != Voip.CallState.ACTIVE)
        {
            break; /* Loop/switch isn't completed */
        }
        g.setText(DateUtils.formatElapsedTime(callinfo.getCallDuration() / 1000L));
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (!callinfo.isCaller())
        {
            break; /* Loop/switch isn't completed */
        }
        if (l == null || !l.c())
        {
            break; /* Loop/switch isn't completed */
        }
        g.setText(0x7f0e02d2);
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        g.setText(0x7f0e048c);
        if (i1 == 0) goto _L4; else goto _L6
_L6:
        g.setText(0x7f0e0489);
        if (i1 == 0) goto _L4; else goto _L7
_L7:
        g.setText(null);
        return;
    }

    private void c(Voip.CallInfo callinfo)
    {
        Object obj;
        Object obj1;
        View view;
        View view1;
        int j1;
        int k1;
        boolean flag;
        j1 = 0;
        k1 = App.am;
        if (callinfo != null && callinfo.getCallState() != Voip.CallState.NONE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = findViewById(0x7f0b02cc);
        obj1 = findViewById(0x7f0b02cd);
        view = findViewById(0x7f0b02cf);
        view1 = findViewById(0x7f0b02d2);
        if (obj != null && obj1 != null && view != null && view1 != null) goto _L2; else goto _L1
_L1:
        Log.e(z[12]);
_L4:
        return;
_L2:
        if (callinfo == null || callinfo.getCallState() != Voip.CallState.RECEIVED_CALL)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(z[10]);
        ((View) (obj)).setVisibility(0);
        ((View) (obj1)).setVisibility(0);
        view.setVisibility(8);
        view1.setVisibility(8);
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        float f1;
        int i1;
label0:
        {
            Log.i(z[11]);
            ((View) (obj)).setVisibility(8);
            ((View) (obj1)).setVisibility(8);
            view.setVisibility(0);
            view1.setVisibility(0);
            callinfo = (ImageButton)findViewById(0x7f0b02d1);
            obj = (ImageButton)findViewById(0x7f0b02d0);
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            callinfo.setEnabled(flag1);
            ((ImageButton) (obj)).setEnabled(flag);
            callinfo.setVisibility(8);
            if (((ImageButton) (obj)).isEnabled())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((ImageButton) (obj)).setVisibility(i1);
            obj1 = (android.widget.LinearLayout.LayoutParams)callinfo.getLayoutParams();
            if (callinfo.isEnabled() && ((ImageButton) (obj)).isEnabled())
            {
                f1 = TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
                if (k1 == 0)
                {
                    break label0;
                }
            }
            f1 = 0.0F;
        }
        if (App.H)
        {
            i1 = 0;
        } else
        {
            i1 = (int)f1;
        }
        if (App.H)
        {
            j1 = (int)f1;
        }
        ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(i1, ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin, j1, ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin);
        if (callinfo.getParent() != null)
        {
            callinfo.getParent().requestLayout();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    static void c(VoipActivity voipactivity)
    {
        voipactivity.d();
    }

    static VoiceService d(VoipActivity voipactivity)
    {
        return voipactivity.l;
    }

    private void d()
    {
        Log.i(z[29]);
        if (l != null)
        {
            l.H();
        }
    }

    private void e()
    {
        int i1 = getWindowManager().getDefaultDisplay().getWidth();
        Log.i((new StringBuilder()).append(z[27]).append(i1).toString());
        asw.a(new auo(this, i1), new Void[0]);
    }

    static void e(VoipActivity voipactivity)
    {
        voipactivity.f();
    }

    private void f()
    {
        Log.i(z[24]);
        if (l != null)
        {
            l.o();
        }
        g();
        finish();
    }

    static void f(VoipActivity voipactivity)
    {
        voipactivity.h();
    }

    static String g(VoipActivity voipactivity)
    {
        return voipactivity.h;
    }

    private void g()
    {
        if (isFinishing())
        {
            Log.i(z[28]);
            return;
        } else
        {
            k.setText(App.az.e(h).a(this));
            Voip.CallInfo callinfo = Voip.getCallInfo();
            c(callinfo);
            b(callinfo);
            a(callinfo);
            return;
        }
    }

    private void h()
    {
        Log.i(z[1]);
        if (l != null)
        {
            l.D();
        }
        g();
        finish();
    }

    public void a()
    {
    }

    public void a(Voip.CallInfo callinfo)
    {
        boolean flag = false;
        if (callinfo != null)
        {
            if ((callinfo = callinfo.getCallState()) != Voip.CallState.NONE && callinfo != Voip.CallState.RECEIVED_CALL)
            {
                callinfo = findViewById(0x7f0b02d4);
                View view = findViewById(0x7f0b02d7);
                View view1 = findViewById(0x7f0b02db);
                View view2 = findViewById(0x7f0b02d5);
                int i1;
                if (callinfo != null)
                {
                    if (l != null && l.F())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 4;
                    }
                    callinfo.setVisibility(i1);
                }
                if (view1 != null)
                {
                    if (l != null && l.n())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 4;
                    }
                    view1.setVisibility(i1);
                }
                if (view2 != null)
                {
                    int j1;
                    if (l != null && l.e())
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 != 0)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = 8;
                    }
                    view2.setVisibility(j1);
                    if (i1 != 0 && view != null)
                    {
                        if (l != null && l.r())
                        {
                            i1 = ((flag) ? 1 : 0);
                        } else
                        {
                            i1 = 4;
                        }
                        view.setVisibility(i1);
                        return;
                    }
                }
            }
        }
    }

    public void a(Voip.CallState callstate, Voip.CallInfo callinfo)
    {
        if (callinfo == null)
        {
            Log.w(z[30]);
            finish();
            return;
        } else
        {
            runOnUiThread(new d8(this, callinfo.getCallState()));
            return;
        }
    }

    public void a(String s)
    {
        if (TextUtils.equals(s, h))
        {
            Log.w((new StringBuilder()).append(z[14]).append(s).append(z[15]).toString());
        }
    }

    public void a(Collection collection)
    {
    }

    public void a(boolean flag, long l1, boolean flag1)
    {
label0:
        {
            if (flag)
            {
                g.setText(DateUtils.formatElapsedTime(l1 / 1000L));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (flag1)
            {
                g.setText(0x7f0e02d2);
            }
        }
        View view = findViewById(0x7f0b02e1);
        if (view != null && view.getVisibility() == 0)
        {
            TextView textview = (TextView)findViewById(0x7f0b02e2);
            if (textview != null)
            {
                textview.setText(Voip.getStreamStatistics());
            }
        }
    }

    public void b()
    {
        a(Voip.getCallInfo());
    }

    public void b(String s)
    {
    }

    public Activity c()
    {
        return this;
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
        if (TextUtils.equals(s, h))
        {
            e();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (l != null && !l.F() && l.x())
        {
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    public void e(String s)
    {
        m = s;
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
label0:
        {
label1:
            {
                i1 = 0;
                Log.i(z[8]);
                super.onCreate(bundle);
                bundle = Voip.getCallInfo();
                if (bundle != null && bundle.getCallState() != Voip.CallState.NONE)
                {
                    break label0;
                }
                finish();
                if (getIntent().getBooleanExtra(z[6], false))
                {
                    com.whatsapp.notification.l.d().c();
                    bundle = new Intent(z[3], null, App.au, com/whatsapp/VoiceService);
                    bundle.putExtra(z[5], getIntent().getStringExtra(z[4]));
                    startService(bundle);
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                Log.e(z[9]);
            }
            return;
        }
        a(false);
        getWindow().addFlags(0x280000);
        if (!bundle.isCaller() && bundle.getCallState() == Voip.CallState.RECEIVED_CALL)
        {
            getWindow().addFlags(128);
        }
        setContentView(iz.a(getLayoutInflater(), 0x7f0300b0, null));
        g = (TextView)findViewById(0x7f0b02e0);
        k = (TextView)findViewById(0x7f0b0135);
        k.setOnClickListener(new ati(this));
        bundle = (Button)findViewById(0x7f0b02cb);
        bundle.setText(0x7f0e023f);
        bundle.setOnClickListener(new ei(this));
        if (com.whatsapp.App.l < 3)
        {
            i1 = 4;
        }
        bundle.setVisibility(i1);
        findViewById(0x7f0b02d1).setOnClickListener(new afh(this));
        findViewById(0x7f0b02d0).setOnClickListener(new vu(this));
        findViewById(0x7f0b02da).setOnClickListener(new e6(this));
        findViewById(0x7f0b02d8).setOnClickListener(new v(this));
        findViewById(0x7f0b02d3).setOnClickListener(new auk(this));
        findViewById(0x7f0b02d6).setOnClickListener(new fc(this));
        ((AnswerCallView)findViewById(0x7f0b02cc)).setAnswerCallListener(new zl(this));
        findViewById(0x7f0b02ce).setOnClickListener(new _0(this));
        bundle = getIntent();
        setIntent(bundle);
        h = bundle.getStringExtra(z[7]);
        if (TextUtils.isEmpty(h))
        {
            h = Voip.getPeerJid();
        }
        App.b(this);
    }

    protected void onDestroy()
    {
        Log.i(z[2]);
        super.onDestroy();
        App.a(this);
        if (isFinishing() && m != null)
        {
            App.a(App.au, m, 1);
        }
        if (l != null)
        {
            l.a(null);
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        Log.i(z[22]);
        if (l != null)
        {
            l.w();
        }
        return false;
    }

    protected void onNewIntent(Intent intent)
    {
label0:
        {
label1:
            {
                String s = intent.getAction();
                Log.i((new StringBuilder()).append(z[16]).append(intent).append(z[20]).append(s).append(z[21]).append(isFinishing()).toString());
                super.onNewIntent(intent);
                if (z[19].equals(s))
                {
                    d();
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                if (!isFinishing())
                {
                    break label0;
                }
                Log.e(z[17]);
            }
            return;
        }
        setIntent(intent);
        h = intent.getStringExtra(z[18]);
        if (TextUtils.isEmpty(h))
        {
            h = Voip.getPeerJid();
        }
        g();
        e();
    }

    protected void onPause()
    {
        Log.i(z[0]);
        super.onPause();
        if (f)
        {
            unbindService(j);
            f = false;
        }
    }

    protected void onResume()
    {
        Log.i(z[13]);
        super.onResume();
        bindService(new Intent(this, com/whatsapp/VoiceService), j, 1);
    }

    protected void onStart()
    {
        Log.i(z[25]);
        super.onStart();
        if (!Voip.h())
        {
            finish();
            Log.e(z[26]);
            return;
        } else
        {
            g();
            e();
            return;
        }
    }

    protected void onStop()
    {
        Log.i(z[31]);
        super.onStop();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[32];
        obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\002]\002\027$";
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
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\007 >PX\026$8Y\024\020";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\026Y\004\0203=E";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "!H\026\0265\r_\026\b-";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "8U\023";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "8U\023";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "4N\030\t\0023P\033*.&U\021\r\"3H\036\013/";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "8U\023";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\021N\022\00557";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\00737]\003\001n1]\033\b\036<S\003; 1H\036\022$";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\02116]\003\001\003'H\003\013/\001H\026\020$!\023\026\n2%Y\005' >P!\r$%\023\001\r2;^\033\001";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\02116]\003\001\003'H\003\013/\001H\026\020$!";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\02116]\003\001\003'H\003\013/\001H\026\020$!\023\031\021->";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\000Y\004\021,7";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "1]\033\b 0U\033\r5+\034\024\f <[\022\000a4S\005D";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "rK\037\r-7\034\001\r$%U\031\003a$S\036\024a3_\003\r7;H\016";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\034Y\000-/&Y\031\020a";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\n$%\021\036\n57R\003D 1H\036\022(&EW\r2rZ\036\n(!T\036\n&~\034\023\013a<S\003\f(<[";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "8U\023";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "1S\032J6:]\003\027 \"LY\r/&Y\031\020o3_\003\r.<\0226'\002\027l#;\002\023p;";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "~\034\026\0075;S\031D";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "~\034\036\027a4U\031\r2:U\031\003a";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\031Y\016 .%R";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\02116]\003\001\0023P\033753H\002\027\0033NX\n4>P";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\007 >PX\001/6";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\001H\026\0265";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\001H\026\0265r_\026\b-\rR\030\020\0363_\003\r77\020W\002(<U\004\f(<[";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "\004S\036\024\0001H\036\022(&EW\026$#I\022\0275;R\020D1 S\021\r-7\034\036\t 5YW\013'rO\036\036$h\034";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\02116]\003\001\024;o\003\00557\034\021\r/;O\037\r/5\034\023\013a<S\003D4\"X\026\020$";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\007 >PX\005\"1Y\007\020";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\007 >P$\020 &Y4\f <[\022\000a;R\021\013ao\001W*\024\036pW\002(<U\004\f(<[W\0074 N\022\n5r]\024\020($U\003\035";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "$S\036\024n\004S\036\024\0001H\036\022(&EX\013/\001H\030\024";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 784
    //                   0 807
    //                   1 814
    //                   2 821
    //                   3 828;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_828;
_L3:
        byte byte1 = 65;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 82;
          goto _L9
_L5:
        byte1 = 60;
          goto _L9
_L6:
        byte1 = 119;
          goto _L9
        byte1 = 100;
          goto _L9
    }
}
