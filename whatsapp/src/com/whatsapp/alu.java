// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.text.TextDirectionHeuristicCompat;

// Referenced classes of package com.whatsapp:
//            App

final class alu
    implements TextDirectionHeuristicCompat
{

    alu()
    {
    }

    public boolean isRtl(CharSequence charsequence, int i, int j)
    {
        int k;
        int l;
        l = App.am;
        k = i;
_L6:
        int i1;
        int j1;
        if (k >= i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = Character.codePointAt(charsequence, k);
        j1 = Character.charCount(i1);
        if (i1 >= 0x1f1e6 && i1 <= 0x1f1ff) goto _L2; else goto _L1
_L1:
        Character.getDirectionality(i1);
        JVM INSTR lookupswitch 7: default 116
    //                   0: 128
    //                   1: 130
    //                   2: 130
    //                   14: 128
    //                   15: 128
    //                   16: 130
    //                   17: 130;
           goto _L2 _L3 _L4 _L4 _L3 _L3 _L4 _L4
_L3:
        break; /* Loop/switch isn't completed */
_L2:
        k += j1;
        if (l == 0) goto _L6; else goto _L5
_L5:
        return false;
_L4:
        return true;
    }
}
