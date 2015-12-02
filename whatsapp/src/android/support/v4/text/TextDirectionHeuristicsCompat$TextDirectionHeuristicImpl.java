// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import android.support.v4.app.Fragment;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicCompat, TextDirectionHeuristicsCompat

abstract class mAlgorithm
    implements TextDirectionHeuristicCompat
{

    private final doCheck mAlgorithm;

    private boolean doCheck(CharSequence charsequence, int i, int j)
    {
        try
        {
            i = mAlgorithm.kRtl(charsequence, i, j);
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

    public ( )
    {
        mAlgorithm = ;
    }
}
