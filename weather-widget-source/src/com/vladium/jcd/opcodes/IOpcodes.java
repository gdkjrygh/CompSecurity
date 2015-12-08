// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.opcodes;


public interface IOpcodes
{
    public static final class clinit
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

        public clinit()
        {
        }
    }


    public static final boolean BRANCHES[] = clinit._BRANCHES;
    public static final boolean COMPOUND_CONDITIONAL_BRANCHES[] = clinit._COMPOUND_CONDITIONAL_BRANCHES;
    public static final boolean CONDITIONAL_BRANCHES[] = clinit._CONDITIONAL_BRANCHES;
    public static final String MNEMONICS[] = {
        "nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0", 
        "lconst_1", "fconst_0", "fconst_1", "fconst_2", "dconst_0", "dconst_1", "bipush", "sipush", "ldc", "ldc_w", 
        "ldc2_w", "iload", "lload", "fload", "dload", "aload", "iload_0", "iload_1", "iload_2", "iload_3", 
        "lload_0", "lload_1", "lload_2", "lload_3", "fload_0", "fload_1", "fload_2", "fload_3", "dload_0", "dload_1", 
        "dload_2", "dload_3", "aload_0", "aload_1", "aload_2", "aload_3", "iaload", "laload", "faload", "daload", 
        "aaload", "baload", "caload", "saload", "istore", "lstore", "fstore", "dstore", "astore", "istore_0", 
        "istore_1", "istore_2", "istore_3", "lstore_0", "lstore_1", "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2", 
        "fstore_3", "dstore_0", "dstore_1", "dstore_2", "dstore_3", "astore_0", "astore_1", "astore_2", "astore_3", "iastore", 
        "lastore", "fastore", "dastore", "aastore", "bastore", "castore", "sastore", "pop", "pop2", "dup", 
        "dup_x1", "dup_x2", "dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd", "dadd", 
        "isub", "lsub", "fsub", "dsub", "imul", "lmul", "fmul", "dmul", "idiv", "ldiv", 
        "fdiv", "ddiv", "irem", "lrem", "frem", "drem", "ineg", "lneg", "fneg", "dneg", 
        "ishl", "lshl", "ishr", "lshr", "iushr", "lushr", "iand", "land", "ior", "lor", 
        "ixor", "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d", "f2i", 
        "f2l", "f2d", "d2i", "d2l", "d2f", "i2b", "i2c", "i2s", "lcmp", "fcmpl", 
        "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle", "if_icmpeq", 
        "if_icmpne", "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple", "if_acmpeq", "if_acmpne", "goto", "jsr", "ret", 
        "tableswitch", "lookupswitch", "ireturn", "lreturn", "freturn", "dreturn", "areturn", "return", "getstatic", "putstatic", 
        "getfield", "putfield", "invokevirtual", "invokespecial", "invokestatic", "invokeinterface", "unused", "new", "newarray", "anewarray", 
        "arraylength", "athrow", "checkcast", "instanceof", "monitorenter", "monitorexit", "[wide]", "multianewarray", "ifnull", "ifnonnull", 
        "goto_w", "jsr_w"
    };
    public static final int NARROW_SIZE[] = clinit._NARROW_SIZE;
    public static final boolean UNCONDITIONAL_BRANCHES[] = clinit._UNCONDITIONAL_BRANCHES;
    public static final int WIDE_SIZE[] = clinit._WIDE_SIZE;
    public static final int _aaload = 50;
    public static final int _aastore = 83;
    public static final int _aconst_null = 1;
    public static final int _aload = 25;
    public static final int _aload_0 = 42;
    public static final int _aload_1 = 43;
    public static final int _aload_2 = 44;
    public static final int _aload_3 = 45;
    public static final int _anewarray = 189;
    public static final int _areturn = 176;
    public static final int _arraylength = 190;
    public static final int _astore = 58;
    public static final int _astore_0 = 75;
    public static final int _astore_1 = 76;
    public static final int _astore_2 = 77;
    public static final int _astore_3 = 78;
    public static final int _athrow = 191;
    public static final int _baload = 51;
    public static final int _bastore = 84;
    public static final int _bipush = 16;
    public static final int _breakpoint = 202;
    public static final int _caload = 52;
    public static final int _castore = 85;
    public static final int _checkcast = 192;
    public static final int _d2f = 144;
    public static final int _d2i = 142;
    public static final int _d2l = 143;
    public static final int _dadd = 99;
    public static final int _daload = 49;
    public static final int _dastore = 82;
    public static final int _dcmpg = 152;
    public static final int _dcmpl = 151;
    public static final int _dconst_0 = 14;
    public static final int _dconst_1 = 15;
    public static final int _ddiv = 111;
    public static final int _dload = 24;
    public static final int _dload_0 = 38;
    public static final int _dload_1 = 39;
    public static final int _dload_2 = 40;
    public static final int _dload_3 = 41;
    public static final int _dmul = 107;
    public static final int _dneg = 119;
    public static final int _drem = 115;
    public static final int _dreturn = 175;
    public static final int _dstore = 57;
    public static final int _dstore_0 = 71;
    public static final int _dstore_1 = 72;
    public static final int _dstore_2 = 73;
    public static final int _dstore_3 = 74;
    public static final int _dsub = 103;
    public static final int _dup = 89;
    public static final int _dup2 = 92;
    public static final int _dup2_x1 = 93;
    public static final int _dup2_x2 = 94;
    public static final int _dup_x1 = 90;
    public static final int _dup_x2 = 91;
    public static final int _f2d = 141;
    public static final int _f2i = 139;
    public static final int _f2l = 140;
    public static final int _fadd = 98;
    public static final int _faload = 48;
    public static final int _fastore = 81;
    public static final int _fcmpg = 150;
    public static final int _fcmpl = 149;
    public static final int _fconst_0 = 11;
    public static final int _fconst_1 = 12;
    public static final int _fconst_2 = 13;
    public static final int _fdiv = 110;
    public static final int _fload = 23;
    public static final int _fload_0 = 34;
    public static final int _fload_1 = 35;
    public static final int _fload_2 = 36;
    public static final int _fload_3 = 37;
    public static final int _fmul = 106;
    public static final int _fneg = 118;
    public static final int _frem = 114;
    public static final int _freturn = 174;
    public static final int _fstore = 56;
    public static final int _fstore_0 = 67;
    public static final int _fstore_1 = 68;
    public static final int _fstore_2 = 69;
    public static final int _fstore_3 = 70;
    public static final int _fsub = 102;
    public static final int _getfield = 180;
    public static final int _getstatic = 178;
    public static final int _goto = 167;
    public static final int _goto_w = 200;
    public static final int _i2b = 145;
    public static final int _i2c = 146;
    public static final int _i2d = 135;
    public static final int _i2f = 134;
    public static final int _i2l = 133;
    public static final int _i2s = 147;
    public static final int _iadd = 96;
    public static final int _iaload = 46;
    public static final int _iand = 126;
    public static final int _iastore = 79;
    public static final int _iconst_0 = 3;
    public static final int _iconst_1 = 4;
    public static final int _iconst_2 = 5;
    public static final int _iconst_3 = 6;
    public static final int _iconst_4 = 7;
    public static final int _iconst_5 = 8;
    public static final int _iconst_m1 = 2;
    public static final int _idiv = 108;
    public static final int _if_acmpeq = 165;
    public static final int _if_acmpne = 166;
    public static final int _if_icmpeq = 159;
    public static final int _if_icmpge = 162;
    public static final int _if_icmpgt = 163;
    public static final int _if_icmple = 164;
    public static final int _if_icmplt = 161;
    public static final int _if_icmpne = 160;
    public static final int _ifeq = 153;
    public static final int _ifge = 156;
    public static final int _ifgt = 157;
    public static final int _ifle = 158;
    public static final int _iflt = 155;
    public static final int _ifne = 154;
    public static final int _ifnonnull = 199;
    public static final int _ifnull = 198;
    public static final int _iinc = 132;
    public static final int _iload = 21;
    public static final int _iload_0 = 26;
    public static final int _iload_1 = 27;
    public static final int _iload_2 = 28;
    public static final int _iload_3 = 29;
    public static final int _impdep1 = 254;
    public static final int _impdep2 = 255;
    public static final int _imul = 104;
    public static final int _ineg = 116;
    public static final int _instanceof = 193;
    public static final int _invokeinterface = 185;
    public static final int _invokespecial = 183;
    public static final int _invokestatic = 184;
    public static final int _invokevirtual = 182;
    public static final int _ior = 128;
    public static final int _irem = 112;
    public static final int _ireturn = 172;
    public static final int _ishl = 120;
    public static final int _ishr = 122;
    public static final int _istore = 54;
    public static final int _istore_0 = 59;
    public static final int _istore_1 = 60;
    public static final int _istore_2 = 61;
    public static final int _istore_3 = 62;
    public static final int _isub = 100;
    public static final int _iushr = 124;
    public static final int _ixor = 130;
    public static final int _jsr = 168;
    public static final int _jsr_w = 201;
    public static final int _l2d = 138;
    public static final int _l2f = 137;
    public static final int _l2i = 136;
    public static final int _ladd = 97;
    public static final int _laload = 47;
    public static final int _land = 127;
    public static final int _lastore = 80;
    public static final int _lcmp = 148;
    public static final int _lconst_0 = 9;
    public static final int _lconst_1 = 10;
    public static final int _ldc = 18;
    public static final int _ldc2_w = 20;
    public static final int _ldc_w = 19;
    public static final int _ldiv = 109;
    public static final int _lload = 22;
    public static final int _lload_0 = 30;
    public static final int _lload_1 = 31;
    public static final int _lload_2 = 32;
    public static final int _lload_3 = 33;
    public static final int _lmul = 105;
    public static final int _lneg = 117;
    public static final int _lookupswitch = 171;
    public static final int _lor = 129;
    public static final int _lrem = 113;
    public static final int _lreturn = 173;
    public static final int _lshl = 121;
    public static final int _lshr = 123;
    public static final int _lstore = 55;
    public static final int _lstore_0 = 63;
    public static final int _lstore_1 = 64;
    public static final int _lstore_2 = 65;
    public static final int _lstore_3 = 66;
    public static final int _lsub = 101;
    public static final int _lushr = 125;
    public static final int _lxor = 131;
    public static final int _monitorenter = 194;
    public static final int _monitorexit = 195;
    public static final int _multianewarray = 197;
    public static final int _new = 187;
    public static final int _newarray = 188;
    public static final int _nop = 0;
    public static final int _pop = 87;
    public static final int _pop2 = 88;
    public static final int _putfield = 181;
    public static final int _putstatic = 179;
    public static final int _ret = 169;
    public static final int _return = 177;
    public static final int _saload = 53;
    public static final int _sastore = 86;
    public static final int _sipush = 17;
    public static final int _swap = 95;
    public static final int _tableswitch = 170;
    public static final int _unused = 186;
    public static final int _wide = 196;

}
