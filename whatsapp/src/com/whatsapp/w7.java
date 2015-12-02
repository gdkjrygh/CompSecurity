// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            MediaView, App

class w7 extends PagerAdapter
{

    private static final String z;
    private c4 a;
    final MediaView b;

    public w7(MediaView mediaview, c4 c4_1)
    {
        b = mediaview;
        super();
        a = c4_1;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public void finishUpdate(View view)
    {
        if (a != null)
        {
            com.whatsapp.MediaView.a(b, a, 0);
            a = null;
        }
    }

    public int getCount()
    {
        return MediaView.m(b).size();
    }

    public int getItemPosition(Object obj)
    {
        int i;
        int j;
        int l;
        l = App.am;
        obj = (a)((View)obj).getTag();
        if (obj == null)
        {
            return -2;
        }
        j = -1;
        i = 0;
_L5:
        int k = j;
        if (i >= MediaView.m(b).size()) goto _L2; else goto _L1
_L1:
        if (((a) (obj)).equals(((c4)MediaView.m(b).get(i)).y))
        {
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_114;
            }
            j = i;
        }
        if (l == 0) goto _L4; else goto _L3
_L3:
        k = j;
_L2:
        if (k < 0)
        {
            return -2;
        } else
        {
            return MediaView.m(b).size() - 1 - k;
        }
_L4:
        i++;
          goto _L5
        k = i;
          goto _L2
    }

    public CharSequence getPageTitle(int i)
    {
        return "";
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        c4 c4_1 = MediaView.b(b, i);
        Log.i((new StringBuilder()).append(z).append(c4_1.y.c).toString());
        View view = MediaView.c(b, c4_1);
        view.setTag(c4_1.y);
        viewgroup.addView(view, 0);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void startUpdate(View view)
    {
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\t5\rvc\0229\fh-\r>\032kc\n$\000~v\001\031\035zoK".toCharArray();
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
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 2;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 100;
          goto _L8
_L3:
        byte0 = 80;
          goto _L8
_L4:
        byte0 = 105;
          goto _L8
        byte0 = 31;
          goto _L8
    }
}
