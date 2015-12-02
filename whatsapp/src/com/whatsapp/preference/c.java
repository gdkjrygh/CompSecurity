// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.ConversationRowText;

// Referenced classes of package com.whatsapp.preference:
//            WaListPreference, WaFontListPreference

class c extends BaseAdapter
{

    final CharSequence a[];
    final CharSequence b[];
    final WaFontListPreference c;

    c(WaFontListPreference wafontlistpreference, CharSequence acharsequence[], CharSequence acharsequence1[])
    {
        c = wafontlistpreference;
        a = acharsequence;
        b = acharsequence1;
        super();
    }

    public int getCount()
    {
        return a.length;
    }

    public Object getItem(int i)
    {
        return b[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag;
        flag = WaListPreference.a;
        view = LayoutInflater.from(c.getContext()).inflate(0x1090003, null, false);
        viewgroup = (TextView)view.findViewById(0x1020014);
        i;
        JVM INSTR tableswitch 0 2: default 60
    //                   0 94
    //                   1 60
    //                   2 102;
           goto _L1 _L2 _L1 _L3
_L1:
        int j = 0;
_L4:
        viewgroup.setTextSize(ConversationRowText.a(c.getContext().getResources(), j));
        viewgroup.setText(a[i]);
        return view;
_L2:
        j = -1;
        if (!flag) goto _L4; else goto _L3
_L3:
        j = 1;
        if (!flag) goto _L4; else goto _L1
    }
}
