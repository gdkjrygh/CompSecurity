// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.y;
import com.whatsapp.wallpaper.d;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, ao9, ado, y0, 
//            og, ContactInfo, Conversation, App, 
//            aoz, a91, d1, abl, 
//            ConversationRow, kw, pq, vq, 
//            adk, wd

public class BroadcastDetails extends DialogToastActivity
{

    private static final String z[];
    private final adk j = new ado(this);
    private a91 k;
    private final ao9 l = new ao9();
    private final wd m = new y0(this);
    private c4 n;
    private String o[];
    private og p;

    public BroadcastDetails()
    {
    }

    static og a(BroadcastDetails broadcastdetails, og og1)
    {
        broadcastdetails.p = og1;
        return og1;
    }

    static boolean a(BroadcastDetails broadcastdetails, og og1, int i)
    {
        return broadcastdetails.a(og1, i);
    }

    private boolean a(og og1, int i)
    {
        i;
        JVM INSTR tableswitch 0 4: default 36
    //                   0 38
    //                   1 52
    //                   2 36
    //                   3 36
    //                   4 62;
           goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
        return true;
_L2:
        if (og1.z != null)
        {
            com.whatsapp.ContactInfo.a(og1, this);
            return true;
        }
          goto _L1
_L3:
        startActivity(com.whatsapp.Conversation.a(og1));
        return true;
_L4:
        App.b(og1, this);
        return true;
    }

    static String[] a(BroadcastDetails broadcastdetails)
    {
        return broadcastdetails.o;
    }

    static og b(BroadcastDetails broadcastdetails)
    {
        return broadcastdetails.p;
    }

    static a91 c(BroadcastDetails broadcastdetails)
    {
        return broadcastdetails.k;
    }

    static c4 d(BroadcastDetails broadcastdetails)
    {
        return broadcastdetails.n;
    }

    static ao9 e(BroadcastDetails broadcastdetails)
    {
        return broadcastdetails.l;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030024);
        Log.i(z[2]);
        App.ah.a(j);
        App.b(m);
        bundle = getIntent();
        if (bundle == null)
        {
            finish();
            return;
        }
        bundle = bundle.getStringExtra(z[3]);
        n = App.ah.a(new a(z[4], true, bundle));
        if (n == null || n.G == null)
        {
            finish();
            return;
        }
        o = n.G.split(",");
        bundle = (ListView)findViewById(0x102000a);
        k = new a91(this, this);
        bundle.setAdapter(k);
        bundle.setOnItemClickListener(new d1(this));
        getSupportActionBar().setTitle(String.format(App.j.a(0x7f0d0007, o.length), new Object[] {
            Integer.valueOf(o.length)
        }));
        ((TextView)findViewById(0x7f0b00cd)).setText(getString(0x7f0e0064, new Object[] {
            Integer.valueOf(o.length)
        }));
        Object obj = com.whatsapp.Conversation.a(this, n);
        ((ConversationRow) (obj)).f();
        bundle = (ViewGroup)findViewById(0x7f0b00cc);
        bundle.addView(((View) (obj)), -2, -2);
        ((android.widget.RelativeLayout.LayoutParams)(android.widget.RelativeLayout.LayoutParams)((ConversationRow) (obj)).getChildAt(1).getLayoutParams()).rightMargin = 0;
        ((android.widget.RelativeLayout.LayoutParams)(android.widget.RelativeLayout.LayoutParams)((ConversationRow) (obj)).getChildAt(1).getLayoutParams()).leftMargin = 0;
        ((android.widget.RelativeLayout.LayoutParams)(android.widget.RelativeLayout.LayoutParams)((ConversationRow) (obj)).getChildAt(1).getLayoutParams()).addRule(11, 0);
        obj = com.whatsapp.wallpaper.d.f(this);
        if (obj != null)
        {
            View view = findViewById(0x7f0b00cb);
            view.setBackgroundDrawable(new kw(this, ((android.graphics.drawable.Drawable) (obj)), view));
        }
        obj = findViewById(0x7f0b00cb);
        bundle.measure(android.view.View.MeasureSpec.makeMeasureSpec(-1, 0), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0));
        int i = getWindowManager().getDefaultDisplay().getHeight() / 2;
        if (bundle.getMeasuredHeight() > i)
        {
            ((View) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i));
        }
        y.a(z[5]);
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 3: // '\003'
            break;
        }
        if (p != null)
        {
            Object obj1 = new ArrayList();
            Object obj = new ArrayList();
            ((ArrayList) (obj1)).add(getString(0x7f0e024f, new Object[] {
                p.z()
            }));
            ((ArrayList) (obj)).add(Integer.valueOf(1));
            ((ArrayList) (obj1)).add(getString(0x7f0e0070, new Object[] {
                p.z()
            }));
            ((ArrayList) (obj)).add(Integer.valueOf(4));
            if (p.z != null)
            {
                ((ArrayList) (obj1)).add(getString(0x7f0e047d, new Object[] {
                    p.z()
                }));
                ((ArrayList) (obj)).add(Integer.valueOf(0));
            }
            String as[] = new String[((ArrayList) (obj1)).size()];
            ((ArrayList) (obj1)).toArray(as);
            obj1 = new android.app.AlertDialog.Builder(this);
            ((android.app.AlertDialog.Builder) (obj1)).setItems(as, new pq(this, ((ArrayList) (obj))));
            obj = ((android.app.AlertDialog.Builder) (obj1)).create();
            ((AlertDialog) (obj)).setOnCancelListener(new vq(this));
            ((AlertDialog) (obj)).requestWindowFeature(1);
            return ((Dialog) (obj));
        } else
        {
            return super.onCreateDialog(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        Log.i(z[0]);
        super.onDestroy();
        l.a();
        App.ah.b(j);
        com.whatsapp.App.a(m);
        y.c(z[1]);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "Dv*MLEe6XLCp$EDU+!I[Rv*U";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "Dv*MLEe6X";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Dv*MLEe6XLCp$EDU+&^MGp ";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "O`";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Dv*MLEe6X";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Dv*MLEe6X";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 252
    //                   3 259;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_259;
_L3:
        byte byte1 = 40;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 38;
          goto _L9
_L5:
        byte1 = 4;
          goto _L9
_L6:
        byte1 = 69;
          goto _L9
        byte1 = 44;
          goto _L9
    }
}
