// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            App, ContactsFragment, a19, ft, 
//            og, Conversation, au2, dx

class aot
    implements android.widget.AdapterView.OnItemClickListener
{

    final ContactsFragment a;

    aot(ContactsFragment contactsfragment)
    {
        a = contactsfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        int j = App.am;
        if (ContactsFragment.c(a) != null) goto _L2; else goto _L1
_L1:
        if (!a19.a(ContactsFragment.j(a), i)) goto _L4; else goto _L3
_L3:
        ft.a(o.TELL_A_FRIEND, l.CONTACTS_LIST);
        App.c(a.getActivity());
        if (j == 0) goto _L5; else goto _L4
_L4:
        if (!a19.c(ContactsFragment.j(a), i)) goto _L7; else goto _L6
_L6:
        ContactsFragment.e(a);
        if (j == 0) goto _L5; else goto _L7
_L7:
        if (!a19.b(ContactsFragment.j(a), i)) goto _L8; else goto _L5
_L5:
        return;
_L8:
        adapterview = ContactsFragment.j(a).a(i);
        if (((og) (adapterview)).t)
        {
            a.startActivity(Conversation.a(adapterview));
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        ContactsFragment.a(a, adapterview);
        if (j == 0) goto _L5; else goto _L2
_L2:
        if (!a19.a(ContactsFragment.j(a), i) && !a19.c(ContactsFragment.j(a), i) && !a19.b(ContactsFragment.j(a), i))
        {
            adapterview = ContactsFragment.j(a).a(i);
            if (((og) (adapterview)).t)
            {
label0:
                {
                    if (ContactsFragment.c(a).containsKey(((og) (adapterview)).a))
                    {
                        ContactsFragment.c(a).remove(((og) (adapterview)).a);
                        view.setBackgroundResource(0);
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                    if (au2.i > 0 && ContactsFragment.c(a).size() >= au2.i)
                    {
                        ((dx)a.getActivity()).f(String.format(a.getString(0x7f0e0062), new Object[] {
                            Integer.valueOf(au2.i)
                        }));
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                    ContactsFragment.c(a).put(((og) (adapterview)).a, adapterview);
                    view.setBackgroundResource(0x7f02013c);
                }
                ContactsFragment.i(a);
                return;
            }
        }
        if (true) goto _L5; else goto _L9
_L9:
    }
}
