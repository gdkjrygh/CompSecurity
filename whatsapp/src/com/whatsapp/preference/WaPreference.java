// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.iz;

// Referenced classes of package com.whatsapp.preference:
//            WaListPreference

public class WaPreference extends Preference
{

    private static final String z[];
    private int a;

    public WaPreference(Context context)
    {
        super(context);
    }

    public WaPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT < 11 && attributeset != null)
        {
            a = attributeset.getAttributeResourceValue(z[1], z[0], 0);
        }
    }

    public WaPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (android.os.Build.VERSION.SDK_INT < 11 && attributeset != null)
        {
            a = attributeset.getAttributeResourceValue(z[3], z[2], 0);
        }
    }

    public static View a(View view)
    {
        iz.a(view);
        if (!App.aR())
        {
            View view1 = view.findViewById(0x1020016);
            if (view1 != null)
            {
                view1.getLayoutParams().width = -1;
            }
            view1 = view.findViewById(0x1020010);
            if (view1 != null)
            {
                view1.getLayoutParams().width = -1;
            }
        }
        return view;
    }

    protected void onBindView(View view)
    {
label0:
        {
label1:
            {
                super.onBindView(view);
                if (a == 0)
                {
                    break label0;
                }
                view = view.findViewById(0x1020016);
                if (view == null || !(view instanceof TextView))
                {
                    break label0;
                }
                view = (TextView)view;
                if (App.aR())
                {
                    view.setCompoundDrawablesWithIntrinsicBounds(a, 0, 0, 0);
                    if (!WaListPreference.a)
                    {
                        break label1;
                    }
                }
                view.setCompoundDrawablesWithIntrinsicBounds(0, 0, a, 0);
            }
            view.setCompoundDrawablePadding(getContext().getResources().getDimensionPixelSize(0x7f0a0040));
        }
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return a(super.onCreateView(viewgroup));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "2mF\026";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "3z]\b-t!Z\033\177>cH\0139:`M\nx2j\007\033x6!H\b|t|L\0138:`M\nx2j";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "2mF\026";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "3z]\b-t!Z\033\177>cH\0139:`M\nx2j\007\033x6!H\b|t|L\0138:`M\nx2j";
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
        char c = obj[j];
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
        byte byte0 = 23;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 91;
          goto _L9
_L5:
        byte0 = 14;
          goto _L9
_L6:
        byte0 = 41;
          goto _L9
        byte0 = 120;
          goto _L9
    }
}
