// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import android.support.v4.app.Fragment;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicsCompat

class mLookForRtl
    implements ionAlgorithm
{

    public static final mLookForRtl INSTANCE_LTR = new <init>(false);
    public static final <init> INSTANCE_RTL = new <init>(true);
    private final boolean mLookForRtl;

    public int checkRtl(CharSequence charsequence, int i, int j)
    {
        boolean flag1;
        int k;
        boolean flag2;
        flag2 = TextDirectionHeuristicsCompat.a;
        flag1 = false;
        k = i;
_L5:
        boolean flag;
        flag = flag1;
        if (k >= i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        TextDirectionHeuristicsCompat.access$200(Character.getDirectionality(charsequence.charAt(k)));
        JVM INSTR tableswitch 0 1: default 60
    //                   0 93
    //                   1 115;
           goto _L1 _L2 _L3
_L1:
        flag = flag1;
_L13:
        k++;
        flag1 = flag;
        if (!flag2) goto _L5; else goto _L4
_L4:
        if (!flag) goto _L7; else goto _L6
_L6:
        if (!mLookForRtl) goto _L9; else goto _L8
_L8:
        return 1;
_L2:
        if (mLookForRtl)
        {
            return 0;
        }
        if (!flag2) goto _L11; else goto _L10
_L10:
        Fragment.a++;
_L3:
        if (!mLookForRtl) goto _L8; else goto _L12
_L12:
        flag = true;
          goto _L13
_L9:
        return 0;
_L7:
        return 2;
_L11:
        flag = true;
          goto _L13
    }


    private ionAlgorithm(boolean flag)
    {
        mLookForRtl = flag;
    }
}
