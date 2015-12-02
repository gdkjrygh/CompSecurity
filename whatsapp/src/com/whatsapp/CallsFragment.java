// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.bv;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            a3n, ao9, a9b, a9d, 
//            c4, c7, a_a, App, 
//            k, iu, asw, yj, 
//            e7, xd, a_h, Voip, 
//            ContactPicker, es, c1, wd

public class CallsFragment extends SherlockListFragment
    implements a3n
{

    private static final String z[];
    private final es b = new c4(this);
    private final ArrayList c = new ArrayList();
    private final c1 d = new a9d(this);
    private final wd e = new a9b(this);
    private ArrayList f;
    private e7 g;
    private iu h;
    private final Runnable i = new c7(this);
    private CharSequence j;
    bv k;
    private ao9 l;

    public CallsFragment()
    {
        l = new ao9();
        f = new ArrayList();
        k = new a_a(this);
    }

    static CharSequence a(CallsFragment callsfragment, CharSequence charsequence)
    {
        callsfragment.j = charsequence;
        return charsequence;
    }

    static ArrayList a(CallsFragment callsfragment, ArrayList arraylist)
    {
        callsfragment.f = arraylist;
        return arraylist;
    }

    private void a()
    {
label0:
        {
            int i1 = App.am;
            if (c.isEmpty())
            {
                if (App.az.l() > 0)
                {
                    getView().findViewById(0x7f0b00d9).setVisibility(8);
                    getView().findViewById(0x7f0b00d8).setVisibility(0);
                    getView().findViewById(0x7f0b00db).setVisibility(8);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                getView().findViewById(0x7f0b00d9).setVisibility(8);
                getView().findViewById(0x7f0b00d8).setVisibility(8);
                getView().findViewById(0x7f0b00db).setVisibility(0);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (!TextUtils.isEmpty(j))
            {
                getView().findViewById(0x7f0b00d9).setVisibility(0);
                getView().findViewById(0x7f0b00d8).setVisibility(8);
                getView().findViewById(0x7f0b00db).setVisibility(8);
            }
        }
    }

    static void a(CallsFragment callsfragment)
    {
        callsfragment.b();
    }

    static ArrayList b(CallsFragment callsfragment)
    {
        return callsfragment.f;
    }

    private void b()
    {
        if (h != null)
        {
            h.cancel(true);
        }
        h = new iu(this, null);
        asw.a(h, new Void[0]);
    }

    static CharSequence c(CallsFragment callsfragment)
    {
        return callsfragment.j;
    }

    private void c()
    {
label0:
        {
            App.au.ab().removeCallbacks(i);
            if (c.isEmpty())
            {
                break label0;
            }
            long l1 = System.currentTimeMillis();
            long l2 = l1 - ((yj)c.get(0)).c();
            if (l2 < 0x36ee80L)
            {
                long l3 = ((yj)c.get(0)).c();
                long l5 = l2 / 60000L;
                App.au.ab().postDelayed(i, ((l3 + l5 * 60000L + 60000L) - l1) + 1000L);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (l2 < 0x5265c00L)
            {
                long l4 = ((yj)c.get(0)).c();
                l2 /= 0x36ee80L;
                App.au.ab().postDelayed(i, ((l4 + l2 * 0x36ee80L + 0x36ee80L) - l1) + 1000L);
            }
        }
    }

    static void d(CallsFragment callsfragment)
    {
        callsfragment.a();
    }

    static void e(CallsFragment callsfragment)
    {
        callsfragment.c();
    }

    static e7 f(CallsFragment callsfragment)
    {
        return callsfragment.g;
    }

    static ArrayList g(CallsFragment callsfragment)
    {
        return callsfragment.c;
    }

    static ao9 h(CallsFragment callsfragment)
    {
        return callsfragment.l;
    }

    public void a(CharSequence charsequence)
    {
        j = charsequence;
        g.getFilter().filter(charsequence);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
        bundle = getListView();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.setFastScrollEnabled(flag);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            bundle.setSelector(0x7f02063d);
        }
        bundle.setScrollbarFadingEnabled(true);
        bundle.setOnItemClickListener(new xd(this));
        g = new e7(this, null);
        setListAdapter(g);
        App.b(e);
        App.a(d);
        App.a(b);
        getView().findViewById(0x7f0b01db).setOnClickListener(new a_h(this));
        b();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 105 105: default 20
    //                   105 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 == -1)
        {
            intent = intent.getStringExtra(z[2]);
            App.b(App.az.e(intent), getActivity());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030028, viewgroup, false);
    }

    public void onDestroy()
    {
        Log.i(z[3]);
        super.onDestroy();
        App.a(e);
        App.b(d);
        App.b(b);
        l.a();
        App.au.ab().removeCallbacks(i);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 36
    //                   2131427334: 110
    //                   2131427347: 44;
           goto _L1 _L2 _L3
_L1:
        flag = super.onOptionsItemSelected(menuitem);
_L5:
        return flag;
_L3:
        if (!Voip.h())
        {
            break; /* Loop/switch isn't completed */
        }
        Log.w(z[0]);
        App.b(getActivity(), 0x7f0e0157, 0);
        if (App.am == 0) goto _L5; else goto _L4
_L4:
        menuitem = new Intent(getActivity(), com/whatsapp/ContactPicker);
        menuitem.putExtra(z[1], true);
        startActivityForResult(menuitem, 105);
        return true;
_L2:
        (new ClearCallLogDialogFragment()).show(getFragmentManager(), null);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[4];
        obj = "-\035:\tK6O0]^+\033cFJ-\b,@Q>O HS5O%[P4O\"JK0\031&\tI6\0063\t\\8\003/";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = ":\016/Eo0\f(LM";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = ":\000-]^:\033";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = ":\016/ELv\013&ZK+\000:";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 63;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 89;
          goto _L9
_L5:
        byte0 = 111;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 41;
          goto _L9
    }

    private class ClearCallLogDialogFragment extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new w9(this);
            return (new android.app.AlertDialog.Builder(getActivity())).setMessage(0x7f0e0094).setPositiveButton(0x7f0e02ba, bundle).setNeutralButton(0x7f0e007b, null).create();
        }

        public ClearCallLogDialogFragment()
        {
        }
    }

}
