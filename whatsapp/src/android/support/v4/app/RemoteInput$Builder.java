// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

public final class mResultKey
{

    private static final String z;
    private boolean mAllowFreeFormInput;
    private CharSequence mChoices[];
    private Bundle mExtras;
    private CharSequence mLabel;
    private final String mResultKey;

    public RemoteInput build()
    {
        return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormInput, mExtras);
    }

    public mExtras setChoices(CharSequence acharsequence[])
    {
        mChoices = acharsequence;
        return this;
    }

    public mChoices setLabel(CharSequence charsequence)
    {
        mLabel = charsequence;
        return this;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "r*C-?To[=*\000,Q6tToR=sN:\\4".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 83;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 32;
          goto _L8
_L3:
        byte0 = 79;
          goto _L8
_L4:
        byte0 = 48;
          goto _L8
        byte0 = 88;
          goto _L8
    }

    public (String s)
    {
        mAllowFreeFormInput = true;
        mExtras = new Bundle();
        if (s == null)
        {
            throw new IllegalArgumentException(z);
        } else
        {
            mResultKey = s;
            return;
        }
    }
}
