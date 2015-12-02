// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            DialogToastFragmentActivity, wd, App, u5, 
//            og, a_c, asw, iz, 
//            au_, h2, at3, a_e, 
//            aul, a88, aoz, a1g, 
//            Conversation

public class CallLogActivity extends DialogToastFragmentActivity
    implements wd
{

    private static final String z[];
    private View f;
    private ListView g;
    private a_c h;
    private aul i;
    private og j;
    private ArrayList k;
    private ImageView l;

    public CallLogActivity()
    {
    }

    public static int a(c4 c4_1)
    {
        if (c4_1.y.b)
        {
            return 0x7f02010e;
        }
        return c4_1.H <= 0 ? 0x7f02010d : 0x7f02010c;
    }

    static void a(CallLogActivity calllogactivity)
    {
        calllogactivity.b();
    }

    public static int b(c4 c4_1)
    {
        if (c4_1.y.b)
        {
            return 0x7f0e02bd;
        }
        return c4_1.H <= 0 ? 0x7f0e00fa : 0x7f0e01fe;
    }

    static og b(CallLogActivity calllogactivity)
    {
        return calllogactivity.j;
    }

    private void b()
    {
label0:
        {
label1:
            {
                int i1;
                int j1;
label2:
                {
                    j1 = App.am;
                    View view = g.getChildAt(0);
                    if (view == null)
                    {
                        break label0;
                    }
                    if (g.getWidth() <= g.getHeight())
                    {
                        break label1;
                    }
                    if (g.getFirstVisiblePosition() == 0)
                    {
                        i1 = view.getTop();
                        if (j1 == 0)
                        {
                            break label2;
                        }
                    }
                    i1 = -f.getHeight() + 1;
                }
                f.offsetTopAndBottom(i1 - f.getTop());
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (f.getTop() != 0)
            {
                f.offsetTopAndBottom(-f.getTop());
            }
        }
    }

    static ImageView c(CallLogActivity calllogactivity)
    {
        return calllogactivity.l;
    }

    private void d()
    {
        Log.i(z[0]);
        j = u5.d(getIntent().getStringExtra(z[1]));
        int i1 = getResources().getDimensionPixelSize(0x7f0a004b);
        Object obj = Bitmap.createScaledBitmap(j.j(), i1, i1, true);
        if (obj != null)
        {
            l.setImageBitmap(((Bitmap) (obj)));
        }
        obj = (TextView)findViewById(0x7f0b010c);
        ((TextView) (obj)).setText(com.whatsapp.util.c.b(j.a(this), getBaseContext(), ((TextView) (obj)).getPaint()));
        ((TextView)findViewById(0x7f0b010d)).setText(j.v());
        if (h != null)
        {
            h.cancel(true);
        }
        h = new a_c(this);
        com.whatsapp.asw.a(h, new Void[0]);
    }

    public void a()
    {
        d();
    }

    public void a(String s)
    {
        if (s.equals(getIntent().getStringExtra(z[9])))
        {
            d();
        }
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
        if (s.equals(getIntent().getStringExtra(z[11])))
        {
            ((TextView)findViewById(0x7f0b010d)).setText(j.v());
        }
    }

    public void c(String s)
    {
        if (s.equals(getIntent().getStringExtra(z[2])))
        {
            d();
        }
    }

    public void d(String s)
    {
        if (s.equals(getIntent().getStringExtra(z[3])))
        {
            d();
        }
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            int i1 = App.am;
            Log.i(z[4]);
            super.onCreate(bundle);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setContentView(0x7f03002e);
            g = (ListView)findViewById(0x102000a);
            bundle = com.whatsapp.iz.a(getLayoutInflater(), 0x7f03002f, g, false);
            g.addHeaderView(bundle, null, false);
            f = findViewById(0x7f0b00b9);
            f.setClickable(true);
            g.setOnScrollListener(new au_(this));
            g.getViewTreeObserver().addOnGlobalLayoutListener(new h2(this));
            l = (ImageView)findViewById(0x7f0b0109);
            l.setOnClickListener(new at3(getIntent().getStringExtra(z[6]), this));
            findViewById(0x7f0b010b).setOnClickListener(new a_e(this));
            i = new aul(this, this, 0x7f030092);
            g.setAdapter(i);
            bundle = getIntent().getParcelableArrayListExtra(z[5]);
            if (bundle == null)
            {
                break label0;
            }
            k = new ArrayList();
            bundle = bundle.iterator();
            do
            {
                if (!bundle.hasNext())
                {
                    break;
                }
                Object obj = (a88)(Parcelable)bundle.next();
                obj = App.ah.a(((a88) (obj)).a);
                k.add(obj);
            } while (i1 == 0);
            i.a(k);
            if (k.isEmpty())
            {
                break label0;
            }
            long l1 = App.q((c4)k.get(0));
            bundle = (TextView)findViewById(0x7f0b0110);
            com.whatsapp.a1g.a(bundle);
            if (DateUtils.isToday(l1))
            {
                bundle.setText(0x7f0e0448);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (DateUtils.isToday(0x5265c00L + l1))
            {
                bundle.setText(0x7f0e04b6);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            bundle.setText(DateUtils.formatDateTime(this, l1, 16));
        }
        d();
        App.b(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0x7f0b0015, 0, 0x7f0e0244).setIcon(0x7f020511).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(1, 0x7f0b0006, 0, 0x7f0e0095).setIcon(0x7f020508).setShowAsAction(2);
        return true;
    }

    public void onDestroy()
    {
        Log.i(z[10]);
        super.onDestroy();
        if (h != null)
        {
            h.cancel(true);
        }
        com.whatsapp.App.a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 44
    //                   16908332: 48
    //                   2131427334: 54
    //                   2131427349: 86;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        finish();
        return true;
_L3:
        Log.i(z[7]);
        if (k == null) goto _L6; else goto _L5
_L5:
        App.ah.a(k);
        finish();
        return true;
_L4:
        Log.i(z[8]);
        startActivity(com.whatsapp.Conversation.a(j));
        finish();
        if (true) goto _L1; else goto _L7
_L7:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[12];
        obj = "03ju~<5)lb73r|";
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
                obj = "9;b";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "9;b";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "9;b";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "03ju~<5)z`63r|";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "03jua";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                obj = "9;b";
                byte0 = 5;
                i1 = 6;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "03ju~<5)}w?7r|";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "03ju~<5)ww$\rev|%7tjs';iw";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "9;b";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "03ju~<5)}w &tvk";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "9;b";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 18;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 83;
          goto _L9
_L5:
        byte1 = 82;
          goto _L9
_L6:
        byte1 = 6;
          goto _L9
        byte1 = 25;
          goto _L9
    }
}
