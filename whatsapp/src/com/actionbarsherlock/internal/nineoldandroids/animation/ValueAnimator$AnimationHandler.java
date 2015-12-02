// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Animator, ValueAnimator

class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag1;
        flag1 = Animator.a;
        arraylist = (ArrayList)ValueAnimator.access$000().get();
        arraylist1 = (ArrayList)ValueAnimator.access$100().get();
        message.what;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 53
    //                   1 544;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        boolean flag;
        message = (ArrayList)ValueAnimator.access$200().get();
        Object obj;
        ValueAnimator valueanimator;
        int i;
        int j;
        int k;
        int l;
        long l1;
        if (arraylist.size() > 0 || arraylist1.size() > 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
_L12:
        flag = i;
        if (message.size() <= 0) goto _L5; else goto _L4
_L4:
        obj = (ArrayList)message.clone();
        message.clear();
        k = ((ArrayList) (obj)).size();
        j = 0;
_L36:
        if (j >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        valueanimator = (ValueAnimator)((ArrayList) (obj)).get(j);
        if (ValueAnimator.access$300(valueanimator) != 0L) goto _L7; else goto _L6
_L6:
        ValueAnimator.access$400(valueanimator);
        if (!flag1) goto _L8; else goto _L7
_L7:
        arraylist1.add(valueanimator);
_L8:
        if (!flag1) goto _L10; else goto _L9
_L9:
        if (!flag1) goto _L12; else goto _L11
_L11:
        flag = i;
_L5:
        l1 = AnimationUtils.currentAnimationTimeMillis();
        obj = (ArrayList)ValueAnimator.access$500().get();
        message = (ArrayList)ValueAnimator.access$600().get();
        j = arraylist1.size();
        i = 0;
_L35:
        if (i >= j) goto _L14; else goto _L13
_L13:
        valueanimator = (ValueAnimator)arraylist1.get(i);
        if (ValueAnimator.access$700(valueanimator, l1))
        {
            ((ArrayList) (obj)).add(valueanimator);
        }
        if (!flag1) goto _L15; else goto _L14
_L14:
        j = ((ArrayList) (obj)).size();
        if (j <= 0) goto _L17; else goto _L16
_L16:
        i = 0;
_L34:
        if (i >= j) goto _L19; else goto _L18
_L18:
        valueanimator = (ValueAnimator)((ArrayList) (obj)).get(i);
        ValueAnimator.access$400(valueanimator);
        ValueAnimator.access$802(valueanimator, true);
        arraylist1.remove(valueanimator);
        if (!flag1) goto _L20; else goto _L19
_L19:
        ((ArrayList) (obj)).clear();
_L17:
        i = arraylist.size();
        k = 0;
_L33:
        if (k >= i) goto _L22; else goto _L21
_L21:
        obj = (ValueAnimator)arraylist.get(k);
        if (((ValueAnimator) (obj)).animationFrame(l1))
        {
            message.add(obj);
        }
        j = k;
        if (arraylist.size() != i) goto _L24; else goto _L23
_L23:
        l = k + 1;
        j = l;
        k = i;
        if (!flag1) goto _L26; else goto _L25
_L25:
        j = l;
_L24:
        k = i - 1;
        message.remove(obj);
_L26:
        if (!flag1) goto _L27; else goto _L22
_L22:
        if (message.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L32:
        if (i >= message.size()) goto _L29; else goto _L28
_L28:
        ValueAnimator.access$900((ValueAnimator)message.get(i));
        if (!flag1) goto _L30; else goto _L29
_L29:
        message.clear();
        if (!flag || arraylist.isEmpty() && arraylist1.isEmpty()) goto _L1; else goto _L31
_L31:
        sendEmptyMessageDelayed(1, Math.max(0L, ValueAnimator.access$1000() - (AnimationUtils.currentAnimationTimeMillis() - l1)));
        return;
_L30:
        i++;
          goto _L32
_L27:
        i = k;
        k = j;
          goto _L33
_L20:
        i++;
          goto _L34
_L15:
        i++;
          goto _L35
_L10:
        j++;
          goto _L36
_L3:
        flag = true;
          goto _L5
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
