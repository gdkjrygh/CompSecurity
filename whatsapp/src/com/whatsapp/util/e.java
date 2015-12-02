// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;

// Referenced classes of package com.whatsapp.util:
//            f

final class e
    implements android.view.LayoutInflater.Factory
{

    private static final String z;
    final Activity a;

    e(Activity activity)
    {
        a = activity;
        super();
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        if (!s.equalsIgnoreCase(z))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s = (ViewGroup)context.getClassLoader().loadClass(s).asSubclass(android/view/ViewGroup).getConstructor(new Class[] {
            android/content/Context, android/util/AttributeSet
        }).newInstance(new Object[] {
            context, attributeset
        });
        (new Handler()).post(new f(this, s));
        return s;
        s;
        return null;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "~i$\013\031sb;J\021y( K\fxt'D\0243p @\0173k,K\r3J V\fPc'P1ic$s\021xq".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 120;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 29;
          goto _L8
_L3:
        byte0 = 6;
          goto _L8
_L4:
        byte0 = 73;
          goto _L8
        byte0 = 37;
          goto _L8
    }
}
