// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class cz
{

    static void a(Context context, String s, String s1, String s2)
    {
        context = context.getSharedPreferences(s, 0).edit();
        context.putString(s1, s2);
        a(((android.content.SharedPreferences.Editor) (context)));
    }

    static void a(android.content.SharedPreferences.Editor editor)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                editor.apply();
                if (!DataLayer.a)
                {
                    break label0;
                }
            }
            (new Thread(new _cls1(editor))).start();
        }
    }

    private class _cls1
        implements Runnable
    {

        final android.content.SharedPreferences.Editor atL;

        public void run()
        {
            atL.commit();
        }

        _cls1(android.content.SharedPreferences.Editor editor)
        {
            atL = editor;
            super();
        }
    }

}
