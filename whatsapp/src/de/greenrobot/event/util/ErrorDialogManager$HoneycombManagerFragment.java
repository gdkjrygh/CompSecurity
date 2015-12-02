// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import de.greenrobot.event.g;

// Referenced classes of package de.greenrobot.event.util:
//            h, a, k, e

public class  extends Fragment
{

    private static final String z[];
    private Object a;
    protected Bundle b;
    protected boolean c;
    private g d;

    public static void a(Activity activity, Object obj, boolean flag, Bundle bundle)
    {
        FragmentManager fragmentmanager = activity.getFragmentManager();
          = ()fragmentmanager.findFragmentByTag(z[0]);
        activity = ;
        if ( == null)
        {
            activity = new <init>();
            fragmentmanager.beginTransaction().add(activity, z[1]).commit();
            fragmentmanager.executePendingTransactions();
        }
        activity.c = flag;
        activity.b = bundle;
        activity.a = obj;
    }

    public void onEventMainThread(e e)
    {
        if (h.a(a, e))
        {
            h.a(e);
            FragmentManager fragmentmanager = getFragmentManager();
            fragmentmanager.executePendingTransactions();
            DialogFragment dialogfragment = (DialogFragment)fragmentmanager.findFragmentByTag(z[2]);
            if (dialogfragment != null)
            {
                dialogfragment.dismiss();
            }
            e = (DialogFragment)de.greenrobot.event.util.h.g.a(e, c, b);
            if (e != null)
            {
                e.show(fragmentmanager, z[3]);
                return;
            }
        }
    }

    public void onPause()
    {
        d.e(this);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        d = de.greenrobot.event.util.h.g.a.a();
        d.c(this);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "xB\022SNyBRFS~HH\032YjBR@^iT\022QNnHNkXuFP[[CJ]Z]{BN";
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
                obj = "xB\022SNyBRFS~HH\032YjBR@^iT\022QNnHNkXuFP[[CJ]Z]{BN";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "xB\022SNyBRFS~HH\032YjBR@^iT\022QNnHNkXuFP[[";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "xB\022SNyBRFS~HH\032YjBR@^iT\022QNnHNkXuFP[[";
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
        byte byte0 = 60;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 28;
          goto _L9
_L5:
        byte0 = 39;
          goto _L9
_L6:
        byte0 = 60;
          goto _L9
        byte0 = 52;
          goto _L9
    }

    public ()
    {
    }
}
