// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class val.moves
    implements Runnable
{

    final DefaultItemAnimator this$0;
    final ArrayList val$moves;

    public void run()
    {
        veInfo veinfo;
        for (Iterator iterator = val$moves.iterator(); iterator.hasNext(); DefaultItemAnimator.access$000(DefaultItemAnimator.this, veinfo.holder, veinfo.fromX, veinfo.fromY, veinfo.toX, veinfo.toY))
        {
            veinfo = (veInfo)iterator.next();
        }

        val$moves.clear();
        DefaultItemAnimator.access$100(DefaultItemAnimator.this).remove(val$moves);
    }

    veInfo()
    {
        this$0 = final_defaultitemanimator;
        val$moves = ArrayList.this;
        super();
    }
}
