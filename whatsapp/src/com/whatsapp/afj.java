// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            App, Conversation, ak8, og, 
//            iz

class afj
    implements TextWatcher
{

    final Conversation a;

    afj(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
label0:
        {
            int i = App.am;
            String s = editable.toString();
            boolean flag;
            if (s.trim().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.whatsapp.Conversation.c(a).setEnabled(flag);
            if (Conversation.ac(a).getVisibility() == 8 && !flag)
            {
                Conversation.ac(a).startAnimation(ak8.a(true));
                Conversation.ac(a).setVisibility(0);
                if (App.a8())
                {
                    Conversation.B(a).startAnimation(Conversation.b(true));
                    Conversation.B(a).setVisibility(0);
                }
                com.whatsapp.Conversation.c(a).startAnimation(ak8.a(false));
                com.whatsapp.Conversation.c(a).setVisibility(8);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (Conversation.ac(a).getVisibility() == 0 && flag)
            {
                Conversation.ac(a).startAnimation(ak8.a(false));
                Conversation.ac(a).setVisibility(8);
                if (App.a8())
                {
                    Conversation.B(a).startAnimation(Conversation.b(false));
                    Conversation.B(a).setVisibility(8);
                }
                com.whatsapp.Conversation.c(a).startAnimation(ak8.a(true));
                com.whatsapp.Conversation.c(a).setVisibility(0);
            }
        }
label1:
        {
            if (Conversation.V(a))
            {
                break label1;
            }
            if (s.length() != 0)
            {
                App.a(a.aD.a, 0);
                if (i == 0)
                {
                    break label1;
                }
            }
            App.x(a.aD.a);
        }
        c.a(editable, a);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(Conversation.w(a), charsequence);
    }
}
