// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            e0, akk, HomeActivity, ConversationsFragment, 
//            CallsFragment, ContactsFragment

class wy extends FragmentStatePagerAdapter
    implements e0
{

    private static final String z[];
    final HomeActivity a;
    akk b[];

    public wy(HomeActivity homeactivity, FragmentManager fragmentmanager)
    {
        a = homeactivity;
        super(fragmentmanager);
        b = new akk[3];
    }

    private akk a(int i)
    {
        if (b[i] == null)
        {
            akk akk1 = new akk(null);
            akk1.d = a.getLayoutInflater().inflate(0x7f030074, null, false);
            akk1.b = (TextView)akk1.d.findViewById(0x7f0b020d);
            akk1.b.setText(getPageTitle(i));
            akk1.c = (TextView)akk1.d.findViewById(0x7f0b020e);
            b[i] = akk1;
        }
        return b[i];
    }

    static akk a(wy wy1, int i)
    {
        return wy1.a(i);
    }

    public View a(int i)
    {
        return a(i).d;
    }

    public int getCount()
    {
        return 3;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException(z[1]);

        case 1: // '\001'
            ConversationsFragment conversationsfragment;
            try
            {
                conversationsfragment = new ConversationsFragment();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return conversationsfragment;

        case 0: // '\0'
            return new CallsFragment();

        case 2: // '\002'
            return new ContactsFragment();
        }
    }

    public CharSequence getPageTitle(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException(z[0]);

        case 1: // '\001'
            String s;
            try
            {
                s = a.getString(0x7f0e008e).toUpperCase();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s;

        case 0: // '\0'
            return a.getString(0x7f0e0073).toUpperCase();

        case 2: // '\002'
            return a.getString(0x7f0e00d9).toUpperCase();
        }
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        super.setPrimaryItem(viewgroup, i, obj);
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "\024>x@643p@//%t\0246/8=\0237/#q\004\177\"3=\f:3%=\017-`3l\025>,vi\017es".toCharArray();
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
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 95;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 86;
          goto _L9
_L6:
        byte0 = 29;
          goto _L9
        byte0 = 96;
          goto _L9
    }
}
