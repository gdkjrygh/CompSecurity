// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.PhotoView;
import com.whatsapp.aka;
import com.whatsapp.iz;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, a_, m, b, 
//            a2

class a5 extends PagerAdapter
{

    private static final String z;
    final ImagePreview a;

    private a5(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    a5(ImagePreview imagepreview, a2 a2)
    {
        this(imagepreview);
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return ImagePreview.s(a).size();
    }

    public int getItemPosition(Object obj)
    {
        obj = (Uri)((View)obj).getTag();
        int j = ImagePreview.s(a).indexOf(obj);
        int i = j;
        if (j < 0)
        {
            i = -2;
        }
        return i;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = a.getLayoutInflater().inflate(0x7f030077, null, false);
        Object obj1 = (PhotoView)view.findViewById(0x7f0b00e7);
        if (ImagePreview.f(a))
        {
            ((PhotoView) (obj1)).setHeightForInitialScaleCalculation(ImagePreview.g(a));
        }
        Object obj = (Uri)ImagePreview.s(a).get(i);
        ImagePreview.a(a, ((PhotoView) (obj1)), ((Uri) (obj)));
        TextView textview = (TextView)view.findViewById(0x7f0b022b);
        obj1 = (ConversationTextEntry)view.findViewById(0x7f0b0182);
        ((ConversationTextEntry) (obj1)).setInputEnterDone(true);
        ((ConversationTextEntry) (obj1)).setOnEditorActionListener(new a_(this, ((ConversationTextEntry) (obj1))));
        ((ConversationTextEntry) (obj1)).setTag((new StringBuilder()).append(((Uri) (obj)).toString()).append(z).toString());
        ((ConversationTextEntry) (obj1)).setFilters(new InputFilter[] {
            new aka(160)
        });
        ((ConversationTextEntry) (obj1)).setText((CharSequence)ImagePreview.k(a).get(obj));
        ((ConversationTextEntry) (obj1)).addTextChangedListener(new m(this, ((ConversationTextEntry) (obj1)), textview, ((Uri) (obj))));
        iz.a(((TextView) (obj1)));
        obj = (ImageButton)view.findViewById(0x7f0b0167);
        ((ImageButton) (obj)).setOnClickListener(new b(this, ((ImageButton) (obj)), ((ConversationTextEntry) (obj1))));
        viewgroup.addView(view, 0);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "b\031eK".toCharArray();
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
        byte byte0 = 13;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 7;
          goto _L8
_L3:
        byte0 = 125;
          goto _L8
_L4:
        byte0 = 12;
          goto _L8
        byte0 = 63;
          goto _L8
    }
}
