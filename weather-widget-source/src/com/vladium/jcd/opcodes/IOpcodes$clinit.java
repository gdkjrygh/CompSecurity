// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.opcodes;


// Referenced classes of package com.vladium.jcd.opcodes:
//            IOpcodes

public static final class 
{

    static final boolean _BRANCHES[];
    static final boolean _COMPOUND_CONDITIONAL_BRANCHES[];
    static final boolean _CONDITIONAL_BRANCHES[];
    static final int _NARROW_SIZE[];
    static final boolean _UNCONDITIONAL_BRANCHES[];
    static final int _WIDE_SIZE[];

    static 
    {
        int i1 = IOpcodes.MNEMONICS.length;
        _CONDITIONAL_BRANCHES = new boolean[i1];
        _CONDITIONAL_BRANCHES[153] = true;
        _CONDITIONAL_BRANCHES[155] = true;
        _CONDITIONAL_BRANCHES[158] = true;
        _CONDITIONAL_BRANCHES[154] = true;
        _CONDITIONAL_BRANCHES[157] = true;
        _CONDITIONAL_BRANCHES[156] = true;
        _CONDITIONAL_BRANCHES[198] = true;
        _CONDITIONAL_BRANCHES[199] = true;
        _CONDITIONAL_BRANCHES[159] = true;
        _CONDITIONAL_BRANCHES[160] = true;
        _CONDITIONAL_BRANCHES[161] = true;
        _CONDITIONAL_BRANCHES[163] = true;
        _CONDITIONAL_BRANCHES[164] = true;
        _CONDITIONAL_BRANCHES[162] = true;
        _CONDITIONAL_BRANCHES[165] = true;
        _CONDITIONAL_BRANCHES[166] = true;
        _COMPOUND_CONDITIONAL_BRANCHES = new boolean[i1];
        _COMPOUND_CONDITIONAL_BRANCHES[170] = true;
        _COMPOUND_CONDITIONAL_BRANCHES[171] = true;
        _UNCONDITIONAL_BRANCHES = new boolean[i1];
        _UNCONDITIONAL_BRANCHES[167] = true;
        _UNCONDITIONAL_BRANCHES[200] = true;
        _UNCONDITIONAL_BRANCHES[168] = true;
        _UNCONDITIONAL_BRANCHES[201] = true;
        _UNCONDITIONAL_BRANCHES[169] = true;
        _UNCONDITIONAL_BRANCHES[172] = true;
        _UNCONDITIONAL_BRANCHES[173] = true;
        _UNCONDITIONAL_BRANCHES[174] = true;
        _UNCONDITIONAL_BRANCHES[175] = true;
        _UNCONDITIONAL_BRANCHES[176] = true;
        _UNCONDITIONAL_BRANCHES[177] = true;
        _UNCONDITIONAL_BRANCHES[191] = true;
        _BRANCHES = new boolean[i1];
        for (int i = 0; i < i1; i++)
        {
            if (_CONDITIONAL_BRANCHES[i])
            {
                _BRANCHES[i] = true;
            }
        }

        for (int j = 0; j < i1; j++)
        {
            if (_COMPOUND_CONDITIONAL_BRANCHES[j])
            {
                _BRANCHES[j] = true;
            }
        }

        for (int k = 0; k < i1; k++)
        {
            if (_UNCONDITIONAL_BRANCHES[k])
            {
                _BRANCHES[k] = true;
            }
        }

        _NARROW_SIZE = new int[i1];
        for (int l = 0; l < i1; l++)
        {
            _NARROW_SIZE[l] = 1;
        }

        _NARROW_SIZE[16] = 2;
        _NARROW_SIZE[17] = 3;
        _NARROW_SIZE[18] = 2;
        _NARROW_SIZE[19] = 3;
        _NARROW_SIZE[20] = 3;
        _NARROW_SIZE[21] = 2;
        _NARROW_SIZE[22] = 2;
        _NARROW_SIZE[23] = 2;
        _NARROW_SIZE[24] = 2;
        _NARROW_SIZE[25] = 2;
        _NARROW_SIZE[54] = 2;
        _NARROW_SIZE[55] = 2;
        _NARROW_SIZE[56] = 2;
        _NARROW_SIZE[57] = 2;
        _NARROW_SIZE[58] = 2;
        _NARROW_SIZE[132] = 3;
        _NARROW_SIZE[153] = 3;
        _NARROW_SIZE[154] = 3;
        _NARROW_SIZE[155] = 3;
        _NARROW_SIZE[156] = 3;
        _NARROW_SIZE[157] = 3;
        _NARROW_SIZE[158] = 3;
        _NARROW_SIZE[159] = 3;
        _NARROW_SIZE[160] = 3;
        _NARROW_SIZE[161] = 3;
        _NARROW_SIZE[162] = 3;
        _NARROW_SIZE[163] = 3;
        _NARROW_SIZE[164] = 3;
        _NARROW_SIZE[165] = 3;
        _NARROW_SIZE[166] = 3;
        _NARROW_SIZE[167] = 3;
        _NARROW_SIZE[168] = 3;
        _NARROW_SIZE[198] = 3;
        _NARROW_SIZE[199] = 3;
        _NARROW_SIZE[169] = 2;
        _NARROW_SIZE[171] = -1;
        _NARROW_SIZE[170] = 0;
        _NARROW_SIZE[178] = 3;
        _NARROW_SIZE[179] = 3;
        _NARROW_SIZE[180] = 3;
        _NARROW_SIZE[181] = 3;
        _NARROW_SIZE[182] = 3;
        _NARROW_SIZE[183] = 3;
        _NARROW_SIZE[184] = 3;
        _NARROW_SIZE[185] = 5;
        _NARROW_SIZE[187] = 3;
        _NARROW_SIZE[192] = 3;
        _NARROW_SIZE[193] = 3;
        _NARROW_SIZE[188] = 2;
        _NARROW_SIZE[189] = 3;
        _NARROW_SIZE[197] = 4;
        _NARROW_SIZE[200] = 5;
        _NARROW_SIZE[201] = 5;
        _WIDE_SIZE = (int[])(int[])_NARROW_SIZE.clone();
        _WIDE_SIZE[21] = 3;
        _WIDE_SIZE[22] = 3;
        _WIDE_SIZE[23] = 3;
        _WIDE_SIZE[24] = 3;
        _WIDE_SIZE[25] = 3;
        _WIDE_SIZE[54] = 3;
        _WIDE_SIZE[55] = 3;
        _WIDE_SIZE[56] = 3;
        _WIDE_SIZE[57] = 3;
        _WIDE_SIZE[58] = 3;
        _WIDE_SIZE[132] = 5;
        _WIDE_SIZE[169] = 3;
    }

    public ()
    {
    }
}
