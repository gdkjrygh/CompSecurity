// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.nio.CharBuffer;
import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicCompat, TextUtilsCompat

public class TextDirectionHeuristicsCompat
{
    private static class AnyStrong
        implements TextDirectionAlgorithm
    {

        public static final AnyStrong INSTANCE_LTR = new AnyStrong(false);
        public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
        private final boolean mLookForRtl;

        public int checkRtl(CharSequence charsequence, int i, int j)
        {
            int k;
            int l;
            boolean flag;
            flag = true;
            k = 0;
            l = i;
_L6:
            if (l >= i + j) goto _L2; else goto _L1
_L1:
            TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charsequence.charAt(l)));
            JVM INSTR tableswitch 0 1: default 52
        //                       0 61
        //                       1 80;
               goto _L3 _L4 _L5
_L3:
            l++;
              goto _L6
_L4:
            if (!mLookForRtl) goto _L8; else goto _L7
_L7:
            k = 0;
_L10:
            return k;
_L8:
            k = 1;
              goto _L3
_L5:
            k = ((flag) ? 1 : 0);
            if (!mLookForRtl) goto _L10; else goto _L9
_L9:
            k = 1;
              goto _L3
_L2:
            if (k == 0) goto _L12; else goto _L11
_L11:
            k = ((flag) ? 1 : 0);
            if (!mLookForRtl)
            {
                return 0;
            }
              goto _L10
_L12:
            return 2;
              goto _L3
        }


        private AnyStrong(boolean flag)
        {
            mLookForRtl = flag;
        }
    }

    private static class FirstStrong
        implements TextDirectionAlgorithm
    {

        public static final FirstStrong INSTANCE = new FirstStrong();

        public int checkRtl(CharSequence charsequence, int i, int j)
        {
            int l = 2;
            for (int k = i; k < i + j && l == 2; k++)
            {
                l = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charsequence.charAt(k)));
            }

            return l;
        }


        private FirstStrong()
        {
        }
    }

    private static interface TextDirectionAlgorithm
    {

        public abstract int checkRtl(CharSequence charsequence, int i, int j);
    }

    private static abstract class TextDirectionHeuristicImpl
        implements TextDirectionHeuristicCompat
    {

        private final TextDirectionAlgorithm mAlgorithm;

        private boolean doCheck(CharSequence charsequence, int i, int j)
        {
            switch (mAlgorithm.checkRtl(charsequence, i, j))
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
            if (charsequence == null || i < 0 || j < 0 || charsequence.length() - j < i)
            {
                throw new IllegalArgumentException();
            }
            if (mAlgorithm == null)
            {
                return defaultIsRtl();
            } else
            {
                return doCheck(charsequence, i, j);
            }
        }

        public boolean isRtl(char ac[], int i, int j)
        {
            return isRtl(((CharSequence) (CharBuffer.wrap(ac))), i, j);
        }

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textdirectionalgorithm)
        {
            mAlgorithm = textdirectionalgorithm;
        }
    }

    private static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl
    {

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

    }

    private static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl
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


    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true);
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    public TextDirectionHeuristicsCompat()
    {
    }

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
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, false);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, true);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }


}
