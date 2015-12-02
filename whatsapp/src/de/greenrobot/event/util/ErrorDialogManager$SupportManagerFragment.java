// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import de.greenrobot.event.g;

// Referenced classes of package de.greenrobot.event.util:
//            a, h, k, e

public class  extends Fragment
{

    private static final String z[];
    protected Bundle b;
    protected boolean c;
    private Object d;
    private boolean e;
    private g f;

    public static void a(Activity activity, Object obj, boolean flag, Bundle bundle)
    {
        int i = a.b;
        FragmentManager fragmentmanager = ((FragmentActivity)activity).getSupportFragmentManager();
          = ()fragmentmanager.findFragmentByTag(z[3]);
        activity = ;
        if ( == null)
        {
            activity = new <init>();
            fragmentmanager.beginTransaction().add(activity, z[2]).commit();
            fragmentmanager.executePendingTransactions();
        }
        activity.c = flag;
        activity.b = bundle;
        activity.d = obj;
        if (g.n)
        {
            a.b = i + 1;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = de.greenrobot.event.util.h.g.a.a();
        f.c(this);
        e = true;
    }

    public void onEventMainThread(e e1)
    {
        if (h.a(d, e1))
        {
            h.a(e1);
            FragmentManager fragmentmanager = getFragmentManager();
            fragmentmanager.executePendingTransactions();
            DialogFragment dialogfragment = (DialogFragment)fragmentmanager.findFragmentByTag(z[1]);
            if (dialogfragment != null)
            {
                dialogfragment.dismiss();
            }
            e1 = (DialogFragment)de.greenrobot.event.util.h.g.a(e1, c, b);
            if (e1 != null)
            {
                e1.show(fragmentmanager, z[0]);
                return;
            }
        }
    }

    public void onPause()
    {
        f.e(this);
        super.onPause();
    }

    public void onResume()
    {
label0:
        {
            super.onResume();
            if (e)
            {
                e = false;
                if (a.b == 0)
                {
                    break label0;
                }
            }
            f = de.greenrobot.event.util.h.g.a.a();
            f.c(this);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "$jmpG%j-eZ\"`79P6j-cW5|mrG2`1HQ)n/xR";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "$jmpG%j-eZ\"`79P6j-cW5|mrG2`1HQ)n/xR";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "$jmpG%j-eZ\"`79P6j-cW5|mrG2`1HQ)n/xR\037b\"yT'j1";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "$jmpG%j-eZ\"`79P6j-cW5|mrG2`1HQ)n/xR\037b\"yT'j1";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 53;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 15;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 23;
          goto _L9
    }

    public ()
    {
    }
}
