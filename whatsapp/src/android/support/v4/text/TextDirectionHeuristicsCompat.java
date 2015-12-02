// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicCompat

public class TextDirectionHeuristicsCompat
{

    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false, null);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true, null);
    public static boolean a;

    private static int isRtlText(int i)
    {
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
            return 0;
        }
    }

    private static int isRtlTextOrFormat(int i)
    {
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
        case 14: // '\016'
        case 15: // '\017'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
        case 16: // '\020'
        case 17: // '\021'
            return 0;
        }
    }

    static 
    {
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, false, null);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, true, null);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false, null);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }



    private class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl
    {
        private class TextDirectionHeuristicImpl
            implements TextDirectionHeuristicCompat
        {

            private final TextDirectionAlgorithm mAlgorithm;

            private boolean doCheck(CharSequence charsequence, int i, int j)
            {
                try
                {
                    i = mAlgorithm.checkRtl(charsequence, i, j);
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    throw charsequence;
                }
                switch (i)
                {
                default:
                    return defaultIsRtl();

                case 0: // '\0'
                    return true;

                case 1: // '\001'
                    return false;
                }
            }

            protected abstract boolean defaultIsRtl();

            public boolean isRtl(CharSequence charsequence, int i, int j)
            {
                boolean flag;
                flag = TextDirectionHeuristicsCompat.a;
                if (charsequence == null || i < 0 || j < 0)
                {
                    break MISSING_BLOCK_LABEL_29;
                }
                if (charsequence.length() - j >= i)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                throw new IllegalArgumentException();
                charsequence;
                throw charsequence;
label0:
                {
                    try
                    {
                        if (mAlgorithm != null)
                        {
                            break label0;
                        }
                        flag = defaultIsRtl();
                    }
                    // Misplaced declaration of an exception variable
                    catch (CharSequence charsequence)
                    {
                        throw charsequence;
                    }
                    return flag;
                }
                boolean flag1;
                try
                {
                    flag1 = doCheck(charsequence, i, j);
                    i = Fragment.a;
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    try
                    {
                        throw charsequence;
                    }
                    // Misplaced declaration of an exception variable
                    catch (CharSequence charsequence)
                    {
                        throw charsequence;
                    }
                }
                if (i != 0)
                {
                    if (flag)
                    {
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                    TextDirectionHeuristicsCompat.a = flag;
                }
                return flag1;
            }

            public TextDirectionHeuristicImpl(TextDirectionAlgorithm textdirectionalgorithm)
            {
                mAlgorithm = textdirectionalgorithm;
            }

            private class TextDirectionAlgorithm
            {

                public abstract int checkRtl(CharSequence charsequence, int i, int j);
            }

        }


        private final boolean mDefaultIsRtl;

        protected boolean defaultIsRtl()
        {
            return mDefaultIsRtl;
        }

        private TextDirectionHeuristicInternal(TextDirectionAlgorithm textdirectionalgorithm, boolean flag)
        {
            super(textdirectionalgorithm);
            mDefaultIsRtl = flag;
        }

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textdirectionalgorithm, boolean flag, _cls1 _pcls1)
        {
            this(textdirectionalgorithm, flag);
        }
    }


    private class FirstStrong
        implements TextDirectionAlgorithm
    {

        public static final FirstStrong INSTANCE = new FirstStrong();

        public int checkRtl(CharSequence charsequence, int i, int j)
        {
            boolean flag = TextDirectionHeuristicsCompat.a;
            int k = 2;
            int l = i;
            int i1;
            do
            {
                i1 = k;
                if (l >= i + j)
                {
                    break;
                }
                i1 = k;
                if (k != 2)
                {
                    break;
                }
                i1 = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charsequence.charAt(l)));
                l++;
                k = i1;
            } while (!flag);
            return i1;
        }


        private FirstStrong()
        {
        }
    }


    private class AnyStrong
        implements TextDirectionAlgorithm
    {

        public static final AnyStrong INSTANCE_LTR = new AnyStrong(false);
        public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
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
            TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charsequence.charAt(k)));
            JVM INSTR tableswitch 0 1: default 60
        //                       0 93
        //                       1 115;
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


        private AnyStrong(boolean flag)
        {
            mLookForRtl = flag;
        }
    }


    private class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl
    {

        public static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

        protected boolean defaultIsRtl()
        {
            return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }


        public TextDirectionHeuristicLocale()
        {
            super(null);
        }
    }

}
