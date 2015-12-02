// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.q;
import com.whatsapp.util.y;

// Referenced classes of package com.whatsapp:
//            App, Conversation, s, a1g, 
//            ConversationRow

class tp
    implements android.widget.AbsListView.OnScrollListener
{

    final Conversation a;
    private int b;

    tp(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        int l;
label0:
        {
            l = App.am;
            Conversation.c(a, i);
            Conversation.d(a, false);
            if (i + j >= a.U.getCount())
            {
                Conversation.d(a, true);
                if (l == 0)
                {
                    break label0;
                }
            }
            Conversation.d(a, false);
            a.aK.setTranscriptMode(0);
        }
label1:
        {
            int i1;
label2:
            {
                if (Conversation.X(a) == 0 || b == i || j == 0)
                {
                    break label1;
                }
                i1 = (int)(Conversation.S(a).g * 48F);
                if (i <= b || Conversation.Q(a) == null)
                {
                    break label2;
                }
                if (k - j == 0)
                {
                    Conversation.Q(a).setVisibility(8);
                    if (l == 0)
                    {
                        break label2;
                    }
                }
                if (((abslistview.getHeight() - i1) * i) / (k - j) + i1 < abslistview.getHeight() - i1)
                {
                    Conversation.Q(a).setVisibility(0);
                    if (Conversation.p(a) == null)
                    {
                        break label2;
                    }
                    Conversation.p(a).setVisibility(8);
                    if (l == 0)
                    {
                        break label2;
                    }
                }
                Conversation.Q(a).setVisibility(8);
            }
label3:
            {
                if (i >= b || Conversation.p(a) == null)
                {
                    break label3;
                }
                if (k - j == 0)
                {
                    Conversation.p(a).setVisibility(8);
                    if (l == 0)
                    {
                        break label3;
                    }
                }
                if (((abslistview.getHeight() - i1) * i) / (k - j) > i1)
                {
                    Conversation.p(a).setVisibility(0);
                    if (Conversation.Q(a) == null)
                    {
                        break label3;
                    }
                    Conversation.Q(a).setVisibility(8);
                    if (l == 0)
                    {
                        break label3;
                    }
                }
                Conversation.p(a).setVisibility(8);
            }
label4:
            {
label5:
                {
                    j = i - a.aK.getHeaderViewsCount();
                    if (j < 0)
                    {
                        break label4;
                    }
                    abslistview = (c4)a.U.getItem(j);
                    if (abslistview != null && !q.b(((c4) (abslistview)).I, System.currentTimeMillis()))
                    {
                        Conversation.O(a).setText(q.c(a, ((c4) (abslistview)).I));
                        Conversation.O(a).setTextSize(ConversationRow.a(a.getResources()));
                        if (Conversation.O(a).getVisibility() == 0)
                        {
                            break label5;
                        }
                        Conversation.O(a).setVisibility(0);
                        abslistview = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1F, 1, 0.0F);
                        abslistview.setDuration(200L);
                        Conversation.O(a).startAnimation(abslistview);
                        if (l == 0)
                        {
                            break label5;
                        }
                    }
                    Conversation.O(a).setVisibility(8);
                }
                if (l == 0)
                {
                    break label1;
                }
            }
            Conversation.O(a).setVisibility(8);
        }
        if (b != i && Conversation.X(a) != 0)
        {
            y.a(true);
        }
        b = i;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        boolean flag;
label0:
        {
            boolean flag1 = true;
            if (i != 0)
            {
                abslistview = a.aK;
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                abslistview.setFastScrollEnabled(flag);
                Conversation.N(a).removeCallbacks(Conversation.r(a));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.N(a).postDelayed(Conversation.r(a), 1000L);
        }
        Conversation.b(a, i);
        if (i != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        y.a(flag);
    }
}
