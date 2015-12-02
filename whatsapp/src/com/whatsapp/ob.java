// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, Conversation, s

class ob
    implements android.view.View.OnTouchListener
{

    final Conversation a;

    ob(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
label1:
            {
                int i = App.am;
                if (motionevent.getAction() != 1 || Conversation.ab(a).size() <= 0)
                {
                    break label0;
                }
                if (Conversation.n(a))
                {
                    a.U.getCursor().requery();
                    Conversation.b(a, false);
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                view = Conversation.ab(a).iterator();
                do
                {
                    if (!view.hasNext())
                    {
                        break;
                    }
                    motionevent = (c4)view.next();
                    if (!((c4) (motionevent)).y.b)
                    {
                        Conversation.c(a, motionevent);
                    }
                } while (i == 0);
                a.U.notifyDataSetChanged();
                Conversation.M(a);
            }
            Conversation.ab(a).clear();
        }
        return false;
    }
}
