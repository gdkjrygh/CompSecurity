// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.fieldstats.as;
import com.whatsapp.fieldstats.ax;
import com.whatsapp.fieldstats.z;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, App, ad5, vw, 
//            ar, iz

public class SearchFAQ extends DialogToastListActivity
{

    private static final String z[];
    private String i;
    private String j;
    private HashMap k;
    private String l;
    private ArrayList m;
    private String n;
    private ax o;

    public SearchFAQ()
    {
    }

    static String a(SearchFAQ searchfaq)
    {
        return searchfaq.i;
    }

    static String a(SearchFAQ searchfaq, String s)
    {
        searchfaq.n = s;
        return s;
    }

    public static void a(Context context, String s, String s1, ArrayList arraylist, String s2, int i1, ArrayList arraylist1, ArrayList arraylist2, 
            ArrayList arraylist3)
    {
        Intent intent = new Intent(context, com/whatsapp/SearchFAQ);
        intent.putExtra(z[15], s);
        intent.putExtra(z[14], s1);
        intent.putExtra(z[16], s2);
        intent.putExtra(z[12], i1);
        intent.putStringArrayListExtra(z[18], arraylist1);
        intent.putStringArrayListExtra(z[13], arraylist2);
        intent.putStringArrayListExtra(z[17], arraylist3);
        intent.putParcelableArrayListExtra(z[11], arraylist);
        context.startActivity(intent);
    }

    static ax b(SearchFAQ searchfaq)
    {
        return searchfaq.o;
    }

    static String c(SearchFAQ searchfaq)
    {
        return searchfaq.j;
    }

    static String d(SearchFAQ searchfaq)
    {
        return searchfaq.l;
    }

    static ArrayList e(SearchFAQ searchfaq)
    {
        return searchfaq.m;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 1 && j1 == -1)
        {
            double d2 = Double.valueOf(intent.getLongExtra(z[1], 0L)).doubleValue();
            double d1;
            if (k.containsKey(n))
            {
                d1 = ((Double)k.get(n)).doubleValue() + d2;
            } else
            {
                d1 = d2;
            }
            try
            {
                k.put(n, Double.valueOf(d1));
                if (o.c == null)
                {
                    o.c = Double.valueOf(0.0D);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (d1 > o.c.doubleValue())
            {
                try
                {
                    o.i = Double.valueOf(n);
                    o.c = Double.valueOf(d1);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    Log.e((new StringBuilder()).append(z[0]).append(n).toString());
                }
            }
            try
            {
                if (o.l == null)
                {
                    o.l = Double.valueOf(0.0D);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            intent = o;
            intent.l = Double.valueOf(d2 + ((ax) (intent)).l.doubleValue());
        }
    }

    public void onCreate(Bundle bundle)
    {
        int j1 = App.am;
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f03009d);
        Object obj1 = getIntent();
        i = ((Intent) (obj1)).getStringExtra(z[7]);
        j = ((Intent) (obj1)).getStringExtra(z[9]);
        l = ((Intent) (obj1)).getStringExtra(z[10]);
        m = ((Intent) (obj1)).getParcelableArrayListExtra(z[2]);
        o = new ax();
        o.j = j;
        o.n = Double.valueOf(as.PROBLEM_DESCRIPTION.getCode());
        k = new HashMap();
        ((Button)findViewById(0x7f0b028f)).setOnClickListener(new ad5(this));
        bundle = ((Intent) (obj1)).getStringArrayListExtra(z[5]);
        Object obj = ((Intent) (obj1)).getStringArrayListExtra(z[6]);
        ArrayList arraylist = ((Intent) (obj1)).getStringArrayListExtra(z[8]);
        int k1 = ((Intent) (obj1)).getIntExtra(z[4], 0);
        obj1 = new ArrayList();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < k1)
                {
                    ((ArrayList) (obj1)).add(new vw(this, (String)bundle.get(i1), (String)((ArrayList) (obj)).get(i1), (String)arraylist.get(i1)));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                bundle = new ar(this, this, 0x7f03009f, ((java.util.List) (obj1)));
                obj = getListView();
                ((ListView) (obj)).addHeaderView(iz.a((LayoutInflater)getSystemService(z[3]), 0x7f03009e, null));
                setListAdapter(bundle);
                registerForContextMenu(((android.view.View) (obj)));
                return;
            }
            i1++;
        } while (true);
    }

    protected Dialog onCreateDialog(int i1)
    {
        ProgressDialog progressdialog;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 1: // '\001'
            progressdialog = new ProgressDialog(this);
            break;
        }
        progressdialog.setMessage(getString(0x7f0e032c));
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        return progressdialog;
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.whatsapp.fieldstats.z.a(this, o);
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as1 = new String[19];
        obj = ":hb\027e_jq\nd\026twXs\020or\024r_ue\f7\020|0";
        byte0 = -1;
        i1 = 0;
_L2:
        String as2[];
        int j1;
        int k1;
        as2 = as1;
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
                as2[i1] = ((String) (obj));
                obj = "\013ud\031{ ny\025r i`\035y\013";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i1] = ((String) (obj));
                obj = "\036tt\nx\026~>\021y\013\177~\f9\032bd\nvQID*R>W";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i1] = ((String) (obj));
                obj = "\023{i\027b\013Ey\026q\023{d\035e";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i1] = ((String) (obj));
                i1 = 4;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\033x\ntd";
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i1] = ((String) (obj));
                i1 = 5;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\f~\013vu\013";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i1] = ((String) (obj));
                i1 = 6;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\034r\fyb\021g\013s\177\026d";
                byte0 = 5;
                break;

            case 5: // '\005'
                as2[i1] = ((String) (obj));
                i1 = 7;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\036e\020w";
                byte0 = 6;
                break;

            case 6: // '\006'
                as2[i1] = ((String) (obj));
                i1 = 8;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\re\023i";
                byte0 = 7;
                break;

            case 7: // '\007'
                as2[i1] = ((String) (obj));
                i1 = 9;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\be\020x|\035z";
                byte0 = 8;
                break;

            case 8: // '\b'
                as2[i1] = ((String) (obj));
                i1 = 10;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\013c\036ne\013";
                byte0 = 9;
                break;

            case 9: // '\t'
                as2[i1] = ((String) (obj));
                i1 = 11;
                obj = "\036tt\nx\026~>\021y\013\177~\f9\032bd\nvQID*R>W";
                byte0 = 10;
                break;

            case 10: // '\n'
                as2[i1] = ((String) (obj));
                i1 = 12;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\033x\ntd";
                byte0 = 11;
                break;

            case 11: // '\013'
                as2[i1] = ((String) (obj));
                i1 = 13;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\034r\fyb\021g\013s\177\026d";
                byte0 = 12;
                break;

            case 12: // '\f'
                as2[i1] = ((String) (obj));
                i1 = 14;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\be\020x|\035z";
                byte0 = 13;
                break;

            case 13: // '\r'
                as2[i1] = ((String) (obj));
                i1 = 15;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\036e\020w";
                byte0 = 14;
                break;

            case 14: // '\016'
                as2[i1] = ((String) (obj));
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\013c\036ne\013";
                byte0 = 15;
                i1 = 16;
                break;

            case 15: // '\017'
                as2[i1] = ((String) (obj));
                i1 = 17;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\re\023i";
                byte0 = 16;
                break;

            case 16: // '\020'
                as2[i1] = ((String) (obj));
                i1 = 18;
                obj = "\034u}V`\027{d\013v\017j>+r\036hs\020Q>K>\f~\013vu\013";
                byte0 = 17;
                break;

            case 17: // '\021'
                as2[i1] = ((String) (obj));
                z = as1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 500
    //                   0 523
    //                   1 530
    //                   2 537
    //                   3 544;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_544;
_L3:
        byte byte1 = 23;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 127;
          goto _L9
_L5:
        byte1 = 26;
          goto _L9
_L6:
        byte1 = 16;
          goto _L9
        byte1 = 120;
          goto _L9
    }
}
