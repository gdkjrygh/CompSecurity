// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            IJREVersion

public static abstract class 
{

    static final boolean _JRE_1_2_PLUS;
    static final boolean _JRE_1_3_PLUS;
    static final boolean _JRE_1_4_PLUS;
    static final boolean _JRE_SUN_SIGNAL_COMPATIBLE;

    static 
    {
        boolean flag;
        boolean flag1;
        flag = false;
        if ((java/lang/SecurityManager.getModifiers() & 0x400) == 0)
        {
            flag = true;
        }
        _JRE_1_2_PLUS = flag;
        flag1 = false;
        flag = flag1;
        if (!_JRE_1_2_PLUS)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        StrictMath.abs(1.0D);
        flag = true;
_L1:
        _JRE_1_3_PLUS = flag;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        flag1 = false;
        " ".subSequence(0, 0);
        flag1 = true;
_L2:
        _JRE_1_4_PLUS = flag1;
        _JRE_SUN_SIGNAL_COMPATIBLE = false;
        return;
        Object obj;
        obj;
        flag = flag1;
          goto _L1
        obj;
          goto _L2
    }

    private ()
    {
    }
}
